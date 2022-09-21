package typings.googleapis.osloginV1alphaMod.osloginV1alpha

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/oslogin/v1alpha", "oslogin_v1alpha.Resource$Users$Sshpublickeys")
@js.native
open class ResourceUsersSshpublickeys protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def create(): GaxiosPromise[SchemaSshPublicKey] = js.native
  def create(callback: BodyResponseCallback[SchemaSshPublicKey]): Unit = js.native
  def create(params: Unit, options: MethodOptions): GaxiosPromise[SchemaSshPublicKey] = js.native
  def create(params: ParamsResourceUsersSshpublickeysCreate): GaxiosPromise[SchemaSshPublicKey] = js.native
  def create(params: ParamsResourceUsersSshpublickeysCreate, callback: BodyResponseCallback[SchemaSshPublicKey]): Unit = js.native
  def create(
    params: ParamsResourceUsersSshpublickeysCreate,
    options: BodyResponseCallback[Readable | SchemaSshPublicKey],
    callback: BodyResponseCallback[Readable | SchemaSshPublicKey]
  ): Unit = js.native
  def create(params: ParamsResourceUsersSshpublickeysCreate, options: MethodOptions): GaxiosPromise[SchemaSshPublicKey] = js.native
  def create(
    params: ParamsResourceUsersSshpublickeysCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaSshPublicKey]
  ): Unit = js.native
  /**
    * Create an SSH public key
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/oslogin.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const oslogin = google.oslogin('v1alpha');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/cloud-platform',
    *       'https://www.googleapis.com/auth/compute',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await oslogin.users.sshPublicKeys.create({
    *     // Required. The unique ID for the user in format `users/{user\}`.
    *     parent: 'users/my-user',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "expirationTimeUsec": "my_expirationTimeUsec",
    *       //   "fingerprint": "my_fingerprint",
    *       //   "key": "my_key",
    *       //   "name": "my_name"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "expirationTimeUsec": "my_expirationTimeUsec",
    *   //   "fingerprint": "my_fingerprint",
    *   //   "key": "my_key",
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
  def create(params: ParamsResourceUsersSshpublickeysCreate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def create(
    params: ParamsResourceUsersSshpublickeysCreate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def delete(): GaxiosPromise[SchemaEmpty] = js.native
  def delete(callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def delete(params: ParamsResourceUsersSshpublickeysDelete): GaxiosPromise[SchemaEmpty] = js.native
  def delete(params: ParamsResourceUsersSshpublickeysDelete, callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def delete(
    params: ParamsResourceUsersSshpublickeysDelete,
    options: BodyResponseCallback[Readable | SchemaEmpty],
    callback: BodyResponseCallback[Readable | SchemaEmpty]
  ): Unit = js.native
  def delete(params: ParamsResourceUsersSshpublickeysDelete, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def delete(
    params: ParamsResourceUsersSshpublickeysDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  /**
    * Deletes an SSH public key.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/oslogin.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const oslogin = google.oslogin('v1alpha');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/cloud-platform',
    *       'https://www.googleapis.com/auth/compute',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await oslogin.users.sshPublicKeys.delete({
    *     // Required. The fingerprint of the public key to update. Public keys are identified by their SHA-256 fingerprint. The fingerprint of the public key is in format `users/{user\}/sshPublicKeys/{fingerprint\}`.
    *     name: 'users/my-user/sshPublicKeys/my-sshPublicKey',
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
  def delete(params: ParamsResourceUsersSshpublickeysDelete, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def delete(
    params: ParamsResourceUsersSshpublickeysDelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def get(): GaxiosPromise[SchemaSshPublicKey] = js.native
  def get(callback: BodyResponseCallback[SchemaSshPublicKey]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaSshPublicKey] = js.native
  def get(params: ParamsResourceUsersSshpublickeysGet): GaxiosPromise[SchemaSshPublicKey] = js.native
  def get(params: ParamsResourceUsersSshpublickeysGet, callback: BodyResponseCallback[SchemaSshPublicKey]): Unit = js.native
  def get(
    params: ParamsResourceUsersSshpublickeysGet,
    options: BodyResponseCallback[Readable | SchemaSshPublicKey],
    callback: BodyResponseCallback[Readable | SchemaSshPublicKey]
  ): Unit = js.native
  def get(params: ParamsResourceUsersSshpublickeysGet, options: MethodOptions): GaxiosPromise[SchemaSshPublicKey] = js.native
  def get(
    params: ParamsResourceUsersSshpublickeysGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaSshPublicKey]
  ): Unit = js.native
  /**
    * Retrieves an SSH public key.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/oslogin.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const oslogin = google.oslogin('v1alpha');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/cloud-platform',
    *       'https://www.googleapis.com/auth/compute',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await oslogin.users.sshPublicKeys.get({
    *     // Required. The fingerprint of the public key to retrieve. Public keys are identified by their SHA-256 fingerprint. The fingerprint of the public key is in format `users/{user\}/sshPublicKeys/{fingerprint\}`.
    *     name: 'users/my-user/sshPublicKeys/my-sshPublicKey',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "expirationTimeUsec": "my_expirationTimeUsec",
    *   //   "fingerprint": "my_fingerprint",
    *   //   "key": "my_key",
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
  def get(params: ParamsResourceUsersSshpublickeysGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceUsersSshpublickeysGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def patch(): GaxiosPromise[SchemaSshPublicKey] = js.native
  def patch(callback: BodyResponseCallback[SchemaSshPublicKey]): Unit = js.native
  def patch(params: Unit, options: MethodOptions): GaxiosPromise[SchemaSshPublicKey] = js.native
  def patch(params: ParamsResourceUsersSshpublickeysPatch): GaxiosPromise[SchemaSshPublicKey] = js.native
  def patch(params: ParamsResourceUsersSshpublickeysPatch, callback: BodyResponseCallback[SchemaSshPublicKey]): Unit = js.native
  def patch(
    params: ParamsResourceUsersSshpublickeysPatch,
    options: BodyResponseCallback[Readable | SchemaSshPublicKey],
    callback: BodyResponseCallback[Readable | SchemaSshPublicKey]
  ): Unit = js.native
  def patch(params: ParamsResourceUsersSshpublickeysPatch, options: MethodOptions): GaxiosPromise[SchemaSshPublicKey] = js.native
  def patch(
    params: ParamsResourceUsersSshpublickeysPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaSshPublicKey]
  ): Unit = js.native
  /**
    * Updates an SSH public key and returns the profile information. This method supports patch semantics.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/oslogin.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const oslogin = google.oslogin('v1alpha');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/cloud-platform',
    *       'https://www.googleapis.com/auth/compute',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await oslogin.users.sshPublicKeys.patch({
    *     // Required. The fingerprint of the public key to update. Public keys are identified by their SHA-256 fingerprint. The fingerprint of the public key is in format `users/{user\}/sshPublicKeys/{fingerprint\}`.
    *     name: 'users/my-user/sshPublicKeys/my-sshPublicKey',
    *     // Mask to control which fields get updated. Updates all if not present.
    *     updateMask: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "expirationTimeUsec": "my_expirationTimeUsec",
    *       //   "fingerprint": "my_fingerprint",
    *       //   "key": "my_key",
    *       //   "name": "my_name"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "expirationTimeUsec": "my_expirationTimeUsec",
    *   //   "fingerprint": "my_fingerprint",
    *   //   "key": "my_key",
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
  def patch(params: ParamsResourceUsersSshpublickeysPatch, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def patch(
    params: ParamsResourceUsersSshpublickeysPatch,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
