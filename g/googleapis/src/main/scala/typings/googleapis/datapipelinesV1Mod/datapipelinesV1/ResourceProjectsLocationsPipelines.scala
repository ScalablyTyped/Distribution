package typings.googleapis.datapipelinesV1Mod.datapipelinesV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/datapipelines/v1", "datapipelines_v1.Resource$Projects$Locations$Pipelines")
@js.native
open class ResourceProjectsLocationsPipelines protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def create(): GaxiosPromise[SchemaGoogleCloudDatapipelinesV1Pipeline] = js.native
  def create(callback: BodyResponseCallback[SchemaGoogleCloudDatapipelinesV1Pipeline]): Unit = js.native
  def create(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDatapipelinesV1Pipeline] = js.native
  def create(params: ParamsResourceProjectsLocationsPipelinesCreate): GaxiosPromise[SchemaGoogleCloudDatapipelinesV1Pipeline] = js.native
  def create(
    params: ParamsResourceProjectsLocationsPipelinesCreate,
    callback: BodyResponseCallback[SchemaGoogleCloudDatapipelinesV1Pipeline]
  ): Unit = js.native
  def create(
    params: ParamsResourceProjectsLocationsPipelinesCreate,
    options: BodyResponseCallback[Readable | SchemaGoogleCloudDatapipelinesV1Pipeline],
    callback: BodyResponseCallback[Readable | SchemaGoogleCloudDatapipelinesV1Pipeline]
  ): Unit = js.native
  def create(params: ParamsResourceProjectsLocationsPipelinesCreate, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDatapipelinesV1Pipeline] = js.native
  def create(
    params: ParamsResourceProjectsLocationsPipelinesCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudDatapipelinesV1Pipeline]
  ): Unit = js.native
  /**
    * Creates a pipeline. For a batch pipeline, you can pass scheduler information. Data Pipelines uses the scheduler information to create an internal scheduler that runs jobs periodically. If the internal scheduler is not configured, you can use RunPipeline to run jobs.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/datapipelines.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const datapipelines = google.datapipelines('v1');
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
    *   const res = await datapipelines.projects.locations.pipelines.create({
    *     // Required. The location name. For example: `projects/PROJECT_ID/locations/LOCATION_ID`.
    *     parent: 'projects/my-project/locations/my-location',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "createTime": "my_createTime",
    *       //   "displayName": "my_displayName",
    *       //   "jobCount": 0,
    *       //   "lastUpdateTime": "my_lastUpdateTime",
    *       //   "name": "my_name",
    *       //   "pipelineSources": {},
    *       //   "scheduleInfo": {},
    *       //   "schedulerServiceAccountEmail": "my_schedulerServiceAccountEmail",
    *       //   "state": "my_state",
    *       //   "type": "my_type",
    *       //   "workload": {}
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "createTime": "my_createTime",
    *   //   "displayName": "my_displayName",
    *   //   "jobCount": 0,
    *   //   "lastUpdateTime": "my_lastUpdateTime",
    *   //   "name": "my_name",
    *   //   "pipelineSources": {},
    *   //   "scheduleInfo": {},
    *   //   "schedulerServiceAccountEmail": "my_schedulerServiceAccountEmail",
    *   //   "state": "my_state",
    *   //   "type": "my_type",
    *   //   "workload": {}
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
  def create(params: ParamsResourceProjectsLocationsPipelinesCreate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def create(
    params: ParamsResourceProjectsLocationsPipelinesCreate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def delete(): GaxiosPromise[SchemaGoogleProtobufEmpty] = js.native
  def delete(callback: BodyResponseCallback[SchemaGoogleProtobufEmpty]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleProtobufEmpty] = js.native
  def delete(params: ParamsResourceProjectsLocationsPipelinesDelete): GaxiosPromise[SchemaGoogleProtobufEmpty] = js.native
  def delete(
    params: ParamsResourceProjectsLocationsPipelinesDelete,
    callback: BodyResponseCallback[SchemaGoogleProtobufEmpty]
  ): Unit = js.native
  def delete(
    params: ParamsResourceProjectsLocationsPipelinesDelete,
    options: BodyResponseCallback[Readable | SchemaGoogleProtobufEmpty],
    callback: BodyResponseCallback[Readable | SchemaGoogleProtobufEmpty]
  ): Unit = js.native
  def delete(params: ParamsResourceProjectsLocationsPipelinesDelete, options: MethodOptions): GaxiosPromise[SchemaGoogleProtobufEmpty] = js.native
  def delete(
    params: ParamsResourceProjectsLocationsPipelinesDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleProtobufEmpty]
  ): Unit = js.native
  /**
    * Deletes a pipeline. If a scheduler job is attached to the pipeline, it will be deleted.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/datapipelines.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const datapipelines = google.datapipelines('v1');
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
    *   const res = await datapipelines.projects.locations.pipelines.delete({
    *     // Required. The pipeline name. For example: `projects/PROJECT_ID/locations/LOCATION_ID/pipelines/PIPELINE_ID`.
    *     name: 'projects/my-project/locations/my-location/pipelines/my-pipeline',
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
  def delete(params: ParamsResourceProjectsLocationsPipelinesDelete, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def delete(
    params: ParamsResourceProjectsLocationsPipelinesDelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def get(): GaxiosPromise[SchemaGoogleCloudDatapipelinesV1Pipeline] = js.native
  def get(callback: BodyResponseCallback[SchemaGoogleCloudDatapipelinesV1Pipeline]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDatapipelinesV1Pipeline] = js.native
  def get(params: ParamsResourceProjectsLocationsPipelinesGet): GaxiosPromise[SchemaGoogleCloudDatapipelinesV1Pipeline] = js.native
  def get(
    params: ParamsResourceProjectsLocationsPipelinesGet,
    callback: BodyResponseCallback[SchemaGoogleCloudDatapipelinesV1Pipeline]
  ): Unit = js.native
  def get(
    params: ParamsResourceProjectsLocationsPipelinesGet,
    options: BodyResponseCallback[Readable | SchemaGoogleCloudDatapipelinesV1Pipeline],
    callback: BodyResponseCallback[Readable | SchemaGoogleCloudDatapipelinesV1Pipeline]
  ): Unit = js.native
  def get(params: ParamsResourceProjectsLocationsPipelinesGet, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDatapipelinesV1Pipeline] = js.native
  def get(
    params: ParamsResourceProjectsLocationsPipelinesGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudDatapipelinesV1Pipeline]
  ): Unit = js.native
  /**
    * Looks up a single pipeline. Returns a "NOT_FOUND" error if no such pipeline exists. Returns a "FORBIDDEN" error if the caller doesn't have permission to access it.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/datapipelines.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const datapipelines = google.datapipelines('v1');
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
    *   const res = await datapipelines.projects.locations.pipelines.get({
    *     // Required. The pipeline name. For example: `projects/PROJECT_ID/locations/LOCATION_ID/pipelines/PIPELINE_ID`.
    *     name: 'projects/my-project/locations/my-location/pipelines/my-pipeline',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "createTime": "my_createTime",
    *   //   "displayName": "my_displayName",
    *   //   "jobCount": 0,
    *   //   "lastUpdateTime": "my_lastUpdateTime",
    *   //   "name": "my_name",
    *   //   "pipelineSources": {},
    *   //   "scheduleInfo": {},
    *   //   "schedulerServiceAccountEmail": "my_schedulerServiceAccountEmail",
    *   //   "state": "my_state",
    *   //   "type": "my_type",
    *   //   "workload": {}
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
  def get(params: ParamsResourceProjectsLocationsPipelinesGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceProjectsLocationsPipelinesGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  var jobs: ResourceProjectsLocationsPipelinesJobs = js.native
  
  def patch(): GaxiosPromise[SchemaGoogleCloudDatapipelinesV1Pipeline] = js.native
  def patch(callback: BodyResponseCallback[SchemaGoogleCloudDatapipelinesV1Pipeline]): Unit = js.native
  def patch(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDatapipelinesV1Pipeline] = js.native
  def patch(params: ParamsResourceProjectsLocationsPipelinesPatch): GaxiosPromise[SchemaGoogleCloudDatapipelinesV1Pipeline] = js.native
  def patch(
    params: ParamsResourceProjectsLocationsPipelinesPatch,
    callback: BodyResponseCallback[SchemaGoogleCloudDatapipelinesV1Pipeline]
  ): Unit = js.native
  def patch(
    params: ParamsResourceProjectsLocationsPipelinesPatch,
    options: BodyResponseCallback[Readable | SchemaGoogleCloudDatapipelinesV1Pipeline],
    callback: BodyResponseCallback[Readable | SchemaGoogleCloudDatapipelinesV1Pipeline]
  ): Unit = js.native
  def patch(params: ParamsResourceProjectsLocationsPipelinesPatch, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDatapipelinesV1Pipeline] = js.native
  def patch(
    params: ParamsResourceProjectsLocationsPipelinesPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudDatapipelinesV1Pipeline]
  ): Unit = js.native
  /**
    * Updates a pipeline. If successful, the updated Pipeline is returned. Returns `NOT_FOUND` if the pipeline doesn't exist. If UpdatePipeline does not return successfully, you can retry the UpdatePipeline request until you receive a successful response.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/datapipelines.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const datapipelines = google.datapipelines('v1');
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
    *   const res = await datapipelines.projects.locations.pipelines.patch({
    *     // The pipeline name. For example: `projects/PROJECT_ID/locations/LOCATION_ID/pipelines/PIPELINE_ID`. * `PROJECT_ID` can contain letters ([A-Za-z]), numbers ([0-9]), hyphens (-), colons (:), and periods (.). For more information, see [Identifying projects](https://cloud.google.com/resource-manager/docs/creating-managing-projects#identifying_projects). * `LOCATION_ID` is the canonical ID for the pipeline's location. The list of available locations can be obtained by calling `google.cloud.location.Locations.ListLocations`. Note that the Data Pipelines service is not available in all regions. It depends on Cloud Scheduler, an App Engine application, so it's only available in [App Engine regions](https://cloud.google.com/about/locations#region). * `PIPELINE_ID` is the ID of the pipeline. Must be unique for the selected project and location.
    *     name: 'projects/my-project/locations/my-location/pipelines/my-pipeline',
    *     // The list of fields to be updated.
    *     updateMask: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "createTime": "my_createTime",
    *       //   "displayName": "my_displayName",
    *       //   "jobCount": 0,
    *       //   "lastUpdateTime": "my_lastUpdateTime",
    *       //   "name": "my_name",
    *       //   "pipelineSources": {},
    *       //   "scheduleInfo": {},
    *       //   "schedulerServiceAccountEmail": "my_schedulerServiceAccountEmail",
    *       //   "state": "my_state",
    *       //   "type": "my_type",
    *       //   "workload": {}
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "createTime": "my_createTime",
    *   //   "displayName": "my_displayName",
    *   //   "jobCount": 0,
    *   //   "lastUpdateTime": "my_lastUpdateTime",
    *   //   "name": "my_name",
    *   //   "pipelineSources": {},
    *   //   "scheduleInfo": {},
    *   //   "schedulerServiceAccountEmail": "my_schedulerServiceAccountEmail",
    *   //   "state": "my_state",
    *   //   "type": "my_type",
    *   //   "workload": {}
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
  def patch(params: ParamsResourceProjectsLocationsPipelinesPatch, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def patch(
    params: ParamsResourceProjectsLocationsPipelinesPatch,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def run(): GaxiosPromise[SchemaGoogleCloudDatapipelinesV1RunPipelineResponse] = js.native
  def run(callback: BodyResponseCallback[SchemaGoogleCloudDatapipelinesV1RunPipelineResponse]): Unit = js.native
  def run(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDatapipelinesV1RunPipelineResponse] = js.native
  def run(params: ParamsResourceProjectsLocationsPipelinesRun): GaxiosPromise[SchemaGoogleCloudDatapipelinesV1RunPipelineResponse] = js.native
  def run(
    params: ParamsResourceProjectsLocationsPipelinesRun,
    callback: BodyResponseCallback[SchemaGoogleCloudDatapipelinesV1RunPipelineResponse]
  ): Unit = js.native
  def run(
    params: ParamsResourceProjectsLocationsPipelinesRun,
    options: BodyResponseCallback[Readable | SchemaGoogleCloudDatapipelinesV1RunPipelineResponse],
    callback: BodyResponseCallback[Readable | SchemaGoogleCloudDatapipelinesV1RunPipelineResponse]
  ): Unit = js.native
  def run(params: ParamsResourceProjectsLocationsPipelinesRun, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDatapipelinesV1RunPipelineResponse] = js.native
  def run(
    params: ParamsResourceProjectsLocationsPipelinesRun,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudDatapipelinesV1RunPipelineResponse]
  ): Unit = js.native
  /**
    * Creates a job for the specified pipeline directly. You can use this method when the internal scheduler is not configured and you want to trigger the job directly or through an external system. Returns a "NOT_FOUND" error if the pipeline doesn't exist. Returns a "FORBIDDEN" error if the user doesn't have permission to access the pipeline or run jobs for the pipeline.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/datapipelines.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const datapipelines = google.datapipelines('v1');
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
    *   const res = await datapipelines.projects.locations.pipelines.run({
    *     // Required. The pipeline name. For example: `projects/PROJECT_ID/locations/LOCATION_ID/pipelines/PIPELINE_ID`.
    *     name: 'projects/my-project/locations/my-location/pipelines/my-pipeline',
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
    *   //   "job": {}
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
  def run(params: ParamsResourceProjectsLocationsPipelinesRun, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def run(
    params: ParamsResourceProjectsLocationsPipelinesRun,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def stop(): GaxiosPromise[SchemaGoogleCloudDatapipelinesV1Pipeline] = js.native
  def stop(callback: BodyResponseCallback[SchemaGoogleCloudDatapipelinesV1Pipeline]): Unit = js.native
  def stop(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDatapipelinesV1Pipeline] = js.native
  def stop(params: ParamsResourceProjectsLocationsPipelinesStop): GaxiosPromise[SchemaGoogleCloudDatapipelinesV1Pipeline] = js.native
  def stop(
    params: ParamsResourceProjectsLocationsPipelinesStop,
    callback: BodyResponseCallback[SchemaGoogleCloudDatapipelinesV1Pipeline]
  ): Unit = js.native
  def stop(
    params: ParamsResourceProjectsLocationsPipelinesStop,
    options: BodyResponseCallback[Readable | SchemaGoogleCloudDatapipelinesV1Pipeline],
    callback: BodyResponseCallback[Readable | SchemaGoogleCloudDatapipelinesV1Pipeline]
  ): Unit = js.native
  def stop(params: ParamsResourceProjectsLocationsPipelinesStop, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDatapipelinesV1Pipeline] = js.native
  def stop(
    params: ParamsResourceProjectsLocationsPipelinesStop,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudDatapipelinesV1Pipeline]
  ): Unit = js.native
  /**
    * Freezes pipeline execution permanently. If there's a corresponding scheduler entry, it's deleted, and the pipeline state is changed to "ARCHIVED". However, pipeline metadata is retained.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/datapipelines.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const datapipelines = google.datapipelines('v1');
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
    *   const res = await datapipelines.projects.locations.pipelines.stop({
    *     // Required. The pipeline name. For example: `projects/PROJECT_ID/locations/LOCATION_ID/pipelines/PIPELINE_ID`.
    *     name: 'projects/my-project/locations/my-location/pipelines/my-pipeline',
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
    *   //   "createTime": "my_createTime",
    *   //   "displayName": "my_displayName",
    *   //   "jobCount": 0,
    *   //   "lastUpdateTime": "my_lastUpdateTime",
    *   //   "name": "my_name",
    *   //   "pipelineSources": {},
    *   //   "scheduleInfo": {},
    *   //   "schedulerServiceAccountEmail": "my_schedulerServiceAccountEmail",
    *   //   "state": "my_state",
    *   //   "type": "my_type",
    *   //   "workload": {}
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
  def stop(params: ParamsResourceProjectsLocationsPipelinesStop, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def stop(
    params: ParamsResourceProjectsLocationsPipelinesStop,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
