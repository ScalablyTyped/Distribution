package typings.googleapis.v3Mod.analyticsV3

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/analytics/v3", "analytics_v3.Resource$Data$Realtime")
@js.native
open class ResourceDataRealtime protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def get(): GaxiosPromise[SchemaRealtimeData] = js.native
  def get(callback: BodyResponseCallback[SchemaRealtimeData]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaRealtimeData] = js.native
  def get(params: ParamsResourceDataRealtimeGet): GaxiosPromise[SchemaRealtimeData] = js.native
  def get(params: ParamsResourceDataRealtimeGet, callback: BodyResponseCallback[SchemaRealtimeData]): Unit = js.native
  def get(
    params: ParamsResourceDataRealtimeGet,
    options: BodyResponseCallback[Readable | SchemaRealtimeData],
    callback: BodyResponseCallback[Readable | SchemaRealtimeData]
  ): Unit = js.native
  def get(params: ParamsResourceDataRealtimeGet, options: MethodOptions): GaxiosPromise[SchemaRealtimeData] = js.native
  def get(
    params: ParamsResourceDataRealtimeGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaRealtimeData]
  ): Unit = js.native
  /**
    * Returns real time data for a view (profile).
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/analytics.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const analytics = google.analytics('v3');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/analytics',
    *       'https://www.googleapis.com/auth/analytics.readonly',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await analytics.data.realtime.get({
    *     // A comma-separated list of real time dimensions. E.g., 'rt:medium,rt:city'.
    *     dimensions: '(ga:.+)|(rt:.+)',
    *     // A comma-separated list of dimension or metric filters to be applied to real time data.
    *     filters: '(ga:.+)|(rt:.+)',
    *     // Unique table ID for retrieving real time data. Table ID is of the form ga:XXXX, where XXXX is the Analytics view (profile) ID.
    *     ids: 'ga:[0-9]+',
    *     // The maximum number of entries to include in this feed.
    *     'max-results': 'placeholder-value',
    *     // A comma-separated list of real time metrics. E.g., 'rt:activeUsers'. At least one metric must be specified.
    *     metrics: '(ga:.+)|(rt:.+)',
    *     // A comma-separated list of dimensions or metrics that determine the sort order for real time data.
    *     sort: '(-)?((ga:.+)|(rt:.+))',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "columnHeaders": [],
    *   //   "id": "my_id",
    *   //   "kind": "my_kind",
    *   //   "profileInfo": {},
    *   //   "query": {},
    *   //   "rows": [],
    *   //   "selfLink": "my_selfLink",
    *   //   "totalResults": 0,
    *   //   "totalsForAllResults": {}
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
  def get(params: ParamsResourceDataRealtimeGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceDataRealtimeGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
