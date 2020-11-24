package typings.googleapis.tagmanagerV2Mod.tagmanagerV2

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/tagmanager/v2", "tagmanager_v2.Resource$Accounts$Containers$Workspaces$Zones")
@js.native
class ResourceAccountsContainersWorkspacesZones protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  /**
    * tagmanager.accounts.containers.workspaces.zones.create
    * @desc Creates a GTM Zone.
    * @alias tagmanager.accounts.containers.workspaces.zones.create
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.parent GTM Workspace's API relative path. Example: accounts/{account_id}/containers/{container_id}/workspaces/{workspace_id}
    * @param {().Zone} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def create(): GaxiosPromise[SchemaZone] = js.native
  def create(callback: BodyResponseCallback[SchemaZone]): Unit = js.native
  def create(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaZone] = js.native
  def create(params: ParamsResourceAccountsContainersWorkspacesZonesCreate): GaxiosPromise[SchemaZone] = js.native
  def create(
    params: ParamsResourceAccountsContainersWorkspacesZonesCreate,
    callback: BodyResponseCallback[SchemaZone]
  ): Unit = js.native
  def create(
    params: ParamsResourceAccountsContainersWorkspacesZonesCreate,
    options: BodyResponseCallback[SchemaZone],
    callback: BodyResponseCallback[SchemaZone]
  ): Unit = js.native
  def create(params: ParamsResourceAccountsContainersWorkspacesZonesCreate, options: MethodOptions): GaxiosPromise[SchemaZone] = js.native
  def create(
    params: ParamsResourceAccountsContainersWorkspacesZonesCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaZone]
  ): Unit = js.native
  
  /**
    * tagmanager.accounts.containers.workspaces.zones.delete
    * @desc Deletes a GTM Zone.
    * @alias tagmanager.accounts.containers.workspaces.zones.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.path GTM Zone's API relative path. Example: accounts/{account_id}/containers/{container_id}/workspaces/{workspace_id}/zones/{zone_id}
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[Unit] = js.native
  def delete(callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceAccountsContainersWorkspacesZonesDelete): GaxiosPromise[Unit] = js.native
  def delete(
    params: ParamsResourceAccountsContainersWorkspacesZonesDelete,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def delete(
    params: ParamsResourceAccountsContainersWorkspacesZonesDelete,
    options: BodyResponseCallback[Unit],
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def delete(params: ParamsResourceAccountsContainersWorkspacesZonesDelete, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(
    params: ParamsResourceAccountsContainersWorkspacesZonesDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  
  /**
    * tagmanager.accounts.containers.workspaces.zones.get
    * @desc Gets a GTM Zone.
    * @alias tagmanager.accounts.containers.workspaces.zones.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.path GTM Zone's API relative path. Example: accounts/{account_id}/containers/{container_id}/workspaces/{workspace_id}/zones/{zone_id}
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaZone] = js.native
  def get(callback: BodyResponseCallback[SchemaZone]): Unit = js.native
  def get(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaZone] = js.native
  def get(params: ParamsResourceAccountsContainersWorkspacesZonesGet): GaxiosPromise[SchemaZone] = js.native
  def get(
    params: ParamsResourceAccountsContainersWorkspacesZonesGet,
    callback: BodyResponseCallback[SchemaZone]
  ): Unit = js.native
  def get(
    params: ParamsResourceAccountsContainersWorkspacesZonesGet,
    options: BodyResponseCallback[SchemaZone],
    callback: BodyResponseCallback[SchemaZone]
  ): Unit = js.native
  def get(params: ParamsResourceAccountsContainersWorkspacesZonesGet, options: MethodOptions): GaxiosPromise[SchemaZone] = js.native
  def get(
    params: ParamsResourceAccountsContainersWorkspacesZonesGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaZone]
  ): Unit = js.native
  
  /**
    * tagmanager.accounts.containers.workspaces.zones.list
    * @desc Lists all GTM Zones of a GTM container workspace.
    * @alias tagmanager.accounts.containers.workspaces.zones.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.pageToken Continuation token for fetching the next page of results.
    * @param {string} params.parent GTM Workspace's API relative path. Example: accounts/{account_id}/containers/{container_id}/workspaces/{workspace_id}
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaListZonesResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListZonesResponse]): Unit = js.native
  def list(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaListZonesResponse] = js.native
  def list(params: ParamsResourceAccountsContainersWorkspacesZonesList): GaxiosPromise[SchemaListZonesResponse] = js.native
  def list(
    params: ParamsResourceAccountsContainersWorkspacesZonesList,
    callback: BodyResponseCallback[SchemaListZonesResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceAccountsContainersWorkspacesZonesList,
    options: BodyResponseCallback[SchemaListZonesResponse],
    callback: BodyResponseCallback[SchemaListZonesResponse]
  ): Unit = js.native
  def list(params: ParamsResourceAccountsContainersWorkspacesZonesList, options: MethodOptions): GaxiosPromise[SchemaListZonesResponse] = js.native
  def list(
    params: ParamsResourceAccountsContainersWorkspacesZonesList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListZonesResponse]
  ): Unit = js.native
  
  /**
    * tagmanager.accounts.containers.workspaces.zones.revert
    * @desc Reverts changes to a GTM Zone in a GTM Workspace.
    * @alias tagmanager.accounts.containers.workspaces.zones.revert
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.fingerprint When provided, this fingerprint must match the fingerprint of the zone in storage.
    * @param {string} params.path GTM Zone's API relative path. Example: accounts/{account_id}/containers/{container_id}/workspaces/{workspace_id}/zones/{zone_id}
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def revert(): GaxiosPromise[SchemaRevertZoneResponse] = js.native
  def revert(callback: BodyResponseCallback[SchemaRevertZoneResponse]): Unit = js.native
  def revert(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaRevertZoneResponse] = js.native
  def revert(params: ParamsResourceAccountsContainersWorkspacesZonesRevert): GaxiosPromise[SchemaRevertZoneResponse] = js.native
  def revert(
    params: ParamsResourceAccountsContainersWorkspacesZonesRevert,
    callback: BodyResponseCallback[SchemaRevertZoneResponse]
  ): Unit = js.native
  def revert(
    params: ParamsResourceAccountsContainersWorkspacesZonesRevert,
    options: BodyResponseCallback[SchemaRevertZoneResponse],
    callback: BodyResponseCallback[SchemaRevertZoneResponse]
  ): Unit = js.native
  def revert(params: ParamsResourceAccountsContainersWorkspacesZonesRevert, options: MethodOptions): GaxiosPromise[SchemaRevertZoneResponse] = js.native
  def revert(
    params: ParamsResourceAccountsContainersWorkspacesZonesRevert,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaRevertZoneResponse]
  ): Unit = js.native
  
  /**
    * tagmanager.accounts.containers.workspaces.zones.update
    * @desc Updates a GTM Zone.
    * @alias tagmanager.accounts.containers.workspaces.zones.update
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.fingerprint When provided, this fingerprint must match the fingerprint of the zone in storage.
    * @param {string} params.path GTM Zone's API relative path. Example: accounts/{account_id}/containers/{container_id}/workspaces/{workspace_id}/zones/{zone_id}
    * @param {().Zone} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def update(): GaxiosPromise[SchemaZone] = js.native
  def update(callback: BodyResponseCallback[SchemaZone]): Unit = js.native
  def update(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaZone] = js.native
  def update(params: ParamsResourceAccountsContainersWorkspacesZonesUpdate): GaxiosPromise[SchemaZone] = js.native
  def update(
    params: ParamsResourceAccountsContainersWorkspacesZonesUpdate,
    callback: BodyResponseCallback[SchemaZone]
  ): Unit = js.native
  def update(
    params: ParamsResourceAccountsContainersWorkspacesZonesUpdate,
    options: BodyResponseCallback[SchemaZone],
    callback: BodyResponseCallback[SchemaZone]
  ): Unit = js.native
  def update(params: ParamsResourceAccountsContainersWorkspacesZonesUpdate, options: MethodOptions): GaxiosPromise[SchemaZone] = js.native
  def update(
    params: ParamsResourceAccountsContainersWorkspacesZonesUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaZone]
  ): Unit = js.native
}
