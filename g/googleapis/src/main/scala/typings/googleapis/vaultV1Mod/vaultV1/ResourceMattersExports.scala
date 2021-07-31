package typings.googleapis.vaultV1Mod.vaultV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/vault/v1", "vault_v1.Resource$Matters$Exports")
@js.native
class ResourceMattersExports protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  /**
    * vault.matters.exports.create
    * @desc Creates an Export.
    * @alias vault.matters.exports.create
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.matterId The matter ID.
    * @param {().Export} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def create(): GaxiosPromise[SchemaExport] = js.native
  def create(callback: BodyResponseCallback[SchemaExport]): Unit = js.native
  def create(params: Unit, options: MethodOptions): GaxiosPromise[SchemaExport] = js.native
  def create(params: ParamsResourceMattersExportsCreate): GaxiosPromise[SchemaExport] = js.native
  def create(params: ParamsResourceMattersExportsCreate, callback: BodyResponseCallback[SchemaExport]): Unit = js.native
  def create(
    params: ParamsResourceMattersExportsCreate,
    options: BodyResponseCallback[SchemaExport],
    callback: BodyResponseCallback[SchemaExport]
  ): Unit = js.native
  def create(params: ParamsResourceMattersExportsCreate, options: MethodOptions): GaxiosPromise[SchemaExport] = js.native
  def create(
    params: ParamsResourceMattersExportsCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaExport]
  ): Unit = js.native
  
  /**
    * vault.matters.exports.delete
    * @desc Deletes an Export.
    * @alias vault.matters.exports.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.exportId The export ID.
    * @param {string} params.matterId The matter ID.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[SchemaEmpty] = js.native
  def delete(callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def delete(params: ParamsResourceMattersExportsDelete): GaxiosPromise[SchemaEmpty] = js.native
  def delete(params: ParamsResourceMattersExportsDelete, callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def delete(
    params: ParamsResourceMattersExportsDelete,
    options: BodyResponseCallback[SchemaEmpty],
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  def delete(params: ParamsResourceMattersExportsDelete, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def delete(
    params: ParamsResourceMattersExportsDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  
  /**
    * vault.matters.exports.get
    * @desc Gets an Export.
    * @alias vault.matters.exports.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.exportId The export ID.
    * @param {string} params.matterId The matter ID.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaExport] = js.native
  def get(callback: BodyResponseCallback[SchemaExport]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaExport] = js.native
  def get(params: ParamsResourceMattersExportsGet): GaxiosPromise[SchemaExport] = js.native
  def get(params: ParamsResourceMattersExportsGet, callback: BodyResponseCallback[SchemaExport]): Unit = js.native
  def get(
    params: ParamsResourceMattersExportsGet,
    options: BodyResponseCallback[SchemaExport],
    callback: BodyResponseCallback[SchemaExport]
  ): Unit = js.native
  def get(params: ParamsResourceMattersExportsGet, options: MethodOptions): GaxiosPromise[SchemaExport] = js.native
  def get(
    params: ParamsResourceMattersExportsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaExport]
  ): Unit = js.native
  
  /**
    * vault.matters.exports.list
    * @desc Lists Exports.
    * @alias vault.matters.exports.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.matterId The matter ID.
    * @param {integer=} params.pageSize The number of exports to return in the response.
    * @param {string=} params.pageToken The pagination token as returned in the response.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaListExportsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListExportsResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListExportsResponse] = js.native
  def list(params: ParamsResourceMattersExportsList): GaxiosPromise[SchemaListExportsResponse] = js.native
  def list(
    params: ParamsResourceMattersExportsList,
    callback: BodyResponseCallback[SchemaListExportsResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceMattersExportsList,
    options: BodyResponseCallback[SchemaListExportsResponse],
    callback: BodyResponseCallback[SchemaListExportsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceMattersExportsList, options: MethodOptions): GaxiosPromise[SchemaListExportsResponse] = js.native
  def list(
    params: ParamsResourceMattersExportsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListExportsResponse]
  ): Unit = js.native
}
