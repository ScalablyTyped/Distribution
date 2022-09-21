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

@JSImport("googleapis/build/src/apis/websecurityscanner/v1alpha", "websecurityscanner_v1alpha.Resource$Projects$Scanconfigs$Scanruns$Findings")
@js.native
open class ResourceProjectsScanconfigsScanrunsFindings protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def get(): GaxiosPromise[SchemaFinding] = js.native
  def get(callback: BodyResponseCallback[SchemaFinding]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaFinding] = js.native
  def get(params: ParamsResourceProjectsScanconfigsScanrunsFindingsGet): GaxiosPromise[SchemaFinding] = js.native
  def get(
    params: ParamsResourceProjectsScanconfigsScanrunsFindingsGet,
    callback: BodyResponseCallback[SchemaFinding]
  ): Unit = js.native
  def get(
    params: ParamsResourceProjectsScanconfigsScanrunsFindingsGet,
    options: BodyResponseCallback[Readable | SchemaFinding],
    callback: BodyResponseCallback[Readable | SchemaFinding]
  ): Unit = js.native
  def get(params: ParamsResourceProjectsScanconfigsScanrunsFindingsGet, options: MethodOptions): GaxiosPromise[SchemaFinding] = js.native
  def get(
    params: ParamsResourceProjectsScanconfigsScanrunsFindingsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaFinding]
  ): Unit = js.native
  /**
    * Gets a Finding.
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
    *     await websecurityscanner.projects.scanConfigs.scanRuns.findings.get({
    *       // Required. The resource name of the Finding to be returned. The name follows the format of 'projects/{projectId\}/scanConfigs/{scanConfigId\}/scanRuns/{scanRunId\}/findings/{findingId\}'.
    *       name: 'projects/my-project/scanConfigs/my-scanConfig/scanRuns/my-scanRun/findings/my-finding',
    *     });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "body": "my_body",
    *   //   "description": "my_description",
    *   //   "finalUrl": "my_finalUrl",
    *   //   "findingType": "my_findingType",
    *   //   "frameUrl": "my_frameUrl",
    *   //   "fuzzedUrl": "my_fuzzedUrl",
    *   //   "httpMethod": "my_httpMethod",
    *   //   "name": "my_name",
    *   //   "outdatedLibrary": {},
    *   //   "reproductionUrl": "my_reproductionUrl",
    *   //   "trackingId": "my_trackingId",
    *   //   "violatingResource": {},
    *   //   "vulnerableHeaders": {},
    *   //   "vulnerableParameters": {},
    *   //   "xss": {}
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
  def get(params: ParamsResourceProjectsScanconfigsScanrunsFindingsGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceProjectsScanconfigsScanrunsFindingsGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaListFindingsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListFindingsResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListFindingsResponse] = js.native
  def list(params: ParamsResourceProjectsScanconfigsScanrunsFindingsList): GaxiosPromise[SchemaListFindingsResponse] = js.native
  def list(
    params: ParamsResourceProjectsScanconfigsScanrunsFindingsList,
    callback: BodyResponseCallback[SchemaListFindingsResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceProjectsScanconfigsScanrunsFindingsList,
    options: BodyResponseCallback[Readable | SchemaListFindingsResponse],
    callback: BodyResponseCallback[Readable | SchemaListFindingsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceProjectsScanconfigsScanrunsFindingsList, options: MethodOptions): GaxiosPromise[SchemaListFindingsResponse] = js.native
  def list(
    params: ParamsResourceProjectsScanconfigsScanrunsFindingsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListFindingsResponse]
  ): Unit = js.native
  /**
    * List Findings under a given ScanRun.
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
    *     await websecurityscanner.projects.scanConfigs.scanRuns.findings.list({
    *       // Required. The filter expression. The expression must be in the format: . Supported field: 'finding_type'. Supported operator: '='.
    *       filter: 'placeholder-value',
    *       // The maximum number of Findings to return, can be limited by server. If not specified or not positive, the implementation will select a reasonable value.
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
    *   //   "findings": [],
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
  def list(params: ParamsResourceProjectsScanconfigsScanrunsFindingsList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceProjectsScanconfigsScanrunsFindingsList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
