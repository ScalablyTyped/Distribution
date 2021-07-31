package typings.googleapis.v21Mod.contentV21

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/content/v2.1", "content_v2_1.Resource$Pos")
@js.native
class ResourcePos protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  /**
    * content.pos.custombatch
    * @desc Batches multiple POS-related calls in a single request.
    * @alias content.pos.custombatch
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {().PosCustomBatchRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def custombatch(): GaxiosPromise[SchemaPosCustomBatchResponse] = js.native
  def custombatch(callback: BodyResponseCallback[SchemaPosCustomBatchResponse]): Unit = js.native
  def custombatch(params: Unit, options: MethodOptions): GaxiosPromise[SchemaPosCustomBatchResponse] = js.native
  def custombatch(params: ParamsResourcePosCustombatch): GaxiosPromise[SchemaPosCustomBatchResponse] = js.native
  def custombatch(params: ParamsResourcePosCustombatch, callback: BodyResponseCallback[SchemaPosCustomBatchResponse]): Unit = js.native
  def custombatch(
    params: ParamsResourcePosCustombatch,
    options: BodyResponseCallback[SchemaPosCustomBatchResponse],
    callback: BodyResponseCallback[SchemaPosCustomBatchResponse]
  ): Unit = js.native
  def custombatch(params: ParamsResourcePosCustombatch, options: MethodOptions): GaxiosPromise[SchemaPosCustomBatchResponse] = js.native
  def custombatch(
    params: ParamsResourcePosCustombatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaPosCustomBatchResponse]
  ): Unit = js.native
  
  /**
    * content.pos.delete
    * @desc Deletes a store for the given merchant.
    * @alias content.pos.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.merchantId The ID of the POS or inventory data provider.
    * @param {string} params.storeCode A store code that is unique per merchant.
    * @param {string} params.targetMerchantId The ID of the target merchant.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[Unit] = js.native
  def delete(callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourcePosDelete): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourcePosDelete, callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(
    params: ParamsResourcePosDelete,
    options: BodyResponseCallback[Unit],
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def delete(params: ParamsResourcePosDelete, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourcePosDelete, options: MethodOptions, callback: BodyResponseCallback[Unit]): Unit = js.native
  
  /**
    * content.pos.get
    * @desc Retrieves information about the given store.
    * @alias content.pos.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.merchantId The ID of the POS or inventory data provider.
    * @param {string} params.storeCode A store code that is unique per merchant.
    * @param {string} params.targetMerchantId The ID of the target merchant.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaPosStore] = js.native
  def get(callback: BodyResponseCallback[SchemaPosStore]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaPosStore] = js.native
  def get(params: ParamsResourcePosGet): GaxiosPromise[SchemaPosStore] = js.native
  def get(params: ParamsResourcePosGet, callback: BodyResponseCallback[SchemaPosStore]): Unit = js.native
  def get(
    params: ParamsResourcePosGet,
    options: BodyResponseCallback[SchemaPosStore],
    callback: BodyResponseCallback[SchemaPosStore]
  ): Unit = js.native
  def get(params: ParamsResourcePosGet, options: MethodOptions): GaxiosPromise[SchemaPosStore] = js.native
  def get(
    params: ParamsResourcePosGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaPosStore]
  ): Unit = js.native
  
  /**
    * content.pos.insert
    * @desc Creates a store for the given merchant.
    * @alias content.pos.insert
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.merchantId The ID of the POS or inventory data provider.
    * @param {string} params.targetMerchantId The ID of the target merchant.
    * @param {().PosStore} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def insert(): GaxiosPromise[SchemaPosStore] = js.native
  def insert(callback: BodyResponseCallback[SchemaPosStore]): Unit = js.native
  def insert(params: Unit, options: MethodOptions): GaxiosPromise[SchemaPosStore] = js.native
  def insert(params: ParamsResourcePosInsert): GaxiosPromise[SchemaPosStore] = js.native
  def insert(params: ParamsResourcePosInsert, callback: BodyResponseCallback[SchemaPosStore]): Unit = js.native
  def insert(
    params: ParamsResourcePosInsert,
    options: BodyResponseCallback[SchemaPosStore],
    callback: BodyResponseCallback[SchemaPosStore]
  ): Unit = js.native
  def insert(params: ParamsResourcePosInsert, options: MethodOptions): GaxiosPromise[SchemaPosStore] = js.native
  def insert(
    params: ParamsResourcePosInsert,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaPosStore]
  ): Unit = js.native
  
  /**
    * content.pos.inventory
    * @desc Submit inventory for the given merchant.
    * @alias content.pos.inventory
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.merchantId The ID of the POS or inventory data provider.
    * @param {string} params.targetMerchantId The ID of the target merchant.
    * @param {().PosInventoryRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def inventory(): GaxiosPromise[SchemaPosInventoryResponse] = js.native
  def inventory(callback: BodyResponseCallback[SchemaPosInventoryResponse]): Unit = js.native
  def inventory(params: Unit, options: MethodOptions): GaxiosPromise[SchemaPosInventoryResponse] = js.native
  def inventory(params: ParamsResourcePosInventory): GaxiosPromise[SchemaPosInventoryResponse] = js.native
  def inventory(params: ParamsResourcePosInventory, callback: BodyResponseCallback[SchemaPosInventoryResponse]): Unit = js.native
  def inventory(
    params: ParamsResourcePosInventory,
    options: BodyResponseCallback[SchemaPosInventoryResponse],
    callback: BodyResponseCallback[SchemaPosInventoryResponse]
  ): Unit = js.native
  def inventory(params: ParamsResourcePosInventory, options: MethodOptions): GaxiosPromise[SchemaPosInventoryResponse] = js.native
  def inventory(
    params: ParamsResourcePosInventory,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaPosInventoryResponse]
  ): Unit = js.native
  
  /**
    * content.pos.list
    * @desc Lists the stores of the target merchant.
    * @alias content.pos.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.merchantId The ID of the POS or inventory data provider.
    * @param {string} params.targetMerchantId The ID of the target merchant.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaPosListResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaPosListResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaPosListResponse] = js.native
  def list(params: ParamsResourcePosList): GaxiosPromise[SchemaPosListResponse] = js.native
  def list(params: ParamsResourcePosList, callback: BodyResponseCallback[SchemaPosListResponse]): Unit = js.native
  def list(
    params: ParamsResourcePosList,
    options: BodyResponseCallback[SchemaPosListResponse],
    callback: BodyResponseCallback[SchemaPosListResponse]
  ): Unit = js.native
  def list(params: ParamsResourcePosList, options: MethodOptions): GaxiosPromise[SchemaPosListResponse] = js.native
  def list(
    params: ParamsResourcePosList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaPosListResponse]
  ): Unit = js.native
  
  /**
    * content.pos.sale
    * @desc Submit a sale event for the given merchant.
    * @alias content.pos.sale
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.merchantId The ID of the POS or inventory data provider.
    * @param {string} params.targetMerchantId The ID of the target merchant.
    * @param {().PosSaleRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def sale(): GaxiosPromise[SchemaPosSaleResponse] = js.native
  def sale(callback: BodyResponseCallback[SchemaPosSaleResponse]): Unit = js.native
  def sale(params: Unit, options: MethodOptions): GaxiosPromise[SchemaPosSaleResponse] = js.native
  def sale(params: ParamsResourcePosSale): GaxiosPromise[SchemaPosSaleResponse] = js.native
  def sale(params: ParamsResourcePosSale, callback: BodyResponseCallback[SchemaPosSaleResponse]): Unit = js.native
  def sale(
    params: ParamsResourcePosSale,
    options: BodyResponseCallback[SchemaPosSaleResponse],
    callback: BodyResponseCallback[SchemaPosSaleResponse]
  ): Unit = js.native
  def sale(params: ParamsResourcePosSale, options: MethodOptions): GaxiosPromise[SchemaPosSaleResponse] = js.native
  def sale(
    params: ParamsResourcePosSale,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaPosSaleResponse]
  ): Unit = js.native
}
