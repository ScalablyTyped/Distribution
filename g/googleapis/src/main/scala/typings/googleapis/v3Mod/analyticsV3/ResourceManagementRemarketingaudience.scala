package typings.googleapis.v3Mod.analyticsV3

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/analytics/v3", "analytics_v3.Resource$Management$Remarketingaudience")
@js.native
class ResourceManagementRemarketingaudience protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  /**
    * analytics.management.remarketingAudience.delete
    * @desc Delete a remarketing audience.
    * @alias analytics.management.remarketingAudience.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.accountId Account ID to which the remarketing audience belongs.
    * @param {string} params.remarketingAudienceId The ID of the remarketing audience to delete.
    * @param {string} params.webPropertyId Web property ID to which the remarketing audience belongs.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[Unit] = js.native
  def delete(callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceManagementRemarketingaudienceDelete): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceManagementRemarketingaudienceDelete, callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(
    params: ParamsResourceManagementRemarketingaudienceDelete,
    options: BodyResponseCallback[Unit],
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def delete(params: ParamsResourceManagementRemarketingaudienceDelete, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(
    params: ParamsResourceManagementRemarketingaudienceDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  
  /**
    * analytics.management.remarketingAudience.get
    * @desc Gets a remarketing audience to which the user has access.
    * @alias analytics.management.remarketingAudience.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.accountId The account ID of the remarketing audience to retrieve.
    * @param {string} params.remarketingAudienceId The ID of the remarketing audience to retrieve.
    * @param {string} params.webPropertyId The web property ID of the remarketing audience to retrieve.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaRemarketingAudience] = js.native
  def get(callback: BodyResponseCallback[SchemaRemarketingAudience]): Unit = js.native
  def get(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaRemarketingAudience] = js.native
  def get(params: ParamsResourceManagementRemarketingaudienceGet): GaxiosPromise[SchemaRemarketingAudience] = js.native
  def get(
    params: ParamsResourceManagementRemarketingaudienceGet,
    callback: BodyResponseCallback[SchemaRemarketingAudience]
  ): Unit = js.native
  def get(
    params: ParamsResourceManagementRemarketingaudienceGet,
    options: BodyResponseCallback[SchemaRemarketingAudience],
    callback: BodyResponseCallback[SchemaRemarketingAudience]
  ): Unit = js.native
  def get(params: ParamsResourceManagementRemarketingaudienceGet, options: MethodOptions): GaxiosPromise[SchemaRemarketingAudience] = js.native
  def get(
    params: ParamsResourceManagementRemarketingaudienceGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaRemarketingAudience]
  ): Unit = js.native
  
  /**
    * analytics.management.remarketingAudience.insert
    * @desc Creates a new remarketing audience.
    * @alias analytics.management.remarketingAudience.insert
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.accountId The account ID for which to create the remarketing audience.
    * @param {string} params.webPropertyId Web property ID for which to create the remarketing audience.
    * @param {().RemarketingAudience} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def insert(): GaxiosPromise[SchemaRemarketingAudience] = js.native
  def insert(callback: BodyResponseCallback[SchemaRemarketingAudience]): Unit = js.native
  def insert(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaRemarketingAudience] = js.native
  def insert(params: ParamsResourceManagementRemarketingaudienceInsert): GaxiosPromise[SchemaRemarketingAudience] = js.native
  def insert(
    params: ParamsResourceManagementRemarketingaudienceInsert,
    callback: BodyResponseCallback[SchemaRemarketingAudience]
  ): Unit = js.native
  def insert(
    params: ParamsResourceManagementRemarketingaudienceInsert,
    options: BodyResponseCallback[SchemaRemarketingAudience],
    callback: BodyResponseCallback[SchemaRemarketingAudience]
  ): Unit = js.native
  def insert(params: ParamsResourceManagementRemarketingaudienceInsert, options: MethodOptions): GaxiosPromise[SchemaRemarketingAudience] = js.native
  def insert(
    params: ParamsResourceManagementRemarketingaudienceInsert,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaRemarketingAudience]
  ): Unit = js.native
  
  /**
    * analytics.management.remarketingAudience.list
    * @desc Lists remarketing audiences to which the user has access.
    * @alias analytics.management.remarketingAudience.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.accountId The account ID of the remarketing audiences to retrieve.
    * @param {integer=} params.max-results The maximum number of remarketing audiences to include in this response.
    * @param {integer=} params.start-index An index of the first entity to retrieve. Use this parameter as a pagination mechanism along with the max-results parameter.
    * @param {string=} params.type
    * @param {string} params.webPropertyId The web property ID of the remarketing audiences to retrieve.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaRemarketingAudiences] = js.native
  def list(callback: BodyResponseCallback[SchemaRemarketingAudiences]): Unit = js.native
  def list(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaRemarketingAudiences] = js.native
  def list(params: ParamsResourceManagementRemarketingaudienceList): GaxiosPromise[SchemaRemarketingAudiences] = js.native
  def list(
    params: ParamsResourceManagementRemarketingaudienceList,
    callback: BodyResponseCallback[SchemaRemarketingAudiences]
  ): Unit = js.native
  def list(
    params: ParamsResourceManagementRemarketingaudienceList,
    options: BodyResponseCallback[SchemaRemarketingAudiences],
    callback: BodyResponseCallback[SchemaRemarketingAudiences]
  ): Unit = js.native
  def list(params: ParamsResourceManagementRemarketingaudienceList, options: MethodOptions): GaxiosPromise[SchemaRemarketingAudiences] = js.native
  def list(
    params: ParamsResourceManagementRemarketingaudienceList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaRemarketingAudiences]
  ): Unit = js.native
  
  /**
    * analytics.management.remarketingAudience.patch
    * @desc Updates an existing remarketing audience. This method supports
    * patch semantics.
    * @alias analytics.management.remarketingAudience.patch
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.accountId The account ID of the remarketing audience to update.
    * @param {string} params.remarketingAudienceId The ID of the remarketing audience to update.
    * @param {string} params.webPropertyId The web property ID of the remarketing audience to update.
    * @param {().RemarketingAudience} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def patch(): GaxiosPromise[SchemaRemarketingAudience] = js.native
  def patch(callback: BodyResponseCallback[SchemaRemarketingAudience]): Unit = js.native
  def patch(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaRemarketingAudience] = js.native
  def patch(params: ParamsResourceManagementRemarketingaudiencePatch): GaxiosPromise[SchemaRemarketingAudience] = js.native
  def patch(
    params: ParamsResourceManagementRemarketingaudiencePatch,
    callback: BodyResponseCallback[SchemaRemarketingAudience]
  ): Unit = js.native
  def patch(
    params: ParamsResourceManagementRemarketingaudiencePatch,
    options: BodyResponseCallback[SchemaRemarketingAudience],
    callback: BodyResponseCallback[SchemaRemarketingAudience]
  ): Unit = js.native
  def patch(params: ParamsResourceManagementRemarketingaudiencePatch, options: MethodOptions): GaxiosPromise[SchemaRemarketingAudience] = js.native
  def patch(
    params: ParamsResourceManagementRemarketingaudiencePatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaRemarketingAudience]
  ): Unit = js.native
  
  /**
    * analytics.management.remarketingAudience.update
    * @desc Updates an existing remarketing audience.
    * @alias analytics.management.remarketingAudience.update
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.accountId The account ID of the remarketing audience to update.
    * @param {string} params.remarketingAudienceId The ID of the remarketing audience to update.
    * @param {string} params.webPropertyId The web property ID of the remarketing audience to update.
    * @param {().RemarketingAudience} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def update(): GaxiosPromise[SchemaRemarketingAudience] = js.native
  def update(callback: BodyResponseCallback[SchemaRemarketingAudience]): Unit = js.native
  def update(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaRemarketingAudience] = js.native
  def update(params: ParamsResourceManagementRemarketingaudienceUpdate): GaxiosPromise[SchemaRemarketingAudience] = js.native
  def update(
    params: ParamsResourceManagementRemarketingaudienceUpdate,
    callback: BodyResponseCallback[SchemaRemarketingAudience]
  ): Unit = js.native
  def update(
    params: ParamsResourceManagementRemarketingaudienceUpdate,
    options: BodyResponseCallback[SchemaRemarketingAudience],
    callback: BodyResponseCallback[SchemaRemarketingAudience]
  ): Unit = js.native
  def update(params: ParamsResourceManagementRemarketingaudienceUpdate, options: MethodOptions): GaxiosPromise[SchemaRemarketingAudience] = js.native
  def update(
    params: ParamsResourceManagementRemarketingaudienceUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaRemarketingAudience]
  ): Unit = js.native
}
