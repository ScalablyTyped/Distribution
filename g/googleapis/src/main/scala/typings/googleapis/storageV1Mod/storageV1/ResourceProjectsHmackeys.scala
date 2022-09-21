package typings.googleapis.storageV1Mod.storageV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/storage/v1", "storage_v1.Resource$Projects$Hmackeys")
@js.native
open class ResourceProjectsHmackeys protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def create(): GaxiosPromise[SchemaHmacKey] = js.native
  def create(callback: BodyResponseCallback[SchemaHmacKey]): Unit = js.native
  def create(params: Unit, options: MethodOptions): GaxiosPromise[SchemaHmacKey] = js.native
  def create(params: ParamsResourceProjectsHmackeysCreate): GaxiosPromise[SchemaHmacKey] = js.native
  def create(params: ParamsResourceProjectsHmackeysCreate, callback: BodyResponseCallback[SchemaHmacKey]): Unit = js.native
  def create(
    params: ParamsResourceProjectsHmackeysCreate,
    options: BodyResponseCallback[Readable | SchemaHmacKey],
    callback: BodyResponseCallback[Readable | SchemaHmacKey]
  ): Unit = js.native
  def create(params: ParamsResourceProjectsHmackeysCreate, options: MethodOptions): GaxiosPromise[SchemaHmacKey] = js.native
  def create(
    params: ParamsResourceProjectsHmackeysCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaHmacKey]
  ): Unit = js.native
  /**
    * Creates a new HMAC key for the specified service account.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/storage.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const storage = google.storage('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/cloud-platform',
    *       'https://www.googleapis.com/auth/devstorage.full_control',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await storage.projects.hmacKeys.create({
    *     // Project ID owning the service account.
    *     projectId: 'placeholder-value',
    *     // Email address of the service account.
    *     serviceAccountEmail: 'placeholder-value',
    *     // The project to be billed for this request.
    *     userProject: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "kind": "my_kind",
    *   //   "metadata": {},
    *   //   "secret": "my_secret"
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
  def create(params: ParamsResourceProjectsHmackeysCreate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def create(
    params: ParamsResourceProjectsHmackeysCreate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def delete(): GaxiosPromise[Unit] = js.native
  def delete(callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceProjectsHmackeysDelete): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceProjectsHmackeysDelete, callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(
    params: ParamsResourceProjectsHmackeysDelete,
    options: BodyResponseCallback[Readable | Unit],
    callback: BodyResponseCallback[Readable | Unit]
  ): Unit = js.native
  def delete(params: ParamsResourceProjectsHmackeysDelete, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(
    params: ParamsResourceProjectsHmackeysDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  /**
    * Deletes an HMAC key.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/storage.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const storage = google.storage('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/cloud-platform',
    *       'https://www.googleapis.com/auth/devstorage.full_control',
    *       'https://www.googleapis.com/auth/devstorage.read_write',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await storage.projects.hmacKeys.delete({
    *     // Name of the HMAC key to be deleted.
    *     accessId: 'placeholder-value',
    *     // Project ID owning the requested key
    *     projectId: 'placeholder-value',
    *     // The project to be billed for this request.
    *     userProject: 'placeholder-value',
    *   });
    *   console.log(res.data);
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
  def delete(params: ParamsResourceProjectsHmackeysDelete, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def delete(
    params: ParamsResourceProjectsHmackeysDelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def get(): GaxiosPromise[SchemaHmacKeyMetadata] = js.native
  def get(callback: BodyResponseCallback[SchemaHmacKeyMetadata]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaHmacKeyMetadata] = js.native
  def get(params: ParamsResourceProjectsHmackeysGet): GaxiosPromise[SchemaHmacKeyMetadata] = js.native
  def get(params: ParamsResourceProjectsHmackeysGet, callback: BodyResponseCallback[SchemaHmacKeyMetadata]): Unit = js.native
  def get(
    params: ParamsResourceProjectsHmackeysGet,
    options: BodyResponseCallback[Readable | SchemaHmacKeyMetadata],
    callback: BodyResponseCallback[Readable | SchemaHmacKeyMetadata]
  ): Unit = js.native
  def get(params: ParamsResourceProjectsHmackeysGet, options: MethodOptions): GaxiosPromise[SchemaHmacKeyMetadata] = js.native
  def get(
    params: ParamsResourceProjectsHmackeysGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaHmacKeyMetadata]
  ): Unit = js.native
  /**
    * Retrieves an HMAC key's metadata
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/storage.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const storage = google.storage('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/cloud-platform',
    *       'https://www.googleapis.com/auth/cloud-platform.read-only',
    *       'https://www.googleapis.com/auth/devstorage.full_control',
    *       'https://www.googleapis.com/auth/devstorage.read_only',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await storage.projects.hmacKeys.get({
    *     // Name of the HMAC key.
    *     accessId: 'placeholder-value',
    *     // Project ID owning the service account of the requested key.
    *     projectId: 'placeholder-value',
    *     // The project to be billed for this request.
    *     userProject: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "accessId": "my_accessId",
    *   //   "etag": "my_etag",
    *   //   "id": "my_id",
    *   //   "kind": "my_kind",
    *   //   "projectId": "my_projectId",
    *   //   "selfLink": "my_selfLink",
    *   //   "serviceAccountEmail": "my_serviceAccountEmail",
    *   //   "state": "my_state",
    *   //   "timeCreated": "my_timeCreated",
    *   //   "updated": "my_updated"
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
  def get(params: ParamsResourceProjectsHmackeysGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceProjectsHmackeysGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaHmacKeysMetadata] = js.native
  def list(callback: BodyResponseCallback[SchemaHmacKeysMetadata]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaHmacKeysMetadata] = js.native
  def list(params: ParamsResourceProjectsHmackeysList): GaxiosPromise[SchemaHmacKeysMetadata] = js.native
  def list(params: ParamsResourceProjectsHmackeysList, callback: BodyResponseCallback[SchemaHmacKeysMetadata]): Unit = js.native
  def list(
    params: ParamsResourceProjectsHmackeysList,
    options: BodyResponseCallback[Readable | SchemaHmacKeysMetadata],
    callback: BodyResponseCallback[Readable | SchemaHmacKeysMetadata]
  ): Unit = js.native
  def list(params: ParamsResourceProjectsHmackeysList, options: MethodOptions): GaxiosPromise[SchemaHmacKeysMetadata] = js.native
  def list(
    params: ParamsResourceProjectsHmackeysList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaHmacKeysMetadata]
  ): Unit = js.native
  /**
    * Retrieves a list of HMAC keys matching the criteria.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/storage.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const storage = google.storage('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/cloud-platform',
    *       'https://www.googleapis.com/auth/cloud-platform.read-only',
    *       'https://www.googleapis.com/auth/devstorage.full_control',
    *       'https://www.googleapis.com/auth/devstorage.read_only',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await storage.projects.hmacKeys.list({
    *     // Maximum number of items to return in a single page of responses. The service uses this parameter or 250 items, whichever is smaller. The max number of items per page will also be limited by the number of distinct service accounts in the response. If the number of service accounts in a single response is too high, the page will truncated and a next page token will be returned.
    *     maxResults: 'placeholder-value',
    *     // A previously-returned page token representing part of the larger set of results to view.
    *     pageToken: 'placeholder-value',
    *     // Name of the project in which to look for HMAC keys.
    *     projectId: 'placeholder-value',
    *     // If present, only keys for the given service account are returned.
    *     serviceAccountEmail: 'placeholder-value',
    *     // Whether or not to show keys in the DELETED state.
    *     showDeletedKeys: 'placeholder-value',
    *     // The project to be billed for this request.
    *     userProject: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "items": [],
    *   //   "kind": "my_kind",
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
  def list(params: ParamsResourceProjectsHmackeysList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceProjectsHmackeysList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def update(): GaxiosPromise[SchemaHmacKeyMetadata] = js.native
  def update(callback: BodyResponseCallback[SchemaHmacKeyMetadata]): Unit = js.native
  def update(params: Unit, options: MethodOptions): GaxiosPromise[SchemaHmacKeyMetadata] = js.native
  def update(params: ParamsResourceProjectsHmackeysUpdate): GaxiosPromise[SchemaHmacKeyMetadata] = js.native
  def update(
    params: ParamsResourceProjectsHmackeysUpdate,
    callback: BodyResponseCallback[SchemaHmacKeyMetadata]
  ): Unit = js.native
  def update(
    params: ParamsResourceProjectsHmackeysUpdate,
    options: BodyResponseCallback[Readable | SchemaHmacKeyMetadata],
    callback: BodyResponseCallback[Readable | SchemaHmacKeyMetadata]
  ): Unit = js.native
  def update(params: ParamsResourceProjectsHmackeysUpdate, options: MethodOptions): GaxiosPromise[SchemaHmacKeyMetadata] = js.native
  def update(
    params: ParamsResourceProjectsHmackeysUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaHmacKeyMetadata]
  ): Unit = js.native
  /**
    * Updates the state of an HMAC key. See the HMAC Key resource descriptor for valid states.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/storage.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const storage = google.storage('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/cloud-platform',
    *       'https://www.googleapis.com/auth/devstorage.full_control',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await storage.projects.hmacKeys.update({
    *     // Name of the HMAC key being updated.
    *     accessId: 'placeholder-value',
    *     // Project ID owning the service account of the updated key.
    *     projectId: 'placeholder-value',
    *     // The project to be billed for this request.
    *     userProject: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "accessId": "my_accessId",
    *       //   "etag": "my_etag",
    *       //   "id": "my_id",
    *       //   "kind": "my_kind",
    *       //   "projectId": "my_projectId",
    *       //   "selfLink": "my_selfLink",
    *       //   "serviceAccountEmail": "my_serviceAccountEmail",
    *       //   "state": "my_state",
    *       //   "timeCreated": "my_timeCreated",
    *       //   "updated": "my_updated"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "accessId": "my_accessId",
    *   //   "etag": "my_etag",
    *   //   "id": "my_id",
    *   //   "kind": "my_kind",
    *   //   "projectId": "my_projectId",
    *   //   "selfLink": "my_selfLink",
    *   //   "serviceAccountEmail": "my_serviceAccountEmail",
    *   //   "state": "my_state",
    *   //   "timeCreated": "my_timeCreated",
    *   //   "updated": "my_updated"
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
  def update(params: ParamsResourceProjectsHmackeysUpdate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def update(
    params: ParamsResourceProjectsHmackeysUpdate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
