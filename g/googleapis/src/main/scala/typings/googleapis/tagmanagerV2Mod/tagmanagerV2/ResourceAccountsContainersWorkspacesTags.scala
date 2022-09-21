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

@JSImport("googleapis/build/src/apis/tagmanager/v2", "tagmanager_v2.Resource$Accounts$Containers$Workspaces$Tags")
@js.native
open class ResourceAccountsContainersWorkspacesTags protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def create(): GaxiosPromise[SchemaTag] = js.native
  def create(callback: BodyResponseCallback[SchemaTag]): Unit = js.native
  def create(params: Unit, options: MethodOptions): GaxiosPromise[SchemaTag] = js.native
  def create(params: ParamsResourceAccountsContainersWorkspacesTagsCreate): GaxiosPromise[SchemaTag] = js.native
  def create(
    params: ParamsResourceAccountsContainersWorkspacesTagsCreate,
    callback: BodyResponseCallback[SchemaTag]
  ): Unit = js.native
  def create(
    params: ParamsResourceAccountsContainersWorkspacesTagsCreate,
    options: BodyResponseCallback[Readable | SchemaTag],
    callback: BodyResponseCallback[Readable | SchemaTag]
  ): Unit = js.native
  def create(params: ParamsResourceAccountsContainersWorkspacesTagsCreate, options: MethodOptions): GaxiosPromise[SchemaTag] = js.native
  def create(
    params: ParamsResourceAccountsContainersWorkspacesTagsCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaTag]
  ): Unit = js.native
  /**
    * Creates a GTM Tag.
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
    *   const res = await tagmanager.accounts.containers.workspaces.tags.create({
    *     // GTM Workspace's API relative path. Example: accounts/{account_id\}/containers/{container_id\}/workspaces/{workspace_id\}
    *     parent:
    *       'accounts/my-account/containers/my-container/workspaces/my-workspace',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "accountId": "my_accountId",
    *       //   "blockingRuleId": [],
    *       //   "blockingTriggerId": [],
    *       //   "consentSettings": {},
    *       //   "containerId": "my_containerId",
    *       //   "fingerprint": "my_fingerprint",
    *       //   "firingRuleId": [],
    *       //   "firingTriggerId": [],
    *       //   "liveOnly": false,
    *       //   "monitoringMetadata": {},
    *       //   "monitoringMetadataTagNameKey": "my_monitoringMetadataTagNameKey",
    *       //   "name": "my_name",
    *       //   "notes": "my_notes",
    *       //   "parameter": [],
    *       //   "parentFolderId": "my_parentFolderId",
    *       //   "path": "my_path",
    *       //   "paused": false,
    *       //   "priority": {},
    *       //   "scheduleEndMs": "my_scheduleEndMs",
    *       //   "scheduleStartMs": "my_scheduleStartMs",
    *       //   "setupTag": [],
    *       //   "tagFiringOption": "my_tagFiringOption",
    *       //   "tagId": "my_tagId",
    *       //   "tagManagerUrl": "my_tagManagerUrl",
    *       //   "teardownTag": [],
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
    *   //   "blockingRuleId": [],
    *   //   "blockingTriggerId": [],
    *   //   "consentSettings": {},
    *   //   "containerId": "my_containerId",
    *   //   "fingerprint": "my_fingerprint",
    *   //   "firingRuleId": [],
    *   //   "firingTriggerId": [],
    *   //   "liveOnly": false,
    *   //   "monitoringMetadata": {},
    *   //   "monitoringMetadataTagNameKey": "my_monitoringMetadataTagNameKey",
    *   //   "name": "my_name",
    *   //   "notes": "my_notes",
    *   //   "parameter": [],
    *   //   "parentFolderId": "my_parentFolderId",
    *   //   "path": "my_path",
    *   //   "paused": false,
    *   //   "priority": {},
    *   //   "scheduleEndMs": "my_scheduleEndMs",
    *   //   "scheduleStartMs": "my_scheduleStartMs",
    *   //   "setupTag": [],
    *   //   "tagFiringOption": "my_tagFiringOption",
    *   //   "tagId": "my_tagId",
    *   //   "tagManagerUrl": "my_tagManagerUrl",
    *   //   "teardownTag": [],
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
  def create(params: ParamsResourceAccountsContainersWorkspacesTagsCreate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def create(
    params: ParamsResourceAccountsContainersWorkspacesTagsCreate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def delete(): GaxiosPromise[Unit] = js.native
  def delete(callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceAccountsContainersWorkspacesTagsDelete): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceAccountsContainersWorkspacesTagsDelete, callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(
    params: ParamsResourceAccountsContainersWorkspacesTagsDelete,
    options: BodyResponseCallback[Readable | Unit],
    callback: BodyResponseCallback[Readable | Unit]
  ): Unit = js.native
  def delete(params: ParamsResourceAccountsContainersWorkspacesTagsDelete, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(
    params: ParamsResourceAccountsContainersWorkspacesTagsDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  /**
    * Deletes a GTM Tag.
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
    *   const res = await tagmanager.accounts.containers.workspaces.tags.delete({
    *     // GTM Tag's API relative path. Example: accounts/{account_id\}/containers/{container_id\}/workspaces/{workspace_id\}/tags/{tag_id\}
    *     path: 'accounts/my-account/containers/my-container/workspaces/my-workspace/tags/my-tag',
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
  def delete(params: ParamsResourceAccountsContainersWorkspacesTagsDelete, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def delete(
    params: ParamsResourceAccountsContainersWorkspacesTagsDelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def get(): GaxiosPromise[SchemaTag] = js.native
  def get(callback: BodyResponseCallback[SchemaTag]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaTag] = js.native
  def get(params: ParamsResourceAccountsContainersWorkspacesTagsGet): GaxiosPromise[SchemaTag] = js.native
  def get(
    params: ParamsResourceAccountsContainersWorkspacesTagsGet,
    callback: BodyResponseCallback[SchemaTag]
  ): Unit = js.native
  def get(
    params: ParamsResourceAccountsContainersWorkspacesTagsGet,
    options: BodyResponseCallback[Readable | SchemaTag],
    callback: BodyResponseCallback[Readable | SchemaTag]
  ): Unit = js.native
  def get(params: ParamsResourceAccountsContainersWorkspacesTagsGet, options: MethodOptions): GaxiosPromise[SchemaTag] = js.native
  def get(
    params: ParamsResourceAccountsContainersWorkspacesTagsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaTag]
  ): Unit = js.native
  /**
    * Gets a GTM Tag.
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
    *   const res = await tagmanager.accounts.containers.workspaces.tags.get({
    *     // GTM Tag's API relative path. Example: accounts/{account_id\}/containers/{container_id\}/workspaces/{workspace_id\}/tags/{tag_id\}
    *     path: 'accounts/my-account/containers/my-container/workspaces/my-workspace/tags/my-tag',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "accountId": "my_accountId",
    *   //   "blockingRuleId": [],
    *   //   "blockingTriggerId": [],
    *   //   "consentSettings": {},
    *   //   "containerId": "my_containerId",
    *   //   "fingerprint": "my_fingerprint",
    *   //   "firingRuleId": [],
    *   //   "firingTriggerId": [],
    *   //   "liveOnly": false,
    *   //   "monitoringMetadata": {},
    *   //   "monitoringMetadataTagNameKey": "my_monitoringMetadataTagNameKey",
    *   //   "name": "my_name",
    *   //   "notes": "my_notes",
    *   //   "parameter": [],
    *   //   "parentFolderId": "my_parentFolderId",
    *   //   "path": "my_path",
    *   //   "paused": false,
    *   //   "priority": {},
    *   //   "scheduleEndMs": "my_scheduleEndMs",
    *   //   "scheduleStartMs": "my_scheduleStartMs",
    *   //   "setupTag": [],
    *   //   "tagFiringOption": "my_tagFiringOption",
    *   //   "tagId": "my_tagId",
    *   //   "tagManagerUrl": "my_tagManagerUrl",
    *   //   "teardownTag": [],
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
  def get(params: ParamsResourceAccountsContainersWorkspacesTagsGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceAccountsContainersWorkspacesTagsGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaListTagsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListTagsResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListTagsResponse] = js.native
  def list(params: ParamsResourceAccountsContainersWorkspacesTagsList): GaxiosPromise[SchemaListTagsResponse] = js.native
  def list(
    params: ParamsResourceAccountsContainersWorkspacesTagsList,
    callback: BodyResponseCallback[SchemaListTagsResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceAccountsContainersWorkspacesTagsList,
    options: BodyResponseCallback[Readable | SchemaListTagsResponse],
    callback: BodyResponseCallback[Readable | SchemaListTagsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceAccountsContainersWorkspacesTagsList, options: MethodOptions): GaxiosPromise[SchemaListTagsResponse] = js.native
  def list(
    params: ParamsResourceAccountsContainersWorkspacesTagsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListTagsResponse]
  ): Unit = js.native
  /**
    * Lists all GTM Tags of a Container.
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
    *   const res = await tagmanager.accounts.containers.workspaces.tags.list({
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
    *   //   "tag": []
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
  def list(params: ParamsResourceAccountsContainersWorkspacesTagsList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceAccountsContainersWorkspacesTagsList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def revert(): GaxiosPromise[SchemaRevertTagResponse] = js.native
  def revert(callback: BodyResponseCallback[SchemaRevertTagResponse]): Unit = js.native
  def revert(params: Unit, options: MethodOptions): GaxiosPromise[SchemaRevertTagResponse] = js.native
  def revert(params: ParamsResourceAccountsContainersWorkspacesTagsRevert): GaxiosPromise[SchemaRevertTagResponse] = js.native
  def revert(
    params: ParamsResourceAccountsContainersWorkspacesTagsRevert,
    callback: BodyResponseCallback[SchemaRevertTagResponse]
  ): Unit = js.native
  def revert(
    params: ParamsResourceAccountsContainersWorkspacesTagsRevert,
    options: BodyResponseCallback[Readable | SchemaRevertTagResponse],
    callback: BodyResponseCallback[Readable | SchemaRevertTagResponse]
  ): Unit = js.native
  def revert(params: ParamsResourceAccountsContainersWorkspacesTagsRevert, options: MethodOptions): GaxiosPromise[SchemaRevertTagResponse] = js.native
  def revert(
    params: ParamsResourceAccountsContainersWorkspacesTagsRevert,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaRevertTagResponse]
  ): Unit = js.native
  /**
    * Reverts changes to a GTM Tag in a GTM Workspace.
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
    *   const res = await tagmanager.accounts.containers.workspaces.tags.revert({
    *     // When provided, this fingerprint must match the fingerprint of thetag in storage.
    *     fingerprint: 'placeholder-value',
    *     // GTM Tag's API relative path. Example: accounts/{account_id\}/containers/{container_id\}/workspaces/{workspace_id\}/tags/{tag_id\}
    *     path: 'accounts/my-account/containers/my-container/workspaces/my-workspace/tags/my-tag',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "tag": {}
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
  def revert(params: ParamsResourceAccountsContainersWorkspacesTagsRevert, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def revert(
    params: ParamsResourceAccountsContainersWorkspacesTagsRevert,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def update(): GaxiosPromise[SchemaTag] = js.native
  def update(callback: BodyResponseCallback[SchemaTag]): Unit = js.native
  def update(params: Unit, options: MethodOptions): GaxiosPromise[SchemaTag] = js.native
  def update(params: ParamsResourceAccountsContainersWorkspacesTagsUpdate): GaxiosPromise[SchemaTag] = js.native
  def update(
    params: ParamsResourceAccountsContainersWorkspacesTagsUpdate,
    callback: BodyResponseCallback[SchemaTag]
  ): Unit = js.native
  def update(
    params: ParamsResourceAccountsContainersWorkspacesTagsUpdate,
    options: BodyResponseCallback[Readable | SchemaTag],
    callback: BodyResponseCallback[Readable | SchemaTag]
  ): Unit = js.native
  def update(params: ParamsResourceAccountsContainersWorkspacesTagsUpdate, options: MethodOptions): GaxiosPromise[SchemaTag] = js.native
  def update(
    params: ParamsResourceAccountsContainersWorkspacesTagsUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaTag]
  ): Unit = js.native
  /**
    * Updates a GTM Tag.
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
    *   const res = await tagmanager.accounts.containers.workspaces.tags.update({
    *     // When provided, this fingerprint must match the fingerprint of the tag in storage.
    *     fingerprint: 'placeholder-value',
    *     // GTM Tag's API relative path. Example: accounts/{account_id\}/containers/{container_id\}/workspaces/{workspace_id\}/tags/{tag_id\}
    *     path: 'accounts/my-account/containers/my-container/workspaces/my-workspace/tags/my-tag',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "accountId": "my_accountId",
    *       //   "blockingRuleId": [],
    *       //   "blockingTriggerId": [],
    *       //   "consentSettings": {},
    *       //   "containerId": "my_containerId",
    *       //   "fingerprint": "my_fingerprint",
    *       //   "firingRuleId": [],
    *       //   "firingTriggerId": [],
    *       //   "liveOnly": false,
    *       //   "monitoringMetadata": {},
    *       //   "monitoringMetadataTagNameKey": "my_monitoringMetadataTagNameKey",
    *       //   "name": "my_name",
    *       //   "notes": "my_notes",
    *       //   "parameter": [],
    *       //   "parentFolderId": "my_parentFolderId",
    *       //   "path": "my_path",
    *       //   "paused": false,
    *       //   "priority": {},
    *       //   "scheduleEndMs": "my_scheduleEndMs",
    *       //   "scheduleStartMs": "my_scheduleStartMs",
    *       //   "setupTag": [],
    *       //   "tagFiringOption": "my_tagFiringOption",
    *       //   "tagId": "my_tagId",
    *       //   "tagManagerUrl": "my_tagManagerUrl",
    *       //   "teardownTag": [],
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
    *   //   "blockingRuleId": [],
    *   //   "blockingTriggerId": [],
    *   //   "consentSettings": {},
    *   //   "containerId": "my_containerId",
    *   //   "fingerprint": "my_fingerprint",
    *   //   "firingRuleId": [],
    *   //   "firingTriggerId": [],
    *   //   "liveOnly": false,
    *   //   "monitoringMetadata": {},
    *   //   "monitoringMetadataTagNameKey": "my_monitoringMetadataTagNameKey",
    *   //   "name": "my_name",
    *   //   "notes": "my_notes",
    *   //   "parameter": [],
    *   //   "parentFolderId": "my_parentFolderId",
    *   //   "path": "my_path",
    *   //   "paused": false,
    *   //   "priority": {},
    *   //   "scheduleEndMs": "my_scheduleEndMs",
    *   //   "scheduleStartMs": "my_scheduleStartMs",
    *   //   "setupTag": [],
    *   //   "tagFiringOption": "my_tagFiringOption",
    *   //   "tagId": "my_tagId",
    *   //   "tagManagerUrl": "my_tagManagerUrl",
    *   //   "teardownTag": [],
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
  def update(params: ParamsResourceAccountsContainersWorkspacesTagsUpdate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def update(
    params: ParamsResourceAccountsContainersWorkspacesTagsUpdate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
