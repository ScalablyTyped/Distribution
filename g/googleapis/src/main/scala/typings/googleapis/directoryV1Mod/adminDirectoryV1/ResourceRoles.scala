package typings.googleapis.directoryV1Mod.adminDirectoryV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/admin/directory_v1", "admin_directory_v1.Resource$Roles")
@js.native
class ResourceRoles protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  /**
    * directory.roles.delete
    * @desc Deletes a role.
    * @alias directory.roles.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.customer Immutable ID of the G Suite account.
    * @param {string} params.roleId Immutable ID of the role.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[Unit] = js.native
  def delete(callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceRolesDelete): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceRolesDelete, callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(
    params: ParamsResourceRolesDelete,
    options: BodyResponseCallback[Unit],
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def delete(params: ParamsResourceRolesDelete, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceRolesDelete, options: MethodOptions, callback: BodyResponseCallback[Unit]): Unit = js.native
  
  /**
    * directory.roles.get
    * @desc Retrieves a role.
    * @alias directory.roles.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.customer Immutable ID of the G Suite account.
    * @param {string} params.roleId Immutable ID of the role.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaRole] = js.native
  def get(callback: BodyResponseCallback[SchemaRole]): Unit = js.native
  def get(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaRole] = js.native
  def get(params: ParamsResourceRolesGet): GaxiosPromise[SchemaRole] = js.native
  def get(params: ParamsResourceRolesGet, callback: BodyResponseCallback[SchemaRole]): Unit = js.native
  def get(
    params: ParamsResourceRolesGet,
    options: BodyResponseCallback[SchemaRole],
    callback: BodyResponseCallback[SchemaRole]
  ): Unit = js.native
  def get(params: ParamsResourceRolesGet, options: MethodOptions): GaxiosPromise[SchemaRole] = js.native
  def get(params: ParamsResourceRolesGet, options: MethodOptions, callback: BodyResponseCallback[SchemaRole]): Unit = js.native
  
  /**
    * directory.roles.insert
    * @desc Creates a role.
    * @alias directory.roles.insert
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.customer Immutable ID of the G Suite account.
    * @param {().Role} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def insert(): GaxiosPromise[SchemaRole] = js.native
  def insert(callback: BodyResponseCallback[SchemaRole]): Unit = js.native
  def insert(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaRole] = js.native
  def insert(params: ParamsResourceRolesInsert): GaxiosPromise[SchemaRole] = js.native
  def insert(params: ParamsResourceRolesInsert, callback: BodyResponseCallback[SchemaRole]): Unit = js.native
  def insert(
    params: ParamsResourceRolesInsert,
    options: BodyResponseCallback[SchemaRole],
    callback: BodyResponseCallback[SchemaRole]
  ): Unit = js.native
  def insert(params: ParamsResourceRolesInsert, options: MethodOptions): GaxiosPromise[SchemaRole] = js.native
  def insert(
    params: ParamsResourceRolesInsert,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaRole]
  ): Unit = js.native
  
  /**
    * directory.roles.list
    * @desc Retrieves a paginated list of all the roles in a domain.
    * @alias directory.roles.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.customer Immutable ID of the G Suite account.
    * @param {integer=} params.maxResults Maximum number of results to return.
    * @param {string=} params.pageToken Token to specify the next page in the list.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaRoles] = js.native
  def list(callback: BodyResponseCallback[SchemaRoles]): Unit = js.native
  def list(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaRoles] = js.native
  def list(params: ParamsResourceRolesList): GaxiosPromise[SchemaRoles] = js.native
  def list(params: ParamsResourceRolesList, callback: BodyResponseCallback[SchemaRoles]): Unit = js.native
  def list(
    params: ParamsResourceRolesList,
    options: BodyResponseCallback[SchemaRoles],
    callback: BodyResponseCallback[SchemaRoles]
  ): Unit = js.native
  def list(params: ParamsResourceRolesList, options: MethodOptions): GaxiosPromise[SchemaRoles] = js.native
  def list(
    params: ParamsResourceRolesList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaRoles]
  ): Unit = js.native
  
  /**
    * directory.roles.patch
    * @desc Updates a role. This method supports patch semantics.
    * @alias directory.roles.patch
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.customer Immutable ID of the G Suite account.
    * @param {string} params.roleId Immutable ID of the role.
    * @param {().Role} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def patch(): GaxiosPromise[SchemaRole] = js.native
  def patch(callback: BodyResponseCallback[SchemaRole]): Unit = js.native
  def patch(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaRole] = js.native
  def patch(params: ParamsResourceRolesPatch): GaxiosPromise[SchemaRole] = js.native
  def patch(params: ParamsResourceRolesPatch, callback: BodyResponseCallback[SchemaRole]): Unit = js.native
  def patch(
    params: ParamsResourceRolesPatch,
    options: BodyResponseCallback[SchemaRole],
    callback: BodyResponseCallback[SchemaRole]
  ): Unit = js.native
  def patch(params: ParamsResourceRolesPatch, options: MethodOptions): GaxiosPromise[SchemaRole] = js.native
  def patch(
    params: ParamsResourceRolesPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaRole]
  ): Unit = js.native
  
  /**
    * directory.roles.update
    * @desc Updates a role.
    * @alias directory.roles.update
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.customer Immutable ID of the G Suite account.
    * @param {string} params.roleId Immutable ID of the role.
    * @param {().Role} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def update(): GaxiosPromise[SchemaRole] = js.native
  def update(callback: BodyResponseCallback[SchemaRole]): Unit = js.native
  def update(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaRole] = js.native
  def update(params: ParamsResourceRolesUpdate): GaxiosPromise[SchemaRole] = js.native
  def update(params: ParamsResourceRolesUpdate, callback: BodyResponseCallback[SchemaRole]): Unit = js.native
  def update(
    params: ParamsResourceRolesUpdate,
    options: BodyResponseCallback[SchemaRole],
    callback: BodyResponseCallback[SchemaRole]
  ): Unit = js.native
  def update(params: ParamsResourceRolesUpdate, options: MethodOptions): GaxiosPromise[SchemaRole] = js.native
  def update(
    params: ParamsResourceRolesUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaRole]
  ): Unit = js.native
}
