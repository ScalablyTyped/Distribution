package typings.googleapis.websecurityscannerV1alphaMod.websecurityscannerV1alpha

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/websecurityscanner/v1alpha", "websecurityscanner_v1alpha.Resource$Projects$Scanconfigs$Scanruns$Crawledurls")
@js.native
open class ResourceProjectsScanconfigsScanrunsCrawledurls protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def list(): GaxiosPromise[SchemaListCrawledUrlsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListCrawledUrlsResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListCrawledUrlsResponse] = js.native
  def list(params: ParamsResourceProjectsScanconfigsScanrunsCrawledurlsList): GaxiosPromise[SchemaListCrawledUrlsResponse] = js.native
  def list(
    params: ParamsResourceProjectsScanconfigsScanrunsCrawledurlsList,
    callback: BodyResponseCallback[SchemaListCrawledUrlsResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceProjectsScanconfigsScanrunsCrawledurlsList,
    options: BodyResponseCallback[Readable | SchemaListCrawledUrlsResponse],
    callback: BodyResponseCallback[Readable | SchemaListCrawledUrlsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceProjectsScanconfigsScanrunsCrawledurlsList, options: MethodOptions): GaxiosPromise[SchemaListCrawledUrlsResponse] = js.native
  def list(
    params: ParamsResourceProjectsScanconfigsScanrunsCrawledurlsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListCrawledUrlsResponse]
  ): Unit = js.native
  /**
    * List CrawledUrls under a given ScanRun.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/websecurityscanner.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const websecurityscanner = google.websecurityscanner('v1alpha');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/cloud-platform'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res =
    *     await websecurityscanner.projects.scanConfigs.scanRuns.crawledUrls.list({
    *       // The maximum number of CrawledUrls to return, can be limited by server. If not specified or not positive, the implementation will select a reasonable value.
    *       pageSize: 'placeholder-value',
    *       // A token identifying a page of results to be returned. This should be a `next_page_token` value returned from a previous List request. If unspecified, the first page of results is returned.
    *       pageToken: 'placeholder-value',
    *       // Required. The parent resource name, which should be a scan run resource name in the format 'projects/{projectId\}/scanConfigs/{scanConfigId\}/scanRuns/{scanRunId\}'.
    *       parent:
    *         'projects/my-project/scanConfigs/my-scanConfig/scanRuns/my-scanRun',
    *     });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "crawledUrls": [],
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
  def list(params: ParamsResourceProjectsScanconfigsScanrunsCrawledurlsList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceProjectsScanconfigsScanrunsCrawledurlsList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
