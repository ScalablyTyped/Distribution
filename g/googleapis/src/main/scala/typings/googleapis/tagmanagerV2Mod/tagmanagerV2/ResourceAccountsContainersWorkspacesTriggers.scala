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

@JSImport("googleapis/build/src/apis/tagmanager/v2", "tagmanager_v2.Resource$Accounts$Containers$Workspaces$Triggers")
@js.native
open class ResourceAccountsContainersWorkspacesTriggers protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def create(): GaxiosPromise[SchemaTrigger] = js.native
  def create(callback: BodyResponseCallback[SchemaTrigger]): Unit = js.native
  def create(params: Unit, options: MethodOptions): GaxiosPromise[SchemaTrigger] = js.native
  def create(params: ParamsResourceAccountsContainersWorkspacesTriggersCreate): GaxiosPromise[SchemaTrigger] = js.native
  def create(
    params: ParamsResourceAccountsContainersWorkspacesTriggersCreate,
    callback: BodyResponseCallback[SchemaTrigger]
  ): Unit = js.native
  def create(
    params: ParamsResourceAccountsContainersWorkspacesTriggersCreate,
    options: BodyResponseCallback[Readable | SchemaTrigger],
    callback: BodyResponseCallback[Readable | SchemaTrigger]
  ): Unit = js.native
  def create(params: ParamsResourceAccountsContainersWorkspacesTriggersCreate, options: MethodOptions): GaxiosPromise[SchemaTrigger] = js.native
  def create(
    params: ParamsResourceAccountsContainersWorkspacesTriggersCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaTrigger]
  ): Unit = js.native
  /**
    * Creates a GTM Trigger.
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
    *   const res = await tagmanager.accounts.containers.workspaces.triggers.create({
    *     // GTM Workspaces's API relative path. Example: accounts/{account_id\}/containers/{container_id\}/workspaces/{workspace_id\}
    *     parent:
    *       'accounts/my-account/containers/my-container/workspaces/my-workspace',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "accountId": "my_accountId",
    *       //   "autoEventFilter": [],
    *       //   "checkValidation": {},
    *       //   "containerId": "my_containerId",
    *       //   "continuousTimeMinMilliseconds": {},
    *       //   "customEventFilter": [],
    *       //   "eventName": {},
    *       //   "filter": [],
    *       //   "fingerprint": "my_fingerprint",
    *       //   "horizontalScrollPercentageList": {},
    *       //   "interval": {},
    *       //   "intervalSeconds": {},
    *       //   "limit": {},
    *       //   "maxTimerLengthSeconds": {},
    *       //   "name": "my_name",
    *       //   "notes": "my_notes",
    *       //   "parameter": [],
    *       //   "parentFolderId": "my_parentFolderId",
    *       //   "path": "my_path",
    *       //   "selector": {},
    *       //   "tagManagerUrl": "my_tagManagerUrl",
    *       //   "totalTimeMinMilliseconds": {},
    *       //   "triggerId": "my_triggerId",
    *       //   "type": "my_type",
    *       //   "uniqueTriggerId": {},
    *       //   "verticalScrollPercentageList": {},
    *       //   "visibilitySelector": {},
    *       //   "visiblePercentageMax": {},
    *       //   "visiblePercentageMin": {},
    *       //   "waitForTags": {},
    *       //   "waitForTagsTimeout": {},
    *       //   "workspaceId": "my_workspaceId"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "accountId": "my_accountId",
    *   //   "autoEventFilter": [],
    *   //   "checkValidation": {},
    *   //   "containerId": "my_containerId",
    *   //   "continuousTimeMinMilliseconds": {},
    *   //   "customEventFilter": [],
    *   //   "eventName": {},
    *   //   "filter": [],
    *   //   "fingerprint": "my_fingerprint",
    *   //   "horizontalScrollPercentageList": {},
    *   //   "interval": {},
    *   //   "intervalSeconds": {},
    *   //   "limit": {},
    *   //   "maxTimerLengthSeconds": {},
    *   //   "name": "my_name",
    *   //   "notes": "my_notes",
    *   //   "parameter": [],
    *   //   "parentFolderId": "my_parentFolderId",
    *   //   "path": "my_path",
    *   //   "selector": {},
    *   //   "tagManagerUrl": "my_tagManagerUrl",
    *   //   "totalTimeMinMilliseconds": {},
    *   //   "triggerId": "my_triggerId",
    *   //   "type": "my_type",
    *   //   "uniqueTriggerId": {},
    *   //   "verticalScrollPercentageList": {},
    *   //   "visibilitySelector": {},
    *   //   "visiblePercentageMax": {},
    *   //   "visiblePercentageMin": {},
    *   //   "waitForTags": {},
    *   //   "waitForTagsTimeout": {},
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
  def create(params: ParamsResourceAccountsContainersWorkspacesTriggersCreate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def create(
    params: ParamsResourceAccountsContainersWorkspacesTriggersCreate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def delete(): GaxiosPromise[Unit] = js.native
  def delete(callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceAccountsContainersWorkspacesTriggersDelete): GaxiosPromise[Unit] = js.native
  def delete(
    params: ParamsResourceAccountsContainersWorkspacesTriggersDelete,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def delete(
    params: ParamsResourceAccountsContainersWorkspacesTriggersDelete,
    options: BodyResponseCallback[Readable | Unit],
    callback: BodyResponseCallback[Readable | Unit]
  ): Unit = js.native
  def delete(params: ParamsResourceAccountsContainersWorkspacesTriggersDelete, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(
    params: ParamsResourceAccountsContainersWorkspacesTriggersDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  /**
    * Deletes a GTM Trigger.
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
    *   const res = await tagmanager.accounts.containers.workspaces.triggers.delete({
    *     // GTM Trigger's API relative path. Example: accounts/{account_id\}/containers/{container_id\}/workspaces/{workspace_id\}/triggers/{trigger_id\}
    *     path: 'accounts/my-account/containers/my-container/workspaces/my-workspace/triggers/my-trigger',
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
  def delete(params: ParamsResourceAccountsContainersWorkspacesTriggersDelete, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def delete(
    params: ParamsResourceAccountsContainersWorkspacesTriggersDelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def get(): GaxiosPromise[SchemaTrigger] = js.native
  def get(callback: BodyResponseCallback[SchemaTrigger]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaTrigger] = js.native
  def get(params: ParamsResourceAccountsContainersWorkspacesTriggersGet): GaxiosPromise[SchemaTrigger] = js.native
  def get(
    params: ParamsResourceAccountsContainersWorkspacesTriggersGet,
    callback: BodyResponseCallback[SchemaTrigger]
  ): Unit = js.native
  def get(
    params: ParamsResourceAccountsContainersWorkspacesTriggersGet,
    options: BodyResponseCallback[Readable | SchemaTrigger],
    callback: BodyResponseCallback[Readable | SchemaTrigger]
  ): Unit = js.native
  def get(params: ParamsResourceAccountsContainersWorkspacesTriggersGet, options: MethodOptions): GaxiosPromise[SchemaTrigger] = js.native
  def get(
    params: ParamsResourceAccountsContainersWorkspacesTriggersGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaTrigger]
  ): Unit = js.native
  /**
    * Gets a GTM Trigger.
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
    *   const res = await tagmanager.accounts.containers.workspaces.triggers.get({
    *     // GTM Trigger's API relative path. Example: accounts/{account_id\}/containers/{container_id\}/workspaces/{workspace_id\}/triggers/{trigger_id\}
    *     path: 'accounts/my-account/containers/my-container/workspaces/my-workspace/triggers/my-trigger',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "accountId": "my_accountId",
    *   //   "autoEventFilter": [],
    *   //   "checkValidation": {},
    *   //   "containerId": "my_containerId",
    *   //   "continuousTimeMinMilliseconds": {},
    *   //   "customEventFilter": [],
    *   //   "eventName": {},
    *   //   "filter": [],
    *   //   "fingerprint": "my_fingerprint",
    *   //   "horizontalScrollPercentageList": {},
    *   //   "interval": {},
    *   //   "intervalSeconds": {},
    *   //   "limit": {},
    *   //   "maxTimerLengthSeconds": {},
    *   //   "name": "my_name",
    *   //   "notes": "my_notes",
    *   //   "parameter": [],
    *   //   "parentFolderId": "my_parentFolderId",
    *   //   "path": "my_path",
    *   //   "selector": {},
    *   //   "tagManagerUrl": "my_tagManagerUrl",
    *   //   "totalTimeMinMilliseconds": {},
    *   //   "triggerId": "my_triggerId",
    *   //   "type": "my_type",
    *   //   "uniqueTriggerId": {},
    *   //   "verticalScrollPercentageList": {},
    *   //   "visibilitySelector": {},
    *   //   "visiblePercentageMax": {},
    *   //   "visiblePercentageMin": {},
    *   //   "waitForTags": {},
    *   //   "waitForTagsTimeout": {},
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
  def get(params: ParamsResourceAccountsContainersWorkspacesTriggersGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceAccountsContainersWorkspacesTriggersGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaListTriggersResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListTriggersResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListTriggersResponse] = js.native
  def list(params: ParamsResourceAccountsContainersWorkspacesTriggersList): GaxiosPromise[SchemaListTriggersResponse] = js.native
  def list(
    params: ParamsResourceAccountsContainersWorkspacesTriggersList,
    callback: BodyResponseCallback[SchemaListTriggersResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceAccountsContainersWorkspacesTriggersList,
    options: BodyResponseCallback[Readable | SchemaListTriggersResponse],
    callback: BodyResponseCallback[Readable | SchemaListTriggersResponse]
  ): Unit = js.native
  def list(params: ParamsResourceAccountsContainersWorkspacesTriggersList, options: MethodOptions): GaxiosPromise[SchemaListTriggersResponse] = js.native
  def list(
    params: ParamsResourceAccountsContainersWorkspacesTriggersList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListTriggersResponse]
  ): Unit = js.native
  /**
    * Lists all GTM Triggers of a Container.
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
    *   const res = await tagmanager.accounts.containers.workspaces.triggers.list({
    *     // Continuation token for fetching the next page of results.
    *     pageToken: 'placeholder-value',
    *     // GTM Workspaces's API relative path. Example: accounts/{account_id\}/containers/{container_id\}/workspaces/{workspace_id\}
    *     parent:
    *       'accounts/my-account/containers/my-container/workspaces/my-workspace',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "nextPageToken": "my_nextPageToken",
    *   //   "trigger": []
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
  def list(params: ParamsResourceAccountsContainersWorkspacesTriggersList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceAccountsContainersWorkspacesTriggersList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def revert(): GaxiosPromise[SchemaRevertTriggerResponse] = js.native
  def revert(callback: BodyResponseCallback[SchemaRevertTriggerResponse]): Unit = js.native
  def revert(params: Unit, options: MethodOptions): GaxiosPromise[SchemaRevertTriggerResponse] = js.native
  def revert(params: ParamsResourceAccountsContainersWorkspacesTriggersRevert): GaxiosPromise[SchemaRevertTriggerResponse] = js.native
  def revert(
    params: ParamsResourceAccountsContainersWorkspacesTriggersRevert,
    callback: BodyResponseCallback[SchemaRevertTriggerResponse]
  ): Unit = js.native
  def revert(
    params: ParamsResourceAccountsContainersWorkspacesTriggersRevert,
    options: BodyResponseCallback[Readable | SchemaRevertTriggerResponse],
    callback: BodyResponseCallback[Readable | SchemaRevertTriggerResponse]
  ): Unit = js.native
  def revert(params: ParamsResourceAccountsContainersWorkspacesTriggersRevert, options: MethodOptions): GaxiosPromise[SchemaRevertTriggerResponse] = js.native
  def revert(
    params: ParamsResourceAccountsContainersWorkspacesTriggersRevert,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaRevertTriggerResponse]
  ): Unit = js.native
  /**
    * Reverts changes to a GTM Trigger in a GTM Workspace.
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
    *   const res = await tagmanager.accounts.containers.workspaces.triggers.revert({
    *     // When provided, this fingerprint must match the fingerprint of the trigger in storage.
    *     fingerprint: 'placeholder-value',
    *     // GTM Trigger's API relative path. Example: accounts/{account_id\}/containers/{container_id\}/workspaces/{workspace_id\}/triggers/{trigger_id\}
    *     path: 'accounts/my-account/containers/my-container/workspaces/my-workspace/triggers/my-trigger',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "trigger": {}
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
  def revert(params: ParamsResourceAccountsContainersWorkspacesTriggersRevert, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def revert(
    params: ParamsResourceAccountsContainersWorkspacesTriggersRevert,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def update(): GaxiosPromise[SchemaTrigger] = js.native
  def update(callback: BodyResponseCallback[SchemaTrigger]): Unit = js.native
  def update(params: Unit, options: MethodOptions): GaxiosPromise[SchemaTrigger] = js.native
  def update(params: ParamsResourceAccountsContainersWorkspacesTriggersUpdate): GaxiosPromise[SchemaTrigger] = js.native
  def update(
    params: ParamsResourceAccountsContainersWorkspacesTriggersUpdate,
    callback: BodyResponseCallback[SchemaTrigger]
  ): Unit = js.native
  def update(
    params: ParamsResourceAccountsContainersWorkspacesTriggersUpdate,
    options: BodyResponseCallback[Readable | SchemaTrigger],
    callback: BodyResponseCallback[Readable | SchemaTrigger]
  ): Unit = js.native
  def update(params: ParamsResourceAccountsContainersWorkspacesTriggersUpdate, options: MethodOptions): GaxiosPromise[SchemaTrigger] = js.native
  def update(
    params: ParamsResourceAccountsContainersWorkspacesTriggersUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaTrigger]
  ): Unit = js.native
  /**
    * Updates a GTM Trigger.
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
    *   const res = await tagmanager.accounts.containers.workspaces.triggers.update({
    *     // When provided, this fingerprint must match the fingerprint of the trigger in storage.
    *     fingerprint: 'placeholder-value',
    *     // GTM Trigger's API relative path. Example: accounts/{account_id\}/containers/{container_id\}/workspaces/{workspace_id\}/triggers/{trigger_id\}
    *     path: 'accounts/my-account/containers/my-container/workspaces/my-workspace/triggers/my-trigger',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "accountId": "my_accountId",
    *       //   "autoEventFilter": [],
    *       //   "checkValidation": {},
    *       //   "containerId": "my_containerId",
    *       //   "continuousTimeMinMilliseconds": {},
    *       //   "customEventFilter": [],
    *       //   "eventName": {},
    *       //   "filter": [],
    *       //   "fingerprint": "my_fingerprint",
    *       //   "horizontalScrollPercentageList": {},
    *       //   "interval": {},
    *       //   "intervalSeconds": {},
    *       //   "limit": {},
    *       //   "maxTimerLengthSeconds": {},
    *       //   "name": "my_name",
    *       //   "notes": "my_notes",
    *       //   "parameter": [],
    *       //   "parentFolderId": "my_parentFolderId",
    *       //   "path": "my_path",
    *       //   "selector": {},
    *       //   "tagManagerUrl": "my_tagManagerUrl",
    *       //   "totalTimeMinMilliseconds": {},
    *       //   "triggerId": "my_triggerId",
    *       //   "type": "my_type",
    *       //   "uniqueTriggerId": {},
    *       //   "verticalScrollPercentageList": {},
    *       //   "visibilitySelector": {},
    *       //   "visiblePercentageMax": {},
    *       //   "visiblePercentageMin": {},
    *       //   "waitForTags": {},
    *       //   "waitForTagsTimeout": {},
    *       //   "workspaceId": "my_workspaceId"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "accountId": "my_accountId",
    *   //   "autoEventFilter": [],
    *   //   "checkValidation": {},
    *   //   "containerId": "my_containerId",
    *   //   "continuousTimeMinMilliseconds": {},
    *   //   "customEventFilter": [],
    *   //   "eventName": {},
    *   //   "filter": [],
    *   //   "fingerprint": "my_fingerprint",
    *   //   "horizontalScrollPercentageList": {},
    *   //   "interval": {},
    *   //   "intervalSeconds": {},
    *   //   "limit": {},
    *   //   "maxTimerLengthSeconds": {},
    *   //   "name": "my_name",
    *   //   "notes": "my_notes",
    *   //   "parameter": [],
    *   //   "parentFolderId": "my_parentFolderId",
    *   //   "path": "my_path",
    *   //   "selector": {},
    *   //   "tagManagerUrl": "my_tagManagerUrl",
    *   //   "totalTimeMinMilliseconds": {},
    *   //   "triggerId": "my_triggerId",
    *   //   "type": "my_type",
    *   //   "uniqueTriggerId": {},
    *   //   "verticalScrollPercentageList": {},
    *   //   "visibilitySelector": {},
    *   //   "visiblePercentageMax": {},
    *   //   "visiblePercentageMin": {},
    *   //   "waitForTags": {},
    *   //   "waitForTagsTimeout": {},
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
  def update(params: ParamsResourceAccountsContainersWorkspacesTriggersUpdate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def update(
    params: ParamsResourceAccountsContainersWorkspacesTriggersUpdate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
