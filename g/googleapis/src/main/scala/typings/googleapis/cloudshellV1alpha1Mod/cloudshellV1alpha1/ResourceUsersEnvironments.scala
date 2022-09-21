package typings.googleapis.cloudshellV1alpha1Mod.cloudshellV1alpha1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/cloudshell/v1alpha1", "cloudshell_v1alpha1.Resource$Users$Environments")
@js.native
open class ResourceUsersEnvironments protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  def authorize(): GaxiosPromise[SchemaEmpty] = js.native
  def authorize(callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def authorize(params: Unit, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def authorize(params: ParamsResourceUsersEnvironmentsAuthorize): GaxiosPromise[SchemaEmpty] = js.native
  def authorize(params: ParamsResourceUsersEnvironmentsAuthorize, callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def authorize(
    params: ParamsResourceUsersEnvironmentsAuthorize,
    options: BodyResponseCallback[Readable | SchemaEmpty],
    callback: BodyResponseCallback[Readable | SchemaEmpty]
  ): Unit = js.native
  def authorize(params: ParamsResourceUsersEnvironmentsAuthorize, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def authorize(
    params: ParamsResourceUsersEnvironmentsAuthorize,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEmpty]
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
    * const cloudshell = google.cloudshell('v1alpha1');
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
    *   // {}
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
    * const cloudshell = google.cloudshell('v1alpha1');
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
    *     // Name of the requested resource, for example `users/me/environments/default` or `users/someone@example.com/environments/default`.
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
    *   //   "size": "my_size",
    *   //   "sshHost": "my_sshHost",
    *   //   "sshPort": 0,
    *   //   "sshUsername": "my_sshUsername",
    *   //   "state": "my_state",
    *   //   "vmSizeExpireTime": "my_vmSizeExpireTime",
    *   //   "webHost": "my_webHost",
    *   //   "webPorts": []
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
  
  def patch(): GaxiosPromise[SchemaEnvironment] = js.native
  def patch(callback: BodyResponseCallback[SchemaEnvironment]): Unit = js.native
  def patch(params: Unit, options: MethodOptions): GaxiosPromise[SchemaEnvironment] = js.native
  def patch(params: ParamsResourceUsersEnvironmentsPatch): GaxiosPromise[SchemaEnvironment] = js.native
  def patch(params: ParamsResourceUsersEnvironmentsPatch, callback: BodyResponseCallback[SchemaEnvironment]): Unit = js.native
  def patch(
    params: ParamsResourceUsersEnvironmentsPatch,
    options: BodyResponseCallback[Readable | SchemaEnvironment],
    callback: BodyResponseCallback[Readable | SchemaEnvironment]
  ): Unit = js.native
  def patch(params: ParamsResourceUsersEnvironmentsPatch, options: MethodOptions): GaxiosPromise[SchemaEnvironment] = js.native
  def patch(
    params: ParamsResourceUsersEnvironmentsPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEnvironment]
  ): Unit = js.native
  /**
    * Updates an existing environment.
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
    * const cloudshell = google.cloudshell('v1alpha1');
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
    *   const res = await cloudshell.users.environments.patch({
    *     // Name of the resource to be updated, for example `users/me/environments/default` or `users/someone@example.com/environments/default`.
    *     name: 'users/my-user/environments/my-environment',
    *     // Mask specifying which fields in the environment should be updated.
    *     updateMask: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "dockerImage": "my_dockerImage",
    *       //   "id": "my_id",
    *       //   "name": "my_name",
    *       //   "publicKeys": [],
    *       //   "size": "my_size",
    *       //   "sshHost": "my_sshHost",
    *       //   "sshPort": 0,
    *       //   "sshUsername": "my_sshUsername",
    *       //   "state": "my_state",
    *       //   "vmSizeExpireTime": "my_vmSizeExpireTime",
    *       //   "webHost": "my_webHost",
    *       //   "webPorts": []
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "dockerImage": "my_dockerImage",
    *   //   "id": "my_id",
    *   //   "name": "my_name",
    *   //   "publicKeys": [],
    *   //   "size": "my_size",
    *   //   "sshHost": "my_sshHost",
    *   //   "sshPort": 0,
    *   //   "sshUsername": "my_sshUsername",
    *   //   "state": "my_state",
    *   //   "vmSizeExpireTime": "my_vmSizeExpireTime",
    *   //   "webHost": "my_webHost",
    *   //   "webPorts": []
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
  def patch(params: ParamsResourceUsersEnvironmentsPatch, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def patch(
    params: ParamsResourceUsersEnvironmentsPatch,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  var publicKeys: ResourceUsersEnvironmentsPublickeys = js.native
  
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
    * const cloudshell = google.cloudshell('v1alpha1');
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
