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

@JSImport("googleapis/build/src/apis/analytics/v3", "analytics_v3.Resource$Data$Mcf")
@js.native
open class ResourceDataMcf protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def get(): GaxiosPromise[SchemaMcfData] = js.native
  def get(callback: BodyResponseCallback[SchemaMcfData]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaMcfData] = js.native
  def get(params: ParamsResourceDataMcfGet): GaxiosPromise[SchemaMcfData] = js.native
  def get(params: ParamsResourceDataMcfGet, callback: BodyResponseCallback[SchemaMcfData]): Unit = js.native
  def get(
    params: ParamsResourceDataMcfGet,
    options: BodyResponseCallback[Readable | SchemaMcfData],
    callback: BodyResponseCallback[Readable | SchemaMcfData]
  ): Unit = js.native
  def get(params: ParamsResourceDataMcfGet, options: MethodOptions): GaxiosPromise[SchemaMcfData] = js.native
  def get(
    params: ParamsResourceDataMcfGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaMcfData]
  ): Unit = js.native
  /**
    * Returns Analytics Multi-Channel Funnels data for a view (profile).
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
    *   const res = await analytics.data.mcf.get({
    *     // A comma-separated list of Multi-Channel Funnels dimensions. E.g., 'mcf:source,mcf:medium'.
    *     dimensions: '(mcf:.+)?',
    *     // End date for fetching Analytics data. Requests can specify a start date formatted as YYYY-MM-DD, or as a relative date (e.g., today, yesterday, or 7daysAgo). The default value is 7daysAgo.
    *     'end-date': '[0-9]{4}-[0-9]{2}-[0-9]{2}|today|yesterday|[0-9]+(daysAgo)',
    *     // A comma-separated list of dimension or metric filters to be applied to the Analytics data.
    *     filters: 'mcf:.+',
    *     // Unique table ID for retrieving Analytics data. Table ID is of the form ga:XXXX, where XXXX is the Analytics view (profile) ID.
    *     ids: 'ga:[0-9]+',
    *     // The maximum number of entries to include in this feed.
    *     'max-results': 'placeholder-value',
    *     // A comma-separated list of Multi-Channel Funnels metrics. E.g., 'mcf:totalConversions,mcf:totalConversionValue'. At least one metric must be specified.
    *     metrics: 'mcf:.+',
    *     // The desired sampling level.
    *     samplingLevel: 'placeholder-value',
    *     // A comma-separated list of dimensions or metrics that determine the sort order for the Analytics data.
    *     sort: '(-)?mcf:.+',
    *     // Start date for fetching Analytics data. Requests can specify a start date formatted as YYYY-MM-DD, or as a relative date (e.g., today, yesterday, or 7daysAgo). The default value is 7daysAgo.
    *     'start-date': '[0-9]{4}-[0-9]{2}-[0-9]{2}|today|yesterday|[0-9]+(daysAgo)',
    *     // An index of the first entity to retrieve. Use this parameter as a pagination mechanism along with the max-results parameter.
    *     'start-index': 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "columnHeaders": [],
    *   //   "containsSampledData": false,
    *   //   "id": "my_id",
    *   //   "itemsPerPage": 0,
    *   //   "kind": "my_kind",
    *   //   "nextLink": "my_nextLink",
    *   //   "previousLink": "my_previousLink",
    *   //   "profileInfo": {},
    *   //   "query": {},
    *   //   "rows": [],
    *   //   "sampleSize": "my_sampleSize",
    *   //   "sampleSpace": "my_sampleSpace",
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
  def get(params: ParamsResourceDataMcfGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceDataMcfGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
