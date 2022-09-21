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

@JSImport("googleapis/build/src/apis/admin/directory_v1", "admin_directory_v1.Resource$Twostepverification")
@js.native
open class ResourceTwostepverification protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def turnOff(): GaxiosPromise[Unit] = js.native
  def turnOff(callback: BodyResponseCallback[Unit]): Unit = js.native
  def turnOff(params: Unit, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def turnOff(params: ParamsResourceTwostepverificationTurnoff): GaxiosPromise[Unit] = js.native
  def turnOff(params: ParamsResourceTwostepverificationTurnoff, callback: BodyResponseCallback[Unit]): Unit = js.native
  def turnOff(
    params: ParamsResourceTwostepverificationTurnoff,
    options: BodyResponseCallback[Readable | Unit],
    callback: BodyResponseCallback[Readable | Unit]
  ): Unit = js.native
  def turnOff(params: ParamsResourceTwostepverificationTurnoff, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def turnOff(
    params: ParamsResourceTwostepverificationTurnoff,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  /**
    * Turns off 2-Step Verification for user.
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
    *   const res = await directory.twoStepVerification.turnOff({
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
  def turnOff(params: ParamsResourceTwostepverificationTurnoff, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def turnOff(
    params: ParamsResourceTwostepverificationTurnoff,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
