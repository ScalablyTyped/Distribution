package typings.googleapis.v3beta1Mod.dialogflowV3beta1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/dialogflow/v3beta1", "dialogflow_v3beta1.Resource$Projects$Locations$Agents$Testcases$Results")
@js.native
open class ResourceProjectsLocationsAgentsTestcasesResults protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def get(): GaxiosPromise[SchemaGoogleCloudDialogflowCxV3beta1TestCaseResult] = js.native
  def get(callback: BodyResponseCallback[SchemaGoogleCloudDialogflowCxV3beta1TestCaseResult]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDialogflowCxV3beta1TestCaseResult] = js.native
  def get(params: ParamsResourceProjectsLocationsAgentsTestcasesResultsGet): GaxiosPromise[SchemaGoogleCloudDialogflowCxV3beta1TestCaseResult] = js.native
  def get(
    params: ParamsResourceProjectsLocationsAgentsTestcasesResultsGet,
    callback: BodyResponseCallback[SchemaGoogleCloudDialogflowCxV3beta1TestCaseResult]
  ): Unit = js.native
  def get(
    params: ParamsResourceProjectsLocationsAgentsTestcasesResultsGet,
    options: BodyResponseCallback[Readable | SchemaGoogleCloudDialogflowCxV3beta1TestCaseResult],
    callback: BodyResponseCallback[Readable | SchemaGoogleCloudDialogflowCxV3beta1TestCaseResult]
  ): Unit = js.native
  def get(params: ParamsResourceProjectsLocationsAgentsTestcasesResultsGet, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDialogflowCxV3beta1TestCaseResult] = js.native
  def get(
    params: ParamsResourceProjectsLocationsAgentsTestcasesResultsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudDialogflowCxV3beta1TestCaseResult]
  ): Unit = js.native
  /**
    * Gets a test case result.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/dialogflow.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const dialogflow = google.dialogflow('v3beta1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/cloud-platform',
    *       'https://www.googleapis.com/auth/dialogflow',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await dialogflow.projects.locations.agents.testCases.results.get({
    *     // Required. The name of the testcase. Format: `projects//locations//agents//testCases//results/`.
    *     name: 'projects/my-project/locations/my-location/agents/my-agent/testCases/my-testCase/results/my-result',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "conversationTurns": [],
    *   //   "environment": "my_environment",
    *   //   "name": "my_name",
    *   //   "testResult": "my_testResult",
    *   //   "testTime": "my_testTime"
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
  def get(params: ParamsResourceProjectsLocationsAgentsTestcasesResultsGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceProjectsLocationsAgentsTestcasesResultsGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaGoogleCloudDialogflowCxV3beta1ListTestCaseResultsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaGoogleCloudDialogflowCxV3beta1ListTestCaseResultsResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDialogflowCxV3beta1ListTestCaseResultsResponse] = js.native
  def list(params: ParamsResourceProjectsLocationsAgentsTestcasesResultsList): GaxiosPromise[SchemaGoogleCloudDialogflowCxV3beta1ListTestCaseResultsResponse] = js.native
  def list(
    params: ParamsResourceProjectsLocationsAgentsTestcasesResultsList,
    callback: BodyResponseCallback[SchemaGoogleCloudDialogflowCxV3beta1ListTestCaseResultsResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceProjectsLocationsAgentsTestcasesResultsList,
    options: BodyResponseCallback[Readable | SchemaGoogleCloudDialogflowCxV3beta1ListTestCaseResultsResponse],
    callback: BodyResponseCallback[Readable | SchemaGoogleCloudDialogflowCxV3beta1ListTestCaseResultsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceProjectsLocationsAgentsTestcasesResultsList, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDialogflowCxV3beta1ListTestCaseResultsResponse] = js.native
  def list(
    params: ParamsResourceProjectsLocationsAgentsTestcasesResultsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudDialogflowCxV3beta1ListTestCaseResultsResponse]
  ): Unit = js.native
  /**
    * Fetches a list of results for a given test case.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/dialogflow.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const dialogflow = google.dialogflow('v3beta1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/cloud-platform',
    *       'https://www.googleapis.com/auth/dialogflow',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await dialogflow.projects.locations.agents.testCases.results.list(
    *     {
    *       // The filter expression used to filter test case results. See [API Filtering](https://aip.dev/160). The expression is case insensitive. Only 'AND' is supported for logical operators. The supported syntax is listed below in detail: [AND ] ... [AND latest] The supported fields and operators are: field operator `environment` `=`, `IN` (Use value `draft` for draft environment) `test_time` `\>`, `<` `latest` only returns the latest test result in all results for each test case. Examples: * "environment=draft AND latest" matches the latest test result for each test case in the draft environment. * "environment IN (e1,e2)" matches any test case results with an environment resource name of either "e1" or "e2". * "test_time \> 1602540713" matches any test case results with test time later than a unix timestamp in seconds 1602540713.
    *       filter: 'placeholder-value',
    *       // The maximum number of items to return in a single page. By default 100 and at most 1000.
    *       pageSize: 'placeholder-value',
    *       // The next_page_token value returned from a previous list request.
    *       pageToken: 'placeholder-value',
    *       // Required. The test case to list results for. Format: `projects//locations//agents// testCases/`. Specify a `-` as a wildcard for TestCase ID to list results across multiple test cases.
    *       parent:
    *         'projects/my-project/locations/my-location/agents/my-agent/testCases/my-testCase',
    *     }
    *   );
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "nextPageToken": "my_nextPageToken",
    *   //   "testCaseResults": []
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
  def list(params: ParamsResourceProjectsLocationsAgentsTestcasesResultsList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceProjectsLocationsAgentsTestcasesResultsList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
