package typings.googleapis.tagmanagerV2Mod.tagmanagerV2

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/tagmanager/v2", "tagmanager_v2.Resource$Accounts$Containers$Workspaces$Built_in_variables")
@js.native
class ResourceAccountsContainersWorkspacesBuiltInVariables protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * tagmanager.accounts.containers.workspaces.built_in_variables.create
    * @desc Creates one or more GTM Built-In Variables.
    * @alias
    * tagmanager.accounts.containers.workspaces.built_in_variables.create
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.parent GTM Workspace's API relative path. Example: accounts/{account_id}/containers/{container_id}/workspaces/{workspace_id}
    * @param {string=} params.type The types of built-in variables to enable.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def create(): GaxiosPromise[SchemaCreateBuiltInVariableResponse] = js.native
  def create(callback: BodyResponseCallback[SchemaCreateBuiltInVariableResponse]): Unit = js.native
  def create(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaCreateBuiltInVariableResponse] = js.native
  def create(params: ParamsResourceAccountsContainersWorkspacesBuiltInVariablesCreate): GaxiosPromise[SchemaCreateBuiltInVariableResponse] = js.native
  def create(
    params: ParamsResourceAccountsContainersWorkspacesBuiltInVariablesCreate,
    callback: BodyResponseCallback[SchemaCreateBuiltInVariableResponse]
  ): Unit = js.native
  def create(
    params: ParamsResourceAccountsContainersWorkspacesBuiltInVariablesCreate,
    options: BodyResponseCallback[SchemaCreateBuiltInVariableResponse],
    callback: BodyResponseCallback[SchemaCreateBuiltInVariableResponse]
  ): Unit = js.native
  def create(params: ParamsResourceAccountsContainersWorkspacesBuiltInVariablesCreate, options: MethodOptions): GaxiosPromise[SchemaCreateBuiltInVariableResponse] = js.native
  def create(
    params: ParamsResourceAccountsContainersWorkspacesBuiltInVariablesCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaCreateBuiltInVariableResponse]
  ): Unit = js.native
  /**
    * tagmanager.accounts.containers.workspaces.built_in_variables.delete
    * @desc Deletes one or more GTM Built-In Variables.
    * @alias
    * tagmanager.accounts.containers.workspaces.built_in_variables.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.path GTM BuiltInVariable's API relative path. Example: accounts/{account_id}/containers/{container_id}/workspaces/{workspace_id}/built_in_variables
    * @param {string=} params.type The types of built-in variables to delete.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[Unit] = js.native
  def delete(callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceAccountsContainersWorkspacesBuiltInVariablesDelete): GaxiosPromise[Unit] = js.native
  def delete(
    params: ParamsResourceAccountsContainersWorkspacesBuiltInVariablesDelete,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def delete(
    params: ParamsResourceAccountsContainersWorkspacesBuiltInVariablesDelete,
    options: BodyResponseCallback[Unit],
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def delete(params: ParamsResourceAccountsContainersWorkspacesBuiltInVariablesDelete, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(
    params: ParamsResourceAccountsContainersWorkspacesBuiltInVariablesDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  /**
    * tagmanager.accounts.containers.workspaces.built_in_variables.list
    * @desc Lists all the enabled Built-In Variables of a GTM Container.
    * @alias tagmanager.accounts.containers.workspaces.built_in_variables.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.pageToken Continuation token for fetching the next page of results.
    * @param {string} params.parent GTM Workspace's API relative path. Example: accounts/{account_id}/containers/{container_id}/workspaces/{workspace_id}
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaListEnabledBuiltInVariablesResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListEnabledBuiltInVariablesResponse]): Unit = js.native
  def list(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaListEnabledBuiltInVariablesResponse] = js.native
  def list(params: ParamsResourceAccountsContainersWorkspacesBuiltInVariablesList): GaxiosPromise[SchemaListEnabledBuiltInVariablesResponse] = js.native
  def list(
    params: ParamsResourceAccountsContainersWorkspacesBuiltInVariablesList,
    callback: BodyResponseCallback[SchemaListEnabledBuiltInVariablesResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceAccountsContainersWorkspacesBuiltInVariablesList,
    options: BodyResponseCallback[SchemaListEnabledBuiltInVariablesResponse],
    callback: BodyResponseCallback[SchemaListEnabledBuiltInVariablesResponse]
  ): Unit = js.native
  def list(params: ParamsResourceAccountsContainersWorkspacesBuiltInVariablesList, options: MethodOptions): GaxiosPromise[SchemaListEnabledBuiltInVariablesResponse] = js.native
  def list(
    params: ParamsResourceAccountsContainersWorkspacesBuiltInVariablesList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListEnabledBuiltInVariablesResponse]
  ): Unit = js.native
  /**
    * tagmanager.accounts.containers.workspaces.built_in_variables.revert
    * @desc Reverts changes to a GTM Built-In Variables in a GTM Workspace.
    * @alias
    * tagmanager.accounts.containers.workspaces.built_in_variables.revert
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.path GTM BuiltInVariable's API relative path. Example: accounts/{account_id}/containers/{container_id}/workspaces/{workspace_id}/built_in_variables
    * @param {string=} params.type The type of built-in variable to revert.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def revert(): GaxiosPromise[SchemaRevertBuiltInVariableResponse] = js.native
  def revert(callback: BodyResponseCallback[SchemaRevertBuiltInVariableResponse]): Unit = js.native
  def revert(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaRevertBuiltInVariableResponse] = js.native
  def revert(params: ParamsResourceAccountsContainersWorkspacesBuiltInVariablesRevert): GaxiosPromise[SchemaRevertBuiltInVariableResponse] = js.native
  def revert(
    params: ParamsResourceAccountsContainersWorkspacesBuiltInVariablesRevert,
    callback: BodyResponseCallback[SchemaRevertBuiltInVariableResponse]
  ): Unit = js.native
  def revert(
    params: ParamsResourceAccountsContainersWorkspacesBuiltInVariablesRevert,
    options: BodyResponseCallback[SchemaRevertBuiltInVariableResponse],
    callback: BodyResponseCallback[SchemaRevertBuiltInVariableResponse]
  ): Unit = js.native
  def revert(params: ParamsResourceAccountsContainersWorkspacesBuiltInVariablesRevert, options: MethodOptions): GaxiosPromise[SchemaRevertBuiltInVariableResponse] = js.native
  def revert(
    params: ParamsResourceAccountsContainersWorkspacesBuiltInVariablesRevert,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaRevertBuiltInVariableResponse]
  ): Unit = js.native
}

