package typings.googleapis.sheetsV4Mod.sheetsV4

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/sheets/v4", "sheets_v4.Resource$Spreadsheets")
@js.native
class ResourceSpreadsheets protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  var developerMetadata: ResourceSpreadsheetsDevelopermetadata = js.native
  var sheets: ResourceSpreadsheetsSheets = js.native
  var values: ResourceSpreadsheetsValues = js.native
  /**
    * sheets.spreadsheets.batchUpdate
    * @desc Applies one or more updates to the spreadsheet.  Each request is
    * validated before being applied. If any request is not valid then the
    * entire request will fail and nothing will be applied.  Some requests have
    * replies to give you some information about how they are applied. The
    * replies will mirror the requests.  For example, if you applied 4 updates
    * and the 3rd one had a reply, then the response will have 2 empty replies,
    * the actual reply, and another empty reply, in that order.  Due to the
    * collaborative nature of spreadsheets, it is not guaranteed that the
    * spreadsheet will reflect exactly your changes after this completes,
    * however it is guaranteed that the updates in the request will be applied
    * together atomically. Your changes may be altered with respect to
    * collaborator changes. If there are no collaborators, the spreadsheet
    * should reflect your changes.
    * @example
    * * // BEFORE RUNNING:
    * // ---------------
    * // 1. If not already done, enable the Google Sheets API
    * //    and check the quota for your project at
    * //    https://console.developers.google.com/apis/api/sheets
    * // 2. Install the Node.js client library by running
    * //    `npm install googleapis --save`
    *
    * var google = require('googleapis');
    * var sheets = google.sheets('v4');
    *
    * authorize(function(authClient) {
    *   var request = {
    *     // The spreadsheet to apply the updates to.
    *     spreadsheetId: 'my-spreadsheet-id',  // TODO: Update placeholder
    * value.
    *
    *     resource: {
    *       // A list of updates to apply to the spreadsheet.
    *       // Requests will be applied in the order they are specified.
    *       // If any request is not valid, no requests will be applied.
    *       requests: [],  // TODO: Update placeholder value.
    *
    *       // TODO: Add desired properties to the request body.
    *     },
    *
    *     auth: authClient,
    *   };
    *
    *   sheets.spreadsheets.batchUpdate(request, function(err, response) {
    *     if (err) {
    *       console.error(err);
    *       return;
    *     }
    *
    *     // TODO: Change code below to process the `response` object:
    *     console.log(JSON.stringify(response, null, 2));
    *   });
    * });
    *
    * function authorize(callback) {
    *   // TODO: Change placeholder below to generate authentication
    * credentials. See
    *   //
    * https://developers.google.com/sheets/quickstart/nodejs#step_3_set_up_the_sample
    *   //
    *   // Authorize using one of the following scopes:
    *   //   'https://www.googleapis.com/auth/drive'
    *   //   'https://www.googleapis.com/auth/drive.file'
    *   //   'https://www.googleapis.com/auth/spreadsheets'
    *   var authClient = null;
    *
    *   if (authClient == null) {
    *     console.log('authentication failed');
    *     return;
    *   }
    *   callback(authClient);
    * }
    * @alias sheets.spreadsheets.batchUpdate
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.spreadsheetId The spreadsheet to apply the updates to.
    * @param {().BatchUpdateSpreadsheetRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def batchUpdate(): GaxiosPromise[SchemaBatchUpdateSpreadsheetResponse] = js.native
  def batchUpdate(callback: BodyResponseCallback[SchemaBatchUpdateSpreadsheetResponse]): Unit = js.native
  def batchUpdate(params: ParamsResourceSpreadsheetsBatchupdate): GaxiosPromise[SchemaBatchUpdateSpreadsheetResponse] = js.native
  def batchUpdate(
    params: ParamsResourceSpreadsheetsBatchupdate,
    callback: BodyResponseCallback[SchemaBatchUpdateSpreadsheetResponse]
  ): Unit = js.native
  def batchUpdate(
    params: ParamsResourceSpreadsheetsBatchupdate,
    options: BodyResponseCallback[SchemaBatchUpdateSpreadsheetResponse],
    callback: BodyResponseCallback[SchemaBatchUpdateSpreadsheetResponse]
  ): Unit = js.native
  def batchUpdate(params: ParamsResourceSpreadsheetsBatchupdate, options: MethodOptions): GaxiosPromise[SchemaBatchUpdateSpreadsheetResponse] = js.native
  def batchUpdate(
    params: ParamsResourceSpreadsheetsBatchupdate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaBatchUpdateSpreadsheetResponse]
  ): Unit = js.native
  /**
    * sheets.spreadsheets.create
    * @desc Creates a spreadsheet, returning the newly created spreadsheet.
    * @example
    * * // BEFORE RUNNING:
    * // ---------------
    * // 1. If not already done, enable the Google Sheets API
    * //    and check the quota for your project at
    * //    https://console.developers.google.com/apis/api/sheets
    * // 2. Install the Node.js client library by running
    * //    `npm install googleapis --save`
    *
    * var google = require('googleapis');
    * var sheets = google.sheets('v4');
    *
    * authorize(function(authClient) {
    *   var request = {
    *     resource: {
    *       // TODO: Add desired properties to the request body.
    *     },
    *
    *     auth: authClient,
    *   };
    *
    *   sheets.spreadsheets.create(request, function(err, response) {
    *     if (err) {
    *       console.error(err);
    *       return;
    *     }
    *
    *     // TODO: Change code below to process the `response` object:
    *     console.log(JSON.stringify(response, null, 2));
    *   });
    * });
    *
    * function authorize(callback) {
    *   // TODO: Change placeholder below to generate authentication
    * credentials. See
    *   //
    * https://developers.google.com/sheets/quickstart/nodejs#step_3_set_up_the_sample
    *   //
    *   // Authorize using one of the following scopes:
    *   //   'https://www.googleapis.com/auth/drive'
    *   //   'https://www.googleapis.com/auth/drive.file'
    *   //   'https://www.googleapis.com/auth/spreadsheets'
    *   var authClient = null;
    *
    *   if (authClient == null) {
    *     console.log('authentication failed');
    *     return;
    *   }
    *   callback(authClient);
    * }
    * @alias sheets.spreadsheets.create
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {().Spreadsheet} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def create(): GaxiosPromise[SchemaSpreadsheet] = js.native
  def create(callback: BodyResponseCallback[SchemaSpreadsheet]): Unit = js.native
  def create(params: ParamsResourceSpreadsheetsCreate): GaxiosPromise[SchemaSpreadsheet] = js.native
  def create(params: ParamsResourceSpreadsheetsCreate, callback: BodyResponseCallback[SchemaSpreadsheet]): Unit = js.native
  def create(
    params: ParamsResourceSpreadsheetsCreate,
    options: BodyResponseCallback[SchemaSpreadsheet],
    callback: BodyResponseCallback[SchemaSpreadsheet]
  ): Unit = js.native
  def create(params: ParamsResourceSpreadsheetsCreate, options: MethodOptions): GaxiosPromise[SchemaSpreadsheet] = js.native
  def create(
    params: ParamsResourceSpreadsheetsCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaSpreadsheet]
  ): Unit = js.native
  /**
    * sheets.spreadsheets.get
    * @desc Returns the spreadsheet at the given ID. The caller must specify
    * the spreadsheet ID.  By default, data within grids will not be returned.
    * You can include grid data one of two ways:  * Specify a field mask
    * listing your desired fields using the `fields` URL parameter in HTTP  *
    * Set the includeGridData URL parameter to true.  If a field mask is set,
    * the `includeGridData` parameter is ignored  For large spreadsheets, it is
    * recommended to retrieve only the specific fields of the spreadsheet that
    * you want.  To retrieve only subsets of the spreadsheet, use the ranges
    * URL parameter. Multiple ranges can be specified.  Limiting the range will
    * return only the portions of the spreadsheet that intersect the requested
    * ranges. Ranges are specified using A1 notation.
    * @example
    * * // BEFORE RUNNING:
    * // ---------------
    * // 1. If not already done, enable the Google Sheets API
    * //    and check the quota for your project at
    * //    https://console.developers.google.com/apis/api/sheets
    * // 2. Install the Node.js client library by running
    * //    `npm install googleapis --save`
    *
    * var google = require('googleapis');
    * var sheets = google.sheets('v4');
    *
    * authorize(function(authClient) {
    *   var request = {
    *     // The spreadsheet to request.
    *     spreadsheetId: 'my-spreadsheet-id',  // TODO: Update placeholder
    * value.
    *
    *     // The ranges to retrieve from the spreadsheet.
    *     ranges: [],  // TODO: Update placeholder value.
    *
    *     // True if grid data should be returned.
    *     // This parameter is ignored if a field mask was set in the request.
    *     includeGridData: false,  // TODO: Update placeholder value.
    *
    *     auth: authClient,
    *   };
    *
    *   sheets.spreadsheets.get(request, function(err, response) {
    *     if (err) {
    *       console.error(err);
    *       return;
    *     }
    *
    *     // TODO: Change code below to process the `response` object:
    *     console.log(JSON.stringify(response, null, 2));
    *   });
    * });
    *
    * function authorize(callback) {
    *   // TODO: Change placeholder below to generate authentication
    * credentials. See
    *   //
    * https://developers.google.com/sheets/quickstart/nodejs#step_3_set_up_the_sample
    *   //
    *   // Authorize using one of the following scopes:
    *   //   'https://www.googleapis.com/auth/drive'
    *   //   'https://www.googleapis.com/auth/drive.file'
    *   //   'https://www.googleapis.com/auth/drive.readonly'
    *   //   'https://www.googleapis.com/auth/spreadsheets'
    *   //   'https://www.googleapis.com/auth/spreadsheets.readonly'
    *   var authClient = null;
    *
    *   if (authClient == null) {
    *     console.log('authentication failed');
    *     return;
    *   }
    *   callback(authClient);
    * }
    * @alias sheets.spreadsheets.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {boolean=} params.includeGridData True if grid data should be returned. This parameter is ignored if a field mask was set in the request.
    * @param {string=} params.ranges The ranges to retrieve from the spreadsheet.
    * @param {string} params.spreadsheetId The spreadsheet to request.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaSpreadsheet] = js.native
  def get(callback: BodyResponseCallback[SchemaSpreadsheet]): Unit = js.native
  def get(params: ParamsResourceSpreadsheetsGet): GaxiosPromise[SchemaSpreadsheet] = js.native
  def get(params: ParamsResourceSpreadsheetsGet, callback: BodyResponseCallback[SchemaSpreadsheet]): Unit = js.native
  def get(
    params: ParamsResourceSpreadsheetsGet,
    options: BodyResponseCallback[SchemaSpreadsheet],
    callback: BodyResponseCallback[SchemaSpreadsheet]
  ): Unit = js.native
  def get(params: ParamsResourceSpreadsheetsGet, options: MethodOptions): GaxiosPromise[SchemaSpreadsheet] = js.native
  def get(
    params: ParamsResourceSpreadsheetsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaSpreadsheet]
  ): Unit = js.native
  /**
    * sheets.spreadsheets.getByDataFilter
    * @desc Returns the spreadsheet at the given ID. The caller must specify
    * the spreadsheet ID.  This method differs from GetSpreadsheet in that it
    * allows selecting which subsets of spreadsheet data to return by
    * specifying a dataFilters parameter. Multiple DataFilters can be
    * specified.  Specifying one or more data filters will return the portions
    * of the spreadsheet that intersect ranges matched by any of the filters.
    * By default, data within grids will not be returned. You can include grid
    * data one of two ways:  * Specify a field mask listing your desired fields
    * using the `fields` URL parameter in HTTP  * Set the includeGridData
    * parameter to true.  If a field mask is set, the `includeGridData`
    * parameter is ignored  For large spreadsheets, it is recommended to
    * retrieve only the specific fields of the spreadsheet that you want.
    * @example
    * * // BEFORE RUNNING:
    * // ---------------
    * // 1. If not already done, enable the Google Sheets API
    * //    and check the quota for your project at
    * //    https://console.developers.google.com/apis/api/sheets
    * // 2. Install the Node.js client library by running
    * //    `npm install googleapis --save`
    *
    * var google = require('googleapis');
    * var sheets = google.sheets('v4');
    *
    * authorize(function(authClient) {
    *   var request = {
    *     // The spreadsheet to request.
    *     spreadsheetId: 'my-spreadsheet-id',  // TODO: Update placeholder
    * value.
    *
    *     resource: {
    *       // The DataFilters used to select which ranges to retrieve from
    *       // the spreadsheet.
    *       dataFilters: [],  // TODO: Update placeholder value.
    *
    *       // True if grid data should be returned.
    *       // This parameter is ignored if a field mask was set in the
    * request. includeGridData: false,  // TODO: Update placeholder value.
    *
    *       // TODO: Add desired properties to the request body.
    *     },
    *
    *     auth: authClient,
    *   };
    *
    *   sheets.spreadsheets.getByDataFilter(request, function(err, response) {
    *     if (err) {
    *       console.error(err);
    *       return;
    *     }
    *
    *     // TODO: Change code below to process the `response` object:
    *     console.log(JSON.stringify(response, null, 2));
    *   });
    * });
    *
    * function authorize(callback) {
    *   // TODO: Change placeholder below to generate authentication
    * credentials. See
    *   //
    * https://developers.google.com/sheets/quickstart/nodejs#step_3_set_up_the_sample
    *   //
    *   // Authorize using one of the following scopes:
    *   //   'https://www.googleapis.com/auth/drive'
    *   //   'https://www.googleapis.com/auth/drive.file'
    *   //   'https://www.googleapis.com/auth/spreadsheets'
    *   var authClient = null;
    *
    *   if (authClient == null) {
    *     console.log('authentication failed');
    *     return;
    *   }
    *   callback(authClient);
    * }
    * @alias sheets.spreadsheets.getByDataFilter
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.spreadsheetId The spreadsheet to request.
    * @param {().GetSpreadsheetByDataFilterRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def getByDataFilter(): GaxiosPromise[SchemaSpreadsheet] = js.native
  def getByDataFilter(callback: BodyResponseCallback[SchemaSpreadsheet]): Unit = js.native
  def getByDataFilter(params: ParamsResourceSpreadsheetsGetbydatafilter): GaxiosPromise[SchemaSpreadsheet] = js.native
  def getByDataFilter(
    params: ParamsResourceSpreadsheetsGetbydatafilter,
    callback: BodyResponseCallback[SchemaSpreadsheet]
  ): Unit = js.native
  def getByDataFilter(
    params: ParamsResourceSpreadsheetsGetbydatafilter,
    options: BodyResponseCallback[SchemaSpreadsheet],
    callback: BodyResponseCallback[SchemaSpreadsheet]
  ): Unit = js.native
  def getByDataFilter(params: ParamsResourceSpreadsheetsGetbydatafilter, options: MethodOptions): GaxiosPromise[SchemaSpreadsheet] = js.native
  def getByDataFilter(
    params: ParamsResourceSpreadsheetsGetbydatafilter,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaSpreadsheet]
  ): Unit = js.native
}

