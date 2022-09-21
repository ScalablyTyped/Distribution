package typings.googleapis.doubleclicksearchV2Mod.doubleclicksearchV2

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/doubleclicksearch/v2", "doubleclicksearch_v2.Resource$Reports")
@js.native
open class ResourceReports protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def generate(): GaxiosPromise[SchemaReport] = js.native
  def generate(callback: BodyResponseCallback[SchemaReport]): Unit = js.native
  def generate(params: Unit, options: MethodOptions): GaxiosPromise[SchemaReport] = js.native
  def generate(params: ParamsResourceReportsGenerate): GaxiosPromise[SchemaReport] = js.native
  def generate(params: ParamsResourceReportsGenerate, callback: BodyResponseCallback[SchemaReport]): Unit = js.native
  def generate(
    params: ParamsResourceReportsGenerate,
    options: BodyResponseCallback[Readable | SchemaReport],
    callback: BodyResponseCallback[Readable | SchemaReport]
  ): Unit = js.native
  def generate(params: ParamsResourceReportsGenerate, options: MethodOptions): GaxiosPromise[SchemaReport] = js.native
  def generate(
    params: ParamsResourceReportsGenerate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaReport]
  ): Unit = js.native
  /**
    * Generates and returns a report immediately.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/doubleclicksearch.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const doubleclicksearch = google.doubleclicksearch('v2');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/doubleclicksearch'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await doubleclicksearch.reports.generate({
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "columns": [],
    *       //   "downloadFormat": "my_downloadFormat",
    *       //   "filters": [],
    *       //   "includeDeletedEntities": false,
    *       //   "includeRemovedEntities": false,
    *       //   "maxRowsPerFile": 0,
    *       //   "orderBy": [],
    *       //   "reportScope": {},
    *       //   "reportType": "my_reportType",
    *       //   "rowCount": 0,
    *       //   "startRow": 0,
    *       //   "statisticsCurrency": "my_statisticsCurrency",
    *       //   "timeRange": {},
    *       //   "verifySingleTimeZone": false
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "files": [],
    *   //   "id": "my_id",
    *   //   "isReportReady": false,
    *   //   "kind": "my_kind",
    *   //   "request": {},
    *   //   "rowCount": 0,
    *   //   "rows": [],
    *   //   "statisticsCurrencyCode": "my_statisticsCurrencyCode",
    *   //   "statisticsTimeZone": "my_statisticsTimeZone"
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
  def generate(params: ParamsResourceReportsGenerate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def generate(
    params: ParamsResourceReportsGenerate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def get(): GaxiosPromise[SchemaReport] = js.native
  def get(callback: BodyResponseCallback[SchemaReport]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaReport] = js.native
  def get(params: ParamsResourceReportsGet): GaxiosPromise[SchemaReport] = js.native
  def get(params: ParamsResourceReportsGet, callback: BodyResponseCallback[SchemaReport]): Unit = js.native
  def get(
    params: ParamsResourceReportsGet,
    options: BodyResponseCallback[Readable | SchemaReport],
    callback: BodyResponseCallback[Readable | SchemaReport]
  ): Unit = js.native
  def get(params: ParamsResourceReportsGet, options: MethodOptions): GaxiosPromise[SchemaReport] = js.native
  def get(
    params: ParamsResourceReportsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaReport]
  ): Unit = js.native
  /**
    * Polls for the status of a report request.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/doubleclicksearch.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const doubleclicksearch = google.doubleclicksearch('v2');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/doubleclicksearch'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await doubleclicksearch.reports.get({
    *     // ID of the report request being polled.
    *     reportId: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "files": [],
    *   //   "id": "my_id",
    *   //   "isReportReady": false,
    *   //   "kind": "my_kind",
    *   //   "request": {},
    *   //   "rowCount": 0,
    *   //   "rows": [],
    *   //   "statisticsCurrencyCode": "my_statisticsCurrencyCode",
    *   //   "statisticsTimeZone": "my_statisticsTimeZone"
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
  def get(params: ParamsResourceReportsGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceReportsGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def getFile(): GaxiosPromise[Any] = js.native
  def getFile(callback: BodyResponseCallback[Any]): Unit = js.native
  def getFile(params: Unit, options: MethodOptions): GaxiosPromise[Any] = js.native
  def getFile(params: ParamsResourceReportsGetfile): GaxiosPromise[Any] = js.native
  def getFile(params: ParamsResourceReportsGetfile, callback: BodyResponseCallback[Any]): Unit = js.native
  def getFile(
    params: ParamsResourceReportsGetfile,
    options: BodyResponseCallback[Any | Readable],
    callback: BodyResponseCallback[Any | Readable]
  ): Unit = js.native
  def getFile(params: ParamsResourceReportsGetfile, options: MethodOptions): GaxiosPromise[Any] = js.native
  def getFile(params: ParamsResourceReportsGetfile, options: MethodOptions, callback: BodyResponseCallback[Any]): Unit = js.native
  /**
    * Downloads a report file encoded in UTF-8.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/doubleclicksearch.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const doubleclicksearch = google.doubleclicksearch('v2');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/doubleclicksearch'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await doubleclicksearch.reports.getFile({
    *     // The index of the report fragment to download.
    *     reportFragment: 'placeholder-value',
    *     // ID of the report.
    *     reportId: 'placeholder-value',
    *   });
    *   console.log(res.data);
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
  def getFile(params: ParamsResourceReportsGetfile, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def getFile(
    params: ParamsResourceReportsGetfile,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def getIdMappingFile(): GaxiosPromise[SchemaIdMappingFile] = js.native
  def getIdMappingFile(callback: BodyResponseCallback[SchemaIdMappingFile]): Unit = js.native
  def getIdMappingFile(params: Unit, options: MethodOptions): GaxiosPromise[SchemaIdMappingFile] = js.native
  def getIdMappingFile(params: ParamsResourceReportsGetidmappingfile): GaxiosPromise[SchemaIdMappingFile] = js.native
  def getIdMappingFile(params: ParamsResourceReportsGetidmappingfile, callback: BodyResponseCallback[SchemaIdMappingFile]): Unit = js.native
  def getIdMappingFile(
    params: ParamsResourceReportsGetidmappingfile,
    options: BodyResponseCallback[Readable | SchemaIdMappingFile],
    callback: BodyResponseCallback[Readable | SchemaIdMappingFile]
  ): Unit = js.native
  def getIdMappingFile(params: ParamsResourceReportsGetidmappingfile, options: MethodOptions): GaxiosPromise[SchemaIdMappingFile] = js.native
  def getIdMappingFile(
    params: ParamsResourceReportsGetidmappingfile,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaIdMappingFile]
  ): Unit = js.native
  /**
    * Downloads a csv file(encoded in UTF-8) that contains ID mappings between legacy SA360 and new SA360. The file includes all children entities of the given advertiser(e.g. engine accounts, campaigns, ad groups, etc.) that exist in both legacy SA360 and new SA360.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/doubleclicksearch.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const doubleclicksearch = google.doubleclicksearch('v2');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/doubleclicksearch'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await doubleclicksearch.reports.getIdMappingFile({
    *     // Legacy SA360 advertiser ID.
    *     advertiserId: 'placeholder-value',
    *     // Legacy SA360 agency ID.
    *     agencyId: 'placeholder-value',
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
  def getIdMappingFile(params: ParamsResourceReportsGetidmappingfile, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def getIdMappingFile(
    params: ParamsResourceReportsGetidmappingfile,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def request(): GaxiosPromise[SchemaReport] = js.native
  def request(callback: BodyResponseCallback[SchemaReport]): Unit = js.native
  def request(params: Unit, options: MethodOptions): GaxiosPromise[SchemaReport] = js.native
  def request(params: ParamsResourceReportsRequest): GaxiosPromise[SchemaReport] = js.native
  def request(params: ParamsResourceReportsRequest, callback: BodyResponseCallback[SchemaReport]): Unit = js.native
  def request(
    params: ParamsResourceReportsRequest,
    options: BodyResponseCallback[Readable | SchemaReport],
    callback: BodyResponseCallback[Readable | SchemaReport]
  ): Unit = js.native
  def request(params: ParamsResourceReportsRequest, options: MethodOptions): GaxiosPromise[SchemaReport] = js.native
  def request(
    params: ParamsResourceReportsRequest,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaReport]
  ): Unit = js.native
  /**
    * Inserts a report request into the reporting system.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/doubleclicksearch.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const doubleclicksearch = google.doubleclicksearch('v2');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/doubleclicksearch'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await doubleclicksearch.reports.request({
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "columns": [],
    *       //   "downloadFormat": "my_downloadFormat",
    *       //   "filters": [],
    *       //   "includeDeletedEntities": false,
    *       //   "includeRemovedEntities": false,
    *       //   "maxRowsPerFile": 0,
    *       //   "orderBy": [],
    *       //   "reportScope": {},
    *       //   "reportType": "my_reportType",
    *       //   "rowCount": 0,
    *       //   "startRow": 0,
    *       //   "statisticsCurrency": "my_statisticsCurrency",
    *       //   "timeRange": {},
    *       //   "verifySingleTimeZone": false
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "files": [],
    *   //   "id": "my_id",
    *   //   "isReportReady": false,
    *   //   "kind": "my_kind",
    *   //   "request": {},
    *   //   "rowCount": 0,
    *   //   "rows": [],
    *   //   "statisticsCurrencyCode": "my_statisticsCurrencyCode",
    *   //   "statisticsTimeZone": "my_statisticsTimeZone"
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
  def request(params: ParamsResourceReportsRequest, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def request(
    params: ParamsResourceReportsRequest,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
