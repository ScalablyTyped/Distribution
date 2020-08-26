package typings.googleapis.tagmanagerV2Mod.tagmanagerV2

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/tagmanager/v2", "tagmanager_v2.Resource$Accounts$Containers$Workspaces")
@js.native
class ResourceAccountsContainersWorkspaces protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var built_in_variables: ResourceAccountsContainersWorkspacesBuiltInVariables = js.native
  var context: APIRequestContext = js.native
  var folders: ResourceAccountsContainersWorkspacesFolders = js.native
  var tags: ResourceAccountsContainersWorkspacesTags = js.native
  var triggers: ResourceAccountsContainersWorkspacesTriggers = js.native
  var variables: ResourceAccountsContainersWorkspacesVariables = js.native
  var zones: ResourceAccountsContainersWorkspacesZones = js.native
  /**
    * tagmanager.accounts.containers.workspaces.create
    * @desc Creates a Workspace.
    * @alias tagmanager.accounts.containers.workspaces.create
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.parent GTM parent Container's API relative path. Example: accounts/{account_id}/containers/{container_id}
    * @param {().Workspace} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def create(): GaxiosPromise[SchemaWorkspace] = js.native
  def create(callback: BodyResponseCallback[SchemaWorkspace]): Unit = js.native
  def create(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaWorkspace] = js.native
  def create(params: ParamsResourceAccountsContainersWorkspacesCreate): GaxiosPromise[SchemaWorkspace] = js.native
  def create(
    params: ParamsResourceAccountsContainersWorkspacesCreate,
    callback: BodyResponseCallback[SchemaWorkspace]
  ): Unit = js.native
  def create(
    params: ParamsResourceAccountsContainersWorkspacesCreate,
    options: BodyResponseCallback[SchemaWorkspace],
    callback: BodyResponseCallback[SchemaWorkspace]
  ): Unit = js.native
  def create(params: ParamsResourceAccountsContainersWorkspacesCreate, options: MethodOptions): GaxiosPromise[SchemaWorkspace] = js.native
  def create(
    params: ParamsResourceAccountsContainersWorkspacesCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaWorkspace]
  ): Unit = js.native
  /**
    * tagmanager.accounts.containers.workspaces.create_version
    * @desc Creates a Container Version from the entities present in the
    * workspace, deletes the workspace, and sets the base container version to
    * the newly created version.
    * @alias tagmanager.accounts.containers.workspaces.create_version
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.path GTM Workspace's API relative path. Example: accounts/{account_id}/containers/{container_id}/workspaces/{workspace_id}
    * @param {().CreateContainerVersionRequestVersionOptions} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def create_version(): GaxiosPromise[SchemaCreateContainerVersionResponse] = js.native
  def create_version(callback: BodyResponseCallback[SchemaCreateContainerVersionResponse]): Unit = js.native
  def create_version(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaCreateContainerVersionResponse] = js.native
  def create_version(params: ParamsResourceAccountsContainersWorkspacesCreateVersion): GaxiosPromise[SchemaCreateContainerVersionResponse] = js.native
  def create_version(
    params: ParamsResourceAccountsContainersWorkspacesCreateVersion,
    callback: BodyResponseCallback[SchemaCreateContainerVersionResponse]
  ): Unit = js.native
  def create_version(
    params: ParamsResourceAccountsContainersWorkspacesCreateVersion,
    options: BodyResponseCallback[SchemaCreateContainerVersionResponse],
    callback: BodyResponseCallback[SchemaCreateContainerVersionResponse]
  ): Unit = js.native
  def create_version(params: ParamsResourceAccountsContainersWorkspacesCreateVersion, options: MethodOptions): GaxiosPromise[SchemaCreateContainerVersionResponse] = js.native
  def create_version(
    params: ParamsResourceAccountsContainersWorkspacesCreateVersion,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaCreateContainerVersionResponse]
  ): Unit = js.native
  /**
    * tagmanager.accounts.containers.workspaces.delete
    * @desc Deletes a Workspace.
    * @alias tagmanager.accounts.containers.workspaces.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.path GTM Workspace's API relative path. Example: accounts/{account_id}/containers/{container_id}/workspaces/{workspace_id}
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[Unit] = js.native
  def delete(callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceAccountsContainersWorkspacesDelete): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceAccountsContainersWorkspacesDelete, callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(
    params: ParamsResourceAccountsContainersWorkspacesDelete,
    options: BodyResponseCallback[Unit],
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def delete(params: ParamsResourceAccountsContainersWorkspacesDelete, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(
    params: ParamsResourceAccountsContainersWorkspacesDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  /**
    * tagmanager.accounts.containers.workspaces.get
    * @desc Gets a Workspace.
    * @alias tagmanager.accounts.containers.workspaces.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.path GTM Workspace's API relative path. Example: accounts/{account_id}/containers/{container_id}/workspaces/{workspace_id}
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaWorkspace] = js.native
  def get(callback: BodyResponseCallback[SchemaWorkspace]): Unit = js.native
  def get(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaWorkspace] = js.native
  def get(params: ParamsResourceAccountsContainersWorkspacesGet): GaxiosPromise[SchemaWorkspace] = js.native
  def get(
    params: ParamsResourceAccountsContainersWorkspacesGet,
    callback: BodyResponseCallback[SchemaWorkspace]
  ): Unit = js.native
  def get(
    params: ParamsResourceAccountsContainersWorkspacesGet,
    options: BodyResponseCallback[SchemaWorkspace],
    callback: BodyResponseCallback[SchemaWorkspace]
  ): Unit = js.native
  def get(params: ParamsResourceAccountsContainersWorkspacesGet, options: MethodOptions): GaxiosPromise[SchemaWorkspace] = js.native
  def get(
    params: ParamsResourceAccountsContainersWorkspacesGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaWorkspace]
  ): Unit = js.native
  /**
    * tagmanager.accounts.containers.workspaces.getStatus
    * @desc Finds conflicting and modified entities in the workspace.
    * @alias tagmanager.accounts.containers.workspaces.getStatus
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.path GTM Workspace's API relative path. Example: accounts/{account_id}/containers/{container_id}/workspaces/{workspace_id}
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def getStatus(): GaxiosPromise[SchemaGetWorkspaceStatusResponse] = js.native
  def getStatus(callback: BodyResponseCallback[SchemaGetWorkspaceStatusResponse]): Unit = js.native
  def getStatus(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaGetWorkspaceStatusResponse] = js.native
  def getStatus(params: ParamsResourceAccountsContainersWorkspacesGetstatus): GaxiosPromise[SchemaGetWorkspaceStatusResponse] = js.native
  def getStatus(
    params: ParamsResourceAccountsContainersWorkspacesGetstatus,
    callback: BodyResponseCallback[SchemaGetWorkspaceStatusResponse]
  ): Unit = js.native
  def getStatus(
    params: ParamsResourceAccountsContainersWorkspacesGetstatus,
    options: BodyResponseCallback[SchemaGetWorkspaceStatusResponse],
    callback: BodyResponseCallback[SchemaGetWorkspaceStatusResponse]
  ): Unit = js.native
  def getStatus(params: ParamsResourceAccountsContainersWorkspacesGetstatus, options: MethodOptions): GaxiosPromise[SchemaGetWorkspaceStatusResponse] = js.native
  def getStatus(
    params: ParamsResourceAccountsContainersWorkspacesGetstatus,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGetWorkspaceStatusResponse]
  ): Unit = js.native
  /**
    * tagmanager.accounts.containers.workspaces.list
    * @desc Lists all Workspaces that belong to a GTM Container.
    * @alias tagmanager.accounts.containers.workspaces.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.pageToken Continuation token for fetching the next page of results.
    * @param {string} params.parent GTM parent Container's API relative path. Example: accounts/{account_id}/containers/{container_id}
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaListWorkspacesResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListWorkspacesResponse]): Unit = js.native
  def list(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaListWorkspacesResponse] = js.native
  def list(params: ParamsResourceAccountsContainersWorkspacesList): GaxiosPromise[SchemaListWorkspacesResponse] = js.native
  def list(
    params: ParamsResourceAccountsContainersWorkspacesList,
    callback: BodyResponseCallback[SchemaListWorkspacesResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceAccountsContainersWorkspacesList,
    options: BodyResponseCallback[SchemaListWorkspacesResponse],
    callback: BodyResponseCallback[SchemaListWorkspacesResponse]
  ): Unit = js.native
  def list(params: ParamsResourceAccountsContainersWorkspacesList, options: MethodOptions): GaxiosPromise[SchemaListWorkspacesResponse] = js.native
  def list(
    params: ParamsResourceAccountsContainersWorkspacesList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListWorkspacesResponse]
  ): Unit = js.native
  /**
    * tagmanager.accounts.containers.workspaces.quick_preview
    * @desc Quick previews a workspace by creating a fake container version
    * from all entities in the provided workspace.
    * @alias tagmanager.accounts.containers.workspaces.quick_preview
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.path GTM Workspace's API relative path. Example: accounts/{account_id}/containers/{container_id}/workspaces/{workspace_id}
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def quick_preview(): GaxiosPromise[SchemaQuickPreviewResponse] = js.native
  def quick_preview(callback: BodyResponseCallback[SchemaQuickPreviewResponse]): Unit = js.native
  def quick_preview(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaQuickPreviewResponse] = js.native
  def quick_preview(params: ParamsResourceAccountsContainersWorkspacesQuickPreview): GaxiosPromise[SchemaQuickPreviewResponse] = js.native
  def quick_preview(
    params: ParamsResourceAccountsContainersWorkspacesQuickPreview,
    callback: BodyResponseCallback[SchemaQuickPreviewResponse]
  ): Unit = js.native
  def quick_preview(
    params: ParamsResourceAccountsContainersWorkspacesQuickPreview,
    options: BodyResponseCallback[SchemaQuickPreviewResponse],
    callback: BodyResponseCallback[SchemaQuickPreviewResponse]
  ): Unit = js.native
  def quick_preview(params: ParamsResourceAccountsContainersWorkspacesQuickPreview, options: MethodOptions): GaxiosPromise[SchemaQuickPreviewResponse] = js.native
  def quick_preview(
    params: ParamsResourceAccountsContainersWorkspacesQuickPreview,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaQuickPreviewResponse]
  ): Unit = js.native
  /**
    * tagmanager.accounts.containers.workspaces.resolve_conflict
    * @desc Resolves a merge conflict for a workspace entity by updating it to
    * the resolved entity passed in the request.
    * @alias tagmanager.accounts.containers.workspaces.resolve_conflict
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.fingerprint When provided, this fingerprint must match the fingerprint of the entity_in_workspace in the merge conflict.
    * @param {string} params.path GTM Workspace's API relative path. Example: accounts/{account_id}/containers/{container_id}/workspaces/{workspace_id}
    * @param {().Entity} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def resolve_conflict(): GaxiosPromise[Unit] = js.native
  def resolve_conflict(callback: BodyResponseCallback[Unit]): Unit = js.native
  def resolve_conflict(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[Unit] = js.native
  def resolve_conflict(params: ParamsResourceAccountsContainersWorkspacesResolveConflict): GaxiosPromise[Unit] = js.native
  def resolve_conflict(
    params: ParamsResourceAccountsContainersWorkspacesResolveConflict,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def resolve_conflict(
    params: ParamsResourceAccountsContainersWorkspacesResolveConflict,
    options: BodyResponseCallback[Unit],
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def resolve_conflict(params: ParamsResourceAccountsContainersWorkspacesResolveConflict, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def resolve_conflict(
    params: ParamsResourceAccountsContainersWorkspacesResolveConflict,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  /**
    * tagmanager.accounts.containers.workspaces.sync
    * @desc Syncs a workspace to the latest container version by updating all
    * unmodified workspace entities and displaying conflicts for modified
    * entities.
    * @alias tagmanager.accounts.containers.workspaces.sync
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.path GTM Workspace's API relative path. Example: accounts/{account_id}/containers/{container_id}/workspaces/{workspace_id}
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def sync(): GaxiosPromise[SchemaSyncWorkspaceResponse] = js.native
  def sync(callback: BodyResponseCallback[SchemaSyncWorkspaceResponse]): Unit = js.native
  def sync(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaSyncWorkspaceResponse] = js.native
  def sync(params: ParamsResourceAccountsContainersWorkspacesSync): GaxiosPromise[SchemaSyncWorkspaceResponse] = js.native
  def sync(
    params: ParamsResourceAccountsContainersWorkspacesSync,
    callback: BodyResponseCallback[SchemaSyncWorkspaceResponse]
  ): Unit = js.native
  def sync(
    params: ParamsResourceAccountsContainersWorkspacesSync,
    options: BodyResponseCallback[SchemaSyncWorkspaceResponse],
    callback: BodyResponseCallback[SchemaSyncWorkspaceResponse]
  ): Unit = js.native
  def sync(params: ParamsResourceAccountsContainersWorkspacesSync, options: MethodOptions): GaxiosPromise[SchemaSyncWorkspaceResponse] = js.native
  def sync(
    params: ParamsResourceAccountsContainersWorkspacesSync,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaSyncWorkspaceResponse]
  ): Unit = js.native
  /**
    * tagmanager.accounts.containers.workspaces.update
    * @desc Updates a Workspace.
    * @alias tagmanager.accounts.containers.workspaces.update
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.fingerprint When provided, this fingerprint must match the fingerprint of the workspace in storage.
    * @param {string} params.path GTM Workspace's API relative path. Example: accounts/{account_id}/containers/{container_id}/workspaces/{workspace_id}
    * @param {().Workspace} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def update(): GaxiosPromise[SchemaWorkspace] = js.native
  def update(callback: BodyResponseCallback[SchemaWorkspace]): Unit = js.native
  def update(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaWorkspace] = js.native
  def update(params: ParamsResourceAccountsContainersWorkspacesUpdate): GaxiosPromise[SchemaWorkspace] = js.native
  def update(
    params: ParamsResourceAccountsContainersWorkspacesUpdate,
    callback: BodyResponseCallback[SchemaWorkspace]
  ): Unit = js.native
  def update(
    params: ParamsResourceAccountsContainersWorkspacesUpdate,
    options: BodyResponseCallback[SchemaWorkspace],
    callback: BodyResponseCallback[SchemaWorkspace]
  ): Unit = js.native
  def update(params: ParamsResourceAccountsContainersWorkspacesUpdate, options: MethodOptions): GaxiosPromise[SchemaWorkspace] = js.native
  def update(
    params: ParamsResourceAccountsContainersWorkspacesUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaWorkspace]
  ): Unit = js.native
}

