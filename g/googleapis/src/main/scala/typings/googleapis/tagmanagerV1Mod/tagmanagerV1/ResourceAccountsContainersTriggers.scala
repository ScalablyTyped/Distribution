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

@JSImport("googleapis/build/src/apis/tagmanager/v1", "tagmanager_v1.Resource$Accounts$Containers$Triggers")
@js.native
open class ResourceAccountsContainersTriggers protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def create(): GaxiosPromise[SchemaTrigger] = js.native
  def create(callback: BodyResponseCallback[SchemaTrigger]): Unit = js.native
  def create(params: Unit, options: MethodOptions): GaxiosPromise[SchemaTrigger] = js.native
  def create(params: ParamsResourceAccountsContainersTriggersCreate): GaxiosPromise[SchemaTrigger] = js.native
  def create(
    params: ParamsResourceAccountsContainersTriggersCreate,
    callback: BodyResponseCallback[SchemaTrigger]
  ): Unit = js.native
  def create(
    params: ParamsResourceAccountsContainersTriggersCreate,
    options: BodyResponseCallback[Readable | SchemaTrigger],
    callback: BodyResponseCallback[Readable | SchemaTrigger]
  ): Unit = js.native
  def create(params: ParamsResourceAccountsContainersTriggersCreate, options: MethodOptions): GaxiosPromise[SchemaTrigger] = js.native
  def create(
    params: ParamsResourceAccountsContainersTriggersCreate,
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
    *   const res = await tagmanager.accounts.containers.triggers.create({
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
    *       //   "parameter": [],
    *       //   "parentFolderId": "my_parentFolderId",
    *       //   "selector": {},
    *       //   "totalTimeMinMilliseconds": {},
    *       //   "triggerId": "my_triggerId",
    *       //   "type": "my_type",
    *       //   "uniqueTriggerId": {},
    *       //   "verticalScrollPercentageList": {},
    *       //   "visibilitySelector": {},
    *       //   "visiblePercentageMax": {},
    *       //   "visiblePercentageMin": {},
    *       //   "waitForTags": {},
    *       //   "waitForTagsTimeout": {}
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
    *   //   "parameter": [],
    *   //   "parentFolderId": "my_parentFolderId",
    *   //   "selector": {},
    *   //   "totalTimeMinMilliseconds": {},
    *   //   "triggerId": "my_triggerId",
    *   //   "type": "my_type",
    *   //   "uniqueTriggerId": {},
    *   //   "verticalScrollPercentageList": {},
    *   //   "visibilitySelector": {},
    *   //   "visiblePercentageMax": {},
    *   //   "visiblePercentageMin": {},
    *   //   "waitForTags": {},
    *   //   "waitForTagsTimeout": {}
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
  def create(params: ParamsResourceAccountsContainersTriggersCreate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def create(
    params: ParamsResourceAccountsContainersTriggersCreate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def delete(): GaxiosPromise[Unit] = js.native
  def delete(callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceAccountsContainersTriggersDelete): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceAccountsContainersTriggersDelete, callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(
    params: ParamsResourceAccountsContainersTriggersDelete,
    options: BodyResponseCallback[Readable | Unit],
    callback: BodyResponseCallback[Readable | Unit]
  ): Unit = js.native
  def delete(params: ParamsResourceAccountsContainersTriggersDelete, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(
    params: ParamsResourceAccountsContainersTriggersDelete,
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
    *   const res = await tagmanager.accounts.containers.triggers.delete({
    *     // The GTM Account ID.
    *     accountId: 'placeholder-value',
    *     // The GTM Container ID.
    *     containerId: 'placeholder-value',
    *     // The GTM Trigger ID.
    *     triggerId: 'placeholder-value',
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
  def delete(params: ParamsResourceAccountsContainersTriggersDelete, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def delete(
    params: ParamsResourceAccountsContainersTriggersDelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def get(): GaxiosPromise[SchemaTrigger] = js.native
  def get(callback: BodyResponseCallback[SchemaTrigger]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaTrigger] = js.native
  def get(params: ParamsResourceAccountsContainersTriggersGet): GaxiosPromise[SchemaTrigger] = js.native
  def get(params: ParamsResourceAccountsContainersTriggersGet, callback: BodyResponseCallback[SchemaTrigger]): Unit = js.native
  def get(
    params: ParamsResourceAccountsContainersTriggersGet,
    options: BodyResponseCallback[Readable | SchemaTrigger],
    callback: BodyResponseCallback[Readable | SchemaTrigger]
  ): Unit = js.native
  def get(params: ParamsResourceAccountsContainersTriggersGet, options: MethodOptions): GaxiosPromise[SchemaTrigger] = js.native
  def get(
    params: ParamsResourceAccountsContainersTriggersGet,
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
    *   const res = await tagmanager.accounts.containers.triggers.get({
    *     // The GTM Account ID.
    *     accountId: 'placeholder-value',
    *     // The GTM Container ID.
    *     containerId: 'placeholder-value',
    *     // The GTM Trigger ID.
    *     triggerId: 'placeholder-value',
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
    *   //   "parameter": [],
    *   //   "parentFolderId": "my_parentFolderId",
    *   //   "selector": {},
    *   //   "totalTimeMinMilliseconds": {},
    *   //   "triggerId": "my_triggerId",
    *   //   "type": "my_type",
    *   //   "uniqueTriggerId": {},
    *   //   "verticalScrollPercentageList": {},
    *   //   "visibilitySelector": {},
    *   //   "visiblePercentageMax": {},
    *   //   "visiblePercentageMin": {},
    *   //   "waitForTags": {},
    *   //   "waitForTagsTimeout": {}
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
  def get(params: ParamsResourceAccountsContainersTriggersGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceAccountsContainersTriggersGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaListTriggersResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListTriggersResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListTriggersResponse] = js.native
  def list(params: ParamsResourceAccountsContainersTriggersList): GaxiosPromise[SchemaListTriggersResponse] = js.native
  def list(
    params: ParamsResourceAccountsContainersTriggersList,
    callback: BodyResponseCallback[SchemaListTriggersResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceAccountsContainersTriggersList,
    options: BodyResponseCallback[Readable | SchemaListTriggersResponse],
    callback: BodyResponseCallback[Readable | SchemaListTriggersResponse]
  ): Unit = js.native
  def list(params: ParamsResourceAccountsContainersTriggersList, options: MethodOptions): GaxiosPromise[SchemaListTriggersResponse] = js.native
  def list(
    params: ParamsResourceAccountsContainersTriggersList,
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
    *   const res = await tagmanager.accounts.containers.triggers.list({
    *     // The GTM Account ID.
    *     accountId: 'placeholder-value',
    *     // The GTM Container ID.
    *     containerId: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "triggers": []
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
  def list(params: ParamsResourceAccountsContainersTriggersList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceAccountsContainersTriggersList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def update(): GaxiosPromise[SchemaTrigger] = js.native
  def update(callback: BodyResponseCallback[SchemaTrigger]): Unit = js.native
  def update(params: Unit, options: MethodOptions): GaxiosPromise[SchemaTrigger] = js.native
  def update(params: ParamsResourceAccountsContainersTriggersUpdate): GaxiosPromise[SchemaTrigger] = js.native
  def update(
    params: ParamsResourceAccountsContainersTriggersUpdate,
    callback: BodyResponseCallback[SchemaTrigger]
  ): Unit = js.native
  def update(
    params: ParamsResourceAccountsContainersTriggersUpdate,
    options: BodyResponseCallback[Readable | SchemaTrigger],
    callback: BodyResponseCallback[Readable | SchemaTrigger]
  ): Unit = js.native
  def update(params: ParamsResourceAccountsContainersTriggersUpdate, options: MethodOptions): GaxiosPromise[SchemaTrigger] = js.native
  def update(
    params: ParamsResourceAccountsContainersTriggersUpdate,
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
    *   const res = await tagmanager.accounts.containers.triggers.update({
    *     // The GTM Account ID.
    *     accountId: 'placeholder-value',
    *     // The GTM Container ID.
    *     containerId: 'placeholder-value',
    *     // When provided, this fingerprint must match the fingerprint of the trigger in storage.
    *     fingerprint: 'placeholder-value',
    *     // The GTM Trigger ID.
    *     triggerId: 'placeholder-value',
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
    *       //   "parameter": [],
    *       //   "parentFolderId": "my_parentFolderId",
    *       //   "selector": {},
    *       //   "totalTimeMinMilliseconds": {},
    *       //   "triggerId": "my_triggerId",
    *       //   "type": "my_type",
    *       //   "uniqueTriggerId": {},
    *       //   "verticalScrollPercentageList": {},
    *       //   "visibilitySelector": {},
    *       //   "visiblePercentageMax": {},
    *       //   "visiblePercentageMin": {},
    *       //   "waitForTags": {},
    *       //   "waitForTagsTimeout": {}
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
    *   //   "parameter": [],
    *   //   "parentFolderId": "my_parentFolderId",
    *   //   "selector": {},
    *   //   "totalTimeMinMilliseconds": {},
    *   //   "triggerId": "my_triggerId",
    *   //   "type": "my_type",
    *   //   "uniqueTriggerId": {},
    *   //   "verticalScrollPercentageList": {},
    *   //   "visibilitySelector": {},
    *   //   "visiblePercentageMax": {},
    *   //   "visiblePercentageMin": {},
    *   //   "waitForTags": {},
    *   //   "waitForTagsTimeout": {}
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
  def update(params: ParamsResourceAccountsContainersTriggersUpdate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def update(
    params: ParamsResourceAccountsContainersTriggersUpdate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
