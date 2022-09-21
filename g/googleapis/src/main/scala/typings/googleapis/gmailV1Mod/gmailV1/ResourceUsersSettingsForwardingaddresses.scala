package typings.googleapis.gmailV1Mod.gmailV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/gmail/v1", "gmail_v1.Resource$Users$Settings$Forwardingaddresses")
@js.native
open class ResourceUsersSettingsForwardingaddresses protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def create(): GaxiosPromise[SchemaForwardingAddress] = js.native
  def create(callback: BodyResponseCallback[SchemaForwardingAddress]): Unit = js.native
  def create(params: Unit, options: MethodOptions): GaxiosPromise[SchemaForwardingAddress] = js.native
  def create(params: ParamsResourceUsersSettingsForwardingaddressesCreate): GaxiosPromise[SchemaForwardingAddress] = js.native
  def create(
    params: ParamsResourceUsersSettingsForwardingaddressesCreate,
    callback: BodyResponseCallback[SchemaForwardingAddress]
  ): Unit = js.native
  def create(
    params: ParamsResourceUsersSettingsForwardingaddressesCreate,
    options: BodyResponseCallback[Readable | SchemaForwardingAddress],
    callback: BodyResponseCallback[Readable | SchemaForwardingAddress]
  ): Unit = js.native
  def create(params: ParamsResourceUsersSettingsForwardingaddressesCreate, options: MethodOptions): GaxiosPromise[SchemaForwardingAddress] = js.native
  def create(
    params: ParamsResourceUsersSettingsForwardingaddressesCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaForwardingAddress]
  ): Unit = js.native
  /**
    * Creates a forwarding address. If ownership verification is required, a message will be sent to the recipient and the resource's verification status will be set to `pending`; otherwise, the resource will be created with verification status set to `accepted`. This method is only available to service account clients that have been delegated domain-wide authority.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/gmail.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const gmail = google.gmail('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/gmail.settings.sharing'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await gmail.users.settings.forwardingAddresses.create({
    *     // User's email address. The special value "me" can be used to indicate the authenticated user.
    *     userId: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "forwardingEmail": "my_forwardingEmail",
    *       //   "verificationStatus": "my_verificationStatus"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "forwardingEmail": "my_forwardingEmail",
    *   //   "verificationStatus": "my_verificationStatus"
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
  def create(params: ParamsResourceUsersSettingsForwardingaddressesCreate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def create(
    params: ParamsResourceUsersSettingsForwardingaddressesCreate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def delete(): GaxiosPromise[Unit] = js.native
  def delete(callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceUsersSettingsForwardingaddressesDelete): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceUsersSettingsForwardingaddressesDelete, callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(
    params: ParamsResourceUsersSettingsForwardingaddressesDelete,
    options: BodyResponseCallback[Readable | Unit],
    callback: BodyResponseCallback[Readable | Unit]
  ): Unit = js.native
  def delete(params: ParamsResourceUsersSettingsForwardingaddressesDelete, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(
    params: ParamsResourceUsersSettingsForwardingaddressesDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  /**
    * Deletes the specified forwarding address and revokes any verification that may have been required. This method is only available to service account clients that have been delegated domain-wide authority.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/gmail.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const gmail = google.gmail('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/gmail.settings.sharing'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await gmail.users.settings.forwardingAddresses.delete({
    *     // The forwarding address to be deleted.
    *     forwardingEmail: 'placeholder-value',
    *     // User's email address. The special value "me" can be used to indicate the authenticated user.
    *     userId: 'placeholder-value',
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
  def delete(params: ParamsResourceUsersSettingsForwardingaddressesDelete, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def delete(
    params: ParamsResourceUsersSettingsForwardingaddressesDelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def get(): GaxiosPromise[SchemaForwardingAddress] = js.native
  def get(callback: BodyResponseCallback[SchemaForwardingAddress]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaForwardingAddress] = js.native
  def get(params: ParamsResourceUsersSettingsForwardingaddressesGet): GaxiosPromise[SchemaForwardingAddress] = js.native
  def get(
    params: ParamsResourceUsersSettingsForwardingaddressesGet,
    callback: BodyResponseCallback[SchemaForwardingAddress]
  ): Unit = js.native
  def get(
    params: ParamsResourceUsersSettingsForwardingaddressesGet,
    options: BodyResponseCallback[Readable | SchemaForwardingAddress],
    callback: BodyResponseCallback[Readable | SchemaForwardingAddress]
  ): Unit = js.native
  def get(params: ParamsResourceUsersSettingsForwardingaddressesGet, options: MethodOptions): GaxiosPromise[SchemaForwardingAddress] = js.native
  def get(
    params: ParamsResourceUsersSettingsForwardingaddressesGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaForwardingAddress]
  ): Unit = js.native
  /**
    * Gets the specified forwarding address.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/gmail.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const gmail = google.gmail('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://mail.google.com/',
    *       'https://www.googleapis.com/auth/gmail.modify',
    *       'https://www.googleapis.com/auth/gmail.readonly',
    *       'https://www.googleapis.com/auth/gmail.settings.basic',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await gmail.users.settings.forwardingAddresses.get({
    *     // The forwarding address to be retrieved.
    *     forwardingEmail: 'placeholder-value',
    *     // User's email address. The special value "me" can be used to indicate the authenticated user.
    *     userId: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "forwardingEmail": "my_forwardingEmail",
    *   //   "verificationStatus": "my_verificationStatus"
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
  def get(params: ParamsResourceUsersSettingsForwardingaddressesGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceUsersSettingsForwardingaddressesGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaListForwardingAddressesResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListForwardingAddressesResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListForwardingAddressesResponse] = js.native
  def list(params: ParamsResourceUsersSettingsForwardingaddressesList): GaxiosPromise[SchemaListForwardingAddressesResponse] = js.native
  def list(
    params: ParamsResourceUsersSettingsForwardingaddressesList,
    callback: BodyResponseCallback[SchemaListForwardingAddressesResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceUsersSettingsForwardingaddressesList,
    options: BodyResponseCallback[Readable | SchemaListForwardingAddressesResponse],
    callback: BodyResponseCallback[Readable | SchemaListForwardingAddressesResponse]
  ): Unit = js.native
  def list(params: ParamsResourceUsersSettingsForwardingaddressesList, options: MethodOptions): GaxiosPromise[SchemaListForwardingAddressesResponse] = js.native
  def list(
    params: ParamsResourceUsersSettingsForwardingaddressesList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListForwardingAddressesResponse]
  ): Unit = js.native
  /**
    * Lists the forwarding addresses for the specified account.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/gmail.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const gmail = google.gmail('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://mail.google.com/',
    *       'https://www.googleapis.com/auth/gmail.modify',
    *       'https://www.googleapis.com/auth/gmail.readonly',
    *       'https://www.googleapis.com/auth/gmail.settings.basic',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await gmail.users.settings.forwardingAddresses.list({
    *     // User's email address. The special value "me" can be used to indicate the authenticated user.
    *     userId: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "forwardingAddresses": []
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
  def list(params: ParamsResourceUsersSettingsForwardingaddressesList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceUsersSettingsForwardingaddressesList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
