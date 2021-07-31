package typings.googleapis.tagmanagerV2Mod.tagmanagerV2

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/tagmanager/v2", "tagmanager_v2.Resource$Accounts$Containers")
@js.native
class ResourceAccountsContainers protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  /**
    * tagmanager.accounts.containers.create
    * @desc Creates a Container.
    * @alias tagmanager.accounts.containers.create
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.parent GTM Account's API relative path. Example: accounts/{account_id}.
    * @param {().Container} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def create(): GaxiosPromise[SchemaContainer] = js.native
  def create(callback: BodyResponseCallback[SchemaContainer]): Unit = js.native
  def create(params: Unit, options: MethodOptions): GaxiosPromise[SchemaContainer] = js.native
  def create(params: ParamsResourceAccountsContainersCreate): GaxiosPromise[SchemaContainer] = js.native
  def create(params: ParamsResourceAccountsContainersCreate, callback: BodyResponseCallback[SchemaContainer]): Unit = js.native
  def create(
    params: ParamsResourceAccountsContainersCreate,
    options: BodyResponseCallback[SchemaContainer],
    callback: BodyResponseCallback[SchemaContainer]
  ): Unit = js.native
  def create(params: ParamsResourceAccountsContainersCreate, options: MethodOptions): GaxiosPromise[SchemaContainer] = js.native
  def create(
    params: ParamsResourceAccountsContainersCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaContainer]
  ): Unit = js.native
  
  /**
    * tagmanager.accounts.containers.delete
    * @desc Deletes a Container.
    * @alias tagmanager.accounts.containers.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.path GTM Container's API relative path. Example: accounts/{account_id}/containers/{container_id}
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[Unit] = js.native
  def delete(callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceAccountsContainersDelete): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceAccountsContainersDelete, callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(
    params: ParamsResourceAccountsContainersDelete,
    options: BodyResponseCallback[Unit],
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def delete(params: ParamsResourceAccountsContainersDelete, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(
    params: ParamsResourceAccountsContainersDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  
  var environments: ResourceAccountsContainersEnvironments = js.native
  
  /**
    * tagmanager.accounts.containers.get
    * @desc Gets a Container.
    * @alias tagmanager.accounts.containers.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.path GTM Container's API relative path. Example: accounts/{account_id}/containers/{container_id}
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaContainer] = js.native
  def get(callback: BodyResponseCallback[SchemaContainer]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaContainer] = js.native
  def get(params: ParamsResourceAccountsContainersGet): GaxiosPromise[SchemaContainer] = js.native
  def get(params: ParamsResourceAccountsContainersGet, callback: BodyResponseCallback[SchemaContainer]): Unit = js.native
  def get(
    params: ParamsResourceAccountsContainersGet,
    options: BodyResponseCallback[SchemaContainer],
    callback: BodyResponseCallback[SchemaContainer]
  ): Unit = js.native
  def get(params: ParamsResourceAccountsContainersGet, options: MethodOptions): GaxiosPromise[SchemaContainer] = js.native
  def get(
    params: ParamsResourceAccountsContainersGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaContainer]
  ): Unit = js.native
  
  /**
    * tagmanager.accounts.containers.list
    * @desc Lists all Containers that belongs to a GTM Account.
    * @alias tagmanager.accounts.containers.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.pageToken Continuation token for fetching the next page of results.
    * @param {string} params.parent GTM Accounts's API relative path. Example: accounts/{account_id}.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaListContainersResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListContainersResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListContainersResponse] = js.native
  def list(params: ParamsResourceAccountsContainersList): GaxiosPromise[SchemaListContainersResponse] = js.native
  def list(
    params: ParamsResourceAccountsContainersList,
    callback: BodyResponseCallback[SchemaListContainersResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceAccountsContainersList,
    options: BodyResponseCallback[SchemaListContainersResponse],
    callback: BodyResponseCallback[SchemaListContainersResponse]
  ): Unit = js.native
  def list(params: ParamsResourceAccountsContainersList, options: MethodOptions): GaxiosPromise[SchemaListContainersResponse] = js.native
  def list(
    params: ParamsResourceAccountsContainersList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListContainersResponse]
  ): Unit = js.native
  
  /**
    * tagmanager.accounts.containers.update
    * @desc Updates a Container.
    * @alias tagmanager.accounts.containers.update
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.fingerprint When provided, this fingerprint must match the fingerprint of the container in storage.
    * @param {string} params.path GTM Container's API relative path. Example: accounts/{account_id}/containers/{container_id}
    * @param {().Container} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def update(): GaxiosPromise[SchemaContainer] = js.native
  def update(callback: BodyResponseCallback[SchemaContainer]): Unit = js.native
  def update(params: Unit, options: MethodOptions): GaxiosPromise[SchemaContainer] = js.native
  def update(params: ParamsResourceAccountsContainersUpdate): GaxiosPromise[SchemaContainer] = js.native
  def update(params: ParamsResourceAccountsContainersUpdate, callback: BodyResponseCallback[SchemaContainer]): Unit = js.native
  def update(
    params: ParamsResourceAccountsContainersUpdate,
    options: BodyResponseCallback[SchemaContainer],
    callback: BodyResponseCallback[SchemaContainer]
  ): Unit = js.native
  def update(params: ParamsResourceAccountsContainersUpdate, options: MethodOptions): GaxiosPromise[SchemaContainer] = js.native
  def update(
    params: ParamsResourceAccountsContainersUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaContainer]
  ): Unit = js.native
  
  var version_headers: ResourceAccountsContainersVersionHeaders = js.native
  
  var versions: ResourceAccountsContainersVersions = js.native
  
  var workspaces: ResourceAccountsContainersWorkspaces = js.native
}
