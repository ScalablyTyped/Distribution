package typings.googleapis.doubleclickbidmanagerV1Mod.doubleclickbidmanagerV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/doubleclickbidmanager/v1", "doubleclickbidmanager_v1.Resource$Lineitems")
@js.native
class ResourceLineitems protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  /**
    * doubleclickbidmanager.lineitems.downloadlineitems
    * @desc Retrieves line items in CSV format. TrueView line items are not
    * supported.
    * @alias doubleclickbidmanager.lineitems.downloadlineitems
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {().DownloadLineItemsRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def downloadlineitems(): GaxiosPromise[SchemaDownloadLineItemsResponse] = js.native
  def downloadlineitems(callback: BodyResponseCallback[SchemaDownloadLineItemsResponse]): Unit = js.native
  def downloadlineitems(params: Unit, options: MethodOptions): GaxiosPromise[SchemaDownloadLineItemsResponse] = js.native
  def downloadlineitems(params: ParamsResourceLineitemsDownloadlineitems): GaxiosPromise[SchemaDownloadLineItemsResponse] = js.native
  def downloadlineitems(
    params: ParamsResourceLineitemsDownloadlineitems,
    callback: BodyResponseCallback[SchemaDownloadLineItemsResponse]
  ): Unit = js.native
  def downloadlineitems(
    params: ParamsResourceLineitemsDownloadlineitems,
    options: BodyResponseCallback[SchemaDownloadLineItemsResponse],
    callback: BodyResponseCallback[SchemaDownloadLineItemsResponse]
  ): Unit = js.native
  def downloadlineitems(params: ParamsResourceLineitemsDownloadlineitems, options: MethodOptions): GaxiosPromise[SchemaDownloadLineItemsResponse] = js.native
  def downloadlineitems(
    params: ParamsResourceLineitemsDownloadlineitems,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaDownloadLineItemsResponse]
  ): Unit = js.native
  
  /**
    * doubleclickbidmanager.lineitems.uploadlineitems
    * @desc Uploads line items in CSV format. TrueView line items are not
    * supported.
    * @alias doubleclickbidmanager.lineitems.uploadlineitems
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {().UploadLineItemsRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def uploadlineitems(): GaxiosPromise[SchemaUploadLineItemsResponse] = js.native
  def uploadlineitems(callback: BodyResponseCallback[SchemaUploadLineItemsResponse]): Unit = js.native
  def uploadlineitems(params: Unit, options: MethodOptions): GaxiosPromise[SchemaUploadLineItemsResponse] = js.native
  def uploadlineitems(params: ParamsResourceLineitemsUploadlineitems): GaxiosPromise[SchemaUploadLineItemsResponse] = js.native
  def uploadlineitems(
    params: ParamsResourceLineitemsUploadlineitems,
    callback: BodyResponseCallback[SchemaUploadLineItemsResponse]
  ): Unit = js.native
  def uploadlineitems(
    params: ParamsResourceLineitemsUploadlineitems,
    options: BodyResponseCallback[SchemaUploadLineItemsResponse],
    callback: BodyResponseCallback[SchemaUploadLineItemsResponse]
  ): Unit = js.native
  def uploadlineitems(params: ParamsResourceLineitemsUploadlineitems, options: MethodOptions): GaxiosPromise[SchemaUploadLineItemsResponse] = js.native
  def uploadlineitems(
    params: ParamsResourceLineitemsUploadlineitems,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaUploadLineItemsResponse]
  ): Unit = js.native
}
