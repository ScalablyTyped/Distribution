package typings.googleapis.v21Mod.contentV21

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/content/v2.1", "content_v2_1.Resource$Regionalinventory")
@js.native
class ResourceRegionalinventory protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  /**
    * content.regionalinventory.custombatch
    * @desc Updates regional inventory for multiple products or regions in a
    * single request.
    * @alias content.regionalinventory.custombatch
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {().RegionalinventoryCustomBatchRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def custombatch(): GaxiosPromise[SchemaRegionalinventoryCustomBatchResponse] = js.native
  def custombatch(callback: BodyResponseCallback[SchemaRegionalinventoryCustomBatchResponse]): Unit = js.native
  def custombatch(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaRegionalinventoryCustomBatchResponse] = js.native
  def custombatch(params: ParamsResourceRegionalinventoryCustombatch): GaxiosPromise[SchemaRegionalinventoryCustomBatchResponse] = js.native
  def custombatch(
    params: ParamsResourceRegionalinventoryCustombatch,
    callback: BodyResponseCallback[SchemaRegionalinventoryCustomBatchResponse]
  ): Unit = js.native
  def custombatch(
    params: ParamsResourceRegionalinventoryCustombatch,
    options: BodyResponseCallback[SchemaRegionalinventoryCustomBatchResponse],
    callback: BodyResponseCallback[SchemaRegionalinventoryCustomBatchResponse]
  ): Unit = js.native
  def custombatch(params: ParamsResourceRegionalinventoryCustombatch, options: MethodOptions): GaxiosPromise[SchemaRegionalinventoryCustomBatchResponse] = js.native
  def custombatch(
    params: ParamsResourceRegionalinventoryCustombatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaRegionalinventoryCustomBatchResponse]
  ): Unit = js.native
  
  /**
    * content.regionalinventory.insert
    * @desc Update the regional inventory of a product in your Merchant Center
    * account. If a regional inventory with the same region ID already exists,
    * this method updates that entry.
    * @alias content.regionalinventory.insert
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.merchantId The ID of the account that contains the product. This account cannot be a multi-client account.
    * @param {string} params.productId The REST ID of the product for which to update the regional inventory.
    * @param {().RegionalInventory} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def insert(): GaxiosPromise[SchemaRegionalInventory] = js.native
  def insert(callback: BodyResponseCallback[SchemaRegionalInventory]): Unit = js.native
  def insert(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaRegionalInventory] = js.native
  def insert(params: ParamsResourceRegionalinventoryInsert): GaxiosPromise[SchemaRegionalInventory] = js.native
  def insert(
    params: ParamsResourceRegionalinventoryInsert,
    callback: BodyResponseCallback[SchemaRegionalInventory]
  ): Unit = js.native
  def insert(
    params: ParamsResourceRegionalinventoryInsert,
    options: BodyResponseCallback[SchemaRegionalInventory],
    callback: BodyResponseCallback[SchemaRegionalInventory]
  ): Unit = js.native
  def insert(params: ParamsResourceRegionalinventoryInsert, options: MethodOptions): GaxiosPromise[SchemaRegionalInventory] = js.native
  def insert(
    params: ParamsResourceRegionalinventoryInsert,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaRegionalInventory]
  ): Unit = js.native
}
