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

@JSImport("googleapis/build/src/apis/tagmanager/v1", "tagmanager_v1.Resource$Accounts$Containers$Variables")
@js.native
open class ResourceAccountsContainersVariables protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def create(): GaxiosPromise[SchemaVariable] = js.native
  def create(callback: BodyResponseCallback[SchemaVariable]): Unit = js.native
  def create(params: Unit, options: MethodOptions): GaxiosPromise[SchemaVariable] = js.native
  def create(params: ParamsResourceAccountsContainersVariablesCreate): GaxiosPromise[SchemaVariable] = js.native
  def create(
    params: ParamsResourceAccountsContainersVariablesCreate,
    callback: BodyResponseCallback[SchemaVariable]
  ): Unit = js.native
  def create(
    params: ParamsResourceAccountsContainersVariablesCreate,
    options: BodyResponseCallback[Readable | SchemaVariable],
    callback: BodyResponseCallback[Readable | SchemaVariable]
  ): Unit = js.native
  def create(params: ParamsResourceAccountsContainersVariablesCreate, options: MethodOptions): GaxiosPromise[SchemaVariable] = js.native
  def create(
    params: ParamsResourceAccountsContainersVariablesCreate,
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
    *   const res = await tagmanager.accounts.containers.variables.create({
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
    *       //   "containerId": "my_containerId",
    *       //   "disablingTriggerId": [],
    *       //   "enablingTriggerId": [],
    *       //   "fingerprint": "my_fingerprint",
    *       //   "name": "my_name",
    *       //   "notes": "my_notes",
    *       //   "parameter": [],
    *       //   "parentFolderId": "my_parentFolderId",
    *       //   "scheduleEndMs": "my_scheduleEndMs",
    *       //   "scheduleStartMs": "my_scheduleStartMs",
    *       //   "type": "my_type",
    *       //   "variableId": "my_variableId"
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
    *   //   "name": "my_name",
    *   //   "notes": "my_notes",
    *   //   "parameter": [],
    *   //   "parentFolderId": "my_parentFolderId",
    *   //   "scheduleEndMs": "my_scheduleEndMs",
    *   //   "scheduleStartMs": "my_scheduleStartMs",
    *   //   "type": "my_type",
    *   //   "variableId": "my_variableId"
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
  def create(params: ParamsResourceAccountsContainersVariablesCreate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def create(
    params: ParamsResourceAccountsContainersVariablesCreate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def delete(): GaxiosPromise[Unit] = js.native
  def delete(callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceAccountsContainersVariablesDelete): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceAccountsContainersVariablesDelete, callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(
    params: ParamsResourceAccountsContainersVariablesDelete,
    options: BodyResponseCallback[Readable | Unit],
    callback: BodyResponseCallback[Readable | Unit]
  ): Unit = js.native
  def delete(params: ParamsResourceAccountsContainersVariablesDelete, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(
    params: ParamsResourceAccountsContainersVariablesDelete,
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
    *   const res = await tagmanager.accounts.containers.variables.delete({
    *     // The GTM Account ID.
    *     accountId: 'placeholder-value',
    *     // The GTM Container ID.
    *     containerId: 'placeholder-value',
    *     // The GTM Variable ID.
    *     variableId: 'placeholder-value',
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
  def delete(params: ParamsResourceAccountsContainersVariablesDelete, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def delete(
    params: ParamsResourceAccountsContainersVariablesDelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def get(): GaxiosPromise[SchemaVariable] = js.native
  def get(callback: BodyResponseCallback[SchemaVariable]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaVariable] = js.native
  def get(params: ParamsResourceAccountsContainersVariablesGet): GaxiosPromise[SchemaVariable] = js.native
  def get(
    params: ParamsResourceAccountsContainersVariablesGet,
    callback: BodyResponseCallback[SchemaVariable]
  ): Unit = js.native
  def get(
    params: ParamsResourceAccountsContainersVariablesGet,
    options: BodyResponseCallback[Readable | SchemaVariable],
    callback: BodyResponseCallback[Readable | SchemaVariable]
  ): Unit = js.native
  def get(params: ParamsResourceAccountsContainersVariablesGet, options: MethodOptions): GaxiosPromise[SchemaVariable] = js.native
  def get(
    params: ParamsResourceAccountsContainersVariablesGet,
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
    *   const res = await tagmanager.accounts.containers.variables.get({
    *     // The GTM Account ID.
    *     accountId: 'placeholder-value',
    *     // The GTM Container ID.
    *     containerId: 'placeholder-value',
    *     // The GTM Variable ID.
    *     variableId: 'placeholder-value',
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
    *   //   "name": "my_name",
    *   //   "notes": "my_notes",
    *   //   "parameter": [],
    *   //   "parentFolderId": "my_parentFolderId",
    *   //   "scheduleEndMs": "my_scheduleEndMs",
    *   //   "scheduleStartMs": "my_scheduleStartMs",
    *   //   "type": "my_type",
    *   //   "variableId": "my_variableId"
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
  def get(params: ParamsResourceAccountsContainersVariablesGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceAccountsContainersVariablesGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaListVariablesResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListVariablesResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListVariablesResponse] = js.native
  def list(params: ParamsResourceAccountsContainersVariablesList): GaxiosPromise[SchemaListVariablesResponse] = js.native
  def list(
    params: ParamsResourceAccountsContainersVariablesList,
    callback: BodyResponseCallback[SchemaListVariablesResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceAccountsContainersVariablesList,
    options: BodyResponseCallback[Readable | SchemaListVariablesResponse],
    callback: BodyResponseCallback[Readable | SchemaListVariablesResponse]
  ): Unit = js.native
  def list(params: ParamsResourceAccountsContainersVariablesList, options: MethodOptions): GaxiosPromise[SchemaListVariablesResponse] = js.native
  def list(
    params: ParamsResourceAccountsContainersVariablesList,
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
    *   const res = await tagmanager.accounts.containers.variables.list({
    *     // The GTM Account ID.
    *     accountId: 'placeholder-value',
    *     // The GTM Container ID.
    *     containerId: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "variables": []
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
  def list(params: ParamsResourceAccountsContainersVariablesList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceAccountsContainersVariablesList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def update(): GaxiosPromise[SchemaVariable] = js.native
  def update(callback: BodyResponseCallback[SchemaVariable]): Unit = js.native
  def update(params: Unit, options: MethodOptions): GaxiosPromise[SchemaVariable] = js.native
  def update(params: ParamsResourceAccountsContainersVariablesUpdate): GaxiosPromise[SchemaVariable] = js.native
  def update(
    params: ParamsResourceAccountsContainersVariablesUpdate,
    callback: BodyResponseCallback[SchemaVariable]
  ): Unit = js.native
  def update(
    params: ParamsResourceAccountsContainersVariablesUpdate,
    options: BodyResponseCallback[Readable | SchemaVariable],
    callback: BodyResponseCallback[Readable | SchemaVariable]
  ): Unit = js.native
  def update(params: ParamsResourceAccountsContainersVariablesUpdate, options: MethodOptions): GaxiosPromise[SchemaVariable] = js.native
  def update(
    params: ParamsResourceAccountsContainersVariablesUpdate,
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
    *   const res = await tagmanager.accounts.containers.variables.update({
    *     // The GTM Account ID.
    *     accountId: 'placeholder-value',
    *     // The GTM Container ID.
    *     containerId: 'placeholder-value',
    *     // When provided, this fingerprint must match the fingerprint of the variable in storage.
    *     fingerprint: 'placeholder-value',
    *     // The GTM Variable ID.
    *     variableId: 'placeholder-value',
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
    *       //   "name": "my_name",
    *       //   "notes": "my_notes",
    *       //   "parameter": [],
    *       //   "parentFolderId": "my_parentFolderId",
    *       //   "scheduleEndMs": "my_scheduleEndMs",
    *       //   "scheduleStartMs": "my_scheduleStartMs",
    *       //   "type": "my_type",
    *       //   "variableId": "my_variableId"
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
    *   //   "name": "my_name",
    *   //   "notes": "my_notes",
    *   //   "parameter": [],
    *   //   "parentFolderId": "my_parentFolderId",
    *   //   "scheduleEndMs": "my_scheduleEndMs",
    *   //   "scheduleStartMs": "my_scheduleStartMs",
    *   //   "type": "my_type",
    *   //   "variableId": "my_variableId"
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
  def update(params: ParamsResourceAccountsContainersVariablesUpdate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def update(
    params: ParamsResourceAccountsContainersVariablesUpdate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
