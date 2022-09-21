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

@JSImport("googleapis/build/src/apis/websecurityscanner/v1alpha", "websecurityscanner_v1alpha.Resource$Projects$Scanconfigs$Scanruns")
@js.native
open class ResourceProjectsScanconfigsScanruns protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  var crawledUrls: ResourceProjectsScanconfigsScanrunsCrawledurls = js.native
  
  var findingTypeStats: ResourceProjectsScanconfigsScanrunsFindingtypestats = js.native
  
  var findings: ResourceProjectsScanconfigsScanrunsFindings = js.native
  
  def get(): GaxiosPromise[SchemaScanRun] = js.native
  def get(callback: BodyResponseCallback[SchemaScanRun]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaScanRun] = js.native
  def get(params: ParamsResourceProjectsScanconfigsScanrunsGet): GaxiosPromise[SchemaScanRun] = js.native
  def get(
    params: ParamsResourceProjectsScanconfigsScanrunsGet,
    callback: BodyResponseCallback[SchemaScanRun]
  ): Unit = js.native
  def get(
    params: ParamsResourceProjectsScanconfigsScanrunsGet,
    options: BodyResponseCallback[Readable | SchemaScanRun],
    callback: BodyResponseCallback[Readable | SchemaScanRun]
  ): Unit = js.native
  def get(params: ParamsResourceProjectsScanconfigsScanrunsGet, options: MethodOptions): GaxiosPromise[SchemaScanRun] = js.native
  def get(
    params: ParamsResourceProjectsScanconfigsScanrunsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaScanRun]
  ): Unit = js.native
  /**
    * Gets a ScanRun.
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
    *   const res = await websecurityscanner.projects.scanConfigs.scanRuns.get({
    *     // Required. The resource name of the ScanRun to be returned. The name follows the format of 'projects/{projectId\}/scanConfigs/{scanConfigId\}/scanRuns/{scanRunId\}'.
    *     name: 'projects/my-project/scanConfigs/my-scanConfig/scanRuns/my-scanRun',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "endTime": "my_endTime",
    *   //   "executionState": "my_executionState",
    *   //   "hasVulnerabilities": false,
    *   //   "name": "my_name",
    *   //   "progressPercent": 0,
    *   //   "resultState": "my_resultState",
    *   //   "startTime": "my_startTime",
    *   //   "urlsCrawledCount": "my_urlsCrawledCount",
    *   //   "urlsTestedCount": "my_urlsTestedCount"
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
  def get(params: ParamsResourceProjectsScanconfigsScanrunsGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceProjectsScanconfigsScanrunsGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaListScanRunsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListScanRunsResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListScanRunsResponse] = js.native
  def list(params: ParamsResourceProjectsScanconfigsScanrunsList): GaxiosPromise[SchemaListScanRunsResponse] = js.native
  def list(
    params: ParamsResourceProjectsScanconfigsScanrunsList,
    callback: BodyResponseCallback[SchemaListScanRunsResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceProjectsScanconfigsScanrunsList,
    options: BodyResponseCallback[Readable | SchemaListScanRunsResponse],
    callback: BodyResponseCallback[Readable | SchemaListScanRunsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceProjectsScanconfigsScanrunsList, options: MethodOptions): GaxiosPromise[SchemaListScanRunsResponse] = js.native
  def list(
    params: ParamsResourceProjectsScanconfigsScanrunsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListScanRunsResponse]
  ): Unit = js.native
  /**
    * Lists ScanRuns under a given ScanConfig, in descending order of ScanRun stop time.
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
    *   const res = await websecurityscanner.projects.scanConfigs.scanRuns.list({
    *     // The maximum number of ScanRuns to return, can be limited by server. If not specified or not positive, the implementation will select a reasonable value.
    *     pageSize: 'placeholder-value',
    *     // A token identifying a page of results to be returned. This should be a `next_page_token` value returned from a previous List request. If unspecified, the first page of results is returned.
    *     pageToken: 'placeholder-value',
    *     // Required. The parent resource name, which should be a scan resource name in the format 'projects/{projectId\}/scanConfigs/{scanConfigId\}'.
    *     parent: 'projects/my-project/scanConfigs/my-scanConfig',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "nextPageToken": "my_nextPageToken",
    *   //   "scanRuns": []
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
  def list(params: ParamsResourceProjectsScanconfigsScanrunsList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceProjectsScanconfigsScanrunsList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def stop(): GaxiosPromise[SchemaScanRun] = js.native
  def stop(callback: BodyResponseCallback[SchemaScanRun]): Unit = js.native
  def stop(params: Unit, options: MethodOptions): GaxiosPromise[SchemaScanRun] = js.native
  def stop(params: ParamsResourceProjectsScanconfigsScanrunsStop): GaxiosPromise[SchemaScanRun] = js.native
  def stop(
    params: ParamsResourceProjectsScanconfigsScanrunsStop,
    callback: BodyResponseCallback[SchemaScanRun]
  ): Unit = js.native
  def stop(
    params: ParamsResourceProjectsScanconfigsScanrunsStop,
    options: BodyResponseCallback[Readable | SchemaScanRun],
    callback: BodyResponseCallback[Readable | SchemaScanRun]
  ): Unit = js.native
  def stop(params: ParamsResourceProjectsScanconfigsScanrunsStop, options: MethodOptions): GaxiosPromise[SchemaScanRun] = js.native
  def stop(
    params: ParamsResourceProjectsScanconfigsScanrunsStop,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaScanRun]
  ): Unit = js.native
  /**
    * Stops a ScanRun. The stopped ScanRun is returned.
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
    *   const res = await websecurityscanner.projects.scanConfigs.scanRuns.stop({
    *     // Required. The resource name of the ScanRun to be stopped. The name follows the format of 'projects/{projectId\}/scanConfigs/{scanConfigId\}/scanRuns/{scanRunId\}'.
    *     name: 'projects/my-project/scanConfigs/my-scanConfig/scanRuns/my-scanRun',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {}
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "endTime": "my_endTime",
    *   //   "executionState": "my_executionState",
    *   //   "hasVulnerabilities": false,
    *   //   "name": "my_name",
    *   //   "progressPercent": 0,
    *   //   "resultState": "my_resultState",
    *   //   "startTime": "my_startTime",
    *   //   "urlsCrawledCount": "my_urlsCrawledCount",
    *   //   "urlsTestedCount": "my_urlsTestedCount"
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
  def stop(params: ParamsResourceProjectsScanconfigsScanrunsStop, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def stop(
    params: ParamsResourceProjectsScanconfigsScanrunsStop,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
