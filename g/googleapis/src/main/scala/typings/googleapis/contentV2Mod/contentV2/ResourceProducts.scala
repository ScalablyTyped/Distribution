package typings.googleapis.contentV2Mod.contentV2

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/content/v2", "content_v2.Resource$Products")
@js.native
class ResourceProducts protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  /**
    * content.products.custombatch
    * @desc Retrieves, inserts, and deletes multiple products in a single
    * request.
    * @alias content.products.custombatch
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {boolean=} params.dryRun Flag to simulate a request like in a live environment. If set to true, dry-run mode checks the validity of the request and returns errors (if any).
    * @param {().ProductsCustomBatchRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def custombatch(): GaxiosPromise[SchemaProductsCustomBatchResponse] = js.native
  def custombatch(callback: BodyResponseCallback[SchemaProductsCustomBatchResponse]): Unit = js.native
  def custombatch(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaProductsCustomBatchResponse] = js.native
  def custombatch(params: ParamsResourceProductsCustombatch): GaxiosPromise[SchemaProductsCustomBatchResponse] = js.native
  def custombatch(
    params: ParamsResourceProductsCustombatch,
    callback: BodyResponseCallback[SchemaProductsCustomBatchResponse]
  ): Unit = js.native
  def custombatch(
    params: ParamsResourceProductsCustombatch,
    options: BodyResponseCallback[SchemaProductsCustomBatchResponse],
    callback: BodyResponseCallback[SchemaProductsCustomBatchResponse]
  ): Unit = js.native
  def custombatch(params: ParamsResourceProductsCustombatch, options: MethodOptions): GaxiosPromise[SchemaProductsCustomBatchResponse] = js.native
  def custombatch(
    params: ParamsResourceProductsCustombatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaProductsCustomBatchResponse]
  ): Unit = js.native
  
  /**
    * content.products.delete
    * @desc Deletes a product from your Merchant Center account.
    * @alias content.products.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {boolean=} params.dryRun Flag to simulate a request like in a live environment. If set to true, dry-run mode checks the validity of the request and returns errors (if any).
    * @param {string} params.merchantId The ID of the account that contains the product. This account cannot be a multi-client account.
    * @param {string} params.productId The REST ID of the product.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[Unit] = js.native
  def delete(callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceProductsDelete): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceProductsDelete, callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(
    params: ParamsResourceProductsDelete,
    options: BodyResponseCallback[Unit],
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def delete(params: ParamsResourceProductsDelete, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceProductsDelete, options: MethodOptions, callback: BodyResponseCallback[Unit]): Unit = js.native
  
  /**
    * content.products.get
    * @desc Retrieves a product from your Merchant Center account.
    * @alias content.products.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.merchantId The ID of the account that contains the product. This account cannot be a multi-client account.
    * @param {string} params.productId The REST ID of the product.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaProduct] = js.native
  def get(callback: BodyResponseCallback[SchemaProduct]): Unit = js.native
  def get(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaProduct] = js.native
  def get(params: ParamsResourceProductsGet): GaxiosPromise[SchemaProduct] = js.native
  def get(params: ParamsResourceProductsGet, callback: BodyResponseCallback[SchemaProduct]): Unit = js.native
  def get(
    params: ParamsResourceProductsGet,
    options: BodyResponseCallback[SchemaProduct],
    callback: BodyResponseCallback[SchemaProduct]
  ): Unit = js.native
  def get(params: ParamsResourceProductsGet, options: MethodOptions): GaxiosPromise[SchemaProduct] = js.native
  def get(
    params: ParamsResourceProductsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaProduct]
  ): Unit = js.native
  
  /**
    * content.products.insert
    * @desc Uploads a product to your Merchant Center account. If an item with
    * the same channel, contentLanguage, offerId, and targetCountry already
    * exists, this method updates that entry.
    * @alias content.products.insert
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {boolean=} params.dryRun Flag to simulate a request like in a live environment. If set to true, dry-run mode checks the validity of the request and returns errors (if any).
    * @param {string} params.merchantId The ID of the account that contains the product. This account cannot be a multi-client account.
    * @param {().Product} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def insert(): GaxiosPromise[SchemaProduct] = js.native
  def insert(callback: BodyResponseCallback[SchemaProduct]): Unit = js.native
  def insert(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaProduct] = js.native
  def insert(params: ParamsResourceProductsInsert): GaxiosPromise[SchemaProduct] = js.native
  def insert(params: ParamsResourceProductsInsert, callback: BodyResponseCallback[SchemaProduct]): Unit = js.native
  def insert(
    params: ParamsResourceProductsInsert,
    options: BodyResponseCallback[SchemaProduct],
    callback: BodyResponseCallback[SchemaProduct]
  ): Unit = js.native
  def insert(params: ParamsResourceProductsInsert, options: MethodOptions): GaxiosPromise[SchemaProduct] = js.native
  def insert(
    params: ParamsResourceProductsInsert,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaProduct]
  ): Unit = js.native
  
  /**
    * content.products.list
    * @desc Lists the products in your Merchant Center account.
    * @alias content.products.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {boolean=} params.includeInvalidInsertedItems Flag to include the invalid inserted items in the result of the list request. By default the invalid items are not shown (the default value is false).
    * @param {integer=} params.maxResults The maximum number of products to return in the response, used for paging.
    * @param {string} params.merchantId The ID of the account that contains the products. This account cannot be a multi-client account.
    * @param {string=} params.pageToken The token returned by the previous request.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaProductsListResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaProductsListResponse]): Unit = js.native
  def list(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaProductsListResponse] = js.native
  def list(params: ParamsResourceProductsList): GaxiosPromise[SchemaProductsListResponse] = js.native
  def list(params: ParamsResourceProductsList, callback: BodyResponseCallback[SchemaProductsListResponse]): Unit = js.native
  def list(
    params: ParamsResourceProductsList,
    options: BodyResponseCallback[SchemaProductsListResponse],
    callback: BodyResponseCallback[SchemaProductsListResponse]
  ): Unit = js.native
  def list(params: ParamsResourceProductsList, options: MethodOptions): GaxiosPromise[SchemaProductsListResponse] = js.native
  def list(
    params: ParamsResourceProductsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaProductsListResponse]
  ): Unit = js.native
}
