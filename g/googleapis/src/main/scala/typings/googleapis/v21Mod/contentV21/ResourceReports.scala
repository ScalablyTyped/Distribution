package typings.googleapis.v21Mod.contentV21

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/content/v2.1", "content_v2_1.Resource$Reports")
@js.native
open class ResourceReports protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def search(): GaxiosPromise[SchemaSearchResponse] = js.native
  def search(callback: BodyResponseCallback[SchemaSearchResponse]): Unit = js.native
  def search(params: Unit, options: MethodOptions): GaxiosPromise[SchemaSearchResponse] = js.native
  def search(params: ParamsResourceReportsSearch): GaxiosPromise[SchemaSearchResponse] = js.native
  def search(params: ParamsResourceReportsSearch, callback: BodyResponseCallback[SchemaSearchResponse]): Unit = js.native
  def search(
    params: ParamsResourceReportsSearch,
    options: BodyResponseCallback[Readable | SchemaSearchResponse],
    callback: BodyResponseCallback[Readable | SchemaSearchResponse]
  ): Unit = js.native
  def search(params: ParamsResourceReportsSearch, options: MethodOptions): GaxiosPromise[SchemaSearchResponse] = js.native
  def search(
    params: ParamsResourceReportsSearch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaSearchResponse]
  ): Unit = js.native
  /**
    * Retrieves merchant performance mertrics matching the search query and optionally segmented by selected dimensions.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/content.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const content = google.content('v2.1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/content'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await content.reports.search({
    *     // Required. Id of the merchant making the call. Must be a standalone account or an MCA subaccount.
    *     merchantId: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "pageSize": 0,
    *       //   "pageToken": "my_pageToken",
    *       //   "query": "my_query"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "nextPageToken": "my_nextPageToken",
    *   //   "results": []
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
  def search(params: ParamsResourceReportsSearch, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def search(
    params: ParamsResourceReportsSearch,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
