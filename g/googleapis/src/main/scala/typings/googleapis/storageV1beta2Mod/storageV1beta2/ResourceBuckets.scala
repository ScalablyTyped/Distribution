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

@JSImport("googleapis/build/src/apis/storage/v1beta2", "storage_v1beta2.Resource$Buckets")
@js.native
open class ResourceBuckets protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def delete(): GaxiosPromise[Unit] = js.native
  def delete(callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceBucketsDelete): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceBucketsDelete, callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(
    params: ParamsResourceBucketsDelete,
    options: BodyResponseCallback[Readable | Unit],
    callback: BodyResponseCallback[Readable | Unit]
  ): Unit = js.native
  def delete(params: ParamsResourceBucketsDelete, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceBucketsDelete, options: MethodOptions, callback: BodyResponseCallback[Unit]): Unit = js.native
  /**
    * storage.buckets.delete
    * @desc Permanently deletes an empty bucket.
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
    *     scopes: [
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
    *   const res = await storage.buckets.delete({
    *     // Name of a bucket.
    *     bucket: 'placeholder-value',
    *     // Makes the return of the bucket metadata conditional on whether the bucket's current metageneration matches the given value.
    *     ifMetagenerationMatch: 'placeholder-value',
    *     // Makes the return of the bucket metadata conditional on whether the bucket's current metageneration does not match the given value.
    *     ifMetagenerationNotMatch: 'placeholder-value',
    *   });
    *   console.log(res.data);
    * }
    *
    * main().catch(e => {
    *   console.error(e);
    *   throw e;
    * });
    *
    * @alias storage.buckets.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.bucket Name of a bucket.
    * @param {string=} params.ifMetagenerationMatch Makes the return of the bucket metadata conditional on whether the bucket's current metageneration matches the given value.
    * @param {string=} params.ifMetagenerationNotMatch Makes the return of the bucket metadata conditional on whether the bucket's current metageneration does not match the given value.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(params: ParamsResourceBucketsDelete, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def delete(
    params: ParamsResourceBucketsDelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def get(): GaxiosPromise[SchemaBucket] = js.native
  def get(callback: BodyResponseCallback[SchemaBucket]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaBucket] = js.native
  def get(params: ParamsResourceBucketsGet): GaxiosPromise[SchemaBucket] = js.native
  def get(params: ParamsResourceBucketsGet, callback: BodyResponseCallback[SchemaBucket]): Unit = js.native
  def get(
    params: ParamsResourceBucketsGet,
    options: BodyResponseCallback[Readable | SchemaBucket],
    callback: BodyResponseCallback[Readable | SchemaBucket]
  ): Unit = js.native
  def get(params: ParamsResourceBucketsGet, options: MethodOptions): GaxiosPromise[SchemaBucket] = js.native
  def get(
    params: ParamsResourceBucketsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaBucket]
  ): Unit = js.native
  /**
    * storage.buckets.get
    * @desc Returns metadata for the specified bucket.
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
    *     scopes: [
    *       'https://www.googleapis.com/auth/devstorage.full_control',
    *       'https://www.googleapis.com/auth/devstorage.read_only',
    *       'https://www.googleapis.com/auth/devstorage.read_write',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await storage.buckets.get({
    *     // Name of a bucket.
    *     bucket: 'placeholder-value',
    *     // Makes the return of the bucket metadata conditional on whether the bucket's current metageneration matches the given value.
    *     ifMetagenerationMatch: 'placeholder-value',
    *     // Makes the return of the bucket metadata conditional on whether the bucket's current metageneration does not match the given value.
    *     ifMetagenerationNotMatch: 'placeholder-value',
    *     // Set of properties to return. Defaults to noAcl.
    *     projection: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "acl": [],
    *   //   "cors": [],
    *   //   "defaultObjectAcl": [],
    *   //   "etag": "my_etag",
    *   //   "id": "my_id",
    *   //   "kind": "my_kind",
    *   //   "lifecycle": {},
    *   //   "location": "my_location",
    *   //   "logging": {},
    *   //   "metageneration": "my_metageneration",
    *   //   "name": "my_name",
    *   //   "owner": {},
    *   //   "selfLink": "my_selfLink",
    *   //   "storageClass": "my_storageClass",
    *   //   "timeCreated": "my_timeCreated",
    *   //   "versioning": {},
    *   //   "website": {}
    *   // }
    * }
    *
    * main().catch(e => {
    *   console.error(e);
    *   throw e;
    * });
    *
    * @alias storage.buckets.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.bucket Name of a bucket.
    * @param {string=} params.ifMetagenerationMatch Makes the return of the bucket metadata conditional on whether the bucket's current metageneration matches the given value.
    * @param {string=} params.ifMetagenerationNotMatch Makes the return of the bucket metadata conditional on whether the bucket's current metageneration does not match the given value.
    * @param {string=} params.projection Set of properties to return. Defaults to noAcl.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(params: ParamsResourceBucketsGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceBucketsGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def insert(): GaxiosPromise[SchemaBucket] = js.native
  def insert(callback: BodyResponseCallback[SchemaBucket]): Unit = js.native
  def insert(params: Unit, options: MethodOptions): GaxiosPromise[SchemaBucket] = js.native
  def insert(params: ParamsResourceBucketsInsert): GaxiosPromise[SchemaBucket] = js.native
  def insert(params: ParamsResourceBucketsInsert, callback: BodyResponseCallback[SchemaBucket]): Unit = js.native
  def insert(
    params: ParamsResourceBucketsInsert,
    options: BodyResponseCallback[Readable | SchemaBucket],
    callback: BodyResponseCallback[Readable | SchemaBucket]
  ): Unit = js.native
  def insert(params: ParamsResourceBucketsInsert, options: MethodOptions): GaxiosPromise[SchemaBucket] = js.native
  def insert(
    params: ParamsResourceBucketsInsert,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaBucket]
  ): Unit = js.native
  /**
    * storage.buckets.insert
    * @desc Creates a new bucket.
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
    *     scopes: [
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
    *   const res = await storage.buckets.insert({
    *     // A valid API project identifier.
    *     project: 'placeholder-value',
    *     // Set of properties to return. Defaults to noAcl, unless the bucket resource specifies acl or defaultObjectAcl properties, when it defaults to full.
    *     projection: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "acl": [],
    *       //   "cors": [],
    *       //   "defaultObjectAcl": [],
    *       //   "etag": "my_etag",
    *       //   "id": "my_id",
    *       //   "kind": "my_kind",
    *       //   "lifecycle": {},
    *       //   "location": "my_location",
    *       //   "logging": {},
    *       //   "metageneration": "my_metageneration",
    *       //   "name": "my_name",
    *       //   "owner": {},
    *       //   "selfLink": "my_selfLink",
    *       //   "storageClass": "my_storageClass",
    *       //   "timeCreated": "my_timeCreated",
    *       //   "versioning": {},
    *       //   "website": {}
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "acl": [],
    *   //   "cors": [],
    *   //   "defaultObjectAcl": [],
    *   //   "etag": "my_etag",
    *   //   "id": "my_id",
    *   //   "kind": "my_kind",
    *   //   "lifecycle": {},
    *   //   "location": "my_location",
    *   //   "logging": {},
    *   //   "metageneration": "my_metageneration",
    *   //   "name": "my_name",
    *   //   "owner": {},
    *   //   "selfLink": "my_selfLink",
    *   //   "storageClass": "my_storageClass",
    *   //   "timeCreated": "my_timeCreated",
    *   //   "versioning": {},
    *   //   "website": {}
    *   // }
    * }
    *
    * main().catch(e => {
    *   console.error(e);
    *   throw e;
    * });
    *
    * @alias storage.buckets.insert
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.project A valid API project identifier.
    * @param {string=} params.projection Set of properties to return. Defaults to noAcl, unless the bucket resource specifies acl or defaultObjectAcl properties, when it defaults to full.
    * @param {().Bucket} params.requestBody Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def insert(params: ParamsResourceBucketsInsert, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def insert(
    params: ParamsResourceBucketsInsert,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaBuckets] = js.native
  def list(callback: BodyResponseCallback[SchemaBuckets]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaBuckets] = js.native
  def list(params: ParamsResourceBucketsList): GaxiosPromise[SchemaBuckets] = js.native
  def list(params: ParamsResourceBucketsList, callback: BodyResponseCallback[SchemaBuckets]): Unit = js.native
  def list(
    params: ParamsResourceBucketsList,
    options: BodyResponseCallback[Readable | SchemaBuckets],
    callback: BodyResponseCallback[Readable | SchemaBuckets]
  ): Unit = js.native
  def list(params: ParamsResourceBucketsList, options: MethodOptions): GaxiosPromise[SchemaBuckets] = js.native
  def list(
    params: ParamsResourceBucketsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaBuckets]
  ): Unit = js.native
  /**
    * storage.buckets.list
    * @desc Retrieves a list of buckets for a given project.
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
    *     scopes: [
    *       'https://www.googleapis.com/auth/devstorage.full_control',
    *       'https://www.googleapis.com/auth/devstorage.read_only',
    *       'https://www.googleapis.com/auth/devstorage.read_write',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await storage.buckets.list({
    *     // Maximum number of buckets to return.
    *     maxResults: 'placeholder-value',
    *     // A previously-returned page token representing part of the larger set of results to view.
    *     pageToken: 'placeholder-value',
    *     // A valid API project identifier.
    *     project: 'placeholder-value',
    *     // Set of properties to return. Defaults to noAcl.
    *     projection: 'placeholder-value',
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
    * @alias storage.buckets.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {integer=} params.maxResults Maximum number of buckets to return.
    * @param {string=} params.pageToken A previously-returned page token representing part of the larger set of results to view.
    * @param {string} params.project A valid API project identifier.
    * @param {string=} params.projection Set of properties to return. Defaults to noAcl.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(params: ParamsResourceBucketsList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceBucketsList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def patch(): GaxiosPromise[SchemaBucket] = js.native
  def patch(callback: BodyResponseCallback[SchemaBucket]): Unit = js.native
  def patch(params: Unit, options: MethodOptions): GaxiosPromise[SchemaBucket] = js.native
  def patch(params: ParamsResourceBucketsPatch): GaxiosPromise[SchemaBucket] = js.native
  def patch(params: ParamsResourceBucketsPatch, callback: BodyResponseCallback[SchemaBucket]): Unit = js.native
  def patch(
    params: ParamsResourceBucketsPatch,
    options: BodyResponseCallback[Readable | SchemaBucket],
    callback: BodyResponseCallback[Readable | SchemaBucket]
  ): Unit = js.native
  def patch(params: ParamsResourceBucketsPatch, options: MethodOptions): GaxiosPromise[SchemaBucket] = js.native
  def patch(
    params: ParamsResourceBucketsPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaBucket]
  ): Unit = js.native
  /**
    * storage.buckets.patch
    * @desc Updates a bucket. This method supports patch semantics.
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
    *     scopes: [
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
    *   const res = await storage.buckets.patch({
    *     // Name of a bucket.
    *     bucket: 'placeholder-value',
    *     // Makes the return of the bucket metadata conditional on whether the bucket's current metageneration matches the given value.
    *     ifMetagenerationMatch: 'placeholder-value',
    *     // Makes the return of the bucket metadata conditional on whether the bucket's current metageneration does not match the given value.
    *     ifMetagenerationNotMatch: 'placeholder-value',
    *     // Set of properties to return. Defaults to full.
    *     projection: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "acl": [],
    *       //   "cors": [],
    *       //   "defaultObjectAcl": [],
    *       //   "etag": "my_etag",
    *       //   "id": "my_id",
    *       //   "kind": "my_kind",
    *       //   "lifecycle": {},
    *       //   "location": "my_location",
    *       //   "logging": {},
    *       //   "metageneration": "my_metageneration",
    *       //   "name": "my_name",
    *       //   "owner": {},
    *       //   "selfLink": "my_selfLink",
    *       //   "storageClass": "my_storageClass",
    *       //   "timeCreated": "my_timeCreated",
    *       //   "versioning": {},
    *       //   "website": {}
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "acl": [],
    *   //   "cors": [],
    *   //   "defaultObjectAcl": [],
    *   //   "etag": "my_etag",
    *   //   "id": "my_id",
    *   //   "kind": "my_kind",
    *   //   "lifecycle": {},
    *   //   "location": "my_location",
    *   //   "logging": {},
    *   //   "metageneration": "my_metageneration",
    *   //   "name": "my_name",
    *   //   "owner": {},
    *   //   "selfLink": "my_selfLink",
    *   //   "storageClass": "my_storageClass",
    *   //   "timeCreated": "my_timeCreated",
    *   //   "versioning": {},
    *   //   "website": {}
    *   // }
    * }
    *
    * main().catch(e => {
    *   console.error(e);
    *   throw e;
    * });
    *
    * @alias storage.buckets.patch
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.bucket Name of a bucket.
    * @param {string=} params.ifMetagenerationMatch Makes the return of the bucket metadata conditional on whether the bucket's current metageneration matches the given value.
    * @param {string=} params.ifMetagenerationNotMatch Makes the return of the bucket metadata conditional on whether the bucket's current metageneration does not match the given value.
    * @param {string=} params.projection Set of properties to return. Defaults to full.
    * @param {().Bucket} params.requestBody Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def patch(params: ParamsResourceBucketsPatch, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def patch(
    params: ParamsResourceBucketsPatch,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def update(): GaxiosPromise[SchemaBucket] = js.native
  def update(callback: BodyResponseCallback[SchemaBucket]): Unit = js.native
  def update(params: Unit, options: MethodOptions): GaxiosPromise[SchemaBucket] = js.native
  def update(params: ParamsResourceBucketsUpdate): GaxiosPromise[SchemaBucket] = js.native
  def update(params: ParamsResourceBucketsUpdate, callback: BodyResponseCallback[SchemaBucket]): Unit = js.native
  def update(
    params: ParamsResourceBucketsUpdate,
    options: BodyResponseCallback[Readable | SchemaBucket],
    callback: BodyResponseCallback[Readable | SchemaBucket]
  ): Unit = js.native
  def update(params: ParamsResourceBucketsUpdate, options: MethodOptions): GaxiosPromise[SchemaBucket] = js.native
  def update(
    params: ParamsResourceBucketsUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaBucket]
  ): Unit = js.native
  /**
    * storage.buckets.update
    * @desc Updates a bucket.
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
    *     scopes: [
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
    *   const res = await storage.buckets.update({
    *     // Name of a bucket.
    *     bucket: 'placeholder-value',
    *     // Makes the return of the bucket metadata conditional on whether the bucket's current metageneration matches the given value.
    *     ifMetagenerationMatch: 'placeholder-value',
    *     // Makes the return of the bucket metadata conditional on whether the bucket's current metageneration does not match the given value.
    *     ifMetagenerationNotMatch: 'placeholder-value',
    *     // Set of properties to return. Defaults to full.
    *     projection: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "acl": [],
    *       //   "cors": [],
    *       //   "defaultObjectAcl": [],
    *       //   "etag": "my_etag",
    *       //   "id": "my_id",
    *       //   "kind": "my_kind",
    *       //   "lifecycle": {},
    *       //   "location": "my_location",
    *       //   "logging": {},
    *       //   "metageneration": "my_metageneration",
    *       //   "name": "my_name",
    *       //   "owner": {},
    *       //   "selfLink": "my_selfLink",
    *       //   "storageClass": "my_storageClass",
    *       //   "timeCreated": "my_timeCreated",
    *       //   "versioning": {},
    *       //   "website": {}
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "acl": [],
    *   //   "cors": [],
    *   //   "defaultObjectAcl": [],
    *   //   "etag": "my_etag",
    *   //   "id": "my_id",
    *   //   "kind": "my_kind",
    *   //   "lifecycle": {},
    *   //   "location": "my_location",
    *   //   "logging": {},
    *   //   "metageneration": "my_metageneration",
    *   //   "name": "my_name",
    *   //   "owner": {},
    *   //   "selfLink": "my_selfLink",
    *   //   "storageClass": "my_storageClass",
    *   //   "timeCreated": "my_timeCreated",
    *   //   "versioning": {},
    *   //   "website": {}
    *   // }
    * }
    *
    * main().catch(e => {
    *   console.error(e);
    *   throw e;
    * });
    *
    * @alias storage.buckets.update
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.bucket Name of a bucket.
    * @param {string=} params.ifMetagenerationMatch Makes the return of the bucket metadata conditional on whether the bucket's current metageneration matches the given value.
    * @param {string=} params.ifMetagenerationNotMatch Makes the return of the bucket metadata conditional on whether the bucket's current metageneration does not match the given value.
    * @param {string=} params.projection Set of properties to return. Defaults to full.
    * @param {().Bucket} params.requestBody Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def update(params: ParamsResourceBucketsUpdate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def update(
    params: ParamsResourceBucketsUpdate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
