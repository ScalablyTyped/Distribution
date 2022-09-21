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

@JSImport("googleapis/build/src/apis/tagmanager/v1", "tagmanager_v1.Resource$Accounts$Containers$Versions")
@js.native
open class ResourceAccountsContainersVersions protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def create(): GaxiosPromise[SchemaCreateContainerVersionResponse] = js.native
  def create(callback: BodyResponseCallback[SchemaCreateContainerVersionResponse]): Unit = js.native
  def create(params: Unit, options: MethodOptions): GaxiosPromise[SchemaCreateContainerVersionResponse] = js.native
  def create(params: ParamsResourceAccountsContainersVersionsCreate): GaxiosPromise[SchemaCreateContainerVersionResponse] = js.native
  def create(
    params: ParamsResourceAccountsContainersVersionsCreate,
    callback: BodyResponseCallback[SchemaCreateContainerVersionResponse]
  ): Unit = js.native
  def create(
    params: ParamsResourceAccountsContainersVersionsCreate,
    options: BodyResponseCallback[Readable | SchemaCreateContainerVersionResponse],
    callback: BodyResponseCallback[Readable | SchemaCreateContainerVersionResponse]
  ): Unit = js.native
  def create(params: ParamsResourceAccountsContainersVersionsCreate, options: MethodOptions): GaxiosPromise[SchemaCreateContainerVersionResponse] = js.native
  def create(
    params: ParamsResourceAccountsContainersVersionsCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaCreateContainerVersionResponse]
  ): Unit = js.native
  /**
    * Creates a Container Version.
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
    *       'https://www.googleapis.com/auth/tagmanager.edit.containerversions',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await tagmanager.accounts.containers.versions.create({
    *     // The GTM Account ID.
    *     accountId: 'placeholder-value',
    *     // The GTM Container ID.
    *     containerId: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "name": "my_name",
    *       //   "notes": "my_notes",
    *       //   "quickPreview": false
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "compilerError": false,
    *   //   "containerVersion": {}
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
  def create(params: ParamsResourceAccountsContainersVersionsCreate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def create(
    params: ParamsResourceAccountsContainersVersionsCreate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def delete(): GaxiosPromise[Unit] = js.native
  def delete(callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceAccountsContainersVersionsDelete): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceAccountsContainersVersionsDelete, callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(
    params: ParamsResourceAccountsContainersVersionsDelete,
    options: BodyResponseCallback[Readable | Unit],
    callback: BodyResponseCallback[Readable | Unit]
  ): Unit = js.native
  def delete(params: ParamsResourceAccountsContainersVersionsDelete, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(
    params: ParamsResourceAccountsContainersVersionsDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  /**
    * Deletes a Container Version.
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
    *       'https://www.googleapis.com/auth/tagmanager.edit.containerversions',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await tagmanager.accounts.containers.versions.delete({
    *     // The GTM Account ID.
    *     accountId: 'placeholder-value',
    *     // The GTM Container ID.
    *     containerId: 'placeholder-value',
    *     // The GTM Container Version ID.
    *     containerVersionId: 'placeholder-value',
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
  def delete(params: ParamsResourceAccountsContainersVersionsDelete, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def delete(
    params: ParamsResourceAccountsContainersVersionsDelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def get(): GaxiosPromise[SchemaContainerVersion] = js.native
  def get(callback: BodyResponseCallback[SchemaContainerVersion]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaContainerVersion] = js.native
  def get(params: ParamsResourceAccountsContainersVersionsGet): GaxiosPromise[SchemaContainerVersion] = js.native
  def get(
    params: ParamsResourceAccountsContainersVersionsGet,
    callback: BodyResponseCallback[SchemaContainerVersion]
  ): Unit = js.native
  def get(
    params: ParamsResourceAccountsContainersVersionsGet,
    options: BodyResponseCallback[Readable | SchemaContainerVersion],
    callback: BodyResponseCallback[Readable | SchemaContainerVersion]
  ): Unit = js.native
  def get(params: ParamsResourceAccountsContainersVersionsGet, options: MethodOptions): GaxiosPromise[SchemaContainerVersion] = js.native
  def get(
    params: ParamsResourceAccountsContainersVersionsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaContainerVersion]
  ): Unit = js.native
  /**
    * Gets a Container Version.
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
    *   const res = await tagmanager.accounts.containers.versions.get({
    *     // The GTM Account ID.
    *     accountId: 'placeholder-value',
    *     // The GTM Container ID.
    *     containerId: 'placeholder-value',
    *     // The GTM Container Version ID. Specify published to retrieve the currently published version.
    *     containerVersionId: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "accountId": "my_accountId",
    *   //   "container": {},
    *   //   "containerId": "my_containerId",
    *   //   "containerVersionId": "my_containerVersionId",
    *   //   "deleted": false,
    *   //   "fingerprint": "my_fingerprint",
    *   //   "folder": [],
    *   //   "macro": [],
    *   //   "name": "my_name",
    *   //   "notes": "my_notes",
    *   //   "rule": [],
    *   //   "tag": [],
    *   //   "trigger": [],
    *   //   "variable": []
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
  def get(params: ParamsResourceAccountsContainersVersionsGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceAccountsContainersVersionsGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaListContainerVersionsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListContainerVersionsResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListContainerVersionsResponse] = js.native
  def list(params: ParamsResourceAccountsContainersVersionsList): GaxiosPromise[SchemaListContainerVersionsResponse] = js.native
  def list(
    params: ParamsResourceAccountsContainersVersionsList,
    callback: BodyResponseCallback[SchemaListContainerVersionsResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceAccountsContainersVersionsList,
    options: BodyResponseCallback[Readable | SchemaListContainerVersionsResponse],
    callback: BodyResponseCallback[Readable | SchemaListContainerVersionsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceAccountsContainersVersionsList, options: MethodOptions): GaxiosPromise[SchemaListContainerVersionsResponse] = js.native
  def list(
    params: ParamsResourceAccountsContainersVersionsList,
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
    * const tagmanager = google.tagmanager('v1');
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
    *   const res = await tagmanager.accounts.containers.versions.list({
    *     // The GTM Account ID.
    *     accountId: 'placeholder-value',
    *     // The GTM Container ID.
    *     containerId: 'placeholder-value',
    *     // Retrieve headers only when true.
    *     headers: 'placeholder-value',
    *     // Also retrieve deleted (archived) versions when true.
    *     includeDeleted: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "containerVersion": [],
    *   //   "containerVersionHeader": []
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
  def list(params: ParamsResourceAccountsContainersVersionsList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceAccountsContainersVersionsList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def publish(): GaxiosPromise[SchemaPublishContainerVersionResponse] = js.native
  def publish(callback: BodyResponseCallback[SchemaPublishContainerVersionResponse]): Unit = js.native
  def publish(params: Unit, options: MethodOptions): GaxiosPromise[SchemaPublishContainerVersionResponse] = js.native
  def publish(params: ParamsResourceAccountsContainersVersionsPublish): GaxiosPromise[SchemaPublishContainerVersionResponse] = js.native
  def publish(
    params: ParamsResourceAccountsContainersVersionsPublish,
    callback: BodyResponseCallback[SchemaPublishContainerVersionResponse]
  ): Unit = js.native
  def publish(
    params: ParamsResourceAccountsContainersVersionsPublish,
    options: BodyResponseCallback[Readable | SchemaPublishContainerVersionResponse],
    callback: BodyResponseCallback[Readable | SchemaPublishContainerVersionResponse]
  ): Unit = js.native
  def publish(params: ParamsResourceAccountsContainersVersionsPublish, options: MethodOptions): GaxiosPromise[SchemaPublishContainerVersionResponse] = js.native
  def publish(
    params: ParamsResourceAccountsContainersVersionsPublish,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaPublishContainerVersionResponse]
  ): Unit = js.native
  /**
    * Publishes a Container Version.
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
    *     scopes: ['https://www.googleapis.com/auth/tagmanager.publish'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await tagmanager.accounts.containers.versions.publish({
    *     // The GTM Account ID.
    *     accountId: 'placeholder-value',
    *     // The GTM Container ID.
    *     containerId: 'placeholder-value',
    *     // The GTM Container Version ID.
    *     containerVersionId: 'placeholder-value',
    *     // When provided, this fingerprint must match the fingerprint of the container version in storage.
    *     fingerprint: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "compilerError": false,
    *   //   "containerVersion": {}
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
  def publish(params: ParamsResourceAccountsContainersVersionsPublish, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def publish(
    params: ParamsResourceAccountsContainersVersionsPublish,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def restore(): GaxiosPromise[SchemaContainerVersion] = js.native
  def restore(callback: BodyResponseCallback[SchemaContainerVersion]): Unit = js.native
  def restore(params: Unit, options: MethodOptions): GaxiosPromise[SchemaContainerVersion] = js.native
  def restore(params: ParamsResourceAccountsContainersVersionsRestore): GaxiosPromise[SchemaContainerVersion] = js.native
  def restore(
    params: ParamsResourceAccountsContainersVersionsRestore,
    callback: BodyResponseCallback[SchemaContainerVersion]
  ): Unit = js.native
  def restore(
    params: ParamsResourceAccountsContainersVersionsRestore,
    options: BodyResponseCallback[Readable | SchemaContainerVersion],
    callback: BodyResponseCallback[Readable | SchemaContainerVersion]
  ): Unit = js.native
  def restore(params: ParamsResourceAccountsContainersVersionsRestore, options: MethodOptions): GaxiosPromise[SchemaContainerVersion] = js.native
  def restore(
    params: ParamsResourceAccountsContainersVersionsRestore,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaContainerVersion]
  ): Unit = js.native
  /**
    * Restores a Container Version. This will overwrite the container's current configuration (including its variables, triggers and tags). The operation will not have any effect on the version that is being served (i.e. the published version).
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
    *   const res = await tagmanager.accounts.containers.versions.restore({
    *     // The GTM Account ID.
    *     accountId: 'placeholder-value',
    *     // The GTM Container ID.
    *     containerId: 'placeholder-value',
    *     // The GTM Container Version ID.
    *     containerVersionId: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "accountId": "my_accountId",
    *   //   "container": {},
    *   //   "containerId": "my_containerId",
    *   //   "containerVersionId": "my_containerVersionId",
    *   //   "deleted": false,
    *   //   "fingerprint": "my_fingerprint",
    *   //   "folder": [],
    *   //   "macro": [],
    *   //   "name": "my_name",
    *   //   "notes": "my_notes",
    *   //   "rule": [],
    *   //   "tag": [],
    *   //   "trigger": [],
    *   //   "variable": []
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
  def restore(params: ParamsResourceAccountsContainersVersionsRestore, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def restore(
    params: ParamsResourceAccountsContainersVersionsRestore,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def undelete(): GaxiosPromise[SchemaContainerVersion] = js.native
  def undelete(callback: BodyResponseCallback[SchemaContainerVersion]): Unit = js.native
  def undelete(params: Unit, options: MethodOptions): GaxiosPromise[SchemaContainerVersion] = js.native
  def undelete(params: ParamsResourceAccountsContainersVersionsUndelete): GaxiosPromise[SchemaContainerVersion] = js.native
  def undelete(
    params: ParamsResourceAccountsContainersVersionsUndelete,
    callback: BodyResponseCallback[SchemaContainerVersion]
  ): Unit = js.native
  def undelete(
    params: ParamsResourceAccountsContainersVersionsUndelete,
    options: BodyResponseCallback[Readable | SchemaContainerVersion],
    callback: BodyResponseCallback[Readable | SchemaContainerVersion]
  ): Unit = js.native
  def undelete(params: ParamsResourceAccountsContainersVersionsUndelete, options: MethodOptions): GaxiosPromise[SchemaContainerVersion] = js.native
  def undelete(
    params: ParamsResourceAccountsContainersVersionsUndelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaContainerVersion]
  ): Unit = js.native
  /**
    * Undeletes a Container Version.
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
    *       'https://www.googleapis.com/auth/tagmanager.edit.containerversions',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await tagmanager.accounts.containers.versions.undelete({
    *     // The GTM Account ID.
    *     accountId: 'placeholder-value',
    *     // The GTM Container ID.
    *     containerId: 'placeholder-value',
    *     // The GTM Container Version ID.
    *     containerVersionId: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "accountId": "my_accountId",
    *   //   "container": {},
    *   //   "containerId": "my_containerId",
    *   //   "containerVersionId": "my_containerVersionId",
    *   //   "deleted": false,
    *   //   "fingerprint": "my_fingerprint",
    *   //   "folder": [],
    *   //   "macro": [],
    *   //   "name": "my_name",
    *   //   "notes": "my_notes",
    *   //   "rule": [],
    *   //   "tag": [],
    *   //   "trigger": [],
    *   //   "variable": []
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
  def undelete(params: ParamsResourceAccountsContainersVersionsUndelete, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def undelete(
    params: ParamsResourceAccountsContainersVersionsUndelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def update(): GaxiosPromise[SchemaContainerVersion] = js.native
  def update(callback: BodyResponseCallback[SchemaContainerVersion]): Unit = js.native
  def update(params: Unit, options: MethodOptions): GaxiosPromise[SchemaContainerVersion] = js.native
  def update(params: ParamsResourceAccountsContainersVersionsUpdate): GaxiosPromise[SchemaContainerVersion] = js.native
  def update(
    params: ParamsResourceAccountsContainersVersionsUpdate,
    callback: BodyResponseCallback[SchemaContainerVersion]
  ): Unit = js.native
  def update(
    params: ParamsResourceAccountsContainersVersionsUpdate,
    options: BodyResponseCallback[Readable | SchemaContainerVersion],
    callback: BodyResponseCallback[Readable | SchemaContainerVersion]
  ): Unit = js.native
  def update(params: ParamsResourceAccountsContainersVersionsUpdate, options: MethodOptions): GaxiosPromise[SchemaContainerVersion] = js.native
  def update(
    params: ParamsResourceAccountsContainersVersionsUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaContainerVersion]
  ): Unit = js.native
  /**
    * Updates a Container Version.
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
    *       'https://www.googleapis.com/auth/tagmanager.edit.containerversions',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await tagmanager.accounts.containers.versions.update({
    *     // The GTM Account ID.
    *     accountId: 'placeholder-value',
    *     // The GTM Container ID.
    *     containerId: 'placeholder-value',
    *     // The GTM Container Version ID.
    *     containerVersionId: 'placeholder-value',
    *     // When provided, this fingerprint must match the fingerprint of the container version in storage.
    *     fingerprint: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "accountId": "my_accountId",
    *       //   "container": {},
    *       //   "containerId": "my_containerId",
    *       //   "containerVersionId": "my_containerVersionId",
    *       //   "deleted": false,
    *       //   "fingerprint": "my_fingerprint",
    *       //   "folder": [],
    *       //   "macro": [],
    *       //   "name": "my_name",
    *       //   "notes": "my_notes",
    *       //   "rule": [],
    *       //   "tag": [],
    *       //   "trigger": [],
    *       //   "variable": []
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "accountId": "my_accountId",
    *   //   "container": {},
    *   //   "containerId": "my_containerId",
    *   //   "containerVersionId": "my_containerVersionId",
    *   //   "deleted": false,
    *   //   "fingerprint": "my_fingerprint",
    *   //   "folder": [],
    *   //   "macro": [],
    *   //   "name": "my_name",
    *   //   "notes": "my_notes",
    *   //   "rule": [],
    *   //   "tag": [],
    *   //   "trigger": [],
    *   //   "variable": []
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
  def update(params: ParamsResourceAccountsContainersVersionsUpdate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def update(
    params: ParamsResourceAccountsContainersVersionsUpdate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
