package typings.googleapis.searchconsoleV1Mod.searchconsoleV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/searchconsole/v1", "searchconsole_v1.Resource$Searchanalytics")
@js.native
open class ResourceSearchanalytics protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def query(): GaxiosPromise[SchemaSearchAnalyticsQueryResponse] = js.native
  def query(callback: BodyResponseCallback[SchemaSearchAnalyticsQueryResponse]): Unit = js.native
  def query(params: Unit, options: MethodOptions): GaxiosPromise[SchemaSearchAnalyticsQueryResponse] = js.native
  def query(params: ParamsResourceSearchanalyticsQuery): GaxiosPromise[SchemaSearchAnalyticsQueryResponse] = js.native
  def query(
    params: ParamsResourceSearchanalyticsQuery,
    callback: BodyResponseCallback[SchemaSearchAnalyticsQueryResponse]
  ): Unit = js.native
  def query(
    params: ParamsResourceSearchanalyticsQuery,
    options: BodyResponseCallback[Readable | SchemaSearchAnalyticsQueryResponse],
    callback: BodyResponseCallback[Readable | SchemaSearchAnalyticsQueryResponse]
  ): Unit = js.native
  def query(params: ParamsResourceSearchanalyticsQuery, options: MethodOptions): GaxiosPromise[SchemaSearchAnalyticsQueryResponse] = js.native
  def query(
    params: ParamsResourceSearchanalyticsQuery,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaSearchAnalyticsQueryResponse]
  ): Unit = js.native
  /**
    * Query your data with filters and parameters that you define. Returns zero or more rows grouped by the row keys that you define. You must define a date range of one or more days. When date is one of the group by values, any days without data are omitted from the result list. If you need to know which days have data, issue a broad date range query grouped by date for any metric, and see which day rows are returned.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/searchconsole.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const searchconsole = google.searchconsole('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/webmasters',
    *       'https://www.googleapis.com/auth/webmasters.readonly',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await webmasters.searchanalytics.query({
    *     // The site's URL, including protocol. For example: `http://www.example.com/`.
    *     siteUrl: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "aggregationType": "my_aggregationType",
    *       //   "dataState": "my_dataState",
    *       //   "dimensionFilterGroups": [],
    *       //   "dimensions": [],
    *       //   "endDate": "my_endDate",
    *       //   "rowLimit": 0,
    *       //   "searchType": "my_searchType",
    *       //   "startDate": "my_startDate",
    *       //   "startRow": 0,
    *       //   "type": "my_type"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "responseAggregationType": "my_responseAggregationType",
    *   //   "rows": []
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
  def query(params: ParamsResourceSearchanalyticsQuery, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def query(
    params: ParamsResourceSearchanalyticsQuery,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
