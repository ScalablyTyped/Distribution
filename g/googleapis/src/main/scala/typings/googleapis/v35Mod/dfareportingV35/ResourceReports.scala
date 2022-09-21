package typings.googleapis.v35Mod.dfareportingV35

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/dfareporting/v3.5", "dfareporting_v3_5.Resource$Reports")
@js.native
open class ResourceReports protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var compatibleFields: ResourceReportsCompatiblefields = js.native
  
  var context: APIRequestContext = js.native
  
  def delete(): GaxiosPromise[Unit] = js.native
  def delete(callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceReportsDelete): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceReportsDelete, callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(
    params: ParamsResourceReportsDelete,
    options: BodyResponseCallback[Readable | Unit],
    callback: BodyResponseCallback[Readable | Unit]
  ): Unit = js.native
  def delete(params: ParamsResourceReportsDelete, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceReportsDelete, options: MethodOptions, callback: BodyResponseCallback[Unit]): Unit = js.native
  /**
    * Deletes a report by its ID.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/dfareporting.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const dfareporting = google.dfareporting('v3.5');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/dfareporting'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await dfareporting.reports.delete({
    *     // The Campaign Manager 360 user profile ID.
    *     profileId: 'placeholder-value',
    *     // The ID of the report.
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
  def delete(params: ParamsResourceReportsDelete, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def delete(
    params: ParamsResourceReportsDelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  var files: ResourceReportsFiles = js.native
  
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
    * Retrieves a report by its ID.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/dfareporting.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const dfareporting = google.dfareporting('v3.5');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/dfareporting'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await dfareporting.reports.get({
    *     // The Campaign Manager 360 user profile ID.
    *     profileId: 'placeholder-value',
    *     // The ID of the report.
    *     reportId: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "accountId": "my_accountId",
    *   //   "criteria": {},
    *   //   "crossDimensionReachCriteria": {},
    *   //   "delivery": {},
    *   //   "etag": "my_etag",
    *   //   "fileName": "my_fileName",
    *   //   "floodlightCriteria": {},
    *   //   "format": "my_format",
    *   //   "id": "my_id",
    *   //   "kind": "my_kind",
    *   //   "lastModifiedTime": "my_lastModifiedTime",
    *   //   "name": "my_name",
    *   //   "ownerProfileId": "my_ownerProfileId",
    *   //   "pathAttributionCriteria": {},
    *   //   "pathCriteria": {},
    *   //   "pathToConversionCriteria": {},
    *   //   "reachCriteria": {},
    *   //   "schedule": {},
    *   //   "subAccountId": "my_subAccountId",
    *   //   "type": "my_type"
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
  
  def insert(): GaxiosPromise[SchemaReport] = js.native
  def insert(callback: BodyResponseCallback[SchemaReport]): Unit = js.native
  def insert(params: Unit, options: MethodOptions): GaxiosPromise[SchemaReport] = js.native
  def insert(params: ParamsResourceReportsInsert): GaxiosPromise[SchemaReport] = js.native
  def insert(params: ParamsResourceReportsInsert, callback: BodyResponseCallback[SchemaReport]): Unit = js.native
  def insert(
    params: ParamsResourceReportsInsert,
    options: BodyResponseCallback[Readable | SchemaReport],
    callback: BodyResponseCallback[Readable | SchemaReport]
  ): Unit = js.native
  def insert(params: ParamsResourceReportsInsert, options: MethodOptions): GaxiosPromise[SchemaReport] = js.native
  def insert(
    params: ParamsResourceReportsInsert,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaReport]
  ): Unit = js.native
  /**
    * Creates a report.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/dfareporting.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const dfareporting = google.dfareporting('v3.5');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/dfareporting'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await dfareporting.reports.insert({
    *     // The Campaign Manager 360 user profile ID.
    *     profileId: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "accountId": "my_accountId",
    *       //   "criteria": {},
    *       //   "crossDimensionReachCriteria": {},
    *       //   "delivery": {},
    *       //   "etag": "my_etag",
    *       //   "fileName": "my_fileName",
    *       //   "floodlightCriteria": {},
    *       //   "format": "my_format",
    *       //   "id": "my_id",
    *       //   "kind": "my_kind",
    *       //   "lastModifiedTime": "my_lastModifiedTime",
    *       //   "name": "my_name",
    *       //   "ownerProfileId": "my_ownerProfileId",
    *       //   "pathAttributionCriteria": {},
    *       //   "pathCriteria": {},
    *       //   "pathToConversionCriteria": {},
    *       //   "reachCriteria": {},
    *       //   "schedule": {},
    *       //   "subAccountId": "my_subAccountId",
    *       //   "type": "my_type"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "accountId": "my_accountId",
    *   //   "criteria": {},
    *   //   "crossDimensionReachCriteria": {},
    *   //   "delivery": {},
    *   //   "etag": "my_etag",
    *   //   "fileName": "my_fileName",
    *   //   "floodlightCriteria": {},
    *   //   "format": "my_format",
    *   //   "id": "my_id",
    *   //   "kind": "my_kind",
    *   //   "lastModifiedTime": "my_lastModifiedTime",
    *   //   "name": "my_name",
    *   //   "ownerProfileId": "my_ownerProfileId",
    *   //   "pathAttributionCriteria": {},
    *   //   "pathCriteria": {},
    *   //   "pathToConversionCriteria": {},
    *   //   "reachCriteria": {},
    *   //   "schedule": {},
    *   //   "subAccountId": "my_subAccountId",
    *   //   "type": "my_type"
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
  def insert(params: ParamsResourceReportsInsert, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def insert(
    params: ParamsResourceReportsInsert,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaReportList] = js.native
  def list(callback: BodyResponseCallback[SchemaReportList]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaReportList] = js.native
  def list(params: ParamsResourceReportsList): GaxiosPromise[SchemaReportList] = js.native
  def list(params: ParamsResourceReportsList, callback: BodyResponseCallback[SchemaReportList]): Unit = js.native
  def list(
    params: ParamsResourceReportsList,
    options: BodyResponseCallback[Readable | SchemaReportList],
    callback: BodyResponseCallback[Readable | SchemaReportList]
  ): Unit = js.native
  def list(params: ParamsResourceReportsList, options: MethodOptions): GaxiosPromise[SchemaReportList] = js.native
  def list(
    params: ParamsResourceReportsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaReportList]
  ): Unit = js.native
  /**
    * Retrieves list of reports.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/dfareporting.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const dfareporting = google.dfareporting('v3.5');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/dfareporting'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await dfareporting.reports.list({
    *     // Maximum number of results to return.
    *     maxResults: 'placeholder-value',
    *     // The value of the nextToken from the previous result page.
    *     pageToken: 'placeholder-value',
    *     // The Campaign Manager 360 user profile ID.
    *     profileId: 'placeholder-value',
    *     // The scope that defines which results are returned.
    *     scope: 'placeholder-value',
    *     // The field by which to sort the list.
    *     sortField: 'placeholder-value',
    *     // Order of sorted results.
    *     sortOrder: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "etag": "my_etag",
    *   //   "items": [],
    *   //   "kind": "my_kind",
    *   //   "nextPageToken": "my_nextPageToken"
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
  def list(params: ParamsResourceReportsList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceReportsList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def patch(): GaxiosPromise[SchemaReport] = js.native
  def patch(callback: BodyResponseCallback[SchemaReport]): Unit = js.native
  def patch(params: Unit, options: MethodOptions): GaxiosPromise[SchemaReport] = js.native
  def patch(params: ParamsResourceReportsPatch): GaxiosPromise[SchemaReport] = js.native
  def patch(params: ParamsResourceReportsPatch, callback: BodyResponseCallback[SchemaReport]): Unit = js.native
  def patch(
    params: ParamsResourceReportsPatch,
    options: BodyResponseCallback[Readable | SchemaReport],
    callback: BodyResponseCallback[Readable | SchemaReport]
  ): Unit = js.native
  def patch(params: ParamsResourceReportsPatch, options: MethodOptions): GaxiosPromise[SchemaReport] = js.native
  def patch(
    params: ParamsResourceReportsPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaReport]
  ): Unit = js.native
  /**
    * Updates an existing report. This method supports patch semantics.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/dfareporting.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const dfareporting = google.dfareporting('v3.5');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/dfareporting'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await dfareporting.reports.patch({
    *     // The DFA user profile ID.
    *     profileId: 'placeholder-value',
    *     // The ID of the report.
    *     reportId: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "accountId": "my_accountId",
    *       //   "criteria": {},
    *       //   "crossDimensionReachCriteria": {},
    *       //   "delivery": {},
    *       //   "etag": "my_etag",
    *       //   "fileName": "my_fileName",
    *       //   "floodlightCriteria": {},
    *       //   "format": "my_format",
    *       //   "id": "my_id",
    *       //   "kind": "my_kind",
    *       //   "lastModifiedTime": "my_lastModifiedTime",
    *       //   "name": "my_name",
    *       //   "ownerProfileId": "my_ownerProfileId",
    *       //   "pathAttributionCriteria": {},
    *       //   "pathCriteria": {},
    *       //   "pathToConversionCriteria": {},
    *       //   "reachCriteria": {},
    *       //   "schedule": {},
    *       //   "subAccountId": "my_subAccountId",
    *       //   "type": "my_type"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "accountId": "my_accountId",
    *   //   "criteria": {},
    *   //   "crossDimensionReachCriteria": {},
    *   //   "delivery": {},
    *   //   "etag": "my_etag",
    *   //   "fileName": "my_fileName",
    *   //   "floodlightCriteria": {},
    *   //   "format": "my_format",
    *   //   "id": "my_id",
    *   //   "kind": "my_kind",
    *   //   "lastModifiedTime": "my_lastModifiedTime",
    *   //   "name": "my_name",
    *   //   "ownerProfileId": "my_ownerProfileId",
    *   //   "pathAttributionCriteria": {},
    *   //   "pathCriteria": {},
    *   //   "pathToConversionCriteria": {},
    *   //   "reachCriteria": {},
    *   //   "schedule": {},
    *   //   "subAccountId": "my_subAccountId",
    *   //   "type": "my_type"
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
  def patch(params: ParamsResourceReportsPatch, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def patch(
    params: ParamsResourceReportsPatch,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def run(): GaxiosPromise[SchemaFile] = js.native
  def run(callback: BodyResponseCallback[SchemaFile]): Unit = js.native
  def run(params: Unit, options: MethodOptions): GaxiosPromise[SchemaFile] = js.native
  def run(params: ParamsResourceReportsRun): GaxiosPromise[SchemaFile] = js.native
  def run(params: ParamsResourceReportsRun, callback: BodyResponseCallback[SchemaFile]): Unit = js.native
  def run(
    params: ParamsResourceReportsRun,
    options: BodyResponseCallback[Readable | SchemaFile],
    callback: BodyResponseCallback[Readable | SchemaFile]
  ): Unit = js.native
  def run(params: ParamsResourceReportsRun, options: MethodOptions): GaxiosPromise[SchemaFile] = js.native
  def run(
    params: ParamsResourceReportsRun,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaFile]
  ): Unit = js.native
  /**
    * Runs a report.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/dfareporting.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const dfareporting = google.dfareporting('v3.5');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/dfareporting'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await dfareporting.reports.run({
    *     // The Campaign Manager 360 user profile ID.
    *     profileId: 'placeholder-value',
    *     // The ID of the report.
    *     reportId: 'placeholder-value',
    *     // If set and true, tries to run the report synchronously.
    *     synchronous: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "dateRange": {},
    *   //   "etag": "my_etag",
    *   //   "fileName": "my_fileName",
    *   //   "format": "my_format",
    *   //   "id": "my_id",
    *   //   "kind": "my_kind",
    *   //   "lastModifiedTime": "my_lastModifiedTime",
    *   //   "reportId": "my_reportId",
    *   //   "status": "my_status",
    *   //   "urls": {}
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
  def run(params: ParamsResourceReportsRun, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def run(
    params: ParamsResourceReportsRun,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def update(): GaxiosPromise[SchemaReport] = js.native
  def update(callback: BodyResponseCallback[SchemaReport]): Unit = js.native
  def update(params: Unit, options: MethodOptions): GaxiosPromise[SchemaReport] = js.native
  def update(params: ParamsResourceReportsUpdate): GaxiosPromise[SchemaReport] = js.native
  def update(params: ParamsResourceReportsUpdate, callback: BodyResponseCallback[SchemaReport]): Unit = js.native
  def update(
    params: ParamsResourceReportsUpdate,
    options: BodyResponseCallback[Readable | SchemaReport],
    callback: BodyResponseCallback[Readable | SchemaReport]
  ): Unit = js.native
  def update(params: ParamsResourceReportsUpdate, options: MethodOptions): GaxiosPromise[SchemaReport] = js.native
  def update(
    params: ParamsResourceReportsUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaReport]
  ): Unit = js.native
  /**
    * Updates a report.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/dfareporting.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const dfareporting = google.dfareporting('v3.5');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/dfareporting'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await dfareporting.reports.update({
    *     // The Campaign Manager 360 user profile ID.
    *     profileId: 'placeholder-value',
    *     // The ID of the report.
    *     reportId: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "accountId": "my_accountId",
    *       //   "criteria": {},
    *       //   "crossDimensionReachCriteria": {},
    *       //   "delivery": {},
    *       //   "etag": "my_etag",
    *       //   "fileName": "my_fileName",
    *       //   "floodlightCriteria": {},
    *       //   "format": "my_format",
    *       //   "id": "my_id",
    *       //   "kind": "my_kind",
    *       //   "lastModifiedTime": "my_lastModifiedTime",
    *       //   "name": "my_name",
    *       //   "ownerProfileId": "my_ownerProfileId",
    *       //   "pathAttributionCriteria": {},
    *       //   "pathCriteria": {},
    *       //   "pathToConversionCriteria": {},
    *       //   "reachCriteria": {},
    *       //   "schedule": {},
    *       //   "subAccountId": "my_subAccountId",
    *       //   "type": "my_type"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "accountId": "my_accountId",
    *   //   "criteria": {},
    *   //   "crossDimensionReachCriteria": {},
    *   //   "delivery": {},
    *   //   "etag": "my_etag",
    *   //   "fileName": "my_fileName",
    *   //   "floodlightCriteria": {},
    *   //   "format": "my_format",
    *   //   "id": "my_id",
    *   //   "kind": "my_kind",
    *   //   "lastModifiedTime": "my_lastModifiedTime",
    *   //   "name": "my_name",
    *   //   "ownerProfileId": "my_ownerProfileId",
    *   //   "pathAttributionCriteria": {},
    *   //   "pathCriteria": {},
    *   //   "pathToConversionCriteria": {},
    *   //   "reachCriteria": {},
    *   //   "schedule": {},
    *   //   "subAccountId": "my_subAccountId",
    *   //   "type": "my_type"
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
  def update(params: ParamsResourceReportsUpdate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def update(
    params: ParamsResourceReportsUpdate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
