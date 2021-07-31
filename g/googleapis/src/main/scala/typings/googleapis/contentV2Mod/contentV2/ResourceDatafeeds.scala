package typings.googleapis.contentV2Mod.contentV2

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/content/v2", "content_v2.Resource$Datafeeds")
@js.native
class ResourceDatafeeds protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  /**
    * content.datafeeds.custombatch
    * @desc Deletes, fetches, gets, inserts and updates multiple datafeeds in a
    * single request.
    * @alias content.datafeeds.custombatch
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {boolean=} params.dryRun Flag to simulate a request like in a live environment. If set to true, dry-run mode checks the validity of the request and returns errors (if any).
    * @param {().DatafeedsCustomBatchRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def custombatch(): GaxiosPromise[SchemaDatafeedsCustomBatchResponse] = js.native
  def custombatch(callback: BodyResponseCallback[SchemaDatafeedsCustomBatchResponse]): Unit = js.native
  def custombatch(params: Unit, options: MethodOptions): GaxiosPromise[SchemaDatafeedsCustomBatchResponse] = js.native
  def custombatch(params: ParamsResourceDatafeedsCustombatch): GaxiosPromise[SchemaDatafeedsCustomBatchResponse] = js.native
  def custombatch(
    params: ParamsResourceDatafeedsCustombatch,
    callback: BodyResponseCallback[SchemaDatafeedsCustomBatchResponse]
  ): Unit = js.native
  def custombatch(
    params: ParamsResourceDatafeedsCustombatch,
    options: BodyResponseCallback[SchemaDatafeedsCustomBatchResponse],
    callback: BodyResponseCallback[SchemaDatafeedsCustomBatchResponse]
  ): Unit = js.native
  def custombatch(params: ParamsResourceDatafeedsCustombatch, options: MethodOptions): GaxiosPromise[SchemaDatafeedsCustomBatchResponse] = js.native
  def custombatch(
    params: ParamsResourceDatafeedsCustombatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaDatafeedsCustomBatchResponse]
  ): Unit = js.native
  
  /**
    * content.datafeeds.delete
    * @desc Deletes a datafeed configuration from your Merchant Center account.
    * @alias content.datafeeds.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.datafeedId The ID of the datafeed.
    * @param {boolean=} params.dryRun Flag to simulate a request like in a live environment. If set to true, dry-run mode checks the validity of the request and returns errors (if any).
    * @param {string} params.merchantId The ID of the account that manages the datafeed. This account cannot be a multi-client account.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[Unit] = js.native
  def delete(callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceDatafeedsDelete): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceDatafeedsDelete, callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(
    params: ParamsResourceDatafeedsDelete,
    options: BodyResponseCallback[Unit],
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def delete(params: ParamsResourceDatafeedsDelete, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(
    params: ParamsResourceDatafeedsDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  
  /**
    * content.datafeeds.fetchnow
    * @desc Invokes a fetch for the datafeed in your Merchant Center account.
    * @alias content.datafeeds.fetchnow
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.datafeedId The ID of the datafeed to be fetched.
    * @param {boolean=} params.dryRun Flag to simulate a request like in a live environment. If set to true, dry-run mode checks the validity of the request and returns errors (if any).
    * @param {string} params.merchantId The ID of the account that manages the datafeed. This account cannot be a multi-client account.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def fetchnow(): GaxiosPromise[SchemaDatafeedsFetchNowResponse] = js.native
  def fetchnow(callback: BodyResponseCallback[SchemaDatafeedsFetchNowResponse]): Unit = js.native
  def fetchnow(params: Unit, options: MethodOptions): GaxiosPromise[SchemaDatafeedsFetchNowResponse] = js.native
  def fetchnow(params: ParamsResourceDatafeedsFetchnow): GaxiosPromise[SchemaDatafeedsFetchNowResponse] = js.native
  def fetchnow(
    params: ParamsResourceDatafeedsFetchnow,
    callback: BodyResponseCallback[SchemaDatafeedsFetchNowResponse]
  ): Unit = js.native
  def fetchnow(
    params: ParamsResourceDatafeedsFetchnow,
    options: BodyResponseCallback[SchemaDatafeedsFetchNowResponse],
    callback: BodyResponseCallback[SchemaDatafeedsFetchNowResponse]
  ): Unit = js.native
  def fetchnow(params: ParamsResourceDatafeedsFetchnow, options: MethodOptions): GaxiosPromise[SchemaDatafeedsFetchNowResponse] = js.native
  def fetchnow(
    params: ParamsResourceDatafeedsFetchnow,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaDatafeedsFetchNowResponse]
  ): Unit = js.native
  
  /**
    * content.datafeeds.get
    * @desc Retrieves a datafeed configuration from your Merchant Center
    * account.
    * @alias content.datafeeds.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.datafeedId The ID of the datafeed.
    * @param {string} params.merchantId The ID of the account that manages the datafeed. This account cannot be a multi-client account.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaDatafeed] = js.native
  def get(callback: BodyResponseCallback[SchemaDatafeed]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaDatafeed] = js.native
  def get(params: ParamsResourceDatafeedsGet): GaxiosPromise[SchemaDatafeed] = js.native
  def get(params: ParamsResourceDatafeedsGet, callback: BodyResponseCallback[SchemaDatafeed]): Unit = js.native
  def get(
    params: ParamsResourceDatafeedsGet,
    options: BodyResponseCallback[SchemaDatafeed],
    callback: BodyResponseCallback[SchemaDatafeed]
  ): Unit = js.native
  def get(params: ParamsResourceDatafeedsGet, options: MethodOptions): GaxiosPromise[SchemaDatafeed] = js.native
  def get(
    params: ParamsResourceDatafeedsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaDatafeed]
  ): Unit = js.native
  
  /**
    * content.datafeeds.insert
    * @desc Registers a datafeed configuration with your Merchant Center
    * account.
    * @alias content.datafeeds.insert
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {boolean=} params.dryRun Flag to simulate a request like in a live environment. If set to true, dry-run mode checks the validity of the request and returns errors (if any).
    * @param {string} params.merchantId The ID of the account that manages the datafeed. This account cannot be a multi-client account.
    * @param {().Datafeed} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def insert(): GaxiosPromise[SchemaDatafeed] = js.native
  def insert(callback: BodyResponseCallback[SchemaDatafeed]): Unit = js.native
  def insert(params: Unit, options: MethodOptions): GaxiosPromise[SchemaDatafeed] = js.native
  def insert(params: ParamsResourceDatafeedsInsert): GaxiosPromise[SchemaDatafeed] = js.native
  def insert(params: ParamsResourceDatafeedsInsert, callback: BodyResponseCallback[SchemaDatafeed]): Unit = js.native
  def insert(
    params: ParamsResourceDatafeedsInsert,
    options: BodyResponseCallback[SchemaDatafeed],
    callback: BodyResponseCallback[SchemaDatafeed]
  ): Unit = js.native
  def insert(params: ParamsResourceDatafeedsInsert, options: MethodOptions): GaxiosPromise[SchemaDatafeed] = js.native
  def insert(
    params: ParamsResourceDatafeedsInsert,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaDatafeed]
  ): Unit = js.native
  
  /**
    * content.datafeeds.list
    * @desc Lists the configurations for datafeeds in your Merchant Center
    * account.
    * @alias content.datafeeds.list
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
  def list(): GaxiosPromise[SchemaDatafeedsListResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaDatafeedsListResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaDatafeedsListResponse] = js.native
  def list(params: ParamsResourceDatafeedsList): GaxiosPromise[SchemaDatafeedsListResponse] = js.native
  def list(params: ParamsResourceDatafeedsList, callback: BodyResponseCallback[SchemaDatafeedsListResponse]): Unit = js.native
  def list(
    params: ParamsResourceDatafeedsList,
    options: BodyResponseCallback[SchemaDatafeedsListResponse],
    callback: BodyResponseCallback[SchemaDatafeedsListResponse]
  ): Unit = js.native
  def list(params: ParamsResourceDatafeedsList, options: MethodOptions): GaxiosPromise[SchemaDatafeedsListResponse] = js.native
  def list(
    params: ParamsResourceDatafeedsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaDatafeedsListResponse]
  ): Unit = js.native
  
  /**
    * content.datafeeds.patch
    * @desc Updates a datafeed configuration of your Merchant Center account.
    * This method supports patch semantics.
    * @alias content.datafeeds.patch
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.datafeedId The ID of the datafeed.
    * @param {boolean=} params.dryRun Flag to simulate a request like in a live environment. If set to true, dry-run mode checks the validity of the request and returns errors (if any).
    * @param {string} params.merchantId The ID of the account that manages the datafeed. This account cannot be a multi-client account.
    * @param {().Datafeed} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def patch(): GaxiosPromise[SchemaDatafeed] = js.native
  def patch(callback: BodyResponseCallback[SchemaDatafeed]): Unit = js.native
  def patch(params: Unit, options: MethodOptions): GaxiosPromise[SchemaDatafeed] = js.native
  def patch(params: ParamsResourceDatafeedsPatch): GaxiosPromise[SchemaDatafeed] = js.native
  def patch(params: ParamsResourceDatafeedsPatch, callback: BodyResponseCallback[SchemaDatafeed]): Unit = js.native
  def patch(
    params: ParamsResourceDatafeedsPatch,
    options: BodyResponseCallback[SchemaDatafeed],
    callback: BodyResponseCallback[SchemaDatafeed]
  ): Unit = js.native
  def patch(params: ParamsResourceDatafeedsPatch, options: MethodOptions): GaxiosPromise[SchemaDatafeed] = js.native
  def patch(
    params: ParamsResourceDatafeedsPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaDatafeed]
  ): Unit = js.native
  
  /**
    * content.datafeeds.update
    * @desc Updates a datafeed configuration of your Merchant Center account.
    * @alias content.datafeeds.update
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.datafeedId The ID of the datafeed.
    * @param {boolean=} params.dryRun Flag to simulate a request like in a live environment. If set to true, dry-run mode checks the validity of the request and returns errors (if any).
    * @param {string} params.merchantId The ID of the account that manages the datafeed. This account cannot be a multi-client account.
    * @param {().Datafeed} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def update(): GaxiosPromise[SchemaDatafeed] = js.native
  def update(callback: BodyResponseCallback[SchemaDatafeed]): Unit = js.native
  def update(params: Unit, options: MethodOptions): GaxiosPromise[SchemaDatafeed] = js.native
  def update(params: ParamsResourceDatafeedsUpdate): GaxiosPromise[SchemaDatafeed] = js.native
  def update(params: ParamsResourceDatafeedsUpdate, callback: BodyResponseCallback[SchemaDatafeed]): Unit = js.native
  def update(
    params: ParamsResourceDatafeedsUpdate,
    options: BodyResponseCallback[SchemaDatafeed],
    callback: BodyResponseCallback[SchemaDatafeed]
  ): Unit = js.native
  def update(params: ParamsResourceDatafeedsUpdate, options: MethodOptions): GaxiosPromise[SchemaDatafeed] = js.native
  def update(
    params: ParamsResourceDatafeedsUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaDatafeed]
  ): Unit = js.native
}
