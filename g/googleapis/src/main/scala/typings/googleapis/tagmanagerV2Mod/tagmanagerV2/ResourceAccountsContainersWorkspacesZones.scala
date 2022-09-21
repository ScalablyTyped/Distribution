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

@JSImport("googleapis/build/src/apis/tagmanager/v2", "tagmanager_v2.Resource$Accounts$Containers$Workspaces$Zones")
@js.native
open class ResourceAccountsContainersWorkspacesZones protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def create(): GaxiosPromise[SchemaZone] = js.native
  def create(callback: BodyResponseCallback[SchemaZone]): Unit = js.native
  def create(params: Unit, options: MethodOptions): GaxiosPromise[SchemaZone] = js.native
  def create(params: ParamsResourceAccountsContainersWorkspacesZonesCreate): GaxiosPromise[SchemaZone] = js.native
  def create(
    params: ParamsResourceAccountsContainersWorkspacesZonesCreate,
    callback: BodyResponseCallback[SchemaZone]
  ): Unit = js.native
  def create(
    params: ParamsResourceAccountsContainersWorkspacesZonesCreate,
    options: BodyResponseCallback[Readable | SchemaZone],
    callback: BodyResponseCallback[Readable | SchemaZone]
  ): Unit = js.native
  def create(params: ParamsResourceAccountsContainersWorkspacesZonesCreate, options: MethodOptions): GaxiosPromise[SchemaZone] = js.native
  def create(
    params: ParamsResourceAccountsContainersWorkspacesZonesCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaZone]
  ): Unit = js.native
  /**
    * Creates a GTM Zone.
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
    *   const res = await tagmanager.accounts.containers.workspaces.zones.create({
    *     // GTM Workspace's API relative path. Example: accounts/{account_id\}/containers/{container_id\}/workspaces/{workspace_id\}
    *     parent:
    *       'accounts/my-account/containers/my-container/workspaces/my-workspace',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "accountId": "my_accountId",
    *       //   "boundary": {},
    *       //   "childContainer": [],
    *       //   "containerId": "my_containerId",
    *       //   "fingerprint": "my_fingerprint",
    *       //   "name": "my_name",
    *       //   "notes": "my_notes",
    *       //   "path": "my_path",
    *       //   "tagManagerUrl": "my_tagManagerUrl",
    *       //   "typeRestriction": {},
    *       //   "workspaceId": "my_workspaceId",
    *       //   "zoneId": "my_zoneId"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "accountId": "my_accountId",
    *   //   "boundary": {},
    *   //   "childContainer": [],
    *   //   "containerId": "my_containerId",
    *   //   "fingerprint": "my_fingerprint",
    *   //   "name": "my_name",
    *   //   "notes": "my_notes",
    *   //   "path": "my_path",
    *   //   "tagManagerUrl": "my_tagManagerUrl",
    *   //   "typeRestriction": {},
    *   //   "workspaceId": "my_workspaceId",
    *   //   "zoneId": "my_zoneId"
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
  def create(params: ParamsResourceAccountsContainersWorkspacesZonesCreate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def create(
    params: ParamsResourceAccountsContainersWorkspacesZonesCreate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def delete(): GaxiosPromise[Unit] = js.native
  def delete(callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceAccountsContainersWorkspacesZonesDelete): GaxiosPromise[Unit] = js.native
  def delete(
    params: ParamsResourceAccountsContainersWorkspacesZonesDelete,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def delete(
    params: ParamsResourceAccountsContainersWorkspacesZonesDelete,
    options: BodyResponseCallback[Readable | Unit],
    callback: BodyResponseCallback[Readable | Unit]
  ): Unit = js.native
  def delete(params: ParamsResourceAccountsContainersWorkspacesZonesDelete, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(
    params: ParamsResourceAccountsContainersWorkspacesZonesDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  /**
    * Deletes a GTM Zone.
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
    *   const res = await tagmanager.accounts.containers.workspaces.zones.delete({
    *     // GTM Zone's API relative path. Example: accounts/{account_id\}/containers/{container_id\}/workspaces/{workspace_id\}/zones/{zone_id\}
    *     path: 'accounts/my-account/containers/my-container/workspaces/my-workspace/zones/my-zone',
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
  def delete(params: ParamsResourceAccountsContainersWorkspacesZonesDelete, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def delete(
    params: ParamsResourceAccountsContainersWorkspacesZonesDelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def get(): GaxiosPromise[SchemaZone] = js.native
  def get(callback: BodyResponseCallback[SchemaZone]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaZone] = js.native
  def get(params: ParamsResourceAccountsContainersWorkspacesZonesGet): GaxiosPromise[SchemaZone] = js.native
  def get(
    params: ParamsResourceAccountsContainersWorkspacesZonesGet,
    callback: BodyResponseCallback[SchemaZone]
  ): Unit = js.native
  def get(
    params: ParamsResourceAccountsContainersWorkspacesZonesGet,
    options: BodyResponseCallback[Readable | SchemaZone],
    callback: BodyResponseCallback[Readable | SchemaZone]
  ): Unit = js.native
  def get(params: ParamsResourceAccountsContainersWorkspacesZonesGet, options: MethodOptions): GaxiosPromise[SchemaZone] = js.native
  def get(
    params: ParamsResourceAccountsContainersWorkspacesZonesGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaZone]
  ): Unit = js.native
  /**
    * Gets a GTM Zone.
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
    *   const res = await tagmanager.accounts.containers.workspaces.zones.get({
    *     // GTM Zone's API relative path. Example: accounts/{account_id\}/containers/{container_id\}/workspaces/{workspace_id\}/zones/{zone_id\}
    *     path: 'accounts/my-account/containers/my-container/workspaces/my-workspace/zones/my-zone',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "accountId": "my_accountId",
    *   //   "boundary": {},
    *   //   "childContainer": [],
    *   //   "containerId": "my_containerId",
    *   //   "fingerprint": "my_fingerprint",
    *   //   "name": "my_name",
    *   //   "notes": "my_notes",
    *   //   "path": "my_path",
    *   //   "tagManagerUrl": "my_tagManagerUrl",
    *   //   "typeRestriction": {},
    *   //   "workspaceId": "my_workspaceId",
    *   //   "zoneId": "my_zoneId"
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
  def get(params: ParamsResourceAccountsContainersWorkspacesZonesGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceAccountsContainersWorkspacesZonesGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaListZonesResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListZonesResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListZonesResponse] = js.native
  def list(params: ParamsResourceAccountsContainersWorkspacesZonesList): GaxiosPromise[SchemaListZonesResponse] = js.native
  def list(
    params: ParamsResourceAccountsContainersWorkspacesZonesList,
    callback: BodyResponseCallback[SchemaListZonesResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceAccountsContainersWorkspacesZonesList,
    options: BodyResponseCallback[Readable | SchemaListZonesResponse],
    callback: BodyResponseCallback[Readable | SchemaListZonesResponse]
  ): Unit = js.native
  def list(params: ParamsResourceAccountsContainersWorkspacesZonesList, options: MethodOptions): GaxiosPromise[SchemaListZonesResponse] = js.native
  def list(
    params: ParamsResourceAccountsContainersWorkspacesZonesList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListZonesResponse]
  ): Unit = js.native
  /**
    * Lists all GTM Zones of a GTM container workspace.
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
    *   const res = await tagmanager.accounts.containers.workspaces.zones.list({
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
    *   //   "zone": []
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
  def list(params: ParamsResourceAccountsContainersWorkspacesZonesList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceAccountsContainersWorkspacesZonesList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def revert(): GaxiosPromise[SchemaRevertZoneResponse] = js.native
  def revert(callback: BodyResponseCallback[SchemaRevertZoneResponse]): Unit = js.native
  def revert(params: Unit, options: MethodOptions): GaxiosPromise[SchemaRevertZoneResponse] = js.native
  def revert(params: ParamsResourceAccountsContainersWorkspacesZonesRevert): GaxiosPromise[SchemaRevertZoneResponse] = js.native
  def revert(
    params: ParamsResourceAccountsContainersWorkspacesZonesRevert,
    callback: BodyResponseCallback[SchemaRevertZoneResponse]
  ): Unit = js.native
  def revert(
    params: ParamsResourceAccountsContainersWorkspacesZonesRevert,
    options: BodyResponseCallback[Readable | SchemaRevertZoneResponse],
    callback: BodyResponseCallback[Readable | SchemaRevertZoneResponse]
  ): Unit = js.native
  def revert(params: ParamsResourceAccountsContainersWorkspacesZonesRevert, options: MethodOptions): GaxiosPromise[SchemaRevertZoneResponse] = js.native
  def revert(
    params: ParamsResourceAccountsContainersWorkspacesZonesRevert,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaRevertZoneResponse]
  ): Unit = js.native
  /**
    * Reverts changes to a GTM Zone in a GTM Workspace.
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
    *   const res = await tagmanager.accounts.containers.workspaces.zones.revert({
    *     // When provided, this fingerprint must match the fingerprint of the zone in storage.
    *     fingerprint: 'placeholder-value',
    *     // GTM Zone's API relative path. Example: accounts/{account_id\}/containers/{container_id\}/workspaces/{workspace_id\}/zones/{zone_id\}
    *     path: 'accounts/my-account/containers/my-container/workspaces/my-workspace/zones/my-zone',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "zone": {}
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
  def revert(params: ParamsResourceAccountsContainersWorkspacesZonesRevert, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def revert(
    params: ParamsResourceAccountsContainersWorkspacesZonesRevert,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def update(): GaxiosPromise[SchemaZone] = js.native
  def update(callback: BodyResponseCallback[SchemaZone]): Unit = js.native
  def update(params: Unit, options: MethodOptions): GaxiosPromise[SchemaZone] = js.native
  def update(params: ParamsResourceAccountsContainersWorkspacesZonesUpdate): GaxiosPromise[SchemaZone] = js.native
  def update(
    params: ParamsResourceAccountsContainersWorkspacesZonesUpdate,
    callback: BodyResponseCallback[SchemaZone]
  ): Unit = js.native
  def update(
    params: ParamsResourceAccountsContainersWorkspacesZonesUpdate,
    options: BodyResponseCallback[Readable | SchemaZone],
    callback: BodyResponseCallback[Readable | SchemaZone]
  ): Unit = js.native
  def update(params: ParamsResourceAccountsContainersWorkspacesZonesUpdate, options: MethodOptions): GaxiosPromise[SchemaZone] = js.native
  def update(
    params: ParamsResourceAccountsContainersWorkspacesZonesUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaZone]
  ): Unit = js.native
  /**
    * Updates a GTM Zone.
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
    *   const res = await tagmanager.accounts.containers.workspaces.zones.update({
    *     // When provided, this fingerprint must match the fingerprint of the zone in storage.
    *     fingerprint: 'placeholder-value',
    *     // GTM Zone's API relative path. Example: accounts/{account_id\}/containers/{container_id\}/workspaces/{workspace_id\}/zones/{zone_id\}
    *     path: 'accounts/my-account/containers/my-container/workspaces/my-workspace/zones/my-zone',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "accountId": "my_accountId",
    *       //   "boundary": {},
    *       //   "childContainer": [],
    *       //   "containerId": "my_containerId",
    *       //   "fingerprint": "my_fingerprint",
    *       //   "name": "my_name",
    *       //   "notes": "my_notes",
    *       //   "path": "my_path",
    *       //   "tagManagerUrl": "my_tagManagerUrl",
    *       //   "typeRestriction": {},
    *       //   "workspaceId": "my_workspaceId",
    *       //   "zoneId": "my_zoneId"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "accountId": "my_accountId",
    *   //   "boundary": {},
    *   //   "childContainer": [],
    *   //   "containerId": "my_containerId",
    *   //   "fingerprint": "my_fingerprint",
    *   //   "name": "my_name",
    *   //   "notes": "my_notes",
    *   //   "path": "my_path",
    *   //   "tagManagerUrl": "my_tagManagerUrl",
    *   //   "typeRestriction": {},
    *   //   "workspaceId": "my_workspaceId",
    *   //   "zoneId": "my_zoneId"
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
  def update(params: ParamsResourceAccountsContainersWorkspacesZonesUpdate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def update(
    params: ParamsResourceAccountsContainersWorkspacesZonesUpdate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
