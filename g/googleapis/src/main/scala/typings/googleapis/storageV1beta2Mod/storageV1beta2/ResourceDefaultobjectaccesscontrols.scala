package typings.googleapis.storageV1beta2Mod.storageV1beta2

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/storage/v1beta2", "storage_v1beta2.Resource$Defaultobjectaccesscontrols")
@js.native
class ResourceDefaultobjectaccesscontrols protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * storage.defaultObjectAccessControls.delete
    * @desc Permanently deletes the default object ACL entry for the specified
    * entity on the specified bucket.
    * @alias storage.defaultObjectAccessControls.delete
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
  def delete(params: ParamsResourceDefaultobjectaccesscontrolsDelete): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceDefaultobjectaccesscontrolsDelete, callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(
    params: ParamsResourceDefaultobjectaccesscontrolsDelete,
    options: BodyResponseCallback[Unit],
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def delete(params: ParamsResourceDefaultobjectaccesscontrolsDelete, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(
    params: ParamsResourceDefaultobjectaccesscontrolsDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  /**
    * storage.defaultObjectAccessControls.get
    * @desc Returns the default object ACL entry for the specified entity on
    * the specified bucket.
    * @alias storage.defaultObjectAccessControls.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.bucket Name of a bucket.
    * @param {string} params.entity The entity holding the permission. Can be user-userId, user-emailAddress, group-groupId, group-emailAddress, allUsers, or allAuthenticatedUsers.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaObjectAccessControl] = js.native
  def get(callback: BodyResponseCallback[SchemaObjectAccessControl]): Unit = js.native
  def get(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaObjectAccessControl] = js.native
  def get(params: ParamsResourceDefaultobjectaccesscontrolsGet): GaxiosPromise[SchemaObjectAccessControl] = js.native
  def get(
    params: ParamsResourceDefaultobjectaccesscontrolsGet,
    callback: BodyResponseCallback[SchemaObjectAccessControl]
  ): Unit = js.native
  def get(
    params: ParamsResourceDefaultobjectaccesscontrolsGet,
    options: BodyResponseCallback[SchemaObjectAccessControl],
    callback: BodyResponseCallback[SchemaObjectAccessControl]
  ): Unit = js.native
  def get(params: ParamsResourceDefaultobjectaccesscontrolsGet, options: MethodOptions): GaxiosPromise[SchemaObjectAccessControl] = js.native
  def get(
    params: ParamsResourceDefaultobjectaccesscontrolsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaObjectAccessControl]
  ): Unit = js.native
  /**
    * storage.defaultObjectAccessControls.insert
    * @desc Creates a new default object ACL entry on the specified bucket.
    * @alias storage.defaultObjectAccessControls.insert
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.bucket Name of a bucket.
    * @param {().ObjectAccessControl} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def insert(): GaxiosPromise[SchemaObjectAccessControl] = js.native
  def insert(callback: BodyResponseCallback[SchemaObjectAccessControl]): Unit = js.native
  def insert(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaObjectAccessControl] = js.native
  def insert(params: ParamsResourceDefaultobjectaccesscontrolsInsert): GaxiosPromise[SchemaObjectAccessControl] = js.native
  def insert(
    params: ParamsResourceDefaultobjectaccesscontrolsInsert,
    callback: BodyResponseCallback[SchemaObjectAccessControl]
  ): Unit = js.native
  def insert(
    params: ParamsResourceDefaultobjectaccesscontrolsInsert,
    options: BodyResponseCallback[SchemaObjectAccessControl],
    callback: BodyResponseCallback[SchemaObjectAccessControl]
  ): Unit = js.native
  def insert(params: ParamsResourceDefaultobjectaccesscontrolsInsert, options: MethodOptions): GaxiosPromise[SchemaObjectAccessControl] = js.native
  def insert(
    params: ParamsResourceDefaultobjectaccesscontrolsInsert,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaObjectAccessControl]
  ): Unit = js.native
  /**
    * storage.defaultObjectAccessControls.list
    * @desc Retrieves default object ACL entries on the specified bucket.
    * @alias storage.defaultObjectAccessControls.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.bucket Name of a bucket.
    * @param {string=} params.ifMetagenerationMatch If present, only return default ACL listing if the bucket's current metageneration matches this value.
    * @param {string=} params.ifMetagenerationNotMatch If present, only return default ACL listing if the bucket's current metageneration does not match the given value.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaObjectAccessControls] = js.native
  def list(callback: BodyResponseCallback[SchemaObjectAccessControls]): Unit = js.native
  def list(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaObjectAccessControls] = js.native
  def list(params: ParamsResourceDefaultobjectaccesscontrolsList): GaxiosPromise[SchemaObjectAccessControls] = js.native
  def list(
    params: ParamsResourceDefaultobjectaccesscontrolsList,
    callback: BodyResponseCallback[SchemaObjectAccessControls]
  ): Unit = js.native
  def list(
    params: ParamsResourceDefaultobjectaccesscontrolsList,
    options: BodyResponseCallback[SchemaObjectAccessControls],
    callback: BodyResponseCallback[SchemaObjectAccessControls]
  ): Unit = js.native
  def list(params: ParamsResourceDefaultobjectaccesscontrolsList, options: MethodOptions): GaxiosPromise[SchemaObjectAccessControls] = js.native
  def list(
    params: ParamsResourceDefaultobjectaccesscontrolsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaObjectAccessControls]
  ): Unit = js.native
  /**
    * storage.defaultObjectAccessControls.patch
    * @desc Updates a default object ACL entry on the specified bucket. This
    * method supports patch semantics.
    * @alias storage.defaultObjectAccessControls.patch
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.bucket Name of a bucket.
    * @param {string} params.entity The entity holding the permission. Can be user-userId, user-emailAddress, group-groupId, group-emailAddress, allUsers, or allAuthenticatedUsers.
    * @param {().ObjectAccessControl} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def patch(): GaxiosPromise[SchemaObjectAccessControl] = js.native
  def patch(callback: BodyResponseCallback[SchemaObjectAccessControl]): Unit = js.native
  def patch(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaObjectAccessControl] = js.native
  def patch(params: ParamsResourceDefaultobjectaccesscontrolsPatch): GaxiosPromise[SchemaObjectAccessControl] = js.native
  def patch(
    params: ParamsResourceDefaultobjectaccesscontrolsPatch,
    callback: BodyResponseCallback[SchemaObjectAccessControl]
  ): Unit = js.native
  def patch(
    params: ParamsResourceDefaultobjectaccesscontrolsPatch,
    options: BodyResponseCallback[SchemaObjectAccessControl],
    callback: BodyResponseCallback[SchemaObjectAccessControl]
  ): Unit = js.native
  def patch(params: ParamsResourceDefaultobjectaccesscontrolsPatch, options: MethodOptions): GaxiosPromise[SchemaObjectAccessControl] = js.native
  def patch(
    params: ParamsResourceDefaultobjectaccesscontrolsPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaObjectAccessControl]
  ): Unit = js.native
  /**
    * storage.defaultObjectAccessControls.update
    * @desc Updates a default object ACL entry on the specified bucket.
    * @alias storage.defaultObjectAccessControls.update
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.bucket Name of a bucket.
    * @param {string} params.entity The entity holding the permission. Can be user-userId, user-emailAddress, group-groupId, group-emailAddress, allUsers, or allAuthenticatedUsers.
    * @param {().ObjectAccessControl} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def update(): GaxiosPromise[SchemaObjectAccessControl] = js.native
  def update(callback: BodyResponseCallback[SchemaObjectAccessControl]): Unit = js.native
  def update(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaObjectAccessControl] = js.native
  def update(params: ParamsResourceDefaultobjectaccesscontrolsUpdate): GaxiosPromise[SchemaObjectAccessControl] = js.native
  def update(
    params: ParamsResourceDefaultobjectaccesscontrolsUpdate,
    callback: BodyResponseCallback[SchemaObjectAccessControl]
  ): Unit = js.native
  def update(
    params: ParamsResourceDefaultobjectaccesscontrolsUpdate,
    options: BodyResponseCallback[SchemaObjectAccessControl],
    callback: BodyResponseCallback[SchemaObjectAccessControl]
  ): Unit = js.native
  def update(params: ParamsResourceDefaultobjectaccesscontrolsUpdate, options: MethodOptions): GaxiosPromise[SchemaObjectAccessControl] = js.native
  def update(
    params: ParamsResourceDefaultobjectaccesscontrolsUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaObjectAccessControl]
  ): Unit = js.native
}

