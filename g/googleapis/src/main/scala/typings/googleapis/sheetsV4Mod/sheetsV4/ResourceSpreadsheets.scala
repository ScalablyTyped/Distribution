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

@JSImport("googleapis/build/src/apis/sheets/v4", "sheets_v4.Resource$Spreadsheets")
@js.native
open class ResourceSpreadsheets protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  def batchUpdate(): GaxiosPromise[SchemaBatchUpdateSpreadsheetResponse] = js.native
  def batchUpdate(callback: BodyResponseCallback[SchemaBatchUpdateSpreadsheetResponse]): Unit = js.native
  def batchUpdate(params: Unit, options: MethodOptions): GaxiosPromise[SchemaBatchUpdateSpreadsheetResponse] = js.native
  def batchUpdate(params: ParamsResourceSpreadsheetsBatchupdate): GaxiosPromise[SchemaBatchUpdateSpreadsheetResponse] = js.native
  def batchUpdate(
    params: ParamsResourceSpreadsheetsBatchupdate,
    callback: BodyResponseCallback[SchemaBatchUpdateSpreadsheetResponse]
  ): Unit = js.native
  def batchUpdate(
    params: ParamsResourceSpreadsheetsBatchupdate,
    options: BodyResponseCallback[Readable | SchemaBatchUpdateSpreadsheetResponse],
    callback: BodyResponseCallback[Readable | SchemaBatchUpdateSpreadsheetResponse]
  ): Unit = js.native
  def batchUpdate(params: ParamsResourceSpreadsheetsBatchupdate, options: MethodOptions): GaxiosPromise[SchemaBatchUpdateSpreadsheetResponse] = js.native
  def batchUpdate(
    params: ParamsResourceSpreadsheetsBatchupdate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaBatchUpdateSpreadsheetResponse]
  ): Unit = js.native
  /**
    * Applies one or more updates to the spreadsheet. Each request is validated before being applied. If any request is not valid then the entire request will fail and nothing will be applied. Some requests have replies to give you some information about how they are applied. The replies will mirror the requests. For example, if you applied 4 updates and the 3rd one had a reply, then the response will have 2 empty replies, the actual reply, and another empty reply, in that order. Due to the collaborative nature of spreadsheets, it is not guaranteed that the spreadsheet will reflect exactly your changes after this completes, however it is guaranteed that the updates in the request will be applied together atomically. Your changes may be altered with respect to collaborator changes. If there are no collaborators, the spreadsheet should reflect your changes.
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
    *   const res = await sheets.spreadsheets.batchUpdate({
    *     // The spreadsheet to apply the updates to.
    *     spreadsheetId: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "includeSpreadsheetInResponse": false,
    *       //   "requests": [],
    *       //   "responseIncludeGridData": false,
    *       //   "responseRanges": []
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "replies": [],
    *   //   "spreadsheetId": "my_spreadsheetId",
    *   //   "updatedSpreadsheet": {}
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
  def batchUpdate(params: ParamsResourceSpreadsheetsBatchupdate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def batchUpdate(
    params: ParamsResourceSpreadsheetsBatchupdate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  var context: APIRequestContext = js.native
  
  def create(): GaxiosPromise[SchemaSpreadsheet] = js.native
  def create(callback: BodyResponseCallback[SchemaSpreadsheet]): Unit = js.native
  def create(params: Unit, options: MethodOptions): GaxiosPromise[SchemaSpreadsheet] = js.native
  def create(params: ParamsResourceSpreadsheetsCreate): GaxiosPromise[SchemaSpreadsheet] = js.native
  def create(params: ParamsResourceSpreadsheetsCreate, callback: BodyResponseCallback[SchemaSpreadsheet]): Unit = js.native
  def create(
    params: ParamsResourceSpreadsheetsCreate,
    options: BodyResponseCallback[Readable | SchemaSpreadsheet],
    callback: BodyResponseCallback[Readable | SchemaSpreadsheet]
  ): Unit = js.native
  def create(params: ParamsResourceSpreadsheetsCreate, options: MethodOptions): GaxiosPromise[SchemaSpreadsheet] = js.native
  def create(
    params: ParamsResourceSpreadsheetsCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaSpreadsheet]
  ): Unit = js.native
  /**
    * Creates a spreadsheet, returning the newly created spreadsheet.
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
    *   const res = await sheets.spreadsheets.create({
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "dataSourceSchedules": [],
    *       //   "dataSources": [],
    *       //   "developerMetadata": [],
    *       //   "namedRanges": [],
    *       //   "properties": {},
    *       //   "sheets": [],
    *       //   "spreadsheetId": "my_spreadsheetId",
    *       //   "spreadsheetUrl": "my_spreadsheetUrl"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "dataSourceSchedules": [],
    *   //   "dataSources": [],
    *   //   "developerMetadata": [],
    *   //   "namedRanges": [],
    *   //   "properties": {},
    *   //   "sheets": [],
    *   //   "spreadsheetId": "my_spreadsheetId",
    *   //   "spreadsheetUrl": "my_spreadsheetUrl"
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
  def create(params: ParamsResourceSpreadsheetsCreate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def create(
    params: ParamsResourceSpreadsheetsCreate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  var developerMetadata: ResourceSpreadsheetsDevelopermetadata = js.native
  
  def get(): GaxiosPromise[SchemaSpreadsheet] = js.native
  def get(callback: BodyResponseCallback[SchemaSpreadsheet]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaSpreadsheet] = js.native
  def get(params: ParamsResourceSpreadsheetsGet): GaxiosPromise[SchemaSpreadsheet] = js.native
  def get(params: ParamsResourceSpreadsheetsGet, callback: BodyResponseCallback[SchemaSpreadsheet]): Unit = js.native
  def get(
    params: ParamsResourceSpreadsheetsGet,
    options: BodyResponseCallback[Readable | SchemaSpreadsheet],
    callback: BodyResponseCallback[Readable | SchemaSpreadsheet]
  ): Unit = js.native
  def get(params: ParamsResourceSpreadsheetsGet, options: MethodOptions): GaxiosPromise[SchemaSpreadsheet] = js.native
  def get(
    params: ParamsResourceSpreadsheetsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaSpreadsheet]
  ): Unit = js.native
  /**
    * Returns the spreadsheet at the given ID. The caller must specify the spreadsheet ID. By default, data within grids is not returned. You can include grid data in one of 2 ways: * Specify a field mask listing your desired fields using the `fields` URL parameter in HTTP * Set the includeGridData URL parameter to true. If a field mask is set, the `includeGridData` parameter is ignored For large spreadsheets, as a best practice, retrieve only the specific spreadsheet fields that you want. To retrieve only subsets of spreadsheet data, use the ranges URL parameter. Ranges are specified using [A1 notation](/sheets/api/guides/concepts#cell). You can define a single cell (for example, `A1`) or multiple cells (for example, `A1:D5`). You can also get cells from other sheets within the same spreadsheet (for example, `Sheet2!A1:C4`) or retrieve multiple ranges at once (for example, `?ranges=A1:D5&ranges=Sheet2!A1:C4`). Limiting the range returns only the portions of the spreadsheet that intersect the requested ranges.
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
    *   const res = await sheets.spreadsheets.get({
    *     // True if grid data should be returned. This parameter is ignored if a field mask was set in the request.
    *     includeGridData: 'placeholder-value',
    *     // The ranges to retrieve from the spreadsheet.
    *     ranges: 'placeholder-value',
    *     // The spreadsheet to request.
    *     spreadsheetId: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "dataSourceSchedules": [],
    *   //   "dataSources": [],
    *   //   "developerMetadata": [],
    *   //   "namedRanges": [],
    *   //   "properties": {},
    *   //   "sheets": [],
    *   //   "spreadsheetId": "my_spreadsheetId",
    *   //   "spreadsheetUrl": "my_spreadsheetUrl"
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
  def get(params: ParamsResourceSpreadsheetsGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceSpreadsheetsGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def getByDataFilter(): GaxiosPromise[SchemaSpreadsheet] = js.native
  def getByDataFilter(callback: BodyResponseCallback[SchemaSpreadsheet]): Unit = js.native
  def getByDataFilter(params: Unit, options: MethodOptions): GaxiosPromise[SchemaSpreadsheet] = js.native
  def getByDataFilter(params: ParamsResourceSpreadsheetsGetbydatafilter): GaxiosPromise[SchemaSpreadsheet] = js.native
  def getByDataFilter(
    params: ParamsResourceSpreadsheetsGetbydatafilter,
    callback: BodyResponseCallback[SchemaSpreadsheet]
  ): Unit = js.native
  def getByDataFilter(
    params: ParamsResourceSpreadsheetsGetbydatafilter,
    options: BodyResponseCallback[Readable | SchemaSpreadsheet],
    callback: BodyResponseCallback[Readable | SchemaSpreadsheet]
  ): Unit = js.native
  def getByDataFilter(params: ParamsResourceSpreadsheetsGetbydatafilter, options: MethodOptions): GaxiosPromise[SchemaSpreadsheet] = js.native
  def getByDataFilter(
    params: ParamsResourceSpreadsheetsGetbydatafilter,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaSpreadsheet]
  ): Unit = js.native
  /**
    * Returns the spreadsheet at the given ID. The caller must specify the spreadsheet ID. This method differs from GetSpreadsheet in that it allows selecting which subsets of spreadsheet data to return by specifying a dataFilters parameter. Multiple DataFilters can be specified. Specifying one or more data filters returns the portions of the spreadsheet that intersect ranges matched by any of the filters. By default, data within grids is not returned. You can include grid data one of 2 ways: * Specify a field mask listing your desired fields using the `fields` URL parameter in HTTP * Set the includeGridData parameter to true. If a field mask is set, the `includeGridData` parameter is ignored For large spreadsheets, as a best practice, retrieve only the specific spreadsheet fields that you want.
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
    *   const res = await sheets.spreadsheets.getByDataFilter({
    *     // The spreadsheet to request.
    *     spreadsheetId: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "dataFilters": [],
    *       //   "includeGridData": false
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "dataSourceSchedules": [],
    *   //   "dataSources": [],
    *   //   "developerMetadata": [],
    *   //   "namedRanges": [],
    *   //   "properties": {},
    *   //   "sheets": [],
    *   //   "spreadsheetId": "my_spreadsheetId",
    *   //   "spreadsheetUrl": "my_spreadsheetUrl"
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
  def getByDataFilter(params: ParamsResourceSpreadsheetsGetbydatafilter, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def getByDataFilter(
    params: ParamsResourceSpreadsheetsGetbydatafilter,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  var sheets: ResourceSpreadsheetsSheets = js.native
  
  var values: ResourceSpreadsheetsValues = js.native
}
