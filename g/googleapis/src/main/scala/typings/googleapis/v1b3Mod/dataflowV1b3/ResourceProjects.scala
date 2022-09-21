package typings.googleapis.v1b3Mod.dataflowV1b3

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/dataflow/v1b3", "dataflow_v1b3.Resource$Projects")
@js.native
open class ResourceProjects protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def deleteSnapshots(): GaxiosPromise[SchemaDeleteSnapshotResponse] = js.native
  def deleteSnapshots(callback: BodyResponseCallback[SchemaDeleteSnapshotResponse]): Unit = js.native
  def deleteSnapshots(params: Unit, options: MethodOptions): GaxiosPromise[SchemaDeleteSnapshotResponse] = js.native
  def deleteSnapshots(params: ParamsResourceProjectsDeletesnapshots): GaxiosPromise[SchemaDeleteSnapshotResponse] = js.native
  def deleteSnapshots(
    params: ParamsResourceProjectsDeletesnapshots,
    callback: BodyResponseCallback[SchemaDeleteSnapshotResponse]
  ): Unit = js.native
  def deleteSnapshots(
    params: ParamsResourceProjectsDeletesnapshots,
    options: BodyResponseCallback[Readable | SchemaDeleteSnapshotResponse],
    callback: BodyResponseCallback[Readable | SchemaDeleteSnapshotResponse]
  ): Unit = js.native
  def deleteSnapshots(params: ParamsResourceProjectsDeletesnapshots, options: MethodOptions): GaxiosPromise[SchemaDeleteSnapshotResponse] = js.native
  def deleteSnapshots(
    params: ParamsResourceProjectsDeletesnapshots,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaDeleteSnapshotResponse]
  ): Unit = js.native
  /**
    * Deletes a snapshot.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/dataflow.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const dataflow = google.dataflow('v1b3');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/cloud-platform',
    *       'https://www.googleapis.com/auth/compute',
    *       'https://www.googleapis.com/auth/compute.readonly',
    *       'https://www.googleapis.com/auth/userinfo.email',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await dataflow.projects.deleteSnapshots({
    *     // The location that contains this snapshot.
    *     location: 'placeholder-value',
    *     // The ID of the Cloud Platform project that the snapshot belongs to.
    *     projectId: 'placeholder-value',
    *     // The ID of the snapshot.
    *     snapshotId: 'placeholder-value',
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
  def deleteSnapshots(params: ParamsResourceProjectsDeletesnapshots, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def deleteSnapshots(
    params: ParamsResourceProjectsDeletesnapshots,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  var jobs: ResourceProjectsJobs = js.native
  
  var locations: ResourceProjectsLocations = js.native
  
  var snapshots: ResourceProjectsSnapshots = js.native
  
  var templates: ResourceProjectsTemplates = js.native
  
  def workerMessages(): GaxiosPromise[SchemaSendWorkerMessagesResponse] = js.native
  def workerMessages(callback: BodyResponseCallback[SchemaSendWorkerMessagesResponse]): Unit = js.native
  def workerMessages(params: Unit, options: MethodOptions): GaxiosPromise[SchemaSendWorkerMessagesResponse] = js.native
  def workerMessages(params: ParamsResourceProjectsWorkermessages): GaxiosPromise[SchemaSendWorkerMessagesResponse] = js.native
  def workerMessages(
    params: ParamsResourceProjectsWorkermessages,
    callback: BodyResponseCallback[SchemaSendWorkerMessagesResponse]
  ): Unit = js.native
  def workerMessages(
    params: ParamsResourceProjectsWorkermessages,
    options: BodyResponseCallback[Readable | SchemaSendWorkerMessagesResponse],
    callback: BodyResponseCallback[Readable | SchemaSendWorkerMessagesResponse]
  ): Unit = js.native
  def workerMessages(params: ParamsResourceProjectsWorkermessages, options: MethodOptions): GaxiosPromise[SchemaSendWorkerMessagesResponse] = js.native
  def workerMessages(
    params: ParamsResourceProjectsWorkermessages,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaSendWorkerMessagesResponse]
  ): Unit = js.native
  /**
    * Send a worker_message to the service.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/dataflow.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const dataflow = google.dataflow('v1b3');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/cloud-platform',
    *       'https://www.googleapis.com/auth/compute',
    *       'https://www.googleapis.com/auth/compute.readonly',
    *       'https://www.googleapis.com/auth/userinfo.email',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await dataflow.projects.workerMessages({
    *     // The project to send the WorkerMessages to.
    *     projectId: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "location": "my_location",
    *       //   "workerMessages": []
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "workerMessageResponses": []
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
  def workerMessages(params: ParamsResourceProjectsWorkermessages, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def workerMessages(
    params: ParamsResourceProjectsWorkermessages,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
