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

@JSImport("googleapis/build/src/apis/storage/v1beta2", "storage_v1beta2.Resource$Bucketaccesscontrols")
@js.native
open class ResourceBucketaccesscontrols protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def delete(): GaxiosPromise[Unit] = js.native
  def delete(callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceBucketaccesscontrolsDelete): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceBucketaccesscontrolsDelete, callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(
    params: ParamsResourceBucketaccesscontrolsDelete,
    options: BodyResponseCallback[Readable | Unit],
    callback: BodyResponseCallback[Readable | Unit]
  ): Unit = js.native
  def delete(params: ParamsResourceBucketaccesscontrolsDelete, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(
    params: ParamsResourceBucketaccesscontrolsDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  /**
    * storage.bucketAccessControls.delete
    * @desc Permanently deletes the ACL entry for the specified entity on the specified bucket.
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
    *   const res = await storage.bucketAccessControls.delete({
    *     // Name of a bucket.
    *     bucket: 'placeholder-value',
    *     // The entity holding the permission. Can be user-userId, user-emailAddress, group-groupId, group-emailAddress, allUsers, or allAuthenticatedUsers.
    *     entity: 'placeholder-value',
    *   });
    *   console.log(res.data);
    * }
    *
    * main().catch(e => {
    *   console.error(e);
    *   throw e;
    * });
    *
    * @alias storage.bucketAccessControls.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.bucket Name of a bucket.
    * @param {string} params.entity The entity holding the permission. Can be user-userId, user-emailAddress, group-groupId, group-emailAddress, allUsers, or allAuthenticatedUsers.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(params: ParamsResourceBucketaccesscontrolsDelete, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def delete(
    params: ParamsResourceBucketaccesscontrolsDelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def get(): GaxiosPromise[SchemaBucketAccessControl] = js.native
  def get(callback: BodyResponseCallback[SchemaBucketAccessControl]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaBucketAccessControl] = js.native
  def get(params: ParamsResourceBucketaccesscontrolsGet): GaxiosPromise[SchemaBucketAccessControl] = js.native
  def get(
    params: ParamsResourceBucketaccesscontrolsGet,
    callback: BodyResponseCallback[SchemaBucketAccessControl]
  ): Unit = js.native
  def get(
    params: ParamsResourceBucketaccesscontrolsGet,
    options: BodyResponseCallback[Readable | SchemaBucketAccessControl],
    callback: BodyResponseCallback[Readable | SchemaBucketAccessControl]
  ): Unit = js.native
  def get(params: ParamsResourceBucketaccesscontrolsGet, options: MethodOptions): GaxiosPromise[SchemaBucketAccessControl] = js.native
  def get(
    params: ParamsResourceBucketaccesscontrolsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaBucketAccessControl]
  ): Unit = js.native
  /**
    * storage.bucketAccessControls.get
    * @desc Returns the ACL entry for the specified entity on the specified bucket.
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
    *   const res = await storage.bucketAccessControls.get({
    *     // Name of a bucket.
    *     bucket: 'placeholder-value',
    *     // The entity holding the permission. Can be user-userId, user-emailAddress, group-groupId, group-emailAddress, allUsers, or allAuthenticatedUsers.
    *     entity: 'placeholder-value',
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
    *   //   "id": "my_id",
    *   //   "kind": "my_kind",
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
    * @alias storage.bucketAccessControls.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.bucket Name of a bucket.
    * @param {string} params.entity The entity holding the permission. Can be user-userId, user-emailAddress, group-groupId, group-emailAddress, allUsers, or allAuthenticatedUsers.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(params: ParamsResourceBucketaccesscontrolsGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceBucketaccesscontrolsGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def insert(): GaxiosPromise[SchemaBucketAccessControl] = js.native
  def insert(callback: BodyResponseCallback[SchemaBucketAccessControl]): Unit = js.native
  def insert(params: Unit, options: MethodOptions): GaxiosPromise[SchemaBucketAccessControl] = js.native
  def insert(params: ParamsResourceBucketaccesscontrolsInsert): GaxiosPromise[SchemaBucketAccessControl] = js.native
  def insert(
    params: ParamsResourceBucketaccesscontrolsInsert,
    callback: BodyResponseCallback[SchemaBucketAccessControl]
  ): Unit = js.native
  def insert(
    params: ParamsResourceBucketaccesscontrolsInsert,
    options: BodyResponseCallback[Readable | SchemaBucketAccessControl],
    callback: BodyResponseCallback[Readable | SchemaBucketAccessControl]
  ): Unit = js.native
  def insert(params: ParamsResourceBucketaccesscontrolsInsert, options: MethodOptions): GaxiosPromise[SchemaBucketAccessControl] = js.native
  def insert(
    params: ParamsResourceBucketaccesscontrolsInsert,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaBucketAccessControl]
  ): Unit = js.native
  /**
    * storage.bucketAccessControls.insert
    * @desc Creates a new ACL entry on the specified bucket.
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
    *   const res = await storage.bucketAccessControls.insert({
    *     // Name of a bucket.
    *     bucket: 'placeholder-value',
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
    *       //   "id": "my_id",
    *       //   "kind": "my_kind",
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
    *   //   "id": "my_id",
    *   //   "kind": "my_kind",
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
    * @alias storage.bucketAccessControls.insert
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.bucket Name of a bucket.
    * @param {().BucketAccessControl} params.requestBody Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def insert(params: ParamsResourceBucketaccesscontrolsInsert, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def insert(
    params: ParamsResourceBucketaccesscontrolsInsert,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaBucketAccessControls] = js.native
  def list(callback: BodyResponseCallback[SchemaBucketAccessControls]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaBucketAccessControls] = js.native
  def list(params: ParamsResourceBucketaccesscontrolsList): GaxiosPromise[SchemaBucketAccessControls] = js.native
  def list(
    params: ParamsResourceBucketaccesscontrolsList,
    callback: BodyResponseCallback[SchemaBucketAccessControls]
  ): Unit = js.native
  def list(
    params: ParamsResourceBucketaccesscontrolsList,
    options: BodyResponseCallback[Readable | SchemaBucketAccessControls],
    callback: BodyResponseCallback[Readable | SchemaBucketAccessControls]
  ): Unit = js.native
  def list(params: ParamsResourceBucketaccesscontrolsList, options: MethodOptions): GaxiosPromise[SchemaBucketAccessControls] = js.native
  def list(
    params: ParamsResourceBucketaccesscontrolsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaBucketAccessControls]
  ): Unit = js.native
  /**
    * storage.bucketAccessControls.list
    * @desc Retrieves ACL entries on the specified bucket.
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
    *   const res = await storage.bucketAccessControls.list({
    *     // Name of a bucket.
    *     bucket: 'placeholder-value',
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
    * @alias storage.bucketAccessControls.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.bucket Name of a bucket.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(params: ParamsResourceBucketaccesscontrolsList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceBucketaccesscontrolsList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def patch(): GaxiosPromise[SchemaBucketAccessControl] = js.native
  def patch(callback: BodyResponseCallback[SchemaBucketAccessControl]): Unit = js.native
  def patch(params: Unit, options: MethodOptions): GaxiosPromise[SchemaBucketAccessControl] = js.native
  def patch(params: ParamsResourceBucketaccesscontrolsPatch): GaxiosPromise[SchemaBucketAccessControl] = js.native
  def patch(
    params: ParamsResourceBucketaccesscontrolsPatch,
    callback: BodyResponseCallback[SchemaBucketAccessControl]
  ): Unit = js.native
  def patch(
    params: ParamsResourceBucketaccesscontrolsPatch,
    options: BodyResponseCallback[Readable | SchemaBucketAccessControl],
    callback: BodyResponseCallback[Readable | SchemaBucketAccessControl]
  ): Unit = js.native
  def patch(params: ParamsResourceBucketaccesscontrolsPatch, options: MethodOptions): GaxiosPromise[SchemaBucketAccessControl] = js.native
  def patch(
    params: ParamsResourceBucketaccesscontrolsPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaBucketAccessControl]
  ): Unit = js.native
  /**
    * storage.bucketAccessControls.patch
    * @desc Updates an ACL entry on the specified bucket. This method supports patch semantics.
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
    *   const res = await storage.bucketAccessControls.patch({
    *     // Name of a bucket.
    *     bucket: 'placeholder-value',
    *     // The entity holding the permission. Can be user-userId, user-emailAddress, group-groupId, group-emailAddress, allUsers, or allAuthenticatedUsers.
    *     entity: 'placeholder-value',
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
    *       //   "id": "my_id",
    *       //   "kind": "my_kind",
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
    *   //   "id": "my_id",
    *   //   "kind": "my_kind",
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
    * @alias storage.bucketAccessControls.patch
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.bucket Name of a bucket.
    * @param {string} params.entity The entity holding the permission. Can be user-userId, user-emailAddress, group-groupId, group-emailAddress, allUsers, or allAuthenticatedUsers.
    * @param {().BucketAccessControl} params.requestBody Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def patch(params: ParamsResourceBucketaccesscontrolsPatch, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def patch(
    params: ParamsResourceBucketaccesscontrolsPatch,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def update(): GaxiosPromise[SchemaBucketAccessControl] = js.native
  def update(callback: BodyResponseCallback[SchemaBucketAccessControl]): Unit = js.native
  def update(params: Unit, options: MethodOptions): GaxiosPromise[SchemaBucketAccessControl] = js.native
  def update(params: ParamsResourceBucketaccesscontrolsUpdate): GaxiosPromise[SchemaBucketAccessControl] = js.native
  def update(
    params: ParamsResourceBucketaccesscontrolsUpdate,
    callback: BodyResponseCallback[SchemaBucketAccessControl]
  ): Unit = js.native
  def update(
    params: ParamsResourceBucketaccesscontrolsUpdate,
    options: BodyResponseCallback[Readable | SchemaBucketAccessControl],
    callback: BodyResponseCallback[Readable | SchemaBucketAccessControl]
  ): Unit = js.native
  def update(params: ParamsResourceBucketaccesscontrolsUpdate, options: MethodOptions): GaxiosPromise[SchemaBucketAccessControl] = js.native
  def update(
    params: ParamsResourceBucketaccesscontrolsUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaBucketAccessControl]
  ): Unit = js.native
  /**
    * storage.bucketAccessControls.update
    * @desc Updates an ACL entry on the specified bucket.
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
    *   const res = await storage.bucketAccessControls.update({
    *     // Name of a bucket.
    *     bucket: 'placeholder-value',
    *     // The entity holding the permission. Can be user-userId, user-emailAddress, group-groupId, group-emailAddress, allUsers, or allAuthenticatedUsers.
    *     entity: 'placeholder-value',
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
    *       //   "id": "my_id",
    *       //   "kind": "my_kind",
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
    *   //   "id": "my_id",
    *   //   "kind": "my_kind",
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
    * @alias storage.bucketAccessControls.update
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.bucket Name of a bucket.
    * @param {string} params.entity The entity holding the permission. Can be user-userId, user-emailAddress, group-groupId, group-emailAddress, allUsers, or allAuthenticatedUsers.
    * @param {().BucketAccessControl} params.requestBody Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def update(params: ParamsResourceBucketaccesscontrolsUpdate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def update(
    params: ParamsResourceBucketaccesscontrolsUpdate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
