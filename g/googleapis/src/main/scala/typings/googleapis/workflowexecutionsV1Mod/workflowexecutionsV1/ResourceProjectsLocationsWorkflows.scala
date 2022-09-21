package typings.googleapis.workflowexecutionsV1Mod.workflowexecutionsV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/workflowexecutions/v1", "workflowexecutions_v1.Resource$Projects$Locations$Workflows")
@js.native
open class ResourceProjectsLocationsWorkflows protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  var executions: ResourceProjectsLocationsWorkflowsExecutions = js.native
  
  def triggerPubsubExecution(): GaxiosPromise[SchemaExecution] = js.native
  def triggerPubsubExecution(callback: BodyResponseCallback[SchemaExecution]): Unit = js.native
  def triggerPubsubExecution(params: Unit, options: MethodOptions): GaxiosPromise[SchemaExecution] = js.native
  def triggerPubsubExecution(params: ParamsResourceProjectsLocationsWorkflowsTriggerpubsubexecution): GaxiosPromise[SchemaExecution] = js.native
  def triggerPubsubExecution(
    params: ParamsResourceProjectsLocationsWorkflowsTriggerpubsubexecution,
    callback: BodyResponseCallback[SchemaExecution]
  ): Unit = js.native
  def triggerPubsubExecution(
    params: ParamsResourceProjectsLocationsWorkflowsTriggerpubsubexecution,
    options: BodyResponseCallback[Readable | SchemaExecution],
    callback: BodyResponseCallback[Readable | SchemaExecution]
  ): Unit = js.native
  def triggerPubsubExecution(params: ParamsResourceProjectsLocationsWorkflowsTriggerpubsubexecution, options: MethodOptions): GaxiosPromise[SchemaExecution] = js.native
  def triggerPubsubExecution(
    params: ParamsResourceProjectsLocationsWorkflowsTriggerpubsubexecution,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaExecution]
  ): Unit = js.native
  /**
    * Triggers a new execution using the latest revision of the given workflow by a Pub/Sub push notification.
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
    * const workflowexecutions = google.workflowexecutions('v1');
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
    *     await workflowexecutions.projects.locations.workflows.triggerPubsubExecution(
    *       {
    *         // Required. Name of the workflow for which an execution should be created. Format: projects/{project\}/locations/{location\}/workflows/{workflow\}
    *         workflow:
    *           'projects/my-project/locations/my-location/workflows/my-workflow',
    *
    *         // Request body metadata
    *         requestBody: {
    *           // request body parameters
    *           // {
    *           //   "GCPCloudEventsMode": "my_GCPCloudEventsMode",
    *           //   "message": {},
    *           //   "subscription": "my_subscription"
    *           // }
    *         },
    *       }
    *     );
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
  def triggerPubsubExecution(
    params: ParamsResourceProjectsLocationsWorkflowsTriggerpubsubexecution,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def triggerPubsubExecution(
    params: ParamsResourceProjectsLocationsWorkflowsTriggerpubsubexecution,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
