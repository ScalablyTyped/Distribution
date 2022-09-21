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

@JSImport("googleapis/build/src/apis/tagmanager/v1", "tagmanager_v1.Resource$Accounts$Containers$Folders")
@js.native
open class ResourceAccountsContainersFolders protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def create(): GaxiosPromise[SchemaFolder] = js.native
  def create(callback: BodyResponseCallback[SchemaFolder]): Unit = js.native
  def create(params: Unit, options: MethodOptions): GaxiosPromise[SchemaFolder] = js.native
  def create(params: ParamsResourceAccountsContainersFoldersCreate): GaxiosPromise[SchemaFolder] = js.native
  def create(
    params: ParamsResourceAccountsContainersFoldersCreate,
    callback: BodyResponseCallback[SchemaFolder]
  ): Unit = js.native
  def create(
    params: ParamsResourceAccountsContainersFoldersCreate,
    options: BodyResponseCallback[Readable | SchemaFolder],
    callback: BodyResponseCallback[Readable | SchemaFolder]
  ): Unit = js.native
  def create(params: ParamsResourceAccountsContainersFoldersCreate, options: MethodOptions): GaxiosPromise[SchemaFolder] = js.native
  def create(
    params: ParamsResourceAccountsContainersFoldersCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaFolder]
  ): Unit = js.native
  /**
    * Creates a GTM Folder.
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
    *   const res = await tagmanager.accounts.containers.folders.create({
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
    *       //   "fingerprint": "my_fingerprint",
    *       //   "folderId": "my_folderId",
    *       //   "name": "my_name"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "accountId": "my_accountId",
    *   //   "containerId": "my_containerId",
    *   //   "fingerprint": "my_fingerprint",
    *   //   "folderId": "my_folderId",
    *   //   "name": "my_name"
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
  def create(params: ParamsResourceAccountsContainersFoldersCreate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def create(
    params: ParamsResourceAccountsContainersFoldersCreate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def delete(): GaxiosPromise[Unit] = js.native
  def delete(callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceAccountsContainersFoldersDelete): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceAccountsContainersFoldersDelete, callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(
    params: ParamsResourceAccountsContainersFoldersDelete,
    options: BodyResponseCallback[Readable | Unit],
    callback: BodyResponseCallback[Readable | Unit]
  ): Unit = js.native
  def delete(params: ParamsResourceAccountsContainersFoldersDelete, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(
    params: ParamsResourceAccountsContainersFoldersDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  /**
    * Deletes a GTM Folder.
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
    *   const res = await tagmanager.accounts.containers.folders.delete({
    *     // The GTM Account ID.
    *     accountId: 'placeholder-value',
    *     // The GTM Container ID.
    *     containerId: 'placeholder-value',
    *     // The GTM Folder ID.
    *     folderId: 'placeholder-value',
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
  def delete(params: ParamsResourceAccountsContainersFoldersDelete, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def delete(
    params: ParamsResourceAccountsContainersFoldersDelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  var entities: ResourceAccountsContainersFoldersEntities = js.native
  
  def get(): GaxiosPromise[SchemaFolder] = js.native
  def get(callback: BodyResponseCallback[SchemaFolder]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaFolder] = js.native
  def get(params: ParamsResourceAccountsContainersFoldersGet): GaxiosPromise[SchemaFolder] = js.native
  def get(params: ParamsResourceAccountsContainersFoldersGet, callback: BodyResponseCallback[SchemaFolder]): Unit = js.native
  def get(
    params: ParamsResourceAccountsContainersFoldersGet,
    options: BodyResponseCallback[Readable | SchemaFolder],
    callback: BodyResponseCallback[Readable | SchemaFolder]
  ): Unit = js.native
  def get(params: ParamsResourceAccountsContainersFoldersGet, options: MethodOptions): GaxiosPromise[SchemaFolder] = js.native
  def get(
    params: ParamsResourceAccountsContainersFoldersGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaFolder]
  ): Unit = js.native
  /**
    * Gets a GTM Folder.
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
    *   const res = await tagmanager.accounts.containers.folders.get({
    *     // The GTM Account ID.
    *     accountId: 'placeholder-value',
    *     // The GTM Container ID.
    *     containerId: 'placeholder-value',
    *     // The GTM Folder ID.
    *     folderId: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "accountId": "my_accountId",
    *   //   "containerId": "my_containerId",
    *   //   "fingerprint": "my_fingerprint",
    *   //   "folderId": "my_folderId",
    *   //   "name": "my_name"
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
  def get(params: ParamsResourceAccountsContainersFoldersGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceAccountsContainersFoldersGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaListFoldersResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListFoldersResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListFoldersResponse] = js.native
  def list(params: ParamsResourceAccountsContainersFoldersList): GaxiosPromise[SchemaListFoldersResponse] = js.native
  def list(
    params: ParamsResourceAccountsContainersFoldersList,
    callback: BodyResponseCallback[SchemaListFoldersResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceAccountsContainersFoldersList,
    options: BodyResponseCallback[Readable | SchemaListFoldersResponse],
    callback: BodyResponseCallback[Readable | SchemaListFoldersResponse]
  ): Unit = js.native
  def list(params: ParamsResourceAccountsContainersFoldersList, options: MethodOptions): GaxiosPromise[SchemaListFoldersResponse] = js.native
  def list(
    params: ParamsResourceAccountsContainersFoldersList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListFoldersResponse]
  ): Unit = js.native
  /**
    * Lists all GTM Folders of a Container.
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
    *   const res = await tagmanager.accounts.containers.folders.list({
    *     // The GTM Account ID.
    *     accountId: 'placeholder-value',
    *     // The GTM Container ID.
    *     containerId: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "folders": []
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
  def list(params: ParamsResourceAccountsContainersFoldersList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceAccountsContainersFoldersList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def update(): GaxiosPromise[SchemaFolder] = js.native
  def update(callback: BodyResponseCallback[SchemaFolder]): Unit = js.native
  def update(params: Unit, options: MethodOptions): GaxiosPromise[SchemaFolder] = js.native
  def update(params: ParamsResourceAccountsContainersFoldersUpdate): GaxiosPromise[SchemaFolder] = js.native
  def update(
    params: ParamsResourceAccountsContainersFoldersUpdate,
    callback: BodyResponseCallback[SchemaFolder]
  ): Unit = js.native
  def update(
    params: ParamsResourceAccountsContainersFoldersUpdate,
    options: BodyResponseCallback[Readable | SchemaFolder],
    callback: BodyResponseCallback[Readable | SchemaFolder]
  ): Unit = js.native
  def update(params: ParamsResourceAccountsContainersFoldersUpdate, options: MethodOptions): GaxiosPromise[SchemaFolder] = js.native
  def update(
    params: ParamsResourceAccountsContainersFoldersUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaFolder]
  ): Unit = js.native
  /**
    * Updates a GTM Folder.
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
    *   const res = await tagmanager.accounts.containers.folders.update({
    *     // The GTM Account ID.
    *     accountId: 'placeholder-value',
    *     // The GTM Container ID.
    *     containerId: 'placeholder-value',
    *     // When provided, this fingerprint must match the fingerprint of the folder in storage.
    *     fingerprint: 'placeholder-value',
    *     // The GTM Folder ID.
    *     folderId: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "accountId": "my_accountId",
    *       //   "containerId": "my_containerId",
    *       //   "fingerprint": "my_fingerprint",
    *       //   "folderId": "my_folderId",
    *       //   "name": "my_name"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "accountId": "my_accountId",
    *   //   "containerId": "my_containerId",
    *   //   "fingerprint": "my_fingerprint",
    *   //   "folderId": "my_folderId",
    *   //   "name": "my_name"
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
  def update(params: ParamsResourceAccountsContainersFoldersUpdate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def update(
    params: ParamsResourceAccountsContainersFoldersUpdate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
