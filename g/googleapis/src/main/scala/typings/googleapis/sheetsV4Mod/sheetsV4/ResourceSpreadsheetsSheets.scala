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

@JSImport("googleapis/build/src/apis/sheets/v4", "sheets_v4.Resource$Spreadsheets$Sheets")
@js.native
open class ResourceSpreadsheetsSheets protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def copyTo(): GaxiosPromise[SchemaSheetProperties] = js.native
  def copyTo(callback: BodyResponseCallback[SchemaSheetProperties]): Unit = js.native
  def copyTo(params: Unit, options: MethodOptions): GaxiosPromise[SchemaSheetProperties] = js.native
  def copyTo(params: ParamsResourceSpreadsheetsSheetsCopyto): GaxiosPromise[SchemaSheetProperties] = js.native
  def copyTo(
    params: ParamsResourceSpreadsheetsSheetsCopyto,
    callback: BodyResponseCallback[SchemaSheetProperties]
  ): Unit = js.native
  def copyTo(
    params: ParamsResourceSpreadsheetsSheetsCopyto,
    options: BodyResponseCallback[Readable | SchemaSheetProperties],
    callback: BodyResponseCallback[Readable | SchemaSheetProperties]
  ): Unit = js.native
  def copyTo(params: ParamsResourceSpreadsheetsSheetsCopyto, options: MethodOptions): GaxiosPromise[SchemaSheetProperties] = js.native
  def copyTo(
    params: ParamsResourceSpreadsheetsSheetsCopyto,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaSheetProperties]
  ): Unit = js.native
  /**
    * Copies a single sheet from a spreadsheet to another spreadsheet. Returns the properties of the newly created sheet.
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
    *   const res = await sheets.spreadsheets.sheets.copyTo({
    *     // The ID of the sheet to copy.
    *     sheetId: 'placeholder-value',
    *     // The ID of the spreadsheet containing the sheet to copy.
    *     spreadsheetId: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "destinationSpreadsheetId": "my_destinationSpreadsheetId"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "dataSourceSheetProperties": {},
    *   //   "gridProperties": {},
    *   //   "hidden": false,
    *   //   "index": 0,
    *   //   "rightToLeft": false,
    *   //   "sheetId": 0,
    *   //   "sheetType": "my_sheetType",
    *   //   "tabColor": {},
    *   //   "tabColorStyle": {},
    *   //   "title": "my_title"
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
  def copyTo(params: ParamsResourceSpreadsheetsSheetsCopyto, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def copyTo(
    params: ParamsResourceSpreadsheetsSheetsCopyto,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
