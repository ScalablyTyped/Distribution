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

@JSImport("googleapis/build/src/apis/dataflow/v1b3", "dataflow_v1b3.Resource$Projects$Locations$Jobs$Debug")
@js.native
open class ResourceProjectsLocationsJobsDebug protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def getConfig(): GaxiosPromise[SchemaGetDebugConfigResponse] = js.native
  def getConfig(callback: BodyResponseCallback[SchemaGetDebugConfigResponse]): Unit = js.native
  def getConfig(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGetDebugConfigResponse] = js.native
  def getConfig(params: ParamsResourceProjectsLocationsJobsDebugGetconfig): GaxiosPromise[SchemaGetDebugConfigResponse] = js.native
  def getConfig(
    params: ParamsResourceProjectsLocationsJobsDebugGetconfig,
    callback: BodyResponseCallback[SchemaGetDebugConfigResponse]
  ): Unit = js.native
  def getConfig(
    params: ParamsResourceProjectsLocationsJobsDebugGetconfig,
    options: BodyResponseCallback[Readable | SchemaGetDebugConfigResponse],
    callback: BodyResponseCallback[Readable | SchemaGetDebugConfigResponse]
  ): Unit = js.native
  def getConfig(params: ParamsResourceProjectsLocationsJobsDebugGetconfig, options: MethodOptions): GaxiosPromise[SchemaGetDebugConfigResponse] = js.native
  def getConfig(
    params: ParamsResourceProjectsLocationsJobsDebugGetconfig,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGetDebugConfigResponse]
  ): Unit = js.native
  /**
    * Get encoded debug configuration for component. Not cacheable.
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
    *   const res = await dataflow.projects.locations.jobs.debug.getConfig({
    *     // The job id.
    *     jobId: 'placeholder-value',
    *     // The [regional endpoint] (https://cloud.google.com/dataflow/docs/concepts/regional-endpoints) that contains the job specified by job_id.
    *     location: 'placeholder-value',
    *     // The project id.
    *     projectId: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "componentId": "my_componentId",
    *       //   "location": "my_location",
    *       //   "workerId": "my_workerId"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "config": "my_config"
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
  def getConfig(params: ParamsResourceProjectsLocationsJobsDebugGetconfig, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def getConfig(
    params: ParamsResourceProjectsLocationsJobsDebugGetconfig,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def sendCapture(): GaxiosPromise[SchemaSendDebugCaptureResponse] = js.native
  def sendCapture(callback: BodyResponseCallback[SchemaSendDebugCaptureResponse]): Unit = js.native
  def sendCapture(params: Unit, options: MethodOptions): GaxiosPromise[SchemaSendDebugCaptureResponse] = js.native
  def sendCapture(params: ParamsResourceProjectsLocationsJobsDebugSendcapture): GaxiosPromise[SchemaSendDebugCaptureResponse] = js.native
  def sendCapture(
    params: ParamsResourceProjectsLocationsJobsDebugSendcapture,
    callback: BodyResponseCallback[SchemaSendDebugCaptureResponse]
  ): Unit = js.native
  def sendCapture(
    params: ParamsResourceProjectsLocationsJobsDebugSendcapture,
    options: BodyResponseCallback[Readable | SchemaSendDebugCaptureResponse],
    callback: BodyResponseCallback[Readable | SchemaSendDebugCaptureResponse]
  ): Unit = js.native
  def sendCapture(params: ParamsResourceProjectsLocationsJobsDebugSendcapture, options: MethodOptions): GaxiosPromise[SchemaSendDebugCaptureResponse] = js.native
  def sendCapture(
    params: ParamsResourceProjectsLocationsJobsDebugSendcapture,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaSendDebugCaptureResponse]
  ): Unit = js.native
  /**
    * Send encoded debug capture data for component.
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
    *   const res = await dataflow.projects.locations.jobs.debug.sendCapture({
    *     // The job id.
    *     jobId: 'placeholder-value',
    *     // The [regional endpoint] (https://cloud.google.com/dataflow/docs/concepts/regional-endpoints) that contains the job specified by job_id.
    *     location: 'placeholder-value',
    *     // The project id.
    *     projectId: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "componentId": "my_componentId",
    *       //   "data": "my_data",
    *       //   "dataFormat": "my_dataFormat",
    *       //   "location": "my_location",
    *       //   "workerId": "my_workerId"
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
  def sendCapture(params: ParamsResourceProjectsLocationsJobsDebugSendcapture, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def sendCapture(
    params: ParamsResourceProjectsLocationsJobsDebugSendcapture,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
