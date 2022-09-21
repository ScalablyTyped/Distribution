package typings.googleapis.sheetsV4Mod.sheetsV4

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/sheets/v4", "sheets_v4.Resource$Spreadsheets$Values")
@js.native
open class ResourceSpreadsheetsValues protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  def append(): GaxiosPromise[SchemaAppendValuesResponse] = js.native
  def append(callback: BodyResponseCallback[SchemaAppendValuesResponse]): Unit = js.native
  def append(params: Unit, options: MethodOptions): GaxiosPromise[SchemaAppendValuesResponse] = js.native
  def append(params: ParamsResourceSpreadsheetsValuesAppend): GaxiosPromise[SchemaAppendValuesResponse] = js.native
  def append(
    params: ParamsResourceSpreadsheetsValuesAppend,
    callback: BodyResponseCallback[SchemaAppendValuesResponse]
  ): Unit = js.native
  def append(
    params: ParamsResourceSpreadsheetsValuesAppend,
    options: BodyResponseCallback[Readable | SchemaAppendValuesResponse],
    callback: BodyResponseCallback[Readable | SchemaAppendValuesResponse]
  ): Unit = js.native
  def append(params: ParamsResourceSpreadsheetsValuesAppend, options: MethodOptions): GaxiosPromise[SchemaAppendValuesResponse] = js.native
  def append(
    params: ParamsResourceSpreadsheetsValuesAppend,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaAppendValuesResponse]
  ): Unit = js.native
  /**
    * Appends values to a spreadsheet. The input range is used to search for existing data and find a "table" within that range. Values will be appended to the next row of the table, starting with the first column of the table. See the [guide](/sheets/api/guides/values#appending_values) and [sample code](/sheets/api/samples/writing#append_values) for specific details of how tables are detected and data is appended. The caller must specify the spreadsheet ID, range, and a valueInputOption. The `valueInputOption` only controls how the input data will be added to the sheet (column-wise or row-wise), it does not influence what cell the data starts being written to.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/sheets.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const sheets = google.sheets('v4');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/drive',
    *       'https://www.googleapis.com/auth/drive.file',
    *       'https://www.googleapis.com/auth/spreadsheets',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await sheets.spreadsheets.values.append({
    *     // Determines if the update response should include the values of the cells that were appended. By default, responses do not include the updated values.
    *     includeValuesInResponse: 'placeholder-value',
    *     // How the input data should be inserted.
    *     insertDataOption: 'placeholder-value',
    *     // The [A1 notation](/sheets/api/guides/concepts#cell) of a range to search for a logical table of data. Values are appended after the last row of the table.
    *     range: 'placeholder-value',
    *     // Determines how dates, times, and durations in the response should be rendered. This is ignored if response_value_render_option is FORMATTED_VALUE. The default dateTime render option is SERIAL_NUMBER.
    *     responseDateTimeRenderOption: 'placeholder-value',
    *     // Determines how values in the response should be rendered. The default render option is FORMATTED_VALUE.
    *     responseValueRenderOption: 'placeholder-value',
    *     // The ID of the spreadsheet to update.
    *     spreadsheetId: 'placeholder-value',
    *     // How the input data should be interpreted.
    *     valueInputOption: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "majorDimension": "my_majorDimension",
    *       //   "range": "my_range",
    *       //   "values": []
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "spreadsheetId": "my_spreadsheetId",
    *   //   "tableRange": "my_tableRange",
    *   //   "updates": {}
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
  def append(params: ParamsResourceSpreadsheetsValuesAppend, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def append(
    params: ParamsResourceSpreadsheetsValuesAppend,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def batchClear(): GaxiosPromise[SchemaBatchClearValuesResponse] = js.native
  def batchClear(callback: BodyResponseCallback[SchemaBatchClearValuesResponse]): Unit = js.native
  def batchClear(params: Unit, options: MethodOptions): GaxiosPromise[SchemaBatchClearValuesResponse] = js.native
  def batchClear(params: ParamsResourceSpreadsheetsValuesBatchclear): GaxiosPromise[SchemaBatchClearValuesResponse] = js.native
  def batchClear(
    params: ParamsResourceSpreadsheetsValuesBatchclear,
    callback: BodyResponseCallback[SchemaBatchClearValuesResponse]
  ): Unit = js.native
  def batchClear(
    params: ParamsResourceSpreadsheetsValuesBatchclear,
    options: BodyResponseCallback[Readable | SchemaBatchClearValuesResponse],
    callback: BodyResponseCallback[Readable | SchemaBatchClearValuesResponse]
  ): Unit = js.native
  def batchClear(params: ParamsResourceSpreadsheetsValuesBatchclear, options: MethodOptions): GaxiosPromise[SchemaBatchClearValuesResponse] = js.native
  def batchClear(
    params: ParamsResourceSpreadsheetsValuesBatchclear,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaBatchClearValuesResponse]
  ): Unit = js.native
  /**
    * Clears one or more ranges of values from a spreadsheet. The caller must specify the spreadsheet ID and one or more ranges. Only values are cleared -- all other properties of the cell (such as formatting and data validation) are kept.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/sheets.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const sheets = google.sheets('v4');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/drive',
    *       'https://www.googleapis.com/auth/drive.file',
    *       'https://www.googleapis.com/auth/spreadsheets',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await sheets.spreadsheets.values.batchClear({
    *     // The ID of the spreadsheet to update.
    *     spreadsheetId: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "ranges": []
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "clearedRanges": [],
    *   //   "spreadsheetId": "my_spreadsheetId"
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
  def batchClear(params: ParamsResourceSpreadsheetsValuesBatchclear, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def batchClear(
    params: ParamsResourceSpreadsheetsValuesBatchclear,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def batchClearByDataFilter(): GaxiosPromise[SchemaBatchClearValuesByDataFilterResponse] = js.native
  def batchClearByDataFilter(callback: BodyResponseCallback[SchemaBatchClearValuesByDataFilterResponse]): Unit = js.native
  def batchClearByDataFilter(params: Unit, options: MethodOptions): GaxiosPromise[SchemaBatchClearValuesByDataFilterResponse] = js.native
  def batchClearByDataFilter(params: ParamsResourceSpreadsheetsValuesBatchclearbydatafilter): GaxiosPromise[SchemaBatchClearValuesByDataFilterResponse] = js.native
  def batchClearByDataFilter(
    params: ParamsResourceSpreadsheetsValuesBatchclearbydatafilter,
    callback: BodyResponseCallback[SchemaBatchClearValuesByDataFilterResponse]
  ): Unit = js.native
  def batchClearByDataFilter(
    params: ParamsResourceSpreadsheetsValuesBatchclearbydatafilter,
    options: BodyResponseCallback[Readable | SchemaBatchClearValuesByDataFilterResponse],
    callback: BodyResponseCallback[Readable | SchemaBatchClearValuesByDataFilterResponse]
  ): Unit = js.native
  def batchClearByDataFilter(params: ParamsResourceSpreadsheetsValuesBatchclearbydatafilter, options: MethodOptions): GaxiosPromise[SchemaBatchClearValuesByDataFilterResponse] = js.native
  def batchClearByDataFilter(
    params: ParamsResourceSpreadsheetsValuesBatchclearbydatafilter,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaBatchClearValuesByDataFilterResponse]
  ): Unit = js.native
  /**
    * Clears one or more ranges of values from a spreadsheet. The caller must specify the spreadsheet ID and one or more DataFilters. Ranges matching any of the specified data filters will be cleared. Only values are cleared -- all other properties of the cell (such as formatting, data validation, etc..) are kept.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/sheets.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const sheets = google.sheets('v4');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/drive',
    *       'https://www.googleapis.com/auth/drive.file',
    *       'https://www.googleapis.com/auth/spreadsheets',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await sheets.spreadsheets.values.batchClearByDataFilter({
    *     // The ID of the spreadsheet to update.
    *     spreadsheetId: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "dataFilters": []
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "clearedRanges": [],
    *   //   "spreadsheetId": "my_spreadsheetId"
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
  def batchClearByDataFilter(params: ParamsResourceSpreadsheetsValuesBatchclearbydatafilter, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def batchClearByDataFilter(
    params: ParamsResourceSpreadsheetsValuesBatchclearbydatafilter,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def batchGet(): GaxiosPromise[SchemaBatchGetValuesResponse] = js.native
  def batchGet(callback: BodyResponseCallback[SchemaBatchGetValuesResponse]): Unit = js.native
  def batchGet(params: Unit, options: MethodOptions): GaxiosPromise[SchemaBatchGetValuesResponse] = js.native
  def batchGet(params: ParamsResourceSpreadsheetsValuesBatchget): GaxiosPromise[SchemaBatchGetValuesResponse] = js.native
  def batchGet(
    params: ParamsResourceSpreadsheetsValuesBatchget,
    callback: BodyResponseCallback[SchemaBatchGetValuesResponse]
  ): Unit = js.native
  def batchGet(
    params: ParamsResourceSpreadsheetsValuesBatchget,
    options: BodyResponseCallback[Readable | SchemaBatchGetValuesResponse],
    callback: BodyResponseCallback[Readable | SchemaBatchGetValuesResponse]
  ): Unit = js.native
  def batchGet(params: ParamsResourceSpreadsheetsValuesBatchget, options: MethodOptions): GaxiosPromise[SchemaBatchGetValuesResponse] = js.native
  def batchGet(
    params: ParamsResourceSpreadsheetsValuesBatchget,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaBatchGetValuesResponse]
  ): Unit = js.native
  /**
    * Returns one or more ranges of values from a spreadsheet. The caller must specify the spreadsheet ID and one or more ranges.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/sheets.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const sheets = google.sheets('v4');
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
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await sheets.spreadsheets.values.batchGet({
    *     // How dates, times, and durations should be represented in the output. This is ignored if value_render_option is FORMATTED_VALUE. The default dateTime render option is SERIAL_NUMBER.
    *     dateTimeRenderOption: 'placeholder-value',
    *     // The major dimension that results should use. For example, if the spreadsheet data is: `A1=1,B1=2,A2=3,B2=4`, then requesting `ranges=["A1:B2"],majorDimension=ROWS` returns `[[1,2],[3,4]]`, whereas requesting `ranges=["A1:B2"],majorDimension=COLUMNS` returns `[[1,3],[2,4]]`.
    *     majorDimension: 'placeholder-value',
    *     // The [A1 notation or R1C1 notation](/sheets/api/guides/concepts#cell) of the range to retrieve values from.
    *     ranges: 'placeholder-value',
    *     // The ID of the spreadsheet to retrieve data from.
    *     spreadsheetId: 'placeholder-value',
    *     // How values should be represented in the output. The default render option is ValueRenderOption.FORMATTED_VALUE.
    *     valueRenderOption: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "spreadsheetId": "my_spreadsheetId",
    *   //   "valueRanges": []
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
  def batchGet(params: ParamsResourceSpreadsheetsValuesBatchget, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def batchGet(
    params: ParamsResourceSpreadsheetsValuesBatchget,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def batchGetByDataFilter(): GaxiosPromise[SchemaBatchGetValuesByDataFilterResponse] = js.native
  def batchGetByDataFilter(callback: BodyResponseCallback[SchemaBatchGetValuesByDataFilterResponse]): Unit = js.native
  def batchGetByDataFilter(params: Unit, options: MethodOptions): GaxiosPromise[SchemaBatchGetValuesByDataFilterResponse] = js.native
  def batchGetByDataFilter(params: ParamsResourceSpreadsheetsValuesBatchgetbydatafilter): GaxiosPromise[SchemaBatchGetValuesByDataFilterResponse] = js.native
  def batchGetByDataFilter(
    params: ParamsResourceSpreadsheetsValuesBatchgetbydatafilter,
    callback: BodyResponseCallback[SchemaBatchGetValuesByDataFilterResponse]
  ): Unit = js.native
  def batchGetByDataFilter(
    params: ParamsResourceSpreadsheetsValuesBatchgetbydatafilter,
    options: BodyResponseCallback[Readable | SchemaBatchGetValuesByDataFilterResponse],
    callback: BodyResponseCallback[Readable | SchemaBatchGetValuesByDataFilterResponse]
  ): Unit = js.native
  def batchGetByDataFilter(params: ParamsResourceSpreadsheetsValuesBatchgetbydatafilter, options: MethodOptions): GaxiosPromise[SchemaBatchGetValuesByDataFilterResponse] = js.native
  def batchGetByDataFilter(
    params: ParamsResourceSpreadsheetsValuesBatchgetbydatafilter,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaBatchGetValuesByDataFilterResponse]
  ): Unit = js.native
  /**
    * Returns one or more ranges of values that match the specified data filters. The caller must specify the spreadsheet ID and one or more DataFilters. Ranges that match any of the data filters in the request will be returned.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/sheets.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const sheets = google.sheets('v4');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/drive',
    *       'https://www.googleapis.com/auth/drive.file',
    *       'https://www.googleapis.com/auth/spreadsheets',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await sheets.spreadsheets.values.batchGetByDataFilter({
    *     // The ID of the spreadsheet to retrieve data from.
    *     spreadsheetId: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "dataFilters": [],
    *       //   "dateTimeRenderOption": "my_dateTimeRenderOption",
    *       //   "majorDimension": "my_majorDimension",
    *       //   "valueRenderOption": "my_valueRenderOption"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "spreadsheetId": "my_spreadsheetId",
    *   //   "valueRanges": []
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
  def batchGetByDataFilter(params: ParamsResourceSpreadsheetsValuesBatchgetbydatafilter, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def batchGetByDataFilter(
    params: ParamsResourceSpreadsheetsValuesBatchgetbydatafilter,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def batchUpdate(): GaxiosPromise[SchemaBatchUpdateValuesResponse] = js.native
  def batchUpdate(callback: BodyResponseCallback[SchemaBatchUpdateValuesResponse]): Unit = js.native
  def batchUpdate(params: Unit, options: MethodOptions): GaxiosPromise[SchemaBatchUpdateValuesResponse] = js.native
  def batchUpdate(params: ParamsResourceSpreadsheetsValuesBatchupdate): GaxiosPromise[SchemaBatchUpdateValuesResponse] = js.native
  def batchUpdate(
    params: ParamsResourceSpreadsheetsValuesBatchupdate,
    callback: BodyResponseCallback[SchemaBatchUpdateValuesResponse]
  ): Unit = js.native
  def batchUpdate(
    params: ParamsResourceSpreadsheetsValuesBatchupdate,
    options: BodyResponseCallback[Readable | SchemaBatchUpdateValuesResponse],
    callback: BodyResponseCallback[Readable | SchemaBatchUpdateValuesResponse]
  ): Unit = js.native
  def batchUpdate(params: ParamsResourceSpreadsheetsValuesBatchupdate, options: MethodOptions): GaxiosPromise[SchemaBatchUpdateValuesResponse] = js.native
  def batchUpdate(
    params: ParamsResourceSpreadsheetsValuesBatchupdate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaBatchUpdateValuesResponse]
  ): Unit = js.native
  /**
    * Sets values in one or more ranges of a spreadsheet. The caller must specify the spreadsheet ID, a valueInputOption, and one or more ValueRanges.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/sheets.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const sheets = google.sheets('v4');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/drive',
    *       'https://www.googleapis.com/auth/drive.file',
    *       'https://www.googleapis.com/auth/spreadsheets',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await sheets.spreadsheets.values.batchUpdate({
    *     // The ID of the spreadsheet to update.
    *     spreadsheetId: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "data": [],
    *       //   "includeValuesInResponse": false,
    *       //   "responseDateTimeRenderOption": "my_responseDateTimeRenderOption",
    *       //   "responseValueRenderOption": "my_responseValueRenderOption",
    *       //   "valueInputOption": "my_valueInputOption"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "responses": [],
    *   //   "spreadsheetId": "my_spreadsheetId",
    *   //   "totalUpdatedCells": 0,
    *   //   "totalUpdatedColumns": 0,
    *   //   "totalUpdatedRows": 0,
    *   //   "totalUpdatedSheets": 0
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
  def batchUpdate(params: ParamsResourceSpreadsheetsValuesBatchupdate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def batchUpdate(
    params: ParamsResourceSpreadsheetsValuesBatchupdate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def batchUpdateByDataFilter(): GaxiosPromise[SchemaBatchUpdateValuesByDataFilterResponse] = js.native
  def batchUpdateByDataFilter(callback: BodyResponseCallback[SchemaBatchUpdateValuesByDataFilterResponse]): Unit = js.native
  def batchUpdateByDataFilter(params: Unit, options: MethodOptions): GaxiosPromise[SchemaBatchUpdateValuesByDataFilterResponse] = js.native
  def batchUpdateByDataFilter(params: ParamsResourceSpreadsheetsValuesBatchupdatebydatafilter): GaxiosPromise[SchemaBatchUpdateValuesByDataFilterResponse] = js.native
  def batchUpdateByDataFilter(
    params: ParamsResourceSpreadsheetsValuesBatchupdatebydatafilter,
    callback: BodyResponseCallback[SchemaBatchUpdateValuesByDataFilterResponse]
  ): Unit = js.native
  def batchUpdateByDataFilter(
    params: ParamsResourceSpreadsheetsValuesBatchupdatebydatafilter,
    options: BodyResponseCallback[Readable | SchemaBatchUpdateValuesByDataFilterResponse],
    callback: BodyResponseCallback[Readable | SchemaBatchUpdateValuesByDataFilterResponse]
  ): Unit = js.native
  def batchUpdateByDataFilter(params: ParamsResourceSpreadsheetsValuesBatchupdatebydatafilter, options: MethodOptions): GaxiosPromise[SchemaBatchUpdateValuesByDataFilterResponse] = js.native
  def batchUpdateByDataFilter(
    params: ParamsResourceSpreadsheetsValuesBatchupdatebydatafilter,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaBatchUpdateValuesByDataFilterResponse]
  ): Unit = js.native
  /**
    * Sets values in one or more ranges of a spreadsheet. The caller must specify the spreadsheet ID, a valueInputOption, and one or more DataFilterValueRanges.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/sheets.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const sheets = google.sheets('v4');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/drive',
    *       'https://www.googleapis.com/auth/drive.file',
    *       'https://www.googleapis.com/auth/spreadsheets',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await sheets.spreadsheets.values.batchUpdateByDataFilter({
    *     // The ID of the spreadsheet to update.
    *     spreadsheetId: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "data": [],
    *       //   "includeValuesInResponse": false,
    *       //   "responseDateTimeRenderOption": "my_responseDateTimeRenderOption",
    *       //   "responseValueRenderOption": "my_responseValueRenderOption",
    *       //   "valueInputOption": "my_valueInputOption"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "responses": [],
    *   //   "spreadsheetId": "my_spreadsheetId",
    *   //   "totalUpdatedCells": 0,
    *   //   "totalUpdatedColumns": 0,
    *   //   "totalUpdatedRows": 0,
    *   //   "totalUpdatedSheets": 0
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
  def batchUpdateByDataFilter(params: ParamsResourceSpreadsheetsValuesBatchupdatebydatafilter, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def batchUpdateByDataFilter(
    params: ParamsResourceSpreadsheetsValuesBatchupdatebydatafilter,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def clear(): GaxiosPromise[SchemaClearValuesResponse] = js.native
  def clear(callback: BodyResponseCallback[SchemaClearValuesResponse]): Unit = js.native
  def clear(params: Unit, options: MethodOptions): GaxiosPromise[SchemaClearValuesResponse] = js.native
  def clear(params: ParamsResourceSpreadsheetsValuesClear): GaxiosPromise[SchemaClearValuesResponse] = js.native
  def clear(
    params: ParamsResourceSpreadsheetsValuesClear,
    callback: BodyResponseCallback[SchemaClearValuesResponse]
  ): Unit = js.native
  def clear(
    params: ParamsResourceSpreadsheetsValuesClear,
    options: BodyResponseCallback[Readable | SchemaClearValuesResponse],
    callback: BodyResponseCallback[Readable | SchemaClearValuesResponse]
  ): Unit = js.native
  def clear(params: ParamsResourceSpreadsheetsValuesClear, options: MethodOptions): GaxiosPromise[SchemaClearValuesResponse] = js.native
  def clear(
    params: ParamsResourceSpreadsheetsValuesClear,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaClearValuesResponse]
  ): Unit = js.native
  /**
    * Clears values from a spreadsheet. The caller must specify the spreadsheet ID and range. Only values are cleared -- all other properties of the cell (such as formatting, data validation, etc..) are kept.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/sheets.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const sheets = google.sheets('v4');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/drive',
    *       'https://www.googleapis.com/auth/drive.file',
    *       'https://www.googleapis.com/auth/spreadsheets',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await sheets.spreadsheets.values.clear({
    *     // The [A1 notation or R1C1 notation](/sheets/api/guides/concepts#cell) of the values to clear.
    *     range: 'placeholder-value',
    *     // The ID of the spreadsheet to update.
    *     spreadsheetId: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {}
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "clearedRange": "my_clearedRange",
    *   //   "spreadsheetId": "my_spreadsheetId"
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
  def clear(params: ParamsResourceSpreadsheetsValuesClear, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def clear(
    params: ParamsResourceSpreadsheetsValuesClear,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  var context: APIRequestContext = js.native
  
  def get(): GaxiosPromise[SchemaValueRange] = js.native
  def get(callback: BodyResponseCallback[SchemaValueRange]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaValueRange] = js.native
  def get(params: ParamsResourceSpreadsheetsValuesGet): GaxiosPromise[SchemaValueRange] = js.native
  def get(params: ParamsResourceSpreadsheetsValuesGet, callback: BodyResponseCallback[SchemaValueRange]): Unit = js.native
  def get(
    params: ParamsResourceSpreadsheetsValuesGet,
    options: BodyResponseCallback[Readable | SchemaValueRange],
    callback: BodyResponseCallback[Readable | SchemaValueRange]
  ): Unit = js.native
  def get(params: ParamsResourceSpreadsheetsValuesGet, options: MethodOptions): GaxiosPromise[SchemaValueRange] = js.native
  def get(
    params: ParamsResourceSpreadsheetsValuesGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaValueRange]
  ): Unit = js.native
  /**
    * Returns a range of values from a spreadsheet. The caller must specify the spreadsheet ID and a range.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/sheets.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const sheets = google.sheets('v4');
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
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await sheets.spreadsheets.values.get({
    *     // How dates, times, and durations should be represented in the output. This is ignored if value_render_option is FORMATTED_VALUE. The default dateTime render option is SERIAL_NUMBER.
    *     dateTimeRenderOption: 'placeholder-value',
    *     // The major dimension that results should use. For example, if the spreadsheet data is: `A1=1,B1=2,A2=3,B2=4`, then requesting `range=A1:B2,majorDimension=ROWS` returns `[[1,2],[3,4]]`, whereas requesting `range=A1:B2,majorDimension=COLUMNS` returns `[[1,3],[2,4]]`.
    *     majorDimension: 'placeholder-value',
    *     // The [A1 notation or R1C1 notation](/sheets/api/guides/concepts#cell) of the range to retrieve values from.
    *     range: 'placeholder-value',
    *     // The ID of the spreadsheet to retrieve data from.
    *     spreadsheetId: 'placeholder-value',
    *     // How values should be represented in the output. The default render option is FORMATTED_VALUE.
    *     valueRenderOption: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "majorDimension": "my_majorDimension",
    *   //   "range": "my_range",
    *   //   "values": []
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
  def get(params: ParamsResourceSpreadsheetsValuesGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceSpreadsheetsValuesGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def update(): GaxiosPromise[SchemaUpdateValuesResponse] = js.native
  def update(callback: BodyResponseCallback[SchemaUpdateValuesResponse]): Unit = js.native
  def update(params: Unit, options: MethodOptions): GaxiosPromise[SchemaUpdateValuesResponse] = js.native
  def update(params: ParamsResourceSpreadsheetsValuesUpdate): GaxiosPromise[SchemaUpdateValuesResponse] = js.native
  def update(
    params: ParamsResourceSpreadsheetsValuesUpdate,
    callback: BodyResponseCallback[SchemaUpdateValuesResponse]
  ): Unit = js.native
  def update(
    params: ParamsResourceSpreadsheetsValuesUpdate,
    options: BodyResponseCallback[Readable | SchemaUpdateValuesResponse],
    callback: BodyResponseCallback[Readable | SchemaUpdateValuesResponse]
  ): Unit = js.native
  def update(params: ParamsResourceSpreadsheetsValuesUpdate, options: MethodOptions): GaxiosPromise[SchemaUpdateValuesResponse] = js.native
  def update(
    params: ParamsResourceSpreadsheetsValuesUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaUpdateValuesResponse]
  ): Unit = js.native
  /**
    * Sets values in a range of a spreadsheet. The caller must specify the spreadsheet ID, range, and a valueInputOption.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/sheets.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const sheets = google.sheets('v4');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/drive',
    *       'https://www.googleapis.com/auth/drive.file',
    *       'https://www.googleapis.com/auth/spreadsheets',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await sheets.spreadsheets.values.update({
    *     // Determines if the update response should include the values of the cells that were updated. By default, responses do not include the updated values. If the range to write was larger than the range actually written, the response includes all values in the requested range (excluding trailing empty rows and columns).
    *     includeValuesInResponse: 'placeholder-value',
    *     // The [A1 notation](/sheets/api/guides/concepts#cell) of the values to update.
    *     range: 'placeholder-value',
    *     // Determines how dates, times, and durations in the response should be rendered. This is ignored if response_value_render_option is FORMATTED_VALUE. The default dateTime render option is SERIAL_NUMBER.
    *     responseDateTimeRenderOption: 'placeholder-value',
    *     // Determines how values in the response should be rendered. The default render option is FORMATTED_VALUE.
    *     responseValueRenderOption: 'placeholder-value',
    *     // The ID of the spreadsheet to update.
    *     spreadsheetId: 'placeholder-value',
    *     // How the input data should be interpreted.
    *     valueInputOption: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "majorDimension": "my_majorDimension",
    *       //   "range": "my_range",
    *       //   "values": []
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "spreadsheetId": "my_spreadsheetId",
    *   //   "updatedCells": 0,
    *   //   "updatedColumns": 0,
    *   //   "updatedData": {},
    *   //   "updatedRange": "my_updatedRange",
    *   //   "updatedRows": 0
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
  def update(params: ParamsResourceSpreadsheetsValuesUpdate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def update(
    params: ParamsResourceSpreadsheetsValuesUpdate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
