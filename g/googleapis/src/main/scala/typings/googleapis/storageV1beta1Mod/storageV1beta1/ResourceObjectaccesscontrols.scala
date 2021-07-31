package typings.googleapis.storageV1beta1Mod.storageV1beta1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/storage/v1beta1", "storage_v1beta1.Resource$Objectaccesscontrols")
@js.native
class ResourceObjectaccesscontrols protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  /**
    * storage.objectAccessControls.delete
    * @desc Deletes the ACL entry for the specified entity on the specified
    * object.
    * @alias storage.objectAccessControls.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.bucket Name of a bucket.
    * @param {string} params.entity The entity holding the permission. Can be user-userId, user-emailAddress, group-groupId, group-emailAddress, allUsers, or allAuthenticatedUsers.
    * @param {string} params.object Name of the object.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[Unit] = js.native
  def delete(callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceObjectaccesscontrolsDelete): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceObjectaccesscontrolsDelete, callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(
    params: ParamsResourceObjectaccesscontrolsDelete,
    options: BodyResponseCallback[Unit],
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def delete(params: ParamsResourceObjectaccesscontrolsDelete, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(
    params: ParamsResourceObjectaccesscontrolsDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  
  /**
    * storage.objectAccessControls.get
    * @desc Returns the ACL entry for the specified entity on the specified
    * object.
    * @alias storage.objectAccessControls.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.bucket Name of a bucket.
    * @param {string} params.entity The entity holding the permission. Can be user-userId, user-emailAddress, group-groupId, group-emailAddress, allUsers, or allAuthenticatedUsers.
    * @param {string} params.object Name of the object.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
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
    options: BodyResponseCallback[SchemaObjectAccessControl],
    callback: BodyResponseCallback[SchemaObjectAccessControl]
  ): Unit = js.native
  def get(params: ParamsResourceObjectaccesscontrolsGet, options: MethodOptions): GaxiosPromise[SchemaObjectAccessControl] = js.native
  def get(
    params: ParamsResourceObjectaccesscontrolsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaObjectAccessControl]
  ): Unit = js.native
  
  /**
    * storage.objectAccessControls.insert
    * @desc Creates a new ACL entry on the specified object.
    * @alias storage.objectAccessControls.insert
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.bucket Name of a bucket.
    * @param {string} params.object Name of the object.
    * @param {().ObjectAccessControl} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
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
    options: BodyResponseCallback[SchemaObjectAccessControl],
    callback: BodyResponseCallback[SchemaObjectAccessControl]
  ): Unit = js.native
  def insert(params: ParamsResourceObjectaccesscontrolsInsert, options: MethodOptions): GaxiosPromise[SchemaObjectAccessControl] = js.native
  def insert(
    params: ParamsResourceObjectaccesscontrolsInsert,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaObjectAccessControl]
  ): Unit = js.native
  
  /**
    * storage.objectAccessControls.list
    * @desc Retrieves ACL entries on the specified object.
    * @alias storage.objectAccessControls.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.bucket Name of a bucket.
    * @param {string} params.object Name of the object.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
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
    options: BodyResponseCallback[SchemaObjectAccessControls],
    callback: BodyResponseCallback[SchemaObjectAccessControls]
  ): Unit = js.native
  def list(params: ParamsResourceObjectaccesscontrolsList, options: MethodOptions): GaxiosPromise[SchemaObjectAccessControls] = js.native
  def list(
    params: ParamsResourceObjectaccesscontrolsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaObjectAccessControls]
  ): Unit = js.native
  
  /**
    * storage.objectAccessControls.patch
    * @desc Updates an ACL entry on the specified object. This method supports
    * patch semantics.
    * @alias storage.objectAccessControls.patch
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.bucket Name of a bucket.
    * @param {string} params.entity The entity holding the permission. Can be user-userId, user-emailAddress, group-groupId, group-emailAddress, allUsers, or allAuthenticatedUsers.
    * @param {string} params.object Name of the object.
    * @param {().ObjectAccessControl} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
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
    options: BodyResponseCallback[SchemaObjectAccessControl],
    callback: BodyResponseCallback[SchemaObjectAccessControl]
  ): Unit = js.native
  def patch(params: ParamsResourceObjectaccesscontrolsPatch, options: MethodOptions): GaxiosPromise[SchemaObjectAccessControl] = js.native
  def patch(
    params: ParamsResourceObjectaccesscontrolsPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaObjectAccessControl]
  ): Unit = js.native
  
  /**
    * storage.objectAccessControls.update
    * @desc Updates an ACL entry on the specified object.
    * @alias storage.objectAccessControls.update
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.bucket Name of a bucket.
    * @param {string} params.entity The entity holding the permission. Can be user-userId, user-emailAddress, group-groupId, group-emailAddress, allUsers, or allAuthenticatedUsers.
    * @param {string} params.object Name of the object.
    * @param {().ObjectAccessControl} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
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
    options: BodyResponseCallback[SchemaObjectAccessControl],
    callback: BodyResponseCallback[SchemaObjectAccessControl]
  ): Unit = js.native
  def update(params: ParamsResourceObjectaccesscontrolsUpdate, options: MethodOptions): GaxiosPromise[SchemaObjectAccessControl] = js.native
  def update(
    params: ParamsResourceObjectaccesscontrolsUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaObjectAccessControl]
  ): Unit = js.native
}
