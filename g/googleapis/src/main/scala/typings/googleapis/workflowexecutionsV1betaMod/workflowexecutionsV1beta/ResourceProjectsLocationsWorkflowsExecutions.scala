package typings.googleapis.workflowexecutionsV1betaMod.workflowexecutionsV1beta

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/workflowexecutions/v1beta", "workflowexecutions_v1beta.Resource$Projects$Locations$Workflows$Executions")
@js.native
open class ResourceProjectsLocationsWorkflowsExecutions protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  def cancel(): GaxiosPromise[SchemaExecution] = js.native
  def cancel(callback: BodyResponseCallback[SchemaExecution]): Unit = js.native
  def cancel(params: Unit, options: MethodOptions): GaxiosPromise[SchemaExecution] = js.native
  def cancel(params: ParamsResourceProjectsLocationsWorkflowsExecutionsCancel): GaxiosPromise[SchemaExecution] = js.native
  def cancel(
    params: ParamsResourceProjectsLocationsWorkflowsExecutionsCancel,
    callback: BodyResponseCallback[SchemaExecution]
  ): Unit = js.native
  def cancel(
    params: ParamsResourceProjectsLocationsWorkflowsExecutionsCancel,
    options: BodyResponseCallback[Readable | SchemaExecution],
    callback: BodyResponseCallback[Readable | SchemaExecution]
  ): Unit = js.native
  def cancel(params: ParamsResourceProjectsLocationsWorkflowsExecutionsCancel, options: MethodOptions): GaxiosPromise[SchemaExecution] = js.native
  def cancel(
    params: ParamsResourceProjectsLocationsWorkflowsExecutionsCancel,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaExecution]
  ): Unit = js.native
  /**
    * Cancels an execution of the given name.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/workflowexecutions.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const workflowexecutions = google.workflowexecutions('v1beta');
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
    *     await workflowexecutions.projects.locations.workflows.executions.cancel({
    *       // Required. Name of the execution to be cancelled. Format: projects/{project\}/locations/{location\}/workflows/{workflow\}/executions/{execution\}
    *       name: 'projects/my-project/locations/my-location/workflows/my-workflow/executions/my-execution',
    *
    *       // Request body metadata
    *       requestBody: {
    *         // request body parameters
    *         // {}
    *       },
    *     });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "argument": "my_argument",
    *   //   "callLogLevel": "my_callLogLevel",
    *   //   "endTime": "my_endTime",
    *   //   "error": {},
    *   //   "name": "my_name",
    *   //   "result": "my_result",
    *   //   "startTime": "my_startTime",
    *   //   "state": "my_state",
    *   //   "workflowRevisionId": "my_workflowRevisionId"
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
  def cancel(params: ParamsResourceProjectsLocationsWorkflowsExecutionsCancel, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def cancel(
    params: ParamsResourceProjectsLocationsWorkflowsExecutionsCancel,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  var context: APIRequestContext = js.native
  
  def create(): GaxiosPromise[SchemaExecution] = js.native
  def create(callback: BodyResponseCallback[SchemaExecution]): Unit = js.native
  def create(params: Unit, options: MethodOptions): GaxiosPromise[SchemaExecution] = js.native
  def create(params: ParamsResourceProjectsLocationsWorkflowsExecutionsCreate): GaxiosPromise[SchemaExecution] = js.native
  def create(
    params: ParamsResourceProjectsLocationsWorkflowsExecutionsCreate,
    callback: BodyResponseCallback[SchemaExecution]
  ): Unit = js.native
  def create(
    params: ParamsResourceProjectsLocationsWorkflowsExecutionsCreate,
    options: BodyResponseCallback[Readable | SchemaExecution],
    callback: BodyResponseCallback[Readable | SchemaExecution]
  ): Unit = js.native
  def create(params: ParamsResourceProjectsLocationsWorkflowsExecutionsCreate, options: MethodOptions): GaxiosPromise[SchemaExecution] = js.native
  def create(
    params: ParamsResourceProjectsLocationsWorkflowsExecutionsCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaExecution]
  ): Unit = js.native
  /**
    * Creates a new execution using the latest revision of the given workflow.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/workflowexecutions.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const workflowexecutions = google.workflowexecutions('v1beta');
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
    *     await workflowexecutions.projects.locations.workflows.executions.create({
    *       // Required. Name of the workflow for which an execution should be created. Format: projects/{project\}/locations/{location\}/workflows/{workflow\} The latest revision of the workflow will be used.
    *       parent: 'projects/my-project/locations/my-location/workflows/my-workflow',
    *
    *       // Request body metadata
    *       requestBody: {
    *         // request body parameters
    *         // {
    *         //   "argument": "my_argument",
    *         //   "callLogLevel": "my_callLogLevel",
    *         //   "endTime": "my_endTime",
    *         //   "error": {},
    *         //   "name": "my_name",
    *         //   "result": "my_result",
    *         //   "startTime": "my_startTime",
    *         //   "state": "my_state",
    *         //   "workflowRevisionId": "my_workflowRevisionId"
    *         // }
    *       },
    *     });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "argument": "my_argument",
    *   //   "callLogLevel": "my_callLogLevel",
    *   //   "endTime": "my_endTime",
    *   //   "error": {},
    *   //   "name": "my_name",
    *   //   "result": "my_result",
    *   //   "startTime": "my_startTime",
    *   //   "state": "my_state",
    *   //   "workflowRevisionId": "my_workflowRevisionId"
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
  def create(params: ParamsResourceProjectsLocationsWorkflowsExecutionsCreate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def create(
    params: ParamsResourceProjectsLocationsWorkflowsExecutionsCreate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def get(): GaxiosPromise[SchemaExecution] = js.native
  def get(callback: BodyResponseCallback[SchemaExecution]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaExecution] = js.native
  def get(params: ParamsResourceProjectsLocationsWorkflowsExecutionsGet): GaxiosPromise[SchemaExecution] = js.native
  def get(
    params: ParamsResourceProjectsLocationsWorkflowsExecutionsGet,
    callback: BodyResponseCallback[SchemaExecution]
  ): Unit = js.native
  def get(
    params: ParamsResourceProjectsLocationsWorkflowsExecutionsGet,
    options: BodyResponseCallback[Readable | SchemaExecution],
    callback: BodyResponseCallback[Readable | SchemaExecution]
  ): Unit = js.native
  def get(params: ParamsResourceProjectsLocationsWorkflowsExecutionsGet, options: MethodOptions): GaxiosPromise[SchemaExecution] = js.native
  def get(
    params: ParamsResourceProjectsLocationsWorkflowsExecutionsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaExecution]
  ): Unit = js.native
  /**
    * Returns an execution of the given name.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/workflowexecutions.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const workflowexecutions = google.workflowexecutions('v1beta');
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
    *     await workflowexecutions.projects.locations.workflows.executions.get({
    *       // Required. Name of the execution to be retrieved. Format: projects/{project\}/locations/{location\}/workflows/{workflow\}/executions/{execution\}
    *       name: 'projects/my-project/locations/my-location/workflows/my-workflow/executions/my-execution',
    *       // Optional. A view defining which fields should be filled in the returned execution. The API will default to the FULL view.
    *       view: 'placeholder-value',
    *     });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "argument": "my_argument",
    *   //   "callLogLevel": "my_callLogLevel",
    *   //   "endTime": "my_endTime",
    *   //   "error": {},
    *   //   "name": "my_name",
    *   //   "result": "my_result",
    *   //   "startTime": "my_startTime",
    *   //   "state": "my_state",
    *   //   "workflowRevisionId": "my_workflowRevisionId"
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
  def get(params: ParamsResourceProjectsLocationsWorkflowsExecutionsGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceProjectsLocationsWorkflowsExecutionsGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaListExecutionsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListExecutionsResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListExecutionsResponse] = js.native
  def list(params: ParamsResourceProjectsLocationsWorkflowsExecutionsList): GaxiosPromise[SchemaListExecutionsResponse] = js.native
  def list(
    params: ParamsResourceProjectsLocationsWorkflowsExecutionsList,
    callback: BodyResponseCallback[SchemaListExecutionsResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceProjectsLocationsWorkflowsExecutionsList,
    options: BodyResponseCallback[Readable | SchemaListExecutionsResponse],
    callback: BodyResponseCallback[Readable | SchemaListExecutionsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceProjectsLocationsWorkflowsExecutionsList, options: MethodOptions): GaxiosPromise[SchemaListExecutionsResponse] = js.native
  def list(
    params: ParamsResourceProjectsLocationsWorkflowsExecutionsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListExecutionsResponse]
  ): Unit = js.native
  /**
    * Returns a list of executions which belong to the workflow with the given name. The method returns executions of all workflow revisions. Returned executions are ordered by their start time (newest first).
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/workflowexecutions.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const workflowexecutions = google.workflowexecutions('v1beta');
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
    *     await workflowexecutions.projects.locations.workflows.executions.list({
    *       // Maximum number of executions to return per call. Max supported value depends on the selected Execution view: it's 10000 for BASIC and 100 for FULL. The default value used if the field is not specified is 100, regardless of the selected view. Values greater than the max value will be coerced down to it.
    *       pageSize: 'placeholder-value',
    *       // A page token, received from a previous `ListExecutions` call. Provide this to retrieve the subsequent page. When paginating, all other parameters provided to `ListExecutions` must match the call that provided the page token.
    *       pageToken: 'placeholder-value',
    *       // Required. Name of the workflow for which the executions should be listed. Format: projects/{project\}/locations/{location\}/workflows/{workflow\}
    *       parent: 'projects/my-project/locations/my-location/workflows/my-workflow',
    *       // Optional. A view defining which fields should be filled in the returned executions. The API will default to the BASIC view.
    *       view: 'placeholder-value',
    *     });
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
  def list(params: ParamsResourceProjectsLocationsWorkflowsExecutionsList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceProjectsLocationsWorkflowsExecutionsList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
