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

@JSImport("googleapis/build/src/apis/admin/directory_v1", "admin_directory_v1.Resource$Asps")
@js.native
open class ResourceAsps protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def delete(): GaxiosPromise[Unit] = js.native
  def delete(callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceAspsDelete): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceAspsDelete, callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(
    params: ParamsResourceAspsDelete,
    options: BodyResponseCallback[Readable | Unit],
    callback: BodyResponseCallback[Readable | Unit]
  ): Unit = js.native
  def delete(params: ParamsResourceAspsDelete, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceAspsDelete, options: MethodOptions, callback: BodyResponseCallback[Unit]): Unit = js.native
  /**
    * Deletes an ASP issued by a user.
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
    *   const res = await directory.asps.delete({
    *     // The unique ID of the ASP to be deleted.
    *     codeId: 'placeholder-value',
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
  def delete(params: ParamsResourceAspsDelete, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def delete(
    params: ParamsResourceAspsDelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def get(): GaxiosPromise[SchemaAsp] = js.native
  def get(callback: BodyResponseCallback[SchemaAsp]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaAsp] = js.native
  def get(params: ParamsResourceAspsGet): GaxiosPromise[SchemaAsp] = js.native
  def get(params: ParamsResourceAspsGet, callback: BodyResponseCallback[SchemaAsp]): Unit = js.native
  def get(
    params: ParamsResourceAspsGet,
    options: BodyResponseCallback[Readable | SchemaAsp],
    callback: BodyResponseCallback[Readable | SchemaAsp]
  ): Unit = js.native
  def get(params: ParamsResourceAspsGet, options: MethodOptions): GaxiosPromise[SchemaAsp] = js.native
  def get(params: ParamsResourceAspsGet, options: MethodOptions, callback: BodyResponseCallback[SchemaAsp]): Unit = js.native
  /**
    * Gets information about an ASP issued by a user.
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
    *   const res = await directory.asps.get({
    *     // The unique ID of the ASP.
    *     codeId: 'placeholder-value',
    *     // Identifies the user in the API request. The value can be the user's primary email address, alias email address, or unique user ID.
    *     userKey: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "codeId": 0,
    *   //   "creationTime": "my_creationTime",
    *   //   "etag": "my_etag",
    *   //   "kind": "my_kind",
    *   //   "lastTimeUsed": "my_lastTimeUsed",
    *   //   "name": "my_name",
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
  def get(params: ParamsResourceAspsGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceAspsGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaAsps] = js.native
  def list(callback: BodyResponseCallback[SchemaAsps]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaAsps] = js.native
  def list(params: ParamsResourceAspsList): GaxiosPromise[SchemaAsps] = js.native
  def list(params: ParamsResourceAspsList, callback: BodyResponseCallback[SchemaAsps]): Unit = js.native
  def list(
    params: ParamsResourceAspsList,
    options: BodyResponseCallback[Readable | SchemaAsps],
    callback: BodyResponseCallback[Readable | SchemaAsps]
  ): Unit = js.native
  def list(params: ParamsResourceAspsList, options: MethodOptions): GaxiosPromise[SchemaAsps] = js.native
  def list(params: ParamsResourceAspsList, options: MethodOptions, callback: BodyResponseCallback[SchemaAsps]): Unit = js.native
  /**
    * Lists the ASPs issued by a user.
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
    *   const res = await directory.asps.list({
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
  def list(params: ParamsResourceAspsList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceAspsList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
