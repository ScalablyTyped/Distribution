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

@JSImport("googleapis/build/src/apis/gmail/v1", "gmail_v1.Resource$Users$Settings$Sendas")
@js.native
open class ResourceUsersSettingsSendas protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def create(): GaxiosPromise[SchemaSendAs] = js.native
  def create(callback: BodyResponseCallback[SchemaSendAs]): Unit = js.native
  def create(params: Unit, options: MethodOptions): GaxiosPromise[SchemaSendAs] = js.native
  def create(params: ParamsResourceUsersSettingsSendasCreate): GaxiosPromise[SchemaSendAs] = js.native
  def create(params: ParamsResourceUsersSettingsSendasCreate, callback: BodyResponseCallback[SchemaSendAs]): Unit = js.native
  def create(
    params: ParamsResourceUsersSettingsSendasCreate,
    options: BodyResponseCallback[Readable | SchemaSendAs],
    callback: BodyResponseCallback[Readable | SchemaSendAs]
  ): Unit = js.native
  def create(params: ParamsResourceUsersSettingsSendasCreate, options: MethodOptions): GaxiosPromise[SchemaSendAs] = js.native
  def create(
    params: ParamsResourceUsersSettingsSendasCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaSendAs]
  ): Unit = js.native
  /**
    * Creates a custom "from" send-as alias. If an SMTP MSA is specified, Gmail will attempt to connect to the SMTP service to validate the configuration before creating the alias. If ownership verification is required for the alias, a message will be sent to the email address and the resource's verification status will be set to `pending`; otherwise, the resource will be created with verification status set to `accepted`. If a signature is provided, Gmail will sanitize the HTML before saving it with the alias. This method is only available to service account clients that have been delegated domain-wide authority.
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
    *   const res = await gmail.users.settings.sendAs.create({
    *     // User's email address. The special value "me" can be used to indicate the authenticated user.
    *     userId: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "displayName": "my_displayName",
    *       //   "isDefault": false,
    *       //   "isPrimary": false,
    *       //   "replyToAddress": "my_replyToAddress",
    *       //   "sendAsEmail": "my_sendAsEmail",
    *       //   "signature": "my_signature",
    *       //   "smtpMsa": {},
    *       //   "treatAsAlias": false,
    *       //   "verificationStatus": "my_verificationStatus"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "displayName": "my_displayName",
    *   //   "isDefault": false,
    *   //   "isPrimary": false,
    *   //   "replyToAddress": "my_replyToAddress",
    *   //   "sendAsEmail": "my_sendAsEmail",
    *   //   "signature": "my_signature",
    *   //   "smtpMsa": {},
    *   //   "treatAsAlias": false,
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
  def create(params: ParamsResourceUsersSettingsSendasCreate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def create(
    params: ParamsResourceUsersSettingsSendasCreate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def delete(): GaxiosPromise[Unit] = js.native
  def delete(callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceUsersSettingsSendasDelete): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceUsersSettingsSendasDelete, callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(
    params: ParamsResourceUsersSettingsSendasDelete,
    options: BodyResponseCallback[Readable | Unit],
    callback: BodyResponseCallback[Readable | Unit]
  ): Unit = js.native
  def delete(params: ParamsResourceUsersSettingsSendasDelete, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(
    params: ParamsResourceUsersSettingsSendasDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  /**
    * Deletes the specified send-as alias. Revokes any verification that may have been required for using it. This method is only available to service account clients that have been delegated domain-wide authority.
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
    *   const res = await gmail.users.settings.sendAs.delete({
    *     // The send-as alias to be deleted.
    *     sendAsEmail: 'placeholder-value',
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
  def delete(params: ParamsResourceUsersSettingsSendasDelete, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def delete(
    params: ParamsResourceUsersSettingsSendasDelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def get(): GaxiosPromise[SchemaSendAs] = js.native
  def get(callback: BodyResponseCallback[SchemaSendAs]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaSendAs] = js.native
  def get(params: ParamsResourceUsersSettingsSendasGet): GaxiosPromise[SchemaSendAs] = js.native
  def get(params: ParamsResourceUsersSettingsSendasGet, callback: BodyResponseCallback[SchemaSendAs]): Unit = js.native
  def get(
    params: ParamsResourceUsersSettingsSendasGet,
    options: BodyResponseCallback[Readable | SchemaSendAs],
    callback: BodyResponseCallback[Readable | SchemaSendAs]
  ): Unit = js.native
  def get(params: ParamsResourceUsersSettingsSendasGet, options: MethodOptions): GaxiosPromise[SchemaSendAs] = js.native
  def get(
    params: ParamsResourceUsersSettingsSendasGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaSendAs]
  ): Unit = js.native
  /**
    * Gets the specified send-as alias. Fails with an HTTP 404 error if the specified address is not a member of the collection.
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
    *   const res = await gmail.users.settings.sendAs.get({
    *     // The send-as alias to be retrieved.
    *     sendAsEmail: 'placeholder-value',
    *     // User's email address. The special value "me" can be used to indicate the authenticated user.
    *     userId: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "displayName": "my_displayName",
    *   //   "isDefault": false,
    *   //   "isPrimary": false,
    *   //   "replyToAddress": "my_replyToAddress",
    *   //   "sendAsEmail": "my_sendAsEmail",
    *   //   "signature": "my_signature",
    *   //   "smtpMsa": {},
    *   //   "treatAsAlias": false,
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
  def get(params: ParamsResourceUsersSettingsSendasGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceUsersSettingsSendasGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaListSendAsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListSendAsResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListSendAsResponse] = js.native
  def list(params: ParamsResourceUsersSettingsSendasList): GaxiosPromise[SchemaListSendAsResponse] = js.native
  def list(
    params: ParamsResourceUsersSettingsSendasList,
    callback: BodyResponseCallback[SchemaListSendAsResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceUsersSettingsSendasList,
    options: BodyResponseCallback[Readable | SchemaListSendAsResponse],
    callback: BodyResponseCallback[Readable | SchemaListSendAsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceUsersSettingsSendasList, options: MethodOptions): GaxiosPromise[SchemaListSendAsResponse] = js.native
  def list(
    params: ParamsResourceUsersSettingsSendasList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListSendAsResponse]
  ): Unit = js.native
  /**
    * Lists the send-as aliases for the specified account. The result includes the primary send-as address associated with the account as well as any custom "from" aliases.
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
    *   const res = await gmail.users.settings.sendAs.list({
    *     // User's email address. The special value "me" can be used to indicate the authenticated user.
    *     userId: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "sendAs": []
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
  def list(params: ParamsResourceUsersSettingsSendasList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceUsersSettingsSendasList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def patch(): GaxiosPromise[SchemaSendAs] = js.native
  def patch(callback: BodyResponseCallback[SchemaSendAs]): Unit = js.native
  def patch(params: Unit, options: MethodOptions): GaxiosPromise[SchemaSendAs] = js.native
  def patch(params: ParamsResourceUsersSettingsSendasPatch): GaxiosPromise[SchemaSendAs] = js.native
  def patch(params: ParamsResourceUsersSettingsSendasPatch, callback: BodyResponseCallback[SchemaSendAs]): Unit = js.native
  def patch(
    params: ParamsResourceUsersSettingsSendasPatch,
    options: BodyResponseCallback[Readable | SchemaSendAs],
    callback: BodyResponseCallback[Readable | SchemaSendAs]
  ): Unit = js.native
  def patch(params: ParamsResourceUsersSettingsSendasPatch, options: MethodOptions): GaxiosPromise[SchemaSendAs] = js.native
  def patch(
    params: ParamsResourceUsersSettingsSendasPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaSendAs]
  ): Unit = js.native
  /**
    * Patch the specified send-as alias.
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
    *       'https://www.googleapis.com/auth/gmail.settings.basic',
    *       'https://www.googleapis.com/auth/gmail.settings.sharing',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await gmail.users.settings.sendAs.patch({
    *     // The send-as alias to be updated.
    *     sendAsEmail: 'placeholder-value',
    *     // User's email address. The special value "me" can be used to indicate the authenticated user.
    *     userId: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "displayName": "my_displayName",
    *       //   "isDefault": false,
    *       //   "isPrimary": false,
    *       //   "replyToAddress": "my_replyToAddress",
    *       //   "sendAsEmail": "my_sendAsEmail",
    *       //   "signature": "my_signature",
    *       //   "smtpMsa": {},
    *       //   "treatAsAlias": false,
    *       //   "verificationStatus": "my_verificationStatus"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "displayName": "my_displayName",
    *   //   "isDefault": false,
    *   //   "isPrimary": false,
    *   //   "replyToAddress": "my_replyToAddress",
    *   //   "sendAsEmail": "my_sendAsEmail",
    *   //   "signature": "my_signature",
    *   //   "smtpMsa": {},
    *   //   "treatAsAlias": false,
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
  def patch(params: ParamsResourceUsersSettingsSendasPatch, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def patch(
    params: ParamsResourceUsersSettingsSendasPatch,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  var smimeInfo: ResourceUsersSettingsSendasSmimeinfo = js.native
  
  def update(): GaxiosPromise[SchemaSendAs] = js.native
  def update(callback: BodyResponseCallback[SchemaSendAs]): Unit = js.native
  def update(params: Unit, options: MethodOptions): GaxiosPromise[SchemaSendAs] = js.native
  def update(params: ParamsResourceUsersSettingsSendasUpdate): GaxiosPromise[SchemaSendAs] = js.native
  def update(params: ParamsResourceUsersSettingsSendasUpdate, callback: BodyResponseCallback[SchemaSendAs]): Unit = js.native
  def update(
    params: ParamsResourceUsersSettingsSendasUpdate,
    options: BodyResponseCallback[Readable | SchemaSendAs],
    callback: BodyResponseCallback[Readable | SchemaSendAs]
  ): Unit = js.native
  def update(params: ParamsResourceUsersSettingsSendasUpdate, options: MethodOptions): GaxiosPromise[SchemaSendAs] = js.native
  def update(
    params: ParamsResourceUsersSettingsSendasUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaSendAs]
  ): Unit = js.native
  /**
    * Updates a send-as alias. If a signature is provided, Gmail will sanitize the HTML before saving it with the alias. Addresses other than the primary address for the account can only be updated by service account clients that have been delegated domain-wide authority.
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
    *       'https://www.googleapis.com/auth/gmail.settings.basic',
    *       'https://www.googleapis.com/auth/gmail.settings.sharing',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await gmail.users.settings.sendAs.update({
    *     // The send-as alias to be updated.
    *     sendAsEmail: 'placeholder-value',
    *     // User's email address. The special value "me" can be used to indicate the authenticated user.
    *     userId: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "displayName": "my_displayName",
    *       //   "isDefault": false,
    *       //   "isPrimary": false,
    *       //   "replyToAddress": "my_replyToAddress",
    *       //   "sendAsEmail": "my_sendAsEmail",
    *       //   "signature": "my_signature",
    *       //   "smtpMsa": {},
    *       //   "treatAsAlias": false,
    *       //   "verificationStatus": "my_verificationStatus"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "displayName": "my_displayName",
    *   //   "isDefault": false,
    *   //   "isPrimary": false,
    *   //   "replyToAddress": "my_replyToAddress",
    *   //   "sendAsEmail": "my_sendAsEmail",
    *   //   "signature": "my_signature",
    *   //   "smtpMsa": {},
    *   //   "treatAsAlias": false,
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
  def update(params: ParamsResourceUsersSettingsSendasUpdate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def update(
    params: ParamsResourceUsersSettingsSendasUpdate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def verify(): GaxiosPromise[Unit] = js.native
  def verify(callback: BodyResponseCallback[Unit]): Unit = js.native
  def verify(params: Unit, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def verify(params: ParamsResourceUsersSettingsSendasVerify): GaxiosPromise[Unit] = js.native
  def verify(params: ParamsResourceUsersSettingsSendasVerify, callback: BodyResponseCallback[Unit]): Unit = js.native
  def verify(
    params: ParamsResourceUsersSettingsSendasVerify,
    options: BodyResponseCallback[Readable | Unit],
    callback: BodyResponseCallback[Readable | Unit]
  ): Unit = js.native
  def verify(params: ParamsResourceUsersSettingsSendasVerify, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def verify(
    params: ParamsResourceUsersSettingsSendasVerify,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  /**
    * Sends a verification email to the specified send-as alias address. The verification status must be `pending`. This method is only available to service account clients that have been delegated domain-wide authority.
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
    *   const res = await gmail.users.settings.sendAs.verify({
    *     // The send-as alias to be verified.
    *     sendAsEmail: 'placeholder-value',
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
  def verify(params: ParamsResourceUsersSettingsSendasVerify, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def verify(
    params: ParamsResourceUsersSettingsSendasVerify,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
