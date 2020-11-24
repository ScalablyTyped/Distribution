package typings.googleapis.fusiontablesV2Mod.fusiontablesV2

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/fusiontables/v2", "fusiontables_v2.Resource$Column")
@js.native
class ResourceColumn protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  /**
    * fusiontables.column.delete
    * @desc Deletes the specified column.
    * @alias fusiontables.column.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.columnId Name or identifier for the column being deleted.
    * @param {string} params.tableId Table from which the column is being deleted.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[Unit] = js.native
  def delete(callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceColumnDelete): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceColumnDelete, callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(
    params: ParamsResourceColumnDelete,
    options: BodyResponseCallback[Unit],
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def delete(params: ParamsResourceColumnDelete, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceColumnDelete, options: MethodOptions, callback: BodyResponseCallback[Unit]): Unit = js.native
  
  /**
    * fusiontables.column.get
    * @desc Retrieves a specific column by its ID.
    * @alias fusiontables.column.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.columnId Name or identifier for the column that is being requested.
    * @param {string} params.tableId Table to which the column belongs.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaColumn] = js.native
  def get(callback: BodyResponseCallback[SchemaColumn]): Unit = js.native
  def get(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaColumn] = js.native
  def get(params: ParamsResourceColumnGet): GaxiosPromise[SchemaColumn] = js.native
  def get(params: ParamsResourceColumnGet, callback: BodyResponseCallback[SchemaColumn]): Unit = js.native
  def get(
    params: ParamsResourceColumnGet,
    options: BodyResponseCallback[SchemaColumn],
    callback: BodyResponseCallback[SchemaColumn]
  ): Unit = js.native
  def get(params: ParamsResourceColumnGet, options: MethodOptions): GaxiosPromise[SchemaColumn] = js.native
  def get(
    params: ParamsResourceColumnGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaColumn]
  ): Unit = js.native
  
  /**
    * fusiontables.column.insert
    * @desc Adds a new column to the table.
    * @alias fusiontables.column.insert
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.tableId Table for which a new column is being added.
    * @param {().Column} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def insert(): GaxiosPromise[SchemaColumn] = js.native
  def insert(callback: BodyResponseCallback[SchemaColumn]): Unit = js.native
  def insert(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaColumn] = js.native
  def insert(params: ParamsResourceColumnInsert): GaxiosPromise[SchemaColumn] = js.native
  def insert(params: ParamsResourceColumnInsert, callback: BodyResponseCallback[SchemaColumn]): Unit = js.native
  def insert(
    params: ParamsResourceColumnInsert,
    options: BodyResponseCallback[SchemaColumn],
    callback: BodyResponseCallback[SchemaColumn]
  ): Unit = js.native
  def insert(params: ParamsResourceColumnInsert, options: MethodOptions): GaxiosPromise[SchemaColumn] = js.native
  def insert(
    params: ParamsResourceColumnInsert,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaColumn]
  ): Unit = js.native
  
  /**
    * fusiontables.column.list
    * @desc Retrieves a list of columns.
    * @alias fusiontables.column.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {integer=} params.maxResults Maximum number of columns to return. Default is 5.
    * @param {string=} params.pageToken Continuation token specifying which result page to return.
    * @param {string} params.tableId Table whose columns are being listed.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaColumnList] = js.native
  def list(callback: BodyResponseCallback[SchemaColumnList]): Unit = js.native
  def list(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaColumnList] = js.native
  def list(params: ParamsResourceColumnList): GaxiosPromise[SchemaColumnList] = js.native
  def list(params: ParamsResourceColumnList, callback: BodyResponseCallback[SchemaColumnList]): Unit = js.native
  def list(
    params: ParamsResourceColumnList,
    options: BodyResponseCallback[SchemaColumnList],
    callback: BodyResponseCallback[SchemaColumnList]
  ): Unit = js.native
  def list(params: ParamsResourceColumnList, options: MethodOptions): GaxiosPromise[SchemaColumnList] = js.native
  def list(
    params: ParamsResourceColumnList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaColumnList]
  ): Unit = js.native
  
  /**
    * fusiontables.column.patch
    * @desc Updates the name or type of an existing column. This method
    * supports patch semantics.
    * @alias fusiontables.column.patch
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.columnId Name or identifier for the column that is being updated.
    * @param {string} params.tableId Table for which the column is being updated.
    * @param {().Column} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def patch(): GaxiosPromise[SchemaColumn] = js.native
  def patch(callback: BodyResponseCallback[SchemaColumn]): Unit = js.native
  def patch(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaColumn] = js.native
  def patch(params: ParamsResourceColumnPatch): GaxiosPromise[SchemaColumn] = js.native
  def patch(params: ParamsResourceColumnPatch, callback: BodyResponseCallback[SchemaColumn]): Unit = js.native
  def patch(
    params: ParamsResourceColumnPatch,
    options: BodyResponseCallback[SchemaColumn],
    callback: BodyResponseCallback[SchemaColumn]
  ): Unit = js.native
  def patch(params: ParamsResourceColumnPatch, options: MethodOptions): GaxiosPromise[SchemaColumn] = js.native
  def patch(
    params: ParamsResourceColumnPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaColumn]
  ): Unit = js.native
  
  /**
    * fusiontables.column.update
    * @desc Updates the name or type of an existing column.
    * @alias fusiontables.column.update
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.columnId Name or identifier for the column that is being updated.
    * @param {string} params.tableId Table for which the column is being updated.
    * @param {().Column} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def update(): GaxiosPromise[SchemaColumn] = js.native
  def update(callback: BodyResponseCallback[SchemaColumn]): Unit = js.native
  def update(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaColumn] = js.native
  def update(params: ParamsResourceColumnUpdate): GaxiosPromise[SchemaColumn] = js.native
  def update(params: ParamsResourceColumnUpdate, callback: BodyResponseCallback[SchemaColumn]): Unit = js.native
  def update(
    params: ParamsResourceColumnUpdate,
    options: BodyResponseCallback[SchemaColumn],
    callback: BodyResponseCallback[SchemaColumn]
  ): Unit = js.native
  def update(params: ParamsResourceColumnUpdate, options: MethodOptions): GaxiosPromise[SchemaColumn] = js.native
  def update(
    params: ParamsResourceColumnUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaColumn]
  ): Unit = js.native
}
