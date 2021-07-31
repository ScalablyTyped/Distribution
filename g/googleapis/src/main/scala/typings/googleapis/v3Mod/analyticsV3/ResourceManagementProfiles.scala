package typings.googleapis.v3Mod.analyticsV3

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/analytics/v3", "analytics_v3.Resource$Management$Profiles")
@js.native
class ResourceManagementProfiles protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  /**
    * analytics.management.profiles.delete
    * @desc Deletes a view (profile).
    * @alias analytics.management.profiles.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.accountId Account ID to delete the view (profile) for.
    * @param {string} params.profileId ID of the view (profile) to be deleted.
    * @param {string} params.webPropertyId Web property ID to delete the view (profile) for.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[Unit] = js.native
  def delete(callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceManagementProfilesDelete): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceManagementProfilesDelete, callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(
    params: ParamsResourceManagementProfilesDelete,
    options: BodyResponseCallback[Unit],
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def delete(params: ParamsResourceManagementProfilesDelete, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(
    params: ParamsResourceManagementProfilesDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  
  /**
    * analytics.management.profiles.get
    * @desc Gets a view (profile) to which the user has access.
    * @alias analytics.management.profiles.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.accountId Account ID to retrieve the view (profile) for.
    * @param {string} params.profileId View (Profile) ID to retrieve the view (profile) for.
    * @param {string} params.webPropertyId Web property ID to retrieve the view (profile) for.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaProfile] = js.native
  def get(callback: BodyResponseCallback[SchemaProfile]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaProfile] = js.native
  def get(params: ParamsResourceManagementProfilesGet): GaxiosPromise[SchemaProfile] = js.native
  def get(params: ParamsResourceManagementProfilesGet, callback: BodyResponseCallback[SchemaProfile]): Unit = js.native
  def get(
    params: ParamsResourceManagementProfilesGet,
    options: BodyResponseCallback[SchemaProfile],
    callback: BodyResponseCallback[SchemaProfile]
  ): Unit = js.native
  def get(params: ParamsResourceManagementProfilesGet, options: MethodOptions): GaxiosPromise[SchemaProfile] = js.native
  def get(
    params: ParamsResourceManagementProfilesGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaProfile]
  ): Unit = js.native
  
  /**
    * analytics.management.profiles.insert
    * @desc Create a new view (profile).
    * @alias analytics.management.profiles.insert
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.accountId Account ID to create the view (profile) for.
    * @param {string} params.webPropertyId Web property ID to create the view (profile) for.
    * @param {().Profile} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def insert(): GaxiosPromise[SchemaProfile] = js.native
  def insert(callback: BodyResponseCallback[SchemaProfile]): Unit = js.native
  def insert(params: Unit, options: MethodOptions): GaxiosPromise[SchemaProfile] = js.native
  def insert(params: ParamsResourceManagementProfilesInsert): GaxiosPromise[SchemaProfile] = js.native
  def insert(params: ParamsResourceManagementProfilesInsert, callback: BodyResponseCallback[SchemaProfile]): Unit = js.native
  def insert(
    params: ParamsResourceManagementProfilesInsert,
    options: BodyResponseCallback[SchemaProfile],
    callback: BodyResponseCallback[SchemaProfile]
  ): Unit = js.native
  def insert(params: ParamsResourceManagementProfilesInsert, options: MethodOptions): GaxiosPromise[SchemaProfile] = js.native
  def insert(
    params: ParamsResourceManagementProfilesInsert,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaProfile]
  ): Unit = js.native
  
  /**
    * analytics.management.profiles.list
    * @desc Lists views (profiles) to which the user has access.
    * @alias analytics.management.profiles.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.accountId Account ID for the view (profiles) to retrieve. Can either be a specific account ID or '~all', which refers to all the accounts to which the user has access.
    * @param {integer=} params.max-results The maximum number of views (profiles) to include in this response.
    * @param {integer=} params.start-index An index of the first entity to retrieve. Use this parameter as a pagination mechanism along with the max-results parameter.
    * @param {string} params.webPropertyId Web property ID for the views (profiles) to retrieve. Can either be a specific web property ID or '~all', which refers to all the web properties to which the user has access.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaProfiles] = js.native
  def list(callback: BodyResponseCallback[SchemaProfiles]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaProfiles] = js.native
  def list(params: ParamsResourceManagementProfilesList): GaxiosPromise[SchemaProfiles] = js.native
  def list(params: ParamsResourceManagementProfilesList, callback: BodyResponseCallback[SchemaProfiles]): Unit = js.native
  def list(
    params: ParamsResourceManagementProfilesList,
    options: BodyResponseCallback[SchemaProfiles],
    callback: BodyResponseCallback[SchemaProfiles]
  ): Unit = js.native
  def list(params: ParamsResourceManagementProfilesList, options: MethodOptions): GaxiosPromise[SchemaProfiles] = js.native
  def list(
    params: ParamsResourceManagementProfilesList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaProfiles]
  ): Unit = js.native
  
  /**
    * analytics.management.profiles.patch
    * @desc Updates an existing view (profile). This method supports patch
    * semantics.
    * @alias analytics.management.profiles.patch
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.accountId Account ID to which the view (profile) belongs
    * @param {string} params.profileId ID of the view (profile) to be updated.
    * @param {string} params.webPropertyId Web property ID to which the view (profile) belongs
    * @param {().Profile} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def patch(): GaxiosPromise[SchemaProfile] = js.native
  def patch(callback: BodyResponseCallback[SchemaProfile]): Unit = js.native
  def patch(params: Unit, options: MethodOptions): GaxiosPromise[SchemaProfile] = js.native
  def patch(params: ParamsResourceManagementProfilesPatch): GaxiosPromise[SchemaProfile] = js.native
  def patch(params: ParamsResourceManagementProfilesPatch, callback: BodyResponseCallback[SchemaProfile]): Unit = js.native
  def patch(
    params: ParamsResourceManagementProfilesPatch,
    options: BodyResponseCallback[SchemaProfile],
    callback: BodyResponseCallback[SchemaProfile]
  ): Unit = js.native
  def patch(params: ParamsResourceManagementProfilesPatch, options: MethodOptions): GaxiosPromise[SchemaProfile] = js.native
  def patch(
    params: ParamsResourceManagementProfilesPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaProfile]
  ): Unit = js.native
  
  /**
    * analytics.management.profiles.update
    * @desc Updates an existing view (profile).
    * @alias analytics.management.profiles.update
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.accountId Account ID to which the view (profile) belongs
    * @param {string} params.profileId ID of the view (profile) to be updated.
    * @param {string} params.webPropertyId Web property ID to which the view (profile) belongs
    * @param {().Profile} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def update(): GaxiosPromise[SchemaProfile] = js.native
  def update(callback: BodyResponseCallback[SchemaProfile]): Unit = js.native
  def update(params: Unit, options: MethodOptions): GaxiosPromise[SchemaProfile] = js.native
  def update(params: ParamsResourceManagementProfilesUpdate): GaxiosPromise[SchemaProfile] = js.native
  def update(params: ParamsResourceManagementProfilesUpdate, callback: BodyResponseCallback[SchemaProfile]): Unit = js.native
  def update(
    params: ParamsResourceManagementProfilesUpdate,
    options: BodyResponseCallback[SchemaProfile],
    callback: BodyResponseCallback[SchemaProfile]
  ): Unit = js.native
  def update(params: ParamsResourceManagementProfilesUpdate, options: MethodOptions): GaxiosPromise[SchemaProfile] = js.native
  def update(
    params: ParamsResourceManagementProfilesUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaProfile]
  ): Unit = js.native
}
