package typings.googleapis.storageV1beta2Mod.storageV1beta2

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/storage/v1beta2", "storage_v1beta2.Resource$Objects")
@js.native
class ResourceObjects protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  
  /**
    * storage.objects.compose
    * @desc Concatenates a list of existing objects into a new object in the
    * same bucket.
    * @alias storage.objects.compose
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.destinationBucket Name of the bucket containing the source objects. The destination object is stored in this bucket.
    * @param {string} params.destinationObject Name of the new object.
    * @param {string=} params.ifGenerationMatch Makes the operation conditional on whether the object's current generation matches the given value.
    * @param {string=} params.ifMetagenerationMatch Makes the operation conditional on whether the object's current metageneration matches the given value.
    * @param {().ComposeRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def compose(): GaxiosPromise[SchemaObject] = js.native
  def compose(callback: BodyResponseCallback[SchemaObject]): Unit = js.native
  def compose(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaObject] = js.native
  def compose(params: ParamsResourceObjectsCompose): GaxiosPromise[SchemaObject] = js.native
  def compose(params: ParamsResourceObjectsCompose, callback: BodyResponseCallback[SchemaObject]): Unit = js.native
  def compose(
    params: ParamsResourceObjectsCompose,
    options: BodyResponseCallback[SchemaObject],
    callback: BodyResponseCallback[SchemaObject]
  ): Unit = js.native
  def compose(params: ParamsResourceObjectsCompose, options: MethodOptions): GaxiosPromise[SchemaObject] = js.native
  def compose(
    params: ParamsResourceObjectsCompose,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaObject]
  ): Unit = js.native
  
  var context: APIRequestContext = js.native
  
  /**
    * storage.objects.copy
    * @desc Copies an object to a destination in the same location. Optionally
    * overrides metadata.
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
    * @param {().Object} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def copy(): GaxiosPromise[SchemaObject] = js.native
  def copy(callback: BodyResponseCallback[SchemaObject]): Unit = js.native
  def copy(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaObject] = js.native
  def copy(params: ParamsResourceObjectsCopy): GaxiosPromise[SchemaObject] = js.native
  def copy(params: ParamsResourceObjectsCopy, callback: BodyResponseCallback[SchemaObject]): Unit = js.native
  def copy(
    params: ParamsResourceObjectsCopy,
    options: BodyResponseCallback[SchemaObject],
    callback: BodyResponseCallback[SchemaObject]
  ): Unit = js.native
  def copy(params: ParamsResourceObjectsCopy, options: MethodOptions): GaxiosPromise[SchemaObject] = js.native
  def copy(
    params: ParamsResourceObjectsCopy,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaObject]
  ): Unit = js.native
  
  /**
    * storage.objects.delete
    * @desc Deletes data blobs and associated metadata. Deletions are permanent
    * if versioning is not enabled for the bucket, or if the generation
    * parameter is used.
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
  def delete(): GaxiosPromise[Unit] = js.native
  def delete(callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceObjectsDelete): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceObjectsDelete, callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(
    params: ParamsResourceObjectsDelete,
    options: BodyResponseCallback[Unit],
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def delete(params: ParamsResourceObjectsDelete, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceObjectsDelete, options: MethodOptions, callback: BodyResponseCallback[Unit]): Unit = js.native
  
  /**
    * storage.objects.get
    * @desc Retrieves objects or their associated metadata.
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
  def get(): GaxiosPromise[SchemaObject] = js.native
  def get(callback: BodyResponseCallback[SchemaObject]): Unit = js.native
  def get(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaObject] = js.native
  def get(params: ParamsResourceObjectsGet): GaxiosPromise[SchemaObject] = js.native
  def get(params: ParamsResourceObjectsGet, callback: BodyResponseCallback[SchemaObject]): Unit = js.native
  def get(
    params: ParamsResourceObjectsGet,
    options: BodyResponseCallback[SchemaObject],
    callback: BodyResponseCallback[SchemaObject]
  ): Unit = js.native
  def get(params: ParamsResourceObjectsGet, options: MethodOptions): GaxiosPromise[SchemaObject] = js.native
  def get(
    params: ParamsResourceObjectsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaObject]
  ): Unit = js.native
  
  /**
    * storage.objects.insert
    * @desc Stores new data blobs and associated metadata.
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
    * @param  {object} params.resource Media resource metadata
    * @param {object} params.media Media object
    * @param {string} params.media.mimeType Media mime-type
    * @param {string|object} params.media.body Media body contents
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def insert(): GaxiosPromise[SchemaObject] = js.native
  def insert(callback: BodyResponseCallback[SchemaObject]): Unit = js.native
  def insert(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaObject] = js.native
  def insert(params: ParamsResourceObjectsInsert): GaxiosPromise[SchemaObject] = js.native
  def insert(params: ParamsResourceObjectsInsert, callback: BodyResponseCallback[SchemaObject]): Unit = js.native
  def insert(
    params: ParamsResourceObjectsInsert,
    options: BodyResponseCallback[SchemaObject],
    callback: BodyResponseCallback[SchemaObject]
  ): Unit = js.native
  def insert(params: ParamsResourceObjectsInsert, options: MethodOptions): GaxiosPromise[SchemaObject] = js.native
  def insert(
    params: ParamsResourceObjectsInsert,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaObject]
  ): Unit = js.native
  
  /**
    * storage.objects.list
    * @desc Retrieves a list of objects matching the criteria.
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
  def list(): GaxiosPromise[SchemaObjects] = js.native
  def list(callback: BodyResponseCallback[SchemaObjects]): Unit = js.native
  def list(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaObjects] = js.native
  def list(params: ParamsResourceObjectsList): GaxiosPromise[SchemaObjects] = js.native
  def list(params: ParamsResourceObjectsList, callback: BodyResponseCallback[SchemaObjects]): Unit = js.native
  def list(
    params: ParamsResourceObjectsList,
    options: BodyResponseCallback[SchemaObjects],
    callback: BodyResponseCallback[SchemaObjects]
  ): Unit = js.native
  def list(params: ParamsResourceObjectsList, options: MethodOptions): GaxiosPromise[SchemaObjects] = js.native
  def list(
    params: ParamsResourceObjectsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaObjects]
  ): Unit = js.native
  
  /**
    * storage.objects.patch
    * @desc Updates a data blob's associated metadata. This method supports
    * patch semantics.
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
    * @param {().Object} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def patch(): GaxiosPromise[SchemaObject] = js.native
  def patch(callback: BodyResponseCallback[SchemaObject]): Unit = js.native
  def patch(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaObject] = js.native
  def patch(params: ParamsResourceObjectsPatch): GaxiosPromise[SchemaObject] = js.native
  def patch(params: ParamsResourceObjectsPatch, callback: BodyResponseCallback[SchemaObject]): Unit = js.native
  def patch(
    params: ParamsResourceObjectsPatch,
    options: BodyResponseCallback[SchemaObject],
    callback: BodyResponseCallback[SchemaObject]
  ): Unit = js.native
  def patch(params: ParamsResourceObjectsPatch, options: MethodOptions): GaxiosPromise[SchemaObject] = js.native
  def patch(
    params: ParamsResourceObjectsPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaObject]
  ): Unit = js.native
  
  /**
    * storage.objects.update
    * @desc Updates a data blob's associated metadata.
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
    * @param {().Object} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def update(): GaxiosPromise[SchemaObject] = js.native
  def update(callback: BodyResponseCallback[SchemaObject]): Unit = js.native
  def update(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaObject] = js.native
  def update(params: ParamsResourceObjectsUpdate): GaxiosPromise[SchemaObject] = js.native
  def update(params: ParamsResourceObjectsUpdate, callback: BodyResponseCallback[SchemaObject]): Unit = js.native
  def update(
    params: ParamsResourceObjectsUpdate,
    options: BodyResponseCallback[SchemaObject],
    callback: BodyResponseCallback[SchemaObject]
  ): Unit = js.native
  def update(params: ParamsResourceObjectsUpdate, options: MethodOptions): GaxiosPromise[SchemaObject] = js.native
  def update(
    params: ParamsResourceObjectsUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaObject]
  ): Unit = js.native
  
  /**
    * storage.objects.watchAll
    * @desc Watch for changes on all objects in a bucket.
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
    * @param {().Channel} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def watchAll(): GaxiosPromise[SchemaChannel] = js.native
  def watchAll(callback: BodyResponseCallback[SchemaChannel]): Unit = js.native
  def watchAll(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaChannel] = js.native
  def watchAll(params: ParamsResourceObjectsWatchall): GaxiosPromise[SchemaChannel] = js.native
  def watchAll(params: ParamsResourceObjectsWatchall, callback: BodyResponseCallback[SchemaChannel]): Unit = js.native
  def watchAll(
    params: ParamsResourceObjectsWatchall,
    options: BodyResponseCallback[SchemaChannel],
    callback: BodyResponseCallback[SchemaChannel]
  ): Unit = js.native
  def watchAll(params: ParamsResourceObjectsWatchall, options: MethodOptions): GaxiosPromise[SchemaChannel] = js.native
  def watchAll(
    params: ParamsResourceObjectsWatchall,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaChannel]
  ): Unit = js.native
}
