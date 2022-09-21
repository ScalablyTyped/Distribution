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

@JSImport("googleapis/build/src/apis/admin/directory_v1", "admin_directory_v1.Resource$Verificationcodes")
@js.native
open class ResourceVerificationcodes protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def generate(): GaxiosPromise[Unit] = js.native
  def generate(callback: BodyResponseCallback[Unit]): Unit = js.native
  def generate(params: Unit, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def generate(params: ParamsResourceVerificationcodesGenerate): GaxiosPromise[Unit] = js.native
  def generate(params: ParamsResourceVerificationcodesGenerate, callback: BodyResponseCallback[Unit]): Unit = js.native
  def generate(
    params: ParamsResourceVerificationcodesGenerate,
    options: BodyResponseCallback[Readable | Unit],
    callback: BodyResponseCallback[Readable | Unit]
  ): Unit = js.native
  def generate(params: ParamsResourceVerificationcodesGenerate, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def generate(
    params: ParamsResourceVerificationcodesGenerate,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  /**
    * Generates new backup verification codes for the user.
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
    *   const res = await directory.verificationCodes.generate({
    *     // Email or immutable ID of the user
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
  def generate(params: ParamsResourceVerificationcodesGenerate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def generate(
    params: ParamsResourceVerificationcodesGenerate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def invalidate(): GaxiosPromise[Unit] = js.native
  def invalidate(callback: BodyResponseCallback[Unit]): Unit = js.native
  def invalidate(params: Unit, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def invalidate(params: ParamsResourceVerificationcodesInvalidate): GaxiosPromise[Unit] = js.native
  def invalidate(params: ParamsResourceVerificationcodesInvalidate, callback: BodyResponseCallback[Unit]): Unit = js.native
  def invalidate(
    params: ParamsResourceVerificationcodesInvalidate,
    options: BodyResponseCallback[Readable | Unit],
    callback: BodyResponseCallback[Readable | Unit]
  ): Unit = js.native
  def invalidate(params: ParamsResourceVerificationcodesInvalidate, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def invalidate(
    params: ParamsResourceVerificationcodesInvalidate,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  /**
    * Invalidates the current backup verification codes for the user.
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
    *   const res = await directory.verificationCodes.invalidate({
    *     // Email or immutable ID of the user
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
  def invalidate(params: ParamsResourceVerificationcodesInvalidate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def invalidate(
    params: ParamsResourceVerificationcodesInvalidate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaVerificationCodes] = js.native
  def list(callback: BodyResponseCallback[SchemaVerificationCodes]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaVerificationCodes] = js.native
  def list(params: ParamsResourceVerificationcodesList): GaxiosPromise[SchemaVerificationCodes] = js.native
  def list(
    params: ParamsResourceVerificationcodesList,
    callback: BodyResponseCallback[SchemaVerificationCodes]
  ): Unit = js.native
  def list(
    params: ParamsResourceVerificationcodesList,
    options: BodyResponseCallback[Readable | SchemaVerificationCodes],
    callback: BodyResponseCallback[Readable | SchemaVerificationCodes]
  ): Unit = js.native
  def list(params: ParamsResourceVerificationcodesList, options: MethodOptions): GaxiosPromise[SchemaVerificationCodes] = js.native
  def list(
    params: ParamsResourceVerificationcodesList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaVerificationCodes]
  ): Unit = js.native
  /**
    * Returns the current set of valid backup verification codes for the specified user.
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
    *   const res = await directory.verificationCodes.list({
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
  def list(params: ParamsResourceVerificationcodesList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceVerificationcodesList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
