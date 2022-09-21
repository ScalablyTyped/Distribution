package typings.googleapis.mlV1Mod.mlV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/ml/v1", "ml_v1.Resource$Projects$Models$Versions")
@js.native
open class ResourceProjectsModelsVersions protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def create(): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def create(callback: BodyResponseCallback[SchemaGoogleLongrunningOperation]): Unit = js.native
  def create(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def create(params: ParamsResourceProjectsModelsVersionsCreate): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def create(
    params: ParamsResourceProjectsModelsVersionsCreate,
    callback: BodyResponseCallback[SchemaGoogleLongrunningOperation]
  ): Unit = js.native
  def create(
    params: ParamsResourceProjectsModelsVersionsCreate,
    options: BodyResponseCallback[Readable | SchemaGoogleLongrunningOperation],
    callback: BodyResponseCallback[Readable | SchemaGoogleLongrunningOperation]
  ): Unit = js.native
  def create(params: ParamsResourceProjectsModelsVersionsCreate, options: MethodOptions): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def create(
    params: ParamsResourceProjectsModelsVersionsCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleLongrunningOperation]
  ): Unit = js.native
  /**
    * Creates a new version of a model from a trained TensorFlow model. If the version created in the cloud by this call is the first deployed version of the specified model, it will be made the default version of the model. When you add a version to a model that already has one or more versions, the default version does not automatically change. If you want a new version to be the default, you must call projects.models.versions.setDefault.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/ml.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const ml = google.ml('v1');
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
    *   const res = await ml.projects.models.versions.create({
    *     // Required. The name of the model.
    *     parent: 'projects/my-project/models/my-model',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "acceleratorConfig": {},
    *       //   "autoScaling": {},
    *       //   "container": {},
    *       //   "createTime": "my_createTime",
    *       //   "deploymentUri": "my_deploymentUri",
    *       //   "description": "my_description",
    *       //   "errorMessage": "my_errorMessage",
    *       //   "etag": "my_etag",
    *       //   "explanationConfig": {},
    *       //   "framework": "my_framework",
    *       //   "isDefault": false,
    *       //   "labels": {},
    *       //   "lastMigrationModelId": "my_lastMigrationModelId",
    *       //   "lastMigrationTime": "my_lastMigrationTime",
    *       //   "lastUseTime": "my_lastUseTime",
    *       //   "machineType": "my_machineType",
    *       //   "manualScaling": {},
    *       //   "name": "my_name",
    *       //   "packageUris": [],
    *       //   "predictionClass": "my_predictionClass",
    *       //   "pythonVersion": "my_pythonVersion",
    *       //   "requestLoggingConfig": {},
    *       //   "routes": {},
    *       //   "runtimeVersion": "my_runtimeVersion",
    *       //   "serviceAccount": "my_serviceAccount",
    *       //   "state": "my_state"
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
  def create(params: ParamsResourceProjectsModelsVersionsCreate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def create(
    params: ParamsResourceProjectsModelsVersionsCreate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def delete(): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def delete(callback: BodyResponseCallback[SchemaGoogleLongrunningOperation]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def delete(params: ParamsResourceProjectsModelsVersionsDelete): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def delete(
    params: ParamsResourceProjectsModelsVersionsDelete,
    callback: BodyResponseCallback[SchemaGoogleLongrunningOperation]
  ): Unit = js.native
  def delete(
    params: ParamsResourceProjectsModelsVersionsDelete,
    options: BodyResponseCallback[Readable | SchemaGoogleLongrunningOperation],
    callback: BodyResponseCallback[Readable | SchemaGoogleLongrunningOperation]
  ): Unit = js.native
  def delete(params: ParamsResourceProjectsModelsVersionsDelete, options: MethodOptions): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def delete(
    params: ParamsResourceProjectsModelsVersionsDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleLongrunningOperation]
  ): Unit = js.native
  /**
    * Deletes a model version. Each model can have multiple versions deployed and in use at any given time. Use this method to remove a single version. Note: You cannot delete the version that is set as the default version of the model unless it is the only remaining version.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/ml.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const ml = google.ml('v1');
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
    *   const res = await ml.projects.models.versions.delete({
    *     // Required. The name of the version. You can get the names of all the versions of a model by calling projects.models.versions.list.
    *     name: 'projects/my-project/models/my-model/versions/my-version',
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
  def delete(params: ParamsResourceProjectsModelsVersionsDelete, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def delete(
    params: ParamsResourceProjectsModelsVersionsDelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def get(): GaxiosPromise[SchemaGoogleCloudMlV1Version] = js.native
  def get(callback: BodyResponseCallback[SchemaGoogleCloudMlV1Version]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudMlV1Version] = js.native
  def get(params: ParamsResourceProjectsModelsVersionsGet): GaxiosPromise[SchemaGoogleCloudMlV1Version] = js.native
  def get(
    params: ParamsResourceProjectsModelsVersionsGet,
    callback: BodyResponseCallback[SchemaGoogleCloudMlV1Version]
  ): Unit = js.native
  def get(
    params: ParamsResourceProjectsModelsVersionsGet,
    options: BodyResponseCallback[Readable | SchemaGoogleCloudMlV1Version],
    callback: BodyResponseCallback[Readable | SchemaGoogleCloudMlV1Version]
  ): Unit = js.native
  def get(params: ParamsResourceProjectsModelsVersionsGet, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudMlV1Version] = js.native
  def get(
    params: ParamsResourceProjectsModelsVersionsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudMlV1Version]
  ): Unit = js.native
  /**
    * Gets information about a model version. Models can have multiple versions. You can call projects.models.versions.list to get the same information that this method returns for all of the versions of a model.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/ml.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const ml = google.ml('v1');
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
    *   const res = await ml.projects.models.versions.get({
    *     // Required. The name of the version.
    *     name: 'projects/my-project/models/my-model/versions/my-version',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "acceleratorConfig": {},
    *   //   "autoScaling": {},
    *   //   "container": {},
    *   //   "createTime": "my_createTime",
    *   //   "deploymentUri": "my_deploymentUri",
    *   //   "description": "my_description",
    *   //   "errorMessage": "my_errorMessage",
    *   //   "etag": "my_etag",
    *   //   "explanationConfig": {},
    *   //   "framework": "my_framework",
    *   //   "isDefault": false,
    *   //   "labels": {},
    *   //   "lastMigrationModelId": "my_lastMigrationModelId",
    *   //   "lastMigrationTime": "my_lastMigrationTime",
    *   //   "lastUseTime": "my_lastUseTime",
    *   //   "machineType": "my_machineType",
    *   //   "manualScaling": {},
    *   //   "name": "my_name",
    *   //   "packageUris": [],
    *   //   "predictionClass": "my_predictionClass",
    *   //   "pythonVersion": "my_pythonVersion",
    *   //   "requestLoggingConfig": {},
    *   //   "routes": {},
    *   //   "runtimeVersion": "my_runtimeVersion",
    *   //   "serviceAccount": "my_serviceAccount",
    *   //   "state": "my_state"
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
  def get(params: ParamsResourceProjectsModelsVersionsGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceProjectsModelsVersionsGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaGoogleCloudMlV1ListVersionsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaGoogleCloudMlV1ListVersionsResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudMlV1ListVersionsResponse] = js.native
  def list(params: ParamsResourceProjectsModelsVersionsList): GaxiosPromise[SchemaGoogleCloudMlV1ListVersionsResponse] = js.native
  def list(
    params: ParamsResourceProjectsModelsVersionsList,
    callback: BodyResponseCallback[SchemaGoogleCloudMlV1ListVersionsResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceProjectsModelsVersionsList,
    options: BodyResponseCallback[Readable | SchemaGoogleCloudMlV1ListVersionsResponse],
    callback: BodyResponseCallback[Readable | SchemaGoogleCloudMlV1ListVersionsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceProjectsModelsVersionsList, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudMlV1ListVersionsResponse] = js.native
  def list(
    params: ParamsResourceProjectsModelsVersionsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudMlV1ListVersionsResponse]
  ): Unit = js.native
  /**
    * Gets basic information about all the versions of a model. If you expect that a model has many versions, or if you need to handle only a limited number of results at a time, you can request that the list be retrieved in batches (called pages). If there are no versions that match the request parameters, the list request returns an empty response body: {\}.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/ml.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const ml = google.ml('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/cloud-platform',
    *       'https://www.googleapis.com/auth/cloud-platform.read-only',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await ml.projects.models.versions.list({
    *     // Optional. Specifies the subset of versions to retrieve.
    *     filter: 'placeholder-value',
    *     // Optional. The number of versions to retrieve per "page" of results. If there are more remaining results than this number, the response message will contain a valid value in the `next_page_token` field. The default value is 20, and the maximum page size is 100.
    *     pageSize: 'placeholder-value',
    *     // Optional. A page token to request the next page of results. You get the token from the `next_page_token` field of the response from the previous call.
    *     pageToken: 'placeholder-value',
    *     // Required. The name of the model for which to list the version.
    *     parent: 'projects/my-project/models/my-model',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "nextPageToken": "my_nextPageToken",
    *   //   "versions": []
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
  def list(params: ParamsResourceProjectsModelsVersionsList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceProjectsModelsVersionsList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def patch(): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def patch(callback: BodyResponseCallback[SchemaGoogleLongrunningOperation]): Unit = js.native
  def patch(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def patch(params: ParamsResourceProjectsModelsVersionsPatch): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def patch(
    params: ParamsResourceProjectsModelsVersionsPatch,
    callback: BodyResponseCallback[SchemaGoogleLongrunningOperation]
  ): Unit = js.native
  def patch(
    params: ParamsResourceProjectsModelsVersionsPatch,
    options: BodyResponseCallback[Readable | SchemaGoogleLongrunningOperation],
    callback: BodyResponseCallback[Readable | SchemaGoogleLongrunningOperation]
  ): Unit = js.native
  def patch(params: ParamsResourceProjectsModelsVersionsPatch, options: MethodOptions): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def patch(
    params: ParamsResourceProjectsModelsVersionsPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleLongrunningOperation]
  ): Unit = js.native
  /**
    * Updates the specified Version resource. Currently the only update-able fields are `description`, `requestLoggingConfig`, `autoScaling.minNodes`, and `manualScaling.nodes`.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/ml.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const ml = google.ml('v1');
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
    *   const res = await ml.projects.models.versions.patch({
    *     // Required. The name of the model.
    *     name: 'projects/my-project/models/my-model/versions/my-version',
    *     // Required. Specifies the path, relative to `Version`, of the field to update. Must be present and non-empty. For example, to change the description of a version to "foo", the `update_mask` parameter would be specified as `description`, and the `PATCH` request body would specify the new value, as follows: ``` { "description": "foo" \} ``` Currently the only supported update mask fields are `description`, `requestLoggingConfig`, `autoScaling.minNodes`, and `manualScaling.nodes`. However, you can only update `manualScaling.nodes` if the version uses a [Compute Engine (N1) machine type](/ml-engine/docs/machine-types-online-prediction).
    *     updateMask: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "acceleratorConfig": {},
    *       //   "autoScaling": {},
    *       //   "container": {},
    *       //   "createTime": "my_createTime",
    *       //   "deploymentUri": "my_deploymentUri",
    *       //   "description": "my_description",
    *       //   "errorMessage": "my_errorMessage",
    *       //   "etag": "my_etag",
    *       //   "explanationConfig": {},
    *       //   "framework": "my_framework",
    *       //   "isDefault": false,
    *       //   "labels": {},
    *       //   "lastMigrationModelId": "my_lastMigrationModelId",
    *       //   "lastMigrationTime": "my_lastMigrationTime",
    *       //   "lastUseTime": "my_lastUseTime",
    *       //   "machineType": "my_machineType",
    *       //   "manualScaling": {},
    *       //   "name": "my_name",
    *       //   "packageUris": [],
    *       //   "predictionClass": "my_predictionClass",
    *       //   "pythonVersion": "my_pythonVersion",
    *       //   "requestLoggingConfig": {},
    *       //   "routes": {},
    *       //   "runtimeVersion": "my_runtimeVersion",
    *       //   "serviceAccount": "my_serviceAccount",
    *       //   "state": "my_state"
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
  def patch(params: ParamsResourceProjectsModelsVersionsPatch, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def patch(
    params: ParamsResourceProjectsModelsVersionsPatch,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def setDefault(): GaxiosPromise[SchemaGoogleCloudMlV1Version] = js.native
  def setDefault(callback: BodyResponseCallback[SchemaGoogleCloudMlV1Version]): Unit = js.native
  def setDefault(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudMlV1Version] = js.native
  def setDefault(params: ParamsResourceProjectsModelsVersionsSetdefault): GaxiosPromise[SchemaGoogleCloudMlV1Version] = js.native
  def setDefault(
    params: ParamsResourceProjectsModelsVersionsSetdefault,
    callback: BodyResponseCallback[SchemaGoogleCloudMlV1Version]
  ): Unit = js.native
  def setDefault(
    params: ParamsResourceProjectsModelsVersionsSetdefault,
    options: BodyResponseCallback[Readable | SchemaGoogleCloudMlV1Version],
    callback: BodyResponseCallback[Readable | SchemaGoogleCloudMlV1Version]
  ): Unit = js.native
  def setDefault(params: ParamsResourceProjectsModelsVersionsSetdefault, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudMlV1Version] = js.native
  def setDefault(
    params: ParamsResourceProjectsModelsVersionsSetdefault,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudMlV1Version]
  ): Unit = js.native
  /**
    * Designates a version to be the default for the model. The default version is used for prediction requests made against the model that don't specify a version. The first version to be created for a model is automatically set as the default. You must make any subsequent changes to the default version setting manually using this method.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/ml.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const ml = google.ml('v1');
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
    *   const res = await ml.projects.models.versions.setDefault({
    *     // Required. The name of the version to make the default for the model. You can get the names of all the versions of a model by calling projects.models.versions.list.
    *     name: 'projects/my-project/models/my-model/versions/my-version',
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
    *   //   "acceleratorConfig": {},
    *   //   "autoScaling": {},
    *   //   "container": {},
    *   //   "createTime": "my_createTime",
    *   //   "deploymentUri": "my_deploymentUri",
    *   //   "description": "my_description",
    *   //   "errorMessage": "my_errorMessage",
    *   //   "etag": "my_etag",
    *   //   "explanationConfig": {},
    *   //   "framework": "my_framework",
    *   //   "isDefault": false,
    *   //   "labels": {},
    *   //   "lastMigrationModelId": "my_lastMigrationModelId",
    *   //   "lastMigrationTime": "my_lastMigrationTime",
    *   //   "lastUseTime": "my_lastUseTime",
    *   //   "machineType": "my_machineType",
    *   //   "manualScaling": {},
    *   //   "name": "my_name",
    *   //   "packageUris": [],
    *   //   "predictionClass": "my_predictionClass",
    *   //   "pythonVersion": "my_pythonVersion",
    *   //   "requestLoggingConfig": {},
    *   //   "routes": {},
    *   //   "runtimeVersion": "my_runtimeVersion",
    *   //   "serviceAccount": "my_serviceAccount",
    *   //   "state": "my_state"
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
  def setDefault(params: ParamsResourceProjectsModelsVersionsSetdefault, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def setDefault(
    params: ParamsResourceProjectsModelsVersionsSetdefault,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
