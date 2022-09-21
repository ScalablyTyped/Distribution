package typings.googleapis.tagmanagerV1Mod.tagmanagerV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/tagmanager/v1", "tagmanager_v1.Resource$Accounts$Containers$Folders$Entities")
@js.native
open class ResourceAccountsContainersFoldersEntities protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def list(): GaxiosPromise[SchemaFolderEntities] = js.native
  def list(callback: BodyResponseCallback[SchemaFolderEntities]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaFolderEntities] = js.native
  def list(params: ParamsResourceAccountsContainersFoldersEntitiesList): GaxiosPromise[SchemaFolderEntities] = js.native
  def list(
    params: ParamsResourceAccountsContainersFoldersEntitiesList,
    callback: BodyResponseCallback[SchemaFolderEntities]
  ): Unit = js.native
  def list(
    params: ParamsResourceAccountsContainersFoldersEntitiesList,
    options: BodyResponseCallback[Readable | SchemaFolderEntities],
    callback: BodyResponseCallback[Readable | SchemaFolderEntities]
  ): Unit = js.native
  def list(params: ParamsResourceAccountsContainersFoldersEntitiesList, options: MethodOptions): GaxiosPromise[SchemaFolderEntities] = js.native
  def list(
    params: ParamsResourceAccountsContainersFoldersEntitiesList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaFolderEntities]
  ): Unit = js.native
  /**
    * List all entities in a GTM Folder.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/tagmanager.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const tagmanager = google.tagmanager('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/tagmanager.edit.containers',
    *       'https://www.googleapis.com/auth/tagmanager.readonly',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await tagmanager.accounts.containers.folders.entities.list({
    *     // The GTM Account ID.
    *     accountId: 'placeholder-value',
    *     // The GTM Container ID.
    *     containerId: 'placeholder-value',
    *     // The GTM Folder ID.
    *     folderId: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "tag": [],
    *   //   "trigger": [],
    *   //   "variable": []
    *   // }
    * }
    *
    * main().catch(e => {
    *   console.error(e);
    *   throw e;
    * });
    *
    * ```
    *
    * @param params - Parameters for request
    * @param options - Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param callback - Optional callback that handles the response.
    * @returns A promise if used with async/await, or void if used with a callback.
    */
  def list(params: ParamsResourceAccountsContainersFoldersEntitiesList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceAccountsContainersFoldersEntitiesList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
