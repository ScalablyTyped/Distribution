package typings.googleapis.youtubereportingV1Mod.youtubereportingV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/youtubereporting/v1", "youtubereporting_v1.Resource$Jobs$Reports")
@js.native
open class ResourceJobsReports protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def get(): GaxiosPromise[SchemaReport] = js.native
  def get(callback: BodyResponseCallback[SchemaReport]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaReport] = js.native
  def get(params: ParamsResourceJobsReportsGet): GaxiosPromise[SchemaReport] = js.native
  def get(params: ParamsResourceJobsReportsGet, callback: BodyResponseCallback[SchemaReport]): Unit = js.native
  def get(
    params: ParamsResourceJobsReportsGet,
    options: BodyResponseCallback[Readable | SchemaReport],
    callback: BodyResponseCallback[Readable | SchemaReport]
  ): Unit = js.native
  def get(params: ParamsResourceJobsReportsGet, options: MethodOptions): GaxiosPromise[SchemaReport] = js.native
  def get(
    params: ParamsResourceJobsReportsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaReport]
  ): Unit = js.native
  /**
    * Gets the metadata of a specific report.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/youtubereporting.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const youtubereporting = google.youtubereporting('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/yt-analytics-monetary.readonly',
    *       'https://www.googleapis.com/auth/yt-analytics.readonly',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await youtubereporting.jobs.reports.get({
    *     // The ID of the job.
    *     jobId: 'placeholder-value',
    *     // The content owner's external ID on which behalf the user is acting on. If not set, the user is acting for himself (his own channel).
    *     onBehalfOfContentOwner: 'placeholder-value',
    *     // The ID of the report to retrieve.
    *     reportId: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "createTime": "my_createTime",
    *   //   "downloadUrl": "my_downloadUrl",
    *   //   "endTime": "my_endTime",
    *   //   "id": "my_id",
    *   //   "jobExpireTime": "my_jobExpireTime",
    *   //   "jobId": "my_jobId",
    *   //   "startTime": "my_startTime"
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
  def get(params: ParamsResourceJobsReportsGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceJobsReportsGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaListReportsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListReportsResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListReportsResponse] = js.native
  def list(params: ParamsResourceJobsReportsList): GaxiosPromise[SchemaListReportsResponse] = js.native
  def list(params: ParamsResourceJobsReportsList, callback: BodyResponseCallback[SchemaListReportsResponse]): Unit = js.native
  def list(
    params: ParamsResourceJobsReportsList,
    options: BodyResponseCallback[Readable | SchemaListReportsResponse],
    callback: BodyResponseCallback[Readable | SchemaListReportsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceJobsReportsList, options: MethodOptions): GaxiosPromise[SchemaListReportsResponse] = js.native
  def list(
    params: ParamsResourceJobsReportsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListReportsResponse]
  ): Unit = js.native
  /**
    * Lists reports created by a specific job. Returns NOT_FOUND if the job does not exist.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/youtubereporting.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const youtubereporting = google.youtubereporting('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/yt-analytics-monetary.readonly',
    *       'https://www.googleapis.com/auth/yt-analytics.readonly',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await youtubereporting.jobs.reports.list({
    *     // If set, only reports created after the specified date/time are returned.
    *     createdAfter: 'placeholder-value',
    *     // The ID of the job.
    *     jobId: 'placeholder-value',
    *     // The content owner's external ID on which behalf the user is acting on. If not set, the user is acting for himself (his own channel).
    *     onBehalfOfContentOwner: 'placeholder-value',
    *     // Requested page size. Server may return fewer report types than requested. If unspecified, server will pick an appropriate default.
    *     pageSize: 'placeholder-value',
    *     // A token identifying a page of results the server should return. Typically, this is the value of ListReportsResponse.next_page_token returned in response to the previous call to the `ListReports` method.
    *     pageToken: 'placeholder-value',
    *     // If set, only reports whose start time is greater than or equal the specified date/time are returned.
    *     startTimeAtOrAfter: 'placeholder-value',
    *     // If set, only reports whose start time is smaller than the specified date/time are returned.
    *     startTimeBefore: 'placeholder-value',
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
  def list(params: ParamsResourceJobsReportsList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceJobsReportsList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
