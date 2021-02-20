package typings.googleapis.tagmanagerV2Mod.tagmanagerV2

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/tagmanager/v2", "tagmanager_v2.Resource$Accounts$Containers$Workspaces$Folders")
@js.native
class ResourceAccountsContainersWorkspacesFolders protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  /**
    * tagmanager.accounts.containers.workspaces.folders.create
    * @desc Creates a GTM Folder.
    * @alias tagmanager.accounts.containers.workspaces.folders.create
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.parent GTM Workspace's API relative path. Example: accounts/{account_id}/containers/{container_id}/workspaces/{workspace_id}
    * @param {().Folder} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def create(): GaxiosPromise[SchemaFolder] = js.native
  def create(callback: BodyResponseCallback[SchemaFolder]): Unit = js.native
  def create(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaFolder] = js.native
  def create(params: ParamsResourceAccountsContainersWorkspacesFoldersCreate): GaxiosPromise[SchemaFolder] = js.native
  def create(
    params: ParamsResourceAccountsContainersWorkspacesFoldersCreate,
    callback: BodyResponseCallback[SchemaFolder]
  ): Unit = js.native
  def create(
    params: ParamsResourceAccountsContainersWorkspacesFoldersCreate,
    options: BodyResponseCallback[SchemaFolder],
    callback: BodyResponseCallback[SchemaFolder]
  ): Unit = js.native
  def create(params: ParamsResourceAccountsContainersWorkspacesFoldersCreate, options: MethodOptions): GaxiosPromise[SchemaFolder] = js.native
  def create(
    params: ParamsResourceAccountsContainersWorkspacesFoldersCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaFolder]
  ): Unit = js.native
  
  /**
    * tagmanager.accounts.containers.workspaces.folders.delete
    * @desc Deletes a GTM Folder.
    * @alias tagmanager.accounts.containers.workspaces.folders.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.path GTM Folder's API relative path. Example: accounts/{account_id}/containers/{container_id}/workspaces/{workspace_id}/folders/{folder_id}
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[Unit] = js.native
  def delete(callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceAccountsContainersWorkspacesFoldersDelete): GaxiosPromise[Unit] = js.native
  def delete(
    params: ParamsResourceAccountsContainersWorkspacesFoldersDelete,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def delete(
    params: ParamsResourceAccountsContainersWorkspacesFoldersDelete,
    options: BodyResponseCallback[Unit],
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def delete(params: ParamsResourceAccountsContainersWorkspacesFoldersDelete, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(
    params: ParamsResourceAccountsContainersWorkspacesFoldersDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  
  /**
    * tagmanager.accounts.containers.workspaces.folders.entities
    * @desc List all entities in a GTM Folder.
    * @alias tagmanager.accounts.containers.workspaces.folders.entities
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.pageToken Continuation token for fetching the next page of results.
    * @param {string} params.path GTM Folder's API relative path. Example: accounts/{account_id}/containers/{container_id}/workspaces/{workspace_id}/folders/{folder_id}
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def entities(): GaxiosPromise[SchemaFolderEntities] = js.native
  def entities(callback: BodyResponseCallback[SchemaFolderEntities]): Unit = js.native
  def entities(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaFolderEntities] = js.native
  def entities(params: ParamsResourceAccountsContainersWorkspacesFoldersEntities): GaxiosPromise[SchemaFolderEntities] = js.native
  def entities(
    params: ParamsResourceAccountsContainersWorkspacesFoldersEntities,
    callback: BodyResponseCallback[SchemaFolderEntities]
  ): Unit = js.native
  def entities(
    params: ParamsResourceAccountsContainersWorkspacesFoldersEntities,
    options: BodyResponseCallback[SchemaFolderEntities],
    callback: BodyResponseCallback[SchemaFolderEntities]
  ): Unit = js.native
  def entities(params: ParamsResourceAccountsContainersWorkspacesFoldersEntities, options: MethodOptions): GaxiosPromise[SchemaFolderEntities] = js.native
  def entities(
    params: ParamsResourceAccountsContainersWorkspacesFoldersEntities,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaFolderEntities]
  ): Unit = js.native
  
  /**
    * tagmanager.accounts.containers.workspaces.folders.get
    * @desc Gets a GTM Folder.
    * @alias tagmanager.accounts.containers.workspaces.folders.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.path GTM Folder's API relative path. Example: accounts/{account_id}/containers/{container_id}/workspaces/{workspace_id}/folders/{folder_id}
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaFolder] = js.native
  def get(callback: BodyResponseCallback[SchemaFolder]): Unit = js.native
  def get(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaFolder] = js.native
  def get(params: ParamsResourceAccountsContainersWorkspacesFoldersGet): GaxiosPromise[SchemaFolder] = js.native
  def get(
    params: ParamsResourceAccountsContainersWorkspacesFoldersGet,
    callback: BodyResponseCallback[SchemaFolder]
  ): Unit = js.native
  def get(
    params: ParamsResourceAccountsContainersWorkspacesFoldersGet,
    options: BodyResponseCallback[SchemaFolder],
    callback: BodyResponseCallback[SchemaFolder]
  ): Unit = js.native
  def get(params: ParamsResourceAccountsContainersWorkspacesFoldersGet, options: MethodOptions): GaxiosPromise[SchemaFolder] = js.native
  def get(
    params: ParamsResourceAccountsContainersWorkspacesFoldersGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaFolder]
  ): Unit = js.native
  
  /**
    * tagmanager.accounts.containers.workspaces.folders.list
    * @desc Lists all GTM Folders of a Container.
    * @alias tagmanager.accounts.containers.workspaces.folders.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.pageToken Continuation token for fetching the next page of results.
    * @param {string} params.parent GTM Workspace's API relative path. Example: accounts/{account_id}/containers/{container_id}/workspaces/{workspace_id}
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaListFoldersResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListFoldersResponse]): Unit = js.native
  def list(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaListFoldersResponse] = js.native
  def list(params: ParamsResourceAccountsContainersWorkspacesFoldersList): GaxiosPromise[SchemaListFoldersResponse] = js.native
  def list(
    params: ParamsResourceAccountsContainersWorkspacesFoldersList,
    callback: BodyResponseCallback[SchemaListFoldersResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceAccountsContainersWorkspacesFoldersList,
    options: BodyResponseCallback[SchemaListFoldersResponse],
    callback: BodyResponseCallback[SchemaListFoldersResponse]
  ): Unit = js.native
  def list(params: ParamsResourceAccountsContainersWorkspacesFoldersList, options: MethodOptions): GaxiosPromise[SchemaListFoldersResponse] = js.native
  def list(
    params: ParamsResourceAccountsContainersWorkspacesFoldersList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListFoldersResponse]
  ): Unit = js.native
  
  /**
    * tagmanager.accounts.containers.workspaces.folders.move_entities_to_folder
    * @desc Moves entities to a GTM Folder.
    * @alias
    * tagmanager.accounts.containers.workspaces.folders.move_entities_to_folder
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.path GTM Folder's API relative path. Example: accounts/{account_id}/containers/{container_id}/workspaces/{workspace_id}/folders/{folder_id}
    * @param {string=} params.tagId The tags to be moved to the folder.
    * @param {string=} params.triggerId The triggers to be moved to the folder.
    * @param {string=} params.variableId The variables to be moved to the folder.
    * @param {().Folder} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def move_entities_to_folder(): GaxiosPromise[Unit] = js.native
  def move_entities_to_folder(callback: BodyResponseCallback[Unit]): Unit = js.native
  def move_entities_to_folder(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[Unit] = js.native
  def move_entities_to_folder(params: ParamsResourceAccountsContainersWorkspacesFoldersMoveEntitiesToFolder): GaxiosPromise[Unit] = js.native
  def move_entities_to_folder(
    params: ParamsResourceAccountsContainersWorkspacesFoldersMoveEntitiesToFolder,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def move_entities_to_folder(
    params: ParamsResourceAccountsContainersWorkspacesFoldersMoveEntitiesToFolder,
    options: BodyResponseCallback[Unit],
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def move_entities_to_folder(
    params: ParamsResourceAccountsContainersWorkspacesFoldersMoveEntitiesToFolder,
    options: MethodOptions
  ): GaxiosPromise[Unit] = js.native
  def move_entities_to_folder(
    params: ParamsResourceAccountsContainersWorkspacesFoldersMoveEntitiesToFolder,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  
  /**
    * tagmanager.accounts.containers.workspaces.folders.revert
    * @desc Reverts changes to a GTM Folder in a GTM Workspace.
    * @alias tagmanager.accounts.containers.workspaces.folders.revert
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.fingerprint When provided, this fingerprint must match the fingerprint of the tag in storage.
    * @param {string} params.path GTM Folder's API relative path. Example: accounts/{account_id}/containers/{container_id}/workspaces/{workspace_id}/folders/{folder_id}
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def revert(): GaxiosPromise[SchemaRevertFolderResponse] = js.native
  def revert(callback: BodyResponseCallback[SchemaRevertFolderResponse]): Unit = js.native
  def revert(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaRevertFolderResponse] = js.native
  def revert(params: ParamsResourceAccountsContainersWorkspacesFoldersRevert): GaxiosPromise[SchemaRevertFolderResponse] = js.native
  def revert(
    params: ParamsResourceAccountsContainersWorkspacesFoldersRevert,
    callback: BodyResponseCallback[SchemaRevertFolderResponse]
  ): Unit = js.native
  def revert(
    params: ParamsResourceAccountsContainersWorkspacesFoldersRevert,
    options: BodyResponseCallback[SchemaRevertFolderResponse],
    callback: BodyResponseCallback[SchemaRevertFolderResponse]
  ): Unit = js.native
  def revert(params: ParamsResourceAccountsContainersWorkspacesFoldersRevert, options: MethodOptions): GaxiosPromise[SchemaRevertFolderResponse] = js.native
  def revert(
    params: ParamsResourceAccountsContainersWorkspacesFoldersRevert,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaRevertFolderResponse]
  ): Unit = js.native
  
  /**
    * tagmanager.accounts.containers.workspaces.folders.update
    * @desc Updates a GTM Folder.
    * @alias tagmanager.accounts.containers.workspaces.folders.update
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.fingerprint When provided, this fingerprint must match the fingerprint of the folder in storage.
    * @param {string} params.path GTM Folder's API relative path. Example: accounts/{account_id}/containers/{container_id}/workspaces/{workspace_id}/folders/{folder_id}
    * @param {().Folder} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def update(): GaxiosPromise[SchemaFolder] = js.native
  def update(callback: BodyResponseCallback[SchemaFolder]): Unit = js.native
  def update(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaFolder] = js.native
  def update(params: ParamsResourceAccountsContainersWorkspacesFoldersUpdate): GaxiosPromise[SchemaFolder] = js.native
  def update(
    params: ParamsResourceAccountsContainersWorkspacesFoldersUpdate,
    callback: BodyResponseCallback[SchemaFolder]
  ): Unit = js.native
  def update(
    params: ParamsResourceAccountsContainersWorkspacesFoldersUpdate,
    options: BodyResponseCallback[SchemaFolder],
    callback: BodyResponseCallback[SchemaFolder]
  ): Unit = js.native
  def update(params: ParamsResourceAccountsContainersWorkspacesFoldersUpdate, options: MethodOptions): GaxiosPromise[SchemaFolder] = js.native
  def update(
    params: ParamsResourceAccountsContainersWorkspacesFoldersUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaFolder]
  ): Unit = js.native
}
