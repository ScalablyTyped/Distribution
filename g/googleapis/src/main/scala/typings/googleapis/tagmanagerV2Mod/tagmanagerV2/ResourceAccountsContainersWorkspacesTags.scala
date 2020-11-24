package typings.googleapis.tagmanagerV2Mod.tagmanagerV2

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/tagmanager/v2", "tagmanager_v2.Resource$Accounts$Containers$Workspaces$Tags")
@js.native
class ResourceAccountsContainersWorkspacesTags protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  /**
    * tagmanager.accounts.containers.workspaces.tags.create
    * @desc Creates a GTM Tag.
    * @alias tagmanager.accounts.containers.workspaces.tags.create
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.parent GTM Workspace's API relative path. Example: accounts/{account_id}/containers/{container_id}/workspaces/{workspace_id}
    * @param {().Tag} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def create(): GaxiosPromise[SchemaTag] = js.native
  def create(callback: BodyResponseCallback[SchemaTag]): Unit = js.native
  def create(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaTag] = js.native
  def create(params: ParamsResourceAccountsContainersWorkspacesTagsCreate): GaxiosPromise[SchemaTag] = js.native
  def create(
    params: ParamsResourceAccountsContainersWorkspacesTagsCreate,
    callback: BodyResponseCallback[SchemaTag]
  ): Unit = js.native
  def create(
    params: ParamsResourceAccountsContainersWorkspacesTagsCreate,
    options: BodyResponseCallback[SchemaTag],
    callback: BodyResponseCallback[SchemaTag]
  ): Unit = js.native
  def create(params: ParamsResourceAccountsContainersWorkspacesTagsCreate, options: MethodOptions): GaxiosPromise[SchemaTag] = js.native
  def create(
    params: ParamsResourceAccountsContainersWorkspacesTagsCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaTag]
  ): Unit = js.native
  
  /**
    * tagmanager.accounts.containers.workspaces.tags.delete
    * @desc Deletes a GTM Tag.
    * @alias tagmanager.accounts.containers.workspaces.tags.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.path GTM Tag's API relative path. Example: accounts/{account_id}/containers/{container_id}/workspaces/{workspace_id}/tags/{tag_id}
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[Unit] = js.native
  def delete(callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceAccountsContainersWorkspacesTagsDelete): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceAccountsContainersWorkspacesTagsDelete, callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(
    params: ParamsResourceAccountsContainersWorkspacesTagsDelete,
    options: BodyResponseCallback[Unit],
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def delete(params: ParamsResourceAccountsContainersWorkspacesTagsDelete, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(
    params: ParamsResourceAccountsContainersWorkspacesTagsDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  
  /**
    * tagmanager.accounts.containers.workspaces.tags.get
    * @desc Gets a GTM Tag.
    * @alias tagmanager.accounts.containers.workspaces.tags.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.path GTM Tag's API relative path. Example: accounts/{account_id}/containers/{container_id}/workspaces/{workspace_id}/tags/{tag_id}
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaTag] = js.native
  def get(callback: BodyResponseCallback[SchemaTag]): Unit = js.native
  def get(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaTag] = js.native
  def get(params: ParamsResourceAccountsContainersWorkspacesTagsGet): GaxiosPromise[SchemaTag] = js.native
  def get(
    params: ParamsResourceAccountsContainersWorkspacesTagsGet,
    callback: BodyResponseCallback[SchemaTag]
  ): Unit = js.native
  def get(
    params: ParamsResourceAccountsContainersWorkspacesTagsGet,
    options: BodyResponseCallback[SchemaTag],
    callback: BodyResponseCallback[SchemaTag]
  ): Unit = js.native
  def get(params: ParamsResourceAccountsContainersWorkspacesTagsGet, options: MethodOptions): GaxiosPromise[SchemaTag] = js.native
  def get(
    params: ParamsResourceAccountsContainersWorkspacesTagsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaTag]
  ): Unit = js.native
  
  /**
    * tagmanager.accounts.containers.workspaces.tags.list
    * @desc Lists all GTM Tags of a Container.
    * @alias tagmanager.accounts.containers.workspaces.tags.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.pageToken Continuation token for fetching the next page of results.
    * @param {string} params.parent GTM Workspace's API relative path. Example: accounts/{account_id}/containers/{container_id}/workspaces/{workspace_id}
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaListTagsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListTagsResponse]): Unit = js.native
  def list(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaListTagsResponse] = js.native
  def list(params: ParamsResourceAccountsContainersWorkspacesTagsList): GaxiosPromise[SchemaListTagsResponse] = js.native
  def list(
    params: ParamsResourceAccountsContainersWorkspacesTagsList,
    callback: BodyResponseCallback[SchemaListTagsResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceAccountsContainersWorkspacesTagsList,
    options: BodyResponseCallback[SchemaListTagsResponse],
    callback: BodyResponseCallback[SchemaListTagsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceAccountsContainersWorkspacesTagsList, options: MethodOptions): GaxiosPromise[SchemaListTagsResponse] = js.native
  def list(
    params: ParamsResourceAccountsContainersWorkspacesTagsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListTagsResponse]
  ): Unit = js.native
  
  /**
    * tagmanager.accounts.containers.workspaces.tags.revert
    * @desc Reverts changes to a GTM Tag in a GTM Workspace.
    * @alias tagmanager.accounts.containers.workspaces.tags.revert
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.fingerprint When provided, this fingerprint must match the fingerprint of thetag in storage.
    * @param {string} params.path GTM Tag's API relative path. Example: accounts/{account_id}/containers/{container_id}/workspaces/{workspace_id}/tags/{tag_id}
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def revert(): GaxiosPromise[SchemaRevertTagResponse] = js.native
  def revert(callback: BodyResponseCallback[SchemaRevertTagResponse]): Unit = js.native
  def revert(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaRevertTagResponse] = js.native
  def revert(params: ParamsResourceAccountsContainersWorkspacesTagsRevert): GaxiosPromise[SchemaRevertTagResponse] = js.native
  def revert(
    params: ParamsResourceAccountsContainersWorkspacesTagsRevert,
    callback: BodyResponseCallback[SchemaRevertTagResponse]
  ): Unit = js.native
  def revert(
    params: ParamsResourceAccountsContainersWorkspacesTagsRevert,
    options: BodyResponseCallback[SchemaRevertTagResponse],
    callback: BodyResponseCallback[SchemaRevertTagResponse]
  ): Unit = js.native
  def revert(params: ParamsResourceAccountsContainersWorkspacesTagsRevert, options: MethodOptions): GaxiosPromise[SchemaRevertTagResponse] = js.native
  def revert(
    params: ParamsResourceAccountsContainersWorkspacesTagsRevert,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaRevertTagResponse]
  ): Unit = js.native
  
  /**
    * tagmanager.accounts.containers.workspaces.tags.update
    * @desc Updates a GTM Tag.
    * @alias tagmanager.accounts.containers.workspaces.tags.update
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.fingerprint When provided, this fingerprint must match the fingerprint of the tag in storage.
    * @param {string} params.path GTM Tag's API relative path. Example: accounts/{account_id}/containers/{container_id}/workspaces/{workspace_id}/tags/{tag_id}
    * @param {().Tag} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def update(): GaxiosPromise[SchemaTag] = js.native
  def update(callback: BodyResponseCallback[SchemaTag]): Unit = js.native
  def update(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaTag] = js.native
  def update(params: ParamsResourceAccountsContainersWorkspacesTagsUpdate): GaxiosPromise[SchemaTag] = js.native
  def update(
    params: ParamsResourceAccountsContainersWorkspacesTagsUpdate,
    callback: BodyResponseCallback[SchemaTag]
  ): Unit = js.native
  def update(
    params: ParamsResourceAccountsContainersWorkspacesTagsUpdate,
    options: BodyResponseCallback[SchemaTag],
    callback: BodyResponseCallback[SchemaTag]
  ): Unit = js.native
  def update(params: ParamsResourceAccountsContainersWorkspacesTagsUpdate, options: MethodOptions): GaxiosPromise[SchemaTag] = js.native
  def update(
    params: ParamsResourceAccountsContainersWorkspacesTagsUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaTag]
  ): Unit = js.native
}
