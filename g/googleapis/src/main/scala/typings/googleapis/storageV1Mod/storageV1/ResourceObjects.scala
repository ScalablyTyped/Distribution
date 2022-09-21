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

@JSImport("googleapis/build/src/apis/storage/v1", "storage_v1.Resource$Objects")
@js.native
open class ResourceObjects protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  def compose(): GaxiosPromise[SchemaObject] = js.native
  def compose(callback: BodyResponseCallback[SchemaObject]): Unit = js.native
  def compose(params: Unit, options: MethodOptions): GaxiosPromise[SchemaObject] = js.native
  def compose(params: ParamsResourceObjectsCompose): GaxiosPromise[SchemaObject] = js.native
  def compose(params: ParamsResourceObjectsCompose, callback: BodyResponseCallback[SchemaObject]): Unit = js.native
  def compose(
    params: ParamsResourceObjectsCompose,
    options: BodyResponseCallback[Readable | SchemaObject],
    callback: BodyResponseCallback[Readable | SchemaObject]
  ): Unit = js.native
  def compose(params: ParamsResourceObjectsCompose, options: MethodOptions): GaxiosPromise[SchemaObject] = js.native
  def compose(
    params: ParamsResourceObjectsCompose,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaObject]
  ): Unit = js.native
  /**
    * Concatenates a list of existing objects into a new object in the same bucket.
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
    *   const res = await storage.objects.compose({
    *     // Name of the bucket containing the source objects. The destination object is stored in this bucket.
    *     destinationBucket: 'placeholder-value',
    *     // Name of the new object. For information about how to URL encode object names to be path safe, see Encoding URI Path Parts.
    *     destinationObject: 'placeholder-value',
    *     // Apply a predefined set of access controls to the destination object.
    *     destinationPredefinedAcl: 'placeholder-value',
    *     // Makes the operation conditional on whether the object's current generation matches the given value. Setting to 0 makes the operation succeed only if there are no live versions of the object.
    *     ifGenerationMatch: 'placeholder-value',
    *     // Makes the operation conditional on whether the object's current metageneration matches the given value.
    *     ifMetagenerationMatch: 'placeholder-value',
    *     // Resource name of the Cloud KMS key, of the form projects/my-project/locations/global/keyRings/my-kr/cryptoKeys/my-key, that will be used to encrypt the object. Overrides the object metadata's kms_key_name value, if any.
    *     kmsKeyName: 'placeholder-value',
    *     // The project to be billed for this request. Required for Requester Pays buckets.
    *     userProject: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "destination": {},
    *       //   "kind": "my_kind",
    *       //   "sourceObjects": []
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "acl": [],
    *   //   "bucket": "my_bucket",
    *   //   "cacheControl": "my_cacheControl",
    *   //   "componentCount": 0,
    *   //   "contentDisposition": "my_contentDisposition",
    *   //   "contentEncoding": "my_contentEncoding",
    *   //   "contentLanguage": "my_contentLanguage",
    *   //   "contentType": "my_contentType",
    *   //   "crc32c": "my_crc32c",
    *   //   "customTime": "my_customTime",
    *   //   "customerEncryption": {},
    *   //   "etag": "my_etag",
    *   //   "eventBasedHold": false,
    *   //   "generation": "my_generation",
    *   //   "id": "my_id",
    *   //   "kind": "my_kind",
    *   //   "kmsKeyName": "my_kmsKeyName",
    *   //   "md5Hash": "my_md5Hash",
    *   //   "mediaLink": "my_mediaLink",
    *   //   "metadata": {},
    *   //   "metageneration": "my_metageneration",
    *   //   "name": "my_name",
    *   //   "owner": {},
    *   //   "retentionExpirationTime": "my_retentionExpirationTime",
    *   //   "selfLink": "my_selfLink",
    *   //   "size": "my_size",
    *   //   "storageClass": "my_storageClass",
    *   //   "temporaryHold": false,
    *   //   "timeCreated": "my_timeCreated",
    *   //   "timeDeleted": "my_timeDeleted",
    *   //   "timeStorageClassUpdated": "my_timeStorageClassUpdated",
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
  def compose(params: ParamsResourceObjectsCompose, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def compose(
    params: ParamsResourceObjectsCompose,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  var context: APIRequestContext = js.native
  
  def copy(): GaxiosPromise[SchemaObject] = js.native
  def copy(callback: BodyResponseCallback[SchemaObject]): Unit = js.native
  def copy(params: Unit, options: MethodOptions): GaxiosPromise[SchemaObject] = js.native
  def copy(params: ParamsResourceObjectsCopy): GaxiosPromise[SchemaObject] = js.native
  def copy(params: ParamsResourceObjectsCopy, callback: BodyResponseCallback[SchemaObject]): Unit = js.native
  def copy(
    params: ParamsResourceObjectsCopy,
    options: BodyResponseCallback[Readable | SchemaObject],
    callback: BodyResponseCallback[Readable | SchemaObject]
  ): Unit = js.native
  def copy(params: ParamsResourceObjectsCopy, options: MethodOptions): GaxiosPromise[SchemaObject] = js.native
  def copy(
    params: ParamsResourceObjectsCopy,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaObject]
  ): Unit = js.native
  /**
    * Copies a source object to a destination object. Optionally overrides metadata.
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
    *   const res = await storage.objects.copy({
    *     // Name of the bucket in which to store the new object. Overrides the provided object metadata's bucket value, if any.For information about how to URL encode object names to be path safe, see Encoding URI Path Parts.
    *     destinationBucket: 'placeholder-value',
    *     // Resource name of the Cloud KMS key, of the form projects/my-project/locations/global/keyRings/my-kr/cryptoKeys/my-key, that will be used to encrypt the object. Overrides the object metadata's kms_key_name value, if any.
    *     destinationKmsKeyName: 'placeholder-value',
    *     // Name of the new object. Required when the object metadata is not otherwise provided. Overrides the object metadata's name value, if any.
    *     destinationObject: 'placeholder-value',
    *     // Apply a predefined set of access controls to the destination object.
    *     destinationPredefinedAcl: 'placeholder-value',
    *     // Makes the operation conditional on whether the destination object's current generation matches the given value. Setting to 0 makes the operation succeed only if there are no live versions of the object.
    *     ifGenerationMatch: 'placeholder-value',
    *     // Makes the operation conditional on whether the destination object's current generation does not match the given value. If no live object exists, the precondition fails. Setting to 0 makes the operation succeed only if there is a live version of the object.
    *     ifGenerationNotMatch: 'placeholder-value',
    *     // Makes the operation conditional on whether the destination object's current metageneration matches the given value.
    *     ifMetagenerationMatch: 'placeholder-value',
    *     // Makes the operation conditional on whether the destination object's current metageneration does not match the given value.
    *     ifMetagenerationNotMatch: 'placeholder-value',
    *     // Makes the operation conditional on whether the source object's current generation matches the given value.
    *     ifSourceGenerationMatch: 'placeholder-value',
    *     // Makes the operation conditional on whether the source object's current generation does not match the given value.
    *     ifSourceGenerationNotMatch: 'placeholder-value',
    *     // Makes the operation conditional on whether the source object's current metageneration matches the given value.
    *     ifSourceMetagenerationMatch: 'placeholder-value',
    *     // Makes the operation conditional on whether the source object's current metageneration does not match the given value.
    *     ifSourceMetagenerationNotMatch: 'placeholder-value',
    *     // Set of properties to return. Defaults to noAcl, unless the object resource specifies the acl property, when it defaults to full.
    *     projection: 'placeholder-value',
    *     // Name of the bucket in which to find the source object.
    *     sourceBucket: 'placeholder-value',
    *     // If present, selects a specific revision of the source object (as opposed to the latest version, the default).
    *     sourceGeneration: 'placeholder-value',
    *     // Name of the source object. For information about how to URL encode object names to be path safe, see Encoding URI Path Parts.
    *     sourceObject: 'placeholder-value',
    *     // The project to be billed for this request. Required for Requester Pays buckets.
    *     userProject: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "acl": [],
    *       //   "bucket": "my_bucket",
    *       //   "cacheControl": "my_cacheControl",
    *       //   "componentCount": 0,
    *       //   "contentDisposition": "my_contentDisposition",
    *       //   "contentEncoding": "my_contentEncoding",
    *       //   "contentLanguage": "my_contentLanguage",
    *       //   "contentType": "my_contentType",
    *       //   "crc32c": "my_crc32c",
    *       //   "customTime": "my_customTime",
    *       //   "customerEncryption": {},
    *       //   "etag": "my_etag",
    *       //   "eventBasedHold": false,
    *       //   "generation": "my_generation",
    *       //   "id": "my_id",
    *       //   "kind": "my_kind",
    *       //   "kmsKeyName": "my_kmsKeyName",
    *       //   "md5Hash": "my_md5Hash",
    *       //   "mediaLink": "my_mediaLink",
    *       //   "metadata": {},
    *       //   "metageneration": "my_metageneration",
    *       //   "name": "my_name",
    *       //   "owner": {},
    *       //   "retentionExpirationTime": "my_retentionExpirationTime",
    *       //   "selfLink": "my_selfLink",
    *       //   "size": "my_size",
    *       //   "storageClass": "my_storageClass",
    *       //   "temporaryHold": false,
    *       //   "timeCreated": "my_timeCreated",
    *       //   "timeDeleted": "my_timeDeleted",
    *       //   "timeStorageClassUpdated": "my_timeStorageClassUpdated",
    *       //   "updated": "my_updated"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "acl": [],
    *   //   "bucket": "my_bucket",
    *   //   "cacheControl": "my_cacheControl",
    *   //   "componentCount": 0,
    *   //   "contentDisposition": "my_contentDisposition",
    *   //   "contentEncoding": "my_contentEncoding",
    *   //   "contentLanguage": "my_contentLanguage",
    *   //   "contentType": "my_contentType",
    *   //   "crc32c": "my_crc32c",
    *   //   "customTime": "my_customTime",
    *   //   "customerEncryption": {},
    *   //   "etag": "my_etag",
    *   //   "eventBasedHold": false,
    *   //   "generation": "my_generation",
    *   //   "id": "my_id",
    *   //   "kind": "my_kind",
    *   //   "kmsKeyName": "my_kmsKeyName",
    *   //   "md5Hash": "my_md5Hash",
    *   //   "mediaLink": "my_mediaLink",
    *   //   "metadata": {},
    *   //   "metageneration": "my_metageneration",
    *   //   "name": "my_name",
    *   //   "owner": {},
    *   //   "retentionExpirationTime": "my_retentionExpirationTime",
    *   //   "selfLink": "my_selfLink",
    *   //   "size": "my_size",
    *   //   "storageClass": "my_storageClass",
    *   //   "temporaryHold": false,
    *   //   "timeCreated": "my_timeCreated",
    *   //   "timeDeleted": "my_timeDeleted",
    *   //   "timeStorageClassUpdated": "my_timeStorageClassUpdated",
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
  def copy(params: ParamsResourceObjectsCopy, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def copy(
    params: ParamsResourceObjectsCopy,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def delete(): GaxiosPromise[Unit] = js.native
  def delete(callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceObjectsDelete): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceObjectsDelete, callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(
    params: ParamsResourceObjectsDelete,
    options: BodyResponseCallback[Readable | Unit],
    callback: BodyResponseCallback[Readable | Unit]
  ): Unit = js.native
  def delete(params: ParamsResourceObjectsDelete, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceObjectsDelete, options: MethodOptions, callback: BodyResponseCallback[Unit]): Unit = js.native
  /**
    * Deletes an object and its metadata. Deletions are permanent if versioning is not enabled for the bucket, or if the generation parameter is used.
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
    *   const res = await storage.objects.delete({
    *     // Name of the bucket in which the object resides.
    *     bucket: 'placeholder-value',
    *     // If present, permanently deletes a specific revision of this object (as opposed to the latest version, the default).
    *     generation: 'placeholder-value',
    *     // Makes the operation conditional on whether the object's current generation matches the given value. Setting to 0 makes the operation succeed only if there are no live versions of the object.
    *     ifGenerationMatch: 'placeholder-value',
    *     // Makes the operation conditional on whether the object's current generation does not match the given value. If no live object exists, the precondition fails. Setting to 0 makes the operation succeed only if there is a live version of the object.
    *     ifGenerationNotMatch: 'placeholder-value',
    *     // Makes the operation conditional on whether the object's current metageneration matches the given value.
    *     ifMetagenerationMatch: 'placeholder-value',
    *     // Makes the operation conditional on whether the object's current metageneration does not match the given value.
    *     ifMetagenerationNotMatch: 'placeholder-value',
    *     // Name of the object. For information about how to URL encode object names to be path safe, see Encoding URI Path Parts.
    *     object: 'placeholder-value',
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
  def delete(params: ParamsResourceObjectsDelete, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def delete(
    params: ParamsResourceObjectsDelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def get(): GaxiosPromise[SchemaObject] = js.native
  def get(callback: BodyResponseCallback[SchemaObject]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaObject] = js.native
  def get(params: ParamsResourceObjectsGet): GaxiosPromise[SchemaObject] = js.native
  def get(params: ParamsResourceObjectsGet, callback: BodyResponseCallback[SchemaObject]): Unit = js.native
  def get(
    params: ParamsResourceObjectsGet,
    options: BodyResponseCallback[Readable | SchemaObject],
    callback: BodyResponseCallback[Readable | SchemaObject]
  ): Unit = js.native
  def get(params: ParamsResourceObjectsGet, options: MethodOptions): GaxiosPromise[SchemaObject] = js.native
  def get(
    params: ParamsResourceObjectsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaObject]
  ): Unit = js.native
  /**
    * Retrieves an object or its metadata.
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
    *   const res = await storage.objects.get({
    *     // Name of the bucket in which the object resides.
    *     bucket: 'placeholder-value',
    *     // If present, selects a specific revision of this object (as opposed to the latest version, the default).
    *     generation: 'placeholder-value',
    *     // Makes the operation conditional on whether the object's current generation matches the given value. Setting to 0 makes the operation succeed only if there are no live versions of the object.
    *     ifGenerationMatch: 'placeholder-value',
    *     // Makes the operation conditional on whether the object's current generation does not match the given value. If no live object exists, the precondition fails. Setting to 0 makes the operation succeed only if there is a live version of the object.
    *     ifGenerationNotMatch: 'placeholder-value',
    *     // Makes the operation conditional on whether the object's current metageneration matches the given value.
    *     ifMetagenerationMatch: 'placeholder-value',
    *     // Makes the operation conditional on whether the object's current metageneration does not match the given value.
    *     ifMetagenerationNotMatch: 'placeholder-value',
    *     // Name of the object. For information about how to URL encode object names to be path safe, see Encoding URI Path Parts.
    *     object: 'placeholder-value',
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
    *   //   "bucket": "my_bucket",
    *   //   "cacheControl": "my_cacheControl",
    *   //   "componentCount": 0,
    *   //   "contentDisposition": "my_contentDisposition",
    *   //   "contentEncoding": "my_contentEncoding",
    *   //   "contentLanguage": "my_contentLanguage",
    *   //   "contentType": "my_contentType",
    *   //   "crc32c": "my_crc32c",
    *   //   "customTime": "my_customTime",
    *   //   "customerEncryption": {},
    *   //   "etag": "my_etag",
    *   //   "eventBasedHold": false,
    *   //   "generation": "my_generation",
    *   //   "id": "my_id",
    *   //   "kind": "my_kind",
    *   //   "kmsKeyName": "my_kmsKeyName",
    *   //   "md5Hash": "my_md5Hash",
    *   //   "mediaLink": "my_mediaLink",
    *   //   "metadata": {},
    *   //   "metageneration": "my_metageneration",
    *   //   "name": "my_name",
    *   //   "owner": {},
    *   //   "retentionExpirationTime": "my_retentionExpirationTime",
    *   //   "selfLink": "my_selfLink",
    *   //   "size": "my_size",
    *   //   "storageClass": "my_storageClass",
    *   //   "temporaryHold": false,
    *   //   "timeCreated": "my_timeCreated",
    *   //   "timeDeleted": "my_timeDeleted",
    *   //   "timeStorageClassUpdated": "my_timeStorageClassUpdated",
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
  def get(params: ParamsResourceObjectsGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceObjectsGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def getIamPolicy(): GaxiosPromise[SchemaPolicy] = js.native
  def getIamPolicy(callback: BodyResponseCallback[SchemaPolicy]): Unit = js.native
  def getIamPolicy(params: Unit, options: MethodOptions): GaxiosPromise[SchemaPolicy] = js.native
  def getIamPolicy(params: ParamsResourceObjectsGetiampolicy): GaxiosPromise[SchemaPolicy] = js.native
  def getIamPolicy(params: ParamsResourceObjectsGetiampolicy, callback: BodyResponseCallback[SchemaPolicy]): Unit = js.native
  def getIamPolicy(
    params: ParamsResourceObjectsGetiampolicy,
    options: BodyResponseCallback[Readable | SchemaPolicy],
    callback: BodyResponseCallback[Readable | SchemaPolicy]
  ): Unit = js.native
  def getIamPolicy(params: ParamsResourceObjectsGetiampolicy, options: MethodOptions): GaxiosPromise[SchemaPolicy] = js.native
  def getIamPolicy(
    params: ParamsResourceObjectsGetiampolicy,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaPolicy]
  ): Unit = js.native
  /**
    * Returns an IAM policy for the specified object.
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
    *   const res = await storage.objects.getIamPolicy({
    *     // Name of the bucket in which the object resides.
    *     bucket: 'placeholder-value',
    *     // If present, selects a specific revision of this object (as opposed to the latest version, the default).
    *     generation: 'placeholder-value',
    *     // Name of the object. For information about how to URL encode object names to be path safe, see Encoding URI Path Parts.
    *     object: 'placeholder-value',
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
  def getIamPolicy(params: ParamsResourceObjectsGetiampolicy, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def getIamPolicy(
    params: ParamsResourceObjectsGetiampolicy,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def insert(): GaxiosPromise[SchemaObject] = js.native
  def insert(callback: BodyResponseCallback[SchemaObject]): Unit = js.native
  def insert(params: Unit, options: MethodOptions): GaxiosPromise[SchemaObject] = js.native
  def insert(params: ParamsResourceObjectsInsert): GaxiosPromise[SchemaObject] = js.native
  def insert(params: ParamsResourceObjectsInsert, callback: BodyResponseCallback[SchemaObject]): Unit = js.native
  def insert(
    params: ParamsResourceObjectsInsert,
    options: BodyResponseCallback[Readable | SchemaObject],
    callback: BodyResponseCallback[Readable | SchemaObject]
  ): Unit = js.native
  def insert(params: ParamsResourceObjectsInsert, options: MethodOptions): GaxiosPromise[SchemaObject] = js.native
  def insert(
    params: ParamsResourceObjectsInsert,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaObject]
  ): Unit = js.native
  /**
    * Stores a new object and metadata.
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
    *   const res = await storage.objects.insert({
    *     // Name of the bucket in which to store the new object. Overrides the provided object metadata's bucket value, if any.
    *     bucket: 'placeholder-value',
    *     // If set, sets the contentEncoding property of the final object to this value. Setting this parameter is equivalent to setting the contentEncoding metadata property. This can be useful when uploading an object with uploadType=media to indicate the encoding of the content being uploaded.
    *     contentEncoding: 'placeholder-value',
    *     // Makes the operation conditional on whether the object's current generation matches the given value. Setting to 0 makes the operation succeed only if there are no live versions of the object.
    *     ifGenerationMatch: 'placeholder-value',
    *     // Makes the operation conditional on whether the object's current generation does not match the given value. If no live object exists, the precondition fails. Setting to 0 makes the operation succeed only if there is a live version of the object.
    *     ifGenerationNotMatch: 'placeholder-value',
    *     // Makes the operation conditional on whether the object's current metageneration matches the given value.
    *     ifMetagenerationMatch: 'placeholder-value',
    *     // Makes the operation conditional on whether the object's current metageneration does not match the given value.
    *     ifMetagenerationNotMatch: 'placeholder-value',
    *     // Resource name of the Cloud KMS key, of the form projects/my-project/locations/global/keyRings/my-kr/cryptoKeys/my-key, that will be used to encrypt the object. Overrides the object metadata's kms_key_name value, if any.
    *     kmsKeyName: 'placeholder-value',
    *     // Name of the object. Required when the object metadata is not otherwise provided. Overrides the object metadata's name value, if any. For information about how to URL encode object names to be path safe, see Encoding URI Path Parts.
    *     name: 'placeholder-value',
    *     // Apply a predefined set of access controls to this object.
    *     predefinedAcl: 'placeholder-value',
    *     // Set of properties to return. Defaults to noAcl, unless the object resource specifies the acl property, when it defaults to full.
    *     projection: 'placeholder-value',
    *     // The project to be billed for this request. Required for Requester Pays buckets.
    *     userProject: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "acl": [],
    *       //   "bucket": "my_bucket",
    *       //   "cacheControl": "my_cacheControl",
    *       //   "componentCount": 0,
    *       //   "contentDisposition": "my_contentDisposition",
    *       //   "contentEncoding": "my_contentEncoding",
    *       //   "contentLanguage": "my_contentLanguage",
    *       //   "contentType": "my_contentType",
    *       //   "crc32c": "my_crc32c",
    *       //   "customTime": "my_customTime",
    *       //   "customerEncryption": {},
    *       //   "etag": "my_etag",
    *       //   "eventBasedHold": false,
    *       //   "generation": "my_generation",
    *       //   "id": "my_id",
    *       //   "kind": "my_kind",
    *       //   "kmsKeyName": "my_kmsKeyName",
    *       //   "md5Hash": "my_md5Hash",
    *       //   "mediaLink": "my_mediaLink",
    *       //   "metadata": {},
    *       //   "metageneration": "my_metageneration",
    *       //   "name": "my_name",
    *       //   "owner": {},
    *       //   "retentionExpirationTime": "my_retentionExpirationTime",
    *       //   "selfLink": "my_selfLink",
    *       //   "size": "my_size",
    *       //   "storageClass": "my_storageClass",
    *       //   "temporaryHold": false,
    *       //   "timeCreated": "my_timeCreated",
    *       //   "timeDeleted": "my_timeDeleted",
    *       //   "timeStorageClassUpdated": "my_timeStorageClassUpdated",
    *       //   "updated": "my_updated"
    *       // }
    *     },
    *     media: {
    *       mimeType: 'placeholder-value',
    *       body: 'placeholder-value',
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "acl": [],
    *   //   "bucket": "my_bucket",
    *   //   "cacheControl": "my_cacheControl",
    *   //   "componentCount": 0,
    *   //   "contentDisposition": "my_contentDisposition",
    *   //   "contentEncoding": "my_contentEncoding",
    *   //   "contentLanguage": "my_contentLanguage",
    *   //   "contentType": "my_contentType",
    *   //   "crc32c": "my_crc32c",
    *   //   "customTime": "my_customTime",
    *   //   "customerEncryption": {},
    *   //   "etag": "my_etag",
    *   //   "eventBasedHold": false,
    *   //   "generation": "my_generation",
    *   //   "id": "my_id",
    *   //   "kind": "my_kind",
    *   //   "kmsKeyName": "my_kmsKeyName",
    *   //   "md5Hash": "my_md5Hash",
    *   //   "mediaLink": "my_mediaLink",
    *   //   "metadata": {},
    *   //   "metageneration": "my_metageneration",
    *   //   "name": "my_name",
    *   //   "owner": {},
    *   //   "retentionExpirationTime": "my_retentionExpirationTime",
    *   //   "selfLink": "my_selfLink",
    *   //   "size": "my_size",
    *   //   "storageClass": "my_storageClass",
    *   //   "temporaryHold": false,
    *   //   "timeCreated": "my_timeCreated",
    *   //   "timeDeleted": "my_timeDeleted",
    *   //   "timeStorageClassUpdated": "my_timeStorageClassUpdated",
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
  def insert(params: ParamsResourceObjectsInsert, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def insert(
    params: ParamsResourceObjectsInsert,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaObjects] = js.native
  def list(callback: BodyResponseCallback[SchemaObjects]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaObjects] = js.native
  def list(params: ParamsResourceObjectsList): GaxiosPromise[SchemaObjects] = js.native
  def list(params: ParamsResourceObjectsList, callback: BodyResponseCallback[SchemaObjects]): Unit = js.native
  def list(
    params: ParamsResourceObjectsList,
    options: BodyResponseCallback[Readable | SchemaObjects],
    callback: BodyResponseCallback[Readable | SchemaObjects]
  ): Unit = js.native
  def list(params: ParamsResourceObjectsList, options: MethodOptions): GaxiosPromise[SchemaObjects] = js.native
  def list(
    params: ParamsResourceObjectsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaObjects]
  ): Unit = js.native
  /**
    * Retrieves a list of objects matching the criteria.
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
    *   const res = await storage.objects.list({
    *     // Name of the bucket in which to look for objects.
    *     bucket: 'placeholder-value',
    *     // Returns results in a directory-like mode. items will contain only objects whose names, aside from the prefix, do not contain delimiter. Objects whose names, aside from the prefix, contain delimiter will have their name, truncated after the delimiter, returned in prefixes. Duplicate prefixes are omitted.
    *     delimiter: 'placeholder-value',
    *     // Filter results to objects whose names are lexicographically before endOffset. If startOffset is also set, the objects listed will have names between startOffset (inclusive) and endOffset (exclusive).
    *     endOffset: 'placeholder-value',
    *     // If true, objects that end in exactly one instance of delimiter will have their metadata included in items in addition to prefixes.
    *     includeTrailingDelimiter: 'placeholder-value',
    *     // Maximum number of items plus prefixes to return in a single page of responses. As duplicate prefixes are omitted, fewer total results may be returned than requested. The service will use this parameter or 1,000 items, whichever is smaller.
    *     maxResults: 'placeholder-value',
    *     // A previously-returned page token representing part of the larger set of results to view.
    *     pageToken: 'placeholder-value',
    *     // Filter results to objects whose names begin with this prefix.
    *     prefix: 'placeholder-value',
    *     // Set of properties to return. Defaults to noAcl.
    *     projection: 'placeholder-value',
    *     // Filter results to objects whose names are lexicographically equal to or after startOffset. If endOffset is also set, the objects listed will have names between startOffset (inclusive) and endOffset (exclusive).
    *     startOffset: 'placeholder-value',
    *     // The project to be billed for this request. Required for Requester Pays buckets.
    *     userProject: 'placeholder-value',
    *     // If true, lists all versions of an object as distinct results. The default is false. For more information, see Object Versioning.
    *     versions: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "items": [],
    *   //   "kind": "my_kind",
    *   //   "nextPageToken": "my_nextPageToken",
    *   //   "prefixes": []
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
  def list(params: ParamsResourceObjectsList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceObjectsList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def patch(): GaxiosPromise[SchemaObject] = js.native
  def patch(callback: BodyResponseCallback[SchemaObject]): Unit = js.native
  def patch(params: Unit, options: MethodOptions): GaxiosPromise[SchemaObject] = js.native
  def patch(params: ParamsResourceObjectsPatch): GaxiosPromise[SchemaObject] = js.native
  def patch(params: ParamsResourceObjectsPatch, callback: BodyResponseCallback[SchemaObject]): Unit = js.native
  def patch(
    params: ParamsResourceObjectsPatch,
    options: BodyResponseCallback[Readable | SchemaObject],
    callback: BodyResponseCallback[Readable | SchemaObject]
  ): Unit = js.native
  def patch(params: ParamsResourceObjectsPatch, options: MethodOptions): GaxiosPromise[SchemaObject] = js.native
  def patch(
    params: ParamsResourceObjectsPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaObject]
  ): Unit = js.native
  /**
    * Patches an object's metadata.
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
    *   const res = await storage.objects.patch({
    *     // Name of the bucket in which the object resides.
    *     bucket: 'placeholder-value',
    *     // If present, selects a specific revision of this object (as opposed to the latest version, the default).
    *     generation: 'placeholder-value',
    *     // Makes the operation conditional on whether the object's current generation matches the given value. Setting to 0 makes the operation succeed only if there are no live versions of the object.
    *     ifGenerationMatch: 'placeholder-value',
    *     // Makes the operation conditional on whether the object's current generation does not match the given value. If no live object exists, the precondition fails. Setting to 0 makes the operation succeed only if there is a live version of the object.
    *     ifGenerationNotMatch: 'placeholder-value',
    *     // Makes the operation conditional on whether the object's current metageneration matches the given value.
    *     ifMetagenerationMatch: 'placeholder-value',
    *     // Makes the operation conditional on whether the object's current metageneration does not match the given value.
    *     ifMetagenerationNotMatch: 'placeholder-value',
    *     // Name of the object. For information about how to URL encode object names to be path safe, see Encoding URI Path Parts.
    *     object: 'placeholder-value',
    *     // Apply a predefined set of access controls to this object.
    *     predefinedAcl: 'placeholder-value',
    *     // Set of properties to return. Defaults to full.
    *     projection: 'placeholder-value',
    *     // The project to be billed for this request, for Requester Pays buckets.
    *     userProject: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "acl": [],
    *       //   "bucket": "my_bucket",
    *       //   "cacheControl": "my_cacheControl",
    *       //   "componentCount": 0,
    *       //   "contentDisposition": "my_contentDisposition",
    *       //   "contentEncoding": "my_contentEncoding",
    *       //   "contentLanguage": "my_contentLanguage",
    *       //   "contentType": "my_contentType",
    *       //   "crc32c": "my_crc32c",
    *       //   "customTime": "my_customTime",
    *       //   "customerEncryption": {},
    *       //   "etag": "my_etag",
    *       //   "eventBasedHold": false,
    *       //   "generation": "my_generation",
    *       //   "id": "my_id",
    *       //   "kind": "my_kind",
    *       //   "kmsKeyName": "my_kmsKeyName",
    *       //   "md5Hash": "my_md5Hash",
    *       //   "mediaLink": "my_mediaLink",
    *       //   "metadata": {},
    *       //   "metageneration": "my_metageneration",
    *       //   "name": "my_name",
    *       //   "owner": {},
    *       //   "retentionExpirationTime": "my_retentionExpirationTime",
    *       //   "selfLink": "my_selfLink",
    *       //   "size": "my_size",
    *       //   "storageClass": "my_storageClass",
    *       //   "temporaryHold": false,
    *       //   "timeCreated": "my_timeCreated",
    *       //   "timeDeleted": "my_timeDeleted",
    *       //   "timeStorageClassUpdated": "my_timeStorageClassUpdated",
    *       //   "updated": "my_updated"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "acl": [],
    *   //   "bucket": "my_bucket",
    *   //   "cacheControl": "my_cacheControl",
    *   //   "componentCount": 0,
    *   //   "contentDisposition": "my_contentDisposition",
    *   //   "contentEncoding": "my_contentEncoding",
    *   //   "contentLanguage": "my_contentLanguage",
    *   //   "contentType": "my_contentType",
    *   //   "crc32c": "my_crc32c",
    *   //   "customTime": "my_customTime",
    *   //   "customerEncryption": {},
    *   //   "etag": "my_etag",
    *   //   "eventBasedHold": false,
    *   //   "generation": "my_generation",
    *   //   "id": "my_id",
    *   //   "kind": "my_kind",
    *   //   "kmsKeyName": "my_kmsKeyName",
    *   //   "md5Hash": "my_md5Hash",
    *   //   "mediaLink": "my_mediaLink",
    *   //   "metadata": {},
    *   //   "metageneration": "my_metageneration",
    *   //   "name": "my_name",
    *   //   "owner": {},
    *   //   "retentionExpirationTime": "my_retentionExpirationTime",
    *   //   "selfLink": "my_selfLink",
    *   //   "size": "my_size",
    *   //   "storageClass": "my_storageClass",
    *   //   "temporaryHold": false,
    *   //   "timeCreated": "my_timeCreated",
    *   //   "timeDeleted": "my_timeDeleted",
    *   //   "timeStorageClassUpdated": "my_timeStorageClassUpdated",
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
  def patch(params: ParamsResourceObjectsPatch, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def patch(
    params: ParamsResourceObjectsPatch,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def rewrite(): GaxiosPromise[SchemaRewriteResponse] = js.native
  def rewrite(callback: BodyResponseCallback[SchemaRewriteResponse]): Unit = js.native
  def rewrite(params: Unit, options: MethodOptions): GaxiosPromise[SchemaRewriteResponse] = js.native
  def rewrite(params: ParamsResourceObjectsRewrite): GaxiosPromise[SchemaRewriteResponse] = js.native
  def rewrite(params: ParamsResourceObjectsRewrite, callback: BodyResponseCallback[SchemaRewriteResponse]): Unit = js.native
  def rewrite(
    params: ParamsResourceObjectsRewrite,
    options: BodyResponseCallback[Readable | SchemaRewriteResponse],
    callback: BodyResponseCallback[Readable | SchemaRewriteResponse]
  ): Unit = js.native
  def rewrite(params: ParamsResourceObjectsRewrite, options: MethodOptions): GaxiosPromise[SchemaRewriteResponse] = js.native
  def rewrite(
    params: ParamsResourceObjectsRewrite,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaRewriteResponse]
  ): Unit = js.native
  /**
    * Rewrites a source object to a destination object. Optionally overrides metadata.
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
    *   const res = await storage.objects.rewrite({
    *     // Name of the bucket in which to store the new object. Overrides the provided object metadata's bucket value, if any.
    *     destinationBucket: 'placeholder-value',
    *     // Resource name of the Cloud KMS key, of the form projects/my-project/locations/global/keyRings/my-kr/cryptoKeys/my-key, that will be used to encrypt the object. Overrides the object metadata's kms_key_name value, if any.
    *     destinationKmsKeyName: 'placeholder-value',
    *     // Name of the new object. Required when the object metadata is not otherwise provided. Overrides the object metadata's name value, if any. For information about how to URL encode object names to be path safe, see Encoding URI Path Parts.
    *     destinationObject: 'placeholder-value',
    *     // Apply a predefined set of access controls to the destination object.
    *     destinationPredefinedAcl: 'placeholder-value',
    *     // Makes the operation conditional on whether the object's current generation matches the given value. Setting to 0 makes the operation succeed only if there are no live versions of the object.
    *     ifGenerationMatch: 'placeholder-value',
    *     // Makes the operation conditional on whether the object's current generation does not match the given value. If no live object exists, the precondition fails. Setting to 0 makes the operation succeed only if there is a live version of the object.
    *     ifGenerationNotMatch: 'placeholder-value',
    *     // Makes the operation conditional on whether the destination object's current metageneration matches the given value.
    *     ifMetagenerationMatch: 'placeholder-value',
    *     // Makes the operation conditional on whether the destination object's current metageneration does not match the given value.
    *     ifMetagenerationNotMatch: 'placeholder-value',
    *     // Makes the operation conditional on whether the source object's current generation matches the given value.
    *     ifSourceGenerationMatch: 'placeholder-value',
    *     // Makes the operation conditional on whether the source object's current generation does not match the given value.
    *     ifSourceGenerationNotMatch: 'placeholder-value',
    *     // Makes the operation conditional on whether the source object's current metageneration matches the given value.
    *     ifSourceMetagenerationMatch: 'placeholder-value',
    *     // Makes the operation conditional on whether the source object's current metageneration does not match the given value.
    *     ifSourceMetagenerationNotMatch: 'placeholder-value',
    *     // The maximum number of bytes that will be rewritten per rewrite request. Most callers shouldn't need to specify this parameter - it is primarily in place to support testing. If specified the value must be an integral multiple of 1 MiB (1048576). Also, this only applies to requests where the source and destination span locations and/or storage classes. Finally, this value must not change across rewrite calls else you'll get an error that the rewriteToken is invalid.
    *     maxBytesRewrittenPerCall: 'placeholder-value',
    *     // Set of properties to return. Defaults to noAcl, unless the object resource specifies the acl property, when it defaults to full.
    *     projection: 'placeholder-value',
    *     // Include this field (from the previous rewrite response) on each rewrite request after the first one, until the rewrite response 'done' flag is true. Calls that provide a rewriteToken can omit all other request fields, but if included those fields must match the values provided in the first rewrite request.
    *     rewriteToken: 'placeholder-value',
    *     // Name of the bucket in which to find the source object.
    *     sourceBucket: 'placeholder-value',
    *     // If present, selects a specific revision of the source object (as opposed to the latest version, the default).
    *     sourceGeneration: 'placeholder-value',
    *     // Name of the source object. For information about how to URL encode object names to be path safe, see Encoding URI Path Parts.
    *     sourceObject: 'placeholder-value',
    *     // The project to be billed for this request. Required for Requester Pays buckets.
    *     userProject: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "acl": [],
    *       //   "bucket": "my_bucket",
    *       //   "cacheControl": "my_cacheControl",
    *       //   "componentCount": 0,
    *       //   "contentDisposition": "my_contentDisposition",
    *       //   "contentEncoding": "my_contentEncoding",
    *       //   "contentLanguage": "my_contentLanguage",
    *       //   "contentType": "my_contentType",
    *       //   "crc32c": "my_crc32c",
    *       //   "customTime": "my_customTime",
    *       //   "customerEncryption": {},
    *       //   "etag": "my_etag",
    *       //   "eventBasedHold": false,
    *       //   "generation": "my_generation",
    *       //   "id": "my_id",
    *       //   "kind": "my_kind",
    *       //   "kmsKeyName": "my_kmsKeyName",
    *       //   "md5Hash": "my_md5Hash",
    *       //   "mediaLink": "my_mediaLink",
    *       //   "metadata": {},
    *       //   "metageneration": "my_metageneration",
    *       //   "name": "my_name",
    *       //   "owner": {},
    *       //   "retentionExpirationTime": "my_retentionExpirationTime",
    *       //   "selfLink": "my_selfLink",
    *       //   "size": "my_size",
    *       //   "storageClass": "my_storageClass",
    *       //   "temporaryHold": false,
    *       //   "timeCreated": "my_timeCreated",
    *       //   "timeDeleted": "my_timeDeleted",
    *       //   "timeStorageClassUpdated": "my_timeStorageClassUpdated",
    *       //   "updated": "my_updated"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "done": false,
    *   //   "kind": "my_kind",
    *   //   "objectSize": "my_objectSize",
    *   //   "resource": {},
    *   //   "rewriteToken": "my_rewriteToken",
    *   //   "totalBytesRewritten": "my_totalBytesRewritten"
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
  def rewrite(params: ParamsResourceObjectsRewrite, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def rewrite(
    params: ParamsResourceObjectsRewrite,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def setIamPolicy(): GaxiosPromise[SchemaPolicy] = js.native
  def setIamPolicy(callback: BodyResponseCallback[SchemaPolicy]): Unit = js.native
  def setIamPolicy(params: Unit, options: MethodOptions): GaxiosPromise[SchemaPolicy] = js.native
  def setIamPolicy(params: ParamsResourceObjectsSetiampolicy): GaxiosPromise[SchemaPolicy] = js.native
  def setIamPolicy(params: ParamsResourceObjectsSetiampolicy, callback: BodyResponseCallback[SchemaPolicy]): Unit = js.native
  def setIamPolicy(
    params: ParamsResourceObjectsSetiampolicy,
    options: BodyResponseCallback[Readable | SchemaPolicy],
    callback: BodyResponseCallback[Readable | SchemaPolicy]
  ): Unit = js.native
  def setIamPolicy(params: ParamsResourceObjectsSetiampolicy, options: MethodOptions): GaxiosPromise[SchemaPolicy] = js.native
  def setIamPolicy(
    params: ParamsResourceObjectsSetiampolicy,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaPolicy]
  ): Unit = js.native
  /**
    * Updates an IAM policy for the specified object.
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
    *   const res = await storage.objects.setIamPolicy({
    *     // Name of the bucket in which the object resides.
    *     bucket: 'placeholder-value',
    *     // If present, selects a specific revision of this object (as opposed to the latest version, the default).
    *     generation: 'placeholder-value',
    *     // Name of the object. For information about how to URL encode object names to be path safe, see Encoding URI Path Parts.
    *     object: 'placeholder-value',
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
  def setIamPolicy(params: ParamsResourceObjectsSetiampolicy, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def setIamPolicy(
    params: ParamsResourceObjectsSetiampolicy,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def testIamPermissions(): GaxiosPromise[SchemaTestIamPermissionsResponse] = js.native
  def testIamPermissions(callback: BodyResponseCallback[SchemaTestIamPermissionsResponse]): Unit = js.native
  def testIamPermissions(params: Unit, options: MethodOptions): GaxiosPromise[SchemaTestIamPermissionsResponse] = js.native
  def testIamPermissions(params: ParamsResourceObjectsTestiampermissions): GaxiosPromise[SchemaTestIamPermissionsResponse] = js.native
  def testIamPermissions(
    params: ParamsResourceObjectsTestiampermissions,
    callback: BodyResponseCallback[SchemaTestIamPermissionsResponse]
  ): Unit = js.native
  def testIamPermissions(
    params: ParamsResourceObjectsTestiampermissions,
    options: BodyResponseCallback[Readable | SchemaTestIamPermissionsResponse],
    callback: BodyResponseCallback[Readable | SchemaTestIamPermissionsResponse]
  ): Unit = js.native
  def testIamPermissions(params: ParamsResourceObjectsTestiampermissions, options: MethodOptions): GaxiosPromise[SchemaTestIamPermissionsResponse] = js.native
  def testIamPermissions(
    params: ParamsResourceObjectsTestiampermissions,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaTestIamPermissionsResponse]
  ): Unit = js.native
  /**
    * Tests a set of permissions on the given object to see which, if any, are held by the caller.
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
    *   const res = await storage.objects.testIamPermissions({
    *     // Name of the bucket in which the object resides.
    *     bucket: 'placeholder-value',
    *     // If present, selects a specific revision of this object (as opposed to the latest version, the default).
    *     generation: 'placeholder-value',
    *     // Name of the object. For information about how to URL encode object names to be path safe, see Encoding URI Path Parts.
    *     object: 'placeholder-value',
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
  def testIamPermissions(params: ParamsResourceObjectsTestiampermissions, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def testIamPermissions(
    params: ParamsResourceObjectsTestiampermissions,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def update(): GaxiosPromise[SchemaObject] = js.native
  def update(callback: BodyResponseCallback[SchemaObject]): Unit = js.native
  def update(params: Unit, options: MethodOptions): GaxiosPromise[SchemaObject] = js.native
  def update(params: ParamsResourceObjectsUpdate): GaxiosPromise[SchemaObject] = js.native
  def update(params: ParamsResourceObjectsUpdate, callback: BodyResponseCallback[SchemaObject]): Unit = js.native
  def update(
    params: ParamsResourceObjectsUpdate,
    options: BodyResponseCallback[Readable | SchemaObject],
    callback: BodyResponseCallback[Readable | SchemaObject]
  ): Unit = js.native
  def update(params: ParamsResourceObjectsUpdate, options: MethodOptions): GaxiosPromise[SchemaObject] = js.native
  def update(
    params: ParamsResourceObjectsUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaObject]
  ): Unit = js.native
  /**
    * Updates an object's metadata.
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
    *   const res = await storage.objects.update({
    *     // Name of the bucket in which the object resides.
    *     bucket: 'placeholder-value',
    *     // If present, selects a specific revision of this object (as opposed to the latest version, the default).
    *     generation: 'placeholder-value',
    *     // Makes the operation conditional on whether the object's current generation matches the given value. Setting to 0 makes the operation succeed only if there are no live versions of the object.
    *     ifGenerationMatch: 'placeholder-value',
    *     // Makes the operation conditional on whether the object's current generation does not match the given value. If no live object exists, the precondition fails. Setting to 0 makes the operation succeed only if there is a live version of the object.
    *     ifGenerationNotMatch: 'placeholder-value',
    *     // Makes the operation conditional on whether the object's current metageneration matches the given value.
    *     ifMetagenerationMatch: 'placeholder-value',
    *     // Makes the operation conditional on whether the object's current metageneration does not match the given value.
    *     ifMetagenerationNotMatch: 'placeholder-value',
    *     // Name of the object. For information about how to URL encode object names to be path safe, see Encoding URI Path Parts.
    *     object: 'placeholder-value',
    *     // Apply a predefined set of access controls to this object.
    *     predefinedAcl: 'placeholder-value',
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
    *       //   "bucket": "my_bucket",
    *       //   "cacheControl": "my_cacheControl",
    *       //   "componentCount": 0,
    *       //   "contentDisposition": "my_contentDisposition",
    *       //   "contentEncoding": "my_contentEncoding",
    *       //   "contentLanguage": "my_contentLanguage",
    *       //   "contentType": "my_contentType",
    *       //   "crc32c": "my_crc32c",
    *       //   "customTime": "my_customTime",
    *       //   "customerEncryption": {},
    *       //   "etag": "my_etag",
    *       //   "eventBasedHold": false,
    *       //   "generation": "my_generation",
    *       //   "id": "my_id",
    *       //   "kind": "my_kind",
    *       //   "kmsKeyName": "my_kmsKeyName",
    *       //   "md5Hash": "my_md5Hash",
    *       //   "mediaLink": "my_mediaLink",
    *       //   "metadata": {},
    *       //   "metageneration": "my_metageneration",
    *       //   "name": "my_name",
    *       //   "owner": {},
    *       //   "retentionExpirationTime": "my_retentionExpirationTime",
    *       //   "selfLink": "my_selfLink",
    *       //   "size": "my_size",
    *       //   "storageClass": "my_storageClass",
    *       //   "temporaryHold": false,
    *       //   "timeCreated": "my_timeCreated",
    *       //   "timeDeleted": "my_timeDeleted",
    *       //   "timeStorageClassUpdated": "my_timeStorageClassUpdated",
    *       //   "updated": "my_updated"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "acl": [],
    *   //   "bucket": "my_bucket",
    *   //   "cacheControl": "my_cacheControl",
    *   //   "componentCount": 0,
    *   //   "contentDisposition": "my_contentDisposition",
    *   //   "contentEncoding": "my_contentEncoding",
    *   //   "contentLanguage": "my_contentLanguage",
    *   //   "contentType": "my_contentType",
    *   //   "crc32c": "my_crc32c",
    *   //   "customTime": "my_customTime",
    *   //   "customerEncryption": {},
    *   //   "etag": "my_etag",
    *   //   "eventBasedHold": false,
    *   //   "generation": "my_generation",
    *   //   "id": "my_id",
    *   //   "kind": "my_kind",
    *   //   "kmsKeyName": "my_kmsKeyName",
    *   //   "md5Hash": "my_md5Hash",
    *   //   "mediaLink": "my_mediaLink",
    *   //   "metadata": {},
    *   //   "metageneration": "my_metageneration",
    *   //   "name": "my_name",
    *   //   "owner": {},
    *   //   "retentionExpirationTime": "my_retentionExpirationTime",
    *   //   "selfLink": "my_selfLink",
    *   //   "size": "my_size",
    *   //   "storageClass": "my_storageClass",
    *   //   "temporaryHold": false,
    *   //   "timeCreated": "my_timeCreated",
    *   //   "timeDeleted": "my_timeDeleted",
    *   //   "timeStorageClassUpdated": "my_timeStorageClassUpdated",
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
  def update(params: ParamsResourceObjectsUpdate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def update(
    params: ParamsResourceObjectsUpdate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def watchAll(): GaxiosPromise[SchemaChannel] = js.native
  def watchAll(callback: BodyResponseCallback[SchemaChannel]): Unit = js.native
  def watchAll(params: Unit, options: MethodOptions): GaxiosPromise[SchemaChannel] = js.native
  def watchAll(params: ParamsResourceObjectsWatchall): GaxiosPromise[SchemaChannel] = js.native
  def watchAll(params: ParamsResourceObjectsWatchall, callback: BodyResponseCallback[SchemaChannel]): Unit = js.native
  def watchAll(
    params: ParamsResourceObjectsWatchall,
    options: BodyResponseCallback[Readable | SchemaChannel],
    callback: BodyResponseCallback[Readable | SchemaChannel]
  ): Unit = js.native
  def watchAll(params: ParamsResourceObjectsWatchall, options: MethodOptions): GaxiosPromise[SchemaChannel] = js.native
  def watchAll(
    params: ParamsResourceObjectsWatchall,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaChannel]
  ): Unit = js.native
  /**
    * Watch for changes on all objects in a bucket.
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
    *   const res = await storage.objects.watchAll({
    *     // Name of the bucket in which to look for objects.
    *     bucket: 'placeholder-value',
    *     // Returns results in a directory-like mode. items will contain only objects whose names, aside from the prefix, do not contain delimiter. Objects whose names, aside from the prefix, contain delimiter will have their name, truncated after the delimiter, returned in prefixes. Duplicate prefixes are omitted.
    *     delimiter: 'placeholder-value',
    *     // Filter results to objects whose names are lexicographically before endOffset. If startOffset is also set, the objects listed will have names between startOffset (inclusive) and endOffset (exclusive).
    *     endOffset: 'placeholder-value',
    *     // If true, objects that end in exactly one instance of delimiter will have their metadata included in items in addition to prefixes.
    *     includeTrailingDelimiter: 'placeholder-value',
    *     // Maximum number of items plus prefixes to return in a single page of responses. As duplicate prefixes are omitted, fewer total results may be returned than requested. The service will use this parameter or 1,000 items, whichever is smaller.
    *     maxResults: 'placeholder-value',
    *     // A previously-returned page token representing part of the larger set of results to view.
    *     pageToken: 'placeholder-value',
    *     // Filter results to objects whose names begin with this prefix.
    *     prefix: 'placeholder-value',
    *     // Set of properties to return. Defaults to noAcl.
    *     projection: 'placeholder-value',
    *     // Filter results to objects whose names are lexicographically equal to or after startOffset. If endOffset is also set, the objects listed will have names between startOffset (inclusive) and endOffset (exclusive).
    *     startOffset: 'placeholder-value',
    *     // The project to be billed for this request. Required for Requester Pays buckets.
    *     userProject: 'placeholder-value',
    *     // If true, lists all versions of an object as distinct results. The default is false. For more information, see Object Versioning.
    *     versions: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "address": "my_address",
    *       //   "expiration": "my_expiration",
    *       //   "id": "my_id",
    *       //   "kind": "my_kind",
    *       //   "params": {},
    *       //   "payload": false,
    *       //   "resourceId": "my_resourceId",
    *       //   "resourceUri": "my_resourceUri",
    *       //   "token": "my_token",
    *       //   "type": "my_type"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "address": "my_address",
    *   //   "expiration": "my_expiration",
    *   //   "id": "my_id",
    *   //   "kind": "my_kind",
    *   //   "params": {},
    *   //   "payload": false,
    *   //   "resourceId": "my_resourceId",
    *   //   "resourceUri": "my_resourceUri",
    *   //   "token": "my_token",
    *   //   "type": "my_type"
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
  def watchAll(params: ParamsResourceObjectsWatchall, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def watchAll(
    params: ParamsResourceObjectsWatchall,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
