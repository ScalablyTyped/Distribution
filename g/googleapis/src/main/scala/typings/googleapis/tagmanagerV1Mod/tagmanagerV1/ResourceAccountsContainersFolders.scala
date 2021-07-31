package typings.googleapis.tagmanagerV1Mod.tagmanagerV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/tagmanager/v1", "tagmanager_v1.Resource$Accounts$Containers$Folders")
@js.native
class ResourceAccountsContainersFolders protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  /**
    * tagmanager.accounts.containers.folders.create
    * @desc Creates a GTM Folder.
    * @alias tagmanager.accounts.containers.folders.create
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.accountId The GTM Account ID.
    * @param {string} params.containerId The GTM Container ID.
    * @param {().Folder} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def create(): GaxiosPromise[SchemaFolder] = js.native
  def create(callback: BodyResponseCallback[SchemaFolder]): Unit = js.native
  def create(params: Unit, options: MethodOptions): GaxiosPromise[SchemaFolder] = js.native
  def create(params: ParamsResourceAccountsContainersFoldersCreate): GaxiosPromise[SchemaFolder] = js.native
  def create(
    params: ParamsResourceAccountsContainersFoldersCreate,
    callback: BodyResponseCallback[SchemaFolder]
  ): Unit = js.native
  def create(
    params: ParamsResourceAccountsContainersFoldersCreate,
    options: BodyResponseCallback[SchemaFolder],
    callback: BodyResponseCallback[SchemaFolder]
  ): Unit = js.native
  def create(params: ParamsResourceAccountsContainersFoldersCreate, options: MethodOptions): GaxiosPromise[SchemaFolder] = js.native
  def create(
    params: ParamsResourceAccountsContainersFoldersCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaFolder]
  ): Unit = js.native
  
  /**
    * tagmanager.accounts.containers.folders.delete
    * @desc Deletes a GTM Folder.
    * @alias tagmanager.accounts.containers.folders.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.accountId The GTM Account ID.
    * @param {string} params.containerId The GTM Container ID.
    * @param {string} params.folderId The GTM Folder ID.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[Unit] = js.native
  def delete(callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceAccountsContainersFoldersDelete): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceAccountsContainersFoldersDelete, callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(
    params: ParamsResourceAccountsContainersFoldersDelete,
    options: BodyResponseCallback[Unit],
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def delete(params: ParamsResourceAccountsContainersFoldersDelete, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(
    params: ParamsResourceAccountsContainersFoldersDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  
  var entities: ResourceAccountsContainersFoldersEntities = js.native
  
  /**
    * tagmanager.accounts.containers.folders.get
    * @desc Gets a GTM Folder.
    * @alias tagmanager.accounts.containers.folders.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.accountId The GTM Account ID.
    * @param {string} params.containerId The GTM Container ID.
    * @param {string} params.folderId The GTM Folder ID.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaFolder] = js.native
  def get(callback: BodyResponseCallback[SchemaFolder]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaFolder] = js.native
  def get(params: ParamsResourceAccountsContainersFoldersGet): GaxiosPromise[SchemaFolder] = js.native
  def get(params: ParamsResourceAccountsContainersFoldersGet, callback: BodyResponseCallback[SchemaFolder]): Unit = js.native
  def get(
    params: ParamsResourceAccountsContainersFoldersGet,
    options: BodyResponseCallback[SchemaFolder],
    callback: BodyResponseCallback[SchemaFolder]
  ): Unit = js.native
  def get(params: ParamsResourceAccountsContainersFoldersGet, options: MethodOptions): GaxiosPromise[SchemaFolder] = js.native
  def get(
    params: ParamsResourceAccountsContainersFoldersGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaFolder]
  ): Unit = js.native
  
  /**
    * tagmanager.accounts.containers.folders.list
    * @desc Lists all GTM Folders of a Container.
    * @alias tagmanager.accounts.containers.folders.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.accountId The GTM Account ID.
    * @param {string} params.containerId The GTM Container ID.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaListFoldersResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListFoldersResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListFoldersResponse] = js.native
  def list(params: ParamsResourceAccountsContainersFoldersList): GaxiosPromise[SchemaListFoldersResponse] = js.native
  def list(
    params: ParamsResourceAccountsContainersFoldersList,
    callback: BodyResponseCallback[SchemaListFoldersResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceAccountsContainersFoldersList,
    options: BodyResponseCallback[SchemaListFoldersResponse],
    callback: BodyResponseCallback[SchemaListFoldersResponse]
  ): Unit = js.native
  def list(params: ParamsResourceAccountsContainersFoldersList, options: MethodOptions): GaxiosPromise[SchemaListFoldersResponse] = js.native
  def list(
    params: ParamsResourceAccountsContainersFoldersList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListFoldersResponse]
  ): Unit = js.native
  
  /**
    * tagmanager.accounts.containers.folders.update
    * @desc Updates a GTM Folder.
    * @alias tagmanager.accounts.containers.folders.update
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.accountId The GTM Account ID.
    * @param {string} params.containerId The GTM Container ID.
    * @param {string=} params.fingerprint When provided, this fingerprint must match the fingerprint of the folder in storage.
    * @param {string} params.folderId The GTM Folder ID.
    * @param {().Folder} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def update(): GaxiosPromise[SchemaFolder] = js.native
  def update(callback: BodyResponseCallback[SchemaFolder]): Unit = js.native
  def update(params: Unit, options: MethodOptions): GaxiosPromise[SchemaFolder] = js.native
  def update(params: ParamsResourceAccountsContainersFoldersUpdate): GaxiosPromise[SchemaFolder] = js.native
  def update(
    params: ParamsResourceAccountsContainersFoldersUpdate,
    callback: BodyResponseCallback[SchemaFolder]
  ): Unit = js.native
  def update(
    params: ParamsResourceAccountsContainersFoldersUpdate,
    options: BodyResponseCallback[SchemaFolder],
    callback: BodyResponseCallback[SchemaFolder]
  ): Unit = js.native
  def update(params: ParamsResourceAccountsContainersFoldersUpdate, options: MethodOptions): GaxiosPromise[SchemaFolder] = js.native
  def update(
    params: ParamsResourceAccountsContainersFoldersUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaFolder]
  ): Unit = js.native
}
