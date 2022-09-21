package typings.googleapis.toolresultsV1beta3Mod.toolresultsV1beta3

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/toolresults/v1beta3", "toolresults_v1beta3.Resource$Projects$Histories$Executions$Steps")
@js.native
open class ResourceProjectsHistoriesExecutionsSteps protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  def accessibilityClusters(): GaxiosPromise[SchemaListStepAccessibilityClustersResponse] = js.native
  def accessibilityClusters(callback: BodyResponseCallback[SchemaListStepAccessibilityClustersResponse]): Unit = js.native
  def accessibilityClusters(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListStepAccessibilityClustersResponse] = js.native
  def accessibilityClusters(params: ParamsResourceProjectsHistoriesExecutionsStepsAccessibilityclusters): GaxiosPromise[SchemaListStepAccessibilityClustersResponse] = js.native
  def accessibilityClusters(
    params: ParamsResourceProjectsHistoriesExecutionsStepsAccessibilityclusters,
    callback: BodyResponseCallback[SchemaListStepAccessibilityClustersResponse]
  ): Unit = js.native
  def accessibilityClusters(
    params: ParamsResourceProjectsHistoriesExecutionsStepsAccessibilityclusters,
    options: BodyResponseCallback[Readable | SchemaListStepAccessibilityClustersResponse],
    callback: BodyResponseCallback[Readable | SchemaListStepAccessibilityClustersResponse]
  ): Unit = js.native
  def accessibilityClusters(
    params: ParamsResourceProjectsHistoriesExecutionsStepsAccessibilityclusters,
    options: MethodOptions
  ): GaxiosPromise[SchemaListStepAccessibilityClustersResponse] = js.native
  def accessibilityClusters(
    params: ParamsResourceProjectsHistoriesExecutionsStepsAccessibilityclusters,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListStepAccessibilityClustersResponse]
  ): Unit = js.native
  /**
    * Lists accessibility clusters for a given Step May return any of the following canonical error codes: - PERMISSION_DENIED - if the user is not authorized to read project - INVALID_ARGUMENT - if the request is malformed - FAILED_PRECONDITION - if an argument in the request happens to be invalid; e.g. if the locale format is incorrect - NOT_FOUND - if the containing Step does not exist
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/toolresults.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const toolresults = google.toolresults('v1beta3');
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
    *     await toolresults.projects.histories.executions.steps.accessibilityClusters(
    *       {
    *         // The accepted format is the canonical Unicode format with hyphen as a delimiter. Language must be lowercase, Language Script - Capitalized, Region - UPPERCASE. See http://www.unicode.org/reports/tr35/#Unicode_locale_identifier for details. Required.
    *         locale: 'placeholder-value',
    *         // A full resource name of the step. For example, projects/my-project/histories/bh.1234567890abcdef/executions/ 1234567890123456789/steps/bs.1234567890abcdef Required.
    *         name: 'projects/my-project/histories/my-historie/executions/my-execution/steps/my-step',
    *       }
    *     );
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "clusters": [],
    *   //   "name": "my_name"
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
  def accessibilityClusters(
    params: ParamsResourceProjectsHistoriesExecutionsStepsAccessibilityclusters,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def accessibilityClusters(
    params: ParamsResourceProjectsHistoriesExecutionsStepsAccessibilityclusters,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  var context: APIRequestContext = js.native
  
  def create(): GaxiosPromise[SchemaStep] = js.native
  def create(callback: BodyResponseCallback[SchemaStep]): Unit = js.native
  def create(params: Unit, options: MethodOptions): GaxiosPromise[SchemaStep] = js.native
  def create(params: ParamsResourceProjectsHistoriesExecutionsStepsCreate): GaxiosPromise[SchemaStep] = js.native
  def create(
    params: ParamsResourceProjectsHistoriesExecutionsStepsCreate,
    callback: BodyResponseCallback[SchemaStep]
  ): Unit = js.native
  def create(
    params: ParamsResourceProjectsHistoriesExecutionsStepsCreate,
    options: BodyResponseCallback[Readable | SchemaStep],
    callback: BodyResponseCallback[Readable | SchemaStep]
  ): Unit = js.native
  def create(params: ParamsResourceProjectsHistoriesExecutionsStepsCreate, options: MethodOptions): GaxiosPromise[SchemaStep] = js.native
  def create(
    params: ParamsResourceProjectsHistoriesExecutionsStepsCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaStep]
  ): Unit = js.native
  /**
    * Creates a Step. The returned Step will have the id set. May return any of the following canonical error codes: - PERMISSION_DENIED - if the user is not authorized to write to project - INVALID_ARGUMENT - if the request is malformed - FAILED_PRECONDITION - if the step is too large (more than 10Mib) - NOT_FOUND - if the containing Execution does not exist
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/toolresults.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const toolresults = google.toolresults('v1beta3');
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
    *   const res = await toolresults.projects.histories.executions.steps.create({
    *     // Required. An Execution id.
    *     executionId: 'placeholder-value',
    *     // Required. A History id.
    *     historyId: 'placeholder-value',
    *     // Required. A Project id.
    *     projectId: 'placeholder-value',
    *     // A unique request ID for server to detect duplicated requests. For example, a UUID. Optional, but strongly recommended.
    *     requestId: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "completionTime": {},
    *       //   "creationTime": {},
    *       //   "description": "my_description",
    *       //   "deviceUsageDuration": {},
    *       //   "dimensionValue": [],
    *       //   "hasImages": false,
    *       //   "labels": [],
    *       //   "multiStep": {},
    *       //   "name": "my_name",
    *       //   "outcome": {},
    *       //   "runDuration": {},
    *       //   "state": "my_state",
    *       //   "stepId": "my_stepId",
    *       //   "testExecutionStep": {},
    *       //   "toolExecutionStep": {}
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "completionTime": {},
    *   //   "creationTime": {},
    *   //   "description": "my_description",
    *   //   "deviceUsageDuration": {},
    *   //   "dimensionValue": [],
    *   //   "hasImages": false,
    *   //   "labels": [],
    *   //   "multiStep": {},
    *   //   "name": "my_name",
    *   //   "outcome": {},
    *   //   "runDuration": {},
    *   //   "state": "my_state",
    *   //   "stepId": "my_stepId",
    *   //   "testExecutionStep": {},
    *   //   "toolExecutionStep": {}
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
  def create(params: ParamsResourceProjectsHistoriesExecutionsStepsCreate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def create(
    params: ParamsResourceProjectsHistoriesExecutionsStepsCreate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def get(): GaxiosPromise[SchemaStep] = js.native
  def get(callback: BodyResponseCallback[SchemaStep]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaStep] = js.native
  def get(params: ParamsResourceProjectsHistoriesExecutionsStepsGet): GaxiosPromise[SchemaStep] = js.native
  def get(
    params: ParamsResourceProjectsHistoriesExecutionsStepsGet,
    callback: BodyResponseCallback[SchemaStep]
  ): Unit = js.native
  def get(
    params: ParamsResourceProjectsHistoriesExecutionsStepsGet,
    options: BodyResponseCallback[Readable | SchemaStep],
    callback: BodyResponseCallback[Readable | SchemaStep]
  ): Unit = js.native
  def get(params: ParamsResourceProjectsHistoriesExecutionsStepsGet, options: MethodOptions): GaxiosPromise[SchemaStep] = js.native
  def get(
    params: ParamsResourceProjectsHistoriesExecutionsStepsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaStep]
  ): Unit = js.native
  /**
    * Gets a Step. May return any of the following canonical error codes: - PERMISSION_DENIED - if the user is not authorized to read project - INVALID_ARGUMENT - if the request is malformed - NOT_FOUND - if the Step does not exist
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/toolresults.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const toolresults = google.toolresults('v1beta3');
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
    *   const res = await toolresults.projects.histories.executions.steps.get({
    *     // A Execution id. Required.
    *     executionId: 'placeholder-value',
    *     // A History id. Required.
    *     historyId: 'placeholder-value',
    *     // A Project id. Required.
    *     projectId: 'placeholder-value',
    *     // A Step id. Required.
    *     stepId: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "completionTime": {},
    *   //   "creationTime": {},
    *   //   "description": "my_description",
    *   //   "deviceUsageDuration": {},
    *   //   "dimensionValue": [],
    *   //   "hasImages": false,
    *   //   "labels": [],
    *   //   "multiStep": {},
    *   //   "name": "my_name",
    *   //   "outcome": {},
    *   //   "runDuration": {},
    *   //   "state": "my_state",
    *   //   "stepId": "my_stepId",
    *   //   "testExecutionStep": {},
    *   //   "toolExecutionStep": {}
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
  def get(params: ParamsResourceProjectsHistoriesExecutionsStepsGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceProjectsHistoriesExecutionsStepsGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def getPerfMetricsSummary(): GaxiosPromise[SchemaPerfMetricsSummary] = js.native
  def getPerfMetricsSummary(callback: BodyResponseCallback[SchemaPerfMetricsSummary]): Unit = js.native
  def getPerfMetricsSummary(params: Unit, options: MethodOptions): GaxiosPromise[SchemaPerfMetricsSummary] = js.native
  def getPerfMetricsSummary(params: ParamsResourceProjectsHistoriesExecutionsStepsGetperfmetricssummary): GaxiosPromise[SchemaPerfMetricsSummary] = js.native
  def getPerfMetricsSummary(
    params: ParamsResourceProjectsHistoriesExecutionsStepsGetperfmetricssummary,
    callback: BodyResponseCallback[SchemaPerfMetricsSummary]
  ): Unit = js.native
  def getPerfMetricsSummary(
    params: ParamsResourceProjectsHistoriesExecutionsStepsGetperfmetricssummary,
    options: BodyResponseCallback[Readable | SchemaPerfMetricsSummary],
    callback: BodyResponseCallback[Readable | SchemaPerfMetricsSummary]
  ): Unit = js.native
  def getPerfMetricsSummary(
    params: ParamsResourceProjectsHistoriesExecutionsStepsGetperfmetricssummary,
    options: MethodOptions
  ): GaxiosPromise[SchemaPerfMetricsSummary] = js.native
  def getPerfMetricsSummary(
    params: ParamsResourceProjectsHistoriesExecutionsStepsGetperfmetricssummary,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaPerfMetricsSummary]
  ): Unit = js.native
  /**
    * Retrieves a PerfMetricsSummary. May return any of the following error code(s): - NOT_FOUND - The specified PerfMetricsSummary does not exist
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/toolresults.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const toolresults = google.toolresults('v1beta3');
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
    *     await toolresults.projects.histories.executions.steps.getPerfMetricsSummary(
    *       {
    *         // A tool results execution ID.
    *         executionId: 'placeholder-value',
    *         // A tool results history ID.
    *         historyId: 'placeholder-value',
    *         // The cloud project
    *         projectId: 'placeholder-value',
    *         // A tool results step ID.
    *         stepId: 'placeholder-value',
    *       }
    *     );
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "appStartTime": {},
    *   //   "executionId": "my_executionId",
    *   //   "graphicsStats": {},
    *   //   "historyId": "my_historyId",
    *   //   "perfEnvironment": {},
    *   //   "perfMetrics": [],
    *   //   "projectId": "my_projectId",
    *   //   "stepId": "my_stepId"
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
  def getPerfMetricsSummary(
    params: ParamsResourceProjectsHistoriesExecutionsStepsGetperfmetricssummary,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def getPerfMetricsSummary(
    params: ParamsResourceProjectsHistoriesExecutionsStepsGetperfmetricssummary,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaListStepsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListStepsResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListStepsResponse] = js.native
  def list(params: ParamsResourceProjectsHistoriesExecutionsStepsList): GaxiosPromise[SchemaListStepsResponse] = js.native
  def list(
    params: ParamsResourceProjectsHistoriesExecutionsStepsList,
    callback: BodyResponseCallback[SchemaListStepsResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceProjectsHistoriesExecutionsStepsList,
    options: BodyResponseCallback[Readable | SchemaListStepsResponse],
    callback: BodyResponseCallback[Readable | SchemaListStepsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceProjectsHistoriesExecutionsStepsList, options: MethodOptions): GaxiosPromise[SchemaListStepsResponse] = js.native
  def list(
    params: ParamsResourceProjectsHistoriesExecutionsStepsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListStepsResponse]
  ): Unit = js.native
  /**
    * Lists Steps for a given Execution. The steps are sorted by creation_time in descending order. The step_id key will be used to order the steps with the same creation_time. May return any of the following canonical error codes: - PERMISSION_DENIED - if the user is not authorized to read project - INVALID_ARGUMENT - if the request is malformed - FAILED_PRECONDITION - if an argument in the request happens to be invalid; e.g. if an attempt is made to list the children of a nonexistent Step - NOT_FOUND - if the containing Execution does not exist
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/toolresults.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const toolresults = google.toolresults('v1beta3');
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
    *   const res = await toolresults.projects.histories.executions.steps.list({
    *     // A Execution id. Required.
    *     executionId: 'placeholder-value',
    *     // A History id. Required.
    *     historyId: 'placeholder-value',
    *     // The maximum number of Steps to fetch. Default value: 25. The server will use this default if the field is not set or has a value of 0. Optional.
    *     pageSize: 'placeholder-value',
    *     // A continuation token to resume the query at the next item. Optional.
    *     pageToken: 'placeholder-value',
    *     // A Project id. Required.
    *     projectId: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "nextPageToken": "my_nextPageToken",
    *   //   "steps": []
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
  def list(params: ParamsResourceProjectsHistoriesExecutionsStepsList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceProjectsHistoriesExecutionsStepsList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def patch(): GaxiosPromise[SchemaStep] = js.native
  def patch(callback: BodyResponseCallback[SchemaStep]): Unit = js.native
  def patch(params: Unit, options: MethodOptions): GaxiosPromise[SchemaStep] = js.native
  def patch(params: ParamsResourceProjectsHistoriesExecutionsStepsPatch): GaxiosPromise[SchemaStep] = js.native
  def patch(
    params: ParamsResourceProjectsHistoriesExecutionsStepsPatch,
    callback: BodyResponseCallback[SchemaStep]
  ): Unit = js.native
  def patch(
    params: ParamsResourceProjectsHistoriesExecutionsStepsPatch,
    options: BodyResponseCallback[Readable | SchemaStep],
    callback: BodyResponseCallback[Readable | SchemaStep]
  ): Unit = js.native
  def patch(params: ParamsResourceProjectsHistoriesExecutionsStepsPatch, options: MethodOptions): GaxiosPromise[SchemaStep] = js.native
  def patch(
    params: ParamsResourceProjectsHistoriesExecutionsStepsPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaStep]
  ): Unit = js.native
  /**
    * Updates an existing Step with the supplied partial entity. May return any of the following canonical error codes: - PERMISSION_DENIED - if the user is not authorized to write project - INVALID_ARGUMENT - if the request is malformed - FAILED_PRECONDITION - if the requested state transition is illegal (e.g try to upload a duplicate xml file), if the updated step is too large (more than 10Mib) - NOT_FOUND - if the containing Execution does not exist
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/toolresults.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const toolresults = google.toolresults('v1beta3');
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
    *   const res = await toolresults.projects.histories.executions.steps.patch({
    *     // A Execution id. Required.
    *     executionId: 'placeholder-value',
    *     // A History id. Required.
    *     historyId: 'placeholder-value',
    *     // A Project id. Required.
    *     projectId: 'placeholder-value',
    *     // A unique request ID for server to detect duplicated requests. For example, a UUID. Optional, but strongly recommended.
    *     requestId: 'placeholder-value',
    *     // A Step id. Required.
    *     stepId: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "completionTime": {},
    *       //   "creationTime": {},
    *       //   "description": "my_description",
    *       //   "deviceUsageDuration": {},
    *       //   "dimensionValue": [],
    *       //   "hasImages": false,
    *       //   "labels": [],
    *       //   "multiStep": {},
    *       //   "name": "my_name",
    *       //   "outcome": {},
    *       //   "runDuration": {},
    *       //   "state": "my_state",
    *       //   "stepId": "my_stepId",
    *       //   "testExecutionStep": {},
    *       //   "toolExecutionStep": {}
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "completionTime": {},
    *   //   "creationTime": {},
    *   //   "description": "my_description",
    *   //   "deviceUsageDuration": {},
    *   //   "dimensionValue": [],
    *   //   "hasImages": false,
    *   //   "labels": [],
    *   //   "multiStep": {},
    *   //   "name": "my_name",
    *   //   "outcome": {},
    *   //   "runDuration": {},
    *   //   "state": "my_state",
    *   //   "stepId": "my_stepId",
    *   //   "testExecutionStep": {},
    *   //   "toolExecutionStep": {}
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
  def patch(params: ParamsResourceProjectsHistoriesExecutionsStepsPatch, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def patch(
    params: ParamsResourceProjectsHistoriesExecutionsStepsPatch,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  var perfMetricsSummary: ResourceProjectsHistoriesExecutionsStepsPerfmetricssummary = js.native
  
  var perfSampleSeries: ResourceProjectsHistoriesExecutionsStepsPerfsampleseries = js.native
  
  def publishXunitXmlFiles(): GaxiosPromise[SchemaStep] = js.native
  def publishXunitXmlFiles(callback: BodyResponseCallback[SchemaStep]): Unit = js.native
  def publishXunitXmlFiles(params: Unit, options: MethodOptions): GaxiosPromise[SchemaStep] = js.native
  def publishXunitXmlFiles(params: ParamsResourceProjectsHistoriesExecutionsStepsPublishxunitxmlfiles): GaxiosPromise[SchemaStep] = js.native
  def publishXunitXmlFiles(
    params: ParamsResourceProjectsHistoriesExecutionsStepsPublishxunitxmlfiles,
    callback: BodyResponseCallback[SchemaStep]
  ): Unit = js.native
  def publishXunitXmlFiles(
    params: ParamsResourceProjectsHistoriesExecutionsStepsPublishxunitxmlfiles,
    options: BodyResponseCallback[Readable | SchemaStep],
    callback: BodyResponseCallback[Readable | SchemaStep]
  ): Unit = js.native
  def publishXunitXmlFiles(params: ParamsResourceProjectsHistoriesExecutionsStepsPublishxunitxmlfiles, options: MethodOptions): GaxiosPromise[SchemaStep] = js.native
  def publishXunitXmlFiles(
    params: ParamsResourceProjectsHistoriesExecutionsStepsPublishxunitxmlfiles,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaStep]
  ): Unit = js.native
  /**
    * Publish xml files to an existing Step. May return any of the following canonical error codes: - PERMISSION_DENIED - if the user is not authorized to write project - INVALID_ARGUMENT - if the request is malformed - FAILED_PRECONDITION - if the requested state transition is illegal, e.g try to upload a duplicate xml file or a file too large. - NOT_FOUND - if the containing Execution does not exist
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/toolresults.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const toolresults = google.toolresults('v1beta3');
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
    *     await toolresults.projects.histories.executions.steps.publishXunitXmlFiles({
    *       // A Execution id. Required.
    *       executionId: 'placeholder-value',
    *       // A History id. Required.
    *       historyId: 'placeholder-value',
    *       // A Project id. Required.
    *       projectId: 'placeholder-value',
    *       // A Step id. Note: This step must include a TestExecutionStep. Required.
    *       stepId: 'placeholder-value',
    *
    *       // Request body metadata
    *       requestBody: {
    *         // request body parameters
    *         // {
    *         //   "xunitXmlFiles": []
    *         // }
    *       },
    *     });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "completionTime": {},
    *   //   "creationTime": {},
    *   //   "description": "my_description",
    *   //   "deviceUsageDuration": {},
    *   //   "dimensionValue": [],
    *   //   "hasImages": false,
    *   //   "labels": [],
    *   //   "multiStep": {},
    *   //   "name": "my_name",
    *   //   "outcome": {},
    *   //   "runDuration": {},
    *   //   "state": "my_state",
    *   //   "stepId": "my_stepId",
    *   //   "testExecutionStep": {},
    *   //   "toolExecutionStep": {}
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
  def publishXunitXmlFiles(
    params: ParamsResourceProjectsHistoriesExecutionsStepsPublishxunitxmlfiles,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def publishXunitXmlFiles(
    params: ParamsResourceProjectsHistoriesExecutionsStepsPublishxunitxmlfiles,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  var testCases: ResourceProjectsHistoriesExecutionsStepsTestcases = js.native
  
  var thumbnails: ResourceProjectsHistoriesExecutionsStepsThumbnails = js.native
}
