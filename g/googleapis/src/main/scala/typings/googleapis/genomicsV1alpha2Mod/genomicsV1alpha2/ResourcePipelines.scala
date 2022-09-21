package typings.googleapis.genomicsV1alpha2Mod.genomicsV1alpha2

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/genomics/v1alpha2", "genomics_v1alpha2.Resource$Pipelines")
@js.native
open class ResourcePipelines protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def create(): GaxiosPromise[SchemaPipeline] = js.native
  def create(callback: BodyResponseCallback[SchemaPipeline]): Unit = js.native
  def create(params: Unit, options: MethodOptions): GaxiosPromise[SchemaPipeline] = js.native
  def create(params: ParamsResourcePipelinesCreate): GaxiosPromise[SchemaPipeline] = js.native
  def create(params: ParamsResourcePipelinesCreate, callback: BodyResponseCallback[SchemaPipeline]): Unit = js.native
  def create(
    params: ParamsResourcePipelinesCreate,
    options: BodyResponseCallback[Readable | SchemaPipeline],
    callback: BodyResponseCallback[Readable | SchemaPipeline]
  ): Unit = js.native
  def create(params: ParamsResourcePipelinesCreate, options: MethodOptions): GaxiosPromise[SchemaPipeline] = js.native
  def create(
    params: ParamsResourcePipelinesCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaPipeline]
  ): Unit = js.native
  /**
    * Creates a pipeline that can be run later. Create takes a Pipeline that has all fields other than `pipelineId` populated, and then returns the same pipeline with `pipelineId` populated. This id can be used to run the pipeline. Caller must have WRITE permission to the project.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/genomics.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const genomics = google.genomics('v1alpha2');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/cloud-platform',
    *       'https://www.googleapis.com/auth/genomics',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await genomics.pipelines.create({
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "description": "my_description",
    *       //   "docker": {},
    *       //   "inputParameters": [],
    *       //   "name": "my_name",
    *       //   "outputParameters": [],
    *       //   "pipelineId": "my_pipelineId",
    *       //   "projectId": "my_projectId",
    *       //   "resources": {}
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "description": "my_description",
    *   //   "docker": {},
    *   //   "inputParameters": [],
    *   //   "name": "my_name",
    *   //   "outputParameters": [],
    *   //   "pipelineId": "my_pipelineId",
    *   //   "projectId": "my_projectId",
    *   //   "resources": {}
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
  def create(params: ParamsResourcePipelinesCreate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def create(
    params: ParamsResourcePipelinesCreate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def delete(): GaxiosPromise[SchemaEmpty] = js.native
  def delete(callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def delete(params: ParamsResourcePipelinesDelete): GaxiosPromise[SchemaEmpty] = js.native
  def delete(params: ParamsResourcePipelinesDelete, callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def delete(
    params: ParamsResourcePipelinesDelete,
    options: BodyResponseCallback[Readable | SchemaEmpty],
    callback: BodyResponseCallback[Readable | SchemaEmpty]
  ): Unit = js.native
  def delete(params: ParamsResourcePipelinesDelete, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def delete(
    params: ParamsResourcePipelinesDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  /**
    * Deletes a pipeline based on ID. Caller must have WRITE permission to the project.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/genomics.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const genomics = google.genomics('v1alpha2');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/cloud-platform',
    *       'https://www.googleapis.com/auth/genomics',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await genomics.pipelines.delete({
    *     // Caller must have WRITE access to the project in which this pipeline is defined.
    *     pipelineId: 'placeholder-value',
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
  def delete(params: ParamsResourcePipelinesDelete, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def delete(
    params: ParamsResourcePipelinesDelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def get(): GaxiosPromise[SchemaPipeline] = js.native
  def get(callback: BodyResponseCallback[SchemaPipeline]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaPipeline] = js.native
  def get(params: ParamsResourcePipelinesGet): GaxiosPromise[SchemaPipeline] = js.native
  def get(params: ParamsResourcePipelinesGet, callback: BodyResponseCallback[SchemaPipeline]): Unit = js.native
  def get(
    params: ParamsResourcePipelinesGet,
    options: BodyResponseCallback[Readable | SchemaPipeline],
    callback: BodyResponseCallback[Readable | SchemaPipeline]
  ): Unit = js.native
  def get(params: ParamsResourcePipelinesGet, options: MethodOptions): GaxiosPromise[SchemaPipeline] = js.native
  def get(
    params: ParamsResourcePipelinesGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaPipeline]
  ): Unit = js.native
  /**
    * Retrieves a pipeline based on ID. Caller must have READ permission to the project.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/genomics.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const genomics = google.genomics('v1alpha2');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/cloud-platform',
    *       'https://www.googleapis.com/auth/genomics',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await genomics.pipelines.get({
    *     // Caller must have READ access to the project in which this pipeline is defined.
    *     pipelineId: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "description": "my_description",
    *   //   "docker": {},
    *   //   "inputParameters": [],
    *   //   "name": "my_name",
    *   //   "outputParameters": [],
    *   //   "pipelineId": "my_pipelineId",
    *   //   "projectId": "my_projectId",
    *   //   "resources": {}
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
  def get(params: ParamsResourcePipelinesGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourcePipelinesGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def getControllerConfig(): GaxiosPromise[SchemaControllerConfig] = js.native
  def getControllerConfig(callback: BodyResponseCallback[SchemaControllerConfig]): Unit = js.native
  def getControllerConfig(params: Unit, options: MethodOptions): GaxiosPromise[SchemaControllerConfig] = js.native
  def getControllerConfig(params: ParamsResourcePipelinesGetcontrollerconfig): GaxiosPromise[SchemaControllerConfig] = js.native
  def getControllerConfig(
    params: ParamsResourcePipelinesGetcontrollerconfig,
    callback: BodyResponseCallback[SchemaControllerConfig]
  ): Unit = js.native
  def getControllerConfig(
    params: ParamsResourcePipelinesGetcontrollerconfig,
    options: BodyResponseCallback[Readable | SchemaControllerConfig],
    callback: BodyResponseCallback[Readable | SchemaControllerConfig]
  ): Unit = js.native
  def getControllerConfig(params: ParamsResourcePipelinesGetcontrollerconfig, options: MethodOptions): GaxiosPromise[SchemaControllerConfig] = js.native
  def getControllerConfig(
    params: ParamsResourcePipelinesGetcontrollerconfig,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaControllerConfig]
  ): Unit = js.native
  /**
    * Gets controller configuration information. Should only be called by VMs created by the Pipelines Service and not by end users.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/genomics.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const genomics = google.genomics('v1alpha2');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/cloud-platform',
    *       'https://www.googleapis.com/auth/genomics',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await genomics.pipelines.getControllerConfig({
    *     // The operation to retrieve controller configuration for.
    *     operationId: 'placeholder-value',
    *
    *     validationToken: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "cmd": "my_cmd",
    *   //   "disks": {},
    *   //   "gcsLogPath": "my_gcsLogPath",
    *   //   "gcsSinks": {},
    *   //   "gcsSources": {},
    *   //   "image": "my_image",
    *   //   "machineType": "my_machineType",
    *   //   "vars": {}
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
  def getControllerConfig(params: ParamsResourcePipelinesGetcontrollerconfig, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def getControllerConfig(
    params: ParamsResourcePipelinesGetcontrollerconfig,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaListPipelinesResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListPipelinesResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListPipelinesResponse] = js.native
  def list(params: ParamsResourcePipelinesList): GaxiosPromise[SchemaListPipelinesResponse] = js.native
  def list(params: ParamsResourcePipelinesList, callback: BodyResponseCallback[SchemaListPipelinesResponse]): Unit = js.native
  def list(
    params: ParamsResourcePipelinesList,
    options: BodyResponseCallback[Readable | SchemaListPipelinesResponse],
    callback: BodyResponseCallback[Readable | SchemaListPipelinesResponse]
  ): Unit = js.native
  def list(params: ParamsResourcePipelinesList, options: MethodOptions): GaxiosPromise[SchemaListPipelinesResponse] = js.native
  def list(
    params: ParamsResourcePipelinesList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListPipelinesResponse]
  ): Unit = js.native
  /**
    * Lists pipelines. Caller must have READ permission to the project.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/genomics.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const genomics = google.genomics('v1alpha2');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/cloud-platform',
    *       'https://www.googleapis.com/auth/genomics',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await genomics.pipelines.list({
    *     // Pipelines with names that match this prefix should be returned. If unspecified, all pipelines in the project, up to `pageSize`, will be returned.
    *     namePrefix: 'placeholder-value',
    *     // Number of pipelines to return at once. Defaults to 256, and max is 2048.
    *     pageSize: 'placeholder-value',
    *     // Token to use to indicate where to start getting results. If unspecified, returns the first page of results.
    *     pageToken: 'placeholder-value',
    *     // Required. The name of the project to search for pipelines. Caller must have READ access to this project.
    *     projectId: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "nextPageToken": "my_nextPageToken",
    *   //   "pipelines": []
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
  def list(params: ParamsResourcePipelinesList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourcePipelinesList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def run(): GaxiosPromise[SchemaOperation] = js.native
  def run(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def run(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def run(params: ParamsResourcePipelinesRun): GaxiosPromise[SchemaOperation] = js.native
  def run(params: ParamsResourcePipelinesRun, callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def run(
    params: ParamsResourcePipelinesRun,
    options: BodyResponseCallback[Readable | SchemaOperation],
    callback: BodyResponseCallback[Readable | SchemaOperation]
  ): Unit = js.native
  def run(params: ParamsResourcePipelinesRun, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def run(
    params: ParamsResourcePipelinesRun,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * Runs a pipeline. If `pipelineId` is specified in the request, then run a saved pipeline. If `ephemeralPipeline` is specified, then run that pipeline once without saving a copy. The caller must have READ permission to the project where the pipeline is stored and WRITE permission to the project where the pipeline will be run, as VMs will be created and storage will be used. If a pipeline operation is still running after 6 days, it will be canceled.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/genomics.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const genomics = google.genomics('v1alpha2');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/cloud-platform',
    *       'https://www.googleapis.com/auth/compute',
    *       'https://www.googleapis.com/auth/genomics',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await genomics.pipelines.run({
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "ephemeralPipeline": {},
    *       //   "pipelineArgs": {},
    *       //   "pipelineId": "my_pipelineId"
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
  def run(params: ParamsResourcePipelinesRun, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def run(
    params: ParamsResourcePipelinesRun,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def setOperationStatus(): GaxiosPromise[SchemaEmpty] = js.native
  def setOperationStatus(callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def setOperationStatus(params: Unit, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def setOperationStatus(params: ParamsResourcePipelinesSetoperationstatus): GaxiosPromise[SchemaEmpty] = js.native
  def setOperationStatus(params: ParamsResourcePipelinesSetoperationstatus, callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def setOperationStatus(
    params: ParamsResourcePipelinesSetoperationstatus,
    options: BodyResponseCallback[Readable | SchemaEmpty],
    callback: BodyResponseCallback[Readable | SchemaEmpty]
  ): Unit = js.native
  def setOperationStatus(params: ParamsResourcePipelinesSetoperationstatus, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def setOperationStatus(
    params: ParamsResourcePipelinesSetoperationstatus,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  /**
    * Sets status of a given operation. Any new timestamps (as determined by description) are appended to TimestampEvents. Should only be called by VMs created by the Pipelines Service and not by end users.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/genomics.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const genomics = google.genomics('v1alpha2');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/cloud-platform',
    *       'https://www.googleapis.com/auth/genomics',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await genomics.pipelines.setOperationStatus({
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "errorCode": "my_errorCode",
    *       //   "errorMessage": "my_errorMessage",
    *       //   "operationId": "my_operationId",
    *       //   "timestampEvents": [],
    *       //   "validationToken": "my_validationToken"
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
  def setOperationStatus(params: ParamsResourcePipelinesSetoperationstatus, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def setOperationStatus(
    params: ParamsResourcePipelinesSetoperationstatus,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
