package typings.googleapis.firebasemlV1beta2Mod.firebasemlV1beta2

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/firebaseml/v1beta2", "firebaseml_v1beta2.Resource$Projects$Models")
@js.native
open class ResourceProjectsModels protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def create(): GaxiosPromise[SchemaOperation] = js.native
  def create(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def create(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def create(params: ParamsResourceProjectsModelsCreate): GaxiosPromise[SchemaOperation] = js.native
  def create(params: ParamsResourceProjectsModelsCreate, callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def create(
    params: ParamsResourceProjectsModelsCreate,
    options: BodyResponseCallback[Readable | SchemaOperation],
    callback: BodyResponseCallback[Readable | SchemaOperation]
  ): Unit = js.native
  def create(params: ParamsResourceProjectsModelsCreate, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def create(
    params: ParamsResourceProjectsModelsCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * Creates a model in Firebase ML. The longrunning operation will eventually return a Model
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/firebaseml.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const firebaseml = google.firebaseml('v1beta2');
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
    *   const res = await firebaseml.projects.models.create({
    *     // Required. The parent project resource where the model is to be created. The parent must have the form `projects/{project_id\}`
    *     parent: 'projects/my-project',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "activeOperations": [],
    *       //   "createTime": "my_createTime",
    *       //   "displayName": "my_displayName",
    *       //   "etag": "my_etag",
    *       //   "modelHash": "my_modelHash",
    *       //   "name": "my_name",
    *       //   "state": {},
    *       //   "tags": [],
    *       //   "tfliteModel": {},
    *       //   "updateTime": "my_updateTime"
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
  def create(params: ParamsResourceProjectsModelsCreate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def create(
    params: ParamsResourceProjectsModelsCreate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def delete(): GaxiosPromise[SchemaEmpty] = js.native
  def delete(callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def delete(params: ParamsResourceProjectsModelsDelete): GaxiosPromise[SchemaEmpty] = js.native
  def delete(params: ParamsResourceProjectsModelsDelete, callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def delete(
    params: ParamsResourceProjectsModelsDelete,
    options: BodyResponseCallback[Readable | SchemaEmpty],
    callback: BodyResponseCallback[Readable | SchemaEmpty]
  ): Unit = js.native
  def delete(params: ParamsResourceProjectsModelsDelete, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def delete(
    params: ParamsResourceProjectsModelsDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  /**
    * Deletes a model
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/firebaseml.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const firebaseml = google.firebaseml('v1beta2');
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
    *   const res = await firebaseml.projects.models.delete({
    *     // Required. The name of the model to delete. The name must have the form `projects/{project_id\}/models/{model_id\}`
    *     name: 'projects/my-project/models/my-model',
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
  def delete(params: ParamsResourceProjectsModelsDelete, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def delete(
    params: ParamsResourceProjectsModelsDelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def download(): GaxiosPromise[SchemaDownloadModelResponse] = js.native
  def download(callback: BodyResponseCallback[SchemaDownloadModelResponse]): Unit = js.native
  def download(params: Unit, options: MethodOptions): GaxiosPromise[SchemaDownloadModelResponse] = js.native
  def download(params: ParamsResourceProjectsModelsDownload): GaxiosPromise[SchemaDownloadModelResponse] = js.native
  def download(
    params: ParamsResourceProjectsModelsDownload,
    callback: BodyResponseCallback[SchemaDownloadModelResponse]
  ): Unit = js.native
  def download(
    params: ParamsResourceProjectsModelsDownload,
    options: BodyResponseCallback[Readable | SchemaDownloadModelResponse],
    callback: BodyResponseCallback[Readable | SchemaDownloadModelResponse]
  ): Unit = js.native
  def download(params: ParamsResourceProjectsModelsDownload, options: MethodOptions): GaxiosPromise[SchemaDownloadModelResponse] = js.native
  def download(
    params: ParamsResourceProjectsModelsDownload,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaDownloadModelResponse]
  ): Unit = js.native
  /**
    * Gets Download information for a model. This is meant for downloading model resources onto devices. It gives very limited information about the model.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/firebaseml.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const firebaseml = google.firebaseml('v1beta2');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await firebaseml.projects.models.download({
    *     // Required. The name of the model to download. The name must have the form `projects/{project\}/models/{model\}`
    *     name: 'projects/my-project/models/my-model',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "downloadUri": "my_downloadUri",
    *   //   "expireTime": "my_expireTime",
    *   //   "modelFormat": "my_modelFormat",
    *   //   "sizeBytes": "my_sizeBytes"
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
  def download(params: ParamsResourceProjectsModelsDownload, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def download(
    params: ParamsResourceProjectsModelsDownload,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def get(): GaxiosPromise[SchemaModel] = js.native
  def get(callback: BodyResponseCallback[SchemaModel]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaModel] = js.native
  def get(params: ParamsResourceProjectsModelsGet): GaxiosPromise[SchemaModel] = js.native
  def get(params: ParamsResourceProjectsModelsGet, callback: BodyResponseCallback[SchemaModel]): Unit = js.native
  def get(
    params: ParamsResourceProjectsModelsGet,
    options: BodyResponseCallback[Readable | SchemaModel],
    callback: BodyResponseCallback[Readable | SchemaModel]
  ): Unit = js.native
  def get(params: ParamsResourceProjectsModelsGet, options: MethodOptions): GaxiosPromise[SchemaModel] = js.native
  def get(
    params: ParamsResourceProjectsModelsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaModel]
  ): Unit = js.native
  /**
    * Gets a model resource.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/firebaseml.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const firebaseml = google.firebaseml('v1beta2');
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
    *   const res = await firebaseml.projects.models.get({
    *     // Required. The name of the model to get. The name must have the form `projects/{project_id\}/models/{model_id\}`
    *     name: 'projects/my-project/models/my-model',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "activeOperations": [],
    *   //   "createTime": "my_createTime",
    *   //   "displayName": "my_displayName",
    *   //   "etag": "my_etag",
    *   //   "modelHash": "my_modelHash",
    *   //   "name": "my_name",
    *   //   "state": {},
    *   //   "tags": [],
    *   //   "tfliteModel": {},
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
  def get(params: ParamsResourceProjectsModelsGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceProjectsModelsGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaListModelsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListModelsResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListModelsResponse] = js.native
  def list(params: ParamsResourceProjectsModelsList): GaxiosPromise[SchemaListModelsResponse] = js.native
  def list(params: ParamsResourceProjectsModelsList, callback: BodyResponseCallback[SchemaListModelsResponse]): Unit = js.native
  def list(
    params: ParamsResourceProjectsModelsList,
    options: BodyResponseCallback[Readable | SchemaListModelsResponse],
    callback: BodyResponseCallback[Readable | SchemaListModelsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceProjectsModelsList, options: MethodOptions): GaxiosPromise[SchemaListModelsResponse] = js.native
  def list(
    params: ParamsResourceProjectsModelsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListModelsResponse]
  ): Unit = js.native
  /**
    * Lists the models
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/firebaseml.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const firebaseml = google.firebaseml('v1beta2');
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
    *   const res = await firebaseml.projects.models.list({
    *     // A filter for the list e.g. 'tags: abc' to list models which are tagged with "abc"
    *     filter: 'placeholder-value',
    *     // The maximum number of items to return
    *     pageSize: 'placeholder-value',
    *     // The next_page_token value returned from a previous List request, if any.
    *     pageToken: 'placeholder-value',
    *     // Required. The name of the parent to list models for. The parent must have the form `projects/{project_id\}'
    *     parent: 'projects/my-project',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "models": [],
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
  def list(params: ParamsResourceProjectsModelsList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceProjectsModelsList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def patch(): GaxiosPromise[SchemaOperation] = js.native
  def patch(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def patch(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def patch(params: ParamsResourceProjectsModelsPatch): GaxiosPromise[SchemaOperation] = js.native
  def patch(params: ParamsResourceProjectsModelsPatch, callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def patch(
    params: ParamsResourceProjectsModelsPatch,
    options: BodyResponseCallback[Readable | SchemaOperation],
    callback: BodyResponseCallback[Readable | SchemaOperation]
  ): Unit = js.native
  def patch(params: ParamsResourceProjectsModelsPatch, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def patch(
    params: ParamsResourceProjectsModelsPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * Updates a model. The longrunning operation will eventually return a Model.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/firebaseml.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const firebaseml = google.firebaseml('v1beta2');
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
    *   const res = await firebaseml.projects.models.patch({
    *     // The resource name of the Model. Model names have the form `projects/{project_id\}/models/{model_id\}` The name is ignored when creating a model.
    *     name: 'projects/my-project/models/my-model',
    *     // The update mask
    *     updateMask: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "activeOperations": [],
    *       //   "createTime": "my_createTime",
    *       //   "displayName": "my_displayName",
    *       //   "etag": "my_etag",
    *       //   "modelHash": "my_modelHash",
    *       //   "name": "my_name",
    *       //   "state": {},
    *       //   "tags": [],
    *       //   "tfliteModel": {},
    *       //   "updateTime": "my_updateTime"
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
  def patch(params: ParamsResourceProjectsModelsPatch, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def patch(
    params: ParamsResourceProjectsModelsPatch,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
