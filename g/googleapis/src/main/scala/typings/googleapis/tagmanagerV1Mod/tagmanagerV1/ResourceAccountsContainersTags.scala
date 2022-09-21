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

@JSImport("googleapis/build/src/apis/tagmanager/v1", "tagmanager_v1.Resource$Accounts$Containers$Tags")
@js.native
open class ResourceAccountsContainersTags protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def create(): GaxiosPromise[SchemaTag] = js.native
  def create(callback: BodyResponseCallback[SchemaTag]): Unit = js.native
  def create(params: Unit, options: MethodOptions): GaxiosPromise[SchemaTag] = js.native
  def create(params: ParamsResourceAccountsContainersTagsCreate): GaxiosPromise[SchemaTag] = js.native
  def create(params: ParamsResourceAccountsContainersTagsCreate, callback: BodyResponseCallback[SchemaTag]): Unit = js.native
  def create(
    params: ParamsResourceAccountsContainersTagsCreate,
    options: BodyResponseCallback[Readable | SchemaTag],
    callback: BodyResponseCallback[Readable | SchemaTag]
  ): Unit = js.native
  def create(params: ParamsResourceAccountsContainersTagsCreate, options: MethodOptions): GaxiosPromise[SchemaTag] = js.native
  def create(
    params: ParamsResourceAccountsContainersTagsCreate,
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
    * const tagmanager = google.tagmanager('v1');
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
    *   const res = await tagmanager.accounts.containers.tags.create({
    *     // The GTM Account ID.
    *     accountId: 'placeholder-value',
    *     // The GTM Container ID.
    *     containerId: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "accountId": "my_accountId",
    *       //   "blockingRuleId": [],
    *       //   "blockingTriggerId": [],
    *       //   "containerId": "my_containerId",
    *       //   "fingerprint": "my_fingerprint",
    *       //   "firingRuleId": [],
    *       //   "firingTriggerId": [],
    *       //   "liveOnly": false,
    *       //   "name": "my_name",
    *       //   "notes": "my_notes",
    *       //   "parameter": [],
    *       //   "parentFolderId": "my_parentFolderId",
    *       //   "paused": false,
    *       //   "priority": {},
    *       //   "scheduleEndMs": "my_scheduleEndMs",
    *       //   "scheduleStartMs": "my_scheduleStartMs",
    *       //   "setupTag": [],
    *       //   "tagFiringOption": "my_tagFiringOption",
    *       //   "tagId": "my_tagId",
    *       //   "teardownTag": [],
    *       //   "type": "my_type"
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
    *   //   "containerId": "my_containerId",
    *   //   "fingerprint": "my_fingerprint",
    *   //   "firingRuleId": [],
    *   //   "firingTriggerId": [],
    *   //   "liveOnly": false,
    *   //   "name": "my_name",
    *   //   "notes": "my_notes",
    *   //   "parameter": [],
    *   //   "parentFolderId": "my_parentFolderId",
    *   //   "paused": false,
    *   //   "priority": {},
    *   //   "scheduleEndMs": "my_scheduleEndMs",
    *   //   "scheduleStartMs": "my_scheduleStartMs",
    *   //   "setupTag": [],
    *   //   "tagFiringOption": "my_tagFiringOption",
    *   //   "tagId": "my_tagId",
    *   //   "teardownTag": [],
    *   //   "type": "my_type"
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
  def create(params: ParamsResourceAccountsContainersTagsCreate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def create(
    params: ParamsResourceAccountsContainersTagsCreate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def delete(): GaxiosPromise[Unit] = js.native
  def delete(callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceAccountsContainersTagsDelete): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceAccountsContainersTagsDelete, callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(
    params: ParamsResourceAccountsContainersTagsDelete,
    options: BodyResponseCallback[Readable | Unit],
    callback: BodyResponseCallback[Readable | Unit]
  ): Unit = js.native
  def delete(params: ParamsResourceAccountsContainersTagsDelete, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(
    params: ParamsResourceAccountsContainersTagsDelete,
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
    * const tagmanager = google.tagmanager('v1');
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
    *   const res = await tagmanager.accounts.containers.tags.delete({
    *     // The GTM Account ID.
    *     accountId: 'placeholder-value',
    *     // The GTM Container ID.
    *     containerId: 'placeholder-value',
    *     // The GTM Tag ID.
    *     tagId: 'placeholder-value',
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
  def delete(params: ParamsResourceAccountsContainersTagsDelete, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def delete(
    params: ParamsResourceAccountsContainersTagsDelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def get(): GaxiosPromise[SchemaTag] = js.native
  def get(callback: BodyResponseCallback[SchemaTag]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaTag] = js.native
  def get(params: ParamsResourceAccountsContainersTagsGet): GaxiosPromise[SchemaTag] = js.native
  def get(params: ParamsResourceAccountsContainersTagsGet, callback: BodyResponseCallback[SchemaTag]): Unit = js.native
  def get(
    params: ParamsResourceAccountsContainersTagsGet,
    options: BodyResponseCallback[Readable | SchemaTag],
    callback: BodyResponseCallback[Readable | SchemaTag]
  ): Unit = js.native
  def get(params: ParamsResourceAccountsContainersTagsGet, options: MethodOptions): GaxiosPromise[SchemaTag] = js.native
  def get(
    params: ParamsResourceAccountsContainersTagsGet,
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
    *   const res = await tagmanager.accounts.containers.tags.get({
    *     // The GTM Account ID.
    *     accountId: 'placeholder-value',
    *     // The GTM Container ID.
    *     containerId: 'placeholder-value',
    *     // The GTM Tag ID.
    *     tagId: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "accountId": "my_accountId",
    *   //   "blockingRuleId": [],
    *   //   "blockingTriggerId": [],
    *   //   "containerId": "my_containerId",
    *   //   "fingerprint": "my_fingerprint",
    *   //   "firingRuleId": [],
    *   //   "firingTriggerId": [],
    *   //   "liveOnly": false,
    *   //   "name": "my_name",
    *   //   "notes": "my_notes",
    *   //   "parameter": [],
    *   //   "parentFolderId": "my_parentFolderId",
    *   //   "paused": false,
    *   //   "priority": {},
    *   //   "scheduleEndMs": "my_scheduleEndMs",
    *   //   "scheduleStartMs": "my_scheduleStartMs",
    *   //   "setupTag": [],
    *   //   "tagFiringOption": "my_tagFiringOption",
    *   //   "tagId": "my_tagId",
    *   //   "teardownTag": [],
    *   //   "type": "my_type"
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
  def get(params: ParamsResourceAccountsContainersTagsGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceAccountsContainersTagsGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaListTagsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListTagsResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListTagsResponse] = js.native
  def list(params: ParamsResourceAccountsContainersTagsList): GaxiosPromise[SchemaListTagsResponse] = js.native
  def list(
    params: ParamsResourceAccountsContainersTagsList,
    callback: BodyResponseCallback[SchemaListTagsResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceAccountsContainersTagsList,
    options: BodyResponseCallback[Readable | SchemaListTagsResponse],
    callback: BodyResponseCallback[Readable | SchemaListTagsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceAccountsContainersTagsList, options: MethodOptions): GaxiosPromise[SchemaListTagsResponse] = js.native
  def list(
    params: ParamsResourceAccountsContainersTagsList,
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
    *   const res = await tagmanager.accounts.containers.tags.list({
    *     // The GTM Account ID.
    *     accountId: 'placeholder-value',
    *     // The GTM Container ID.
    *     containerId: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "tags": []
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
  def list(params: ParamsResourceAccountsContainersTagsList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceAccountsContainersTagsList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def update(): GaxiosPromise[SchemaTag] = js.native
  def update(callback: BodyResponseCallback[SchemaTag]): Unit = js.native
  def update(params: Unit, options: MethodOptions): GaxiosPromise[SchemaTag] = js.native
  def update(params: ParamsResourceAccountsContainersTagsUpdate): GaxiosPromise[SchemaTag] = js.native
  def update(params: ParamsResourceAccountsContainersTagsUpdate, callback: BodyResponseCallback[SchemaTag]): Unit = js.native
  def update(
    params: ParamsResourceAccountsContainersTagsUpdate,
    options: BodyResponseCallback[Readable | SchemaTag],
    callback: BodyResponseCallback[Readable | SchemaTag]
  ): Unit = js.native
  def update(params: ParamsResourceAccountsContainersTagsUpdate, options: MethodOptions): GaxiosPromise[SchemaTag] = js.native
  def update(
    params: ParamsResourceAccountsContainersTagsUpdate,
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
    * const tagmanager = google.tagmanager('v1');
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
    *   const res = await tagmanager.accounts.containers.tags.update({
    *     // The GTM Account ID.
    *     accountId: 'placeholder-value',
    *     // The GTM Container ID.
    *     containerId: 'placeholder-value',
    *     // When provided, this fingerprint must match the fingerprint of the tag in storage.
    *     fingerprint: 'placeholder-value',
    *     // The GTM Tag ID.
    *     tagId: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "accountId": "my_accountId",
    *       //   "blockingRuleId": [],
    *       //   "blockingTriggerId": [],
    *       //   "containerId": "my_containerId",
    *       //   "fingerprint": "my_fingerprint",
    *       //   "firingRuleId": [],
    *       //   "firingTriggerId": [],
    *       //   "liveOnly": false,
    *       //   "name": "my_name",
    *       //   "notes": "my_notes",
    *       //   "parameter": [],
    *       //   "parentFolderId": "my_parentFolderId",
    *       //   "paused": false,
    *       //   "priority": {},
    *       //   "scheduleEndMs": "my_scheduleEndMs",
    *       //   "scheduleStartMs": "my_scheduleStartMs",
    *       //   "setupTag": [],
    *       //   "tagFiringOption": "my_tagFiringOption",
    *       //   "tagId": "my_tagId",
    *       //   "teardownTag": [],
    *       //   "type": "my_type"
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
    *   //   "containerId": "my_containerId",
    *   //   "fingerprint": "my_fingerprint",
    *   //   "firingRuleId": [],
    *   //   "firingTriggerId": [],
    *   //   "liveOnly": false,
    *   //   "name": "my_name",
    *   //   "notes": "my_notes",
    *   //   "parameter": [],
    *   //   "parentFolderId": "my_parentFolderId",
    *   //   "paused": false,
    *   //   "priority": {},
    *   //   "scheduleEndMs": "my_scheduleEndMs",
    *   //   "scheduleStartMs": "my_scheduleStartMs",
    *   //   "setupTag": [],
    *   //   "tagFiringOption": "my_tagFiringOption",
    *   //   "tagId": "my_tagId",
    *   //   "teardownTag": [],
    *   //   "type": "my_type"
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
  def update(params: ParamsResourceAccountsContainersTagsUpdate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def update(
    params: ParamsResourceAccountsContainersTagsUpdate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
