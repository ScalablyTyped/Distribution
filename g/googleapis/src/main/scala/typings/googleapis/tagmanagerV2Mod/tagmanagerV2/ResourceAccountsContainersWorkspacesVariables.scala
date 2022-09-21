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

@JSImport("googleapis/build/src/apis/tagmanager/v2", "tagmanager_v2.Resource$Accounts$Containers$Workspaces$Variables")
@js.native
open class ResourceAccountsContainersWorkspacesVariables protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def create(): GaxiosPromise[SchemaVariable] = js.native
  def create(callback: BodyResponseCallback[SchemaVariable]): Unit = js.native
  def create(params: Unit, options: MethodOptions): GaxiosPromise[SchemaVariable] = js.native
  def create(params: ParamsResourceAccountsContainersWorkspacesVariablesCreate): GaxiosPromise[SchemaVariable] = js.native
  def create(
    params: ParamsResourceAccountsContainersWorkspacesVariablesCreate,
    callback: BodyResponseCallback[SchemaVariable]
  ): Unit = js.native
  def create(
    params: ParamsResourceAccountsContainersWorkspacesVariablesCreate,
    options: BodyResponseCallback[Readable | SchemaVariable],
    callback: BodyResponseCallback[Readable | SchemaVariable]
  ): Unit = js.native
  def create(params: ParamsResourceAccountsContainersWorkspacesVariablesCreate, options: MethodOptions): GaxiosPromise[SchemaVariable] = js.native
  def create(
    params: ParamsResourceAccountsContainersWorkspacesVariablesCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaVariable]
  ): Unit = js.native
  /**
    * Creates a GTM Variable.
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
    *   const res = await tagmanager.accounts.containers.workspaces.variables.create({
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
    *       //   "disablingTriggerId": [],
    *       //   "enablingTriggerId": [],
    *       //   "fingerprint": "my_fingerprint",
    *       //   "formatValue": {},
    *       //   "name": "my_name",
    *       //   "notes": "my_notes",
    *       //   "parameter": [],
    *       //   "parentFolderId": "my_parentFolderId",
    *       //   "path": "my_path",
    *       //   "scheduleEndMs": "my_scheduleEndMs",
    *       //   "scheduleStartMs": "my_scheduleStartMs",
    *       //   "tagManagerUrl": "my_tagManagerUrl",
    *       //   "type": "my_type",
    *       //   "variableId": "my_variableId",
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
    *   //   "disablingTriggerId": [],
    *   //   "enablingTriggerId": [],
    *   //   "fingerprint": "my_fingerprint",
    *   //   "formatValue": {},
    *   //   "name": "my_name",
    *   //   "notes": "my_notes",
    *   //   "parameter": [],
    *   //   "parentFolderId": "my_parentFolderId",
    *   //   "path": "my_path",
    *   //   "scheduleEndMs": "my_scheduleEndMs",
    *   //   "scheduleStartMs": "my_scheduleStartMs",
    *   //   "tagManagerUrl": "my_tagManagerUrl",
    *   //   "type": "my_type",
    *   //   "variableId": "my_variableId",
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
  def create(params: ParamsResourceAccountsContainersWorkspacesVariablesCreate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def create(
    params: ParamsResourceAccountsContainersWorkspacesVariablesCreate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def delete(): GaxiosPromise[Unit] = js.native
  def delete(callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceAccountsContainersWorkspacesVariablesDelete): GaxiosPromise[Unit] = js.native
  def delete(
    params: ParamsResourceAccountsContainersWorkspacesVariablesDelete,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def delete(
    params: ParamsResourceAccountsContainersWorkspacesVariablesDelete,
    options: BodyResponseCallback[Readable | Unit],
    callback: BodyResponseCallback[Readable | Unit]
  ): Unit = js.native
  def delete(params: ParamsResourceAccountsContainersWorkspacesVariablesDelete, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(
    params: ParamsResourceAccountsContainersWorkspacesVariablesDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  /**
    * Deletes a GTM Variable.
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
    *   const res = await tagmanager.accounts.containers.workspaces.variables.delete({
    *     // GTM Variable's API relative path. Example: accounts/{account_id\}/containers/{container_id\}/workspaces/{workspace_id\}/variables/{variable_id\}
    *     path: 'accounts/my-account/containers/my-container/workspaces/my-workspace/variables/my-variable',
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
  def delete(params: ParamsResourceAccountsContainersWorkspacesVariablesDelete, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def delete(
    params: ParamsResourceAccountsContainersWorkspacesVariablesDelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def get(): GaxiosPromise[SchemaVariable] = js.native
  def get(callback: BodyResponseCallback[SchemaVariable]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaVariable] = js.native
  def get(params: ParamsResourceAccountsContainersWorkspacesVariablesGet): GaxiosPromise[SchemaVariable] = js.native
  def get(
    params: ParamsResourceAccountsContainersWorkspacesVariablesGet,
    callback: BodyResponseCallback[SchemaVariable]
  ): Unit = js.native
  def get(
    params: ParamsResourceAccountsContainersWorkspacesVariablesGet,
    options: BodyResponseCallback[Readable | SchemaVariable],
    callback: BodyResponseCallback[Readable | SchemaVariable]
  ): Unit = js.native
  def get(params: ParamsResourceAccountsContainersWorkspacesVariablesGet, options: MethodOptions): GaxiosPromise[SchemaVariable] = js.native
  def get(
    params: ParamsResourceAccountsContainersWorkspacesVariablesGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaVariable]
  ): Unit = js.native
  /**
    * Gets a GTM Variable.
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
    *   const res = await tagmanager.accounts.containers.workspaces.variables.get({
    *     // GTM Variable's API relative path. Example: accounts/{account_id\}/containers/{container_id\}/workspaces/{workspace_id\}/variables/{variable_id\}
    *     path: 'accounts/my-account/containers/my-container/workspaces/my-workspace/variables/my-variable',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "accountId": "my_accountId",
    *   //   "containerId": "my_containerId",
    *   //   "disablingTriggerId": [],
    *   //   "enablingTriggerId": [],
    *   //   "fingerprint": "my_fingerprint",
    *   //   "formatValue": {},
    *   //   "name": "my_name",
    *   //   "notes": "my_notes",
    *   //   "parameter": [],
    *   //   "parentFolderId": "my_parentFolderId",
    *   //   "path": "my_path",
    *   //   "scheduleEndMs": "my_scheduleEndMs",
    *   //   "scheduleStartMs": "my_scheduleStartMs",
    *   //   "tagManagerUrl": "my_tagManagerUrl",
    *   //   "type": "my_type",
    *   //   "variableId": "my_variableId",
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
  def get(params: ParamsResourceAccountsContainersWorkspacesVariablesGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceAccountsContainersWorkspacesVariablesGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaListVariablesResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListVariablesResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListVariablesResponse] = js.native
  def list(params: ParamsResourceAccountsContainersWorkspacesVariablesList): GaxiosPromise[SchemaListVariablesResponse] = js.native
  def list(
    params: ParamsResourceAccountsContainersWorkspacesVariablesList,
    callback: BodyResponseCallback[SchemaListVariablesResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceAccountsContainersWorkspacesVariablesList,
    options: BodyResponseCallback[Readable | SchemaListVariablesResponse],
    callback: BodyResponseCallback[Readable | SchemaListVariablesResponse]
  ): Unit = js.native
  def list(params: ParamsResourceAccountsContainersWorkspacesVariablesList, options: MethodOptions): GaxiosPromise[SchemaListVariablesResponse] = js.native
  def list(
    params: ParamsResourceAccountsContainersWorkspacesVariablesList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListVariablesResponse]
  ): Unit = js.native
  /**
    * Lists all GTM Variables of a Container.
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
    *   const res = await tagmanager.accounts.containers.workspaces.variables.list({
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
    *   //   "nextPageToken": "my_nextPageToken",
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
  def list(params: ParamsResourceAccountsContainersWorkspacesVariablesList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceAccountsContainersWorkspacesVariablesList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def revert(): GaxiosPromise[SchemaRevertVariableResponse] = js.native
  def revert(callback: BodyResponseCallback[SchemaRevertVariableResponse]): Unit = js.native
  def revert(params: Unit, options: MethodOptions): GaxiosPromise[SchemaRevertVariableResponse] = js.native
  def revert(params: ParamsResourceAccountsContainersWorkspacesVariablesRevert): GaxiosPromise[SchemaRevertVariableResponse] = js.native
  def revert(
    params: ParamsResourceAccountsContainersWorkspacesVariablesRevert,
    callback: BodyResponseCallback[SchemaRevertVariableResponse]
  ): Unit = js.native
  def revert(
    params: ParamsResourceAccountsContainersWorkspacesVariablesRevert,
    options: BodyResponseCallback[Readable | SchemaRevertVariableResponse],
    callback: BodyResponseCallback[Readable | SchemaRevertVariableResponse]
  ): Unit = js.native
  def revert(params: ParamsResourceAccountsContainersWorkspacesVariablesRevert, options: MethodOptions): GaxiosPromise[SchemaRevertVariableResponse] = js.native
  def revert(
    params: ParamsResourceAccountsContainersWorkspacesVariablesRevert,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaRevertVariableResponse]
  ): Unit = js.native
  /**
    * Reverts changes to a GTM Variable in a GTM Workspace.
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
    *   const res = await tagmanager.accounts.containers.workspaces.variables.revert({
    *     // When provided, this fingerprint must match the fingerprint of the variable in storage.
    *     fingerprint: 'placeholder-value',
    *     // GTM Variable's API relative path. Example: accounts/{account_id\}/containers/{container_id\}/workspaces/{workspace_id\}/variables/{variable_id\}
    *     path: 'accounts/my-account/containers/my-container/workspaces/my-workspace/variables/my-variable',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "variable": {}
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
  def revert(params: ParamsResourceAccountsContainersWorkspacesVariablesRevert, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def revert(
    params: ParamsResourceAccountsContainersWorkspacesVariablesRevert,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def update(): GaxiosPromise[SchemaVariable] = js.native
  def update(callback: BodyResponseCallback[SchemaVariable]): Unit = js.native
  def update(params: Unit, options: MethodOptions): GaxiosPromise[SchemaVariable] = js.native
  def update(params: ParamsResourceAccountsContainersWorkspacesVariablesUpdate): GaxiosPromise[SchemaVariable] = js.native
  def update(
    params: ParamsResourceAccountsContainersWorkspacesVariablesUpdate,
    callback: BodyResponseCallback[SchemaVariable]
  ): Unit = js.native
  def update(
    params: ParamsResourceAccountsContainersWorkspacesVariablesUpdate,
    options: BodyResponseCallback[Readable | SchemaVariable],
    callback: BodyResponseCallback[Readable | SchemaVariable]
  ): Unit = js.native
  def update(params: ParamsResourceAccountsContainersWorkspacesVariablesUpdate, options: MethodOptions): GaxiosPromise[SchemaVariable] = js.native
  def update(
    params: ParamsResourceAccountsContainersWorkspacesVariablesUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaVariable]
  ): Unit = js.native
  /**
    * Updates a GTM Variable.
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
    *   const res = await tagmanager.accounts.containers.workspaces.variables.update({
    *     // When provided, this fingerprint must match the fingerprint of the variable in storage.
    *     fingerprint: 'placeholder-value',
    *     // GTM Variable's API relative path. Example: accounts/{account_id\}/containers/{container_id\}/workspaces/{workspace_id\}/variables/{variable_id\}
    *     path: 'accounts/my-account/containers/my-container/workspaces/my-workspace/variables/my-variable',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "accountId": "my_accountId",
    *       //   "containerId": "my_containerId",
    *       //   "disablingTriggerId": [],
    *       //   "enablingTriggerId": [],
    *       //   "fingerprint": "my_fingerprint",
    *       //   "formatValue": {},
    *       //   "name": "my_name",
    *       //   "notes": "my_notes",
    *       //   "parameter": [],
    *       //   "parentFolderId": "my_parentFolderId",
    *       //   "path": "my_path",
    *       //   "scheduleEndMs": "my_scheduleEndMs",
    *       //   "scheduleStartMs": "my_scheduleStartMs",
    *       //   "tagManagerUrl": "my_tagManagerUrl",
    *       //   "type": "my_type",
    *       //   "variableId": "my_variableId",
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
    *   //   "disablingTriggerId": [],
    *   //   "enablingTriggerId": [],
    *   //   "fingerprint": "my_fingerprint",
    *   //   "formatValue": {},
    *   //   "name": "my_name",
    *   //   "notes": "my_notes",
    *   //   "parameter": [],
    *   //   "parentFolderId": "my_parentFolderId",
    *   //   "path": "my_path",
    *   //   "scheduleEndMs": "my_scheduleEndMs",
    *   //   "scheduleStartMs": "my_scheduleStartMs",
    *   //   "tagManagerUrl": "my_tagManagerUrl",
    *   //   "type": "my_type",
    *   //   "variableId": "my_variableId",
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
  def update(params: ParamsResourceAccountsContainersWorkspacesVariablesUpdate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def update(
    params: ParamsResourceAccountsContainersWorkspacesVariablesUpdate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
