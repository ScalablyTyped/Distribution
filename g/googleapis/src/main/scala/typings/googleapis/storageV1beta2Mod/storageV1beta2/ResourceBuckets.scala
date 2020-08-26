package typings.googleapis.storageV1beta2Mod.storageV1beta2

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/storage/v1beta2", "storage_v1beta2.Resource$Buckets")
@js.native
class ResourceBuckets protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * storage.buckets.delete
    * @desc Permanently deletes an empty bucket.
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
  def delete(): GaxiosPromise[Unit] = js.native
  def delete(callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceBucketsDelete): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceBucketsDelete, callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(
    params: ParamsResourceBucketsDelete,
    options: BodyResponseCallback[Unit],
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def delete(params: ParamsResourceBucketsDelete, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceBucketsDelete, options: MethodOptions, callback: BodyResponseCallback[Unit]): Unit = js.native
  /**
    * storage.buckets.get
    * @desc Returns metadata for the specified bucket.
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
  def get(): GaxiosPromise[SchemaBucket] = js.native
  def get(callback: BodyResponseCallback[SchemaBucket]): Unit = js.native
  def get(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaBucket] = js.native
  def get(params: ParamsResourceBucketsGet): GaxiosPromise[SchemaBucket] = js.native
  def get(params: ParamsResourceBucketsGet, callback: BodyResponseCallback[SchemaBucket]): Unit = js.native
  def get(
    params: ParamsResourceBucketsGet,
    options: BodyResponseCallback[SchemaBucket],
    callback: BodyResponseCallback[SchemaBucket]
  ): Unit = js.native
  def get(params: ParamsResourceBucketsGet, options: MethodOptions): GaxiosPromise[SchemaBucket] = js.native
  def get(
    params: ParamsResourceBucketsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaBucket]
  ): Unit = js.native
  /**
    * storage.buckets.insert
    * @desc Creates a new bucket.
    * @alias storage.buckets.insert
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.project A valid API project identifier.
    * @param {string=} params.projection Set of properties to return. Defaults to noAcl, unless the bucket resource specifies acl or defaultObjectAcl properties, when it defaults to full.
    * @param {().Bucket} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def insert(): GaxiosPromise[SchemaBucket] = js.native
  def insert(callback: BodyResponseCallback[SchemaBucket]): Unit = js.native
  def insert(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaBucket] = js.native
  def insert(params: ParamsResourceBucketsInsert): GaxiosPromise[SchemaBucket] = js.native
  def insert(params: ParamsResourceBucketsInsert, callback: BodyResponseCallback[SchemaBucket]): Unit = js.native
  def insert(
    params: ParamsResourceBucketsInsert,
    options: BodyResponseCallback[SchemaBucket],
    callback: BodyResponseCallback[SchemaBucket]
  ): Unit = js.native
  def insert(params: ParamsResourceBucketsInsert, options: MethodOptions): GaxiosPromise[SchemaBucket] = js.native
  def insert(
    params: ParamsResourceBucketsInsert,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaBucket]
  ): Unit = js.native
  /**
    * storage.buckets.list
    * @desc Retrieves a list of buckets for a given project.
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
  def list(): GaxiosPromise[SchemaBuckets] = js.native
  def list(callback: BodyResponseCallback[SchemaBuckets]): Unit = js.native
  def list(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaBuckets] = js.native
  def list(params: ParamsResourceBucketsList): GaxiosPromise[SchemaBuckets] = js.native
  def list(params: ParamsResourceBucketsList, callback: BodyResponseCallback[SchemaBuckets]): Unit = js.native
  def list(
    params: ParamsResourceBucketsList,
    options: BodyResponseCallback[SchemaBuckets],
    callback: BodyResponseCallback[SchemaBuckets]
  ): Unit = js.native
  def list(params: ParamsResourceBucketsList, options: MethodOptions): GaxiosPromise[SchemaBuckets] = js.native
  def list(
    params: ParamsResourceBucketsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaBuckets]
  ): Unit = js.native
  /**
    * storage.buckets.patch
    * @desc Updates a bucket. This method supports patch semantics.
    * @alias storage.buckets.patch
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.bucket Name of a bucket.
    * @param {string=} params.ifMetagenerationMatch Makes the return of the bucket metadata conditional on whether the bucket's current metageneration matches the given value.
    * @param {string=} params.ifMetagenerationNotMatch Makes the return of the bucket metadata conditional on whether the bucket's current metageneration does not match the given value.
    * @param {string=} params.projection Set of properties to return. Defaults to full.
    * @param {().Bucket} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def patch(): GaxiosPromise[SchemaBucket] = js.native
  def patch(callback: BodyResponseCallback[SchemaBucket]): Unit = js.native
  def patch(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaBucket] = js.native
  def patch(params: ParamsResourceBucketsPatch): GaxiosPromise[SchemaBucket] = js.native
  def patch(params: ParamsResourceBucketsPatch, callback: BodyResponseCallback[SchemaBucket]): Unit = js.native
  def patch(
    params: ParamsResourceBucketsPatch,
    options: BodyResponseCallback[SchemaBucket],
    callback: BodyResponseCallback[SchemaBucket]
  ): Unit = js.native
  def patch(params: ParamsResourceBucketsPatch, options: MethodOptions): GaxiosPromise[SchemaBucket] = js.native
  def patch(
    params: ParamsResourceBucketsPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaBucket]
  ): Unit = js.native
  /**
    * storage.buckets.update
    * @desc Updates a bucket.
    * @alias storage.buckets.update
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.bucket Name of a bucket.
    * @param {string=} params.ifMetagenerationMatch Makes the return of the bucket metadata conditional on whether the bucket's current metageneration matches the given value.
    * @param {string=} params.ifMetagenerationNotMatch Makes the return of the bucket metadata conditional on whether the bucket's current metageneration does not match the given value.
    * @param {string=} params.projection Set of properties to return. Defaults to full.
    * @param {().Bucket} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def update(): GaxiosPromise[SchemaBucket] = js.native
  def update(callback: BodyResponseCallback[SchemaBucket]): Unit = js.native
  def update(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaBucket] = js.native
  def update(params: ParamsResourceBucketsUpdate): GaxiosPromise[SchemaBucket] = js.native
  def update(params: ParamsResourceBucketsUpdate, callback: BodyResponseCallback[SchemaBucket]): Unit = js.native
  def update(
    params: ParamsResourceBucketsUpdate,
    options: BodyResponseCallback[SchemaBucket],
    callback: BodyResponseCallback[SchemaBucket]
  ): Unit = js.native
  def update(params: ParamsResourceBucketsUpdate, options: MethodOptions): GaxiosPromise[SchemaBucket] = js.native
  def update(
    params: ParamsResourceBucketsUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaBucket]
  ): Unit = js.native
}

