package typings.googleapis.speechV1Mod.speechV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/speech/v1", "speech_v1.Resource$Projects$Locations$Customclasses")
@js.native
open class ResourceProjectsLocationsCustomclasses protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def create(): GaxiosPromise[SchemaCustomClass] = js.native
  def create(callback: BodyResponseCallback[SchemaCustomClass]): Unit = js.native
  def create(params: Unit, options: MethodOptions): GaxiosPromise[SchemaCustomClass] = js.native
  def create(params: ParamsResourceProjectsLocationsCustomclassesCreate): GaxiosPromise[SchemaCustomClass] = js.native
  def create(
    params: ParamsResourceProjectsLocationsCustomclassesCreate,
    callback: BodyResponseCallback[SchemaCustomClass]
  ): Unit = js.native
  def create(
    params: ParamsResourceProjectsLocationsCustomclassesCreate,
    options: BodyResponseCallback[Readable | SchemaCustomClass],
    callback: BodyResponseCallback[Readable | SchemaCustomClass]
  ): Unit = js.native
  def create(params: ParamsResourceProjectsLocationsCustomclassesCreate, options: MethodOptions): GaxiosPromise[SchemaCustomClass] = js.native
  def create(
    params: ParamsResourceProjectsLocationsCustomclassesCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaCustomClass]
  ): Unit = js.native
  /**
    * Create a custom class.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/speech.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const speech = google.speech('v1');
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
    *   const res = await speech.projects.locations.customClasses.create({
    *     // Required. The parent resource where this custom class will be created. Format: `projects/{project\}/locations/{location\}/customClasses` Speech-to-Text supports three locations: `global`, `us` (US North America), and `eu` (Europe). If you are calling the `speech.googleapis.com` endpoint, use the `global` location. To specify a region, use a [regional endpoint](https://cloud.google.com/speech-to-text/docs/endpoints) with matching `us` or `eu` location value.
    *     parent: 'projects/my-project/locations/my-location',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "customClass": {},
    *       //   "customClassId": "my_customClassId"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "customClassId": "my_customClassId",
    *   //   "items": [],
    *   //   "name": "my_name"
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
  def create(params: ParamsResourceProjectsLocationsCustomclassesCreate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def create(
    params: ParamsResourceProjectsLocationsCustomclassesCreate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def delete(): GaxiosPromise[SchemaEmpty] = js.native
  def delete(callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def delete(params: ParamsResourceProjectsLocationsCustomclassesDelete): GaxiosPromise[SchemaEmpty] = js.native
  def delete(
    params: ParamsResourceProjectsLocationsCustomclassesDelete,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  def delete(
    params: ParamsResourceProjectsLocationsCustomclassesDelete,
    options: BodyResponseCallback[Readable | SchemaEmpty],
    callback: BodyResponseCallback[Readable | SchemaEmpty]
  ): Unit = js.native
  def delete(params: ParamsResourceProjectsLocationsCustomclassesDelete, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def delete(
    params: ParamsResourceProjectsLocationsCustomclassesDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  /**
    * Delete a custom class.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/speech.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const speech = google.speech('v1');
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
    *   const res = await speech.projects.locations.customClasses.delete({
    *     // Required. The name of the custom class to delete. Format: `projects/{project\}/locations/{location\}/customClasses/{custom_class\}` Speech-to-Text supports three locations: `global`, `us` (US North America), and `eu` (Europe). If you are calling the `speech.googleapis.com` endpoint, use the `global` location. To specify a region, use a [regional endpoint](https://cloud.google.com/speech-to-text/docs/endpoints) with matching `us` or `eu` location value.
    *     name: 'projects/my-project/locations/my-location/customClasses/my-customClasse',
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
  def delete(params: ParamsResourceProjectsLocationsCustomclassesDelete, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def delete(
    params: ParamsResourceProjectsLocationsCustomclassesDelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def get(): GaxiosPromise[SchemaCustomClass] = js.native
  def get(callback: BodyResponseCallback[SchemaCustomClass]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaCustomClass] = js.native
  def get(params: ParamsResourceProjectsLocationsCustomclassesGet): GaxiosPromise[SchemaCustomClass] = js.native
  def get(
    params: ParamsResourceProjectsLocationsCustomclassesGet,
    callback: BodyResponseCallback[SchemaCustomClass]
  ): Unit = js.native
  def get(
    params: ParamsResourceProjectsLocationsCustomclassesGet,
    options: BodyResponseCallback[Readable | SchemaCustomClass],
    callback: BodyResponseCallback[Readable | SchemaCustomClass]
  ): Unit = js.native
  def get(params: ParamsResourceProjectsLocationsCustomclassesGet, options: MethodOptions): GaxiosPromise[SchemaCustomClass] = js.native
  def get(
    params: ParamsResourceProjectsLocationsCustomclassesGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaCustomClass]
  ): Unit = js.native
  /**
    * Get a custom class.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/speech.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const speech = google.speech('v1');
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
    *   const res = await speech.projects.locations.customClasses.get({
    *     // Required. The name of the custom class to retrieve. Format: `projects/{project\}/locations/{location\}/customClasses/{custom_class\}`
    *     name: 'projects/my-project/locations/my-location/customClasses/my-customClasse',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "customClassId": "my_customClassId",
    *   //   "items": [],
    *   //   "name": "my_name"
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
  def get(params: ParamsResourceProjectsLocationsCustomclassesGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceProjectsLocationsCustomclassesGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaListCustomClassesResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListCustomClassesResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListCustomClassesResponse] = js.native
  def list(params: ParamsResourceProjectsLocationsCustomclassesList): GaxiosPromise[SchemaListCustomClassesResponse] = js.native
  def list(
    params: ParamsResourceProjectsLocationsCustomclassesList,
    callback: BodyResponseCallback[SchemaListCustomClassesResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceProjectsLocationsCustomclassesList,
    options: BodyResponseCallback[Readable | SchemaListCustomClassesResponse],
    callback: BodyResponseCallback[Readable | SchemaListCustomClassesResponse]
  ): Unit = js.native
  def list(params: ParamsResourceProjectsLocationsCustomclassesList, options: MethodOptions): GaxiosPromise[SchemaListCustomClassesResponse] = js.native
  def list(
    params: ParamsResourceProjectsLocationsCustomclassesList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListCustomClassesResponse]
  ): Unit = js.native
  /**
    * List custom classes.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/speech.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const speech = google.speech('v1');
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
    *   const res = await speech.projects.locations.customClasses.list({
    *     // The maximum number of custom classes to return. The service may return fewer than this value. If unspecified, at most 50 custom classes will be returned. The maximum value is 1000; values above 1000 will be coerced to 1000.
    *     pageSize: 'placeholder-value',
    *     // A page token, received from a previous `ListCustomClass` call. Provide this to retrieve the subsequent page. When paginating, all other parameters provided to `ListCustomClass` must match the call that provided the page token.
    *     pageToken: 'placeholder-value',
    *     // Required. The parent, which owns this collection of custom classes. Format: `projects/{project\}/locations/{location\}/customClasses` Speech-to-Text supports three locations: `global`, `us` (US North America), and `eu` (Europe). If you are calling the `speech.googleapis.com` endpoint, use the `global` location. To specify a region, use a [regional endpoint](https://cloud.google.com/speech-to-text/docs/endpoints) with matching `us` or `eu` location value.
    *     parent: 'projects/my-project/locations/my-location',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "customClasses": [],
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
  def list(params: ParamsResourceProjectsLocationsCustomclassesList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceProjectsLocationsCustomclassesList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def patch(): GaxiosPromise[SchemaCustomClass] = js.native
  def patch(callback: BodyResponseCallback[SchemaCustomClass]): Unit = js.native
  def patch(params: Unit, options: MethodOptions): GaxiosPromise[SchemaCustomClass] = js.native
  def patch(params: ParamsResourceProjectsLocationsCustomclassesPatch): GaxiosPromise[SchemaCustomClass] = js.native
  def patch(
    params: ParamsResourceProjectsLocationsCustomclassesPatch,
    callback: BodyResponseCallback[SchemaCustomClass]
  ): Unit = js.native
  def patch(
    params: ParamsResourceProjectsLocationsCustomclassesPatch,
    options: BodyResponseCallback[Readable | SchemaCustomClass],
    callback: BodyResponseCallback[Readable | SchemaCustomClass]
  ): Unit = js.native
  def patch(params: ParamsResourceProjectsLocationsCustomclassesPatch, options: MethodOptions): GaxiosPromise[SchemaCustomClass] = js.native
  def patch(
    params: ParamsResourceProjectsLocationsCustomclassesPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaCustomClass]
  ): Unit = js.native
  /**
    * Update a custom class.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/speech.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const speech = google.speech('v1');
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
    *   const res = await speech.projects.locations.customClasses.patch({
    *     // The resource name of the custom class.
    *     name: 'projects/my-project/locations/my-location/customClasses/my-customClasse',
    *     // The list of fields to be updated.
    *     updateMask: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "customClassId": "my_customClassId",
    *       //   "items": [],
    *       //   "name": "my_name"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "customClassId": "my_customClassId",
    *   //   "items": [],
    *   //   "name": "my_name"
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
  def patch(params: ParamsResourceProjectsLocationsCustomclassesPatch, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def patch(
    params: ParamsResourceProjectsLocationsCustomclassesPatch,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
