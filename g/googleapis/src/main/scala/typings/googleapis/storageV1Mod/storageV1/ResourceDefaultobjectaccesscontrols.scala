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

@JSImport("googleapis/build/src/apis/storage/v1", "storage_v1.Resource$Defaultobjectaccesscontrols")
@js.native
open class ResourceDefaultobjectaccesscontrols protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def delete(): GaxiosPromise[Unit] = js.native
  def delete(callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceDefaultobjectaccesscontrolsDelete): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceDefaultobjectaccesscontrolsDelete, callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(
    params: ParamsResourceDefaultobjectaccesscontrolsDelete,
    options: BodyResponseCallback[Readable | Unit],
    callback: BodyResponseCallback[Readable | Unit]
  ): Unit = js.native
  def delete(params: ParamsResourceDefaultobjectaccesscontrolsDelete, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(
    params: ParamsResourceDefaultobjectaccesscontrolsDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  /**
    * Permanently deletes the default object ACL entry for the specified entity on the specified bucket.
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
    *   const res = await storage.defaultObjectAccessControls.delete({
    *     // Name of a bucket.
    *     bucket: 'placeholder-value',
    *     // The entity holding the permission. Can be user-userId, user-emailAddress, group-groupId, group-emailAddress, allUsers, or allAuthenticatedUsers.
    *     entity: 'placeholder-value',
    *     // The project to be billed for this request. Required for Requester Pays buckets.
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
  def delete(params: ParamsResourceDefaultobjectaccesscontrolsDelete, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def delete(
    params: ParamsResourceDefaultobjectaccesscontrolsDelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def get(): GaxiosPromise[SchemaObjectAccessControl] = js.native
  def get(callback: BodyResponseCallback[SchemaObjectAccessControl]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaObjectAccessControl] = js.native
  def get(params: ParamsResourceDefaultobjectaccesscontrolsGet): GaxiosPromise[SchemaObjectAccessControl] = js.native
  def get(
    params: ParamsResourceDefaultobjectaccesscontrolsGet,
    callback: BodyResponseCallback[SchemaObjectAccessControl]
  ): Unit = js.native
  def get(
    params: ParamsResourceDefaultobjectaccesscontrolsGet,
    options: BodyResponseCallback[Readable | SchemaObjectAccessControl],
    callback: BodyResponseCallback[Readable | SchemaObjectAccessControl]
  ): Unit = js.native
  def get(params: ParamsResourceDefaultobjectaccesscontrolsGet, options: MethodOptions): GaxiosPromise[SchemaObjectAccessControl] = js.native
  def get(
    params: ParamsResourceDefaultobjectaccesscontrolsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaObjectAccessControl]
  ): Unit = js.native
  /**
    * Returns the default object ACL entry for the specified entity on the specified bucket.
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
    *   const res = await storage.defaultObjectAccessControls.get({
    *     // Name of a bucket.
    *     bucket: 'placeholder-value',
    *     // The entity holding the permission. Can be user-userId, user-emailAddress, group-groupId, group-emailAddress, allUsers, or allAuthenticatedUsers.
    *     entity: 'placeholder-value',
    *     // The project to be billed for this request. Required for Requester Pays buckets.
    *     userProject: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "bucket": "my_bucket",
    *   //   "domain": "my_domain",
    *   //   "email": "my_email",
    *   //   "entity": "my_entity",
    *   //   "entityId": "my_entityId",
    *   //   "etag": "my_etag",
    *   //   "generation": "my_generation",
    *   //   "id": "my_id",
    *   //   "kind": "my_kind",
    *   //   "object": "my_object",
    *   //   "projectTeam": {},
    *   //   "role": "my_role",
    *   //   "selfLink": "my_selfLink"
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
  def get(params: ParamsResourceDefaultobjectaccesscontrolsGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceDefaultobjectaccesscontrolsGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def insert(): GaxiosPromise[SchemaObjectAccessControl] = js.native
  def insert(callback: BodyResponseCallback[SchemaObjectAccessControl]): Unit = js.native
  def insert(params: Unit, options: MethodOptions): GaxiosPromise[SchemaObjectAccessControl] = js.native
  def insert(params: ParamsResourceDefaultobjectaccesscontrolsInsert): GaxiosPromise[SchemaObjectAccessControl] = js.native
  def insert(
    params: ParamsResourceDefaultobjectaccesscontrolsInsert,
    callback: BodyResponseCallback[SchemaObjectAccessControl]
  ): Unit = js.native
  def insert(
    params: ParamsResourceDefaultobjectaccesscontrolsInsert,
    options: BodyResponseCallback[Readable | SchemaObjectAccessControl],
    callback: BodyResponseCallback[Readable | SchemaObjectAccessControl]
  ): Unit = js.native
  def insert(params: ParamsResourceDefaultobjectaccesscontrolsInsert, options: MethodOptions): GaxiosPromise[SchemaObjectAccessControl] = js.native
  def insert(
    params: ParamsResourceDefaultobjectaccesscontrolsInsert,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaObjectAccessControl]
  ): Unit = js.native
  /**
    * Creates a new default object ACL entry on the specified bucket.
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
    *   const res = await storage.defaultObjectAccessControls.insert({
    *     // Name of a bucket.
    *     bucket: 'placeholder-value',
    *     // The project to be billed for this request. Required for Requester Pays buckets.
    *     userProject: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "bucket": "my_bucket",
    *       //   "domain": "my_domain",
    *       //   "email": "my_email",
    *       //   "entity": "my_entity",
    *       //   "entityId": "my_entityId",
    *       //   "etag": "my_etag",
    *       //   "generation": "my_generation",
    *       //   "id": "my_id",
    *       //   "kind": "my_kind",
    *       //   "object": "my_object",
    *       //   "projectTeam": {},
    *       //   "role": "my_role",
    *       //   "selfLink": "my_selfLink"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "bucket": "my_bucket",
    *   //   "domain": "my_domain",
    *   //   "email": "my_email",
    *   //   "entity": "my_entity",
    *   //   "entityId": "my_entityId",
    *   //   "etag": "my_etag",
    *   //   "generation": "my_generation",
    *   //   "id": "my_id",
    *   //   "kind": "my_kind",
    *   //   "object": "my_object",
    *   //   "projectTeam": {},
    *   //   "role": "my_role",
    *   //   "selfLink": "my_selfLink"
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
  def insert(params: ParamsResourceDefaultobjectaccesscontrolsInsert, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def insert(
    params: ParamsResourceDefaultobjectaccesscontrolsInsert,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaObjectAccessControls] = js.native
  def list(callback: BodyResponseCallback[SchemaObjectAccessControls]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaObjectAccessControls] = js.native
  def list(params: ParamsResourceDefaultobjectaccesscontrolsList): GaxiosPromise[SchemaObjectAccessControls] = js.native
  def list(
    params: ParamsResourceDefaultobjectaccesscontrolsList,
    callback: BodyResponseCallback[SchemaObjectAccessControls]
  ): Unit = js.native
  def list(
    params: ParamsResourceDefaultobjectaccesscontrolsList,
    options: BodyResponseCallback[Readable | SchemaObjectAccessControls],
    callback: BodyResponseCallback[Readable | SchemaObjectAccessControls]
  ): Unit = js.native
  def list(params: ParamsResourceDefaultobjectaccesscontrolsList, options: MethodOptions): GaxiosPromise[SchemaObjectAccessControls] = js.native
  def list(
    params: ParamsResourceDefaultobjectaccesscontrolsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaObjectAccessControls]
  ): Unit = js.native
  /**
    * Retrieves default object ACL entries on the specified bucket.
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
    *   const res = await storage.defaultObjectAccessControls.list({
    *     // Name of a bucket.
    *     bucket: 'placeholder-value',
    *     // If present, only return default ACL listing if the bucket's current metageneration matches this value.
    *     ifMetagenerationMatch: 'placeholder-value',
    *     // If present, only return default ACL listing if the bucket's current metageneration does not match the given value.
    *     ifMetagenerationNotMatch: 'placeholder-value',
    *     // The project to be billed for this request. Required for Requester Pays buckets.
    *     userProject: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "items": [],
    *   //   "kind": "my_kind"
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
  def list(params: ParamsResourceDefaultobjectaccesscontrolsList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceDefaultobjectaccesscontrolsList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def patch(): GaxiosPromise[SchemaObjectAccessControl] = js.native
  def patch(callback: BodyResponseCallback[SchemaObjectAccessControl]): Unit = js.native
  def patch(params: Unit, options: MethodOptions): GaxiosPromise[SchemaObjectAccessControl] = js.native
  def patch(params: ParamsResourceDefaultobjectaccesscontrolsPatch): GaxiosPromise[SchemaObjectAccessControl] = js.native
  def patch(
    params: ParamsResourceDefaultobjectaccesscontrolsPatch,
    callback: BodyResponseCallback[SchemaObjectAccessControl]
  ): Unit = js.native
  def patch(
    params: ParamsResourceDefaultobjectaccesscontrolsPatch,
    options: BodyResponseCallback[Readable | SchemaObjectAccessControl],
    callback: BodyResponseCallback[Readable | SchemaObjectAccessControl]
  ): Unit = js.native
  def patch(params: ParamsResourceDefaultobjectaccesscontrolsPatch, options: MethodOptions): GaxiosPromise[SchemaObjectAccessControl] = js.native
  def patch(
    params: ParamsResourceDefaultobjectaccesscontrolsPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaObjectAccessControl]
  ): Unit = js.native
  /**
    * Patches a default object ACL entry on the specified bucket.
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
    *   const res = await storage.defaultObjectAccessControls.patch({
    *     // Name of a bucket.
    *     bucket: 'placeholder-value',
    *     // The entity holding the permission. Can be user-userId, user-emailAddress, group-groupId, group-emailAddress, allUsers, or allAuthenticatedUsers.
    *     entity: 'placeholder-value',
    *     // The project to be billed for this request. Required for Requester Pays buckets.
    *     userProject: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "bucket": "my_bucket",
    *       //   "domain": "my_domain",
    *       //   "email": "my_email",
    *       //   "entity": "my_entity",
    *       //   "entityId": "my_entityId",
    *       //   "etag": "my_etag",
    *       //   "generation": "my_generation",
    *       //   "id": "my_id",
    *       //   "kind": "my_kind",
    *       //   "object": "my_object",
    *       //   "projectTeam": {},
    *       //   "role": "my_role",
    *       //   "selfLink": "my_selfLink"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "bucket": "my_bucket",
    *   //   "domain": "my_domain",
    *   //   "email": "my_email",
    *   //   "entity": "my_entity",
    *   //   "entityId": "my_entityId",
    *   //   "etag": "my_etag",
    *   //   "generation": "my_generation",
    *   //   "id": "my_id",
    *   //   "kind": "my_kind",
    *   //   "object": "my_object",
    *   //   "projectTeam": {},
    *   //   "role": "my_role",
    *   //   "selfLink": "my_selfLink"
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
  def patch(params: ParamsResourceDefaultobjectaccesscontrolsPatch, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def patch(
    params: ParamsResourceDefaultobjectaccesscontrolsPatch,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def update(): GaxiosPromise[SchemaObjectAccessControl] = js.native
  def update(callback: BodyResponseCallback[SchemaObjectAccessControl]): Unit = js.native
  def update(params: Unit, options: MethodOptions): GaxiosPromise[SchemaObjectAccessControl] = js.native
  def update(params: ParamsResourceDefaultobjectaccesscontrolsUpdate): GaxiosPromise[SchemaObjectAccessControl] = js.native
  def update(
    params: ParamsResourceDefaultobjectaccesscontrolsUpdate,
    callback: BodyResponseCallback[SchemaObjectAccessControl]
  ): Unit = js.native
  def update(
    params: ParamsResourceDefaultobjectaccesscontrolsUpdate,
    options: BodyResponseCallback[Readable | SchemaObjectAccessControl],
    callback: BodyResponseCallback[Readable | SchemaObjectAccessControl]
  ): Unit = js.native
  def update(params: ParamsResourceDefaultobjectaccesscontrolsUpdate, options: MethodOptions): GaxiosPromise[SchemaObjectAccessControl] = js.native
  def update(
    params: ParamsResourceDefaultobjectaccesscontrolsUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaObjectAccessControl]
  ): Unit = js.native
  /**
    * Updates a default object ACL entry on the specified bucket.
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
    *   const res = await storage.defaultObjectAccessControls.update({
    *     // Name of a bucket.
    *     bucket: 'placeholder-value',
    *     // The entity holding the permission. Can be user-userId, user-emailAddress, group-groupId, group-emailAddress, allUsers, or allAuthenticatedUsers.
    *     entity: 'placeholder-value',
    *     // The project to be billed for this request. Required for Requester Pays buckets.
    *     userProject: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "bucket": "my_bucket",
    *       //   "domain": "my_domain",
    *       //   "email": "my_email",
    *       //   "entity": "my_entity",
    *       //   "entityId": "my_entityId",
    *       //   "etag": "my_etag",
    *       //   "generation": "my_generation",
    *       //   "id": "my_id",
    *       //   "kind": "my_kind",
    *       //   "object": "my_object",
    *       //   "projectTeam": {},
    *       //   "role": "my_role",
    *       //   "selfLink": "my_selfLink"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "bucket": "my_bucket",
    *   //   "domain": "my_domain",
    *   //   "email": "my_email",
    *   //   "entity": "my_entity",
    *   //   "entityId": "my_entityId",
    *   //   "etag": "my_etag",
    *   //   "generation": "my_generation",
    *   //   "id": "my_id",
    *   //   "kind": "my_kind",
    *   //   "object": "my_object",
    *   //   "projectTeam": {},
    *   //   "role": "my_role",
    *   //   "selfLink": "my_selfLink"
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
  def update(params: ParamsResourceDefaultobjectaccesscontrolsUpdate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def update(
    params: ParamsResourceDefaultobjectaccesscontrolsUpdate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
