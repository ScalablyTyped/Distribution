package typings.googleapis.fusiontablesV1Mod.fusiontablesV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/fusiontables/v1", "fusiontables_v1.Resource$Table")
@js.native
class ResourceTable protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * fusiontables.table.copy
    * @desc Copies a table.
    * @alias fusiontables.table.copy
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {boolean=} params.copyPresentation Whether to also copy tabs, styles, and templates. Default is false.
    * @param {string} params.tableId ID of the table that is being copied.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def copy(): GaxiosPromise[SchemaTable] = js.native
  def copy(callback: BodyResponseCallback[SchemaTable]): Unit = js.native
  def copy(params: ParamsResourceTableCopy): GaxiosPromise[SchemaTable] = js.native
  def copy(params: ParamsResourceTableCopy, callback: BodyResponseCallback[SchemaTable]): Unit = js.native
  def copy(
    params: ParamsResourceTableCopy,
    options: BodyResponseCallback[SchemaTable],
    callback: BodyResponseCallback[SchemaTable]
  ): Unit = js.native
  def copy(params: ParamsResourceTableCopy, options: MethodOptions): GaxiosPromise[SchemaTable] = js.native
  def copy(
    params: ParamsResourceTableCopy,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaTable]
  ): Unit = js.native
  /**
    * fusiontables.table.delete
    * @desc Deletes a table.
    * @alias fusiontables.table.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.tableId ID of the table that is being deleted.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[Unit] = js.native
  def delete(callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(params: ParamsResourceTableDelete): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceTableDelete, callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(
    params: ParamsResourceTableDelete,
    options: BodyResponseCallback[Unit],
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def delete(params: ParamsResourceTableDelete, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceTableDelete, options: MethodOptions, callback: BodyResponseCallback[Unit]): Unit = js.native
  /**
    * fusiontables.table.get
    * @desc Retrieves a specific table by its id.
    * @alias fusiontables.table.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.tableId Identifier(ID) for the table being requested.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaTable] = js.native
  def get(callback: BodyResponseCallback[SchemaTable]): Unit = js.native
  def get(params: ParamsResourceTableGet): GaxiosPromise[SchemaTable] = js.native
  def get(params: ParamsResourceTableGet, callback: BodyResponseCallback[SchemaTable]): Unit = js.native
  def get(
    params: ParamsResourceTableGet,
    options: BodyResponseCallback[SchemaTable],
    callback: BodyResponseCallback[SchemaTable]
  ): Unit = js.native
  def get(params: ParamsResourceTableGet, options: MethodOptions): GaxiosPromise[SchemaTable] = js.native
  def get(
    params: ParamsResourceTableGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaTable]
  ): Unit = js.native
  /**
    * fusiontables.table.importRows
    * @desc Import more rows into a table.
    * @alias fusiontables.table.importRows
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.delimiter The delimiter used to separate cell values. This can only consist of a single character. Default is ','.
    * @param {string=} params.encoding The encoding of the content. Default is UTF-8. Use 'auto-detect' if you are unsure of the encoding.
    * @param {integer=} params.endLine The index of the last line from which to start importing, exclusive. Thus, the number of imported lines is endLine - startLine. If this parameter is not provided, the file will be imported until the last line of the file. If endLine is negative, then the imported content will exclude the last endLine lines. That is, if endline is negative, no line will be imported whose index is greater than N + endLine where N is the number of lines in the file, and the number of imported lines will be N + endLine - startLine.
    * @param {boolean=} params.isStrict Whether the CSV must have the same number of values for each row. If false, rows with fewer values will be padded with empty values. Default is true.
    * @param {integer=} params.startLine The index of the first line from which to start importing, inclusive. Default is 0.
    * @param {string} params.tableId The table into which new rows are being imported.
    * @param {object} params.media Media object
    * @param {string} params.media.mimeType Media mime-type
    * @param {string|object} params.media.body Media body contents
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def importRows(): GaxiosPromise[SchemaImport] = js.native
  def importRows(callback: BodyResponseCallback[SchemaImport]): Unit = js.native
  def importRows(params: ParamsResourceTableImportrows): GaxiosPromise[SchemaImport] = js.native
  def importRows(params: ParamsResourceTableImportrows, callback: BodyResponseCallback[SchemaImport]): Unit = js.native
  def importRows(
    params: ParamsResourceTableImportrows,
    options: BodyResponseCallback[SchemaImport],
    callback: BodyResponseCallback[SchemaImport]
  ): Unit = js.native
  def importRows(params: ParamsResourceTableImportrows, options: MethodOptions): GaxiosPromise[SchemaImport] = js.native
  def importRows(
    params: ParamsResourceTableImportrows,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaImport]
  ): Unit = js.native
  /**
    * fusiontables.table.importTable
    * @desc Import a new table.
    * @alias fusiontables.table.importTable
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.delimiter The delimiter used to separate cell values. This can only consist of a single character. Default is ','.
    * @param {string=} params.encoding The encoding of the content. Default is UTF-8. Use 'auto-detect' if you are unsure of the encoding.
    * @param {string} params.name The name to be assigned to the new table.
    * @param {object} params.media Media object
    * @param {string} params.media.mimeType Media mime-type
    * @param {string|object} params.media.body Media body contents
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def importTable(): GaxiosPromise[SchemaTable] = js.native
  def importTable(callback: BodyResponseCallback[SchemaTable]): Unit = js.native
  def importTable(params: ParamsResourceTableImporttable): GaxiosPromise[SchemaTable] = js.native
  def importTable(params: ParamsResourceTableImporttable, callback: BodyResponseCallback[SchemaTable]): Unit = js.native
  def importTable(
    params: ParamsResourceTableImporttable,
    options: BodyResponseCallback[SchemaTable],
    callback: BodyResponseCallback[SchemaTable]
  ): Unit = js.native
  def importTable(params: ParamsResourceTableImporttable, options: MethodOptions): GaxiosPromise[SchemaTable] = js.native
  def importTable(
    params: ParamsResourceTableImporttable,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaTable]
  ): Unit = js.native
  /**
    * fusiontables.table.insert
    * @desc Creates a new table.
    * @alias fusiontables.table.insert
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {().Table} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def insert(): GaxiosPromise[SchemaTable] = js.native
  def insert(callback: BodyResponseCallback[SchemaTable]): Unit = js.native
  def insert(params: ParamsResourceTableInsert): GaxiosPromise[SchemaTable] = js.native
  def insert(params: ParamsResourceTableInsert, callback: BodyResponseCallback[SchemaTable]): Unit = js.native
  def insert(
    params: ParamsResourceTableInsert,
    options: BodyResponseCallback[SchemaTable],
    callback: BodyResponseCallback[SchemaTable]
  ): Unit = js.native
  def insert(params: ParamsResourceTableInsert, options: MethodOptions): GaxiosPromise[SchemaTable] = js.native
  def insert(
    params: ParamsResourceTableInsert,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaTable]
  ): Unit = js.native
  /**
    * fusiontables.table.list
    * @desc Retrieves a list of tables a user owns.
    * @alias fusiontables.table.list
    * @memberOf! ()
    *
    * @param {object=} params Parameters for request
    * @param {integer=} params.maxResults Maximum number of styles to return. Optional. Default is 5.
    * @param {string=} params.pageToken Continuation token specifying which result page to return. Optional.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaTableList] = js.native
  def list(callback: BodyResponseCallback[SchemaTableList]): Unit = js.native
  def list(params: ParamsResourceTableList): GaxiosPromise[SchemaTableList] = js.native
  def list(params: ParamsResourceTableList, callback: BodyResponseCallback[SchemaTableList]): Unit = js.native
  def list(
    params: ParamsResourceTableList,
    options: BodyResponseCallback[SchemaTableList],
    callback: BodyResponseCallback[SchemaTableList]
  ): Unit = js.native
  def list(params: ParamsResourceTableList, options: MethodOptions): GaxiosPromise[SchemaTableList] = js.native
  def list(
    params: ParamsResourceTableList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaTableList]
  ): Unit = js.native
  /**
    * fusiontables.table.patch
    * @desc Updates an existing table. Unless explicitly requested, only the
    * name, description, and attribution will be updated. This method supports
    * patch semantics.
    * @alias fusiontables.table.patch
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {boolean=} params.replaceViewDefinition Should the view definition also be updated? The specified view definition replaces the existing one. Only a view can be updated with a new definition.
    * @param {string} params.tableId ID of the table that is being updated.
    * @param {().Table} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def patch(): GaxiosPromise[SchemaTable] = js.native
  def patch(callback: BodyResponseCallback[SchemaTable]): Unit = js.native
  def patch(params: ParamsResourceTablePatch): GaxiosPromise[SchemaTable] = js.native
  def patch(params: ParamsResourceTablePatch, callback: BodyResponseCallback[SchemaTable]): Unit = js.native
  def patch(
    params: ParamsResourceTablePatch,
    options: BodyResponseCallback[SchemaTable],
    callback: BodyResponseCallback[SchemaTable]
  ): Unit = js.native
  def patch(params: ParamsResourceTablePatch, options: MethodOptions): GaxiosPromise[SchemaTable] = js.native
  def patch(
    params: ParamsResourceTablePatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaTable]
  ): Unit = js.native
  /**
    * fusiontables.table.update
    * @desc Updates an existing table. Unless explicitly requested, only the
    * name, description, and attribution will be updated.
    * @alias fusiontables.table.update
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {boolean=} params.replaceViewDefinition Should the view definition also be updated? The specified view definition replaces the existing one. Only a view can be updated with a new definition.
    * @param {string} params.tableId ID of the table that is being updated.
    * @param {().Table} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def update(): GaxiosPromise[SchemaTable] = js.native
  def update(callback: BodyResponseCallback[SchemaTable]): Unit = js.native
  def update(params: ParamsResourceTableUpdate): GaxiosPromise[SchemaTable] = js.native
  def update(params: ParamsResourceTableUpdate, callback: BodyResponseCallback[SchemaTable]): Unit = js.native
  def update(
    params: ParamsResourceTableUpdate,
    options: BodyResponseCallback[SchemaTable],
    callback: BodyResponseCallback[SchemaTable]
  ): Unit = js.native
  def update(params: ParamsResourceTableUpdate, options: MethodOptions): GaxiosPromise[SchemaTable] = js.native
  def update(
    params: ParamsResourceTableUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaTable]
  ): Unit = js.native
}

