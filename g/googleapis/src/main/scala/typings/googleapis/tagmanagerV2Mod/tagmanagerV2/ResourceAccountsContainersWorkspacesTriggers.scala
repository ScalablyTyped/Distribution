package typings.googleapis.tagmanagerV2Mod.tagmanagerV2

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/tagmanager/v2", "tagmanager_v2.Resource$Accounts$Containers$Workspaces$Triggers")
@js.native
class ResourceAccountsContainersWorkspacesTriggers protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  /**
    * tagmanager.accounts.containers.workspaces.triggers.create
    * @desc Creates a GTM Trigger.
    * @alias tagmanager.accounts.containers.workspaces.triggers.create
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.parent GTM Workspaces's API relative path. Example: accounts/{account_id}/containers/{container_id}/workspaces/{workspace_id}
    * @param {().Trigger} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def create(): GaxiosPromise[SchemaTrigger] = js.native
  def create(callback: BodyResponseCallback[SchemaTrigger]): Unit = js.native
  def create(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaTrigger] = js.native
  def create(params: ParamsResourceAccountsContainersWorkspacesTriggersCreate): GaxiosPromise[SchemaTrigger] = js.native
  def create(
    params: ParamsResourceAccountsContainersWorkspacesTriggersCreate,
    callback: BodyResponseCallback[SchemaTrigger]
  ): Unit = js.native
  def create(
    params: ParamsResourceAccountsContainersWorkspacesTriggersCreate,
    options: BodyResponseCallback[SchemaTrigger],
    callback: BodyResponseCallback[SchemaTrigger]
  ): Unit = js.native
  def create(params: ParamsResourceAccountsContainersWorkspacesTriggersCreate, options: MethodOptions): GaxiosPromise[SchemaTrigger] = js.native
  def create(
    params: ParamsResourceAccountsContainersWorkspacesTriggersCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaTrigger]
  ): Unit = js.native
  
  /**
    * tagmanager.accounts.containers.workspaces.triggers.delete
    * @desc Deletes a GTM Trigger.
    * @alias tagmanager.accounts.containers.workspaces.triggers.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.path GTM Trigger's API relative path. Example: accounts/{account_id}/containers/{container_id}/workspaces/{workspace_id}/triggers/{trigger_id}
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[Unit] = js.native
  def delete(callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceAccountsContainersWorkspacesTriggersDelete): GaxiosPromise[Unit] = js.native
  def delete(
    params: ParamsResourceAccountsContainersWorkspacesTriggersDelete,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def delete(
    params: ParamsResourceAccountsContainersWorkspacesTriggersDelete,
    options: BodyResponseCallback[Unit],
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def delete(params: ParamsResourceAccountsContainersWorkspacesTriggersDelete, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(
    params: ParamsResourceAccountsContainersWorkspacesTriggersDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  
  /**
    * tagmanager.accounts.containers.workspaces.triggers.get
    * @desc Gets a GTM Trigger.
    * @alias tagmanager.accounts.containers.workspaces.triggers.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.path GTM Trigger's API relative path. Example: accounts/{account_id}/containers/{container_id}/workspaces/{workspace_id}/triggers/{trigger_id}
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaTrigger] = js.native
  def get(callback: BodyResponseCallback[SchemaTrigger]): Unit = js.native
  def get(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaTrigger] = js.native
  def get(params: ParamsResourceAccountsContainersWorkspacesTriggersGet): GaxiosPromise[SchemaTrigger] = js.native
  def get(
    params: ParamsResourceAccountsContainersWorkspacesTriggersGet,
    callback: BodyResponseCallback[SchemaTrigger]
  ): Unit = js.native
  def get(
    params: ParamsResourceAccountsContainersWorkspacesTriggersGet,
    options: BodyResponseCallback[SchemaTrigger],
    callback: BodyResponseCallback[SchemaTrigger]
  ): Unit = js.native
  def get(params: ParamsResourceAccountsContainersWorkspacesTriggersGet, options: MethodOptions): GaxiosPromise[SchemaTrigger] = js.native
  def get(
    params: ParamsResourceAccountsContainersWorkspacesTriggersGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaTrigger]
  ): Unit = js.native
  
  /**
    * tagmanager.accounts.containers.workspaces.triggers.list
    * @desc Lists all GTM Triggers of a Container.
    * @alias tagmanager.accounts.containers.workspaces.triggers.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.pageToken Continuation token for fetching the next page of results.
    * @param {string} params.parent GTM Workspaces's API relative path. Example: accounts/{account_id}/containers/{container_id}/workspaces/{workspace_id}
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaListTriggersResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListTriggersResponse]): Unit = js.native
  def list(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaListTriggersResponse] = js.native
  def list(params: ParamsResourceAccountsContainersWorkspacesTriggersList): GaxiosPromise[SchemaListTriggersResponse] = js.native
  def list(
    params: ParamsResourceAccountsContainersWorkspacesTriggersList,
    callback: BodyResponseCallback[SchemaListTriggersResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceAccountsContainersWorkspacesTriggersList,
    options: BodyResponseCallback[SchemaListTriggersResponse],
    callback: BodyResponseCallback[SchemaListTriggersResponse]
  ): Unit = js.native
  def list(params: ParamsResourceAccountsContainersWorkspacesTriggersList, options: MethodOptions): GaxiosPromise[SchemaListTriggersResponse] = js.native
  def list(
    params: ParamsResourceAccountsContainersWorkspacesTriggersList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListTriggersResponse]
  ): Unit = js.native
  
  /**
    * tagmanager.accounts.containers.workspaces.triggers.revert
    * @desc Reverts changes to a GTM Trigger in a GTM Workspace.
    * @alias tagmanager.accounts.containers.workspaces.triggers.revert
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.fingerprint When provided, this fingerprint must match the fingerprint of the trigger in storage.
    * @param {string} params.path GTM Trigger's API relative path. Example: accounts/{account_id}/containers/{container_id}/workspaces/{workspace_id}/triggers/{trigger_id}
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def revert(): GaxiosPromise[SchemaRevertTriggerResponse] = js.native
  def revert(callback: BodyResponseCallback[SchemaRevertTriggerResponse]): Unit = js.native
  def revert(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaRevertTriggerResponse] = js.native
  def revert(params: ParamsResourceAccountsContainersWorkspacesTriggersRevert): GaxiosPromise[SchemaRevertTriggerResponse] = js.native
  def revert(
    params: ParamsResourceAccountsContainersWorkspacesTriggersRevert,
    callback: BodyResponseCallback[SchemaRevertTriggerResponse]
  ): Unit = js.native
  def revert(
    params: ParamsResourceAccountsContainersWorkspacesTriggersRevert,
    options: BodyResponseCallback[SchemaRevertTriggerResponse],
    callback: BodyResponseCallback[SchemaRevertTriggerResponse]
  ): Unit = js.native
  def revert(params: ParamsResourceAccountsContainersWorkspacesTriggersRevert, options: MethodOptions): GaxiosPromise[SchemaRevertTriggerResponse] = js.native
  def revert(
    params: ParamsResourceAccountsContainersWorkspacesTriggersRevert,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaRevertTriggerResponse]
  ): Unit = js.native
  
  /**
    * tagmanager.accounts.containers.workspaces.triggers.update
    * @desc Updates a GTM Trigger.
    * @alias tagmanager.accounts.containers.workspaces.triggers.update
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.fingerprint When provided, this fingerprint must match the fingerprint of the trigger in storage.
    * @param {string} params.path GTM Trigger's API relative path. Example: accounts/{account_id}/containers/{container_id}/workspaces/{workspace_id}/triggers/{trigger_id}
    * @param {().Trigger} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def update(): GaxiosPromise[SchemaTrigger] = js.native
  def update(callback: BodyResponseCallback[SchemaTrigger]): Unit = js.native
  def update(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaTrigger] = js.native
  def update(params: ParamsResourceAccountsContainersWorkspacesTriggersUpdate): GaxiosPromise[SchemaTrigger] = js.native
  def update(
    params: ParamsResourceAccountsContainersWorkspacesTriggersUpdate,
    callback: BodyResponseCallback[SchemaTrigger]
  ): Unit = js.native
  def update(
    params: ParamsResourceAccountsContainersWorkspacesTriggersUpdate,
    options: BodyResponseCallback[SchemaTrigger],
    callback: BodyResponseCallback[SchemaTrigger]
  ): Unit = js.native
  def update(params: ParamsResourceAccountsContainersWorkspacesTriggersUpdate, options: MethodOptions): GaxiosPromise[SchemaTrigger] = js.native
  def update(
    params: ParamsResourceAccountsContainersWorkspacesTriggersUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaTrigger]
  ): Unit = js.native
}
