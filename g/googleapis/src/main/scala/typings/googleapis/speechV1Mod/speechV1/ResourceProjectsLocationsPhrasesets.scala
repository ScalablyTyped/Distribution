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

@JSImport("googleapis/build/src/apis/speech/v1", "speech_v1.Resource$Projects$Locations$Phrasesets")
@js.native
open class ResourceProjectsLocationsPhrasesets protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def create(): GaxiosPromise[SchemaPhraseSet] = js.native
  def create(callback: BodyResponseCallback[SchemaPhraseSet]): Unit = js.native
  def create(params: Unit, options: MethodOptions): GaxiosPromise[SchemaPhraseSet] = js.native
  def create(params: ParamsResourceProjectsLocationsPhrasesetsCreate): GaxiosPromise[SchemaPhraseSet] = js.native
  def create(
    params: ParamsResourceProjectsLocationsPhrasesetsCreate,
    callback: BodyResponseCallback[SchemaPhraseSet]
  ): Unit = js.native
  def create(
    params: ParamsResourceProjectsLocationsPhrasesetsCreate,
    options: BodyResponseCallback[Readable | SchemaPhraseSet],
    callback: BodyResponseCallback[Readable | SchemaPhraseSet]
  ): Unit = js.native
  def create(params: ParamsResourceProjectsLocationsPhrasesetsCreate, options: MethodOptions): GaxiosPromise[SchemaPhraseSet] = js.native
  def create(
    params: ParamsResourceProjectsLocationsPhrasesetsCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaPhraseSet]
  ): Unit = js.native
  /**
    * Create a set of phrase hints. Each item in the set can be a single word or a multi-word phrase. The items in the PhraseSet are favored by the recognition model when you send a call that includes the PhraseSet.
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
    *   const res = await speech.projects.locations.phraseSets.create({
    *     // Required. The parent resource where this phrase set will be created. Format: `projects/{project\}/locations/{location\}/phraseSets` Speech-to-Text supports three locations: `global`, `us` (US North America), and `eu` (Europe). If you are calling the `speech.googleapis.com` endpoint, use the `global` location. To specify a region, use a [regional endpoint](https://cloud.google.com/speech-to-text/docs/endpoints) with matching `us` or `eu` location value.
    *     parent: 'projects/my-project/locations/my-location',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "phraseSet": {},
    *       //   "phraseSetId": "my_phraseSetId"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "boost": {},
    *   //   "name": "my_name",
    *   //   "phrases": []
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
  def create(params: ParamsResourceProjectsLocationsPhrasesetsCreate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def create(
    params: ParamsResourceProjectsLocationsPhrasesetsCreate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def delete(): GaxiosPromise[SchemaEmpty] = js.native
  def delete(callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def delete(params: ParamsResourceProjectsLocationsPhrasesetsDelete): GaxiosPromise[SchemaEmpty] = js.native
  def delete(
    params: ParamsResourceProjectsLocationsPhrasesetsDelete,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  def delete(
    params: ParamsResourceProjectsLocationsPhrasesetsDelete,
    options: BodyResponseCallback[Readable | SchemaEmpty],
    callback: BodyResponseCallback[Readable | SchemaEmpty]
  ): Unit = js.native
  def delete(params: ParamsResourceProjectsLocationsPhrasesetsDelete, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def delete(
    params: ParamsResourceProjectsLocationsPhrasesetsDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  /**
    * Delete a phrase set.
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
    *   const res = await speech.projects.locations.phraseSets.delete({
    *     // Required. The name of the phrase set to delete. Format: `projects/{project\}/locations/{location\}/phraseSets/{phrase_set\}`
    *     name: 'projects/my-project/locations/my-location/phraseSets/my-phraseSet',
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
  def delete(params: ParamsResourceProjectsLocationsPhrasesetsDelete, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def delete(
    params: ParamsResourceProjectsLocationsPhrasesetsDelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def get(): GaxiosPromise[SchemaPhraseSet] = js.native
  def get(callback: BodyResponseCallback[SchemaPhraseSet]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaPhraseSet] = js.native
  def get(params: ParamsResourceProjectsLocationsPhrasesetsGet): GaxiosPromise[SchemaPhraseSet] = js.native
  def get(
    params: ParamsResourceProjectsLocationsPhrasesetsGet,
    callback: BodyResponseCallback[SchemaPhraseSet]
  ): Unit = js.native
  def get(
    params: ParamsResourceProjectsLocationsPhrasesetsGet,
    options: BodyResponseCallback[Readable | SchemaPhraseSet],
    callback: BodyResponseCallback[Readable | SchemaPhraseSet]
  ): Unit = js.native
  def get(params: ParamsResourceProjectsLocationsPhrasesetsGet, options: MethodOptions): GaxiosPromise[SchemaPhraseSet] = js.native
  def get(
    params: ParamsResourceProjectsLocationsPhrasesetsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaPhraseSet]
  ): Unit = js.native
  /**
    * Get a phrase set.
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
    *   const res = await speech.projects.locations.phraseSets.get({
    *     // Required. The name of the phrase set to retrieve. Format: `projects/{project\}/locations/{location\}/phraseSets/{phrase_set\}` Speech-to-Text supports three locations: `global`, `us` (US North America), and `eu` (Europe). If you are calling the `speech.googleapis.com` endpoint, use the `global` location. To specify a region, use a [regional endpoint](https://cloud.google.com/speech-to-text/docs/endpoints) with matching `us` or `eu` location value.
    *     name: 'projects/my-project/locations/my-location/phraseSets/my-phraseSet',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "boost": {},
    *   //   "name": "my_name",
    *   //   "phrases": []
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
  def get(params: ParamsResourceProjectsLocationsPhrasesetsGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceProjectsLocationsPhrasesetsGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaListPhraseSetResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListPhraseSetResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListPhraseSetResponse] = js.native
  def list(params: ParamsResourceProjectsLocationsPhrasesetsList): GaxiosPromise[SchemaListPhraseSetResponse] = js.native
  def list(
    params: ParamsResourceProjectsLocationsPhrasesetsList,
    callback: BodyResponseCallback[SchemaListPhraseSetResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceProjectsLocationsPhrasesetsList,
    options: BodyResponseCallback[Readable | SchemaListPhraseSetResponse],
    callback: BodyResponseCallback[Readable | SchemaListPhraseSetResponse]
  ): Unit = js.native
  def list(params: ParamsResourceProjectsLocationsPhrasesetsList, options: MethodOptions): GaxiosPromise[SchemaListPhraseSetResponse] = js.native
  def list(
    params: ParamsResourceProjectsLocationsPhrasesetsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListPhraseSetResponse]
  ): Unit = js.native
  /**
    * List phrase sets.
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
    *   const res = await speech.projects.locations.phraseSets.list({
    *     // The maximum number of phrase sets to return. The service may return fewer than this value. If unspecified, at most 50 phrase sets will be returned. The maximum value is 1000; values above 1000 will be coerced to 1000.
    *     pageSize: 'placeholder-value',
    *     // A page token, received from a previous `ListPhraseSet` call. Provide this to retrieve the subsequent page. When paginating, all other parameters provided to `ListPhraseSet` must match the call that provided the page token.
    *     pageToken: 'placeholder-value',
    *     // Required. The parent, which owns this collection of phrase set. Format: `projects/{project\}/locations/{location\}` Speech-to-Text supports three locations: `global`, `us` (US North America), and `eu` (Europe). If you are calling the `speech.googleapis.com` endpoint, use the `global` location. To specify a region, use a [regional endpoint](https://cloud.google.com/speech-to-text/docs/endpoints) with matching `us` or `eu` location value.
    *     parent: 'projects/my-project/locations/my-location',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "nextPageToken": "my_nextPageToken",
    *   //   "phraseSets": []
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
  def list(params: ParamsResourceProjectsLocationsPhrasesetsList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceProjectsLocationsPhrasesetsList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def patch(): GaxiosPromise[SchemaPhraseSet] = js.native
  def patch(callback: BodyResponseCallback[SchemaPhraseSet]): Unit = js.native
  def patch(params: Unit, options: MethodOptions): GaxiosPromise[SchemaPhraseSet] = js.native
  def patch(params: ParamsResourceProjectsLocationsPhrasesetsPatch): GaxiosPromise[SchemaPhraseSet] = js.native
  def patch(
    params: ParamsResourceProjectsLocationsPhrasesetsPatch,
    callback: BodyResponseCallback[SchemaPhraseSet]
  ): Unit = js.native
  def patch(
    params: ParamsResourceProjectsLocationsPhrasesetsPatch,
    options: BodyResponseCallback[Readable | SchemaPhraseSet],
    callback: BodyResponseCallback[Readable | SchemaPhraseSet]
  ): Unit = js.native
  def patch(params: ParamsResourceProjectsLocationsPhrasesetsPatch, options: MethodOptions): GaxiosPromise[SchemaPhraseSet] = js.native
  def patch(
    params: ParamsResourceProjectsLocationsPhrasesetsPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaPhraseSet]
  ): Unit = js.native
  /**
    * Update a phrase set.
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
    *   const res = await speech.projects.locations.phraseSets.patch({
    *     // The resource name of the phrase set.
    *     name: 'projects/my-project/locations/my-location/phraseSets/my-phraseSet',
    *     // The list of fields to be updated.
    *     updateMask: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "boost": {},
    *       //   "name": "my_name",
    *       //   "phrases": []
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "boost": {},
    *   //   "name": "my_name",
    *   //   "phrases": []
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
  def patch(params: ParamsResourceProjectsLocationsPhrasesetsPatch, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def patch(
    params: ParamsResourceProjectsLocationsPhrasesetsPatch,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
