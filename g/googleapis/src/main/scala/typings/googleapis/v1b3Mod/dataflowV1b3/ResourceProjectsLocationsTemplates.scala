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

@JSImport("googleapis/build/src/apis/dataflow/v1b3", "dataflow_v1b3.Resource$Projects$Locations$Templates")
@js.native
open class ResourceProjectsLocationsTemplates protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def create(): GaxiosPromise[SchemaJob] = js.native
  def create(callback: BodyResponseCallback[SchemaJob]): Unit = js.native
  def create(params: Unit, options: MethodOptions): GaxiosPromise[SchemaJob] = js.native
  def create(params: ParamsResourceProjectsLocationsTemplatesCreate): GaxiosPromise[SchemaJob] = js.native
  def create(params: ParamsResourceProjectsLocationsTemplatesCreate, callback: BodyResponseCallback[SchemaJob]): Unit = js.native
  def create(
    params: ParamsResourceProjectsLocationsTemplatesCreate,
    options: BodyResponseCallback[Readable | SchemaJob],
    callback: BodyResponseCallback[Readable | SchemaJob]
  ): Unit = js.native
  def create(params: ParamsResourceProjectsLocationsTemplatesCreate, options: MethodOptions): GaxiosPromise[SchemaJob] = js.native
  def create(
    params: ParamsResourceProjectsLocationsTemplatesCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaJob]
  ): Unit = js.native
  /**
    * Creates a Cloud Dataflow job from a template. Do not enter confidential information when you supply string values using the API.
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
    *   const res = await dataflow.projects.locations.templates.create({
    *     // The [regional endpoint] (https://cloud.google.com/dataflow/docs/concepts/regional-endpoints) to which to direct the request.
    *     location: 'placeholder-value',
    *     // Required. The ID of the Cloud Platform project that the job belongs to.
    *     projectId: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "environment": {},
    *       //   "gcsPath": "my_gcsPath",
    *       //   "jobName": "my_jobName",
    *       //   "location": "my_location",
    *       //   "parameters": {}
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "clientRequestId": "my_clientRequestId",
    *   //   "createTime": "my_createTime",
    *   //   "createdFromSnapshotId": "my_createdFromSnapshotId",
    *   //   "currentState": "my_currentState",
    *   //   "currentStateTime": "my_currentStateTime",
    *   //   "environment": {},
    *   //   "executionInfo": {},
    *   //   "id": "my_id",
    *   //   "jobMetadata": {},
    *   //   "labels": {},
    *   //   "location": "my_location",
    *   //   "name": "my_name",
    *   //   "pipelineDescription": {},
    *   //   "projectId": "my_projectId",
    *   //   "replaceJobId": "my_replaceJobId",
    *   //   "replacedByJobId": "my_replacedByJobId",
    *   //   "requestedState": "my_requestedState",
    *   //   "satisfiesPzs": false,
    *   //   "stageStates": [],
    *   //   "startTime": "my_startTime",
    *   //   "steps": [],
    *   //   "stepsLocation": "my_stepsLocation",
    *   //   "tempFiles": [],
    *   //   "transformNameMapping": {},
    *   //   "type": "my_type"
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
  def create(params: ParamsResourceProjectsLocationsTemplatesCreate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def create(
    params: ParamsResourceProjectsLocationsTemplatesCreate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def get(): GaxiosPromise[SchemaGetTemplateResponse] = js.native
  def get(callback: BodyResponseCallback[SchemaGetTemplateResponse]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGetTemplateResponse] = js.native
  def get(params: ParamsResourceProjectsLocationsTemplatesGet): GaxiosPromise[SchemaGetTemplateResponse] = js.native
  def get(
    params: ParamsResourceProjectsLocationsTemplatesGet,
    callback: BodyResponseCallback[SchemaGetTemplateResponse]
  ): Unit = js.native
  def get(
    params: ParamsResourceProjectsLocationsTemplatesGet,
    options: BodyResponseCallback[Readable | SchemaGetTemplateResponse],
    callback: BodyResponseCallback[Readable | SchemaGetTemplateResponse]
  ): Unit = js.native
  def get(params: ParamsResourceProjectsLocationsTemplatesGet, options: MethodOptions): GaxiosPromise[SchemaGetTemplateResponse] = js.native
  def get(
    params: ParamsResourceProjectsLocationsTemplatesGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGetTemplateResponse]
  ): Unit = js.native
  /**
    * Get the template associated with a template.
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
    *   const res = await dataflow.projects.locations.templates.get({
    *     // Required. A Cloud Storage path to the template from which to create the job. Must be valid Cloud Storage URL, beginning with 'gs://'.
    *     gcsPath: 'placeholder-value',
    *     // The [regional endpoint] (https://cloud.google.com/dataflow/docs/concepts/regional-endpoints) to which to direct the request.
    *     location: 'placeholder-value',
    *     // Required. The ID of the Cloud Platform project that the job belongs to.
    *     projectId: 'placeholder-value',
    *     // The view to retrieve. Defaults to METADATA_ONLY.
    *     view: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "metadata": {},
    *   //   "runtimeMetadata": {},
    *   //   "status": {},
    *   //   "templateType": "my_templateType"
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
  def get(params: ParamsResourceProjectsLocationsTemplatesGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceProjectsLocationsTemplatesGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def launch(): GaxiosPromise[SchemaLaunchTemplateResponse] = js.native
  def launch(callback: BodyResponseCallback[SchemaLaunchTemplateResponse]): Unit = js.native
  def launch(params: Unit, options: MethodOptions): GaxiosPromise[SchemaLaunchTemplateResponse] = js.native
  def launch(params: ParamsResourceProjectsLocationsTemplatesLaunch): GaxiosPromise[SchemaLaunchTemplateResponse] = js.native
  def launch(
    params: ParamsResourceProjectsLocationsTemplatesLaunch,
    callback: BodyResponseCallback[SchemaLaunchTemplateResponse]
  ): Unit = js.native
  def launch(
    params: ParamsResourceProjectsLocationsTemplatesLaunch,
    options: BodyResponseCallback[Readable | SchemaLaunchTemplateResponse],
    callback: BodyResponseCallback[Readable | SchemaLaunchTemplateResponse]
  ): Unit = js.native
  def launch(params: ParamsResourceProjectsLocationsTemplatesLaunch, options: MethodOptions): GaxiosPromise[SchemaLaunchTemplateResponse] = js.native
  def launch(
    params: ParamsResourceProjectsLocationsTemplatesLaunch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaLaunchTemplateResponse]
  ): Unit = js.native
  /**
    * Launch a template.
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
    *   const res = await dataflow.projects.locations.templates.launch({
    *     // Path to dynamic template spec file on Cloud Storage. The file must be a Json serialized DynamicTemplateFieSpec object.
    *     'dynamicTemplate.gcsPath': 'placeholder-value',
    *     // Cloud Storage path for staging dependencies. Must be a valid Cloud Storage URL, beginning with `gs://`.
    *     'dynamicTemplate.stagingLocation': 'placeholder-value',
    *     // A Cloud Storage path to the template from which to create the job. Must be valid Cloud Storage URL, beginning with 'gs://'.
    *     gcsPath: 'placeholder-value',
    *     // The [regional endpoint] (https://cloud.google.com/dataflow/docs/concepts/regional-endpoints) to which to direct the request.
    *     location: 'placeholder-value',
    *     // Required. The ID of the Cloud Platform project that the job belongs to.
    *     projectId: 'placeholder-value',
    *     // If true, the request is validated but not actually executed. Defaults to false.
    *     validateOnly: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "environment": {},
    *       //   "jobName": "my_jobName",
    *       //   "parameters": {},
    *       //   "transformNameMapping": {},
    *       //   "update": false
    *       // }
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
  def launch(params: ParamsResourceProjectsLocationsTemplatesLaunch, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def launch(
    params: ParamsResourceProjectsLocationsTemplatesLaunch,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
