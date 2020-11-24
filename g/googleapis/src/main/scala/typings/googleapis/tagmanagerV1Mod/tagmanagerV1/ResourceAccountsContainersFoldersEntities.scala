package typings.googleapis.tagmanagerV1Mod.tagmanagerV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/tagmanager/v1", "tagmanager_v1.Resource$Accounts$Containers$Folders$Entities")
@js.native
class ResourceAccountsContainersFoldersEntities protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  /**
    * tagmanager.accounts.containers.folders.entities.list
    * @desc List all entities in a GTM Folder.
    * @alias tagmanager.accounts.containers.folders.entities.list
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
  def list(): GaxiosPromise[SchemaFolderEntities] = js.native
  def list(callback: BodyResponseCallback[SchemaFolderEntities]): Unit = js.native
  def list(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaFolderEntities] = js.native
  def list(params: ParamsResourceAccountsContainersFoldersEntitiesList): GaxiosPromise[SchemaFolderEntities] = js.native
  def list(
    params: ParamsResourceAccountsContainersFoldersEntitiesList,
    callback: BodyResponseCallback[SchemaFolderEntities]
  ): Unit = js.native
  def list(
    params: ParamsResourceAccountsContainersFoldersEntitiesList,
    options: BodyResponseCallback[SchemaFolderEntities],
    callback: BodyResponseCallback[SchemaFolderEntities]
  ): Unit = js.native
  def list(params: ParamsResourceAccountsContainersFoldersEntitiesList, options: MethodOptions): GaxiosPromise[SchemaFolderEntities] = js.native
  def list(
    params: ParamsResourceAccountsContainersFoldersEntitiesList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaFolderEntities]
  ): Unit = js.native
}
