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

@JSImport("googleapis/build/src/apis/storage/v1", "storage_v1.Resource$Buckets")
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
    * Permanently deletes an empty bucket.
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
    *   const res = await storage.buckets.delete({
    *     // Name of a bucket.
    *     bucket: 'placeholder-value',
    *     // If set, only deletes the bucket if its metageneration matches this value.
    *     ifMetagenerationMatch: 'placeholder-value',
    *     // If set, only deletes the bucket if its metageneration does not match this value.
    *     ifMetagenerationNotMatch: 'placeholder-value',
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
    * Returns metadata for the specified bucket.
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
    *     // The project to be billed for this request. Required for Requester Pays buckets.
    *     userProject: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "acl": [],
    *   //   "autoclass": {},
    *   //   "billing": {},
    *   //   "cors": [],
    *   //   "customPlacementConfig": {},
    *   //   "defaultEventBasedHold": false,
    *   //   "defaultObjectAcl": [],
    *   //   "encryption": {},
    *   //   "etag": "my_etag",
    *   //   "iamConfiguration": {},
    *   //   "id": "my_id",
    *   //   "kind": "my_kind",
    *   //   "labels": {},
    *   //   "lifecycle": {},
    *   //   "location": "my_location",
    *   //   "locationType": "my_locationType",
    *   //   "logging": {},
    *   //   "metageneration": "my_metageneration",
    *   //   "name": "my_name",
    *   //   "owner": {},
    *   //   "projectNumber": "my_projectNumber",
    *   //   "retentionPolicy": {},
    *   //   "rpo": "my_rpo",
    *   //   "satisfiesPZS": false,
    *   //   "selfLink": "my_selfLink",
    *   //   "storageClass": "my_storageClass",
    *   //   "timeCreated": "my_timeCreated",
    *   //   "updated": "my_updated",
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
    * ```
    *
    * @param params - Parameters for request
    * @param options - Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param callback - Optional callback that handles the response.
    * @returns A promise if used with async/await, or void if used with a callback.
    */
  def get(params: ParamsResourceBucketsGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceBucketsGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def getIamPolicy(): GaxiosPromise[SchemaPolicy] = js.native
  def getIamPolicy(callback: BodyResponseCallback[SchemaPolicy]): Unit = js.native
  def getIamPolicy(params: Unit, options: MethodOptions): GaxiosPromise[SchemaPolicy] = js.native
  def getIamPolicy(params: ParamsResourceBucketsGetiampolicy): GaxiosPromise[SchemaPolicy] = js.native
  def getIamPolicy(params: ParamsResourceBucketsGetiampolicy, callback: BodyResponseCallback[SchemaPolicy]): Unit = js.native
  def getIamPolicy(
    params: ParamsResourceBucketsGetiampolicy,
    options: BodyResponseCallback[Readable | SchemaPolicy],
    callback: BodyResponseCallback[Readable | SchemaPolicy]
  ): Unit = js.native
  def getIamPolicy(params: ParamsResourceBucketsGetiampolicy, options: MethodOptions): GaxiosPromise[SchemaPolicy] = js.native
  def getIamPolicy(
    params: ParamsResourceBucketsGetiampolicy,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaPolicy]
  ): Unit = js.native
  /**
    * Returns an IAM policy for the specified bucket.
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
    *   const res = await storage.buckets.getIamPolicy({
    *     // Name of a bucket.
    *     bucket: 'placeholder-value',
    *     // The IAM policy format version to be returned. If the optionsRequestedPolicyVersion is for an older version that doesn't support part of the requested IAM policy, the request fails.
    *     optionsRequestedPolicyVersion: 'placeholder-value',
    *     // The project to be billed for this request. Required for Requester Pays buckets.
    *     userProject: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "bindings": [],
    *   //   "etag": "my_etag",
    *   //   "kind": "my_kind",
    *   //   "resourceId": "my_resourceId",
    *   //   "version": 0
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
  def getIamPolicy(params: ParamsResourceBucketsGetiampolicy, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def getIamPolicy(
    params: ParamsResourceBucketsGetiampolicy,
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
    * Creates a new bucket.
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
    *   const res = await storage.buckets.insert({
    *     // Apply a predefined set of access controls to this bucket.
    *     predefinedAcl: 'placeholder-value',
    *     // Apply a predefined set of default object access controls to this bucket.
    *     predefinedDefaultObjectAcl: 'placeholder-value',
    *     // A valid API project identifier.
    *     project: 'placeholder-value',
    *     // Set of properties to return. Defaults to noAcl, unless the bucket resource specifies acl or defaultObjectAcl properties, when it defaults to full.
    *     projection: 'placeholder-value',
    *     // The project to be billed for this request.
    *     userProject: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "acl": [],
    *       //   "autoclass": {},
    *       //   "billing": {},
    *       //   "cors": [],
    *       //   "customPlacementConfig": {},
    *       //   "defaultEventBasedHold": false,
    *       //   "defaultObjectAcl": [],
    *       //   "encryption": {},
    *       //   "etag": "my_etag",
    *       //   "iamConfiguration": {},
    *       //   "id": "my_id",
    *       //   "kind": "my_kind",
    *       //   "labels": {},
    *       //   "lifecycle": {},
    *       //   "location": "my_location",
    *       //   "locationType": "my_locationType",
    *       //   "logging": {},
    *       //   "metageneration": "my_metageneration",
    *       //   "name": "my_name",
    *       //   "owner": {},
    *       //   "projectNumber": "my_projectNumber",
    *       //   "retentionPolicy": {},
    *       //   "rpo": "my_rpo",
    *       //   "satisfiesPZS": false,
    *       //   "selfLink": "my_selfLink",
    *       //   "storageClass": "my_storageClass",
    *       //   "timeCreated": "my_timeCreated",
    *       //   "updated": "my_updated",
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
    *   //   "autoclass": {},
    *   //   "billing": {},
    *   //   "cors": [],
    *   //   "customPlacementConfig": {},
    *   //   "defaultEventBasedHold": false,
    *   //   "defaultObjectAcl": [],
    *   //   "encryption": {},
    *   //   "etag": "my_etag",
    *   //   "iamConfiguration": {},
    *   //   "id": "my_id",
    *   //   "kind": "my_kind",
    *   //   "labels": {},
    *   //   "lifecycle": {},
    *   //   "location": "my_location",
    *   //   "locationType": "my_locationType",
    *   //   "logging": {},
    *   //   "metageneration": "my_metageneration",
    *   //   "name": "my_name",
    *   //   "owner": {},
    *   //   "projectNumber": "my_projectNumber",
    *   //   "retentionPolicy": {},
    *   //   "rpo": "my_rpo",
    *   //   "satisfiesPZS": false,
    *   //   "selfLink": "my_selfLink",
    *   //   "storageClass": "my_storageClass",
    *   //   "timeCreated": "my_timeCreated",
    *   //   "updated": "my_updated",
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
    * ```
    *
    * @param params - Parameters for request
    * @param options - Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param callback - Optional callback that handles the response.
    * @returns A promise if used with async/await, or void if used with a callback.
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
    * Retrieves a list of buckets for a given project.
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
    *     // Maximum number of buckets to return in a single response. The service will use this parameter or 1,000 items, whichever is smaller.
    *     maxResults: 'placeholder-value',
    *     // A previously-returned page token representing part of the larger set of results to view.
    *     pageToken: 'placeholder-value',
    *     // Filter results to buckets whose names begin with this prefix.
    *     prefix: 'placeholder-value',
    *     // A valid API project identifier.
    *     project: 'placeholder-value',
    *     // Set of properties to return. Defaults to noAcl.
    *     projection: 'placeholder-value',
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
  def list(params: ParamsResourceBucketsList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceBucketsList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def lockRetentionPolicy(): GaxiosPromise[SchemaBucket] = js.native
  def lockRetentionPolicy(callback: BodyResponseCallback[SchemaBucket]): Unit = js.native
  def lockRetentionPolicy(params: Unit, options: MethodOptions): GaxiosPromise[SchemaBucket] = js.native
  def lockRetentionPolicy(params: ParamsResourceBucketsLockretentionpolicy): GaxiosPromise[SchemaBucket] = js.native
  def lockRetentionPolicy(params: ParamsResourceBucketsLockretentionpolicy, callback: BodyResponseCallback[SchemaBucket]): Unit = js.native
  def lockRetentionPolicy(
    params: ParamsResourceBucketsLockretentionpolicy,
    options: BodyResponseCallback[Readable | SchemaBucket],
    callback: BodyResponseCallback[Readable | SchemaBucket]
  ): Unit = js.native
  def lockRetentionPolicy(params: ParamsResourceBucketsLockretentionpolicy, options: MethodOptions): GaxiosPromise[SchemaBucket] = js.native
  def lockRetentionPolicy(
    params: ParamsResourceBucketsLockretentionpolicy,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaBucket]
  ): Unit = js.native
  /**
    * Locks retention policy on a bucket.
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
    *   const res = await storage.buckets.lockRetentionPolicy({
    *     // Name of a bucket.
    *     bucket: 'placeholder-value',
    *     // Makes the operation conditional on whether bucket's current metageneration matches the given value.
    *     ifMetagenerationMatch: 'placeholder-value',
    *     // The project to be billed for this request. Required for Requester Pays buckets.
    *     userProject: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "acl": [],
    *   //   "autoclass": {},
    *   //   "billing": {},
    *   //   "cors": [],
    *   //   "customPlacementConfig": {},
    *   //   "defaultEventBasedHold": false,
    *   //   "defaultObjectAcl": [],
    *   //   "encryption": {},
    *   //   "etag": "my_etag",
    *   //   "iamConfiguration": {},
    *   //   "id": "my_id",
    *   //   "kind": "my_kind",
    *   //   "labels": {},
    *   //   "lifecycle": {},
    *   //   "location": "my_location",
    *   //   "locationType": "my_locationType",
    *   //   "logging": {},
    *   //   "metageneration": "my_metageneration",
    *   //   "name": "my_name",
    *   //   "owner": {},
    *   //   "projectNumber": "my_projectNumber",
    *   //   "retentionPolicy": {},
    *   //   "rpo": "my_rpo",
    *   //   "satisfiesPZS": false,
    *   //   "selfLink": "my_selfLink",
    *   //   "storageClass": "my_storageClass",
    *   //   "timeCreated": "my_timeCreated",
    *   //   "updated": "my_updated",
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
    * ```
    *
    * @param params - Parameters for request
    * @param options - Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param callback - Optional callback that handles the response.
    * @returns A promise if used with async/await, or void if used with a callback.
    */
  def lockRetentionPolicy(params: ParamsResourceBucketsLockretentionpolicy, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def lockRetentionPolicy(
    params: ParamsResourceBucketsLockretentionpolicy,
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
    * Patches a bucket. Changes to the bucket will be readable immediately after writing, but configuration changes may take time to propagate.
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
    *   const res = await storage.buckets.patch({
    *     // Name of a bucket.
    *     bucket: 'placeholder-value',
    *     // Makes the return of the bucket metadata conditional on whether the bucket's current metageneration matches the given value.
    *     ifMetagenerationMatch: 'placeholder-value',
    *     // Makes the return of the bucket metadata conditional on whether the bucket's current metageneration does not match the given value.
    *     ifMetagenerationNotMatch: 'placeholder-value',
    *     // Apply a predefined set of access controls to this bucket.
    *     predefinedAcl: 'placeholder-value',
    *     // Apply a predefined set of default object access controls to this bucket.
    *     predefinedDefaultObjectAcl: 'placeholder-value',
    *     // Set of properties to return. Defaults to full.
    *     projection: 'placeholder-value',
    *     // The project to be billed for this request. Required for Requester Pays buckets.
    *     userProject: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "acl": [],
    *       //   "autoclass": {},
    *       //   "billing": {},
    *       //   "cors": [],
    *       //   "customPlacementConfig": {},
    *       //   "defaultEventBasedHold": false,
    *       //   "defaultObjectAcl": [],
    *       //   "encryption": {},
    *       //   "etag": "my_etag",
    *       //   "iamConfiguration": {},
    *       //   "id": "my_id",
    *       //   "kind": "my_kind",
    *       //   "labels": {},
    *       //   "lifecycle": {},
    *       //   "location": "my_location",
    *       //   "locationType": "my_locationType",
    *       //   "logging": {},
    *       //   "metageneration": "my_metageneration",
    *       //   "name": "my_name",
    *       //   "owner": {},
    *       //   "projectNumber": "my_projectNumber",
    *       //   "retentionPolicy": {},
    *       //   "rpo": "my_rpo",
    *       //   "satisfiesPZS": false,
    *       //   "selfLink": "my_selfLink",
    *       //   "storageClass": "my_storageClass",
    *       //   "timeCreated": "my_timeCreated",
    *       //   "updated": "my_updated",
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
    *   //   "autoclass": {},
    *   //   "billing": {},
    *   //   "cors": [],
    *   //   "customPlacementConfig": {},
    *   //   "defaultEventBasedHold": false,
    *   //   "defaultObjectAcl": [],
    *   //   "encryption": {},
    *   //   "etag": "my_etag",
    *   //   "iamConfiguration": {},
    *   //   "id": "my_id",
    *   //   "kind": "my_kind",
    *   //   "labels": {},
    *   //   "lifecycle": {},
    *   //   "location": "my_location",
    *   //   "locationType": "my_locationType",
    *   //   "logging": {},
    *   //   "metageneration": "my_metageneration",
    *   //   "name": "my_name",
    *   //   "owner": {},
    *   //   "projectNumber": "my_projectNumber",
    *   //   "retentionPolicy": {},
    *   //   "rpo": "my_rpo",
    *   //   "satisfiesPZS": false,
    *   //   "selfLink": "my_selfLink",
    *   //   "storageClass": "my_storageClass",
    *   //   "timeCreated": "my_timeCreated",
    *   //   "updated": "my_updated",
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
    * ```
    *
    * @param params - Parameters for request
    * @param options - Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param callback - Optional callback that handles the response.
    * @returns A promise if used with async/await, or void if used with a callback.
    */
  def patch(params: ParamsResourceBucketsPatch, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def patch(
    params: ParamsResourceBucketsPatch,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def setIamPolicy(): GaxiosPromise[SchemaPolicy] = js.native
  def setIamPolicy(callback: BodyResponseCallback[SchemaPolicy]): Unit = js.native
  def setIamPolicy(params: Unit, options: MethodOptions): GaxiosPromise[SchemaPolicy] = js.native
  def setIamPolicy(params: ParamsResourceBucketsSetiampolicy): GaxiosPromise[SchemaPolicy] = js.native
  def setIamPolicy(params: ParamsResourceBucketsSetiampolicy, callback: BodyResponseCallback[SchemaPolicy]): Unit = js.native
  def setIamPolicy(
    params: ParamsResourceBucketsSetiampolicy,
    options: BodyResponseCallback[Readable | SchemaPolicy],
    callback: BodyResponseCallback[Readable | SchemaPolicy]
  ): Unit = js.native
  def setIamPolicy(params: ParamsResourceBucketsSetiampolicy, options: MethodOptions): GaxiosPromise[SchemaPolicy] = js.native
  def setIamPolicy(
    params: ParamsResourceBucketsSetiampolicy,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaPolicy]
  ): Unit = js.native
  /**
    * Updates an IAM policy for the specified bucket.
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
    *   const res = await storage.buckets.setIamPolicy({
    *     // Name of a bucket.
    *     bucket: 'placeholder-value',
    *     // The project to be billed for this request. Required for Requester Pays buckets.
    *     userProject: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "bindings": [],
    *       //   "etag": "my_etag",
    *       //   "kind": "my_kind",
    *       //   "resourceId": "my_resourceId",
    *       //   "version": 0
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "bindings": [],
    *   //   "etag": "my_etag",
    *   //   "kind": "my_kind",
    *   //   "resourceId": "my_resourceId",
    *   //   "version": 0
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
  def setIamPolicy(params: ParamsResourceBucketsSetiampolicy, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def setIamPolicy(
    params: ParamsResourceBucketsSetiampolicy,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def testIamPermissions(): GaxiosPromise[SchemaTestIamPermissionsResponse] = js.native
  def testIamPermissions(callback: BodyResponseCallback[SchemaTestIamPermissionsResponse]): Unit = js.native
  def testIamPermissions(params: Unit, options: MethodOptions): GaxiosPromise[SchemaTestIamPermissionsResponse] = js.native
  def testIamPermissions(params: ParamsResourceBucketsTestiampermissions): GaxiosPromise[SchemaTestIamPermissionsResponse] = js.native
  def testIamPermissions(
    params: ParamsResourceBucketsTestiampermissions,
    callback: BodyResponseCallback[SchemaTestIamPermissionsResponse]
  ): Unit = js.native
  def testIamPermissions(
    params: ParamsResourceBucketsTestiampermissions,
    options: BodyResponseCallback[Readable | SchemaTestIamPermissionsResponse],
    callback: BodyResponseCallback[Readable | SchemaTestIamPermissionsResponse]
  ): Unit = js.native
  def testIamPermissions(params: ParamsResourceBucketsTestiampermissions, options: MethodOptions): GaxiosPromise[SchemaTestIamPermissionsResponse] = js.native
  def testIamPermissions(
    params: ParamsResourceBucketsTestiampermissions,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaTestIamPermissionsResponse]
  ): Unit = js.native
  /**
    * Tests a set of permissions on the given bucket to see which, if any, are held by the caller.
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
    *       'https://www.googleapis.com/auth/devstorage.read_write',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await storage.buckets.testIamPermissions({
    *     // Name of a bucket.
    *     bucket: 'placeholder-value',
    *     // Permissions to test.
    *     permissions: 'placeholder-value',
    *     // The project to be billed for this request. Required for Requester Pays buckets.
    *     userProject: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "kind": "my_kind",
    *   //   "permissions": []
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
  def testIamPermissions(params: ParamsResourceBucketsTestiampermissions, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def testIamPermissions(
    params: ParamsResourceBucketsTestiampermissions,
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
    * Updates a bucket. Changes to the bucket will be readable immediately after writing, but configuration changes may take time to propagate.
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
    *   const res = await storage.buckets.update({
    *     // Name of a bucket.
    *     bucket: 'placeholder-value',
    *     // Makes the return of the bucket metadata conditional on whether the bucket's current metageneration matches the given value.
    *     ifMetagenerationMatch: 'placeholder-value',
    *     // Makes the return of the bucket metadata conditional on whether the bucket's current metageneration does not match the given value.
    *     ifMetagenerationNotMatch: 'placeholder-value',
    *     // Apply a predefined set of access controls to this bucket.
    *     predefinedAcl: 'placeholder-value',
    *     // Apply a predefined set of default object access controls to this bucket.
    *     predefinedDefaultObjectAcl: 'placeholder-value',
    *     // Set of properties to return. Defaults to full.
    *     projection: 'placeholder-value',
    *     // The project to be billed for this request. Required for Requester Pays buckets.
    *     userProject: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "acl": [],
    *       //   "autoclass": {},
    *       //   "billing": {},
    *       //   "cors": [],
    *       //   "customPlacementConfig": {},
    *       //   "defaultEventBasedHold": false,
    *       //   "defaultObjectAcl": [],
    *       //   "encryption": {},
    *       //   "etag": "my_etag",
    *       //   "iamConfiguration": {},
    *       //   "id": "my_id",
    *       //   "kind": "my_kind",
    *       //   "labels": {},
    *       //   "lifecycle": {},
    *       //   "location": "my_location",
    *       //   "locationType": "my_locationType",
    *       //   "logging": {},
    *       //   "metageneration": "my_metageneration",
    *       //   "name": "my_name",
    *       //   "owner": {},
    *       //   "projectNumber": "my_projectNumber",
    *       //   "retentionPolicy": {},
    *       //   "rpo": "my_rpo",
    *       //   "satisfiesPZS": false,
    *       //   "selfLink": "my_selfLink",
    *       //   "storageClass": "my_storageClass",
    *       //   "timeCreated": "my_timeCreated",
    *       //   "updated": "my_updated",
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
    *   //   "autoclass": {},
    *   //   "billing": {},
    *   //   "cors": [],
    *   //   "customPlacementConfig": {},
    *   //   "defaultEventBasedHold": false,
    *   //   "defaultObjectAcl": [],
    *   //   "encryption": {},
    *   //   "etag": "my_etag",
    *   //   "iamConfiguration": {},
    *   //   "id": "my_id",
    *   //   "kind": "my_kind",
    *   //   "labels": {},
    *   //   "lifecycle": {},
    *   //   "location": "my_location",
    *   //   "locationType": "my_locationType",
    *   //   "logging": {},
    *   //   "metageneration": "my_metageneration",
    *   //   "name": "my_name",
    *   //   "owner": {},
    *   //   "projectNumber": "my_projectNumber",
    *   //   "retentionPolicy": {},
    *   //   "rpo": "my_rpo",
    *   //   "satisfiesPZS": false,
    *   //   "selfLink": "my_selfLink",
    *   //   "storageClass": "my_storageClass",
    *   //   "timeCreated": "my_timeCreated",
    *   //   "updated": "my_updated",
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
    * ```
    *
    * @param params - Parameters for request
    * @param options - Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param callback - Optional callback that handles the response.
    * @returns A promise if used with async/await, or void if used with a callback.
    */
  def update(params: ParamsResourceBucketsUpdate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def update(
    params: ParamsResourceBucketsUpdate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
