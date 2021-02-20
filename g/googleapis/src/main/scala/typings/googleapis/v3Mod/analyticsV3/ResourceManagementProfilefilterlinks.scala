package typings.googleapis.v3Mod.analyticsV3

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/analytics/v3", "analytics_v3.Resource$Management$Profilefilterlinks")
@js.native
class ResourceManagementProfilefilterlinks protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  /**
    * analytics.management.profileFilterLinks.delete
    * @desc Delete a profile filter link.
    * @alias analytics.management.profileFilterLinks.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.accountId Account ID to which the profile filter link belongs.
    * @param {string} params.linkId ID of the profile filter link to delete.
    * @param {string} params.profileId Profile ID to which the filter link belongs.
    * @param {string} params.webPropertyId Web property Id to which the profile filter link belongs.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[Unit] = js.native
  def delete(callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceManagementProfilefilterlinksDelete): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceManagementProfilefilterlinksDelete, callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(
    params: ParamsResourceManagementProfilefilterlinksDelete,
    options: BodyResponseCallback[Unit],
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def delete(params: ParamsResourceManagementProfilefilterlinksDelete, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(
    params: ParamsResourceManagementProfilefilterlinksDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  
  /**
    * analytics.management.profileFilterLinks.get
    * @desc Returns a single profile filter link.
    * @alias analytics.management.profileFilterLinks.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.accountId Account ID to retrieve profile filter link for.
    * @param {string} params.linkId ID of the profile filter link.
    * @param {string} params.profileId Profile ID to retrieve filter link for.
    * @param {string} params.webPropertyId Web property Id to retrieve profile filter link for.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaProfileFilterLink] = js.native
  def get(callback: BodyResponseCallback[SchemaProfileFilterLink]): Unit = js.native
  def get(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaProfileFilterLink] = js.native
  def get(params: ParamsResourceManagementProfilefilterlinksGet): GaxiosPromise[SchemaProfileFilterLink] = js.native
  def get(
    params: ParamsResourceManagementProfilefilterlinksGet,
    callback: BodyResponseCallback[SchemaProfileFilterLink]
  ): Unit = js.native
  def get(
    params: ParamsResourceManagementProfilefilterlinksGet,
    options: BodyResponseCallback[SchemaProfileFilterLink],
    callback: BodyResponseCallback[SchemaProfileFilterLink]
  ): Unit = js.native
  def get(params: ParamsResourceManagementProfilefilterlinksGet, options: MethodOptions): GaxiosPromise[SchemaProfileFilterLink] = js.native
  def get(
    params: ParamsResourceManagementProfilefilterlinksGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaProfileFilterLink]
  ): Unit = js.native
  
  /**
    * analytics.management.profileFilterLinks.insert
    * @desc Create a new profile filter link.
    * @alias analytics.management.profileFilterLinks.insert
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.accountId Account ID to create profile filter link for.
    * @param {string} params.profileId Profile ID to create filter link for.
    * @param {string} params.webPropertyId Web property Id to create profile filter link for.
    * @param {().ProfileFilterLink} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def insert(): GaxiosPromise[SchemaProfileFilterLink] = js.native
  def insert(callback: BodyResponseCallback[SchemaProfileFilterLink]): Unit = js.native
  def insert(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaProfileFilterLink] = js.native
  def insert(params: ParamsResourceManagementProfilefilterlinksInsert): GaxiosPromise[SchemaProfileFilterLink] = js.native
  def insert(
    params: ParamsResourceManagementProfilefilterlinksInsert,
    callback: BodyResponseCallback[SchemaProfileFilterLink]
  ): Unit = js.native
  def insert(
    params: ParamsResourceManagementProfilefilterlinksInsert,
    options: BodyResponseCallback[SchemaProfileFilterLink],
    callback: BodyResponseCallback[SchemaProfileFilterLink]
  ): Unit = js.native
  def insert(params: ParamsResourceManagementProfilefilterlinksInsert, options: MethodOptions): GaxiosPromise[SchemaProfileFilterLink] = js.native
  def insert(
    params: ParamsResourceManagementProfilefilterlinksInsert,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaProfileFilterLink]
  ): Unit = js.native
  
  /**
    * analytics.management.profileFilterLinks.list
    * @desc Lists all profile filter links for a profile.
    * @alias analytics.management.profileFilterLinks.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.accountId Account ID to retrieve profile filter links for.
    * @param {integer=} params.max-results The maximum number of profile filter links to include in this response.
    * @param {string} params.profileId Profile ID to retrieve filter links for. Can either be a specific profile ID or '~all', which refers to all the profiles that user has access to.
    * @param {integer=} params.start-index An index of the first entity to retrieve. Use this parameter as a pagination mechanism along with the max-results parameter.
    * @param {string} params.webPropertyId Web property Id for profile filter links for. Can either be a specific web property ID or '~all', which refers to all the web properties that user has access to.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaProfileFilterLinks] = js.native
  def list(callback: BodyResponseCallback[SchemaProfileFilterLinks]): Unit = js.native
  def list(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaProfileFilterLinks] = js.native
  def list(params: ParamsResourceManagementProfilefilterlinksList): GaxiosPromise[SchemaProfileFilterLinks] = js.native
  def list(
    params: ParamsResourceManagementProfilefilterlinksList,
    callback: BodyResponseCallback[SchemaProfileFilterLinks]
  ): Unit = js.native
  def list(
    params: ParamsResourceManagementProfilefilterlinksList,
    options: BodyResponseCallback[SchemaProfileFilterLinks],
    callback: BodyResponseCallback[SchemaProfileFilterLinks]
  ): Unit = js.native
  def list(params: ParamsResourceManagementProfilefilterlinksList, options: MethodOptions): GaxiosPromise[SchemaProfileFilterLinks] = js.native
  def list(
    params: ParamsResourceManagementProfilefilterlinksList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaProfileFilterLinks]
  ): Unit = js.native
  
  /**
    * analytics.management.profileFilterLinks.patch
    * @desc Update an existing profile filter link. This method supports patch
    * semantics.
    * @alias analytics.management.profileFilterLinks.patch
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.accountId Account ID to which profile filter link belongs.
    * @param {string} params.linkId ID of the profile filter link to be updated.
    * @param {string} params.profileId Profile ID to which filter link belongs
    * @param {string} params.webPropertyId Web property Id to which profile filter link belongs
    * @param {().ProfileFilterLink} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def patch(): GaxiosPromise[SchemaProfileFilterLink] = js.native
  def patch(callback: BodyResponseCallback[SchemaProfileFilterLink]): Unit = js.native
  def patch(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaProfileFilterLink] = js.native
  def patch(params: ParamsResourceManagementProfilefilterlinksPatch): GaxiosPromise[SchemaProfileFilterLink] = js.native
  def patch(
    params: ParamsResourceManagementProfilefilterlinksPatch,
    callback: BodyResponseCallback[SchemaProfileFilterLink]
  ): Unit = js.native
  def patch(
    params: ParamsResourceManagementProfilefilterlinksPatch,
    options: BodyResponseCallback[SchemaProfileFilterLink],
    callback: BodyResponseCallback[SchemaProfileFilterLink]
  ): Unit = js.native
  def patch(params: ParamsResourceManagementProfilefilterlinksPatch, options: MethodOptions): GaxiosPromise[SchemaProfileFilterLink] = js.native
  def patch(
    params: ParamsResourceManagementProfilefilterlinksPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaProfileFilterLink]
  ): Unit = js.native
  
  /**
    * analytics.management.profileFilterLinks.update
    * @desc Update an existing profile filter link.
    * @alias analytics.management.profileFilterLinks.update
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.accountId Account ID to which profile filter link belongs.
    * @param {string} params.linkId ID of the profile filter link to be updated.
    * @param {string} params.profileId Profile ID to which filter link belongs
    * @param {string} params.webPropertyId Web property Id to which profile filter link belongs
    * @param {().ProfileFilterLink} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def update(): GaxiosPromise[SchemaProfileFilterLink] = js.native
  def update(callback: BodyResponseCallback[SchemaProfileFilterLink]): Unit = js.native
  def update(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaProfileFilterLink] = js.native
  def update(params: ParamsResourceManagementProfilefilterlinksUpdate): GaxiosPromise[SchemaProfileFilterLink] = js.native
  def update(
    params: ParamsResourceManagementProfilefilterlinksUpdate,
    callback: BodyResponseCallback[SchemaProfileFilterLink]
  ): Unit = js.native
  def update(
    params: ParamsResourceManagementProfilefilterlinksUpdate,
    options: BodyResponseCallback[SchemaProfileFilterLink],
    callback: BodyResponseCallback[SchemaProfileFilterLink]
  ): Unit = js.native
  def update(params: ParamsResourceManagementProfilefilterlinksUpdate, options: MethodOptions): GaxiosPromise[SchemaProfileFilterLink] = js.native
  def update(
    params: ParamsResourceManagementProfilefilterlinksUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaProfileFilterLink]
  ): Unit = js.native
}
