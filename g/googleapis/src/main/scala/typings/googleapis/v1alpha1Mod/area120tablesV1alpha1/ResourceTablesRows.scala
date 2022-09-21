package typings.googleapis.v1alpha1Mod.area120tablesV1alpha1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/area120tables/v1alpha1", "area120tables_v1alpha1.Resource$Tables$Rows")
@js.native
open class ResourceTablesRows protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  def batchCreate(): GaxiosPromise[SchemaBatchCreateRowsResponse] = js.native
  def batchCreate(callback: BodyResponseCallback[SchemaBatchCreateRowsResponse]): Unit = js.native
  def batchCreate(params: Unit, options: MethodOptions): GaxiosPromise[SchemaBatchCreateRowsResponse] = js.native
  def batchCreate(params: ParamsResourceTablesRowsBatchcreate): GaxiosPromise[SchemaBatchCreateRowsResponse] = js.native
  def batchCreate(
    params: ParamsResourceTablesRowsBatchcreate,
    callback: BodyResponseCallback[SchemaBatchCreateRowsResponse]
  ): Unit = js.native
  def batchCreate(
    params: ParamsResourceTablesRowsBatchcreate,
    options: BodyResponseCallback[Readable | SchemaBatchCreateRowsResponse],
    callback: BodyResponseCallback[Readable | SchemaBatchCreateRowsResponse]
  ): Unit = js.native
  def batchCreate(params: ParamsResourceTablesRowsBatchcreate, options: MethodOptions): GaxiosPromise[SchemaBatchCreateRowsResponse] = js.native
  def batchCreate(
    params: ParamsResourceTablesRowsBatchcreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaBatchCreateRowsResponse]
  ): Unit = js.native
  /**
    * Creates multiple rows.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/area120tables.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const area120tables = google.area120tables('v1alpha1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/drive',
    *       'https://www.googleapis.com/auth/drive.file',
    *       'https://www.googleapis.com/auth/spreadsheets',
    *       'https://www.googleapis.com/auth/tables',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await area120tables.tables.rows.batchCreate({
    *     // Required. The parent table where the rows will be created. Format: tables/{table\}
    *     parent: 'tables/my-table',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "requests": []
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "rows": []
    *   // }
    * }
    *
    * main().catch(e => {
    *   console.error(e);
    *   throw e;
    * });
    *
    * ```
    *
    * @param params - Parameters for request
    * @param options - Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param callback - Optional callback that handles the response.
    * @returns A promise if used with async/await, or void if used with a callback.
    */
  def batchCreate(params: ParamsResourceTablesRowsBatchcreate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def batchCreate(
    params: ParamsResourceTablesRowsBatchcreate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def batchDelete(): GaxiosPromise[SchemaEmpty] = js.native
  def batchDelete(callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def batchDelete(params: Unit, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def batchDelete(params: ParamsResourceTablesRowsBatchdelete): GaxiosPromise[SchemaEmpty] = js.native
  def batchDelete(params: ParamsResourceTablesRowsBatchdelete, callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def batchDelete(
    params: ParamsResourceTablesRowsBatchdelete,
    options: BodyResponseCallback[Readable | SchemaEmpty],
    callback: BodyResponseCallback[Readable | SchemaEmpty]
  ): Unit = js.native
  def batchDelete(params: ParamsResourceTablesRowsBatchdelete, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def batchDelete(
    params: ParamsResourceTablesRowsBatchdelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  /**
    * Deletes multiple rows.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/area120tables.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const area120tables = google.area120tables('v1alpha1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/drive',
    *       'https://www.googleapis.com/auth/drive.file',
    *       'https://www.googleapis.com/auth/spreadsheets',
    *       'https://www.googleapis.com/auth/tables',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await area120tables.tables.rows.batchDelete({
    *     // Required. The parent table shared by all rows being deleted. Format: tables/{table\}
    *     parent: 'tables/my-table',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "names": []
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {}
    * }
    *
    * main().catch(e => {
    *   console.error(e);
    *   throw e;
    * });
    *
    * ```
    *
    * @param params - Parameters for request
    * @param options - Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param callback - Optional callback that handles the response.
    * @returns A promise if used with async/await, or void if used with a callback.
    */
  def batchDelete(params: ParamsResourceTablesRowsBatchdelete, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def batchDelete(
    params: ParamsResourceTablesRowsBatchdelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def batchUpdate(): GaxiosPromise[SchemaBatchUpdateRowsResponse] = js.native
  def batchUpdate(callback: BodyResponseCallback[SchemaBatchUpdateRowsResponse]): Unit = js.native
  def batchUpdate(params: Unit, options: MethodOptions): GaxiosPromise[SchemaBatchUpdateRowsResponse] = js.native
  def batchUpdate(params: ParamsResourceTablesRowsBatchupdate): GaxiosPromise[SchemaBatchUpdateRowsResponse] = js.native
  def batchUpdate(
    params: ParamsResourceTablesRowsBatchupdate,
    callback: BodyResponseCallback[SchemaBatchUpdateRowsResponse]
  ): Unit = js.native
  def batchUpdate(
    params: ParamsResourceTablesRowsBatchupdate,
    options: BodyResponseCallback[Readable | SchemaBatchUpdateRowsResponse],
    callback: BodyResponseCallback[Readable | SchemaBatchUpdateRowsResponse]
  ): Unit = js.native
  def batchUpdate(params: ParamsResourceTablesRowsBatchupdate, options: MethodOptions): GaxiosPromise[SchemaBatchUpdateRowsResponse] = js.native
  def batchUpdate(
    params: ParamsResourceTablesRowsBatchupdate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaBatchUpdateRowsResponse]
  ): Unit = js.native
  /**
    * Updates multiple rows.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/area120tables.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const area120tables = google.area120tables('v1alpha1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/drive',
    *       'https://www.googleapis.com/auth/drive.file',
    *       'https://www.googleapis.com/auth/spreadsheets',
    *       'https://www.googleapis.com/auth/tables',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await area120tables.tables.rows.batchUpdate({
    *     // Required. The parent table shared by all rows being updated. Format: tables/{table\}
    *     parent: 'tables/my-table',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "requests": []
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "rows": []
    *   // }
    * }
    *
    * main().catch(e => {
    *   console.error(e);
    *   throw e;
    * });
    *
    * ```
    *
    * @param params - Parameters for request
    * @param options - Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param callback - Optional callback that handles the response.
    * @returns A promise if used with async/await, or void if used with a callback.
    */
  def batchUpdate(params: ParamsResourceTablesRowsBatchupdate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def batchUpdate(
    params: ParamsResourceTablesRowsBatchupdate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  var context: APIRequestContext = js.native
  
  def create(): GaxiosPromise[SchemaRow] = js.native
  def create(callback: BodyResponseCallback[SchemaRow]): Unit = js.native
  def create(params: Unit, options: MethodOptions): GaxiosPromise[SchemaRow] = js.native
  def create(params: ParamsResourceTablesRowsCreate): GaxiosPromise[SchemaRow] = js.native
  def create(params: ParamsResourceTablesRowsCreate, callback: BodyResponseCallback[SchemaRow]): Unit = js.native
  def create(
    params: ParamsResourceTablesRowsCreate,
    options: BodyResponseCallback[Readable | SchemaRow],
    callback: BodyResponseCallback[Readable | SchemaRow]
  ): Unit = js.native
  def create(params: ParamsResourceTablesRowsCreate, options: MethodOptions): GaxiosPromise[SchemaRow] = js.native
  def create(
    params: ParamsResourceTablesRowsCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaRow]
  ): Unit = js.native
  /**
    * Creates a row.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/area120tables.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const area120tables = google.area120tables('v1alpha1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/drive',
    *       'https://www.googleapis.com/auth/drive.file',
    *       'https://www.googleapis.com/auth/spreadsheets',
    *       'https://www.googleapis.com/auth/tables',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await area120tables.tables.rows.create({
    *     // Required. The parent table where this row will be created. Format: tables/{table\}
    *     parent: 'tables/my-table',
    *     // Optional. Column key to use for values in the row. Defaults to user entered name.
    *     view: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "createTime": "my_createTime",
    *       //   "name": "my_name",
    *       //   "updateTime": "my_updateTime",
    *       //   "values": {}
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "createTime": "my_createTime",
    *   //   "name": "my_name",
    *   //   "updateTime": "my_updateTime",
    *   //   "values": {}
    *   // }
    * }
    *
    * main().catch(e => {
    *   console.error(e);
    *   throw e;
    * });
    *
    * ```
    *
    * @param params - Parameters for request
    * @param options - Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param callback - Optional callback that handles the response.
    * @returns A promise if used with async/await, or void if used with a callback.
    */
  def create(params: ParamsResourceTablesRowsCreate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def create(
    params: ParamsResourceTablesRowsCreate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def delete(): GaxiosPromise[SchemaEmpty] = js.native
  def delete(callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def delete(params: ParamsResourceTablesRowsDelete): GaxiosPromise[SchemaEmpty] = js.native
  def delete(params: ParamsResourceTablesRowsDelete, callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def delete(
    params: ParamsResourceTablesRowsDelete,
    options: BodyResponseCallback[Readable | SchemaEmpty],
    callback: BodyResponseCallback[Readable | SchemaEmpty]
  ): Unit = js.native
  def delete(params: ParamsResourceTablesRowsDelete, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def delete(
    params: ParamsResourceTablesRowsDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  /**
    * Deletes a row.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/area120tables.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const area120tables = google.area120tables('v1alpha1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/drive',
    *       'https://www.googleapis.com/auth/drive.file',
    *       'https://www.googleapis.com/auth/spreadsheets',
    *       'https://www.googleapis.com/auth/tables',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await area120tables.tables.rows.delete({
    *     // Required. The name of the row to delete. Format: tables/{table\}/rows/{row\}
    *     name: 'tables/my-table/rows/my-row',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {}
    * }
    *
    * main().catch(e => {
    *   console.error(e);
    *   throw e;
    * });
    *
    * ```
    *
    * @param params - Parameters for request
    * @param options - Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param callback - Optional callback that handles the response.
    * @returns A promise if used with async/await, or void if used with a callback.
    */
  def delete(params: ParamsResourceTablesRowsDelete, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def delete(
    params: ParamsResourceTablesRowsDelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def get(): GaxiosPromise[SchemaRow] = js.native
  def get(callback: BodyResponseCallback[SchemaRow]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaRow] = js.native
  def get(params: ParamsResourceTablesRowsGet): GaxiosPromise[SchemaRow] = js.native
  def get(params: ParamsResourceTablesRowsGet, callback: BodyResponseCallback[SchemaRow]): Unit = js.native
  def get(
    params: ParamsResourceTablesRowsGet,
    options: BodyResponseCallback[Readable | SchemaRow],
    callback: BodyResponseCallback[Readable | SchemaRow]
  ): Unit = js.native
  def get(params: ParamsResourceTablesRowsGet, options: MethodOptions): GaxiosPromise[SchemaRow] = js.native
  def get(
    params: ParamsResourceTablesRowsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaRow]
  ): Unit = js.native
  /**
    * Gets a row. Returns NOT_FOUND if the row does not exist in the table.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/area120tables.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const area120tables = google.area120tables('v1alpha1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/drive',
    *       'https://www.googleapis.com/auth/drive.file',
    *       'https://www.googleapis.com/auth/drive.readonly',
    *       'https://www.googleapis.com/auth/spreadsheets',
    *       'https://www.googleapis.com/auth/spreadsheets.readonly',
    *       'https://www.googleapis.com/auth/tables',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await area120tables.tables.rows.get({
    *     // Required. The name of the row to retrieve. Format: tables/{table\}/rows/{row\}
    *     name: 'tables/my-table/rows/my-row',
    *     // Optional. Column key to use for values in the row. Defaults to user entered name.
    *     view: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "createTime": "my_createTime",
    *   //   "name": "my_name",
    *   //   "updateTime": "my_updateTime",
    *   //   "values": {}
    *   // }
    * }
    *
    * main().catch(e => {
    *   console.error(e);
    *   throw e;
    * });
    *
    * ```
    *
    * @param params - Parameters for request
    * @param options - Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param callback - Optional callback that handles the response.
    * @returns A promise if used with async/await, or void if used with a callback.
    */
  def get(params: ParamsResourceTablesRowsGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceTablesRowsGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaListRowsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListRowsResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListRowsResponse] = js.native
  def list(params: ParamsResourceTablesRowsList): GaxiosPromise[SchemaListRowsResponse] = js.native
  def list(params: ParamsResourceTablesRowsList, callback: BodyResponseCallback[SchemaListRowsResponse]): Unit = js.native
  def list(
    params: ParamsResourceTablesRowsList,
    options: BodyResponseCallback[Readable | SchemaListRowsResponse],
    callback: BodyResponseCallback[Readable | SchemaListRowsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceTablesRowsList, options: MethodOptions): GaxiosPromise[SchemaListRowsResponse] = js.native
  def list(
    params: ParamsResourceTablesRowsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListRowsResponse]
  ): Unit = js.native
  /**
    * Lists rows in a table. Returns NOT_FOUND if the table does not exist.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/area120tables.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const area120tables = google.area120tables('v1alpha1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/drive',
    *       'https://www.googleapis.com/auth/drive.file',
    *       'https://www.googleapis.com/auth/drive.readonly',
    *       'https://www.googleapis.com/auth/spreadsheets',
    *       'https://www.googleapis.com/auth/spreadsheets.readonly',
    *       'https://www.googleapis.com/auth/tables',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await area120tables.tables.rows.list({
    *     // Optional. Filter to only include resources matching the requirements. For more information, see [Filtering list results](https://support.google.com/area120-tables/answer/10503371).
    *     filter: 'placeholder-value',
    *     // Optional. Sorting order for the list of rows on createTime/updateTime.
    *     orderBy: 'placeholder-value',
    *     // The maximum number of rows to return. The service may return fewer than this value. If unspecified, at most 50 rows are returned. The maximum value is 1,000; values above 1,000 are coerced to 1,000.
    *     pageSize: 'placeholder-value',
    *     // A page token, received from a previous `ListRows` call. Provide this to retrieve the subsequent page. When paginating, all other parameters provided to `ListRows` must match the call that provided the page token.
    *     pageToken: 'placeholder-value',
    *     // Required. The parent table. Format: tables/{table\}
    *     parent: 'tables/my-table',
    *     // Optional. Column key to use for values in the row. Defaults to user entered name.
    *     view: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "nextPageToken": "my_nextPageToken",
    *   //   "rows": []
    *   // }
    * }
    *
    * main().catch(e => {
    *   console.error(e);
    *   throw e;
    * });
    *
    * ```
    *
    * @param params - Parameters for request
    * @param options - Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param callback - Optional callback that handles the response.
    * @returns A promise if used with async/await, or void if used with a callback.
    */
  def list(params: ParamsResourceTablesRowsList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceTablesRowsList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def patch(): GaxiosPromise[SchemaRow] = js.native
  def patch(callback: BodyResponseCallback[SchemaRow]): Unit = js.native
  def patch(params: Unit, options: MethodOptions): GaxiosPromise[SchemaRow] = js.native
  def patch(params: ParamsResourceTablesRowsPatch): GaxiosPromise[SchemaRow] = js.native
  def patch(params: ParamsResourceTablesRowsPatch, callback: BodyResponseCallback[SchemaRow]): Unit = js.native
  def patch(
    params: ParamsResourceTablesRowsPatch,
    options: BodyResponseCallback[Readable | SchemaRow],
    callback: BodyResponseCallback[Readable | SchemaRow]
  ): Unit = js.native
  def patch(params: ParamsResourceTablesRowsPatch, options: MethodOptions): GaxiosPromise[SchemaRow] = js.native
  def patch(
    params: ParamsResourceTablesRowsPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaRow]
  ): Unit = js.native
  /**
    * Updates a row.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/area120tables.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const area120tables = google.area120tables('v1alpha1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/drive',
    *       'https://www.googleapis.com/auth/drive.file',
    *       'https://www.googleapis.com/auth/spreadsheets',
    *       'https://www.googleapis.com/auth/tables',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await area120tables.tables.rows.patch({
    *     // The resource name of the row. Row names have the form `tables/{table\}/rows/{row\}`. The name is ignored when creating a row.
    *     name: 'tables/my-table/rows/my-row',
    *     // The list of fields to update.
    *     updateMask: 'placeholder-value',
    *     // Optional. Column key to use for values in the row. Defaults to user entered name.
    *     view: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "createTime": "my_createTime",
    *       //   "name": "my_name",
    *       //   "updateTime": "my_updateTime",
    *       //   "values": {}
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "createTime": "my_createTime",
    *   //   "name": "my_name",
    *   //   "updateTime": "my_updateTime",
    *   //   "values": {}
    *   // }
    * }
    *
    * main().catch(e => {
    *   console.error(e);
    *   throw e;
    * });
    *
    * ```
    *
    * @param params - Parameters for request
    * @param options - Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param callback - Optional callback that handles the response.
    * @returns A promise if used with async/await, or void if used with a callback.
    */
  def patch(params: ParamsResourceTablesRowsPatch, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def patch(
    params: ParamsResourceTablesRowsPatch,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
