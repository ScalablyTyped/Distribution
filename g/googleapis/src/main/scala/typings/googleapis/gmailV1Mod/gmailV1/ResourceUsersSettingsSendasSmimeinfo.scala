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

@JSImport("googleapis/build/src/apis/gmail/v1", "gmail_v1.Resource$Users$Settings$Sendas$Smimeinfo")
@js.native
open class ResourceUsersSettingsSendasSmimeinfo protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def delete(): GaxiosPromise[Unit] = js.native
  def delete(callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceUsersSettingsSendasSmimeinfoDelete): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceUsersSettingsSendasSmimeinfoDelete, callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(
    params: ParamsResourceUsersSettingsSendasSmimeinfoDelete,
    options: BodyResponseCallback[Readable | Unit],
    callback: BodyResponseCallback[Readable | Unit]
  ): Unit = js.native
  def delete(params: ParamsResourceUsersSettingsSendasSmimeinfoDelete, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(
    params: ParamsResourceUsersSettingsSendasSmimeinfoDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  /**
    * Deletes the specified S/MIME config for the specified send-as alias.
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
    *   const res = await gmail.users.settings.sendAs.smimeInfo.delete({
    *     // The immutable ID for the SmimeInfo.
    *     id: 'placeholder-value',
    *     // The email address that appears in the "From:" header for mail sent using this alias.
    *     sendAsEmail: 'placeholder-value',
    *     // The user's email address. The special value `me` can be used to indicate the authenticated user.
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
  def delete(params: ParamsResourceUsersSettingsSendasSmimeinfoDelete, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def delete(
    params: ParamsResourceUsersSettingsSendasSmimeinfoDelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def get(): GaxiosPromise[SchemaSmimeInfo] = js.native
  def get(callback: BodyResponseCallback[SchemaSmimeInfo]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaSmimeInfo] = js.native
  def get(params: ParamsResourceUsersSettingsSendasSmimeinfoGet): GaxiosPromise[SchemaSmimeInfo] = js.native
  def get(
    params: ParamsResourceUsersSettingsSendasSmimeinfoGet,
    callback: BodyResponseCallback[SchemaSmimeInfo]
  ): Unit = js.native
  def get(
    params: ParamsResourceUsersSettingsSendasSmimeinfoGet,
    options: BodyResponseCallback[Readable | SchemaSmimeInfo],
    callback: BodyResponseCallback[Readable | SchemaSmimeInfo]
  ): Unit = js.native
  def get(params: ParamsResourceUsersSettingsSendasSmimeinfoGet, options: MethodOptions): GaxiosPromise[SchemaSmimeInfo] = js.native
  def get(
    params: ParamsResourceUsersSettingsSendasSmimeinfoGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaSmimeInfo]
  ): Unit = js.native
  /**
    * Gets the specified S/MIME config for the specified send-as alias.
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
    *       'https://www.googleapis.com/auth/gmail.settings.sharing',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await gmail.users.settings.sendAs.smimeInfo.get({
    *     // The immutable ID for the SmimeInfo.
    *     id: 'placeholder-value',
    *     // The email address that appears in the "From:" header for mail sent using this alias.
    *     sendAsEmail: 'placeholder-value',
    *     // The user's email address. The special value `me` can be used to indicate the authenticated user.
    *     userId: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "encryptedKeyPassword": "my_encryptedKeyPassword",
    *   //   "expiration": "my_expiration",
    *   //   "id": "my_id",
    *   //   "isDefault": false,
    *   //   "issuerCn": "my_issuerCn",
    *   //   "pem": "my_pem",
    *   //   "pkcs12": "my_pkcs12"
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
  def get(params: ParamsResourceUsersSettingsSendasSmimeinfoGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceUsersSettingsSendasSmimeinfoGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def insert(): GaxiosPromise[SchemaSmimeInfo] = js.native
  def insert(callback: BodyResponseCallback[SchemaSmimeInfo]): Unit = js.native
  def insert(params: Unit, options: MethodOptions): GaxiosPromise[SchemaSmimeInfo] = js.native
  def insert(params: ParamsResourceUsersSettingsSendasSmimeinfoInsert): GaxiosPromise[SchemaSmimeInfo] = js.native
  def insert(
    params: ParamsResourceUsersSettingsSendasSmimeinfoInsert,
    callback: BodyResponseCallback[SchemaSmimeInfo]
  ): Unit = js.native
  def insert(
    params: ParamsResourceUsersSettingsSendasSmimeinfoInsert,
    options: BodyResponseCallback[Readable | SchemaSmimeInfo],
    callback: BodyResponseCallback[Readable | SchemaSmimeInfo]
  ): Unit = js.native
  def insert(params: ParamsResourceUsersSettingsSendasSmimeinfoInsert, options: MethodOptions): GaxiosPromise[SchemaSmimeInfo] = js.native
  def insert(
    params: ParamsResourceUsersSettingsSendasSmimeinfoInsert,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaSmimeInfo]
  ): Unit = js.native
  /**
    * Insert (upload) the given S/MIME config for the specified send-as alias. Note that pkcs12 format is required for the key.
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
    *   const res = await gmail.users.settings.sendAs.smimeInfo.insert({
    *     // The email address that appears in the "From:" header for mail sent using this alias.
    *     sendAsEmail: 'placeholder-value',
    *     // The user's email address. The special value `me` can be used to indicate the authenticated user.
    *     userId: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "encryptedKeyPassword": "my_encryptedKeyPassword",
    *       //   "expiration": "my_expiration",
    *       //   "id": "my_id",
    *       //   "isDefault": false,
    *       //   "issuerCn": "my_issuerCn",
    *       //   "pem": "my_pem",
    *       //   "pkcs12": "my_pkcs12"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "encryptedKeyPassword": "my_encryptedKeyPassword",
    *   //   "expiration": "my_expiration",
    *   //   "id": "my_id",
    *   //   "isDefault": false,
    *   //   "issuerCn": "my_issuerCn",
    *   //   "pem": "my_pem",
    *   //   "pkcs12": "my_pkcs12"
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
  def insert(params: ParamsResourceUsersSettingsSendasSmimeinfoInsert, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def insert(
    params: ParamsResourceUsersSettingsSendasSmimeinfoInsert,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaListSmimeInfoResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListSmimeInfoResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListSmimeInfoResponse] = js.native
  def list(params: ParamsResourceUsersSettingsSendasSmimeinfoList): GaxiosPromise[SchemaListSmimeInfoResponse] = js.native
  def list(
    params: ParamsResourceUsersSettingsSendasSmimeinfoList,
    callback: BodyResponseCallback[SchemaListSmimeInfoResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceUsersSettingsSendasSmimeinfoList,
    options: BodyResponseCallback[Readable | SchemaListSmimeInfoResponse],
    callback: BodyResponseCallback[Readable | SchemaListSmimeInfoResponse]
  ): Unit = js.native
  def list(params: ParamsResourceUsersSettingsSendasSmimeinfoList, options: MethodOptions): GaxiosPromise[SchemaListSmimeInfoResponse] = js.native
  def list(
    params: ParamsResourceUsersSettingsSendasSmimeinfoList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListSmimeInfoResponse]
  ): Unit = js.native
  /**
    * Lists S/MIME configs for the specified send-as alias.
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
    *       'https://www.googleapis.com/auth/gmail.settings.sharing',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await gmail.users.settings.sendAs.smimeInfo.list({
    *     // The email address that appears in the "From:" header for mail sent using this alias.
    *     sendAsEmail: 'placeholder-value',
    *     // The user's email address. The special value `me` can be used to indicate the authenticated user.
    *     userId: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "smimeInfo": []
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
  def list(params: ParamsResourceUsersSettingsSendasSmimeinfoList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceUsersSettingsSendasSmimeinfoList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def setDefault(): GaxiosPromise[Unit] = js.native
  def setDefault(callback: BodyResponseCallback[Unit]): Unit = js.native
  def setDefault(params: Unit, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def setDefault(params: ParamsResourceUsersSettingsSendasSmimeinfoSetdefault): GaxiosPromise[Unit] = js.native
  def setDefault(params: ParamsResourceUsersSettingsSendasSmimeinfoSetdefault, callback: BodyResponseCallback[Unit]): Unit = js.native
  def setDefault(
    params: ParamsResourceUsersSettingsSendasSmimeinfoSetdefault,
    options: BodyResponseCallback[Readable | Unit],
    callback: BodyResponseCallback[Readable | Unit]
  ): Unit = js.native
  def setDefault(params: ParamsResourceUsersSettingsSendasSmimeinfoSetdefault, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def setDefault(
    params: ParamsResourceUsersSettingsSendasSmimeinfoSetdefault,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  /**
    * Sets the default S/MIME config for the specified send-as alias.
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
    *   const res = await gmail.users.settings.sendAs.smimeInfo.setDefault({
    *     // The immutable ID for the SmimeInfo.
    *     id: 'placeholder-value',
    *     // The email address that appears in the "From:" header for mail sent using this alias.
    *     sendAsEmail: 'placeholder-value',
    *     // The user's email address. The special value `me` can be used to indicate the authenticated user.
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
  def setDefault(params: ParamsResourceUsersSettingsSendasSmimeinfoSetdefault, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def setDefault(
    params: ParamsResourceUsersSettingsSendasSmimeinfoSetdefault,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
