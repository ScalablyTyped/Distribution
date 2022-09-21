package typings.googleapis.contactcenterinsightsV1Mod.contactcenterinsightsV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/contactcenterinsights/v1", "contactcenterinsights_v1.Resource$Projects$Locations$Phrasematchers")
@js.native
open class ResourceProjectsLocationsPhrasematchers protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def create(): GaxiosPromise[SchemaGoogleCloudContactcenterinsightsV1PhraseMatcher] = js.native
  def create(callback: BodyResponseCallback[SchemaGoogleCloudContactcenterinsightsV1PhraseMatcher]): Unit = js.native
  def create(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudContactcenterinsightsV1PhraseMatcher] = js.native
  def create(params: ParamsResourceProjectsLocationsPhrasematchersCreate): GaxiosPromise[SchemaGoogleCloudContactcenterinsightsV1PhraseMatcher] = js.native
  def create(
    params: ParamsResourceProjectsLocationsPhrasematchersCreate,
    callback: BodyResponseCallback[SchemaGoogleCloudContactcenterinsightsV1PhraseMatcher]
  ): Unit = js.native
  def create(
    params: ParamsResourceProjectsLocationsPhrasematchersCreate,
    options: BodyResponseCallback[Readable | SchemaGoogleCloudContactcenterinsightsV1PhraseMatcher],
    callback: BodyResponseCallback[Readable | SchemaGoogleCloudContactcenterinsightsV1PhraseMatcher]
  ): Unit = js.native
  def create(params: ParamsResourceProjectsLocationsPhrasematchersCreate, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudContactcenterinsightsV1PhraseMatcher] = js.native
  def create(
    params: ParamsResourceProjectsLocationsPhrasematchersCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudContactcenterinsightsV1PhraseMatcher]
  ): Unit = js.native
  /**
    * Creates a phrase matcher.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/contactcenterinsights.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const contactcenterinsights = google.contactcenterinsights('v1');
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
    *   const res =
    *     await contactcenterinsights.projects.locations.phraseMatchers.create({
    *       // Required. The parent resource of the phrase matcher. Required. The location to create a phrase matcher for. Format: `projects//locations/` or `projects//locations/`
    *       parent: 'projects/my-project/locations/my-location',
    *
    *       // Request body metadata
    *       requestBody: {
    *         // request body parameters
    *         // {
    *         //   "activationUpdateTime": "my_activationUpdateTime",
    *         //   "active": false,
    *         //   "displayName": "my_displayName",
    *         //   "name": "my_name",
    *         //   "phraseMatchRuleGroups": [],
    *         //   "revisionCreateTime": "my_revisionCreateTime",
    *         //   "revisionId": "my_revisionId",
    *         //   "roleMatch": "my_roleMatch",
    *         //   "type": "my_type",
    *         //   "updateTime": "my_updateTime",
    *         //   "versionTag": "my_versionTag"
    *         // }
    *       },
    *     });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "activationUpdateTime": "my_activationUpdateTime",
    *   //   "active": false,
    *   //   "displayName": "my_displayName",
    *   //   "name": "my_name",
    *   //   "phraseMatchRuleGroups": [],
    *   //   "revisionCreateTime": "my_revisionCreateTime",
    *   //   "revisionId": "my_revisionId",
    *   //   "roleMatch": "my_roleMatch",
    *   //   "type": "my_type",
    *   //   "updateTime": "my_updateTime",
    *   //   "versionTag": "my_versionTag"
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
  def create(params: ParamsResourceProjectsLocationsPhrasematchersCreate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def create(
    params: ParamsResourceProjectsLocationsPhrasematchersCreate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def delete(): GaxiosPromise[SchemaGoogleProtobufEmpty] = js.native
  def delete(callback: BodyResponseCallback[SchemaGoogleProtobufEmpty]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleProtobufEmpty] = js.native
  def delete(params: ParamsResourceProjectsLocationsPhrasematchersDelete): GaxiosPromise[SchemaGoogleProtobufEmpty] = js.native
  def delete(
    params: ParamsResourceProjectsLocationsPhrasematchersDelete,
    callback: BodyResponseCallback[SchemaGoogleProtobufEmpty]
  ): Unit = js.native
  def delete(
    params: ParamsResourceProjectsLocationsPhrasematchersDelete,
    options: BodyResponseCallback[Readable | SchemaGoogleProtobufEmpty],
    callback: BodyResponseCallback[Readable | SchemaGoogleProtobufEmpty]
  ): Unit = js.native
  def delete(params: ParamsResourceProjectsLocationsPhrasematchersDelete, options: MethodOptions): GaxiosPromise[SchemaGoogleProtobufEmpty] = js.native
  def delete(
    params: ParamsResourceProjectsLocationsPhrasematchersDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleProtobufEmpty]
  ): Unit = js.native
  /**
    * Deletes a phrase matcher.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/contactcenterinsights.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const contactcenterinsights = google.contactcenterinsights('v1');
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
    *   const res =
    *     await contactcenterinsights.projects.locations.phraseMatchers.delete({
    *       // Required. The name of the phrase matcher to delete.
    *       name: 'projects/my-project/locations/my-location/phraseMatchers/my-phraseMatcher',
    *     });
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
  def delete(params: ParamsResourceProjectsLocationsPhrasematchersDelete, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def delete(
    params: ParamsResourceProjectsLocationsPhrasematchersDelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def get(): GaxiosPromise[SchemaGoogleCloudContactcenterinsightsV1PhraseMatcher] = js.native
  def get(callback: BodyResponseCallback[SchemaGoogleCloudContactcenterinsightsV1PhraseMatcher]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudContactcenterinsightsV1PhraseMatcher] = js.native
  def get(params: ParamsResourceProjectsLocationsPhrasematchersGet): GaxiosPromise[SchemaGoogleCloudContactcenterinsightsV1PhraseMatcher] = js.native
  def get(
    params: ParamsResourceProjectsLocationsPhrasematchersGet,
    callback: BodyResponseCallback[SchemaGoogleCloudContactcenterinsightsV1PhraseMatcher]
  ): Unit = js.native
  def get(
    params: ParamsResourceProjectsLocationsPhrasematchersGet,
    options: BodyResponseCallback[Readable | SchemaGoogleCloudContactcenterinsightsV1PhraseMatcher],
    callback: BodyResponseCallback[Readable | SchemaGoogleCloudContactcenterinsightsV1PhraseMatcher]
  ): Unit = js.native
  def get(params: ParamsResourceProjectsLocationsPhrasematchersGet, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudContactcenterinsightsV1PhraseMatcher] = js.native
  def get(
    params: ParamsResourceProjectsLocationsPhrasematchersGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudContactcenterinsightsV1PhraseMatcher]
  ): Unit = js.native
  /**
    * Gets a phrase matcher.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/contactcenterinsights.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const contactcenterinsights = google.contactcenterinsights('v1');
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
    *   const res = await contactcenterinsights.projects.locations.phraseMatchers.get(
    *     {
    *       // Required. The name of the phrase matcher to get.
    *       name: 'projects/my-project/locations/my-location/phraseMatchers/my-phraseMatcher',
    *     }
    *   );
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "activationUpdateTime": "my_activationUpdateTime",
    *   //   "active": false,
    *   //   "displayName": "my_displayName",
    *   //   "name": "my_name",
    *   //   "phraseMatchRuleGroups": [],
    *   //   "revisionCreateTime": "my_revisionCreateTime",
    *   //   "revisionId": "my_revisionId",
    *   //   "roleMatch": "my_roleMatch",
    *   //   "type": "my_type",
    *   //   "updateTime": "my_updateTime",
    *   //   "versionTag": "my_versionTag"
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
  def get(params: ParamsResourceProjectsLocationsPhrasematchersGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceProjectsLocationsPhrasematchersGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaGoogleCloudContactcenterinsightsV1ListPhraseMatchersResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaGoogleCloudContactcenterinsightsV1ListPhraseMatchersResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudContactcenterinsightsV1ListPhraseMatchersResponse] = js.native
  def list(params: ParamsResourceProjectsLocationsPhrasematchersList): GaxiosPromise[SchemaGoogleCloudContactcenterinsightsV1ListPhraseMatchersResponse] = js.native
  def list(
    params: ParamsResourceProjectsLocationsPhrasematchersList,
    callback: BodyResponseCallback[SchemaGoogleCloudContactcenterinsightsV1ListPhraseMatchersResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceProjectsLocationsPhrasematchersList,
    options: BodyResponseCallback[Readable | SchemaGoogleCloudContactcenterinsightsV1ListPhraseMatchersResponse],
    callback: BodyResponseCallback[Readable | SchemaGoogleCloudContactcenterinsightsV1ListPhraseMatchersResponse]
  ): Unit = js.native
  def list(params: ParamsResourceProjectsLocationsPhrasematchersList, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudContactcenterinsightsV1ListPhraseMatchersResponse] = js.native
  def list(
    params: ParamsResourceProjectsLocationsPhrasematchersList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudContactcenterinsightsV1ListPhraseMatchersResponse]
  ): Unit = js.native
  /**
    * Lists phrase matchers.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/contactcenterinsights.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const contactcenterinsights = google.contactcenterinsights('v1');
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
    *   const res =
    *     await contactcenterinsights.projects.locations.phraseMatchers.list({
    *       // A filter to reduce results to a specific subset. Useful for querying phrase matchers with specific properties.
    *       filter: 'placeholder-value',
    *       // The maximum number of phrase matchers to return in the response. If this value is zero, the service will select a default size. A call might return fewer objects than requested. A non-empty `next_page_token` in the response indicates that more data is available.
    *       pageSize: 'placeholder-value',
    *       // The value returned by the last `ListPhraseMatchersResponse`. This value indicates that this is a continuation of a prior `ListPhraseMatchers` call and that the system should return the next page of data.
    *       pageToken: 'placeholder-value',
    *       // Required. The parent resource of the phrase matcher.
    *       parent: 'projects/my-project/locations/my-location',
    *     });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "nextPageToken": "my_nextPageToken",
    *   //   "phraseMatchers": []
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
  def list(params: ParamsResourceProjectsLocationsPhrasematchersList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceProjectsLocationsPhrasematchersList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def patch(): GaxiosPromise[SchemaGoogleCloudContactcenterinsightsV1PhraseMatcher] = js.native
  def patch(callback: BodyResponseCallback[SchemaGoogleCloudContactcenterinsightsV1PhraseMatcher]): Unit = js.native
  def patch(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudContactcenterinsightsV1PhraseMatcher] = js.native
  def patch(params: ParamsResourceProjectsLocationsPhrasematchersPatch): GaxiosPromise[SchemaGoogleCloudContactcenterinsightsV1PhraseMatcher] = js.native
  def patch(
    params: ParamsResourceProjectsLocationsPhrasematchersPatch,
    callback: BodyResponseCallback[SchemaGoogleCloudContactcenterinsightsV1PhraseMatcher]
  ): Unit = js.native
  def patch(
    params: ParamsResourceProjectsLocationsPhrasematchersPatch,
    options: BodyResponseCallback[Readable | SchemaGoogleCloudContactcenterinsightsV1PhraseMatcher],
    callback: BodyResponseCallback[Readable | SchemaGoogleCloudContactcenterinsightsV1PhraseMatcher]
  ): Unit = js.native
  def patch(params: ParamsResourceProjectsLocationsPhrasematchersPatch, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudContactcenterinsightsV1PhraseMatcher] = js.native
  def patch(
    params: ParamsResourceProjectsLocationsPhrasematchersPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudContactcenterinsightsV1PhraseMatcher]
  ): Unit = js.native
  /**
    * Updates a phrase matcher.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/contactcenterinsights.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const contactcenterinsights = google.contactcenterinsights('v1');
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
    *   const res =
    *     await contactcenterinsights.projects.locations.phraseMatchers.patch({
    *       // The resource name of the phrase matcher. Format: projects/{project\}/locations/{location\}/phraseMatchers/{phrase_matcher\}
    *       name: 'projects/my-project/locations/my-location/phraseMatchers/my-phraseMatcher',
    *       // The list of fields to be updated.
    *       updateMask: 'placeholder-value',
    *
    *       // Request body metadata
    *       requestBody: {
    *         // request body parameters
    *         // {
    *         //   "activationUpdateTime": "my_activationUpdateTime",
    *         //   "active": false,
    *         //   "displayName": "my_displayName",
    *         //   "name": "my_name",
    *         //   "phraseMatchRuleGroups": [],
    *         //   "revisionCreateTime": "my_revisionCreateTime",
    *         //   "revisionId": "my_revisionId",
    *         //   "roleMatch": "my_roleMatch",
    *         //   "type": "my_type",
    *         //   "updateTime": "my_updateTime",
    *         //   "versionTag": "my_versionTag"
    *         // }
    *       },
    *     });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "activationUpdateTime": "my_activationUpdateTime",
    *   //   "active": false,
    *   //   "displayName": "my_displayName",
    *   //   "name": "my_name",
    *   //   "phraseMatchRuleGroups": [],
    *   //   "revisionCreateTime": "my_revisionCreateTime",
    *   //   "revisionId": "my_revisionId",
    *   //   "roleMatch": "my_roleMatch",
    *   //   "type": "my_type",
    *   //   "updateTime": "my_updateTime",
    *   //   "versionTag": "my_versionTag"
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
  def patch(params: ParamsResourceProjectsLocationsPhrasematchersPatch, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def patch(
    params: ParamsResourceProjectsLocationsPhrasematchersPatch,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
