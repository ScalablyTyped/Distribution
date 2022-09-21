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

@JSImport("googleapis/build/src/apis/tagmanager/v2", "tagmanager_v2.Resource$Accounts$Containers")
@js.native
open class ResourceAccountsContainers protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def create(): GaxiosPromise[SchemaContainer] = js.native
  def create(callback: BodyResponseCallback[SchemaContainer]): Unit = js.native
  def create(params: Unit, options: MethodOptions): GaxiosPromise[SchemaContainer] = js.native
  def create(params: ParamsResourceAccountsContainersCreate): GaxiosPromise[SchemaContainer] = js.native
  def create(params: ParamsResourceAccountsContainersCreate, callback: BodyResponseCallback[SchemaContainer]): Unit = js.native
  def create(
    params: ParamsResourceAccountsContainersCreate,
    options: BodyResponseCallback[Readable | SchemaContainer],
    callback: BodyResponseCallback[Readable | SchemaContainer]
  ): Unit = js.native
  def create(params: ParamsResourceAccountsContainersCreate, options: MethodOptions): GaxiosPromise[SchemaContainer] = js.native
  def create(
    params: ParamsResourceAccountsContainersCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaContainer]
  ): Unit = js.native
  /**
    * Creates a Container.
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
    *   const res = await tagmanager.accounts.containers.create({
    *     // GTM Account's API relative path. Example: accounts/{account_id\}.
    *     parent: 'accounts/my-account',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "accountId": "my_accountId",
    *       //   "containerId": "my_containerId",
    *       //   "domainName": [],
    *       //   "fingerprint": "my_fingerprint",
    *       //   "name": "my_name",
    *       //   "notes": "my_notes",
    *       //   "path": "my_path",
    *       //   "publicId": "my_publicId",
    *       //   "tagManagerUrl": "my_tagManagerUrl",
    *       //   "usageContext": []
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "accountId": "my_accountId",
    *   //   "containerId": "my_containerId",
    *   //   "domainName": [],
    *   //   "fingerprint": "my_fingerprint",
    *   //   "name": "my_name",
    *   //   "notes": "my_notes",
    *   //   "path": "my_path",
    *   //   "publicId": "my_publicId",
    *   //   "tagManagerUrl": "my_tagManagerUrl",
    *   //   "usageContext": []
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
  def create(params: ParamsResourceAccountsContainersCreate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def create(
    params: ParamsResourceAccountsContainersCreate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def delete(): GaxiosPromise[Unit] = js.native
  def delete(callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceAccountsContainersDelete): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceAccountsContainersDelete, callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(
    params: ParamsResourceAccountsContainersDelete,
    options: BodyResponseCallback[Readable | Unit],
    callback: BodyResponseCallback[Readable | Unit]
  ): Unit = js.native
  def delete(params: ParamsResourceAccountsContainersDelete, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(
    params: ParamsResourceAccountsContainersDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  /**
    * Deletes a Container.
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
    *   const res = await tagmanager.accounts.containers.delete({
    *     // GTM Container's API relative path. Example: accounts/{account_id\}/containers/{container_id\}
    *     path: 'accounts/my-account/containers/my-container',
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
  def delete(params: ParamsResourceAccountsContainersDelete, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def delete(
    params: ParamsResourceAccountsContainersDelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  var environments: ResourceAccountsContainersEnvironments = js.native
  
  def get(): GaxiosPromise[SchemaContainer] = js.native
  def get(callback: BodyResponseCallback[SchemaContainer]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaContainer] = js.native
  def get(params: ParamsResourceAccountsContainersGet): GaxiosPromise[SchemaContainer] = js.native
  def get(params: ParamsResourceAccountsContainersGet, callback: BodyResponseCallback[SchemaContainer]): Unit = js.native
  def get(
    params: ParamsResourceAccountsContainersGet,
    options: BodyResponseCallback[Readable | SchemaContainer],
    callback: BodyResponseCallback[Readable | SchemaContainer]
  ): Unit = js.native
  def get(params: ParamsResourceAccountsContainersGet, options: MethodOptions): GaxiosPromise[SchemaContainer] = js.native
  def get(
    params: ParamsResourceAccountsContainersGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaContainer]
  ): Unit = js.native
  /**
    * Gets a Container.
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
    *   const res = await tagmanager.accounts.containers.get({
    *     // GTM Container's API relative path. Example: accounts/{account_id\}/containers/{container_id\}
    *     path: 'accounts/my-account/containers/my-container',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "accountId": "my_accountId",
    *   //   "containerId": "my_containerId",
    *   //   "domainName": [],
    *   //   "fingerprint": "my_fingerprint",
    *   //   "name": "my_name",
    *   //   "notes": "my_notes",
    *   //   "path": "my_path",
    *   //   "publicId": "my_publicId",
    *   //   "tagManagerUrl": "my_tagManagerUrl",
    *   //   "usageContext": []
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
  def get(params: ParamsResourceAccountsContainersGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceAccountsContainersGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaListContainersResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListContainersResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListContainersResponse] = js.native
  def list(params: ParamsResourceAccountsContainersList): GaxiosPromise[SchemaListContainersResponse] = js.native
  def list(
    params: ParamsResourceAccountsContainersList,
    callback: BodyResponseCallback[SchemaListContainersResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceAccountsContainersList,
    options: BodyResponseCallback[Readable | SchemaListContainersResponse],
    callback: BodyResponseCallback[Readable | SchemaListContainersResponse]
  ): Unit = js.native
  def list(params: ParamsResourceAccountsContainersList, options: MethodOptions): GaxiosPromise[SchemaListContainersResponse] = js.native
  def list(
    params: ParamsResourceAccountsContainersList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListContainersResponse]
  ): Unit = js.native
  /**
    * Lists all Containers that belongs to a GTM Account.
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
    *   const res = await tagmanager.accounts.containers.list({
    *     // Continuation token for fetching the next page of results.
    *     pageToken: 'placeholder-value',
    *     // GTM Accounts's API relative path. Example: accounts/{account_id\}.
    *     parent: 'accounts/my-account',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "container": [],
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
  def list(params: ParamsResourceAccountsContainersList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceAccountsContainersList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def update(): GaxiosPromise[SchemaContainer] = js.native
  def update(callback: BodyResponseCallback[SchemaContainer]): Unit = js.native
  def update(params: Unit, options: MethodOptions): GaxiosPromise[SchemaContainer] = js.native
  def update(params: ParamsResourceAccountsContainersUpdate): GaxiosPromise[SchemaContainer] = js.native
  def update(params: ParamsResourceAccountsContainersUpdate, callback: BodyResponseCallback[SchemaContainer]): Unit = js.native
  def update(
    params: ParamsResourceAccountsContainersUpdate,
    options: BodyResponseCallback[Readable | SchemaContainer],
    callback: BodyResponseCallback[Readable | SchemaContainer]
  ): Unit = js.native
  def update(params: ParamsResourceAccountsContainersUpdate, options: MethodOptions): GaxiosPromise[SchemaContainer] = js.native
  def update(
    params: ParamsResourceAccountsContainersUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaContainer]
  ): Unit = js.native
  /**
    * Updates a Container.
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
    *   const res = await tagmanager.accounts.containers.update({
    *     // When provided, this fingerprint must match the fingerprint of the container in storage.
    *     fingerprint: 'placeholder-value',
    *     // GTM Container's API relative path. Example: accounts/{account_id\}/containers/{container_id\}
    *     path: 'accounts/my-account/containers/my-container',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "accountId": "my_accountId",
    *       //   "containerId": "my_containerId",
    *       //   "domainName": [],
    *       //   "fingerprint": "my_fingerprint",
    *       //   "name": "my_name",
    *       //   "notes": "my_notes",
    *       //   "path": "my_path",
    *       //   "publicId": "my_publicId",
    *       //   "tagManagerUrl": "my_tagManagerUrl",
    *       //   "usageContext": []
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "accountId": "my_accountId",
    *   //   "containerId": "my_containerId",
    *   //   "domainName": [],
    *   //   "fingerprint": "my_fingerprint",
    *   //   "name": "my_name",
    *   //   "notes": "my_notes",
    *   //   "path": "my_path",
    *   //   "publicId": "my_publicId",
    *   //   "tagManagerUrl": "my_tagManagerUrl",
    *   //   "usageContext": []
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
  def update(params: ParamsResourceAccountsContainersUpdate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def update(
    params: ParamsResourceAccountsContainersUpdate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  var version_headers: ResourceAccountsContainersVersionHeaders = js.native
  
  var versions: ResourceAccountsContainersVersions = js.native
  
  var workspaces: ResourceAccountsContainersWorkspaces = js.native
}
