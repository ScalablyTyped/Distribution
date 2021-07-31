package typings.googleapis.tagmanagerV2Mod.tagmanagerV2

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/tagmanager/v2", "tagmanager_v2.Resource$Accounts$User_permissions")
@js.native
class ResourceAccountsUserPermissions protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  /**
    * tagmanager.accounts.user_permissions.create
    * @desc Creates a user's Account & Container access.
    * @alias tagmanager.accounts.user_permissions.create
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.parent GTM Account's API relative path. Example: accounts/{account_id}
    * @param {().UserPermission} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def create(): GaxiosPromise[SchemaUserPermission] = js.native
  def create(callback: BodyResponseCallback[SchemaUserPermission]): Unit = js.native
  def create(params: Unit, options: MethodOptions): GaxiosPromise[SchemaUserPermission] = js.native
  def create(params: ParamsResourceAccountsUserPermissionsCreate): GaxiosPromise[SchemaUserPermission] = js.native
  def create(
    params: ParamsResourceAccountsUserPermissionsCreate,
    callback: BodyResponseCallback[SchemaUserPermission]
  ): Unit = js.native
  def create(
    params: ParamsResourceAccountsUserPermissionsCreate,
    options: BodyResponseCallback[SchemaUserPermission],
    callback: BodyResponseCallback[SchemaUserPermission]
  ): Unit = js.native
  def create(params: ParamsResourceAccountsUserPermissionsCreate, options: MethodOptions): GaxiosPromise[SchemaUserPermission] = js.native
  def create(
    params: ParamsResourceAccountsUserPermissionsCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaUserPermission]
  ): Unit = js.native
  
  /**
    * tagmanager.accounts.user_permissions.delete
    * @desc Removes a user from the account, revoking access to it and all of
    * its containers.
    * @alias tagmanager.accounts.user_permissions.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.path GTM UserPermission's API relative path. Example: accounts/{account_id}/user_permissions/{user_permission_id}
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[Unit] = js.native
  def delete(callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceAccountsUserPermissionsDelete): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceAccountsUserPermissionsDelete, callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(
    params: ParamsResourceAccountsUserPermissionsDelete,
    options: BodyResponseCallback[Unit],
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def delete(params: ParamsResourceAccountsUserPermissionsDelete, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(
    params: ParamsResourceAccountsUserPermissionsDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  
  /**
    * tagmanager.accounts.user_permissions.get
    * @desc Gets a user's Account & Container access.
    * @alias tagmanager.accounts.user_permissions.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.path GTM UserPermission's API relative path. Example: accounts/{account_id}/user_permissions/{user_permission_id}
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaUserPermission] = js.native
  def get(callback: BodyResponseCallback[SchemaUserPermission]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaUserPermission] = js.native
  def get(params: ParamsResourceAccountsUserPermissionsGet): GaxiosPromise[SchemaUserPermission] = js.native
  def get(
    params: ParamsResourceAccountsUserPermissionsGet,
    callback: BodyResponseCallback[SchemaUserPermission]
  ): Unit = js.native
  def get(
    params: ParamsResourceAccountsUserPermissionsGet,
    options: BodyResponseCallback[SchemaUserPermission],
    callback: BodyResponseCallback[SchemaUserPermission]
  ): Unit = js.native
  def get(params: ParamsResourceAccountsUserPermissionsGet, options: MethodOptions): GaxiosPromise[SchemaUserPermission] = js.native
  def get(
    params: ParamsResourceAccountsUserPermissionsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaUserPermission]
  ): Unit = js.native
  
  /**
    * tagmanager.accounts.user_permissions.list
    * @desc List all users that have access to the account along with Account
    * and Container user access granted to each of them.
    * @alias tagmanager.accounts.user_permissions.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.pageToken Continuation token for fetching the next page of results.
    * @param {string} params.parent GTM Accounts's API relative path. Example: accounts/{account_id}
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaListUserPermissionsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListUserPermissionsResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListUserPermissionsResponse] = js.native
  def list(params: ParamsResourceAccountsUserPermissionsList): GaxiosPromise[SchemaListUserPermissionsResponse] = js.native
  def list(
    params: ParamsResourceAccountsUserPermissionsList,
    callback: BodyResponseCallback[SchemaListUserPermissionsResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceAccountsUserPermissionsList,
    options: BodyResponseCallback[SchemaListUserPermissionsResponse],
    callback: BodyResponseCallback[SchemaListUserPermissionsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceAccountsUserPermissionsList, options: MethodOptions): GaxiosPromise[SchemaListUserPermissionsResponse] = js.native
  def list(
    params: ParamsResourceAccountsUserPermissionsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListUserPermissionsResponse]
  ): Unit = js.native
  
  /**
    * tagmanager.accounts.user_permissions.update
    * @desc Updates a user's Account & Container access.
    * @alias tagmanager.accounts.user_permissions.update
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.path GTM UserPermission's API relative path. Example: accounts/{account_id}/user_permissions/{user_permission_id}
    * @param {().UserPermission} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def update(): GaxiosPromise[SchemaUserPermission] = js.native
  def update(callback: BodyResponseCallback[SchemaUserPermission]): Unit = js.native
  def update(params: Unit, options: MethodOptions): GaxiosPromise[SchemaUserPermission] = js.native
  def update(params: ParamsResourceAccountsUserPermissionsUpdate): GaxiosPromise[SchemaUserPermission] = js.native
  def update(
    params: ParamsResourceAccountsUserPermissionsUpdate,
    callback: BodyResponseCallback[SchemaUserPermission]
  ): Unit = js.native
  def update(
    params: ParamsResourceAccountsUserPermissionsUpdate,
    options: BodyResponseCallback[SchemaUserPermission],
    callback: BodyResponseCallback[SchemaUserPermission]
  ): Unit = js.native
  def update(params: ParamsResourceAccountsUserPermissionsUpdate, options: MethodOptions): GaxiosPromise[SchemaUserPermission] = js.native
  def update(
    params: ParamsResourceAccountsUserPermissionsUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaUserPermission]
  ): Unit = js.native
}
