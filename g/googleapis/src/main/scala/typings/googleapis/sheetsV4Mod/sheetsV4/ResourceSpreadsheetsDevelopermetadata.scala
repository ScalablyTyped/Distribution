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

@JSImport("googleapis/build/src/apis/sheets/v4", "sheets_v4.Resource$Spreadsheets$Developermetadata")
@js.native
open class ResourceSpreadsheetsDevelopermetadata protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def get(): GaxiosPromise[SchemaDeveloperMetadata] = js.native
  def get(callback: BodyResponseCallback[SchemaDeveloperMetadata]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaDeveloperMetadata] = js.native
  def get(params: ParamsResourceSpreadsheetsDevelopermetadataGet): GaxiosPromise[SchemaDeveloperMetadata] = js.native
  def get(
    params: ParamsResourceSpreadsheetsDevelopermetadataGet,
    callback: BodyResponseCallback[SchemaDeveloperMetadata]
  ): Unit = js.native
  def get(
    params: ParamsResourceSpreadsheetsDevelopermetadataGet,
    options: BodyResponseCallback[Readable | SchemaDeveloperMetadata],
    callback: BodyResponseCallback[Readable | SchemaDeveloperMetadata]
  ): Unit = js.native
  def get(params: ParamsResourceSpreadsheetsDevelopermetadataGet, options: MethodOptions): GaxiosPromise[SchemaDeveloperMetadata] = js.native
  def get(
    params: ParamsResourceSpreadsheetsDevelopermetadataGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaDeveloperMetadata]
  ): Unit = js.native
  /**
    * Returns the developer metadata with the specified ID. The caller must specify the spreadsheet ID and the developer metadata's unique metadataId.
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
    *   const res = await sheets.spreadsheets.developerMetadata.get({
    *     // The ID of the developer metadata to retrieve.
    *     metadataId: 'placeholder-value',
    *     // The ID of the spreadsheet to retrieve metadata from.
    *     spreadsheetId: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "location": {},
    *   //   "metadataId": 0,
    *   //   "metadataKey": "my_metadataKey",
    *   //   "metadataValue": "my_metadataValue",
    *   //   "visibility": "my_visibility"
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
  def get(params: ParamsResourceSpreadsheetsDevelopermetadataGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceSpreadsheetsDevelopermetadataGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def search(): GaxiosPromise[SchemaSearchDeveloperMetadataResponse] = js.native
  def search(callback: BodyResponseCallback[SchemaSearchDeveloperMetadataResponse]): Unit = js.native
  def search(params: Unit, options: MethodOptions): GaxiosPromise[SchemaSearchDeveloperMetadataResponse] = js.native
  def search(params: ParamsResourceSpreadsheetsDevelopermetadataSearch): GaxiosPromise[SchemaSearchDeveloperMetadataResponse] = js.native
  def search(
    params: ParamsResourceSpreadsheetsDevelopermetadataSearch,
    callback: BodyResponseCallback[SchemaSearchDeveloperMetadataResponse]
  ): Unit = js.native
  def search(
    params: ParamsResourceSpreadsheetsDevelopermetadataSearch,
    options: BodyResponseCallback[Readable | SchemaSearchDeveloperMetadataResponse],
    callback: BodyResponseCallback[Readable | SchemaSearchDeveloperMetadataResponse]
  ): Unit = js.native
  def search(params: ParamsResourceSpreadsheetsDevelopermetadataSearch, options: MethodOptions): GaxiosPromise[SchemaSearchDeveloperMetadataResponse] = js.native
  def search(
    params: ParamsResourceSpreadsheetsDevelopermetadataSearch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaSearchDeveloperMetadataResponse]
  ): Unit = js.native
  /**
    * Returns all developer metadata matching the specified DataFilter. If the provided DataFilter represents a DeveloperMetadataLookup object, this will return all DeveloperMetadata entries selected by it. If the DataFilter represents a location in a spreadsheet, this will return all developer metadata associated with locations intersecting that region.
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
    *   const res = await sheets.spreadsheets.developerMetadata.search({
    *     // The ID of the spreadsheet to retrieve metadata from.
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
    *   //   "matchedDeveloperMetadata": []
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
  def search(params: ParamsResourceSpreadsheetsDevelopermetadataSearch, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def search(
    params: ParamsResourceSpreadsheetsDevelopermetadataSearch,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
