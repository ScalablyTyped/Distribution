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

@JSImport("googleapis/build/src/apis/tagmanager/v1", "tagmanager_v1.Resource$Accounts$Containers$Environments")
@js.native
open class ResourceAccountsContainersEnvironments protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def create(): GaxiosPromise[SchemaEnvironment] = js.native
  def create(callback: BodyResponseCallback[SchemaEnvironment]): Unit = js.native
  def create(params: Unit, options: MethodOptions): GaxiosPromise[SchemaEnvironment] = js.native
  def create(params: ParamsResourceAccountsContainersEnvironmentsCreate): GaxiosPromise[SchemaEnvironment] = js.native
  def create(
    params: ParamsResourceAccountsContainersEnvironmentsCreate,
    callback: BodyResponseCallback[SchemaEnvironment]
  ): Unit = js.native
  def create(
    params: ParamsResourceAccountsContainersEnvironmentsCreate,
    options: BodyResponseCallback[Readable | SchemaEnvironment],
    callback: BodyResponseCallback[Readable | SchemaEnvironment]
  ): Unit = js.native
  def create(params: ParamsResourceAccountsContainersEnvironmentsCreate, options: MethodOptions): GaxiosPromise[SchemaEnvironment] = js.native
  def create(
    params: ParamsResourceAccountsContainersEnvironmentsCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEnvironment]
  ): Unit = js.native
  /**
    * Creates a GTM Environment.
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
    *   const res = await tagmanager.accounts.containers.environments.create({
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
    *       //   "authorizationCode": "my_authorizationCode",
    *       //   "authorizationTimestampMs": "my_authorizationTimestampMs",
    *       //   "containerId": "my_containerId",
    *       //   "containerVersionId": "my_containerVersionId",
    *       //   "description": "my_description",
    *       //   "enableDebug": false,
    *       //   "environmentId": "my_environmentId",
    *       //   "fingerprint": "my_fingerprint",
    *       //   "name": "my_name",
    *       //   "type": "my_type",
    *       //   "url": "my_url"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "accountId": "my_accountId",
    *   //   "authorizationCode": "my_authorizationCode",
    *   //   "authorizationTimestampMs": "my_authorizationTimestampMs",
    *   //   "containerId": "my_containerId",
    *   //   "containerVersionId": "my_containerVersionId",
    *   //   "description": "my_description",
    *   //   "enableDebug": false,
    *   //   "environmentId": "my_environmentId",
    *   //   "fingerprint": "my_fingerprint",
    *   //   "name": "my_name",
    *   //   "type": "my_type",
    *   //   "url": "my_url"
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
  def create(params: ParamsResourceAccountsContainersEnvironmentsCreate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def create(
    params: ParamsResourceAccountsContainersEnvironmentsCreate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def delete(): GaxiosPromise[Unit] = js.native
  def delete(callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceAccountsContainersEnvironmentsDelete): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceAccountsContainersEnvironmentsDelete, callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(
    params: ParamsResourceAccountsContainersEnvironmentsDelete,
    options: BodyResponseCallback[Readable | Unit],
    callback: BodyResponseCallback[Readable | Unit]
  ): Unit = js.native
  def delete(params: ParamsResourceAccountsContainersEnvironmentsDelete, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(
    params: ParamsResourceAccountsContainersEnvironmentsDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  /**
    * Deletes a GTM Environment.
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
    *   const res = await tagmanager.accounts.containers.environments.delete({
    *     // The GTM Account ID.
    *     accountId: 'placeholder-value',
    *     // The GTM Container ID.
    *     containerId: 'placeholder-value',
    *     // The GTM Environment ID.
    *     environmentId: 'placeholder-value',
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
  def delete(params: ParamsResourceAccountsContainersEnvironmentsDelete, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def delete(
    params: ParamsResourceAccountsContainersEnvironmentsDelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def get(): GaxiosPromise[SchemaEnvironment] = js.native
  def get(callback: BodyResponseCallback[SchemaEnvironment]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaEnvironment] = js.native
  def get(params: ParamsResourceAccountsContainersEnvironmentsGet): GaxiosPromise[SchemaEnvironment] = js.native
  def get(
    params: ParamsResourceAccountsContainersEnvironmentsGet,
    callback: BodyResponseCallback[SchemaEnvironment]
  ): Unit = js.native
  def get(
    params: ParamsResourceAccountsContainersEnvironmentsGet,
    options: BodyResponseCallback[Readable | SchemaEnvironment],
    callback: BodyResponseCallback[Readable | SchemaEnvironment]
  ): Unit = js.native
  def get(params: ParamsResourceAccountsContainersEnvironmentsGet, options: MethodOptions): GaxiosPromise[SchemaEnvironment] = js.native
  def get(
    params: ParamsResourceAccountsContainersEnvironmentsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEnvironment]
  ): Unit = js.native
  /**
    * Gets a GTM Environment.
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
    *   const res = await tagmanager.accounts.containers.environments.get({
    *     // The GTM Account ID.
    *     accountId: 'placeholder-value',
    *     // The GTM Container ID.
    *     containerId: 'placeholder-value',
    *     // The GTM Environment ID.
    *     environmentId: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "accountId": "my_accountId",
    *   //   "authorizationCode": "my_authorizationCode",
    *   //   "authorizationTimestampMs": "my_authorizationTimestampMs",
    *   //   "containerId": "my_containerId",
    *   //   "containerVersionId": "my_containerVersionId",
    *   //   "description": "my_description",
    *   //   "enableDebug": false,
    *   //   "environmentId": "my_environmentId",
    *   //   "fingerprint": "my_fingerprint",
    *   //   "name": "my_name",
    *   //   "type": "my_type",
    *   //   "url": "my_url"
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
  def get(params: ParamsResourceAccountsContainersEnvironmentsGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceAccountsContainersEnvironmentsGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaListEnvironmentsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListEnvironmentsResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListEnvironmentsResponse] = js.native
  def list(params: ParamsResourceAccountsContainersEnvironmentsList): GaxiosPromise[SchemaListEnvironmentsResponse] = js.native
  def list(
    params: ParamsResourceAccountsContainersEnvironmentsList,
    callback: BodyResponseCallback[SchemaListEnvironmentsResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceAccountsContainersEnvironmentsList,
    options: BodyResponseCallback[Readable | SchemaListEnvironmentsResponse],
    callback: BodyResponseCallback[Readable | SchemaListEnvironmentsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceAccountsContainersEnvironmentsList, options: MethodOptions): GaxiosPromise[SchemaListEnvironmentsResponse] = js.native
  def list(
    params: ParamsResourceAccountsContainersEnvironmentsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListEnvironmentsResponse]
  ): Unit = js.native
  /**
    * Lists all GTM Environments of a GTM Container.
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
    *   const res = await tagmanager.accounts.containers.environments.list({
    *     // The GTM Account ID.
    *     accountId: 'placeholder-value',
    *     // The GTM Container ID.
    *     containerId: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "environments": []
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
  def list(params: ParamsResourceAccountsContainersEnvironmentsList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceAccountsContainersEnvironmentsList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def update(): GaxiosPromise[SchemaEnvironment] = js.native
  def update(callback: BodyResponseCallback[SchemaEnvironment]): Unit = js.native
  def update(params: Unit, options: MethodOptions): GaxiosPromise[SchemaEnvironment] = js.native
  def update(params: ParamsResourceAccountsContainersEnvironmentsUpdate): GaxiosPromise[SchemaEnvironment] = js.native
  def update(
    params: ParamsResourceAccountsContainersEnvironmentsUpdate,
    callback: BodyResponseCallback[SchemaEnvironment]
  ): Unit = js.native
  def update(
    params: ParamsResourceAccountsContainersEnvironmentsUpdate,
    options: BodyResponseCallback[Readable | SchemaEnvironment],
    callback: BodyResponseCallback[Readable | SchemaEnvironment]
  ): Unit = js.native
  def update(params: ParamsResourceAccountsContainersEnvironmentsUpdate, options: MethodOptions): GaxiosPromise[SchemaEnvironment] = js.native
  def update(
    params: ParamsResourceAccountsContainersEnvironmentsUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEnvironment]
  ): Unit = js.native
  /**
    * Updates a GTM Environment.
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
    *   const res = await tagmanager.accounts.containers.environments.update({
    *     // The GTM Account ID.
    *     accountId: 'placeholder-value',
    *     // The GTM Container ID.
    *     containerId: 'placeholder-value',
    *     // The GTM Environment ID.
    *     environmentId: 'placeholder-value',
    *     // When provided, this fingerprint must match the fingerprint of the environment in storage.
    *     fingerprint: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "accountId": "my_accountId",
    *       //   "authorizationCode": "my_authorizationCode",
    *       //   "authorizationTimestampMs": "my_authorizationTimestampMs",
    *       //   "containerId": "my_containerId",
    *       //   "containerVersionId": "my_containerVersionId",
    *       //   "description": "my_description",
    *       //   "enableDebug": false,
    *       //   "environmentId": "my_environmentId",
    *       //   "fingerprint": "my_fingerprint",
    *       //   "name": "my_name",
    *       //   "type": "my_type",
    *       //   "url": "my_url"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "accountId": "my_accountId",
    *   //   "authorizationCode": "my_authorizationCode",
    *   //   "authorizationTimestampMs": "my_authorizationTimestampMs",
    *   //   "containerId": "my_containerId",
    *   //   "containerVersionId": "my_containerVersionId",
    *   //   "description": "my_description",
    *   //   "enableDebug": false,
    *   //   "environmentId": "my_environmentId",
    *   //   "fingerprint": "my_fingerprint",
    *   //   "name": "my_name",
    *   //   "type": "my_type",
    *   //   "url": "my_url"
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
  def update(params: ParamsResourceAccountsContainersEnvironmentsUpdate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def update(
    params: ParamsResourceAccountsContainersEnvironmentsUpdate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
