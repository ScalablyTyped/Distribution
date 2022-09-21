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

@JSImport("googleapis/build/src/apis/tagmanager/v2", "tagmanager_v2.Resource$Accounts$Containers$Version_headers")
@js.native
open class ResourceAccountsContainersVersionHeaders protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def latest(): GaxiosPromise[SchemaContainerVersionHeader] = js.native
  def latest(callback: BodyResponseCallback[SchemaContainerVersionHeader]): Unit = js.native
  def latest(params: Unit, options: MethodOptions): GaxiosPromise[SchemaContainerVersionHeader] = js.native
  def latest(params: ParamsResourceAccountsContainersVersionHeadersLatest): GaxiosPromise[SchemaContainerVersionHeader] = js.native
  def latest(
    params: ParamsResourceAccountsContainersVersionHeadersLatest,
    callback: BodyResponseCallback[SchemaContainerVersionHeader]
  ): Unit = js.native
  def latest(
    params: ParamsResourceAccountsContainersVersionHeadersLatest,
    options: BodyResponseCallback[Readable | SchemaContainerVersionHeader],
    callback: BodyResponseCallback[Readable | SchemaContainerVersionHeader]
  ): Unit = js.native
  def latest(params: ParamsResourceAccountsContainersVersionHeadersLatest, options: MethodOptions): GaxiosPromise[SchemaContainerVersionHeader] = js.native
  def latest(
    params: ParamsResourceAccountsContainersVersionHeadersLatest,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaContainerVersionHeader]
  ): Unit = js.native
  /**
    * Gets the latest container version header
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
    *   const res = await tagmanager.accounts.containers.version_headers.latest({
    *     // GTM Container's API relative path. Example: accounts/{account_id\}/containers/{container_id\}
    *     parent: 'accounts/my-account/containers/my-container',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "accountId": "my_accountId",
    *   //   "containerId": "my_containerId",
    *   //   "containerVersionId": "my_containerVersionId",
    *   //   "deleted": false,
    *   //   "name": "my_name",
    *   //   "numClients": "my_numClients",
    *   //   "numCustomTemplates": "my_numCustomTemplates",
    *   //   "numMacros": "my_numMacros",
    *   //   "numRules": "my_numRules",
    *   //   "numTags": "my_numTags",
    *   //   "numTriggers": "my_numTriggers",
    *   //   "numVariables": "my_numVariables",
    *   //   "numZones": "my_numZones",
    *   //   "path": "my_path"
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
  def latest(params: ParamsResourceAccountsContainersVersionHeadersLatest, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def latest(
    params: ParamsResourceAccountsContainersVersionHeadersLatest,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaListContainerVersionsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListContainerVersionsResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListContainerVersionsResponse] = js.native
  def list(params: ParamsResourceAccountsContainersVersionHeadersList): GaxiosPromise[SchemaListContainerVersionsResponse] = js.native
  def list(
    params: ParamsResourceAccountsContainersVersionHeadersList,
    callback: BodyResponseCallback[SchemaListContainerVersionsResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceAccountsContainersVersionHeadersList,
    options: BodyResponseCallback[Readable | SchemaListContainerVersionsResponse],
    callback: BodyResponseCallback[Readable | SchemaListContainerVersionsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceAccountsContainersVersionHeadersList, options: MethodOptions): GaxiosPromise[SchemaListContainerVersionsResponse] = js.native
  def list(
    params: ParamsResourceAccountsContainersVersionHeadersList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListContainerVersionsResponse]
  ): Unit = js.native
  /**
    * Lists all Container Versions of a GTM Container.
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
    *       'https://www.googleapis.com/auth/tagmanager.edit.containerversions',
    *       'https://www.googleapis.com/auth/tagmanager.readonly',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await tagmanager.accounts.containers.version_headers.list({
    *     // Also retrieve deleted (archived) versions when true.
    *     includeDeleted: 'placeholder-value',
    *     // Continuation token for fetching the next page of results.
    *     pageToken: 'placeholder-value',
    *     // GTM Container's API relative path. Example: accounts/{account_id\}/containers/{container_id\}
    *     parent: 'accounts/my-account/containers/my-container',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "containerVersionHeader": [],
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
  def list(params: ParamsResourceAccountsContainersVersionHeadersList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceAccountsContainersVersionHeadersList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
