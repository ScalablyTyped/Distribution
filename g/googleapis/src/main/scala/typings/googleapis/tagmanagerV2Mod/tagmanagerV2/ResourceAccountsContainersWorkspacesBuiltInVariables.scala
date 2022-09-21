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

@JSImport("googleapis/build/src/apis/tagmanager/v2", "tagmanager_v2.Resource$Accounts$Containers$Workspaces$Built_in_variables")
@js.native
open class ResourceAccountsContainersWorkspacesBuiltInVariables protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def create(): GaxiosPromise[SchemaCreateBuiltInVariableResponse] = js.native
  def create(callback: BodyResponseCallback[SchemaCreateBuiltInVariableResponse]): Unit = js.native
  def create(params: Unit, options: MethodOptions): GaxiosPromise[SchemaCreateBuiltInVariableResponse] = js.native
  def create(params: ParamsResourceAccountsContainersWorkspacesBuiltInVariablesCreate): GaxiosPromise[SchemaCreateBuiltInVariableResponse] = js.native
  def create(
    params: ParamsResourceAccountsContainersWorkspacesBuiltInVariablesCreate,
    callback: BodyResponseCallback[SchemaCreateBuiltInVariableResponse]
  ): Unit = js.native
  def create(
    params: ParamsResourceAccountsContainersWorkspacesBuiltInVariablesCreate,
    options: BodyResponseCallback[Readable | SchemaCreateBuiltInVariableResponse],
    callback: BodyResponseCallback[Readable | SchemaCreateBuiltInVariableResponse]
  ): Unit = js.native
  def create(params: ParamsResourceAccountsContainersWorkspacesBuiltInVariablesCreate, options: MethodOptions): GaxiosPromise[SchemaCreateBuiltInVariableResponse] = js.native
  def create(
    params: ParamsResourceAccountsContainersWorkspacesBuiltInVariablesCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaCreateBuiltInVariableResponse]
  ): Unit = js.native
  /**
    * Creates one or more GTM Built-In Variables.
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
    *     await tagmanager.accounts.containers.workspaces.built_in_variables.create({
    *       // GTM Workspace's API relative path. Example: accounts/{account_id\}/containers/{container_id\}/workspaces/{workspace_id\}
    *       parent:
    *         'accounts/my-account/containers/my-container/workspaces/my-workspace',
    *       // The types of built-in variables to enable.
    *       type: 'placeholder-value',
    *     });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "builtInVariable": []
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
  def create(
    params: ParamsResourceAccountsContainersWorkspacesBuiltInVariablesCreate,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def create(
    params: ParamsResourceAccountsContainersWorkspacesBuiltInVariablesCreate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def delete(): GaxiosPromise[Unit] = js.native
  def delete(callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceAccountsContainersWorkspacesBuiltInVariablesDelete): GaxiosPromise[Unit] = js.native
  def delete(
    params: ParamsResourceAccountsContainersWorkspacesBuiltInVariablesDelete,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def delete(
    params: ParamsResourceAccountsContainersWorkspacesBuiltInVariablesDelete,
    options: BodyResponseCallback[Readable | Unit],
    callback: BodyResponseCallback[Readable | Unit]
  ): Unit = js.native
  def delete(params: ParamsResourceAccountsContainersWorkspacesBuiltInVariablesDelete, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(
    params: ParamsResourceAccountsContainersWorkspacesBuiltInVariablesDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  /**
    * Deletes one or more GTM Built-In Variables.
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
    *     await tagmanager.accounts.containers.workspaces.built_in_variables.delete({
    *       // GTM BuiltInVariable's API relative path. Example: accounts/{account_id\}/containers/{container_id\}/workspaces/{workspace_id\}/built_in_variables
    *       path: 'accounts/my-account/containers/my-container/workspaces/my-workspace/built_in_variables',
    *       // The types of built-in variables to delete.
    *       type: 'placeholder-value',
    *     });
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
  def delete(
    params: ParamsResourceAccountsContainersWorkspacesBuiltInVariablesDelete,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def delete(
    params: ParamsResourceAccountsContainersWorkspacesBuiltInVariablesDelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaListEnabledBuiltInVariablesResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListEnabledBuiltInVariablesResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListEnabledBuiltInVariablesResponse] = js.native
  def list(params: ParamsResourceAccountsContainersWorkspacesBuiltInVariablesList): GaxiosPromise[SchemaListEnabledBuiltInVariablesResponse] = js.native
  def list(
    params: ParamsResourceAccountsContainersWorkspacesBuiltInVariablesList,
    callback: BodyResponseCallback[SchemaListEnabledBuiltInVariablesResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceAccountsContainersWorkspacesBuiltInVariablesList,
    options: BodyResponseCallback[Readable | SchemaListEnabledBuiltInVariablesResponse],
    callback: BodyResponseCallback[Readable | SchemaListEnabledBuiltInVariablesResponse]
  ): Unit = js.native
  def list(params: ParamsResourceAccountsContainersWorkspacesBuiltInVariablesList, options: MethodOptions): GaxiosPromise[SchemaListEnabledBuiltInVariablesResponse] = js.native
  def list(
    params: ParamsResourceAccountsContainersWorkspacesBuiltInVariablesList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListEnabledBuiltInVariablesResponse]
  ): Unit = js.native
  /**
    * Lists all the enabled Built-In Variables of a GTM Container.
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
    *   const res =
    *     await tagmanager.accounts.containers.workspaces.built_in_variables.list({
    *       // Continuation token for fetching the next page of results.
    *       pageToken: 'placeholder-value',
    *       // GTM Workspace's API relative path. Example: accounts/{account_id\}/containers/{container_id\}/workspaces/{workspace_id\}
    *       parent:
    *         'accounts/my-account/containers/my-container/workspaces/my-workspace',
    *     });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "builtInVariable": [],
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
  def list(
    params: ParamsResourceAccountsContainersWorkspacesBuiltInVariablesList,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceAccountsContainersWorkspacesBuiltInVariablesList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def revert(): GaxiosPromise[SchemaRevertBuiltInVariableResponse] = js.native
  def revert(callback: BodyResponseCallback[SchemaRevertBuiltInVariableResponse]): Unit = js.native
  def revert(params: Unit, options: MethodOptions): GaxiosPromise[SchemaRevertBuiltInVariableResponse] = js.native
  def revert(params: ParamsResourceAccountsContainersWorkspacesBuiltInVariablesRevert): GaxiosPromise[SchemaRevertBuiltInVariableResponse] = js.native
  def revert(
    params: ParamsResourceAccountsContainersWorkspacesBuiltInVariablesRevert,
    callback: BodyResponseCallback[SchemaRevertBuiltInVariableResponse]
  ): Unit = js.native
  def revert(
    params: ParamsResourceAccountsContainersWorkspacesBuiltInVariablesRevert,
    options: BodyResponseCallback[Readable | SchemaRevertBuiltInVariableResponse],
    callback: BodyResponseCallback[Readable | SchemaRevertBuiltInVariableResponse]
  ): Unit = js.native
  def revert(params: ParamsResourceAccountsContainersWorkspacesBuiltInVariablesRevert, options: MethodOptions): GaxiosPromise[SchemaRevertBuiltInVariableResponse] = js.native
  def revert(
    params: ParamsResourceAccountsContainersWorkspacesBuiltInVariablesRevert,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaRevertBuiltInVariableResponse]
  ): Unit = js.native
  /**
    * Reverts changes to a GTM Built-In Variables in a GTM Workspace.
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
    *     await tagmanager.accounts.containers.workspaces.built_in_variables.revert({
    *       // GTM BuiltInVariable's API relative path. Example: accounts/{account_id\}/containers/{container_id\}/workspaces/{workspace_id\}/built_in_variables
    *       path: 'accounts/my-account/containers/my-container/workspaces/my-workspace',
    *       // The type of built-in variable to revert.
    *       type: 'placeholder-value',
    *     });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "enabled": false
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
  def revert(
    params: ParamsResourceAccountsContainersWorkspacesBuiltInVariablesRevert,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def revert(
    params: ParamsResourceAccountsContainersWorkspacesBuiltInVariablesRevert,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
