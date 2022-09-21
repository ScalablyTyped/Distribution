package typings.googleapis.storageV1beta2Mod.storageV1beta2

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/storage/v1beta2", "storage_v1beta2.Resource$Objectaccesscontrols")
@js.native
open class ResourceObjectaccesscontrols protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def delete(): GaxiosPromise[Unit] = js.native
  def delete(callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceObjectaccesscontrolsDelete): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceObjectaccesscontrolsDelete, callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(
    params: ParamsResourceObjectaccesscontrolsDelete,
    options: BodyResponseCallback[Readable | Unit],
    callback: BodyResponseCallback[Readable | Unit]
  ): Unit = js.native
  def delete(params: ParamsResourceObjectaccesscontrolsDelete, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(
    params: ParamsResourceObjectaccesscontrolsDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  /**
    * storage.objectAccessControls.delete
    * @desc Permanently deletes the ACL entry for the specified entity on the specified object.
    * @example
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/storage.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const storage = google.storage('v1beta2');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/devstorage.full_control'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await storage.objectAccessControls.delete({
    *     // Name of a bucket.
    *     bucket: 'placeholder-value',
    *     // The entity holding the permission. Can be user-userId, user-emailAddress, group-groupId, group-emailAddress, allUsers, or allAuthenticatedUsers.
    *     entity: 'placeholder-value',
    *     // If present, selects a specific revision of this object (as opposed to the latest version, the default).
    *     generation: 'placeholder-value',
    *     // Name of the object.
    *     object: 'placeholder-value',
    *   });
    *   console.log(res.data);
    * }
    *
    * main().catch(e => {
    *   console.error(e);
    *   throw e;
    * });
    *
    * @alias storage.objectAccessControls.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.bucket Name of a bucket.
    * @param {string} params.entity The entity holding the permission. Can be user-userId, user-emailAddress, group-groupId, group-emailAddress, allUsers, or allAuthenticatedUsers.
    * @param {string=} params.generation If present, selects a specific revision of this object (as opposed to the latest version, the default).
    * @param {string} params.object Name of the object.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(params: ParamsResourceObjectaccesscontrolsDelete, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def delete(
    params: ParamsResourceObjectaccesscontrolsDelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def get(): GaxiosPromise[SchemaObjectAccessControl] = js.native
  def get(callback: BodyResponseCallback[SchemaObjectAccessControl]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaObjectAccessControl] = js.native
  def get(params: ParamsResourceObjectaccesscontrolsGet): GaxiosPromise[SchemaObjectAccessControl] = js.native
  def get(
    params: ParamsResourceObjectaccesscontrolsGet,
    callback: BodyResponseCallback[SchemaObjectAccessControl]
  ): Unit = js.native
  def get(
    params: ParamsResourceObjectaccesscontrolsGet,
    options: BodyResponseCallback[Readable | SchemaObjectAccessControl],
    callback: BodyResponseCallback[Readable | SchemaObjectAccessControl]
  ): Unit = js.native
  def get(params: ParamsResourceObjectaccesscontrolsGet, options: MethodOptions): GaxiosPromise[SchemaObjectAccessControl] = js.native
  def get(
    params: ParamsResourceObjectaccesscontrolsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaObjectAccessControl]
  ): Unit = js.native
  /**
    * storage.objectAccessControls.get
    * @desc Returns the ACL entry for the specified entity on the specified object.
    * @example
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/storage.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const storage = google.storage('v1beta2');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/devstorage.full_control'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await storage.objectAccessControls.get({
    *     // Name of a bucket.
    *     bucket: 'placeholder-value',
    *     // The entity holding the permission. Can be user-userId, user-emailAddress, group-groupId, group-emailAddress, allUsers, or allAuthenticatedUsers.
    *     entity: 'placeholder-value',
    *     // If present, selects a specific revision of this object (as opposed to the latest version, the default).
    *     generation: 'placeholder-value',
    *     // Name of the object.
    *     object: 'placeholder-value',
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
    * @alias storage.objectAccessControls.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.bucket Name of a bucket.
    * @param {string} params.entity The entity holding the permission. Can be user-userId, user-emailAddress, group-groupId, group-emailAddress, allUsers, or allAuthenticatedUsers.
    * @param {string=} params.generation If present, selects a specific revision of this object (as opposed to the latest version, the default).
    * @param {string} params.object Name of the object.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(params: ParamsResourceObjectaccesscontrolsGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceObjectaccesscontrolsGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def insert(): GaxiosPromise[SchemaObjectAccessControl] = js.native
  def insert(callback: BodyResponseCallback[SchemaObjectAccessControl]): Unit = js.native
  def insert(params: Unit, options: MethodOptions): GaxiosPromise[SchemaObjectAccessControl] = js.native
  def insert(params: ParamsResourceObjectaccesscontrolsInsert): GaxiosPromise[SchemaObjectAccessControl] = js.native
  def insert(
    params: ParamsResourceObjectaccesscontrolsInsert,
    callback: BodyResponseCallback[SchemaObjectAccessControl]
  ): Unit = js.native
  def insert(
    params: ParamsResourceObjectaccesscontrolsInsert,
    options: BodyResponseCallback[Readable | SchemaObjectAccessControl],
    callback: BodyResponseCallback[Readable | SchemaObjectAccessControl]
  ): Unit = js.native
  def insert(params: ParamsResourceObjectaccesscontrolsInsert, options: MethodOptions): GaxiosPromise[SchemaObjectAccessControl] = js.native
  def insert(
    params: ParamsResourceObjectaccesscontrolsInsert,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaObjectAccessControl]
  ): Unit = js.native
  /**
    * storage.objectAccessControls.insert
    * @desc Creates a new ACL entry on the specified object.
    * @example
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/storage.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const storage = google.storage('v1beta2');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/devstorage.full_control'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await storage.objectAccessControls.insert({
    *     // Name of a bucket.
    *     bucket: 'placeholder-value',
    *     // If present, selects a specific revision of this object (as opposed to the latest version, the default).
    *     generation: 'placeholder-value',
    *     // Name of the object.
    *     object: 'placeholder-value',
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
    * @alias storage.objectAccessControls.insert
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.bucket Name of a bucket.
    * @param {string=} params.generation If present, selects a specific revision of this object (as opposed to the latest version, the default).
    * @param {string} params.object Name of the object.
    * @param {().ObjectAccessControl} params.requestBody Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def insert(params: ParamsResourceObjectaccesscontrolsInsert, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def insert(
    params: ParamsResourceObjectaccesscontrolsInsert,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaObjectAccessControls] = js.native
  def list(callback: BodyResponseCallback[SchemaObjectAccessControls]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaObjectAccessControls] = js.native
  def list(params: ParamsResourceObjectaccesscontrolsList): GaxiosPromise[SchemaObjectAccessControls] = js.native
  def list(
    params: ParamsResourceObjectaccesscontrolsList,
    callback: BodyResponseCallback[SchemaObjectAccessControls]
  ): Unit = js.native
  def list(
    params: ParamsResourceObjectaccesscontrolsList,
    options: BodyResponseCallback[Readable | SchemaObjectAccessControls],
    callback: BodyResponseCallback[Readable | SchemaObjectAccessControls]
  ): Unit = js.native
  def list(params: ParamsResourceObjectaccesscontrolsList, options: MethodOptions): GaxiosPromise[SchemaObjectAccessControls] = js.native
  def list(
    params: ParamsResourceObjectaccesscontrolsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaObjectAccessControls]
  ): Unit = js.native
  /**
    * storage.objectAccessControls.list
    * @desc Retrieves ACL entries on the specified object.
    * @example
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/storage.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const storage = google.storage('v1beta2');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/devstorage.full_control'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await storage.objectAccessControls.list({
    *     // Name of a bucket.
    *     bucket: 'placeholder-value',
    *     // If present, selects a specific revision of this object (as opposed to the latest version, the default).
    *     generation: 'placeholder-value',
    *     // Name of the object.
    *     object: 'placeholder-value',
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
    * @alias storage.objectAccessControls.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.bucket Name of a bucket.
    * @param {string=} params.generation If present, selects a specific revision of this object (as opposed to the latest version, the default).
    * @param {string} params.object Name of the object.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(params: ParamsResourceObjectaccesscontrolsList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceObjectaccesscontrolsList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def patch(): GaxiosPromise[SchemaObjectAccessControl] = js.native
  def patch(callback: BodyResponseCallback[SchemaObjectAccessControl]): Unit = js.native
  def patch(params: Unit, options: MethodOptions): GaxiosPromise[SchemaObjectAccessControl] = js.native
  def patch(params: ParamsResourceObjectaccesscontrolsPatch): GaxiosPromise[SchemaObjectAccessControl] = js.native
  def patch(
    params: ParamsResourceObjectaccesscontrolsPatch,
    callback: BodyResponseCallback[SchemaObjectAccessControl]
  ): Unit = js.native
  def patch(
    params: ParamsResourceObjectaccesscontrolsPatch,
    options: BodyResponseCallback[Readable | SchemaObjectAccessControl],
    callback: BodyResponseCallback[Readable | SchemaObjectAccessControl]
  ): Unit = js.native
  def patch(params: ParamsResourceObjectaccesscontrolsPatch, options: MethodOptions): GaxiosPromise[SchemaObjectAccessControl] = js.native
  def patch(
    params: ParamsResourceObjectaccesscontrolsPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaObjectAccessControl]
  ): Unit = js.native
  /**
    * storage.objectAccessControls.patch
    * @desc Updates an ACL entry on the specified object. This method supports patch semantics.
    * @example
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/storage.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const storage = google.storage('v1beta2');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/devstorage.full_control'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await storage.objectAccessControls.patch({
    *     // Name of a bucket.
    *     bucket: 'placeholder-value',
    *     // The entity holding the permission. Can be user-userId, user-emailAddress, group-groupId, group-emailAddress, allUsers, or allAuthenticatedUsers.
    *     entity: 'placeholder-value',
    *     // If present, selects a specific revision of this object (as opposed to the latest version, the default).
    *     generation: 'placeholder-value',
    *     // Name of the object.
    *     object: 'placeholder-value',
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
    * @alias storage.objectAccessControls.patch
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.bucket Name of a bucket.
    * @param {string} params.entity The entity holding the permission. Can be user-userId, user-emailAddress, group-groupId, group-emailAddress, allUsers, or allAuthenticatedUsers.
    * @param {string=} params.generation If present, selects a specific revision of this object (as opposed to the latest version, the default).
    * @param {string} params.object Name of the object.
    * @param {().ObjectAccessControl} params.requestBody Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def patch(params: ParamsResourceObjectaccesscontrolsPatch, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def patch(
    params: ParamsResourceObjectaccesscontrolsPatch,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def update(): GaxiosPromise[SchemaObjectAccessControl] = js.native
  def update(callback: BodyResponseCallback[SchemaObjectAccessControl]): Unit = js.native
  def update(params: Unit, options: MethodOptions): GaxiosPromise[SchemaObjectAccessControl] = js.native
  def update(params: ParamsResourceObjectaccesscontrolsUpdate): GaxiosPromise[SchemaObjectAccessControl] = js.native
  def update(
    params: ParamsResourceObjectaccesscontrolsUpdate,
    callback: BodyResponseCallback[SchemaObjectAccessControl]
  ): Unit = js.native
  def update(
    params: ParamsResourceObjectaccesscontrolsUpdate,
    options: BodyResponseCallback[Readable | SchemaObjectAccessControl],
    callback: BodyResponseCallback[Readable | SchemaObjectAccessControl]
  ): Unit = js.native
  def update(params: ParamsResourceObjectaccesscontrolsUpdate, options: MethodOptions): GaxiosPromise[SchemaObjectAccessControl] = js.native
  def update(
    params: ParamsResourceObjectaccesscontrolsUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaObjectAccessControl]
  ): Unit = js.native
  /**
    * storage.objectAccessControls.update
    * @desc Updates an ACL entry on the specified object.
    * @example
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/storage.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const storage = google.storage('v1beta2');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/devstorage.full_control'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await storage.objectAccessControls.update({
    *     // Name of a bucket.
    *     bucket: 'placeholder-value',
    *     // The entity holding the permission. Can be user-userId, user-emailAddress, group-groupId, group-emailAddress, allUsers, or allAuthenticatedUsers.
    *     entity: 'placeholder-value',
    *     // If present, selects a specific revision of this object (as opposed to the latest version, the default).
    *     generation: 'placeholder-value',
    *     // Name of the object.
    *     object: 'placeholder-value',
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
    * @alias storage.objectAccessControls.update
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.bucket Name of a bucket.
    * @param {string} params.entity The entity holding the permission. Can be user-userId, user-emailAddress, group-groupId, group-emailAddress, allUsers, or allAuthenticatedUsers.
    * @param {string=} params.generation If present, selects a specific revision of this object (as opposed to the latest version, the default).
    * @param {string} params.object Name of the object.
    * @param {().ObjectAccessControl} params.requestBody Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def update(params: ParamsResourceObjectaccesscontrolsUpdate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def update(
    params: ParamsResourceObjectaccesscontrolsUpdate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
