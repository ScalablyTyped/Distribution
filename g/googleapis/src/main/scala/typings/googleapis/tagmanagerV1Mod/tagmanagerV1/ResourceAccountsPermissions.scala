package typings.googleapis.tagmanagerV1Mod.tagmanagerV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/tagmanager/v1", "tagmanager_v1.Resource$Accounts$Permissions")
@js.native
class ResourceAccountsPermissions protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * tagmanager.accounts.permissions.create
    * @desc Creates a user's Account & Container Permissions.
    * @alias tagmanager.accounts.permissions.create
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.accountId The GTM Account ID.
    * @param {().UserAccess} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def create(): GaxiosPromise[SchemaUserAccess] = js.native
  def create(callback: BodyResponseCallback[SchemaUserAccess]): Unit = js.native
  def create(params: ParamsResourceAccountsPermissionsCreate): GaxiosPromise[SchemaUserAccess] = js.native
  def create(params: ParamsResourceAccountsPermissionsCreate, callback: BodyResponseCallback[SchemaUserAccess]): Unit = js.native
  def create(
    params: ParamsResourceAccountsPermissionsCreate,
    options: BodyResponseCallback[SchemaUserAccess],
    callback: BodyResponseCallback[SchemaUserAccess]
  ): Unit = js.native
  def create(params: ParamsResourceAccountsPermissionsCreate, options: MethodOptions): GaxiosPromise[SchemaUserAccess] = js.native
  def create(
    params: ParamsResourceAccountsPermissionsCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaUserAccess]
  ): Unit = js.native
  /**
    * tagmanager.accounts.permissions.delete
    * @desc Removes a user from the account, revoking access to it and all of
    * its containers.
    * @alias tagmanager.accounts.permissions.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.accountId The GTM Account ID.
    * @param {string} params.permissionId The GTM User ID.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[Unit] = js.native
  def delete(callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(params: ParamsResourceAccountsPermissionsDelete): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceAccountsPermissionsDelete, callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(
    params: ParamsResourceAccountsPermissionsDelete,
    options: BodyResponseCallback[Unit],
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def delete(params: ParamsResourceAccountsPermissionsDelete, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(
    params: ParamsResourceAccountsPermissionsDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  /**
    * tagmanager.accounts.permissions.get
    * @desc Gets a user's Account & Container Permissions.
    * @alias tagmanager.accounts.permissions.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.accountId The GTM Account ID.
    * @param {string} params.permissionId The GTM User ID.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaUserAccess] = js.native
  def get(callback: BodyResponseCallback[SchemaUserAccess]): Unit = js.native
  def get(params: ParamsResourceAccountsPermissionsGet): GaxiosPromise[SchemaUserAccess] = js.native
  def get(params: ParamsResourceAccountsPermissionsGet, callback: BodyResponseCallback[SchemaUserAccess]): Unit = js.native
  def get(
    params: ParamsResourceAccountsPermissionsGet,
    options: BodyResponseCallback[SchemaUserAccess],
    callback: BodyResponseCallback[SchemaUserAccess]
  ): Unit = js.native
  def get(params: ParamsResourceAccountsPermissionsGet, options: MethodOptions): GaxiosPromise[SchemaUserAccess] = js.native
  def get(
    params: ParamsResourceAccountsPermissionsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaUserAccess]
  ): Unit = js.native
  /**
    * tagmanager.accounts.permissions.list
    * @desc List all users that have access to the account along with Account
    * and Container Permissions granted to each of them.
    * @alias tagmanager.accounts.permissions.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.accountId The GTM Account ID. @required tagmanager.accounts.permissions.list
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaListAccountUsersResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListAccountUsersResponse]): Unit = js.native
  def list(params: ParamsResourceAccountsPermissionsList): GaxiosPromise[SchemaListAccountUsersResponse] = js.native
  def list(
    params: ParamsResourceAccountsPermissionsList,
    callback: BodyResponseCallback[SchemaListAccountUsersResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceAccountsPermissionsList,
    options: BodyResponseCallback[SchemaListAccountUsersResponse],
    callback: BodyResponseCallback[SchemaListAccountUsersResponse]
  ): Unit = js.native
  def list(params: ParamsResourceAccountsPermissionsList, options: MethodOptions): GaxiosPromise[SchemaListAccountUsersResponse] = js.native
  def list(
    params: ParamsResourceAccountsPermissionsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListAccountUsersResponse]
  ): Unit = js.native
  /**
    * tagmanager.accounts.permissions.update
    * @desc Updates a user's Account & Container Permissions.
    * @alias tagmanager.accounts.permissions.update
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.accountId The GTM Account ID.
    * @param {string} params.permissionId The GTM User ID.
    * @param {().UserAccess} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def update(): GaxiosPromise[SchemaUserAccess] = js.native
  def update(callback: BodyResponseCallback[SchemaUserAccess]): Unit = js.native
  def update(params: ParamsResourceAccountsPermissionsUpdate): GaxiosPromise[SchemaUserAccess] = js.native
  def update(params: ParamsResourceAccountsPermissionsUpdate, callback: BodyResponseCallback[SchemaUserAccess]): Unit = js.native
  def update(
    params: ParamsResourceAccountsPermissionsUpdate,
    options: BodyResponseCallback[SchemaUserAccess],
    callback: BodyResponseCallback[SchemaUserAccess]
  ): Unit = js.native
  def update(params: ParamsResourceAccountsPermissionsUpdate, options: MethodOptions): GaxiosPromise[SchemaUserAccess] = js.native
  def update(
    params: ParamsResourceAccountsPermissionsUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaUserAccess]
  ): Unit = js.native
}

