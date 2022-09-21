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

@JSImport("googleapis/build/src/apis/storage/v1beta2", "storage_v1beta2.Resource$Objects")
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
    * storage.objects.compose
    * @desc Concatenates a list of existing objects into a new object in the same bucket.
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
    *   const res = await storage.objects.compose({
    *     // Name of the bucket containing the source objects. The destination object is stored in this bucket.
    *     destinationBucket: 'placeholder-value',
    *     // Name of the new object.
    *     destinationObject: 'placeholder-value',
    *     // Makes the operation conditional on whether the object's current generation matches the given value.
    *     ifGenerationMatch: 'placeholder-value',
    *     // Makes the operation conditional on whether the object's current metageneration matches the given value.
    *     ifMetagenerationMatch: 'placeholder-value',
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
    *   //   "etag": "my_etag",
    *   //   "generation": "my_generation",
    *   //   "id": "my_id",
    *   //   "kind": "my_kind",
    *   //   "md5Hash": "my_md5Hash",
    *   //   "mediaLink": "my_mediaLink",
    *   //   "metadata": {},
    *   //   "metageneration": "my_metageneration",
    *   //   "name": "my_name",
    *   //   "owner": {},
    *   //   "selfLink": "my_selfLink",
    *   //   "size": "my_size",
    *   //   "storageClass": "my_storageClass",
    *   //   "timeDeleted": "my_timeDeleted",
    *   //   "updated": "my_updated"
    *   // }
    * }
    *
    * main().catch(e => {
    *   console.error(e);
    *   throw e;
    * });
    *
    * @alias storage.objects.compose
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.destinationBucket Name of the bucket containing the source objects. The destination object is stored in this bucket.
    * @param {string} params.destinationObject Name of the new object.
    * @param {string=} params.ifGenerationMatch Makes the operation conditional on whether the object's current generation matches the given value.
    * @param {string=} params.ifMetagenerationMatch Makes the operation conditional on whether the object's current metageneration matches the given value.
    * @param {().ComposeRequest} params.requestBody Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
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
    * storage.objects.copy
    * @desc Copies an object to a destination in the same location. Optionally overrides metadata.
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
    *   const res = await storage.objects.copy({
    *     // Name of the bucket in which to store the new object. Overrides the provided object metadata's bucket value, if any.
    *     destinationBucket: 'placeholder-value',
    *     // Name of the new object. Required when the object metadata is not otherwise provided. Overrides the object metadata's name value, if any.
    *     destinationObject: 'placeholder-value',
    *     // Makes the operation conditional on whether the destination object's current generation matches the given value.
    *     ifGenerationMatch: 'placeholder-value',
    *     // Makes the operation conditional on whether the destination object's current generation does not match the given value.
    *     ifGenerationNotMatch: 'placeholder-value',
    *     // Makes the operation conditional on whether the destination object's current metageneration matches the given value.
    *     ifMetagenerationMatch: 'placeholder-value',
    *     // Makes the operation conditional on whether the destination object's current metageneration does not match the given value.
    *     ifMetagenerationNotMatch: 'placeholder-value',
    *     // Makes the operation conditional on whether the source object's generation matches the given value.
    *     ifSourceGenerationMatch: 'placeholder-value',
    *     // Makes the operation conditional on whether the source object's generation does not match the given value.
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
    *     // Name of the source object.
    *     sourceObject: 'placeholder-value',
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
    *       //   "etag": "my_etag",
    *       //   "generation": "my_generation",
    *       //   "id": "my_id",
    *       //   "kind": "my_kind",
    *       //   "md5Hash": "my_md5Hash",
    *       //   "mediaLink": "my_mediaLink",
    *       //   "metadata": {},
    *       //   "metageneration": "my_metageneration",
    *       //   "name": "my_name",
    *       //   "owner": {},
    *       //   "selfLink": "my_selfLink",
    *       //   "size": "my_size",
    *       //   "storageClass": "my_storageClass",
    *       //   "timeDeleted": "my_timeDeleted",
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
    *   //   "etag": "my_etag",
    *   //   "generation": "my_generation",
    *   //   "id": "my_id",
    *   //   "kind": "my_kind",
    *   //   "md5Hash": "my_md5Hash",
    *   //   "mediaLink": "my_mediaLink",
    *   //   "metadata": {},
    *   //   "metageneration": "my_metageneration",
    *   //   "name": "my_name",
    *   //   "owner": {},
    *   //   "selfLink": "my_selfLink",
    *   //   "size": "my_size",
    *   //   "storageClass": "my_storageClass",
    *   //   "timeDeleted": "my_timeDeleted",
    *   //   "updated": "my_updated"
    *   // }
    * }
    *
    * main().catch(e => {
    *   console.error(e);
    *   throw e;
    * });
    *
    * @alias storage.objects.copy
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.destinationBucket Name of the bucket in which to store the new object. Overrides the provided object metadata's bucket value, if any.
    * @param {string} params.destinationObject Name of the new object. Required when the object metadata is not otherwise provided. Overrides the object metadata's name value, if any.
    * @param {string=} params.ifGenerationMatch Makes the operation conditional on whether the destination object's current generation matches the given value.
    * @param {string=} params.ifGenerationNotMatch Makes the operation conditional on whether the destination object's current generation does not match the given value.
    * @param {string=} params.ifMetagenerationMatch Makes the operation conditional on whether the destination object's current metageneration matches the given value.
    * @param {string=} params.ifMetagenerationNotMatch Makes the operation conditional on whether the destination object's current metageneration does not match the given value.
    * @param {string=} params.ifSourceGenerationMatch Makes the operation conditional on whether the source object's generation matches the given value.
    * @param {string=} params.ifSourceGenerationNotMatch Makes the operation conditional on whether the source object's generation does not match the given value.
    * @param {string=} params.ifSourceMetagenerationMatch Makes the operation conditional on whether the source object's current metageneration matches the given value.
    * @param {string=} params.ifSourceMetagenerationNotMatch Makes the operation conditional on whether the source object's current metageneration does not match the given value.
    * @param {string=} params.projection Set of properties to return. Defaults to noAcl, unless the object resource specifies the acl property, when it defaults to full.
    * @param {string} params.sourceBucket Name of the bucket in which to find the source object.
    * @param {string=} params.sourceGeneration If present, selects a specific revision of the source object (as opposed to the latest version, the default).
    * @param {string} params.sourceObject Name of the source object.
    * @param {().Object} params.requestBody Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
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
    * storage.objects.delete
    * @desc Deletes data blobs and associated metadata. Deletions are permanent if versioning is not enabled for the bucket, or if the generation parameter is used.
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
    *   const res = await storage.objects.delete({
    *     // Name of the bucket in which the object resides.
    *     bucket: 'placeholder-value',
    *     // If present, permanently deletes a specific revision of this object (as opposed to the latest version, the default).
    *     generation: 'placeholder-value',
    *     // Makes the operation conditional on whether the object's current generation matches the given value.
    *     ifGenerationMatch: 'placeholder-value',
    *     // Makes the operation conditional on whether the object's current generation does not match the given value.
    *     ifGenerationNotMatch: 'placeholder-value',
    *     // Makes the operation conditional on whether the object's current metageneration matches the given value.
    *     ifMetagenerationMatch: 'placeholder-value',
    *     // Makes the operation conditional on whether the object's current metageneration does not match the given value.
    *     ifMetagenerationNotMatch: 'placeholder-value',
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
    * @alias storage.objects.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.bucket Name of the bucket in which the object resides.
    * @param {string=} params.generation If present, permanently deletes a specific revision of this object (as opposed to the latest version, the default).
    * @param {string=} params.ifGenerationMatch Makes the operation conditional on whether the object's current generation matches the given value.
    * @param {string=} params.ifGenerationNotMatch Makes the operation conditional on whether the object's current generation does not match the given value.
    * @param {string=} params.ifMetagenerationMatch Makes the operation conditional on whether the object's current metageneration matches the given value.
    * @param {string=} params.ifMetagenerationNotMatch Makes the operation conditional on whether the object's current metageneration does not match the given value.
    * @param {string} params.object Name of the object.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
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
    * storage.objects.get
    * @desc Retrieves objects or their associated metadata.
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
    *   const res = await storage.objects.get({
    *     // Name of the bucket in which the object resides.
    *     bucket: 'placeholder-value',
    *     // If present, selects a specific revision of this object (as opposed to the latest version, the default).
    *     generation: 'placeholder-value',
    *     // Makes the operation conditional on whether the object's generation matches the given value.
    *     ifGenerationMatch: 'placeholder-value',
    *     // Makes the operation conditional on whether the object's generation does not match the given value.
    *     ifGenerationNotMatch: 'placeholder-value',
    *     // Makes the operation conditional on whether the object's current metageneration matches the given value.
    *     ifMetagenerationMatch: 'placeholder-value',
    *     // Makes the operation conditional on whether the object's current metageneration does not match the given value.
    *     ifMetagenerationNotMatch: 'placeholder-value',
    *     // Name of the object.
    *     object: 'placeholder-value',
    *     // Set of properties to return. Defaults to noAcl.
    *     projection: 'placeholder-value',
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
    *   //   "etag": "my_etag",
    *   //   "generation": "my_generation",
    *   //   "id": "my_id",
    *   //   "kind": "my_kind",
    *   //   "md5Hash": "my_md5Hash",
    *   //   "mediaLink": "my_mediaLink",
    *   //   "metadata": {},
    *   //   "metageneration": "my_metageneration",
    *   //   "name": "my_name",
    *   //   "owner": {},
    *   //   "selfLink": "my_selfLink",
    *   //   "size": "my_size",
    *   //   "storageClass": "my_storageClass",
    *   //   "timeDeleted": "my_timeDeleted",
    *   //   "updated": "my_updated"
    *   // }
    * }
    *
    * main().catch(e => {
    *   console.error(e);
    *   throw e;
    * });
    *
    * @alias storage.objects.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.bucket Name of the bucket in which the object resides.
    * @param {string=} params.generation If present, selects a specific revision of this object (as opposed to the latest version, the default).
    * @param {string=} params.ifGenerationMatch Makes the operation conditional on whether the object's generation matches the given value.
    * @param {string=} params.ifGenerationNotMatch Makes the operation conditional on whether the object's generation does not match the given value.
    * @param {string=} params.ifMetagenerationMatch Makes the operation conditional on whether the object's current metageneration matches the given value.
    * @param {string=} params.ifMetagenerationNotMatch Makes the operation conditional on whether the object's current metageneration does not match the given value.
    * @param {string} params.object Name of the object.
    * @param {string=} params.projection Set of properties to return. Defaults to noAcl.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(params: ParamsResourceObjectsGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceObjectsGet,
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
    * storage.objects.insert
    * @desc Stores new data blobs and associated metadata.
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
    *   const res = await storage.objects.insert({
    *     // Name of the bucket in which to store the new object. Overrides the provided object metadata's bucket value, if any.
    *     bucket: 'placeholder-value',
    *     // Makes the operation conditional on whether the object's current generation matches the given value.
    *     ifGenerationMatch: 'placeholder-value',
    *     // Makes the operation conditional on whether the object's current generation does not match the given value.
    *     ifGenerationNotMatch: 'placeholder-value',
    *     // Makes the operation conditional on whether the object's current metageneration matches the given value.
    *     ifMetagenerationMatch: 'placeholder-value',
    *     // Makes the operation conditional on whether the object's current metageneration does not match the given value.
    *     ifMetagenerationNotMatch: 'placeholder-value',
    *     // Name of the object. Required when the object metadata is not otherwise provided. Overrides the object metadata's name value, if any.
    *     name: 'placeholder-value',
    *     // Set of properties to return. Defaults to noAcl, unless the object resource specifies the acl property, when it defaults to full.
    *     projection: 'placeholder-value',
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
    *       //   "etag": "my_etag",
    *       //   "generation": "my_generation",
    *       //   "id": "my_id",
    *       //   "kind": "my_kind",
    *       //   "md5Hash": "my_md5Hash",
    *       //   "mediaLink": "my_mediaLink",
    *       //   "metadata": {},
    *       //   "metageneration": "my_metageneration",
    *       //   "name": "my_name",
    *       //   "owner": {},
    *       //   "selfLink": "my_selfLink",
    *       //   "size": "my_size",
    *       //   "storageClass": "my_storageClass",
    *       //   "timeDeleted": "my_timeDeleted",
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
    *   //   "etag": "my_etag",
    *   //   "generation": "my_generation",
    *   //   "id": "my_id",
    *   //   "kind": "my_kind",
    *   //   "md5Hash": "my_md5Hash",
    *   //   "mediaLink": "my_mediaLink",
    *   //   "metadata": {},
    *   //   "metageneration": "my_metageneration",
    *   //   "name": "my_name",
    *   //   "owner": {},
    *   //   "selfLink": "my_selfLink",
    *   //   "size": "my_size",
    *   //   "storageClass": "my_storageClass",
    *   //   "timeDeleted": "my_timeDeleted",
    *   //   "updated": "my_updated"
    *   // }
    * }
    *
    * main().catch(e => {
    *   console.error(e);
    *   throw e;
    * });
    *
    * @alias storage.objects.insert
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.bucket Name of the bucket in which to store the new object. Overrides the provided object metadata's bucket value, if any.
    * @param {string=} params.ifGenerationMatch Makes the operation conditional on whether the object's current generation matches the given value.
    * @param {string=} params.ifGenerationNotMatch Makes the operation conditional on whether the object's current generation does not match the given value.
    * @param {string=} params.ifMetagenerationMatch Makes the operation conditional on whether the object's current metageneration matches the given value.
    * @param {string=} params.ifMetagenerationNotMatch Makes the operation conditional on whether the object's current metageneration does not match the given value.
    * @param {string=} params.name Name of the object. Required when the object metadata is not otherwise provided. Overrides the object metadata's name value, if any.
    * @param {string=} params.projection Set of properties to return. Defaults to noAcl, unless the object resource specifies the acl property, when it defaults to full.
    * @param  {object} params.requestBody Media resource metadata
    * @param {object} params.media Media object
    * @param {string} params.media.mimeType Media mime-type
    * @param {string|object} params.media.body Media body contents
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
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
    * storage.objects.list
    * @desc Retrieves a list of objects matching the criteria.
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
    *   const res = await storage.objects.list({
    *     // Name of the bucket in which to look for objects.
    *     bucket: 'placeholder-value',
    *     // Returns results in a directory-like mode. items will contain only objects whose names, aside from the prefix, do not contain delimiter. Objects whose names, aside from the prefix, contain delimiter will have their name, truncated after the delimiter, returned in prefixes. Duplicate prefixes are omitted.
    *     delimiter: 'placeholder-value',
    *     // Maximum number of items plus prefixes to return. As duplicate prefixes are omitted, fewer total results may be returned than requested.
    *     maxResults: 'placeholder-value',
    *     // A previously-returned page token representing part of the larger set of results to view.
    *     pageToken: 'placeholder-value',
    *     // Filter results to objects whose names begin with this prefix.
    *     prefix: 'placeholder-value',
    *     // Set of properties to return. Defaults to noAcl.
    *     projection: 'placeholder-value',
    *     // If true, lists all versions of a file as distinct results.
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
    * @alias storage.objects.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.bucket Name of the bucket in which to look for objects.
    * @param {string=} params.delimiter Returns results in a directory-like mode. items will contain only objects whose names, aside from the prefix, do not contain delimiter. Objects whose names, aside from the prefix, contain delimiter will have their name, truncated after the delimiter, returned in prefixes. Duplicate prefixes are omitted.
    * @param {integer=} params.maxResults Maximum number of items plus prefixes to return. As duplicate prefixes are omitted, fewer total results may be returned than requested.
    * @param {string=} params.pageToken A previously-returned page token representing part of the larger set of results to view.
    * @param {string=} params.prefix Filter results to objects whose names begin with this prefix.
    * @param {string=} params.projection Set of properties to return. Defaults to noAcl.
    * @param {boolean=} params.versions If true, lists all versions of a file as distinct results.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
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
    * storage.objects.patch
    * @desc Updates a data blob's associated metadata. This method supports patch semantics.
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
    *   const res = await storage.objects.patch({
    *     // Name of the bucket in which the object resides.
    *     bucket: 'placeholder-value',
    *     // If present, selects a specific revision of this object (as opposed to the latest version, the default).
    *     generation: 'placeholder-value',
    *     // Makes the operation conditional on whether the object's current generation matches the given value.
    *     ifGenerationMatch: 'placeholder-value',
    *     // Makes the operation conditional on whether the object's current generation does not match the given value.
    *     ifGenerationNotMatch: 'placeholder-value',
    *     // Makes the operation conditional on whether the object's current metageneration matches the given value.
    *     ifMetagenerationMatch: 'placeholder-value',
    *     // Makes the operation conditional on whether the object's current metageneration does not match the given value.
    *     ifMetagenerationNotMatch: 'placeholder-value',
    *     // Name of the object.
    *     object: 'placeholder-value',
    *     // Set of properties to return. Defaults to full.
    *     projection: 'placeholder-value',
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
    *       //   "etag": "my_etag",
    *       //   "generation": "my_generation",
    *       //   "id": "my_id",
    *       //   "kind": "my_kind",
    *       //   "md5Hash": "my_md5Hash",
    *       //   "mediaLink": "my_mediaLink",
    *       //   "metadata": {},
    *       //   "metageneration": "my_metageneration",
    *       //   "name": "my_name",
    *       //   "owner": {},
    *       //   "selfLink": "my_selfLink",
    *       //   "size": "my_size",
    *       //   "storageClass": "my_storageClass",
    *       //   "timeDeleted": "my_timeDeleted",
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
    *   //   "etag": "my_etag",
    *   //   "generation": "my_generation",
    *   //   "id": "my_id",
    *   //   "kind": "my_kind",
    *   //   "md5Hash": "my_md5Hash",
    *   //   "mediaLink": "my_mediaLink",
    *   //   "metadata": {},
    *   //   "metageneration": "my_metageneration",
    *   //   "name": "my_name",
    *   //   "owner": {},
    *   //   "selfLink": "my_selfLink",
    *   //   "size": "my_size",
    *   //   "storageClass": "my_storageClass",
    *   //   "timeDeleted": "my_timeDeleted",
    *   //   "updated": "my_updated"
    *   // }
    * }
    *
    * main().catch(e => {
    *   console.error(e);
    *   throw e;
    * });
    *
    * @alias storage.objects.patch
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.bucket Name of the bucket in which the object resides.
    * @param {string=} params.generation If present, selects a specific revision of this object (as opposed to the latest version, the default).
    * @param {string=} params.ifGenerationMatch Makes the operation conditional on whether the object's current generation matches the given value.
    * @param {string=} params.ifGenerationNotMatch Makes the operation conditional on whether the object's current generation does not match the given value.
    * @param {string=} params.ifMetagenerationMatch Makes the operation conditional on whether the object's current metageneration matches the given value.
    * @param {string=} params.ifMetagenerationNotMatch Makes the operation conditional on whether the object's current metageneration does not match the given value.
    * @param {string} params.object Name of the object.
    * @param {string=} params.projection Set of properties to return. Defaults to full.
    * @param {().Object} params.requestBody Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def patch(params: ParamsResourceObjectsPatch, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def patch(
    params: ParamsResourceObjectsPatch,
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
    * storage.objects.update
    * @desc Updates a data blob's associated metadata.
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
    *   const res = await storage.objects.update({
    *     // Name of the bucket in which the object resides.
    *     bucket: 'placeholder-value',
    *     // If present, selects a specific revision of this object (as opposed to the latest version, the default).
    *     generation: 'placeholder-value',
    *     // Makes the operation conditional on whether the object's current generation matches the given value.
    *     ifGenerationMatch: 'placeholder-value',
    *     // Makes the operation conditional on whether the object's current generation does not match the given value.
    *     ifGenerationNotMatch: 'placeholder-value',
    *     // Makes the operation conditional on whether the object's current metageneration matches the given value.
    *     ifMetagenerationMatch: 'placeholder-value',
    *     // Makes the operation conditional on whether the object's current metageneration does not match the given value.
    *     ifMetagenerationNotMatch: 'placeholder-value',
    *     // Name of the object.
    *     object: 'placeholder-value',
    *     // Set of properties to return. Defaults to full.
    *     projection: 'placeholder-value',
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
    *       //   "etag": "my_etag",
    *       //   "generation": "my_generation",
    *       //   "id": "my_id",
    *       //   "kind": "my_kind",
    *       //   "md5Hash": "my_md5Hash",
    *       //   "mediaLink": "my_mediaLink",
    *       //   "metadata": {},
    *       //   "metageneration": "my_metageneration",
    *       //   "name": "my_name",
    *       //   "owner": {},
    *       //   "selfLink": "my_selfLink",
    *       //   "size": "my_size",
    *       //   "storageClass": "my_storageClass",
    *       //   "timeDeleted": "my_timeDeleted",
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
    *   //   "etag": "my_etag",
    *   //   "generation": "my_generation",
    *   //   "id": "my_id",
    *   //   "kind": "my_kind",
    *   //   "md5Hash": "my_md5Hash",
    *   //   "mediaLink": "my_mediaLink",
    *   //   "metadata": {},
    *   //   "metageneration": "my_metageneration",
    *   //   "name": "my_name",
    *   //   "owner": {},
    *   //   "selfLink": "my_selfLink",
    *   //   "size": "my_size",
    *   //   "storageClass": "my_storageClass",
    *   //   "timeDeleted": "my_timeDeleted",
    *   //   "updated": "my_updated"
    *   // }
    * }
    *
    * main().catch(e => {
    *   console.error(e);
    *   throw e;
    * });
    *
    * @alias storage.objects.update
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.bucket Name of the bucket in which the object resides.
    * @param {string=} params.generation If present, selects a specific revision of this object (as opposed to the latest version, the default).
    * @param {string=} params.ifGenerationMatch Makes the operation conditional on whether the object's current generation matches the given value.
    * @param {string=} params.ifGenerationNotMatch Makes the operation conditional on whether the object's current generation does not match the given value.
    * @param {string=} params.ifMetagenerationMatch Makes the operation conditional on whether the object's current metageneration matches the given value.
    * @param {string=} params.ifMetagenerationNotMatch Makes the operation conditional on whether the object's current metageneration does not match the given value.
    * @param {string} params.object Name of the object.
    * @param {string=} params.projection Set of properties to return. Defaults to full.
    * @param {().Object} params.requestBody Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
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
    * storage.objects.watchAll
    * @desc Watch for changes on all objects in a bucket.
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
    *   const res = await storage.objects.watchAll({
    *     // Name of the bucket in which to look for objects.
    *     bucket: 'placeholder-value',
    *     // Returns results in a directory-like mode. items will contain only objects whose names, aside from the prefix, do not contain delimiter. Objects whose names, aside from the prefix, contain delimiter will have their name, truncated after the delimiter, returned in prefixes. Duplicate prefixes are omitted.
    *     delimiter: 'placeholder-value',
    *     // Maximum number of items plus prefixes to return. As duplicate prefixes are omitted, fewer total results may be returned than requested.
    *     maxResults: 'placeholder-value',
    *     // A previously-returned page token representing part of the larger set of results to view.
    *     pageToken: 'placeholder-value',
    *     // Filter results to objects whose names begin with this prefix.
    *     prefix: 'placeholder-value',
    *     // Set of properties to return. Defaults to noAcl.
    *     projection: 'placeholder-value',
    *     // If true, lists all versions of a file as distinct results.
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
    * @alias storage.objects.watchAll
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.bucket Name of the bucket in which to look for objects.
    * @param {string=} params.delimiter Returns results in a directory-like mode. items will contain only objects whose names, aside from the prefix, do not contain delimiter. Objects whose names, aside from the prefix, contain delimiter will have their name, truncated after the delimiter, returned in prefixes. Duplicate prefixes are omitted.
    * @param {integer=} params.maxResults Maximum number of items plus prefixes to return. As duplicate prefixes are omitted, fewer total results may be returned than requested.
    * @param {string=} params.pageToken A previously-returned page token representing part of the larger set of results to view.
    * @param {string=} params.prefix Filter results to objects whose names begin with this prefix.
    * @param {string=} params.projection Set of properties to return. Defaults to noAcl.
    * @param {boolean=} params.versions If true, lists all versions of a file as distinct results.
    * @param {().Channel} params.requestBody Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def watchAll(params: ParamsResourceObjectsWatchall, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def watchAll(
    params: ParamsResourceObjectsWatchall,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
