package typings.googleapis.tagmanagerV2Mod.tagmanagerV2

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/tagmanager/v2", "tagmanager_v2.Resource$Accounts$Containers$Workspaces$Folders")
@js.native
open class ResourceAccountsContainersWorkspacesFolders protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def create(): GaxiosPromise[SchemaFolder] = js.native
  def create(callback: BodyResponseCallback[SchemaFolder]): Unit = js.native
  def create(params: Unit, options: MethodOptions): GaxiosPromise[SchemaFolder] = js.native
  def create(params: ParamsResourceAccountsContainersWorkspacesFoldersCreate): GaxiosPromise[SchemaFolder] = js.native
  def create(
    params: ParamsResourceAccountsContainersWorkspacesFoldersCreate,
    callback: BodyResponseCallback[SchemaFolder]
  ): Unit = js.native
  def create(
    params: ParamsResourceAccountsContainersWorkspacesFoldersCreate,
    options: BodyResponseCallback[Readable | SchemaFolder],
    callback: BodyResponseCallback[Readable | SchemaFolder]
  ): Unit = js.native
  def create(params: ParamsResourceAccountsContainersWorkspacesFoldersCreate, options: MethodOptions): GaxiosPromise[SchemaFolder] = js.native
  def create(
    params: ParamsResourceAccountsContainersWorkspacesFoldersCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaFolder]
  ): Unit = js.native
  /**
    * Creates a GTM Folder.
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
    * const tagmanager = google.tagmanager('v2');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/tagmanager.edit.containers'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await tagmanager.accounts.containers.workspaces.folders.create({
    *     // GTM Workspace's API relative path. Example: accounts/{account_id\}/containers/{container_id\}/workspaces/{workspace_id\}
    *     parent:
    *       'accounts/my-account/containers/my-container/workspaces/my-workspace',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "accountId": "my_accountId",
    *       //   "containerId": "my_containerId",
    *       //   "fingerprint": "my_fingerprint",
    *       //   "folderId": "my_folderId",
    *       //   "name": "my_name",
    *       //   "notes": "my_notes",
    *       //   "path": "my_path",
    *       //   "tagManagerUrl": "my_tagManagerUrl",
    *       //   "workspaceId": "my_workspaceId"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "accountId": "my_accountId",
    *   //   "containerId": "my_containerId",
    *   //   "fingerprint": "my_fingerprint",
    *   //   "folderId": "my_folderId",
    *   //   "name": "my_name",
    *   //   "notes": "my_notes",
    *   //   "path": "my_path",
    *   //   "tagManagerUrl": "my_tagManagerUrl",
    *   //   "workspaceId": "my_workspaceId"
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
  def create(params: ParamsResourceAccountsContainersWorkspacesFoldersCreate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def create(
    params: ParamsResourceAccountsContainersWorkspacesFoldersCreate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def delete(): GaxiosPromise[Unit] = js.native
  def delete(callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceAccountsContainersWorkspacesFoldersDelete): GaxiosPromise[Unit] = js.native
  def delete(
    params: ParamsResourceAccountsContainersWorkspacesFoldersDelete,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def delete(
    params: ParamsResourceAccountsContainersWorkspacesFoldersDelete,
    options: BodyResponseCallback[Readable | Unit],
    callback: BodyResponseCallback[Readable | Unit]
  ): Unit = js.native
  def delete(params: ParamsResourceAccountsContainersWorkspacesFoldersDelete, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(
    params: ParamsResourceAccountsContainersWorkspacesFoldersDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  /**
    * Deletes a GTM Folder.
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
    * const tagmanager = google.tagmanager('v2');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/tagmanager.edit.containers'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await tagmanager.accounts.containers.workspaces.folders.delete({
    *     // GTM Folder's API relative path. Example: accounts/{account_id\}/containers/{container_id\}/workspaces/{workspace_id\}/folders/{folder_id\}
    *     path: 'accounts/my-account/containers/my-container/workspaces/my-workspace/folders/my-folder',
    *   });
    *   console.log(res.data);
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
  def delete(params: ParamsResourceAccountsContainersWorkspacesFoldersDelete, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def delete(
    params: ParamsResourceAccountsContainersWorkspacesFoldersDelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def entities(): GaxiosPromise[SchemaFolderEntities] = js.native
  def entities(callback: BodyResponseCallback[SchemaFolderEntities]): Unit = js.native
  def entities(params: Unit, options: MethodOptions): GaxiosPromise[SchemaFolderEntities] = js.native
  def entities(params: ParamsResourceAccountsContainersWorkspacesFoldersEntities): GaxiosPromise[SchemaFolderEntities] = js.native
  def entities(
    params: ParamsResourceAccountsContainersWorkspacesFoldersEntities,
    callback: BodyResponseCallback[SchemaFolderEntities]
  ): Unit = js.native
  def entities(
    params: ParamsResourceAccountsContainersWorkspacesFoldersEntities,
    options: BodyResponseCallback[Readable | SchemaFolderEntities],
    callback: BodyResponseCallback[Readable | SchemaFolderEntities]
  ): Unit = js.native
  def entities(params: ParamsResourceAccountsContainersWorkspacesFoldersEntities, options: MethodOptions): GaxiosPromise[SchemaFolderEntities] = js.native
  def entities(
    params: ParamsResourceAccountsContainersWorkspacesFoldersEntities,
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
    * const tagmanager = google.tagmanager('v2');
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
    *   const res = await tagmanager.accounts.containers.workspaces.folders.entities({
    *     // Continuation token for fetching the next page of results.
    *     pageToken: 'placeholder-value',
    *     // GTM Folder's API relative path. Example: accounts/{account_id\}/containers/{container_id\}/workspaces/{workspace_id\}/folders/{folder_id\}
    *     path: 'accounts/my-account/containers/my-container/workspaces/my-workspace/folders/my-folder',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "nextPageToken": "my_nextPageToken",
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
  def entities(params: ParamsResourceAccountsContainersWorkspacesFoldersEntities, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def entities(
    params: ParamsResourceAccountsContainersWorkspacesFoldersEntities,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def get(): GaxiosPromise[SchemaFolder] = js.native
  def get(callback: BodyResponseCallback[SchemaFolder]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaFolder] = js.native
  def get(params: ParamsResourceAccountsContainersWorkspacesFoldersGet): GaxiosPromise[SchemaFolder] = js.native
  def get(
    params: ParamsResourceAccountsContainersWorkspacesFoldersGet,
    callback: BodyResponseCallback[SchemaFolder]
  ): Unit = js.native
  def get(
    params: ParamsResourceAccountsContainersWorkspacesFoldersGet,
    options: BodyResponseCallback[Readable | SchemaFolder],
    callback: BodyResponseCallback[Readable | SchemaFolder]
  ): Unit = js.native
  def get(params: ParamsResourceAccountsContainersWorkspacesFoldersGet, options: MethodOptions): GaxiosPromise[SchemaFolder] = js.native
  def get(
    params: ParamsResourceAccountsContainersWorkspacesFoldersGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaFolder]
  ): Unit = js.native
  /**
    * Gets a GTM Folder.
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
    * const tagmanager = google.tagmanager('v2');
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
    *   const res = await tagmanager.accounts.containers.workspaces.folders.get({
    *     // GTM Folder's API relative path. Example: accounts/{account_id\}/containers/{container_id\}/workspaces/{workspace_id\}/folders/{folder_id\}
    *     path: 'accounts/my-account/containers/my-container/workspaces/my-workspace/folders/my-folder',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "accountId": "my_accountId",
    *   //   "containerId": "my_containerId",
    *   //   "fingerprint": "my_fingerprint",
    *   //   "folderId": "my_folderId",
    *   //   "name": "my_name",
    *   //   "notes": "my_notes",
    *   //   "path": "my_path",
    *   //   "tagManagerUrl": "my_tagManagerUrl",
    *   //   "workspaceId": "my_workspaceId"
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
  def get(params: ParamsResourceAccountsContainersWorkspacesFoldersGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceAccountsContainersWorkspacesFoldersGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaListFoldersResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListFoldersResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListFoldersResponse] = js.native
  def list(params: ParamsResourceAccountsContainersWorkspacesFoldersList): GaxiosPromise[SchemaListFoldersResponse] = js.native
  def list(
    params: ParamsResourceAccountsContainersWorkspacesFoldersList,
    callback: BodyResponseCallback[SchemaListFoldersResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceAccountsContainersWorkspacesFoldersList,
    options: BodyResponseCallback[Readable | SchemaListFoldersResponse],
    callback: BodyResponseCallback[Readable | SchemaListFoldersResponse]
  ): Unit = js.native
  def list(params: ParamsResourceAccountsContainersWorkspacesFoldersList, options: MethodOptions): GaxiosPromise[SchemaListFoldersResponse] = js.native
  def list(
    params: ParamsResourceAccountsContainersWorkspacesFoldersList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListFoldersResponse]
  ): Unit = js.native
  /**
    * Lists all GTM Folders of a Container.
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
    * const tagmanager = google.tagmanager('v2');
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
    *   const res = await tagmanager.accounts.containers.workspaces.folders.list({
    *     // Continuation token for fetching the next page of results.
    *     pageToken: 'placeholder-value',
    *     // GTM Workspace's API relative path. Example: accounts/{account_id\}/containers/{container_id\}/workspaces/{workspace_id\}
    *     parent:
    *       'accounts/my-account/containers/my-container/workspaces/my-workspace',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "folder": [],
    *   //   "nextPageToken": "my_nextPageToken"
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
  def list(params: ParamsResourceAccountsContainersWorkspacesFoldersList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceAccountsContainersWorkspacesFoldersList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def move_entities_to_folder(): GaxiosPromise[Unit] = js.native
  def move_entities_to_folder(callback: BodyResponseCallback[Unit]): Unit = js.native
  def move_entities_to_folder(params: Unit, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def move_entities_to_folder(params: ParamsResourceAccountsContainersWorkspacesFoldersMoveEntitiesToFolder): GaxiosPromise[Unit] = js.native
  def move_entities_to_folder(
    params: ParamsResourceAccountsContainersWorkspacesFoldersMoveEntitiesToFolder,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def move_entities_to_folder(
    params: ParamsResourceAccountsContainersWorkspacesFoldersMoveEntitiesToFolder,
    options: BodyResponseCallback[Readable | Unit],
    callback: BodyResponseCallback[Readable | Unit]
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
    * Moves entities to a GTM Folder.
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
    * const tagmanager = google.tagmanager('v2');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/tagmanager.edit.containers'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res =
    *     await tagmanager.accounts.containers.workspaces.folders.move_entities_to_folder(
    *       {
    *         // GTM Folder's API relative path. Example: accounts/{account_id\}/containers/{container_id\}/workspaces/{workspace_id\}/folders/{folder_id\}
    *         path: 'accounts/my-account/containers/my-container/workspaces/my-workspace/folders/my-folder',
    *         // The tags to be moved to the folder.
    *         tagId: 'placeholder-value',
    *         // The triggers to be moved to the folder.
    *         triggerId: 'placeholder-value',
    *         // The variables to be moved to the folder.
    *         variableId: 'placeholder-value',
    *
    *         // Request body metadata
    *         requestBody: {
    *           // request body parameters
    *           // {
    *           //   "accountId": "my_accountId",
    *           //   "containerId": "my_containerId",
    *           //   "fingerprint": "my_fingerprint",
    *           //   "folderId": "my_folderId",
    *           //   "name": "my_name",
    *           //   "notes": "my_notes",
    *           //   "path": "my_path",
    *           //   "tagManagerUrl": "my_tagManagerUrl",
    *           //   "workspaceId": "my_workspaceId"
    *           // }
    *         },
    *       }
    *     );
    *   console.log(res.data);
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
  def move_entities_to_folder(
    params: ParamsResourceAccountsContainersWorkspacesFoldersMoveEntitiesToFolder,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def move_entities_to_folder(
    params: ParamsResourceAccountsContainersWorkspacesFoldersMoveEntitiesToFolder,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def revert(): GaxiosPromise[SchemaRevertFolderResponse] = js.native
  def revert(callback: BodyResponseCallback[SchemaRevertFolderResponse]): Unit = js.native
  def revert(params: Unit, options: MethodOptions): GaxiosPromise[SchemaRevertFolderResponse] = js.native
  def revert(params: ParamsResourceAccountsContainersWorkspacesFoldersRevert): GaxiosPromise[SchemaRevertFolderResponse] = js.native
  def revert(
    params: ParamsResourceAccountsContainersWorkspacesFoldersRevert,
    callback: BodyResponseCallback[SchemaRevertFolderResponse]
  ): Unit = js.native
  def revert(
    params: ParamsResourceAccountsContainersWorkspacesFoldersRevert,
    options: BodyResponseCallback[Readable | SchemaRevertFolderResponse],
    callback: BodyResponseCallback[Readable | SchemaRevertFolderResponse]
  ): Unit = js.native
  def revert(params: ParamsResourceAccountsContainersWorkspacesFoldersRevert, options: MethodOptions): GaxiosPromise[SchemaRevertFolderResponse] = js.native
  def revert(
    params: ParamsResourceAccountsContainersWorkspacesFoldersRevert,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaRevertFolderResponse]
  ): Unit = js.native
  /**
    * Reverts changes to a GTM Folder in a GTM Workspace.
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
    * const tagmanager = google.tagmanager('v2');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/tagmanager.edit.containers'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await tagmanager.accounts.containers.workspaces.folders.revert({
    *     // When provided, this fingerprint must match the fingerprint of the tag in storage.
    *     fingerprint: 'placeholder-value',
    *     // GTM Folder's API relative path. Example: accounts/{account_id\}/containers/{container_id\}/workspaces/{workspace_id\}/folders/{folder_id\}
    *     path: 'accounts/my-account/containers/my-container/workspaces/my-workspace/folders/my-folder',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "folder": {}
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
  def revert(params: ParamsResourceAccountsContainersWorkspacesFoldersRevert, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def revert(
    params: ParamsResourceAccountsContainersWorkspacesFoldersRevert,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def update(): GaxiosPromise[SchemaFolder] = js.native
  def update(callback: BodyResponseCallback[SchemaFolder]): Unit = js.native
  def update(params: Unit, options: MethodOptions): GaxiosPromise[SchemaFolder] = js.native
  def update(params: ParamsResourceAccountsContainersWorkspacesFoldersUpdate): GaxiosPromise[SchemaFolder] = js.native
  def update(
    params: ParamsResourceAccountsContainersWorkspacesFoldersUpdate,
    callback: BodyResponseCallback[SchemaFolder]
  ): Unit = js.native
  def update(
    params: ParamsResourceAccountsContainersWorkspacesFoldersUpdate,
    options: BodyResponseCallback[Readable | SchemaFolder],
    callback: BodyResponseCallback[Readable | SchemaFolder]
  ): Unit = js.native
  def update(params: ParamsResourceAccountsContainersWorkspacesFoldersUpdate, options: MethodOptions): GaxiosPromise[SchemaFolder] = js.native
  def update(
    params: ParamsResourceAccountsContainersWorkspacesFoldersUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaFolder]
  ): Unit = js.native
  /**
    * Updates a GTM Folder.
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
    * const tagmanager = google.tagmanager('v2');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/tagmanager.edit.containers'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await tagmanager.accounts.containers.workspaces.folders.update({
    *     // When provided, this fingerprint must match the fingerprint of the folder in storage.
    *     fingerprint: 'placeholder-value',
    *     // GTM Folder's API relative path. Example: accounts/{account_id\}/containers/{container_id\}/workspaces/{workspace_id\}/folders/{folder_id\}
    *     path: 'accounts/my-account/containers/my-container/workspaces/my-workspace/folders/my-folder',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "accountId": "my_accountId",
    *       //   "containerId": "my_containerId",
    *       //   "fingerprint": "my_fingerprint",
    *       //   "folderId": "my_folderId",
    *       //   "name": "my_name",
    *       //   "notes": "my_notes",
    *       //   "path": "my_path",
    *       //   "tagManagerUrl": "my_tagManagerUrl",
    *       //   "workspaceId": "my_workspaceId"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "accountId": "my_accountId",
    *   //   "containerId": "my_containerId",
    *   //   "fingerprint": "my_fingerprint",
    *   //   "folderId": "my_folderId",
    *   //   "name": "my_name",
    *   //   "notes": "my_notes",
    *   //   "path": "my_path",
    *   //   "tagManagerUrl": "my_tagManagerUrl",
    *   //   "workspaceId": "my_workspaceId"
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
  def update(params: ParamsResourceAccountsContainersWorkspacesFoldersUpdate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def update(
    params: ParamsResourceAccountsContainersWorkspacesFoldersUpdate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
