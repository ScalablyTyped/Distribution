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

@JSImport("googleapis/build/src/apis/toolresults/v1beta3", "toolresults_v1beta3.Resource$Projects$Histories$Executions")
@js.native
open class ResourceProjectsHistoriesExecutions protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var clusters: ResourceProjectsHistoriesExecutionsClusters = js.native
  
  var context: APIRequestContext = js.native
  
  def create(): GaxiosPromise[SchemaExecution] = js.native
  def create(callback: BodyResponseCallback[SchemaExecution]): Unit = js.native
  def create(params: Unit, options: MethodOptions): GaxiosPromise[SchemaExecution] = js.native
  def create(params: ParamsResourceProjectsHistoriesExecutionsCreate): GaxiosPromise[SchemaExecution] = js.native
  def create(
    params: ParamsResourceProjectsHistoriesExecutionsCreate,
    callback: BodyResponseCallback[SchemaExecution]
  ): Unit = js.native
  def create(
    params: ParamsResourceProjectsHistoriesExecutionsCreate,
    options: BodyResponseCallback[Readable | SchemaExecution],
    callback: BodyResponseCallback[Readable | SchemaExecution]
  ): Unit = js.native
  def create(params: ParamsResourceProjectsHistoriesExecutionsCreate, options: MethodOptions): GaxiosPromise[SchemaExecution] = js.native
  def create(
    params: ParamsResourceProjectsHistoriesExecutionsCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaExecution]
  ): Unit = js.native
  /**
    * Creates an Execution. The returned Execution will have the id set. May return any of the following canonical error codes: - PERMISSION_DENIED - if the user is not authorized to write to project - INVALID_ARGUMENT - if the request is malformed - NOT_FOUND - if the containing History does not exist
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
    *   const res = await toolresults.projects.histories.executions.create({
    *     // A History id. Required.
    *     historyId: 'placeholder-value',
    *     // A Project id. Required.
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
    *       //   "dimensionDefinitions": [],
    *       //   "executionId": "my_executionId",
    *       //   "outcome": {},
    *       //   "specification": {},
    *       //   "state": "my_state",
    *       //   "testExecutionMatrixId": "my_testExecutionMatrixId"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "completionTime": {},
    *   //   "creationTime": {},
    *   //   "dimensionDefinitions": [],
    *   //   "executionId": "my_executionId",
    *   //   "outcome": {},
    *   //   "specification": {},
    *   //   "state": "my_state",
    *   //   "testExecutionMatrixId": "my_testExecutionMatrixId"
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
  def create(params: ParamsResourceProjectsHistoriesExecutionsCreate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def create(
    params: ParamsResourceProjectsHistoriesExecutionsCreate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  var environments: ResourceProjectsHistoriesExecutionsEnvironments = js.native
  
  def get(): GaxiosPromise[SchemaExecution] = js.native
  def get(callback: BodyResponseCallback[SchemaExecution]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaExecution] = js.native
  def get(params: ParamsResourceProjectsHistoriesExecutionsGet): GaxiosPromise[SchemaExecution] = js.native
  def get(
    params: ParamsResourceProjectsHistoriesExecutionsGet,
    callback: BodyResponseCallback[SchemaExecution]
  ): Unit = js.native
  def get(
    params: ParamsResourceProjectsHistoriesExecutionsGet,
    options: BodyResponseCallback[Readable | SchemaExecution],
    callback: BodyResponseCallback[Readable | SchemaExecution]
  ): Unit = js.native
  def get(params: ParamsResourceProjectsHistoriesExecutionsGet, options: MethodOptions): GaxiosPromise[SchemaExecution] = js.native
  def get(
    params: ParamsResourceProjectsHistoriesExecutionsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaExecution]
  ): Unit = js.native
  /**
    * Gets an Execution. May return any of the following canonical error codes: - PERMISSION_DENIED - if the user is not authorized to write to project - INVALID_ARGUMENT - if the request is malformed - NOT_FOUND - if the Execution does not exist
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
    *   const res = await toolresults.projects.histories.executions.get({
    *     // An Execution id. Required.
    *     executionId: 'placeholder-value',
    *     // A History id. Required.
    *     historyId: 'placeholder-value',
    *     // A Project id. Required.
    *     projectId: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "completionTime": {},
    *   //   "creationTime": {},
    *   //   "dimensionDefinitions": [],
    *   //   "executionId": "my_executionId",
    *   //   "outcome": {},
    *   //   "specification": {},
    *   //   "state": "my_state",
    *   //   "testExecutionMatrixId": "my_testExecutionMatrixId"
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
  def get(params: ParamsResourceProjectsHistoriesExecutionsGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceProjectsHistoriesExecutionsGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaListExecutionsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListExecutionsResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListExecutionsResponse] = js.native
  def list(params: ParamsResourceProjectsHistoriesExecutionsList): GaxiosPromise[SchemaListExecutionsResponse] = js.native
  def list(
    params: ParamsResourceProjectsHistoriesExecutionsList,
    callback: BodyResponseCallback[SchemaListExecutionsResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceProjectsHistoriesExecutionsList,
    options: BodyResponseCallback[Readable | SchemaListExecutionsResponse],
    callback: BodyResponseCallback[Readable | SchemaListExecutionsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceProjectsHistoriesExecutionsList, options: MethodOptions): GaxiosPromise[SchemaListExecutionsResponse] = js.native
  def list(
    params: ParamsResourceProjectsHistoriesExecutionsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListExecutionsResponse]
  ): Unit = js.native
  /**
    * Lists Executions for a given History. The executions are sorted by creation_time in descending order. The execution_id key will be used to order the executions with the same creation_time. May return any of the following canonical error codes: - PERMISSION_DENIED - if the user is not authorized to read project - INVALID_ARGUMENT - if the request is malformed - NOT_FOUND - if the containing History does not exist
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
    *   const res = await toolresults.projects.histories.executions.list({
    *     // A History id. Required.
    *     historyId: 'placeholder-value',
    *     // The maximum number of Executions to fetch. Default value: 25. The server will use this default if the field is not set or has a value of 0. Optional.
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
    *   //   "executions": [],
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
  def list(params: ParamsResourceProjectsHistoriesExecutionsList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceProjectsHistoriesExecutionsList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def patch(): GaxiosPromise[SchemaExecution] = js.native
  def patch(callback: BodyResponseCallback[SchemaExecution]): Unit = js.native
  def patch(params: Unit, options: MethodOptions): GaxiosPromise[SchemaExecution] = js.native
  def patch(params: ParamsResourceProjectsHistoriesExecutionsPatch): GaxiosPromise[SchemaExecution] = js.native
  def patch(
    params: ParamsResourceProjectsHistoriesExecutionsPatch,
    callback: BodyResponseCallback[SchemaExecution]
  ): Unit = js.native
  def patch(
    params: ParamsResourceProjectsHistoriesExecutionsPatch,
    options: BodyResponseCallback[Readable | SchemaExecution],
    callback: BodyResponseCallback[Readable | SchemaExecution]
  ): Unit = js.native
  def patch(params: ParamsResourceProjectsHistoriesExecutionsPatch, options: MethodOptions): GaxiosPromise[SchemaExecution] = js.native
  def patch(
    params: ParamsResourceProjectsHistoriesExecutionsPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaExecution]
  ): Unit = js.native
  /**
    * Updates an existing Execution with the supplied partial entity. May return any of the following canonical error codes: - PERMISSION_DENIED - if the user is not authorized to write to project - INVALID_ARGUMENT - if the request is malformed - FAILED_PRECONDITION - if the requested state transition is illegal - NOT_FOUND - if the containing History does not exist
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
    *   const res = await toolresults.projects.histories.executions.patch({
    *     // Required.
    *     executionId: 'placeholder-value',
    *     // Required.
    *     historyId: 'placeholder-value',
    *     // A Project id. Required.
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
    *       //   "dimensionDefinitions": [],
    *       //   "executionId": "my_executionId",
    *       //   "outcome": {},
    *       //   "specification": {},
    *       //   "state": "my_state",
    *       //   "testExecutionMatrixId": "my_testExecutionMatrixId"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "completionTime": {},
    *   //   "creationTime": {},
    *   //   "dimensionDefinitions": [],
    *   //   "executionId": "my_executionId",
    *   //   "outcome": {},
    *   //   "specification": {},
    *   //   "state": "my_state",
    *   //   "testExecutionMatrixId": "my_testExecutionMatrixId"
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
  def patch(params: ParamsResourceProjectsHistoriesExecutionsPatch, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def patch(
    params: ParamsResourceProjectsHistoriesExecutionsPatch,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  var steps: ResourceProjectsHistoriesExecutionsSteps = js.native
}
