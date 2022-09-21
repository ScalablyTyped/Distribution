package typings.googleapis.dialogflowV3Mod.dialogflowV3

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/dialogflow/v3", "dialogflow_v3.Resource$Projects$Locations$Agents$Testcases")
@js.native
open class ResourceProjectsLocationsAgentsTestcases protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  def batchDelete(): GaxiosPromise[SchemaGoogleProtobufEmpty] = js.native
  def batchDelete(callback: BodyResponseCallback[SchemaGoogleProtobufEmpty]): Unit = js.native
  def batchDelete(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleProtobufEmpty] = js.native
  def batchDelete(params: ParamsResourceProjectsLocationsAgentsTestcasesBatchdelete): GaxiosPromise[SchemaGoogleProtobufEmpty] = js.native
  def batchDelete(
    params: ParamsResourceProjectsLocationsAgentsTestcasesBatchdelete,
    callback: BodyResponseCallback[SchemaGoogleProtobufEmpty]
  ): Unit = js.native
  def batchDelete(
    params: ParamsResourceProjectsLocationsAgentsTestcasesBatchdelete,
    options: BodyResponseCallback[Readable | SchemaGoogleProtobufEmpty],
    callback: BodyResponseCallback[Readable | SchemaGoogleProtobufEmpty]
  ): Unit = js.native
  def batchDelete(params: ParamsResourceProjectsLocationsAgentsTestcasesBatchdelete, options: MethodOptions): GaxiosPromise[SchemaGoogleProtobufEmpty] = js.native
  def batchDelete(
    params: ParamsResourceProjectsLocationsAgentsTestcasesBatchdelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleProtobufEmpty]
  ): Unit = js.native
  /**
    * Batch deletes test cases.
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
    * const dialogflow = google.dialogflow('v3');
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
    *   const res = await dialogflow.projects.locations.agents.testCases.batchDelete({
    *     // Required. The agent to delete test cases from. Format: `projects//locations//agents/`.
    *     parent: 'projects/my-project/locations/my-location/agents/my-agent',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "names": []
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {}
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
  def batchDelete(params: ParamsResourceProjectsLocationsAgentsTestcasesBatchdelete, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def batchDelete(
    params: ParamsResourceProjectsLocationsAgentsTestcasesBatchdelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def batchRun(): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def batchRun(callback: BodyResponseCallback[SchemaGoogleLongrunningOperation]): Unit = js.native
  def batchRun(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def batchRun(params: ParamsResourceProjectsLocationsAgentsTestcasesBatchrun): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def batchRun(
    params: ParamsResourceProjectsLocationsAgentsTestcasesBatchrun,
    callback: BodyResponseCallback[SchemaGoogleLongrunningOperation]
  ): Unit = js.native
  def batchRun(
    params: ParamsResourceProjectsLocationsAgentsTestcasesBatchrun,
    options: BodyResponseCallback[Readable | SchemaGoogleLongrunningOperation],
    callback: BodyResponseCallback[Readable | SchemaGoogleLongrunningOperation]
  ): Unit = js.native
  def batchRun(params: ParamsResourceProjectsLocationsAgentsTestcasesBatchrun, options: MethodOptions): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def batchRun(
    params: ParamsResourceProjectsLocationsAgentsTestcasesBatchrun,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleLongrunningOperation]
  ): Unit = js.native
  /**
    * Kicks off a batch run of test cases. This method is a [long-running operation](https://cloud.google.com/dialogflow/cx/docs/how/long-running-operation). The returned `Operation` type has the following method-specific fields: - `metadata`: BatchRunTestCasesMetadata - `response`: BatchRunTestCasesResponse
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
    * const dialogflow = google.dialogflow('v3');
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
    *   const res = await dialogflow.projects.locations.agents.testCases.batchRun({
    *     // Required. Agent name. Format: `projects//locations//agents/ `.
    *     parent: 'projects/my-project/locations/my-location/agents/my-agent',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "environment": "my_environment",
    *       //   "testCases": []
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "done": false,
    *   //   "error": {},
    *   //   "metadata": {},
    *   //   "name": "my_name",
    *   //   "response": {}
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
  def batchRun(params: ParamsResourceProjectsLocationsAgentsTestcasesBatchrun, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def batchRun(
    params: ParamsResourceProjectsLocationsAgentsTestcasesBatchrun,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def calculateCoverage(): GaxiosPromise[SchemaGoogleCloudDialogflowCxV3CalculateCoverageResponse] = js.native
  def calculateCoverage(callback: BodyResponseCallback[SchemaGoogleCloudDialogflowCxV3CalculateCoverageResponse]): Unit = js.native
  def calculateCoverage(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDialogflowCxV3CalculateCoverageResponse] = js.native
  def calculateCoverage(params: ParamsResourceProjectsLocationsAgentsTestcasesCalculatecoverage): GaxiosPromise[SchemaGoogleCloudDialogflowCxV3CalculateCoverageResponse] = js.native
  def calculateCoverage(
    params: ParamsResourceProjectsLocationsAgentsTestcasesCalculatecoverage,
    callback: BodyResponseCallback[SchemaGoogleCloudDialogflowCxV3CalculateCoverageResponse]
  ): Unit = js.native
  def calculateCoverage(
    params: ParamsResourceProjectsLocationsAgentsTestcasesCalculatecoverage,
    options: BodyResponseCallback[Readable | SchemaGoogleCloudDialogflowCxV3CalculateCoverageResponse],
    callback: BodyResponseCallback[Readable | SchemaGoogleCloudDialogflowCxV3CalculateCoverageResponse]
  ): Unit = js.native
  def calculateCoverage(params: ParamsResourceProjectsLocationsAgentsTestcasesCalculatecoverage, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDialogflowCxV3CalculateCoverageResponse] = js.native
  def calculateCoverage(
    params: ParamsResourceProjectsLocationsAgentsTestcasesCalculatecoverage,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudDialogflowCxV3CalculateCoverageResponse]
  ): Unit = js.native
  /**
    * Calculates the test coverage for an agent.
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
    * const dialogflow = google.dialogflow('v3');
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
    *   const res =
    *     await dialogflow.projects.locations.agents.testCases.calculateCoverage({
    *       // Required. The agent to calculate coverage for. Format: `projects//locations//agents/`.
    *       agent: 'projects/my-project/locations/my-location/agents/my-agent',
    *       // Required. The type of coverage requested.
    *       type: 'placeholder-value',
    *     });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "agent": "my_agent",
    *   //   "intentCoverage": {},
    *   //   "routeGroupCoverage": {},
    *   //   "transitionCoverage": {}
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
  def calculateCoverage(
    params: ParamsResourceProjectsLocationsAgentsTestcasesCalculatecoverage,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def calculateCoverage(
    params: ParamsResourceProjectsLocationsAgentsTestcasesCalculatecoverage,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  var context: APIRequestContext = js.native
  
  def create(): GaxiosPromise[SchemaGoogleCloudDialogflowCxV3TestCase] = js.native
  def create(callback: BodyResponseCallback[SchemaGoogleCloudDialogflowCxV3TestCase]): Unit = js.native
  def create(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDialogflowCxV3TestCase] = js.native
  def create(params: ParamsResourceProjectsLocationsAgentsTestcasesCreate): GaxiosPromise[SchemaGoogleCloudDialogflowCxV3TestCase] = js.native
  def create(
    params: ParamsResourceProjectsLocationsAgentsTestcasesCreate,
    callback: BodyResponseCallback[SchemaGoogleCloudDialogflowCxV3TestCase]
  ): Unit = js.native
  def create(
    params: ParamsResourceProjectsLocationsAgentsTestcasesCreate,
    options: BodyResponseCallback[Readable | SchemaGoogleCloudDialogflowCxV3TestCase],
    callback: BodyResponseCallback[Readable | SchemaGoogleCloudDialogflowCxV3TestCase]
  ): Unit = js.native
  def create(params: ParamsResourceProjectsLocationsAgentsTestcasesCreate, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDialogflowCxV3TestCase] = js.native
  def create(
    params: ParamsResourceProjectsLocationsAgentsTestcasesCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudDialogflowCxV3TestCase]
  ): Unit = js.native
  /**
    * Creates a test case for the given agent.
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
    * const dialogflow = google.dialogflow('v3');
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
    *   const res = await dialogflow.projects.locations.agents.testCases.create({
    *     // Required. The agent to create the test case for. Format: `projects//locations//agents/`.
    *     parent: 'projects/my-project/locations/my-location/agents/my-agent',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "creationTime": "my_creationTime",
    *       //   "displayName": "my_displayName",
    *       //   "lastTestResult": {},
    *       //   "name": "my_name",
    *       //   "notes": "my_notes",
    *       //   "tags": [],
    *       //   "testCaseConversationTurns": [],
    *       //   "testConfig": {}
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "creationTime": "my_creationTime",
    *   //   "displayName": "my_displayName",
    *   //   "lastTestResult": {},
    *   //   "name": "my_name",
    *   //   "notes": "my_notes",
    *   //   "tags": [],
    *   //   "testCaseConversationTurns": [],
    *   //   "testConfig": {}
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
  def create(params: ParamsResourceProjectsLocationsAgentsTestcasesCreate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def create(
    params: ParamsResourceProjectsLocationsAgentsTestcasesCreate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def `export`(): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def `export`(callback: BodyResponseCallback[SchemaGoogleLongrunningOperation]): Unit = js.native
  def `export`(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def `export`(params: ParamsResourceProjectsLocationsAgentsTestcasesExport): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def `export`(
    params: ParamsResourceProjectsLocationsAgentsTestcasesExport,
    callback: BodyResponseCallback[SchemaGoogleLongrunningOperation]
  ): Unit = js.native
  def `export`(
    params: ParamsResourceProjectsLocationsAgentsTestcasesExport,
    options: BodyResponseCallback[Readable | SchemaGoogleLongrunningOperation],
    callback: BodyResponseCallback[Readable | SchemaGoogleLongrunningOperation]
  ): Unit = js.native
  def `export`(params: ParamsResourceProjectsLocationsAgentsTestcasesExport, options: MethodOptions): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def `export`(
    params: ParamsResourceProjectsLocationsAgentsTestcasesExport,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleLongrunningOperation]
  ): Unit = js.native
  /**
    * Exports the test cases under the agent to a Cloud Storage bucket or a local file. Filter can be applied to export a subset of test cases. This method is a [long-running operation](https://cloud.google.com/dialogflow/cx/docs/how/long-running-operation). The returned `Operation` type has the following method-specific fields: - `metadata`: ExportTestCasesMetadata - `response`: ExportTestCasesResponse
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
    * const dialogflow = google.dialogflow('v3');
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
    *   const res = await dialogflow.projects.locations.agents.testCases.export({
    *     // Required. The agent where to export test cases from. Format: `projects//locations//agents/`.
    *     parent: 'projects/my-project/locations/my-location/agents/my-agent',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "dataFormat": "my_dataFormat",
    *       //   "filter": "my_filter",
    *       //   "gcsUri": "my_gcsUri"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "done": false,
    *   //   "error": {},
    *   //   "metadata": {},
    *   //   "name": "my_name",
    *   //   "response": {}
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
  def `export`(params: ParamsResourceProjectsLocationsAgentsTestcasesExport, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def `export`(
    params: ParamsResourceProjectsLocationsAgentsTestcasesExport,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def get(): GaxiosPromise[SchemaGoogleCloudDialogflowCxV3TestCase] = js.native
  def get(callback: BodyResponseCallback[SchemaGoogleCloudDialogflowCxV3TestCase]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDialogflowCxV3TestCase] = js.native
  def get(params: ParamsResourceProjectsLocationsAgentsTestcasesGet): GaxiosPromise[SchemaGoogleCloudDialogflowCxV3TestCase] = js.native
  def get(
    params: ParamsResourceProjectsLocationsAgentsTestcasesGet,
    callback: BodyResponseCallback[SchemaGoogleCloudDialogflowCxV3TestCase]
  ): Unit = js.native
  def get(
    params: ParamsResourceProjectsLocationsAgentsTestcasesGet,
    options: BodyResponseCallback[Readable | SchemaGoogleCloudDialogflowCxV3TestCase],
    callback: BodyResponseCallback[Readable | SchemaGoogleCloudDialogflowCxV3TestCase]
  ): Unit = js.native
  def get(params: ParamsResourceProjectsLocationsAgentsTestcasesGet, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDialogflowCxV3TestCase] = js.native
  def get(
    params: ParamsResourceProjectsLocationsAgentsTestcasesGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudDialogflowCxV3TestCase]
  ): Unit = js.native
  /**
    * Gets a test case.
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
    * const dialogflow = google.dialogflow('v3');
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
    *   const res = await dialogflow.projects.locations.agents.testCases.get({
    *     // Required. The name of the testcase. Format: `projects//locations//agents//testCases/`.
    *     name: 'projects/my-project/locations/my-location/agents/my-agent/testCases/my-testCase',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "creationTime": "my_creationTime",
    *   //   "displayName": "my_displayName",
    *   //   "lastTestResult": {},
    *   //   "name": "my_name",
    *   //   "notes": "my_notes",
    *   //   "tags": [],
    *   //   "testCaseConversationTurns": [],
    *   //   "testConfig": {}
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
  def get(params: ParamsResourceProjectsLocationsAgentsTestcasesGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceProjectsLocationsAgentsTestcasesGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def `import`(): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def `import`(callback: BodyResponseCallback[SchemaGoogleLongrunningOperation]): Unit = js.native
  def `import`(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def `import`(params: ParamsResourceProjectsLocationsAgentsTestcasesImport): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def `import`(
    params: ParamsResourceProjectsLocationsAgentsTestcasesImport,
    callback: BodyResponseCallback[SchemaGoogleLongrunningOperation]
  ): Unit = js.native
  def `import`(
    params: ParamsResourceProjectsLocationsAgentsTestcasesImport,
    options: BodyResponseCallback[Readable | SchemaGoogleLongrunningOperation],
    callback: BodyResponseCallback[Readable | SchemaGoogleLongrunningOperation]
  ): Unit = js.native
  def `import`(params: ParamsResourceProjectsLocationsAgentsTestcasesImport, options: MethodOptions): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def `import`(
    params: ParamsResourceProjectsLocationsAgentsTestcasesImport,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleLongrunningOperation]
  ): Unit = js.native
  /**
    * Imports the test cases from a Cloud Storage bucket or a local file. It always creates new test cases and won't overwrite any existing ones. The provided ID in the imported test case is neglected. This method is a [long-running operation](https://cloud.google.com/dialogflow/cx/docs/how/long-running-operation). The returned `Operation` type has the following method-specific fields: - `metadata`: ImportTestCasesMetadata - `response`: ImportTestCasesResponse
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
    * const dialogflow = google.dialogflow('v3');
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
    *   const res = await dialogflow.projects.locations.agents.testCases.import({
    *     // Required. The agent to import test cases to. Format: `projects//locations//agents/`.
    *     parent: 'projects/my-project/locations/my-location/agents/my-agent',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "content": "my_content",
    *       //   "gcsUri": "my_gcsUri"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "done": false,
    *   //   "error": {},
    *   //   "metadata": {},
    *   //   "name": "my_name",
    *   //   "response": {}
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
  def `import`(params: ParamsResourceProjectsLocationsAgentsTestcasesImport, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def `import`(
    params: ParamsResourceProjectsLocationsAgentsTestcasesImport,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaGoogleCloudDialogflowCxV3ListTestCasesResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaGoogleCloudDialogflowCxV3ListTestCasesResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDialogflowCxV3ListTestCasesResponse] = js.native
  def list(params: ParamsResourceProjectsLocationsAgentsTestcasesList): GaxiosPromise[SchemaGoogleCloudDialogflowCxV3ListTestCasesResponse] = js.native
  def list(
    params: ParamsResourceProjectsLocationsAgentsTestcasesList,
    callback: BodyResponseCallback[SchemaGoogleCloudDialogflowCxV3ListTestCasesResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceProjectsLocationsAgentsTestcasesList,
    options: BodyResponseCallback[Readable | SchemaGoogleCloudDialogflowCxV3ListTestCasesResponse],
    callback: BodyResponseCallback[Readable | SchemaGoogleCloudDialogflowCxV3ListTestCasesResponse]
  ): Unit = js.native
  def list(params: ParamsResourceProjectsLocationsAgentsTestcasesList, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDialogflowCxV3ListTestCasesResponse] = js.native
  def list(
    params: ParamsResourceProjectsLocationsAgentsTestcasesList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudDialogflowCxV3ListTestCasesResponse]
  ): Unit = js.native
  /**
    * Fetches a list of test cases for a given agent.
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
    * const dialogflow = google.dialogflow('v3');
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
    *   const res = await dialogflow.projects.locations.agents.testCases.list({
    *     // The maximum number of items to return in a single page. By default 20. Note that when TestCaseView = FULL, the maximum page size allowed is 20. When TestCaseView = BASIC, the maximum page size allowed is 500.
    *     pageSize: 'placeholder-value',
    *     // The next_page_token value returned from a previous list request.
    *     pageToken: 'placeholder-value',
    *     // Required. The agent to list all pages for. Format: `projects//locations//agents/`.
    *     parent: 'projects/my-project/locations/my-location/agents/my-agent',
    *     // Specifies whether response should include all fields or just the metadata.
    *     view: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "nextPageToken": "my_nextPageToken",
    *   //   "testCases": []
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
  def list(params: ParamsResourceProjectsLocationsAgentsTestcasesList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceProjectsLocationsAgentsTestcasesList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def patch(): GaxiosPromise[SchemaGoogleCloudDialogflowCxV3TestCase] = js.native
  def patch(callback: BodyResponseCallback[SchemaGoogleCloudDialogflowCxV3TestCase]): Unit = js.native
  def patch(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDialogflowCxV3TestCase] = js.native
  def patch(params: ParamsResourceProjectsLocationsAgentsTestcasesPatch): GaxiosPromise[SchemaGoogleCloudDialogflowCxV3TestCase] = js.native
  def patch(
    params: ParamsResourceProjectsLocationsAgentsTestcasesPatch,
    callback: BodyResponseCallback[SchemaGoogleCloudDialogflowCxV3TestCase]
  ): Unit = js.native
  def patch(
    params: ParamsResourceProjectsLocationsAgentsTestcasesPatch,
    options: BodyResponseCallback[Readable | SchemaGoogleCloudDialogflowCxV3TestCase],
    callback: BodyResponseCallback[Readable | SchemaGoogleCloudDialogflowCxV3TestCase]
  ): Unit = js.native
  def patch(params: ParamsResourceProjectsLocationsAgentsTestcasesPatch, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDialogflowCxV3TestCase] = js.native
  def patch(
    params: ParamsResourceProjectsLocationsAgentsTestcasesPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudDialogflowCxV3TestCase]
  ): Unit = js.native
  /**
    * Updates the specified test case.
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
    * const dialogflow = google.dialogflow('v3');
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
    *   const res = await dialogflow.projects.locations.agents.testCases.patch({
    *     // The unique identifier of the test case. TestCases.CreateTestCase will populate the name automatically. Otherwise use format: `projects//locations//agents/ /testCases/`.
    *     name: 'projects/my-project/locations/my-location/agents/my-agent/testCases/my-testCase',
    *     // Required. The mask to specify which fields should be updated. The `creationTime` and `lastTestResult` cannot be updated.
    *     updateMask: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "creationTime": "my_creationTime",
    *       //   "displayName": "my_displayName",
    *       //   "lastTestResult": {},
    *       //   "name": "my_name",
    *       //   "notes": "my_notes",
    *       //   "tags": [],
    *       //   "testCaseConversationTurns": [],
    *       //   "testConfig": {}
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "creationTime": "my_creationTime",
    *   //   "displayName": "my_displayName",
    *   //   "lastTestResult": {},
    *   //   "name": "my_name",
    *   //   "notes": "my_notes",
    *   //   "tags": [],
    *   //   "testCaseConversationTurns": [],
    *   //   "testConfig": {}
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
  def patch(params: ParamsResourceProjectsLocationsAgentsTestcasesPatch, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def patch(
    params: ParamsResourceProjectsLocationsAgentsTestcasesPatch,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  var results: ResourceProjectsLocationsAgentsTestcasesResults = js.native
  
  def run(): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def run(callback: BodyResponseCallback[SchemaGoogleLongrunningOperation]): Unit = js.native
  def run(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def run(params: ParamsResourceProjectsLocationsAgentsTestcasesRun): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def run(
    params: ParamsResourceProjectsLocationsAgentsTestcasesRun,
    callback: BodyResponseCallback[SchemaGoogleLongrunningOperation]
  ): Unit = js.native
  def run(
    params: ParamsResourceProjectsLocationsAgentsTestcasesRun,
    options: BodyResponseCallback[Readable | SchemaGoogleLongrunningOperation],
    callback: BodyResponseCallback[Readable | SchemaGoogleLongrunningOperation]
  ): Unit = js.native
  def run(params: ParamsResourceProjectsLocationsAgentsTestcasesRun, options: MethodOptions): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def run(
    params: ParamsResourceProjectsLocationsAgentsTestcasesRun,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleLongrunningOperation]
  ): Unit = js.native
  /**
    * Kicks off a test case run. This method is a [long-running operation](https://cloud.google.com/dialogflow/cx/docs/how/long-running-operation). The returned `Operation` type has the following method-specific fields: - `metadata`: RunTestCaseMetadata - `response`: RunTestCaseResponse
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
    * const dialogflow = google.dialogflow('v3');
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
    *   const res = await dialogflow.projects.locations.agents.testCases.run({
    *     // Required. Format of test case name to run: `projects//locations/ /agents//testCases/`.
    *     name: 'projects/my-project/locations/my-location/agents/my-agent/testCases/my-testCase',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "environment": "my_environment"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "done": false,
    *   //   "error": {},
    *   //   "metadata": {},
    *   //   "name": "my_name",
    *   //   "response": {}
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
  def run(params: ParamsResourceProjectsLocationsAgentsTestcasesRun, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def run(
    params: ParamsResourceProjectsLocationsAgentsTestcasesRun,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
