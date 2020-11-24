package typings.googleapis.sheetsV4Mod.sheetsV4

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/sheets/v4", "sheets_v4.Resource$Spreadsheets$Sheets")
@js.native
class ResourceSpreadsheetsSheets protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  /**
    * sheets.spreadsheets.sheets.copyTo
    * @desc Copies a single sheet from a spreadsheet to another spreadsheet.
    * Returns the properties of the newly created sheet.
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
    *     // The ID of the spreadsheet containing the sheet to copy.
    *     spreadsheetId: 'my-spreadsheet-id',  // TODO: Update placeholder
    * value.
    *
    *     // The ID of the sheet to copy.
    *     sheetId: 0,  // TODO: Update placeholder value.
    *
    *     resource: {
    *       // The ID of the spreadsheet to copy the sheet to.
    *       destinationSpreadsheetId: '',  // TODO: Update placeholder value.
    *
    *       // TODO: Add desired properties to the request body.
    *     },
    *
    *     auth: authClient,
    *   };
    *
    *   sheets.spreadsheets.sheets.copyTo(request, function(err, response) {
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
    * @alias sheets.spreadsheets.sheets.copyTo
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {integer} params.sheetId The ID of the sheet to copy.
    * @param {string} params.spreadsheetId The ID of the spreadsheet containing the sheet to copy.
    * @param {().CopySheetToAnotherSpreadsheetRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def copyTo(): GaxiosPromise[SchemaSheetProperties] = js.native
  def copyTo(callback: BodyResponseCallback[SchemaSheetProperties]): Unit = js.native
  def copyTo(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaSheetProperties] = js.native
  def copyTo(params: ParamsResourceSpreadsheetsSheetsCopyto): GaxiosPromise[SchemaSheetProperties] = js.native
  def copyTo(
    params: ParamsResourceSpreadsheetsSheetsCopyto,
    callback: BodyResponseCallback[SchemaSheetProperties]
  ): Unit = js.native
  def copyTo(
    params: ParamsResourceSpreadsheetsSheetsCopyto,
    options: BodyResponseCallback[SchemaSheetProperties],
    callback: BodyResponseCallback[SchemaSheetProperties]
  ): Unit = js.native
  def copyTo(params: ParamsResourceSpreadsheetsSheetsCopyto, options: MethodOptions): GaxiosPromise[SchemaSheetProperties] = js.native
  def copyTo(
    params: ParamsResourceSpreadsheetsSheetsCopyto,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaSheetProperties]
  ): Unit = js.native
}
