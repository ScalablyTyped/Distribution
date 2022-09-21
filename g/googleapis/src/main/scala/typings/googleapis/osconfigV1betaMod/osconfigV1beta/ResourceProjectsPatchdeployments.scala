package typings.googleapis.osconfigV1betaMod.osconfigV1beta

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/osconfig/v1beta", "osconfig_v1beta.Resource$Projects$Patchdeployments")
@js.native
open class ResourceProjectsPatchdeployments protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def create(): GaxiosPromise[SchemaPatchDeployment] = js.native
  def create(callback: BodyResponseCallback[SchemaPatchDeployment]): Unit = js.native
  def create(params: Unit, options: MethodOptions): GaxiosPromise[SchemaPatchDeployment] = js.native
  def create(params: ParamsResourceProjectsPatchdeploymentsCreate): GaxiosPromise[SchemaPatchDeployment] = js.native
  def create(
    params: ParamsResourceProjectsPatchdeploymentsCreate,
    callback: BodyResponseCallback[SchemaPatchDeployment]
  ): Unit = js.native
  def create(
    params: ParamsResourceProjectsPatchdeploymentsCreate,
    options: BodyResponseCallback[Readable | SchemaPatchDeployment],
    callback: BodyResponseCallback[Readable | SchemaPatchDeployment]
  ): Unit = js.native
  def create(params: ParamsResourceProjectsPatchdeploymentsCreate, options: MethodOptions): GaxiosPromise[SchemaPatchDeployment] = js.native
  def create(
    params: ParamsResourceProjectsPatchdeploymentsCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaPatchDeployment]
  ): Unit = js.native
  /**
    * Create an OS Config patch deployment.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/osconfig.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const osconfig = google.osconfig('v1beta');
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
    *   const res = await osconfig.projects.patchDeployments.create({
    *     // Required. The project to apply this patch deployment to in the form `projects/x`.
    *     parent: 'projects/my-project',
    *     // Required. A name for the patch deployment in the project. When creating a name the following rules apply: * Must contain only lowercase letters, numbers, and hyphens. * Must start with a letter. * Must be between 1-63 characters. * Must end with a number or a letter. * Must be unique within the project.
    *     patchDeploymentId: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "createTime": "my_createTime",
    *       //   "description": "my_description",
    *       //   "duration": "my_duration",
    *       //   "instanceFilter": {},
    *       //   "lastExecuteTime": "my_lastExecuteTime",
    *       //   "name": "my_name",
    *       //   "oneTimeSchedule": {},
    *       //   "patchConfig": {},
    *       //   "recurringSchedule": {},
    *       //   "rollout": {},
    *       //   "state": "my_state",
    *       //   "updateTime": "my_updateTime"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "createTime": "my_createTime",
    *   //   "description": "my_description",
    *   //   "duration": "my_duration",
    *   //   "instanceFilter": {},
    *   //   "lastExecuteTime": "my_lastExecuteTime",
    *   //   "name": "my_name",
    *   //   "oneTimeSchedule": {},
    *   //   "patchConfig": {},
    *   //   "recurringSchedule": {},
    *   //   "rollout": {},
    *   //   "state": "my_state",
    *   //   "updateTime": "my_updateTime"
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
  def create(params: ParamsResourceProjectsPatchdeploymentsCreate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def create(
    params: ParamsResourceProjectsPatchdeploymentsCreate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def delete(): GaxiosPromise[SchemaEmpty] = js.native
  def delete(callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def delete(params: ParamsResourceProjectsPatchdeploymentsDelete): GaxiosPromise[SchemaEmpty] = js.native
  def delete(params: ParamsResourceProjectsPatchdeploymentsDelete, callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def delete(
    params: ParamsResourceProjectsPatchdeploymentsDelete,
    options: BodyResponseCallback[Readable | SchemaEmpty],
    callback: BodyResponseCallback[Readable | SchemaEmpty]
  ): Unit = js.native
  def delete(params: ParamsResourceProjectsPatchdeploymentsDelete, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def delete(
    params: ParamsResourceProjectsPatchdeploymentsDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  /**
    * Delete an OS Config patch deployment.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/osconfig.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const osconfig = google.osconfig('v1beta');
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
    *   const res = await osconfig.projects.patchDeployments.delete({
    *     // Required. The resource name of the patch deployment in the form `projects/x/patchDeployments/x`.
    *     name: 'projects/my-project/patchDeployments/my-patchDeployment',
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
  def delete(params: ParamsResourceProjectsPatchdeploymentsDelete, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def delete(
    params: ParamsResourceProjectsPatchdeploymentsDelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def get(): GaxiosPromise[SchemaPatchDeployment] = js.native
  def get(callback: BodyResponseCallback[SchemaPatchDeployment]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaPatchDeployment] = js.native
  def get(params: ParamsResourceProjectsPatchdeploymentsGet): GaxiosPromise[SchemaPatchDeployment] = js.native
  def get(
    params: ParamsResourceProjectsPatchdeploymentsGet,
    callback: BodyResponseCallback[SchemaPatchDeployment]
  ): Unit = js.native
  def get(
    params: ParamsResourceProjectsPatchdeploymentsGet,
    options: BodyResponseCallback[Readable | SchemaPatchDeployment],
    callback: BodyResponseCallback[Readable | SchemaPatchDeployment]
  ): Unit = js.native
  def get(params: ParamsResourceProjectsPatchdeploymentsGet, options: MethodOptions): GaxiosPromise[SchemaPatchDeployment] = js.native
  def get(
    params: ParamsResourceProjectsPatchdeploymentsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaPatchDeployment]
  ): Unit = js.native
  /**
    * Get an OS Config patch deployment.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/osconfig.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const osconfig = google.osconfig('v1beta');
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
    *   const res = await osconfig.projects.patchDeployments.get({
    *     // Required. The resource name of the patch deployment in the form `projects/x/patchDeployments/x`.
    *     name: 'projects/my-project/patchDeployments/my-patchDeployment',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "createTime": "my_createTime",
    *   //   "description": "my_description",
    *   //   "duration": "my_duration",
    *   //   "instanceFilter": {},
    *   //   "lastExecuteTime": "my_lastExecuteTime",
    *   //   "name": "my_name",
    *   //   "oneTimeSchedule": {},
    *   //   "patchConfig": {},
    *   //   "recurringSchedule": {},
    *   //   "rollout": {},
    *   //   "state": "my_state",
    *   //   "updateTime": "my_updateTime"
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
  def get(params: ParamsResourceProjectsPatchdeploymentsGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceProjectsPatchdeploymentsGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaListPatchDeploymentsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListPatchDeploymentsResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListPatchDeploymentsResponse] = js.native
  def list(params: ParamsResourceProjectsPatchdeploymentsList): GaxiosPromise[SchemaListPatchDeploymentsResponse] = js.native
  def list(
    params: ParamsResourceProjectsPatchdeploymentsList,
    callback: BodyResponseCallback[SchemaListPatchDeploymentsResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceProjectsPatchdeploymentsList,
    options: BodyResponseCallback[Readable | SchemaListPatchDeploymentsResponse],
    callback: BodyResponseCallback[Readable | SchemaListPatchDeploymentsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceProjectsPatchdeploymentsList, options: MethodOptions): GaxiosPromise[SchemaListPatchDeploymentsResponse] = js.native
  def list(
    params: ParamsResourceProjectsPatchdeploymentsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListPatchDeploymentsResponse]
  ): Unit = js.native
  /**
    * Get a page of OS Config patch deployments.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/osconfig.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const osconfig = google.osconfig('v1beta');
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
    *   const res = await osconfig.projects.patchDeployments.list({
    *     // Optional. The maximum number of patch deployments to return. Default is 100.
    *     pageSize: 'placeholder-value',
    *     // Optional. A pagination token returned from a previous call to ListPatchDeployments that indicates where this listing should continue from.
    *     pageToken: 'placeholder-value',
    *     // Required. The resource name of the parent in the form `projects/x`.
    *     parent: 'projects/my-project',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "nextPageToken": "my_nextPageToken",
    *   //   "patchDeployments": []
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
  def list(params: ParamsResourceProjectsPatchdeploymentsList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceProjectsPatchdeploymentsList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def patch(): GaxiosPromise[SchemaPatchDeployment] = js.native
  def patch(callback: BodyResponseCallback[SchemaPatchDeployment]): Unit = js.native
  def patch(params: Unit, options: MethodOptions): GaxiosPromise[SchemaPatchDeployment] = js.native
  def patch(params: ParamsResourceProjectsPatchdeploymentsPatch): GaxiosPromise[SchemaPatchDeployment] = js.native
  def patch(
    params: ParamsResourceProjectsPatchdeploymentsPatch,
    callback: BodyResponseCallback[SchemaPatchDeployment]
  ): Unit = js.native
  def patch(
    params: ParamsResourceProjectsPatchdeploymentsPatch,
    options: BodyResponseCallback[Readable | SchemaPatchDeployment],
    callback: BodyResponseCallback[Readable | SchemaPatchDeployment]
  ): Unit = js.native
  def patch(params: ParamsResourceProjectsPatchdeploymentsPatch, options: MethodOptions): GaxiosPromise[SchemaPatchDeployment] = js.native
  def patch(
    params: ParamsResourceProjectsPatchdeploymentsPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaPatchDeployment]
  ): Unit = js.native
  /**
    * Update an OS Config patch deployment.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/osconfig.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const osconfig = google.osconfig('v1beta');
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
    *   const res = await osconfig.projects.patchDeployments.patch({
    *     // Unique name for the patch deployment resource in a project. The patch deployment name is in the form: `projects/{project_id\}/patchDeployments/{patch_deployment_id\}`. This field is ignored when you create a new patch deployment.
    *     name: 'projects/my-project/patchDeployments/my-patchDeployment',
    *     // Optional. Field mask that controls which fields of the patch deployment should be updated.
    *     updateMask: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "createTime": "my_createTime",
    *       //   "description": "my_description",
    *       //   "duration": "my_duration",
    *       //   "instanceFilter": {},
    *       //   "lastExecuteTime": "my_lastExecuteTime",
    *       //   "name": "my_name",
    *       //   "oneTimeSchedule": {},
    *       //   "patchConfig": {},
    *       //   "recurringSchedule": {},
    *       //   "rollout": {},
    *       //   "state": "my_state",
    *       //   "updateTime": "my_updateTime"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "createTime": "my_createTime",
    *   //   "description": "my_description",
    *   //   "duration": "my_duration",
    *   //   "instanceFilter": {},
    *   //   "lastExecuteTime": "my_lastExecuteTime",
    *   //   "name": "my_name",
    *   //   "oneTimeSchedule": {},
    *   //   "patchConfig": {},
    *   //   "recurringSchedule": {},
    *   //   "rollout": {},
    *   //   "state": "my_state",
    *   //   "updateTime": "my_updateTime"
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
  def patch(params: ParamsResourceProjectsPatchdeploymentsPatch, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def patch(
    params: ParamsResourceProjectsPatchdeploymentsPatch,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def pause(): GaxiosPromise[SchemaPatchDeployment] = js.native
  def pause(callback: BodyResponseCallback[SchemaPatchDeployment]): Unit = js.native
  def pause(params: Unit, options: MethodOptions): GaxiosPromise[SchemaPatchDeployment] = js.native
  def pause(params: ParamsResourceProjectsPatchdeploymentsPause): GaxiosPromise[SchemaPatchDeployment] = js.native
  def pause(
    params: ParamsResourceProjectsPatchdeploymentsPause,
    callback: BodyResponseCallback[SchemaPatchDeployment]
  ): Unit = js.native
  def pause(
    params: ParamsResourceProjectsPatchdeploymentsPause,
    options: BodyResponseCallback[Readable | SchemaPatchDeployment],
    callback: BodyResponseCallback[Readable | SchemaPatchDeployment]
  ): Unit = js.native
  def pause(params: ParamsResourceProjectsPatchdeploymentsPause, options: MethodOptions): GaxiosPromise[SchemaPatchDeployment] = js.native
  def pause(
    params: ParamsResourceProjectsPatchdeploymentsPause,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaPatchDeployment]
  ): Unit = js.native
  /**
    * Change state of patch deployment to "PAUSED". Patch deployment in paused state doesn't generate patch jobs.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/osconfig.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const osconfig = google.osconfig('v1beta');
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
    *   const res = await osconfig.projects.patchDeployments.pause({
    *     // Required. The resource name of the patch deployment in the form `projects/x/patchDeployments/x`.
    *     name: 'projects/my-project/patchDeployments/my-patchDeployment',
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
    *   //   "description": "my_description",
    *   //   "duration": "my_duration",
    *   //   "instanceFilter": {},
    *   //   "lastExecuteTime": "my_lastExecuteTime",
    *   //   "name": "my_name",
    *   //   "oneTimeSchedule": {},
    *   //   "patchConfig": {},
    *   //   "recurringSchedule": {},
    *   //   "rollout": {},
    *   //   "state": "my_state",
    *   //   "updateTime": "my_updateTime"
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
  def pause(params: ParamsResourceProjectsPatchdeploymentsPause, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def pause(
    params: ParamsResourceProjectsPatchdeploymentsPause,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def resume(): GaxiosPromise[SchemaPatchDeployment] = js.native
  def resume(callback: BodyResponseCallback[SchemaPatchDeployment]): Unit = js.native
  def resume(params: Unit, options: MethodOptions): GaxiosPromise[SchemaPatchDeployment] = js.native
  def resume(params: ParamsResourceProjectsPatchdeploymentsResume): GaxiosPromise[SchemaPatchDeployment] = js.native
  def resume(
    params: ParamsResourceProjectsPatchdeploymentsResume,
    callback: BodyResponseCallback[SchemaPatchDeployment]
  ): Unit = js.native
  def resume(
    params: ParamsResourceProjectsPatchdeploymentsResume,
    options: BodyResponseCallback[Readable | SchemaPatchDeployment],
    callback: BodyResponseCallback[Readable | SchemaPatchDeployment]
  ): Unit = js.native
  def resume(params: ParamsResourceProjectsPatchdeploymentsResume, options: MethodOptions): GaxiosPromise[SchemaPatchDeployment] = js.native
  def resume(
    params: ParamsResourceProjectsPatchdeploymentsResume,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaPatchDeployment]
  ): Unit = js.native
  /**
    * Change state of patch deployment back to "ACTIVE". Patch deployment in active state continues to generate patch jobs.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/osconfig.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const osconfig = google.osconfig('v1beta');
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
    *   const res = await osconfig.projects.patchDeployments.resume({
    *     // Required. The resource name of the patch deployment in the form `projects/x/patchDeployments/x`.
    *     name: 'projects/my-project/patchDeployments/my-patchDeployment',
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
    *   //   "description": "my_description",
    *   //   "duration": "my_duration",
    *   //   "instanceFilter": {},
    *   //   "lastExecuteTime": "my_lastExecuteTime",
    *   //   "name": "my_name",
    *   //   "oneTimeSchedule": {},
    *   //   "patchConfig": {},
    *   //   "recurringSchedule": {},
    *   //   "rollout": {},
    *   //   "state": "my_state",
    *   //   "updateTime": "my_updateTime"
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
  def resume(params: ParamsResourceProjectsPatchdeploymentsResume, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def resume(
    params: ParamsResourceProjectsPatchdeploymentsResume,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
