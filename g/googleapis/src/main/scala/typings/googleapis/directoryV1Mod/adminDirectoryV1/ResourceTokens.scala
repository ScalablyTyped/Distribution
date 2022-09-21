package typings.googleapis.directoryV1Mod.adminDirectoryV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/admin/directory_v1", "admin_directory_v1.Resource$Tokens")
@js.native
open class ResourceTokens protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def delete(): GaxiosPromise[Unit] = js.native
  def delete(callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceTokensDelete): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceTokensDelete, callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(
    params: ParamsResourceTokensDelete,
    options: BodyResponseCallback[Readable | Unit],
    callback: BodyResponseCallback[Readable | Unit]
  ): Unit = js.native
  def delete(params: ParamsResourceTokensDelete, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceTokensDelete, options: MethodOptions, callback: BodyResponseCallback[Unit]): Unit = js.native
  /**
    * Deletes all access tokens issued by a user for an application.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/admin.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const admin = google.admin('directory_v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/admin.directory.user.security'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await directory.tokens.delete({
    *     // The Client ID of the application the token is issued to.
    *     clientId: 'placeholder-value',
    *     // Identifies the user in the API request. The value can be the user's primary email address, alias email address, or unique user ID.
    *     userKey: 'placeholder-value',
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
  def delete(params: ParamsResourceTokensDelete, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def delete(
    params: ParamsResourceTokensDelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def get(): GaxiosPromise[SchemaToken] = js.native
  def get(callback: BodyResponseCallback[SchemaToken]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaToken] = js.native
  def get(params: ParamsResourceTokensGet): GaxiosPromise[SchemaToken] = js.native
  def get(params: ParamsResourceTokensGet, callback: BodyResponseCallback[SchemaToken]): Unit = js.native
  def get(
    params: ParamsResourceTokensGet,
    options: BodyResponseCallback[Readable | SchemaToken],
    callback: BodyResponseCallback[Readable | SchemaToken]
  ): Unit = js.native
  def get(params: ParamsResourceTokensGet, options: MethodOptions): GaxiosPromise[SchemaToken] = js.native
  def get(
    params: ParamsResourceTokensGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaToken]
  ): Unit = js.native
  /**
    * Gets information about an access token issued by a user.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/admin.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const admin = google.admin('directory_v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/admin.directory.user.security'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await directory.tokens.get({
    *     // The Client ID of the application the token is issued to.
    *     clientId: 'placeholder-value',
    *     // Identifies the user in the API request. The value can be the user's primary email address, alias email address, or unique user ID.
    *     userKey: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "anonymous": false,
    *   //   "clientId": "my_clientId",
    *   //   "displayText": "my_displayText",
    *   //   "etag": "my_etag",
    *   //   "kind": "my_kind",
    *   //   "nativeApp": false,
    *   //   "scopes": [],
    *   //   "userKey": "my_userKey"
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
  def get(params: ParamsResourceTokensGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceTokensGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaTokens] = js.native
  def list(callback: BodyResponseCallback[SchemaTokens]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaTokens] = js.native
  def list(params: ParamsResourceTokensList): GaxiosPromise[SchemaTokens] = js.native
  def list(params: ParamsResourceTokensList, callback: BodyResponseCallback[SchemaTokens]): Unit = js.native
  def list(
    params: ParamsResourceTokensList,
    options: BodyResponseCallback[Readable | SchemaTokens],
    callback: BodyResponseCallback[Readable | SchemaTokens]
  ): Unit = js.native
  def list(params: ParamsResourceTokensList, options: MethodOptions): GaxiosPromise[SchemaTokens] = js.native
  def list(
    params: ParamsResourceTokensList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaTokens]
  ): Unit = js.native
  /**
    * Returns the set of tokens specified user has issued to 3rd party applications.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/admin.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const admin = google.admin('directory_v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/admin.directory.user.security'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await directory.tokens.list({
    *     // Identifies the user in the API request. The value can be the user's primary email address, alias email address, or unique user ID.
    *     userKey: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "etag": "my_etag",
    *   //   "items": [],
    *   //   "kind": "my_kind"
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
  def list(params: ParamsResourceTokensList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceTokensList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
