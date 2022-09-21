package typings.googleapis.retailV2alphaMod.retailV2alpha

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/retail/v2alpha", "retail_v2alpha.Resource$Projects$Locations$Catalogs$Models")
@js.native
open class ResourceProjectsLocationsCatalogsModels protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def create(): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def create(callback: BodyResponseCallback[SchemaGoogleLongrunningOperation]): Unit = js.native
  def create(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def create(params: ParamsResourceProjectsLocationsCatalogsModelsCreate): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def create(
    params: ParamsResourceProjectsLocationsCatalogsModelsCreate,
    callback: BodyResponseCallback[SchemaGoogleLongrunningOperation]
  ): Unit = js.native
  def create(
    params: ParamsResourceProjectsLocationsCatalogsModelsCreate,
    options: BodyResponseCallback[Readable | SchemaGoogleLongrunningOperation],
    callback: BodyResponseCallback[Readable | SchemaGoogleLongrunningOperation]
  ): Unit = js.native
  def create(params: ParamsResourceProjectsLocationsCatalogsModelsCreate, options: MethodOptions): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def create(
    params: ParamsResourceProjectsLocationsCatalogsModelsCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleLongrunningOperation]
  ): Unit = js.native
  /**
    * Creates a new model.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/retail.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const retail = google.retail('v2alpha');
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
    *   const res = await retail.projects.locations.catalogs.models.create({
    *     // Optional. Whether to run a dry run to validate the request (without actually creating the model).
    *     dryRun: 'placeholder-value',
    *     // Required. The parent resource under which to create the model. Format: projects/{project_number\}/locations/{location_id\}/catalogs/{catalog_id\}
    *     parent: 'projects/my-project/locations/my-location/catalogs/my-catalog',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "createTime": "my_createTime",
    *       //   "dataState": "my_dataState",
    *       //   "displayName": "my_displayName",
    *       //   "filteringOption": "my_filteringOption",
    *       //   "lastTuneTime": "my_lastTuneTime",
    *       //   "name": "my_name",
    *       //   "optimizationObjective": "my_optimizationObjective",
    *       //   "pageOptimizationConfig": {},
    *       //   "periodicTuningState": "my_periodicTuningState",
    *       //   "servingConfigLists": [],
    *       //   "servingState": "my_servingState",
    *       //   "trainingState": "my_trainingState",
    *       //   "tuningOperation": "my_tuningOperation",
    *       //   "type": "my_type",
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
  def create(params: ParamsResourceProjectsLocationsCatalogsModelsCreate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def create(
    params: ParamsResourceProjectsLocationsCatalogsModelsCreate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def delete(): GaxiosPromise[SchemaGoogleProtobufEmpty] = js.native
  def delete(callback: BodyResponseCallback[SchemaGoogleProtobufEmpty]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleProtobufEmpty] = js.native
  def delete(params: ParamsResourceProjectsLocationsCatalogsModelsDelete): GaxiosPromise[SchemaGoogleProtobufEmpty] = js.native
  def delete(
    params: ParamsResourceProjectsLocationsCatalogsModelsDelete,
    callback: BodyResponseCallback[SchemaGoogleProtobufEmpty]
  ): Unit = js.native
  def delete(
    params: ParamsResourceProjectsLocationsCatalogsModelsDelete,
    options: BodyResponseCallback[Readable | SchemaGoogleProtobufEmpty],
    callback: BodyResponseCallback[Readable | SchemaGoogleProtobufEmpty]
  ): Unit = js.native
  def delete(params: ParamsResourceProjectsLocationsCatalogsModelsDelete, options: MethodOptions): GaxiosPromise[SchemaGoogleProtobufEmpty] = js.native
  def delete(
    params: ParamsResourceProjectsLocationsCatalogsModelsDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleProtobufEmpty]
  ): Unit = js.native
  /**
    * Deletes an existing model.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/retail.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const retail = google.retail('v2alpha');
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
    *   const res = await retail.projects.locations.catalogs.models.delete({
    *     // Required. The resource name of the Model to delete. Format: projects/{project_number\}/locations/{location_id\}/catalogs/{catalog_id\}/models/{model_id\}
    *     name: 'projects/my-project/locations/my-location/catalogs/my-catalog/models/my-model',
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
  def delete(params: ParamsResourceProjectsLocationsCatalogsModelsDelete, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def delete(
    params: ParamsResourceProjectsLocationsCatalogsModelsDelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaGoogleCloudRetailV2alphaListModelsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaGoogleCloudRetailV2alphaListModelsResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudRetailV2alphaListModelsResponse] = js.native
  def list(params: ParamsResourceProjectsLocationsCatalogsModelsList): GaxiosPromise[SchemaGoogleCloudRetailV2alphaListModelsResponse] = js.native
  def list(
    params: ParamsResourceProjectsLocationsCatalogsModelsList,
    callback: BodyResponseCallback[SchemaGoogleCloudRetailV2alphaListModelsResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceProjectsLocationsCatalogsModelsList,
    options: BodyResponseCallback[Readable | SchemaGoogleCloudRetailV2alphaListModelsResponse],
    callback: BodyResponseCallback[Readable | SchemaGoogleCloudRetailV2alphaListModelsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceProjectsLocationsCatalogsModelsList, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudRetailV2alphaListModelsResponse] = js.native
  def list(
    params: ParamsResourceProjectsLocationsCatalogsModelsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudRetailV2alphaListModelsResponse]
  ): Unit = js.native
  /**
    * Lists all the models linked to this event store.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/retail.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const retail = google.retail('v2alpha');
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
    *   const res = await retail.projects.locations.catalogs.models.list({
    *     // Optional. Maximum number of results to return. If unspecified, defaults to 50. Max allowed value is 1000.
    *     pageSize: 'placeholder-value',
    *     // Optional. A page token, received from a previous `ListModels` call. Provide this to retrieve the subsequent page.
    *     pageToken: 'placeholder-value',
    *     // Required. The parent for which to list models. Format: projects/{project_number\}/locations/{location_id\}/catalogs/{catalog_id\}
    *     parent: 'projects/my-project/locations/my-location/catalogs/my-catalog',
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
  def list(params: ParamsResourceProjectsLocationsCatalogsModelsList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceProjectsLocationsCatalogsModelsList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def patch(): GaxiosPromise[SchemaGoogleCloudRetailV2alphaModel] = js.native
  def patch(callback: BodyResponseCallback[SchemaGoogleCloudRetailV2alphaModel]): Unit = js.native
  def patch(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudRetailV2alphaModel] = js.native
  def patch(params: ParamsResourceProjectsLocationsCatalogsModelsPatch): GaxiosPromise[SchemaGoogleCloudRetailV2alphaModel] = js.native
  def patch(
    params: ParamsResourceProjectsLocationsCatalogsModelsPatch,
    callback: BodyResponseCallback[SchemaGoogleCloudRetailV2alphaModel]
  ): Unit = js.native
  def patch(
    params: ParamsResourceProjectsLocationsCatalogsModelsPatch,
    options: BodyResponseCallback[Readable | SchemaGoogleCloudRetailV2alphaModel],
    callback: BodyResponseCallback[Readable | SchemaGoogleCloudRetailV2alphaModel]
  ): Unit = js.native
  def patch(params: ParamsResourceProjectsLocationsCatalogsModelsPatch, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudRetailV2alphaModel] = js.native
  def patch(
    params: ParamsResourceProjectsLocationsCatalogsModelsPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudRetailV2alphaModel]
  ): Unit = js.native
  /**
    * Update of model metadata. Only fields that currently can be updated are: `filtering_option` and `periodic_tuning_state`. If other values are provided, this API method ignores them.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/retail.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const retail = google.retail('v2alpha');
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
    *   const res = await retail.projects.locations.catalogs.models.patch({
    *     // Required. The fully qualified resource name of the model. Format: `projects/{project_number\}/locations/{location_id\}/catalogs/{catalog_id\}/models/{model_id\}` catalog_id has char limit of 50. recommendation_model_id has char limit of 40.
    *     name: 'projects/my-project/locations/my-location/catalogs/my-catalog/models/my-model',
    *     // Optional. Indicates which fields in the provided 'model' to update. If not set, by default updates all fields.
    *     updateMask: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "createTime": "my_createTime",
    *       //   "dataState": "my_dataState",
    *       //   "displayName": "my_displayName",
    *       //   "filteringOption": "my_filteringOption",
    *       //   "lastTuneTime": "my_lastTuneTime",
    *       //   "name": "my_name",
    *       //   "optimizationObjective": "my_optimizationObjective",
    *       //   "pageOptimizationConfig": {},
    *       //   "periodicTuningState": "my_periodicTuningState",
    *       //   "servingConfigLists": [],
    *       //   "servingState": "my_servingState",
    *       //   "trainingState": "my_trainingState",
    *       //   "tuningOperation": "my_tuningOperation",
    *       //   "type": "my_type",
    *       //   "updateTime": "my_updateTime"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "createTime": "my_createTime",
    *   //   "dataState": "my_dataState",
    *   //   "displayName": "my_displayName",
    *   //   "filteringOption": "my_filteringOption",
    *   //   "lastTuneTime": "my_lastTuneTime",
    *   //   "name": "my_name",
    *   //   "optimizationObjective": "my_optimizationObjective",
    *   //   "pageOptimizationConfig": {},
    *   //   "periodicTuningState": "my_periodicTuningState",
    *   //   "servingConfigLists": [],
    *   //   "servingState": "my_servingState",
    *   //   "trainingState": "my_trainingState",
    *   //   "tuningOperation": "my_tuningOperation",
    *   //   "type": "my_type",
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
  def patch(params: ParamsResourceProjectsLocationsCatalogsModelsPatch, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def patch(
    params: ParamsResourceProjectsLocationsCatalogsModelsPatch,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def pause(): GaxiosPromise[SchemaGoogleCloudRetailV2alphaModel] = js.native
  def pause(callback: BodyResponseCallback[SchemaGoogleCloudRetailV2alphaModel]): Unit = js.native
  def pause(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudRetailV2alphaModel] = js.native
  def pause(params: ParamsResourceProjectsLocationsCatalogsModelsPause): GaxiosPromise[SchemaGoogleCloudRetailV2alphaModel] = js.native
  def pause(
    params: ParamsResourceProjectsLocationsCatalogsModelsPause,
    callback: BodyResponseCallback[SchemaGoogleCloudRetailV2alphaModel]
  ): Unit = js.native
  def pause(
    params: ParamsResourceProjectsLocationsCatalogsModelsPause,
    options: BodyResponseCallback[Readable | SchemaGoogleCloudRetailV2alphaModel],
    callback: BodyResponseCallback[Readable | SchemaGoogleCloudRetailV2alphaModel]
  ): Unit = js.native
  def pause(params: ParamsResourceProjectsLocationsCatalogsModelsPause, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudRetailV2alphaModel] = js.native
  def pause(
    params: ParamsResourceProjectsLocationsCatalogsModelsPause,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudRetailV2alphaModel]
  ): Unit = js.native
  /**
    * Pauses the training of an existing model.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/retail.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const retail = google.retail('v2alpha');
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
    *   const res = await retail.projects.locations.catalogs.models.pause({
    *     // Required. The name of the model to pause. Format: projects/{project_number\}/locations/{location_id\}/catalogs/{catalog_id\}/models/{model_id\}
    *     name: 'projects/my-project/locations/my-location/catalogs/my-catalog/models/my-model',
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
    *   //   "dataState": "my_dataState",
    *   //   "displayName": "my_displayName",
    *   //   "filteringOption": "my_filteringOption",
    *   //   "lastTuneTime": "my_lastTuneTime",
    *   //   "name": "my_name",
    *   //   "optimizationObjective": "my_optimizationObjective",
    *   //   "pageOptimizationConfig": {},
    *   //   "periodicTuningState": "my_periodicTuningState",
    *   //   "servingConfigLists": [],
    *   //   "servingState": "my_servingState",
    *   //   "trainingState": "my_trainingState",
    *   //   "tuningOperation": "my_tuningOperation",
    *   //   "type": "my_type",
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
  def pause(params: ParamsResourceProjectsLocationsCatalogsModelsPause, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def pause(
    params: ParamsResourceProjectsLocationsCatalogsModelsPause,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def resume(): GaxiosPromise[SchemaGoogleCloudRetailV2alphaModel] = js.native
  def resume(callback: BodyResponseCallback[SchemaGoogleCloudRetailV2alphaModel]): Unit = js.native
  def resume(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudRetailV2alphaModel] = js.native
  def resume(params: ParamsResourceProjectsLocationsCatalogsModelsResume): GaxiosPromise[SchemaGoogleCloudRetailV2alphaModel] = js.native
  def resume(
    params: ParamsResourceProjectsLocationsCatalogsModelsResume,
    callback: BodyResponseCallback[SchemaGoogleCloudRetailV2alphaModel]
  ): Unit = js.native
  def resume(
    params: ParamsResourceProjectsLocationsCatalogsModelsResume,
    options: BodyResponseCallback[Readable | SchemaGoogleCloudRetailV2alphaModel],
    callback: BodyResponseCallback[Readable | SchemaGoogleCloudRetailV2alphaModel]
  ): Unit = js.native
  def resume(params: ParamsResourceProjectsLocationsCatalogsModelsResume, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudRetailV2alphaModel] = js.native
  def resume(
    params: ParamsResourceProjectsLocationsCatalogsModelsResume,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudRetailV2alphaModel]
  ): Unit = js.native
  /**
    * Resumes the training of an existing model.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/retail.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const retail = google.retail('v2alpha');
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
    *   const res = await retail.projects.locations.catalogs.models.resume({
    *     // Required. The name of the model to resume. Format: projects/{project_number\}/locations/{location_id\}/catalogs/{catalog_id\}/models/{model_id\}
    *     name: 'projects/my-project/locations/my-location/catalogs/my-catalog/models/my-model',
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
    *   //   "dataState": "my_dataState",
    *   //   "displayName": "my_displayName",
    *   //   "filteringOption": "my_filteringOption",
    *   //   "lastTuneTime": "my_lastTuneTime",
    *   //   "name": "my_name",
    *   //   "optimizationObjective": "my_optimizationObjective",
    *   //   "pageOptimizationConfig": {},
    *   //   "periodicTuningState": "my_periodicTuningState",
    *   //   "servingConfigLists": [],
    *   //   "servingState": "my_servingState",
    *   //   "trainingState": "my_trainingState",
    *   //   "tuningOperation": "my_tuningOperation",
    *   //   "type": "my_type",
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
  def resume(params: ParamsResourceProjectsLocationsCatalogsModelsResume, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def resume(
    params: ParamsResourceProjectsLocationsCatalogsModelsResume,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def tune(): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def tune(callback: BodyResponseCallback[SchemaGoogleLongrunningOperation]): Unit = js.native
  def tune(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def tune(params: ParamsResourceProjectsLocationsCatalogsModelsTune): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def tune(
    params: ParamsResourceProjectsLocationsCatalogsModelsTune,
    callback: BodyResponseCallback[SchemaGoogleLongrunningOperation]
  ): Unit = js.native
  def tune(
    params: ParamsResourceProjectsLocationsCatalogsModelsTune,
    options: BodyResponseCallback[Readable | SchemaGoogleLongrunningOperation],
    callback: BodyResponseCallback[Readable | SchemaGoogleLongrunningOperation]
  ): Unit = js.native
  def tune(params: ParamsResourceProjectsLocationsCatalogsModelsTune, options: MethodOptions): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def tune(
    params: ParamsResourceProjectsLocationsCatalogsModelsTune,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleLongrunningOperation]
  ): Unit = js.native
  /**
    * Tunes an existing model.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/retail.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const retail = google.retail('v2alpha');
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
    *   const res = await retail.projects.locations.catalogs.models.tune({
    *     // Required. The resource name of the model to tune. Format: projects/{project_number\}/locations/{location_id\}/catalogs/{catalog_id\}/models/{model_id\}
    *     name: 'projects/my-project/locations/my-location/catalogs/my-catalog/models/my-model',
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
  def tune(params: ParamsResourceProjectsLocationsCatalogsModelsTune, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def tune(
    params: ParamsResourceProjectsLocationsCatalogsModelsTune,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
