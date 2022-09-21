package typings.googleapis.doubleclickbidmanagerV2Mod.doubleclickbidmanagerV2

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/doubleclickbidmanager/v2", "doubleclickbidmanager_v2.Resource$Queries$Reports")
@js.native
open class ResourceQueriesReports protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def get(): GaxiosPromise[SchemaReport] = js.native
  def get(callback: BodyResponseCallback[SchemaReport]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaReport] = js.native
  def get(params: ParamsResourceQueriesReportsGet): GaxiosPromise[SchemaReport] = js.native
  def get(params: ParamsResourceQueriesReportsGet, callback: BodyResponseCallback[SchemaReport]): Unit = js.native
  def get(
    params: ParamsResourceQueriesReportsGet,
    options: BodyResponseCallback[Readable | SchemaReport],
    callback: BodyResponseCallback[Readable | SchemaReport]
  ): Unit = js.native
  def get(params: ParamsResourceQueriesReportsGet, options: MethodOptions): GaxiosPromise[SchemaReport] = js.native
  def get(
    params: ParamsResourceQueriesReportsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaReport]
  ): Unit = js.native
  /**
    * Retrieves a report.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/doubleclickbidmanager.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const doubleclickbidmanager = google.doubleclickbidmanager('v2');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/doubleclickbidmanager'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await doubleclickbidmanager.queries.reports.get({
    *     // Required. ID of the query the report is associated with.
    *     queryId: 'placeholder-value',
    *     // Required. ID of the report to retrieve.
    *     reportId: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "key": {},
    *   //   "metadata": {},
    *   //   "params": {}
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
  def get(params: ParamsResourceQueriesReportsGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceQueriesReportsGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaListReportsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListReportsResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListReportsResponse] = js.native
  def list(params: ParamsResourceQueriesReportsList): GaxiosPromise[SchemaListReportsResponse] = js.native
  def list(
    params: ParamsResourceQueriesReportsList,
    callback: BodyResponseCallback[SchemaListReportsResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceQueriesReportsList,
    options: BodyResponseCallback[Readable | SchemaListReportsResponse],
    callback: BodyResponseCallback[Readable | SchemaListReportsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceQueriesReportsList, options: MethodOptions): GaxiosPromise[SchemaListReportsResponse] = js.native
  def list(
    params: ParamsResourceQueriesReportsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListReportsResponse]
  ): Unit = js.native
  /**
    * Lists reports associated with a query.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/doubleclickbidmanager.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const doubleclickbidmanager = google.doubleclickbidmanager('v2');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/doubleclickbidmanager'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await doubleclickbidmanager.queries.reports.list({
    *     // Name of a field used to order results. The default sorting order is ascending. To specify descending order for a field, append a " desc" suffix. For example "key.reportId desc". Sorting is only supported for the following fields: * `key.reportId`
    *     orderBy: 'placeholder-value',
    *     // Maximum number of results per page. Must be between `1` and `100`. Defaults to `100` if unspecified.
    *     pageSize: 'placeholder-value',
    *     // A page token, received from a previous list call. Provide this to retrieve the subsequent page of reports.
    *     pageToken: 'placeholder-value',
    *     // Required. ID of the query with which the reports are associated.
    *     queryId: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "nextPageToken": "my_nextPageToken",
    *   //   "reports": []
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
  def list(params: ParamsResourceQueriesReportsList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceQueriesReportsList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
