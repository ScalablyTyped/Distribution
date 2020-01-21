package typings.googleapis.tagmanagerV2Mod.tagmanagerV2

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/tagmanager/v2", "tagmanager_v2.Resource$Accounts$Containers$Workspaces$Variables")
@js.native
class ResourceAccountsContainersWorkspacesVariables protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * tagmanager.accounts.containers.workspaces.variables.create
    * @desc Creates a GTM Variable.
    * @alias tagmanager.accounts.containers.workspaces.variables.create
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.parent GTM Workspace's API relative path. Example: accounts/{account_id}/containers/{container_id}/workspaces/{workspace_id}
    * @param {().Variable} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def create(): GaxiosPromise[SchemaVariable] = js.native
  def create(callback: BodyResponseCallback[SchemaVariable]): Unit = js.native
  def create(params: ParamsResourceAccountsContainersWorkspacesVariablesCreate): GaxiosPromise[SchemaVariable] = js.native
  def create(
    params: ParamsResourceAccountsContainersWorkspacesVariablesCreate,
    callback: BodyResponseCallback[SchemaVariable]
  ): Unit = js.native
  def create(
    params: ParamsResourceAccountsContainersWorkspacesVariablesCreate,
    options: BodyResponseCallback[SchemaVariable],
    callback: BodyResponseCallback[SchemaVariable]
  ): Unit = js.native
  def create(params: ParamsResourceAccountsContainersWorkspacesVariablesCreate, options: MethodOptions): GaxiosPromise[SchemaVariable] = js.native
  def create(
    params: ParamsResourceAccountsContainersWorkspacesVariablesCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaVariable]
  ): Unit = js.native
  /**
    * tagmanager.accounts.containers.workspaces.variables.delete
    * @desc Deletes a GTM Variable.
    * @alias tagmanager.accounts.containers.workspaces.variables.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.path GTM Variable's API relative path. Example: accounts/{account_id}/containers/{container_id}/workspaces/{workspace_id}/variables/{variable_id}
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[Unit] = js.native
  def delete(callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(params: ParamsResourceAccountsContainersWorkspacesVariablesDelete): GaxiosPromise[Unit] = js.native
  def delete(
    params: ParamsResourceAccountsContainersWorkspacesVariablesDelete,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def delete(
    params: ParamsResourceAccountsContainersWorkspacesVariablesDelete,
    options: BodyResponseCallback[Unit],
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def delete(params: ParamsResourceAccountsContainersWorkspacesVariablesDelete, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(
    params: ParamsResourceAccountsContainersWorkspacesVariablesDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  /**
    * tagmanager.accounts.containers.workspaces.variables.get
    * @desc Gets a GTM Variable.
    * @alias tagmanager.accounts.containers.workspaces.variables.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.path GTM Variable's API relative path. Example: accounts/{account_id}/containers/{container_id}/workspaces/{workspace_id}/variables/{variable_id}
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaVariable] = js.native
  def get(callback: BodyResponseCallback[SchemaVariable]): Unit = js.native
  def get(params: ParamsResourceAccountsContainersWorkspacesVariablesGet): GaxiosPromise[SchemaVariable] = js.native
  def get(
    params: ParamsResourceAccountsContainersWorkspacesVariablesGet,
    callback: BodyResponseCallback[SchemaVariable]
  ): Unit = js.native
  def get(
    params: ParamsResourceAccountsContainersWorkspacesVariablesGet,
    options: BodyResponseCallback[SchemaVariable],
    callback: BodyResponseCallback[SchemaVariable]
  ): Unit = js.native
  def get(params: ParamsResourceAccountsContainersWorkspacesVariablesGet, options: MethodOptions): GaxiosPromise[SchemaVariable] = js.native
  def get(
    params: ParamsResourceAccountsContainersWorkspacesVariablesGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaVariable]
  ): Unit = js.native
  /**
    * tagmanager.accounts.containers.workspaces.variables.list
    * @desc Lists all GTM Variables of a Container.
    * @alias tagmanager.accounts.containers.workspaces.variables.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.pageToken Continuation token for fetching the next page of results.
    * @param {string} params.parent GTM Workspace's API relative path. Example: accounts/{account_id}/containers/{container_id}/workspaces/{workspace_id}
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaListVariablesResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListVariablesResponse]): Unit = js.native
  def list(params: ParamsResourceAccountsContainersWorkspacesVariablesList): GaxiosPromise[SchemaListVariablesResponse] = js.native
  def list(
    params: ParamsResourceAccountsContainersWorkspacesVariablesList,
    callback: BodyResponseCallback[SchemaListVariablesResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceAccountsContainersWorkspacesVariablesList,
    options: BodyResponseCallback[SchemaListVariablesResponse],
    callback: BodyResponseCallback[SchemaListVariablesResponse]
  ): Unit = js.native
  def list(params: ParamsResourceAccountsContainersWorkspacesVariablesList, options: MethodOptions): GaxiosPromise[SchemaListVariablesResponse] = js.native
  def list(
    params: ParamsResourceAccountsContainersWorkspacesVariablesList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListVariablesResponse]
  ): Unit = js.native
  /**
    * tagmanager.accounts.containers.workspaces.variables.revert
    * @desc Reverts changes to a GTM Variable in a GTM Workspace.
    * @alias tagmanager.accounts.containers.workspaces.variables.revert
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.fingerprint When provided, this fingerprint must match the fingerprint of the variable in storage.
    * @param {string} params.path GTM Variable's API relative path. Example: accounts/{account_id}/containers/{container_id}/workspaces/{workspace_id}/variables/{variable_id}
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def revert(): GaxiosPromise[SchemaRevertVariableResponse] = js.native
  def revert(callback: BodyResponseCallback[SchemaRevertVariableResponse]): Unit = js.native
  def revert(params: ParamsResourceAccountsContainersWorkspacesVariablesRevert): GaxiosPromise[SchemaRevertVariableResponse] = js.native
  def revert(
    params: ParamsResourceAccountsContainersWorkspacesVariablesRevert,
    callback: BodyResponseCallback[SchemaRevertVariableResponse]
  ): Unit = js.native
  def revert(
    params: ParamsResourceAccountsContainersWorkspacesVariablesRevert,
    options: BodyResponseCallback[SchemaRevertVariableResponse],
    callback: BodyResponseCallback[SchemaRevertVariableResponse]
  ): Unit = js.native
  def revert(params: ParamsResourceAccountsContainersWorkspacesVariablesRevert, options: MethodOptions): GaxiosPromise[SchemaRevertVariableResponse] = js.native
  def revert(
    params: ParamsResourceAccountsContainersWorkspacesVariablesRevert,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaRevertVariableResponse]
  ): Unit = js.native
  /**
    * tagmanager.accounts.containers.workspaces.variables.update
    * @desc Updates a GTM Variable.
    * @alias tagmanager.accounts.containers.workspaces.variables.update
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.fingerprint When provided, this fingerprint must match the fingerprint of the variable in storage.
    * @param {string} params.path GTM Variable's API relative path. Example: accounts/{account_id}/containers/{container_id}/workspaces/{workspace_id}/variables/{variable_id}
    * @param {().Variable} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def update(): GaxiosPromise[SchemaVariable] = js.native
  def update(callback: BodyResponseCallback[SchemaVariable]): Unit = js.native
  def update(params: ParamsResourceAccountsContainersWorkspacesVariablesUpdate): GaxiosPromise[SchemaVariable] = js.native
  def update(
    params: ParamsResourceAccountsContainersWorkspacesVariablesUpdate,
    callback: BodyResponseCallback[SchemaVariable]
  ): Unit = js.native
  def update(
    params: ParamsResourceAccountsContainersWorkspacesVariablesUpdate,
    options: BodyResponseCallback[SchemaVariable],
    callback: BodyResponseCallback[SchemaVariable]
  ): Unit = js.native
  def update(params: ParamsResourceAccountsContainersWorkspacesVariablesUpdate, options: MethodOptions): GaxiosPromise[SchemaVariable] = js.native
  def update(
    params: ParamsResourceAccountsContainersWorkspacesVariablesUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaVariable]
  ): Unit = js.native
}

