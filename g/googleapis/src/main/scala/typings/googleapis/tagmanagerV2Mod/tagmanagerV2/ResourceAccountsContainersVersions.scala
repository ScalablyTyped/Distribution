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

@JSImport("googleapis/build/src/apis/tagmanager/v2", "tagmanager_v2.Resource$Accounts$Containers$Versions")
@js.native
open class ResourceAccountsContainersVersions protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
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
    * const tagmanager = google.tagmanager('v2');
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
    *     // GTM ContainerVersion's API relative path. Example: accounts/{account_id\}/containers/{container_id\}/versions/{version_id\}
    *     path: 'accounts/my-account/containers/my-container/versions/my-version',
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
    *   const res = await tagmanager.accounts.containers.versions.get({
    *     // The GTM ContainerVersion ID. Specify published to retrieve the currently published version.
    *     containerVersionId: 'placeholder-value',
    *     // GTM ContainerVersion's API relative path. Example: accounts/{account_id\}/containers/{container_id\}/versions/{version_id\}
    *     path: 'accounts/my-account/containers/my-container/versions/my-version',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "accountId": "my_accountId",
    *   //   "builtInVariable": [],
    *   //   "client": [],
    *   //   "container": {},
    *   //   "containerId": "my_containerId",
    *   //   "containerVersionId": "my_containerVersionId",
    *   //   "customTemplate": [],
    *   //   "deleted": false,
    *   //   "description": "my_description",
    *   //   "fingerprint": "my_fingerprint",
    *   //   "folder": [],
    *   //   "name": "my_name",
    *   //   "path": "my_path",
    *   //   "tag": [],
    *   //   "tagManagerUrl": "my_tagManagerUrl",
    *   //   "trigger": [],
    *   //   "variable": [],
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
  def get(params: ParamsResourceAccountsContainersVersionsGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceAccountsContainersVersionsGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def live(): GaxiosPromise[SchemaContainerVersion] = js.native
  def live(callback: BodyResponseCallback[SchemaContainerVersion]): Unit = js.native
  def live(params: Unit, options: MethodOptions): GaxiosPromise[SchemaContainerVersion] = js.native
  def live(params: ParamsResourceAccountsContainersVersionsLive): GaxiosPromise[SchemaContainerVersion] = js.native
  def live(
    params: ParamsResourceAccountsContainersVersionsLive,
    callback: BodyResponseCallback[SchemaContainerVersion]
  ): Unit = js.native
  def live(
    params: ParamsResourceAccountsContainersVersionsLive,
    options: BodyResponseCallback[Readable | SchemaContainerVersion],
    callback: BodyResponseCallback[Readable | SchemaContainerVersion]
  ): Unit = js.native
  def live(params: ParamsResourceAccountsContainersVersionsLive, options: MethodOptions): GaxiosPromise[SchemaContainerVersion] = js.native
  def live(
    params: ParamsResourceAccountsContainersVersionsLive,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaContainerVersion]
  ): Unit = js.native
  /**
    * Gets the live (i.e. published) container version
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
    *   const res = await tagmanager.accounts.containers.versions.live({
    *     // GTM Container's API relative path. Example: accounts/{account_id\}/containers/{container_id\}
    *     parent: 'accounts/my-account/containers/my-container',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "accountId": "my_accountId",
    *   //   "builtInVariable": [],
    *   //   "client": [],
    *   //   "container": {},
    *   //   "containerId": "my_containerId",
    *   //   "containerVersionId": "my_containerVersionId",
    *   //   "customTemplate": [],
    *   //   "deleted": false,
    *   //   "description": "my_description",
    *   //   "fingerprint": "my_fingerprint",
    *   //   "folder": [],
    *   //   "name": "my_name",
    *   //   "path": "my_path",
    *   //   "tag": [],
    *   //   "tagManagerUrl": "my_tagManagerUrl",
    *   //   "trigger": [],
    *   //   "variable": [],
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
  def live(params: ParamsResourceAccountsContainersVersionsLive, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def live(
    params: ParamsResourceAccountsContainersVersionsLive,
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
    * const tagmanager = google.tagmanager('v2');
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
    *     // When provided, this fingerprint must match the fingerprint of the container version in storage.
    *     fingerprint: 'placeholder-value',
    *     // GTM ContainerVersion's API relative path. Example: accounts/{account_id\}/containers/{container_id\}/versions/{version_id\}
    *     path: 'accounts/my-account/containers/my-container/versions/my-version',
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
  
  def set_latest(): GaxiosPromise[SchemaContainerVersion] = js.native
  def set_latest(callback: BodyResponseCallback[SchemaContainerVersion]): Unit = js.native
  def set_latest(params: Unit, options: MethodOptions): GaxiosPromise[SchemaContainerVersion] = js.native
  def set_latest(params: ParamsResourceAccountsContainersVersionsSetLatest): GaxiosPromise[SchemaContainerVersion] = js.native
  def set_latest(
    params: ParamsResourceAccountsContainersVersionsSetLatest,
    callback: BodyResponseCallback[SchemaContainerVersion]
  ): Unit = js.native
  def set_latest(
    params: ParamsResourceAccountsContainersVersionsSetLatest,
    options: BodyResponseCallback[Readable | SchemaContainerVersion],
    callback: BodyResponseCallback[Readable | SchemaContainerVersion]
  ): Unit = js.native
  def set_latest(params: ParamsResourceAccountsContainersVersionsSetLatest, options: MethodOptions): GaxiosPromise[SchemaContainerVersion] = js.native
  def set_latest(
    params: ParamsResourceAccountsContainersVersionsSetLatest,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaContainerVersion]
  ): Unit = js.native
  /**
    * Sets the latest version used for synchronization of workspaces when detecting conflicts and errors.
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
    *   const res = await tagmanager.accounts.containers.versions.set_latest({
    *     // GTM ContainerVersion's API relative path. Example: accounts/{account_id\}/containers/{container_id\}/versions/{version_id\}
    *     path: 'accounts/my-account/containers/my-container/versions/my-version',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "accountId": "my_accountId",
    *   //   "builtInVariable": [],
    *   //   "client": [],
    *   //   "container": {},
    *   //   "containerId": "my_containerId",
    *   //   "containerVersionId": "my_containerVersionId",
    *   //   "customTemplate": [],
    *   //   "deleted": false,
    *   //   "description": "my_description",
    *   //   "fingerprint": "my_fingerprint",
    *   //   "folder": [],
    *   //   "name": "my_name",
    *   //   "path": "my_path",
    *   //   "tag": [],
    *   //   "tagManagerUrl": "my_tagManagerUrl",
    *   //   "trigger": [],
    *   //   "variable": [],
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
  def set_latest(params: ParamsResourceAccountsContainersVersionsSetLatest, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def set_latest(
    params: ParamsResourceAccountsContainersVersionsSetLatest,
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
    * const tagmanager = google.tagmanager('v2');
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
    *     // GTM ContainerVersion's API relative path. Example: accounts/{account_id\}/containers/{container_id\}/versions/{version_id\}
    *     path: 'accounts/my-account/containers/my-container/versions/my-version',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "accountId": "my_accountId",
    *   //   "builtInVariable": [],
    *   //   "client": [],
    *   //   "container": {},
    *   //   "containerId": "my_containerId",
    *   //   "containerVersionId": "my_containerVersionId",
    *   //   "customTemplate": [],
    *   //   "deleted": false,
    *   //   "description": "my_description",
    *   //   "fingerprint": "my_fingerprint",
    *   //   "folder": [],
    *   //   "name": "my_name",
    *   //   "path": "my_path",
    *   //   "tag": [],
    *   //   "tagManagerUrl": "my_tagManagerUrl",
    *   //   "trigger": [],
    *   //   "variable": [],
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
    * const tagmanager = google.tagmanager('v2');
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
    *     // When provided, this fingerprint must match the fingerprint of the container version in storage.
    *     fingerprint: 'placeholder-value',
    *     // GTM ContainerVersion's API relative path. Example: accounts/{account_id\}/containers/{container_id\}/versions/{version_id\}
    *     path: 'accounts/my-account/containers/my-container/versions/my-version',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "accountId": "my_accountId",
    *       //   "builtInVariable": [],
    *       //   "client": [],
    *       //   "container": {},
    *       //   "containerId": "my_containerId",
    *       //   "containerVersionId": "my_containerVersionId",
    *       //   "customTemplate": [],
    *       //   "deleted": false,
    *       //   "description": "my_description",
    *       //   "fingerprint": "my_fingerprint",
    *       //   "folder": [],
    *       //   "name": "my_name",
    *       //   "path": "my_path",
    *       //   "tag": [],
    *       //   "tagManagerUrl": "my_tagManagerUrl",
    *       //   "trigger": [],
    *       //   "variable": [],
    *       //   "zone": []
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "accountId": "my_accountId",
    *   //   "builtInVariable": [],
    *   //   "client": [],
    *   //   "container": {},
    *   //   "containerId": "my_containerId",
    *   //   "containerVersionId": "my_containerVersionId",
    *   //   "customTemplate": [],
    *   //   "deleted": false,
    *   //   "description": "my_description",
    *   //   "fingerprint": "my_fingerprint",
    *   //   "folder": [],
    *   //   "name": "my_name",
    *   //   "path": "my_path",
    *   //   "tag": [],
    *   //   "tagManagerUrl": "my_tagManagerUrl",
    *   //   "trigger": [],
    *   //   "variable": [],
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
  def update(params: ParamsResourceAccountsContainersVersionsUpdate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def update(
    params: ParamsResourceAccountsContainersVersionsUpdate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
