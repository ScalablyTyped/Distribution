package typings.googleapis.cloudshellV1Mod.cloudshellV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/cloudshell/v1", "cloudshell_v1.Resource$Users$Environments")
@js.native
open class ResourceUsersEnvironments protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  def addPublicKey(): GaxiosPromise[SchemaOperation] = js.native
  def addPublicKey(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def addPublicKey(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def addPublicKey(params: ParamsResourceUsersEnvironmentsAddpublickey): GaxiosPromise[SchemaOperation] = js.native
  def addPublicKey(
    params: ParamsResourceUsersEnvironmentsAddpublickey,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def addPublicKey(
    params: ParamsResourceUsersEnvironmentsAddpublickey,
    options: BodyResponseCallback[Readable | SchemaOperation],
    callback: BodyResponseCallback[Readable | SchemaOperation]
  ): Unit = js.native
  def addPublicKey(params: ParamsResourceUsersEnvironmentsAddpublickey, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def addPublicKey(
    params: ParamsResourceUsersEnvironmentsAddpublickey,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * Adds a public SSH key to an environment, allowing clients with the corresponding private key to connect to that environment via SSH. If a key with the same content already exists, this will error with ALREADY_EXISTS.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/cloudshell.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const cloudshell = google.cloudshell('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/cloud-platform'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await cloudshell.users.environments.addPublicKey({
    *     // Environment this key should be added to, e.g. `users/me/environments/default`.
    *     environment: 'users/my-user/environments/my-environment',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "key": "my_key"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "done": false,
    *   //   "error": {},
    *   //   "metadata": {},
    *   //   "name": "my_name",
    *   //   "response": {}
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
  def addPublicKey(params: ParamsResourceUsersEnvironmentsAddpublickey, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def addPublicKey(
    params: ParamsResourceUsersEnvironmentsAddpublickey,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def authorize(): GaxiosPromise[SchemaOperation] = js.native
  def authorize(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def authorize(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def authorize(params: ParamsResourceUsersEnvironmentsAuthorize): GaxiosPromise[SchemaOperation] = js.native
  def authorize(params: ParamsResourceUsersEnvironmentsAuthorize, callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def authorize(
    params: ParamsResourceUsersEnvironmentsAuthorize,
    options: BodyResponseCallback[Readable | SchemaOperation],
    callback: BodyResponseCallback[Readable | SchemaOperation]
  ): Unit = js.native
  def authorize(params: ParamsResourceUsersEnvironmentsAuthorize, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def authorize(
    params: ParamsResourceUsersEnvironmentsAuthorize,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * Sends OAuth credentials to a running environment on behalf of a user. When this completes, the environment will be authorized to run various Google Cloud command line tools without requiring the user to manually authenticate.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/cloudshell.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const cloudshell = google.cloudshell('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/cloud-platform'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await cloudshell.users.environments.authorize({
    *     // Name of the resource that should receive the credentials, for example `users/me/environments/default` or `users/someone@example.com/environments/default`.
    *     name: 'users/my-user/environments/my-environment',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "accessToken": "my_accessToken",
    *       //   "expireTime": "my_expireTime",
    *       //   "idToken": "my_idToken"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "done": false,
    *   //   "error": {},
    *   //   "metadata": {},
    *   //   "name": "my_name",
    *   //   "response": {}
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
  def authorize(params: ParamsResourceUsersEnvironmentsAuthorize, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def authorize(
    params: ParamsResourceUsersEnvironmentsAuthorize,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  var context: APIRequestContext = js.native
  
  def get(): GaxiosPromise[SchemaEnvironment] = js.native
  def get(callback: BodyResponseCallback[SchemaEnvironment]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaEnvironment] = js.native
  def get(params: ParamsResourceUsersEnvironmentsGet): GaxiosPromise[SchemaEnvironment] = js.native
  def get(params: ParamsResourceUsersEnvironmentsGet, callback: BodyResponseCallback[SchemaEnvironment]): Unit = js.native
  def get(
    params: ParamsResourceUsersEnvironmentsGet,
    options: BodyResponseCallback[Readable | SchemaEnvironment],
    callback: BodyResponseCallback[Readable | SchemaEnvironment]
  ): Unit = js.native
  def get(params: ParamsResourceUsersEnvironmentsGet, options: MethodOptions): GaxiosPromise[SchemaEnvironment] = js.native
  def get(
    params: ParamsResourceUsersEnvironmentsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEnvironment]
  ): Unit = js.native
  /**
    * Gets an environment. Returns NOT_FOUND if the environment does not exist.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/cloudshell.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const cloudshell = google.cloudshell('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/cloud-platform'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await cloudshell.users.environments.get({
    *     // Required. Name of the requested resource, for example `users/me/environments/default` or `users/someone@example.com/environments/default`.
    *     name: 'users/my-user/environments/my-environment',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "dockerImage": "my_dockerImage",
    *   //   "id": "my_id",
    *   //   "name": "my_name",
    *   //   "publicKeys": [],
    *   //   "sshHost": "my_sshHost",
    *   //   "sshPort": 0,
    *   //   "sshUsername": "my_sshUsername",
    *   //   "state": "my_state",
    *   //   "webHost": "my_webHost"
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
  def get(params: ParamsResourceUsersEnvironmentsGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceUsersEnvironmentsGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def removePublicKey(): GaxiosPromise[SchemaOperation] = js.native
  def removePublicKey(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def removePublicKey(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def removePublicKey(params: ParamsResourceUsersEnvironmentsRemovepublickey): GaxiosPromise[SchemaOperation] = js.native
  def removePublicKey(
    params: ParamsResourceUsersEnvironmentsRemovepublickey,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def removePublicKey(
    params: ParamsResourceUsersEnvironmentsRemovepublickey,
    options: BodyResponseCallback[Readable | SchemaOperation],
    callback: BodyResponseCallback[Readable | SchemaOperation]
  ): Unit = js.native
  def removePublicKey(params: ParamsResourceUsersEnvironmentsRemovepublickey, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def removePublicKey(
    params: ParamsResourceUsersEnvironmentsRemovepublickey,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * Removes a public SSH key from an environment. Clients will no longer be able to connect to the environment using the corresponding private key. If a key with the same content is not present, this will error with NOT_FOUND.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/cloudshell.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const cloudshell = google.cloudshell('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/cloud-platform'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await cloudshell.users.environments.removePublicKey({
    *     // Environment this key should be removed from, e.g. `users/me/environments/default`.
    *     environment: 'users/my-user/environments/my-environment',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "key": "my_key"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "done": false,
    *   //   "error": {},
    *   //   "metadata": {},
    *   //   "name": "my_name",
    *   //   "response": {}
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
  def removePublicKey(params: ParamsResourceUsersEnvironmentsRemovepublickey, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def removePublicKey(
    params: ParamsResourceUsersEnvironmentsRemovepublickey,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def start(): GaxiosPromise[SchemaOperation] = js.native
  def start(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def start(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def start(params: ParamsResourceUsersEnvironmentsStart): GaxiosPromise[SchemaOperation] = js.native
  def start(params: ParamsResourceUsersEnvironmentsStart, callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def start(
    params: ParamsResourceUsersEnvironmentsStart,
    options: BodyResponseCallback[Readable | SchemaOperation],
    callback: BodyResponseCallback[Readable | SchemaOperation]
  ): Unit = js.native
  def start(params: ParamsResourceUsersEnvironmentsStart, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def start(
    params: ParamsResourceUsersEnvironmentsStart,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * Starts an existing environment, allowing clients to connect to it. The returned operation will contain an instance of StartEnvironmentMetadata in its metadata field. Users can wait for the environment to start by polling this operation via GetOperation. Once the environment has finished starting and is ready to accept connections, the operation will contain a StartEnvironmentResponse in its response field.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/cloudshell.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const cloudshell = google.cloudshell('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/cloud-platform'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await cloudshell.users.environments.start({
    *     // Name of the resource that should be started, for example `users/me/environments/default` or `users/someone@example.com/environments/default`.
    *     name: 'users/my-user/environments/my-environment',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "accessToken": "my_accessToken",
    *       //   "publicKeys": []
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "done": false,
    *   //   "error": {},
    *   //   "metadata": {},
    *   //   "name": "my_name",
    *   //   "response": {}
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
  def start(params: ParamsResourceUsersEnvironmentsStart, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def start(
    params: ParamsResourceUsersEnvironmentsStart,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
