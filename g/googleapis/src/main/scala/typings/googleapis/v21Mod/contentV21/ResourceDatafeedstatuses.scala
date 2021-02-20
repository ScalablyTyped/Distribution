package typings.googleapis.v21Mod.contentV21

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/content/v2.1", "content_v2_1.Resource$Datafeedstatuses")
@js.native
class ResourceDatafeedstatuses protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  /**
    * content.datafeedstatuses.custombatch
    * @desc Gets multiple Merchant Center datafeed statuses in a single
    * request.
    * @alias content.datafeedstatuses.custombatch
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {().DatafeedstatusesCustomBatchRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def custombatch(): GaxiosPromise[SchemaDatafeedstatusesCustomBatchResponse] = js.native
  def custombatch(callback: BodyResponseCallback[SchemaDatafeedstatusesCustomBatchResponse]): Unit = js.native
  def custombatch(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaDatafeedstatusesCustomBatchResponse] = js.native
  def custombatch(params: ParamsResourceDatafeedstatusesCustombatch): GaxiosPromise[SchemaDatafeedstatusesCustomBatchResponse] = js.native
  def custombatch(
    params: ParamsResourceDatafeedstatusesCustombatch,
    callback: BodyResponseCallback[SchemaDatafeedstatusesCustomBatchResponse]
  ): Unit = js.native
  def custombatch(
    params: ParamsResourceDatafeedstatusesCustombatch,
    options: BodyResponseCallback[SchemaDatafeedstatusesCustomBatchResponse],
    callback: BodyResponseCallback[SchemaDatafeedstatusesCustomBatchResponse]
  ): Unit = js.native
  def custombatch(params: ParamsResourceDatafeedstatusesCustombatch, options: MethodOptions): GaxiosPromise[SchemaDatafeedstatusesCustomBatchResponse] = js.native
  def custombatch(
    params: ParamsResourceDatafeedstatusesCustombatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaDatafeedstatusesCustomBatchResponse]
  ): Unit = js.native
  
  /**
    * content.datafeedstatuses.get
    * @desc Retrieves the status of a datafeed from your Merchant Center
    * account.
    * @alias content.datafeedstatuses.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.country The country for which to get the datafeed status. If this parameter is provided then language must also be provided. Note that this parameter is required for feeds targeting multiple countries and languages, since a feed may have a different status for each target.
    * @param {string} params.datafeedId The ID of the datafeed.
    * @param {string=} params.language The language for which to get the datafeed status. If this parameter is provided then country must also be provided. Note that this parameter is required for feeds targeting multiple countries and languages, since a feed may have a different status for each target.
    * @param {string} params.merchantId The ID of the account that manages the datafeed. This account cannot be a multi-client account.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaDatafeedStatus] = js.native
  def get(callback: BodyResponseCallback[SchemaDatafeedStatus]): Unit = js.native
  def get(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaDatafeedStatus] = js.native
  def get(params: ParamsResourceDatafeedstatusesGet): GaxiosPromise[SchemaDatafeedStatus] = js.native
  def get(params: ParamsResourceDatafeedstatusesGet, callback: BodyResponseCallback[SchemaDatafeedStatus]): Unit = js.native
  def get(
    params: ParamsResourceDatafeedstatusesGet,
    options: BodyResponseCallback[SchemaDatafeedStatus],
    callback: BodyResponseCallback[SchemaDatafeedStatus]
  ): Unit = js.native
  def get(params: ParamsResourceDatafeedstatusesGet, options: MethodOptions): GaxiosPromise[SchemaDatafeedStatus] = js.native
  def get(
    params: ParamsResourceDatafeedstatusesGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaDatafeedStatus]
  ): Unit = js.native
  
  /**
    * content.datafeedstatuses.list
    * @desc Lists the statuses of the datafeeds in your Merchant Center
    * account.
    * @alias content.datafeedstatuses.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {integer=} params.maxResults The maximum number of products to return in the response, used for paging.
    * @param {string} params.merchantId The ID of the account that manages the datafeeds. This account cannot be a multi-client account.
    * @param {string=} params.pageToken The token returned by the previous request.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaDatafeedstatusesListResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaDatafeedstatusesListResponse]): Unit = js.native
  def list(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaDatafeedstatusesListResponse] = js.native
  def list(params: ParamsResourceDatafeedstatusesList): GaxiosPromise[SchemaDatafeedstatusesListResponse] = js.native
  def list(
    params: ParamsResourceDatafeedstatusesList,
    callback: BodyResponseCallback[SchemaDatafeedstatusesListResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceDatafeedstatusesList,
    options: BodyResponseCallback[SchemaDatafeedstatusesListResponse],
    callback: BodyResponseCallback[SchemaDatafeedstatusesListResponse]
  ): Unit = js.native
  def list(params: ParamsResourceDatafeedstatusesList, options: MethodOptions): GaxiosPromise[SchemaDatafeedstatusesListResponse] = js.native
  def list(
    params: ParamsResourceDatafeedstatusesList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaDatafeedstatusesListResponse]
  ): Unit = js.native
}
