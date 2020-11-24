package typings.googleapis.storageV1beta1Mod.storageV1beta1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/storage/v1beta1", "storage_v1beta1.Resource$Bucketaccesscontrols")
@js.native
class ResourceBucketaccesscontrols protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  /**
    * storage.bucketAccessControls.delete
    * @desc Deletes the ACL entry for the specified entity on the specified
    * bucket.
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
  def delete(): GaxiosPromise[Unit] = js.native
  def delete(callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceBucketaccesscontrolsDelete): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceBucketaccesscontrolsDelete, callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(
    params: ParamsResourceBucketaccesscontrolsDelete,
    options: BodyResponseCallback[Unit],
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def delete(params: ParamsResourceBucketaccesscontrolsDelete, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(
    params: ParamsResourceBucketaccesscontrolsDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  
  /**
    * storage.bucketAccessControls.get
    * @desc Returns the ACL entry for the specified entity on the specified
    * bucket.
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
  def get(): GaxiosPromise[SchemaBucketAccessControl] = js.native
  def get(callback: BodyResponseCallback[SchemaBucketAccessControl]): Unit = js.native
  def get(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaBucketAccessControl] = js.native
  def get(params: ParamsResourceBucketaccesscontrolsGet): GaxiosPromise[SchemaBucketAccessControl] = js.native
  def get(
    params: ParamsResourceBucketaccesscontrolsGet,
    callback: BodyResponseCallback[SchemaBucketAccessControl]
  ): Unit = js.native
  def get(
    params: ParamsResourceBucketaccesscontrolsGet,
    options: BodyResponseCallback[SchemaBucketAccessControl],
    callback: BodyResponseCallback[SchemaBucketAccessControl]
  ): Unit = js.native
  def get(params: ParamsResourceBucketaccesscontrolsGet, options: MethodOptions): GaxiosPromise[SchemaBucketAccessControl] = js.native
  def get(
    params: ParamsResourceBucketaccesscontrolsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaBucketAccessControl]
  ): Unit = js.native
  
  /**
    * storage.bucketAccessControls.insert
    * @desc Creates a new ACL entry on the specified bucket.
    * @alias storage.bucketAccessControls.insert
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.bucket Name of a bucket.
    * @param {().BucketAccessControl} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def insert(): GaxiosPromise[SchemaBucketAccessControl] = js.native
  def insert(callback: BodyResponseCallback[SchemaBucketAccessControl]): Unit = js.native
  def insert(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaBucketAccessControl] = js.native
  def insert(params: ParamsResourceBucketaccesscontrolsInsert): GaxiosPromise[SchemaBucketAccessControl] = js.native
  def insert(
    params: ParamsResourceBucketaccesscontrolsInsert,
    callback: BodyResponseCallback[SchemaBucketAccessControl]
  ): Unit = js.native
  def insert(
    params: ParamsResourceBucketaccesscontrolsInsert,
    options: BodyResponseCallback[SchemaBucketAccessControl],
    callback: BodyResponseCallback[SchemaBucketAccessControl]
  ): Unit = js.native
  def insert(params: ParamsResourceBucketaccesscontrolsInsert, options: MethodOptions): GaxiosPromise[SchemaBucketAccessControl] = js.native
  def insert(
    params: ParamsResourceBucketaccesscontrolsInsert,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaBucketAccessControl]
  ): Unit = js.native
  
  /**
    * storage.bucketAccessControls.list
    * @desc Retrieves ACL entries on the specified bucket.
    * @alias storage.bucketAccessControls.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.bucket Name of a bucket.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaBucketAccessControls] = js.native
  def list(callback: BodyResponseCallback[SchemaBucketAccessControls]): Unit = js.native
  def list(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaBucketAccessControls] = js.native
  def list(params: ParamsResourceBucketaccesscontrolsList): GaxiosPromise[SchemaBucketAccessControls] = js.native
  def list(
    params: ParamsResourceBucketaccesscontrolsList,
    callback: BodyResponseCallback[SchemaBucketAccessControls]
  ): Unit = js.native
  def list(
    params: ParamsResourceBucketaccesscontrolsList,
    options: BodyResponseCallback[SchemaBucketAccessControls],
    callback: BodyResponseCallback[SchemaBucketAccessControls]
  ): Unit = js.native
  def list(params: ParamsResourceBucketaccesscontrolsList, options: MethodOptions): GaxiosPromise[SchemaBucketAccessControls] = js.native
  def list(
    params: ParamsResourceBucketaccesscontrolsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaBucketAccessControls]
  ): Unit = js.native
  
  /**
    * storage.bucketAccessControls.patch
    * @desc Updates an ACL entry on the specified bucket. This method supports
    * patch semantics.
    * @alias storage.bucketAccessControls.patch
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.bucket Name of a bucket.
    * @param {string} params.entity The entity holding the permission. Can be user-userId, user-emailAddress, group-groupId, group-emailAddress, allUsers, or allAuthenticatedUsers.
    * @param {().BucketAccessControl} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def patch(): GaxiosPromise[SchemaBucketAccessControl] = js.native
  def patch(callback: BodyResponseCallback[SchemaBucketAccessControl]): Unit = js.native
  def patch(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaBucketAccessControl] = js.native
  def patch(params: ParamsResourceBucketaccesscontrolsPatch): GaxiosPromise[SchemaBucketAccessControl] = js.native
  def patch(
    params: ParamsResourceBucketaccesscontrolsPatch,
    callback: BodyResponseCallback[SchemaBucketAccessControl]
  ): Unit = js.native
  def patch(
    params: ParamsResourceBucketaccesscontrolsPatch,
    options: BodyResponseCallback[SchemaBucketAccessControl],
    callback: BodyResponseCallback[SchemaBucketAccessControl]
  ): Unit = js.native
  def patch(params: ParamsResourceBucketaccesscontrolsPatch, options: MethodOptions): GaxiosPromise[SchemaBucketAccessControl] = js.native
  def patch(
    params: ParamsResourceBucketaccesscontrolsPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaBucketAccessControl]
  ): Unit = js.native
  
  /**
    * storage.bucketAccessControls.update
    * @desc Updates an ACL entry on the specified bucket.
    * @alias storage.bucketAccessControls.update
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.bucket Name of a bucket.
    * @param {string} params.entity The entity holding the permission. Can be user-userId, user-emailAddress, group-groupId, group-emailAddress, allUsers, or allAuthenticatedUsers.
    * @param {().BucketAccessControl} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def update(): GaxiosPromise[SchemaBucketAccessControl] = js.native
  def update(callback: BodyResponseCallback[SchemaBucketAccessControl]): Unit = js.native
  def update(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaBucketAccessControl] = js.native
  def update(params: ParamsResourceBucketaccesscontrolsUpdate): GaxiosPromise[SchemaBucketAccessControl] = js.native
  def update(
    params: ParamsResourceBucketaccesscontrolsUpdate,
    callback: BodyResponseCallback[SchemaBucketAccessControl]
  ): Unit = js.native
  def update(
    params: ParamsResourceBucketaccesscontrolsUpdate,
    options: BodyResponseCallback[SchemaBucketAccessControl],
    callback: BodyResponseCallback[SchemaBucketAccessControl]
  ): Unit = js.native
  def update(params: ParamsResourceBucketaccesscontrolsUpdate, options: MethodOptions): GaxiosPromise[SchemaBucketAccessControl] = js.native
  def update(
    params: ParamsResourceBucketaccesscontrolsUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaBucketAccessControl]
  ): Unit = js.native
}
