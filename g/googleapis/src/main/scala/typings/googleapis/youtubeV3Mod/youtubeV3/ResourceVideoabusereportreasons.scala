package typings.googleapis.youtubeV3Mod.youtubeV3

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/youtube/v3", "youtube_v3.Resource$Videoabusereportreasons")
@js.native
open class ResourceVideoabusereportreasons protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def list(): GaxiosPromise[SchemaVideoAbuseReportReasonListResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaVideoAbuseReportReasonListResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaVideoAbuseReportReasonListResponse] = js.native
  def list(params: ParamsResourceVideoabusereportreasonsList): GaxiosPromise[SchemaVideoAbuseReportReasonListResponse] = js.native
  def list(
    params: ParamsResourceVideoabusereportreasonsList,
    callback: BodyResponseCallback[SchemaVideoAbuseReportReasonListResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceVideoabusereportreasonsList,
    options: BodyResponseCallback[Readable | SchemaVideoAbuseReportReasonListResponse],
    callback: BodyResponseCallback[Readable | SchemaVideoAbuseReportReasonListResponse]
  ): Unit = js.native
  def list(params: ParamsResourceVideoabusereportreasonsList, options: MethodOptions): GaxiosPromise[SchemaVideoAbuseReportReasonListResponse] = js.native
  def list(
    params: ParamsResourceVideoabusereportreasonsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaVideoAbuseReportReasonListResponse]
  ): Unit = js.native
  /**
    * Retrieves a list of resources, possibly filtered.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/youtube.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const youtube = google.youtube('v3');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/youtube',
    *       'https://www.googleapis.com/auth/youtube.force-ssl',
    *       'https://www.googleapis.com/auth/youtube.readonly',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await youtube.videoAbuseReportReasons.list({
    *     hl: 'placeholder-value',
    *     // The *part* parameter specifies the videoCategory resource parts that the API response will include. Supported values are id and snippet.
    *     part: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "etag": "my_etag",
    *   //   "eventId": "my_eventId",
    *   //   "items": [],
    *   //   "kind": "my_kind",
    *   //   "visitorId": "my_visitorId"
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
  def list(params: ParamsResourceVideoabusereportreasonsList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceVideoabusereportreasonsList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
