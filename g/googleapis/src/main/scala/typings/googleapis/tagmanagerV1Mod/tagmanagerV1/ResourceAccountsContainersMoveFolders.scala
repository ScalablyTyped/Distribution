package typings.googleapis.tagmanagerV1Mod.tagmanagerV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/tagmanager/v1", "tagmanager_v1.Resource$Accounts$Containers$Move_folders")
@js.native
class ResourceAccountsContainersMoveFolders protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  /**
    * tagmanager.accounts.containers.move_folders.update
    * @desc Moves entities to a GTM Folder.
    * @alias tagmanager.accounts.containers.move_folders.update
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.accountId The GTM Account ID.
    * @param {string} params.containerId The GTM Container ID.
    * @param {string} params.folderId The GTM Folder ID.
    * @param {string=} params.tagId The tags to be moved to the folder.
    * @param {string=} params.triggerId The triggers to be moved to the folder.
    * @param {string=} params.variableId The variables to be moved to the folder.
    * @param {().Folder} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def update(): GaxiosPromise[Unit] = js.native
  def update(callback: BodyResponseCallback[Unit]): Unit = js.native
  def update(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[Unit] = js.native
  def update(params: ParamsResourceAccountsContainersMoveFoldersUpdate): GaxiosPromise[Unit] = js.native
  def update(params: ParamsResourceAccountsContainersMoveFoldersUpdate, callback: BodyResponseCallback[Unit]): Unit = js.native
  def update(
    params: ParamsResourceAccountsContainersMoveFoldersUpdate,
    options: BodyResponseCallback[Unit],
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def update(params: ParamsResourceAccountsContainersMoveFoldersUpdate, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def update(
    params: ParamsResourceAccountsContainersMoveFoldersUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
}
