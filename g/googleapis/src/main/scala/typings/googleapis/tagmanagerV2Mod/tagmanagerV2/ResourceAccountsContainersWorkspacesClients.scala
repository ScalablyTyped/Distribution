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

@JSImport("googleapis/build/src/apis/tagmanager/v2", "tagmanager_v2.Resource$Accounts$Containers$Workspaces$Clients")
@js.native
open class ResourceAccountsContainersWorkspacesClients protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def create(): GaxiosPromise[SchemaClient] = js.native
  def create(callback: BodyResponseCallback[SchemaClient]): Unit = js.native
  def create(params: Unit, options: MethodOptions): GaxiosPromise[SchemaClient] = js.native
  def create(params: ParamsResourceAccountsContainersWorkspacesClientsCreate): GaxiosPromise[SchemaClient] = js.native
  def create(
    params: ParamsResourceAccountsContainersWorkspacesClientsCreate,
    callback: BodyResponseCallback[SchemaClient]
  ): Unit = js.native
  def create(
    params: ParamsResourceAccountsContainersWorkspacesClientsCreate,
    options: BodyResponseCallback[Readable | SchemaClient],
    callback: BodyResponseCallback[Readable | SchemaClient]
  ): Unit = js.native
  def create(params: ParamsResourceAccountsContainersWorkspacesClientsCreate, options: MethodOptions): GaxiosPromise[SchemaClient] = js.native
  def create(
    params: ParamsResourceAccountsContainersWorkspacesClientsCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaClient]
  ): Unit = js.native
  /**
    * Creates a GTM Client.
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
    *   const res = await tagmanager.accounts.containers.workspaces.clients.create({
    *     // GTM Workspace's API relative path. Example: accounts/{account_id\}/containers/{container_id\}/workspaces/{workspace_id\}
    *     parent:
    *       'accounts/my-account/containers/my-container/workspaces/my-workspace',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "accountId": "my_accountId",
    *       //   "clientId": "my_clientId",
    *       //   "containerId": "my_containerId",
    *       //   "fingerprint": "my_fingerprint",
    *       //   "name": "my_name",
    *       //   "notes": "my_notes",
    *       //   "parameter": [],
    *       //   "parentFolderId": "my_parentFolderId",
    *       //   "path": "my_path",
    *       //   "priority": 0,
    *       //   "tagManagerUrl": "my_tagManagerUrl",
    *       //   "type": "my_type",
    *       //   "workspaceId": "my_workspaceId"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "accountId": "my_accountId",
    *   //   "clientId": "my_clientId",
    *   //   "containerId": "my_containerId",
    *   //   "fingerprint": "my_fingerprint",
    *   //   "name": "my_name",
    *   //   "notes": "my_notes",
    *   //   "parameter": [],
    *   //   "parentFolderId": "my_parentFolderId",
    *   //   "path": "my_path",
    *   //   "priority": 0,
    *   //   "tagManagerUrl": "my_tagManagerUrl",
    *   //   "type": "my_type",
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
  def create(params: ParamsResourceAccountsContainersWorkspacesClientsCreate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def create(
    params: ParamsResourceAccountsContainersWorkspacesClientsCreate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def delete(): GaxiosPromise[Unit] = js.native
  def delete(callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceAccountsContainersWorkspacesClientsDelete): GaxiosPromise[Unit] = js.native
  def delete(
    params: ParamsResourceAccountsContainersWorkspacesClientsDelete,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def delete(
    params: ParamsResourceAccountsContainersWorkspacesClientsDelete,
    options: BodyResponseCallback[Readable | Unit],
    callback: BodyResponseCallback[Readable | Unit]
  ): Unit = js.native
  def delete(params: ParamsResourceAccountsContainersWorkspacesClientsDelete, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(
    params: ParamsResourceAccountsContainersWorkspacesClientsDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  /**
    * Deletes a GTM Client.
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
    *   const res = await tagmanager.accounts.containers.workspaces.clients.delete({
    *     // GTM Client's API relative path. Example: accounts/{account_id\}/containers/{container_id\}/workspaces/{workspace_id\}/clients/{client_id\}
    *     path: 'accounts/my-account/containers/my-container/workspaces/my-workspace/clients/my-client',
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
  def delete(params: ParamsResourceAccountsContainersWorkspacesClientsDelete, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def delete(
    params: ParamsResourceAccountsContainersWorkspacesClientsDelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def get(): GaxiosPromise[SchemaClient] = js.native
  def get(callback: BodyResponseCallback[SchemaClient]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaClient] = js.native
  def get(params: ParamsResourceAccountsContainersWorkspacesClientsGet): GaxiosPromise[SchemaClient] = js.native
  def get(
    params: ParamsResourceAccountsContainersWorkspacesClientsGet,
    callback: BodyResponseCallback[SchemaClient]
  ): Unit = js.native
  def get(
    params: ParamsResourceAccountsContainersWorkspacesClientsGet,
    options: BodyResponseCallback[Readable | SchemaClient],
    callback: BodyResponseCallback[Readable | SchemaClient]
  ): Unit = js.native
  def get(params: ParamsResourceAccountsContainersWorkspacesClientsGet, options: MethodOptions): GaxiosPromise[SchemaClient] = js.native
  def get(
    params: ParamsResourceAccountsContainersWorkspacesClientsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaClient]
  ): Unit = js.native
  /**
    * Gets a GTM Client.
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
    *   const res = await tagmanager.accounts.containers.workspaces.clients.get({
    *     // GTM Client's API relative path. Example: accounts/{account_id\}/containers/{container_id\}/workspaces/{workspace_id\}/clients/{client_id\}
    *     path: 'accounts/my-account/containers/my-container/workspaces/my-workspace/clients/my-client',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "accountId": "my_accountId",
    *   //   "clientId": "my_clientId",
    *   //   "containerId": "my_containerId",
    *   //   "fingerprint": "my_fingerprint",
    *   //   "name": "my_name",
    *   //   "notes": "my_notes",
    *   //   "parameter": [],
    *   //   "parentFolderId": "my_parentFolderId",
    *   //   "path": "my_path",
    *   //   "priority": 0,
    *   //   "tagManagerUrl": "my_tagManagerUrl",
    *   //   "type": "my_type",
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
  def get(params: ParamsResourceAccountsContainersWorkspacesClientsGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceAccountsContainersWorkspacesClientsGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaListClientsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListClientsResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListClientsResponse] = js.native
  def list(params: ParamsResourceAccountsContainersWorkspacesClientsList): GaxiosPromise[SchemaListClientsResponse] = js.native
  def list(
    params: ParamsResourceAccountsContainersWorkspacesClientsList,
    callback: BodyResponseCallback[SchemaListClientsResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceAccountsContainersWorkspacesClientsList,
    options: BodyResponseCallback[Readable | SchemaListClientsResponse],
    callback: BodyResponseCallback[Readable | SchemaListClientsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceAccountsContainersWorkspacesClientsList, options: MethodOptions): GaxiosPromise[SchemaListClientsResponse] = js.native
  def list(
    params: ParamsResourceAccountsContainersWorkspacesClientsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListClientsResponse]
  ): Unit = js.native
  /**
    * Lists all GTM Clients of a GTM container workspace.
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
    *   const res = await tagmanager.accounts.containers.workspaces.clients.list({
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
    *   //   "client": [],
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
  def list(params: ParamsResourceAccountsContainersWorkspacesClientsList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceAccountsContainersWorkspacesClientsList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def revert(): GaxiosPromise[SchemaRevertClientResponse] = js.native
  def revert(callback: BodyResponseCallback[SchemaRevertClientResponse]): Unit = js.native
  def revert(params: Unit, options: MethodOptions): GaxiosPromise[SchemaRevertClientResponse] = js.native
  def revert(params: ParamsResourceAccountsContainersWorkspacesClientsRevert): GaxiosPromise[SchemaRevertClientResponse] = js.native
  def revert(
    params: ParamsResourceAccountsContainersWorkspacesClientsRevert,
    callback: BodyResponseCallback[SchemaRevertClientResponse]
  ): Unit = js.native
  def revert(
    params: ParamsResourceAccountsContainersWorkspacesClientsRevert,
    options: BodyResponseCallback[Readable | SchemaRevertClientResponse],
    callback: BodyResponseCallback[Readable | SchemaRevertClientResponse]
  ): Unit = js.native
  def revert(params: ParamsResourceAccountsContainersWorkspacesClientsRevert, options: MethodOptions): GaxiosPromise[SchemaRevertClientResponse] = js.native
  def revert(
    params: ParamsResourceAccountsContainersWorkspacesClientsRevert,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaRevertClientResponse]
  ): Unit = js.native
  /**
    * Reverts changes to a GTM Client in a GTM Workspace.
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
    *   const res = await tagmanager.accounts.containers.workspaces.clients.revert({
    *     // When provided, this fingerprint must match the fingerprint of the client in storage.
    *     fingerprint: 'placeholder-value',
    *     // GTM Client's API relative path. Example: accounts/{account_id\}/containers/{container_id\}/workspaces/{workspace_id\}/clients/{client_id\}
    *     path: 'accounts/my-account/containers/my-container/workspaces/my-workspace/clients/my-client',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "client": {}
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
  def revert(params: ParamsResourceAccountsContainersWorkspacesClientsRevert, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def revert(
    params: ParamsResourceAccountsContainersWorkspacesClientsRevert,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def update(): GaxiosPromise[SchemaClient] = js.native
  def update(callback: BodyResponseCallback[SchemaClient]): Unit = js.native
  def update(params: Unit, options: MethodOptions): GaxiosPromise[SchemaClient] = js.native
  def update(params: ParamsResourceAccountsContainersWorkspacesClientsUpdate): GaxiosPromise[SchemaClient] = js.native
  def update(
    params: ParamsResourceAccountsContainersWorkspacesClientsUpdate,
    callback: BodyResponseCallback[SchemaClient]
  ): Unit = js.native
  def update(
    params: ParamsResourceAccountsContainersWorkspacesClientsUpdate,
    options: BodyResponseCallback[Readable | SchemaClient],
    callback: BodyResponseCallback[Readable | SchemaClient]
  ): Unit = js.native
  def update(params: ParamsResourceAccountsContainersWorkspacesClientsUpdate, options: MethodOptions): GaxiosPromise[SchemaClient] = js.native
  def update(
    params: ParamsResourceAccountsContainersWorkspacesClientsUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaClient]
  ): Unit = js.native
  /**
    * Updates a GTM Client.
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
    *   const res = await tagmanager.accounts.containers.workspaces.clients.update({
    *     // When provided, this fingerprint must match the fingerprint of the client in storage.
    *     fingerprint: 'placeholder-value',
    *     // GTM Client's API relative path. Example: accounts/{account_id\}/containers/{container_id\}/workspaces/{workspace_id\}/clients/{client_id\}
    *     path: 'accounts/my-account/containers/my-container/workspaces/my-workspace/clients/my-client',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "accountId": "my_accountId",
    *       //   "clientId": "my_clientId",
    *       //   "containerId": "my_containerId",
    *       //   "fingerprint": "my_fingerprint",
    *       //   "name": "my_name",
    *       //   "notes": "my_notes",
    *       //   "parameter": [],
    *       //   "parentFolderId": "my_parentFolderId",
    *       //   "path": "my_path",
    *       //   "priority": 0,
    *       //   "tagManagerUrl": "my_tagManagerUrl",
    *       //   "type": "my_type",
    *       //   "workspaceId": "my_workspaceId"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "accountId": "my_accountId",
    *   //   "clientId": "my_clientId",
    *   //   "containerId": "my_containerId",
    *   //   "fingerprint": "my_fingerprint",
    *   //   "name": "my_name",
    *   //   "notes": "my_notes",
    *   //   "parameter": [],
    *   //   "parentFolderId": "my_parentFolderId",
    *   //   "path": "my_path",
    *   //   "priority": 0,
    *   //   "tagManagerUrl": "my_tagManagerUrl",
    *   //   "type": "my_type",
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
  def update(params: ParamsResourceAccountsContainersWorkspacesClientsUpdate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def update(
    params: ParamsResourceAccountsContainersWorkspacesClientsUpdate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
