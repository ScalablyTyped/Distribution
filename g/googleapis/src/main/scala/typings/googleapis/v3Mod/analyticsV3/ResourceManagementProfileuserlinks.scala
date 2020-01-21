package typings.googleapis.v3Mod.analyticsV3

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/analytics/v3", "analytics_v3.Resource$Management$Profileuserlinks")
@js.native
class ResourceManagementProfileuserlinks protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * analytics.management.profileUserLinks.delete
    * @desc Removes a user from the given view (profile).
    * @alias analytics.management.profileUserLinks.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.accountId Account ID to delete the user link for.
    * @param {string} params.linkId Link ID to delete the user link for.
    * @param {string} params.profileId View (Profile) ID to delete the user link for.
    * @param {string} params.webPropertyId Web Property ID to delete the user link for.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[Unit] = js.native
  def delete(callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(params: ParamsResourceManagementProfileuserlinksDelete): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceManagementProfileuserlinksDelete, callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(
    params: ParamsResourceManagementProfileuserlinksDelete,
    options: BodyResponseCallback[Unit],
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def delete(params: ParamsResourceManagementProfileuserlinksDelete, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(
    params: ParamsResourceManagementProfileuserlinksDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  /**
    * analytics.management.profileUserLinks.insert
    * @desc Adds a new user to the given view (profile).
    * @alias analytics.management.profileUserLinks.insert
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.accountId Account ID to create the user link for.
    * @param {string} params.profileId View (Profile) ID to create the user link for.
    * @param {string} params.webPropertyId Web Property ID to create the user link for.
    * @param {().EntityUserLink} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def insert(): GaxiosPromise[SchemaEntityUserLink] = js.native
  def insert(callback: BodyResponseCallback[SchemaEntityUserLink]): Unit = js.native
  def insert(params: ParamsResourceManagementProfileuserlinksInsert): GaxiosPromise[SchemaEntityUserLink] = js.native
  def insert(
    params: ParamsResourceManagementProfileuserlinksInsert,
    callback: BodyResponseCallback[SchemaEntityUserLink]
  ): Unit = js.native
  def insert(
    params: ParamsResourceManagementProfileuserlinksInsert,
    options: BodyResponseCallback[SchemaEntityUserLink],
    callback: BodyResponseCallback[SchemaEntityUserLink]
  ): Unit = js.native
  def insert(params: ParamsResourceManagementProfileuserlinksInsert, options: MethodOptions): GaxiosPromise[SchemaEntityUserLink] = js.native
  def insert(
    params: ParamsResourceManagementProfileuserlinksInsert,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEntityUserLink]
  ): Unit = js.native
  /**
    * analytics.management.profileUserLinks.list
    * @desc Lists profile-user links for a given view (profile).
    * @alias analytics.management.profileUserLinks.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.accountId Account ID which the given view (profile) belongs to.
    * @param {integer=} params.max-results The maximum number of profile-user links to include in this response.
    * @param {string} params.profileId View (Profile) ID to retrieve the profile-user links for. Can either be a specific profile ID or '~all', which refers to all the profiles that user has access to.
    * @param {integer=} params.start-index An index of the first profile-user link to retrieve. Use this parameter as a pagination mechanism along with the max-results parameter.
    * @param {string} params.webPropertyId Web Property ID which the given view (profile) belongs to. Can either be a specific web property ID or '~all', which refers to all the web properties that user has access to.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaEntityUserLinks] = js.native
  def list(callback: BodyResponseCallback[SchemaEntityUserLinks]): Unit = js.native
  def list(params: ParamsResourceManagementProfileuserlinksList): GaxiosPromise[SchemaEntityUserLinks] = js.native
  def list(
    params: ParamsResourceManagementProfileuserlinksList,
    callback: BodyResponseCallback[SchemaEntityUserLinks]
  ): Unit = js.native
  def list(
    params: ParamsResourceManagementProfileuserlinksList,
    options: BodyResponseCallback[SchemaEntityUserLinks],
    callback: BodyResponseCallback[SchemaEntityUserLinks]
  ): Unit = js.native
  def list(params: ParamsResourceManagementProfileuserlinksList, options: MethodOptions): GaxiosPromise[SchemaEntityUserLinks] = js.native
  def list(
    params: ParamsResourceManagementProfileuserlinksList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEntityUserLinks]
  ): Unit = js.native
  /**
    * analytics.management.profileUserLinks.update
    * @desc Updates permissions for an existing user on the given view
    * (profile).
    * @alias analytics.management.profileUserLinks.update
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.accountId Account ID to update the user link for.
    * @param {string} params.linkId Link ID to update the user link for.
    * @param {string} params.profileId View (Profile ID) to update the user link for.
    * @param {string} params.webPropertyId Web Property ID to update the user link for.
    * @param {().EntityUserLink} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def update(): GaxiosPromise[SchemaEntityUserLink] = js.native
  def update(callback: BodyResponseCallback[SchemaEntityUserLink]): Unit = js.native
  def update(params: ParamsResourceManagementProfileuserlinksUpdate): GaxiosPromise[SchemaEntityUserLink] = js.native
  def update(
    params: ParamsResourceManagementProfileuserlinksUpdate,
    callback: BodyResponseCallback[SchemaEntityUserLink]
  ): Unit = js.native
  def update(
    params: ParamsResourceManagementProfileuserlinksUpdate,
    options: BodyResponseCallback[SchemaEntityUserLink],
    callback: BodyResponseCallback[SchemaEntityUserLink]
  ): Unit = js.native
  def update(params: ParamsResourceManagementProfileuserlinksUpdate, options: MethodOptions): GaxiosPromise[SchemaEntityUserLink] = js.native
  def update(
    params: ParamsResourceManagementProfileuserlinksUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEntityUserLink]
  ): Unit = js.native
}

