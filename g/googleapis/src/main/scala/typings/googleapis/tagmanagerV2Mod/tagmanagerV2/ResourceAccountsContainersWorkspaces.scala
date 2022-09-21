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

@JSImport("googleapis/build/src/apis/tagmanager/v2", "tagmanager_v2.Resource$Accounts$Containers$Workspaces")
@js.native
open class ResourceAccountsContainersWorkspaces protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var built_in_variables: ResourceAccountsContainersWorkspacesBuiltInVariables = js.native
  
  var clients: ResourceAccountsContainersWorkspacesClients = js.native
  
  var context: APIRequestContext = js.native
  
  def create(): GaxiosPromise[SchemaWorkspace] = js.native
  def create(callback: BodyResponseCallback[SchemaWorkspace]): Unit = js.native
  def create(params: Unit, options: MethodOptions): GaxiosPromise[SchemaWorkspace] = js.native
  def create(params: ParamsResourceAccountsContainersWorkspacesCreate): GaxiosPromise[SchemaWorkspace] = js.native
  def create(
    params: ParamsResourceAccountsContainersWorkspacesCreate,
    callback: BodyResponseCallback[SchemaWorkspace]
  ): Unit = js.native
  def create(
    params: ParamsResourceAccountsContainersWorkspacesCreate,
    options: BodyResponseCallback[Readable | SchemaWorkspace],
    callback: BodyResponseCallback[Readable | SchemaWorkspace]
  ): Unit = js.native
  def create(params: ParamsResourceAccountsContainersWorkspacesCreate, options: MethodOptions): GaxiosPromise[SchemaWorkspace] = js.native
  def create(
    params: ParamsResourceAccountsContainersWorkspacesCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaWorkspace]
  ): Unit = js.native
  /**
    * Creates a Workspace.
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
    *   const res = await tagmanager.accounts.containers.workspaces.create({
    *     // GTM parent Container's API relative path. Example: accounts/{account_id\}/containers/{container_id\}
    *     parent: 'accounts/my-account/containers/my-container',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "accountId": "my_accountId",
    *       //   "containerId": "my_containerId",
    *       //   "description": "my_description",
    *       //   "fingerprint": "my_fingerprint",
    *       //   "name": "my_name",
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
    *   //   "description": "my_description",
    *   //   "fingerprint": "my_fingerprint",
    *   //   "name": "my_name",
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
  def create(params: ParamsResourceAccountsContainersWorkspacesCreate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def create(
    params: ParamsResourceAccountsContainersWorkspacesCreate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def create_version(): GaxiosPromise[SchemaCreateContainerVersionResponse] = js.native
  def create_version(callback: BodyResponseCallback[SchemaCreateContainerVersionResponse]): Unit = js.native
  def create_version(params: Unit, options: MethodOptions): GaxiosPromise[SchemaCreateContainerVersionResponse] = js.native
  def create_version(params: ParamsResourceAccountsContainersWorkspacesCreateVersion): GaxiosPromise[SchemaCreateContainerVersionResponse] = js.native
  def create_version(
    params: ParamsResourceAccountsContainersWorkspacesCreateVersion,
    callback: BodyResponseCallback[SchemaCreateContainerVersionResponse]
  ): Unit = js.native
  def create_version(
    params: ParamsResourceAccountsContainersWorkspacesCreateVersion,
    options: BodyResponseCallback[Readable | SchemaCreateContainerVersionResponse],
    callback: BodyResponseCallback[Readable | SchemaCreateContainerVersionResponse]
  ): Unit = js.native
  def create_version(params: ParamsResourceAccountsContainersWorkspacesCreateVersion, options: MethodOptions): GaxiosPromise[SchemaCreateContainerVersionResponse] = js.native
  def create_version(
    params: ParamsResourceAccountsContainersWorkspacesCreateVersion,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaCreateContainerVersionResponse]
  ): Unit = js.native
  /**
    * Creates a Container Version from the entities present in the workspace, deletes the workspace, and sets the base container version to the newly created version.
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
    *       'https://www.googleapis.com/auth/tagmanager.edit.containerversions',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await tagmanager.accounts.containers.workspaces.create_version({
    *     // GTM Workspace's API relative path. Example: accounts/{account_id\}/containers/{container_id\}/workspaces/{workspace_id\}
    *     path: 'accounts/my-account/containers/my-container/workspaces/my-workspace',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "name": "my_name",
    *       //   "notes": "my_notes"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "compilerError": false,
    *   //   "containerVersion": {},
    *   //   "newWorkspacePath": "my_newWorkspacePath",
    *   //   "syncStatus": {}
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
  def create_version(params: ParamsResourceAccountsContainersWorkspacesCreateVersion, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def create_version(
    params: ParamsResourceAccountsContainersWorkspacesCreateVersion,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def delete(): GaxiosPromise[Unit] = js.native
  def delete(callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceAccountsContainersWorkspacesDelete): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceAccountsContainersWorkspacesDelete, callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(
    params: ParamsResourceAccountsContainersWorkspacesDelete,
    options: BodyResponseCallback[Readable | Unit],
    callback: BodyResponseCallback[Readable | Unit]
  ): Unit = js.native
  def delete(params: ParamsResourceAccountsContainersWorkspacesDelete, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(
    params: ParamsResourceAccountsContainersWorkspacesDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  /**
    * Deletes a Workspace.
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
    *     scopes: ['https://www.googleapis.com/auth/tagmanager.delete.containers'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await tagmanager.accounts.containers.workspaces.delete({
    *     // GTM Workspace's API relative path. Example: accounts/{account_id\}/containers/{container_id\}/workspaces/{workspace_id\}
    *     path: 'accounts/my-account/containers/my-container/workspaces/my-workspace',
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
  def delete(params: ParamsResourceAccountsContainersWorkspacesDelete, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def delete(
    params: ParamsResourceAccountsContainersWorkspacesDelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  var folders: ResourceAccountsContainersWorkspacesFolders = js.native
  
  def get(): GaxiosPromise[SchemaWorkspace] = js.native
  def get(callback: BodyResponseCallback[SchemaWorkspace]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaWorkspace] = js.native
  def get(params: ParamsResourceAccountsContainersWorkspacesGet): GaxiosPromise[SchemaWorkspace] = js.native
  def get(
    params: ParamsResourceAccountsContainersWorkspacesGet,
    callback: BodyResponseCallback[SchemaWorkspace]
  ): Unit = js.native
  def get(
    params: ParamsResourceAccountsContainersWorkspacesGet,
    options: BodyResponseCallback[Readable | SchemaWorkspace],
    callback: BodyResponseCallback[Readable | SchemaWorkspace]
  ): Unit = js.native
  def get(params: ParamsResourceAccountsContainersWorkspacesGet, options: MethodOptions): GaxiosPromise[SchemaWorkspace] = js.native
  def get(
    params: ParamsResourceAccountsContainersWorkspacesGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaWorkspace]
  ): Unit = js.native
  /**
    * Gets a Workspace.
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
    *   const res = await tagmanager.accounts.containers.workspaces.get({
    *     // GTM Workspace's API relative path. Example: accounts/{account_id\}/containers/{container_id\}/workspaces/{workspace_id\}
    *     path: 'accounts/my-account/containers/my-container/workspaces/my-workspace',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "accountId": "my_accountId",
    *   //   "containerId": "my_containerId",
    *   //   "description": "my_description",
    *   //   "fingerprint": "my_fingerprint",
    *   //   "name": "my_name",
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
  def get(params: ParamsResourceAccountsContainersWorkspacesGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceAccountsContainersWorkspacesGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def getStatus(): GaxiosPromise[SchemaGetWorkspaceStatusResponse] = js.native
  def getStatus(callback: BodyResponseCallback[SchemaGetWorkspaceStatusResponse]): Unit = js.native
  def getStatus(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGetWorkspaceStatusResponse] = js.native
  def getStatus(params: ParamsResourceAccountsContainersWorkspacesGetstatus): GaxiosPromise[SchemaGetWorkspaceStatusResponse] = js.native
  def getStatus(
    params: ParamsResourceAccountsContainersWorkspacesGetstatus,
    callback: BodyResponseCallback[SchemaGetWorkspaceStatusResponse]
  ): Unit = js.native
  def getStatus(
    params: ParamsResourceAccountsContainersWorkspacesGetstatus,
    options: BodyResponseCallback[Readable | SchemaGetWorkspaceStatusResponse],
    callback: BodyResponseCallback[Readable | SchemaGetWorkspaceStatusResponse]
  ): Unit = js.native
  def getStatus(params: ParamsResourceAccountsContainersWorkspacesGetstatus, options: MethodOptions): GaxiosPromise[SchemaGetWorkspaceStatusResponse] = js.native
  def getStatus(
    params: ParamsResourceAccountsContainersWorkspacesGetstatus,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGetWorkspaceStatusResponse]
  ): Unit = js.native
  /**
    * Finds conflicting and modified entities in the workspace.
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
    *   const res = await tagmanager.accounts.containers.workspaces.getStatus({
    *     // GTM Workspace's API relative path. Example: accounts/{account_id\}/containers/{container_id\}/workspaces/{workspace_id\}
    *     path: 'accounts/my-account/containers/my-container/workspaces/my-workspace',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "mergeConflict": [],
    *   //   "workspaceChange": []
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
  def getStatus(params: ParamsResourceAccountsContainersWorkspacesGetstatus, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def getStatus(
    params: ParamsResourceAccountsContainersWorkspacesGetstatus,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaListWorkspacesResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListWorkspacesResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListWorkspacesResponse] = js.native
  def list(params: ParamsResourceAccountsContainersWorkspacesList): GaxiosPromise[SchemaListWorkspacesResponse] = js.native
  def list(
    params: ParamsResourceAccountsContainersWorkspacesList,
    callback: BodyResponseCallback[SchemaListWorkspacesResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceAccountsContainersWorkspacesList,
    options: BodyResponseCallback[Readable | SchemaListWorkspacesResponse],
    callback: BodyResponseCallback[Readable | SchemaListWorkspacesResponse]
  ): Unit = js.native
  def list(params: ParamsResourceAccountsContainersWorkspacesList, options: MethodOptions): GaxiosPromise[SchemaListWorkspacesResponse] = js.native
  def list(
    params: ParamsResourceAccountsContainersWorkspacesList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListWorkspacesResponse]
  ): Unit = js.native
  /**
    * Lists all Workspaces that belong to a GTM Container.
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
    *   const res = await tagmanager.accounts.containers.workspaces.list({
    *     // Continuation token for fetching the next page of results.
    *     pageToken: 'placeholder-value',
    *     // GTM parent Container's API relative path. Example: accounts/{account_id\}/containers/{container_id\}
    *     parent: 'accounts/my-account/containers/my-container',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "nextPageToken": "my_nextPageToken",
    *   //   "workspace": []
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
  def list(params: ParamsResourceAccountsContainersWorkspacesList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceAccountsContainersWorkspacesList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def quick_preview(): GaxiosPromise[SchemaQuickPreviewResponse] = js.native
  def quick_preview(callback: BodyResponseCallback[SchemaQuickPreviewResponse]): Unit = js.native
  def quick_preview(params: Unit, options: MethodOptions): GaxiosPromise[SchemaQuickPreviewResponse] = js.native
  def quick_preview(params: ParamsResourceAccountsContainersWorkspacesQuickPreview): GaxiosPromise[SchemaQuickPreviewResponse] = js.native
  def quick_preview(
    params: ParamsResourceAccountsContainersWorkspacesQuickPreview,
    callback: BodyResponseCallback[SchemaQuickPreviewResponse]
  ): Unit = js.native
  def quick_preview(
    params: ParamsResourceAccountsContainersWorkspacesQuickPreview,
    options: BodyResponseCallback[Readable | SchemaQuickPreviewResponse],
    callback: BodyResponseCallback[Readable | SchemaQuickPreviewResponse]
  ): Unit = js.native
  def quick_preview(params: ParamsResourceAccountsContainersWorkspacesQuickPreview, options: MethodOptions): GaxiosPromise[SchemaQuickPreviewResponse] = js.native
  def quick_preview(
    params: ParamsResourceAccountsContainersWorkspacesQuickPreview,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaQuickPreviewResponse]
  ): Unit = js.native
  /**
    * Quick previews a workspace by creating a fake container version from all entities in the provided workspace.
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
    *       'https://www.googleapis.com/auth/tagmanager.edit.containerversions',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await tagmanager.accounts.containers.workspaces.quick_preview({
    *     // GTM Workspace's API relative path. Example: accounts/{account_id\}/containers/{container_id\}/workspaces/{workspace_id\}
    *     path: 'accounts/my-account/containers/my-container/workspaces/my-workspace',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "compilerError": false,
    *   //   "containerVersion": {},
    *   //   "syncStatus": {}
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
  def quick_preview(params: ParamsResourceAccountsContainersWorkspacesQuickPreview, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def quick_preview(
    params: ParamsResourceAccountsContainersWorkspacesQuickPreview,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def resolve_conflict(): GaxiosPromise[Unit] = js.native
  def resolve_conflict(callback: BodyResponseCallback[Unit]): Unit = js.native
  def resolve_conflict(params: Unit, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def resolve_conflict(params: ParamsResourceAccountsContainersWorkspacesResolveConflict): GaxiosPromise[Unit] = js.native
  def resolve_conflict(
    params: ParamsResourceAccountsContainersWorkspacesResolveConflict,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def resolve_conflict(
    params: ParamsResourceAccountsContainersWorkspacesResolveConflict,
    options: BodyResponseCallback[Readable | Unit],
    callback: BodyResponseCallback[Readable | Unit]
  ): Unit = js.native
  def resolve_conflict(params: ParamsResourceAccountsContainersWorkspacesResolveConflict, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def resolve_conflict(
    params: ParamsResourceAccountsContainersWorkspacesResolveConflict,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  /**
    * Resolves a merge conflict for a workspace entity by updating it to the resolved entity passed in the request.
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
    *   const res = await tagmanager.accounts.containers.workspaces.resolve_conflict({
    *     // When provided, this fingerprint must match the fingerprint of the entity_in_workspace in the merge conflict.
    *     fingerprint: 'placeholder-value',
    *     // GTM Workspace's API relative path. Example: accounts/{account_id\}/containers/{container_id\}/workspaces/{workspace_id\}
    *     path: 'accounts/my-account/containers/my-container/workspaces/my-workspace',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "changeStatus": "my_changeStatus",
    *       //   "client": {},
    *       //   "folder": {},
    *       //   "tag": {},
    *       //   "trigger": {},
    *       //   "variable": {}
    *       // }
    *     },
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
  def resolve_conflict(params: ParamsResourceAccountsContainersWorkspacesResolveConflict, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def resolve_conflict(
    params: ParamsResourceAccountsContainersWorkspacesResolveConflict,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def sync(): GaxiosPromise[SchemaSyncWorkspaceResponse] = js.native
  def sync(callback: BodyResponseCallback[SchemaSyncWorkspaceResponse]): Unit = js.native
  def sync(params: Unit, options: MethodOptions): GaxiosPromise[SchemaSyncWorkspaceResponse] = js.native
  def sync(params: ParamsResourceAccountsContainersWorkspacesSync): GaxiosPromise[SchemaSyncWorkspaceResponse] = js.native
  def sync(
    params: ParamsResourceAccountsContainersWorkspacesSync,
    callback: BodyResponseCallback[SchemaSyncWorkspaceResponse]
  ): Unit = js.native
  def sync(
    params: ParamsResourceAccountsContainersWorkspacesSync,
    options: BodyResponseCallback[Readable | SchemaSyncWorkspaceResponse],
    callback: BodyResponseCallback[Readable | SchemaSyncWorkspaceResponse]
  ): Unit = js.native
  def sync(params: ParamsResourceAccountsContainersWorkspacesSync, options: MethodOptions): GaxiosPromise[SchemaSyncWorkspaceResponse] = js.native
  def sync(
    params: ParamsResourceAccountsContainersWorkspacesSync,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaSyncWorkspaceResponse]
  ): Unit = js.native
  /**
    * Syncs a workspace to the latest container version by updating all unmodified workspace entities and displaying conflicts for modified entities.
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
    *   const res = await tagmanager.accounts.containers.workspaces.sync({
    *     // GTM Workspace's API relative path. Example: accounts/{account_id\}/containers/{container_id\}/workspaces/{workspace_id\}
    *     path: 'accounts/my-account/containers/my-container/workspaces/my-workspace',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "mergeConflict": [],
    *   //   "syncStatus": {}
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
  def sync(params: ParamsResourceAccountsContainersWorkspacesSync, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def sync(
    params: ParamsResourceAccountsContainersWorkspacesSync,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  var tags: ResourceAccountsContainersWorkspacesTags = js.native
  
  var templates: ResourceAccountsContainersWorkspacesTemplates = js.native
  
  var triggers: ResourceAccountsContainersWorkspacesTriggers = js.native
  
  def update(): GaxiosPromise[SchemaWorkspace] = js.native
  def update(callback: BodyResponseCallback[SchemaWorkspace]): Unit = js.native
  def update(params: Unit, options: MethodOptions): GaxiosPromise[SchemaWorkspace] = js.native
  def update(params: ParamsResourceAccountsContainersWorkspacesUpdate): GaxiosPromise[SchemaWorkspace] = js.native
  def update(
    params: ParamsResourceAccountsContainersWorkspacesUpdate,
    callback: BodyResponseCallback[SchemaWorkspace]
  ): Unit = js.native
  def update(
    params: ParamsResourceAccountsContainersWorkspacesUpdate,
    options: BodyResponseCallback[Readable | SchemaWorkspace],
    callback: BodyResponseCallback[Readable | SchemaWorkspace]
  ): Unit = js.native
  def update(params: ParamsResourceAccountsContainersWorkspacesUpdate, options: MethodOptions): GaxiosPromise[SchemaWorkspace] = js.native
  def update(
    params: ParamsResourceAccountsContainersWorkspacesUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaWorkspace]
  ): Unit = js.native
  /**
    * Updates a Workspace.
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
    *   const res = await tagmanager.accounts.containers.workspaces.update({
    *     // When provided, this fingerprint must match the fingerprint of the workspace in storage.
    *     fingerprint: 'placeholder-value',
    *     // GTM Workspace's API relative path. Example: accounts/{account_id\}/containers/{container_id\}/workspaces/{workspace_id\}
    *     path: 'accounts/my-account/containers/my-container/workspaces/my-workspace',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "accountId": "my_accountId",
    *       //   "containerId": "my_containerId",
    *       //   "description": "my_description",
    *       //   "fingerprint": "my_fingerprint",
    *       //   "name": "my_name",
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
    *   //   "description": "my_description",
    *   //   "fingerprint": "my_fingerprint",
    *   //   "name": "my_name",
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
  def update(params: ParamsResourceAccountsContainersWorkspacesUpdate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def update(
    params: ParamsResourceAccountsContainersWorkspacesUpdate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  var variables: ResourceAccountsContainersWorkspacesVariables = js.native
  
  var zones: ResourceAccountsContainersWorkspacesZones = js.native
}
