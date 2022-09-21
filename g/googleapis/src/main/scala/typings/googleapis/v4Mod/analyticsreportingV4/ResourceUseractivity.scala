package typings.googleapis.v4Mod.analyticsreportingV4

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/analyticsreporting/v4", "analyticsreporting_v4.Resource$Useractivity")
@js.native
open class ResourceUseractivity protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def search(): GaxiosPromise[SchemaSearchUserActivityResponse] = js.native
  def search(callback: BodyResponseCallback[SchemaSearchUserActivityResponse]): Unit = js.native
  def search(params: Unit, options: MethodOptions): GaxiosPromise[SchemaSearchUserActivityResponse] = js.native
  def search(params: ParamsResourceUseractivitySearch): GaxiosPromise[SchemaSearchUserActivityResponse] = js.native
  def search(
    params: ParamsResourceUseractivitySearch,
    callback: BodyResponseCallback[SchemaSearchUserActivityResponse]
  ): Unit = js.native
  def search(
    params: ParamsResourceUseractivitySearch,
    options: BodyResponseCallback[Readable | SchemaSearchUserActivityResponse],
    callback: BodyResponseCallback[Readable | SchemaSearchUserActivityResponse]
  ): Unit = js.native
  def search(params: ParamsResourceUseractivitySearch, options: MethodOptions): GaxiosPromise[SchemaSearchUserActivityResponse] = js.native
  def search(
    params: ParamsResourceUseractivitySearch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaSearchUserActivityResponse]
  ): Unit = js.native
  /**
    * Returns User Activity data.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/analyticsreporting.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const analyticsreporting = google.analyticsreporting('v4');
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
    *   const res = await analyticsreporting.userActivity.search({
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "activityTypes": [],
    *       //   "dateRange": {},
    *       //   "pageSize": 0,
    *       //   "pageToken": "my_pageToken",
    *       //   "user": {},
    *       //   "viewId": "my_viewId"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "nextPageToken": "my_nextPageToken",
    *   //   "sampleRate": {},
    *   //   "sessions": [],
    *   //   "totalRows": 0
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
  def search(params: ParamsResourceUseractivitySearch, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def search(
    params: ParamsResourceUseractivitySearch,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
