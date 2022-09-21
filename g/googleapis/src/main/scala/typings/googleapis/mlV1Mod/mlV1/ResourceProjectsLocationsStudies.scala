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

@JSImport("googleapis/build/src/apis/ml/v1", "ml_v1.Resource$Projects$Locations$Studies")
@js.native
open class ResourceProjectsLocationsStudies protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def create(): GaxiosPromise[SchemaGoogleCloudMlV1Study] = js.native
  def create(callback: BodyResponseCallback[SchemaGoogleCloudMlV1Study]): Unit = js.native
  def create(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudMlV1Study] = js.native
  def create(params: ParamsResourceProjectsLocationsStudiesCreate): GaxiosPromise[SchemaGoogleCloudMlV1Study] = js.native
  def create(
    params: ParamsResourceProjectsLocationsStudiesCreate,
    callback: BodyResponseCallback[SchemaGoogleCloudMlV1Study]
  ): Unit = js.native
  def create(
    params: ParamsResourceProjectsLocationsStudiesCreate,
    options: BodyResponseCallback[Readable | SchemaGoogleCloudMlV1Study],
    callback: BodyResponseCallback[Readable | SchemaGoogleCloudMlV1Study]
  ): Unit = js.native
  def create(params: ParamsResourceProjectsLocationsStudiesCreate, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudMlV1Study] = js.native
  def create(
    params: ParamsResourceProjectsLocationsStudiesCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudMlV1Study]
  ): Unit = js.native
  /**
    * Creates a study.
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
    *   const res = await ml.projects.locations.studies.create({
    *     // Required. The project and location that the study belongs to. Format: projects/{project\}/locations/{location\}
    *     parent: 'projects/my-project/locations/my-location',
    *     // Required. The ID to use for the study, which will become the final component of the study's resource name.
    *     studyId: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "createTime": "my_createTime",
    *       //   "inactiveReason": "my_inactiveReason",
    *       //   "name": "my_name",
    *       //   "state": "my_state",
    *       //   "studyConfig": {}
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "createTime": "my_createTime",
    *   //   "inactiveReason": "my_inactiveReason",
    *   //   "name": "my_name",
    *   //   "state": "my_state",
    *   //   "studyConfig": {}
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
  def create(params: ParamsResourceProjectsLocationsStudiesCreate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def create(
    params: ParamsResourceProjectsLocationsStudiesCreate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def delete(): GaxiosPromise[SchemaGoogleProtobufEmpty] = js.native
  def delete(callback: BodyResponseCallback[SchemaGoogleProtobufEmpty]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleProtobufEmpty] = js.native
  def delete(params: ParamsResourceProjectsLocationsStudiesDelete): GaxiosPromise[SchemaGoogleProtobufEmpty] = js.native
  def delete(
    params: ParamsResourceProjectsLocationsStudiesDelete,
    callback: BodyResponseCallback[SchemaGoogleProtobufEmpty]
  ): Unit = js.native
  def delete(
    params: ParamsResourceProjectsLocationsStudiesDelete,
    options: BodyResponseCallback[Readable | SchemaGoogleProtobufEmpty],
    callback: BodyResponseCallback[Readable | SchemaGoogleProtobufEmpty]
  ): Unit = js.native
  def delete(params: ParamsResourceProjectsLocationsStudiesDelete, options: MethodOptions): GaxiosPromise[SchemaGoogleProtobufEmpty] = js.native
  def delete(
    params: ParamsResourceProjectsLocationsStudiesDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleProtobufEmpty]
  ): Unit = js.native
  /**
    * Deletes a study.
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
    *   const res = await ml.projects.locations.studies.delete({
    *     // Required. The study name.
    *     name: 'projects/my-project/locations/my-location/studies/my-studie',
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
  def delete(params: ParamsResourceProjectsLocationsStudiesDelete, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def delete(
    params: ParamsResourceProjectsLocationsStudiesDelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def get(): GaxiosPromise[SchemaGoogleCloudMlV1Study] = js.native
  def get(callback: BodyResponseCallback[SchemaGoogleCloudMlV1Study]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudMlV1Study] = js.native
  def get(params: ParamsResourceProjectsLocationsStudiesGet): GaxiosPromise[SchemaGoogleCloudMlV1Study] = js.native
  def get(
    params: ParamsResourceProjectsLocationsStudiesGet,
    callback: BodyResponseCallback[SchemaGoogleCloudMlV1Study]
  ): Unit = js.native
  def get(
    params: ParamsResourceProjectsLocationsStudiesGet,
    options: BodyResponseCallback[Readable | SchemaGoogleCloudMlV1Study],
    callback: BodyResponseCallback[Readable | SchemaGoogleCloudMlV1Study]
  ): Unit = js.native
  def get(params: ParamsResourceProjectsLocationsStudiesGet, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudMlV1Study] = js.native
  def get(
    params: ParamsResourceProjectsLocationsStudiesGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudMlV1Study]
  ): Unit = js.native
  /**
    * Gets a study.
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
    *   const res = await ml.projects.locations.studies.get({
    *     // Required. The study name.
    *     name: 'projects/my-project/locations/my-location/studies/my-studie',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "createTime": "my_createTime",
    *   //   "inactiveReason": "my_inactiveReason",
    *   //   "name": "my_name",
    *   //   "state": "my_state",
    *   //   "studyConfig": {}
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
  def get(params: ParamsResourceProjectsLocationsStudiesGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceProjectsLocationsStudiesGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaGoogleCloudMlV1ListStudiesResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaGoogleCloudMlV1ListStudiesResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudMlV1ListStudiesResponse] = js.native
  def list(params: ParamsResourceProjectsLocationsStudiesList): GaxiosPromise[SchemaGoogleCloudMlV1ListStudiesResponse] = js.native
  def list(
    params: ParamsResourceProjectsLocationsStudiesList,
    callback: BodyResponseCallback[SchemaGoogleCloudMlV1ListStudiesResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceProjectsLocationsStudiesList,
    options: BodyResponseCallback[Readable | SchemaGoogleCloudMlV1ListStudiesResponse],
    callback: BodyResponseCallback[Readable | SchemaGoogleCloudMlV1ListStudiesResponse]
  ): Unit = js.native
  def list(params: ParamsResourceProjectsLocationsStudiesList, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudMlV1ListStudiesResponse] = js.native
  def list(
    params: ParamsResourceProjectsLocationsStudiesList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudMlV1ListStudiesResponse]
  ): Unit = js.native
  /**
    * Lists all the studies in a region for an associated project.
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
    *   const res = await ml.projects.locations.studies.list({
    *     // Required. The project and location that the study belongs to. Format: projects/{project\}/locations/{location\}
    *     parent: 'projects/my-project/locations/my-location',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "studies": []
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
  def list(params: ParamsResourceProjectsLocationsStudiesList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceProjectsLocationsStudiesList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  var trials: ResourceProjectsLocationsStudiesTrials = js.native
}
