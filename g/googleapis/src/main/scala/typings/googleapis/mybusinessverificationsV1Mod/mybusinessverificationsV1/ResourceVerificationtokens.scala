package typings.googleapis.mybusinessverificationsV1Mod.mybusinessverificationsV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/mybusinessverifications/v1", "mybusinessverifications_v1.Resource$Verificationtokens")
@js.native
open class ResourceVerificationtokens protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def generate(): GaxiosPromise[SchemaGenerateVerificationTokenResponse] = js.native
  def generate(callback: BodyResponseCallback[SchemaGenerateVerificationTokenResponse]): Unit = js.native
  def generate(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGenerateVerificationTokenResponse] = js.native
  def generate(params: ParamsResourceVerificationtokensGenerate): GaxiosPromise[SchemaGenerateVerificationTokenResponse] = js.native
  def generate(
    params: ParamsResourceVerificationtokensGenerate,
    callback: BodyResponseCallback[SchemaGenerateVerificationTokenResponse]
  ): Unit = js.native
  def generate(
    params: ParamsResourceVerificationtokensGenerate,
    options: BodyResponseCallback[Readable | SchemaGenerateVerificationTokenResponse],
    callback: BodyResponseCallback[Readable | SchemaGenerateVerificationTokenResponse]
  ): Unit = js.native
  def generate(params: ParamsResourceVerificationtokensGenerate, options: MethodOptions): GaxiosPromise[SchemaGenerateVerificationTokenResponse] = js.native
  def generate(
    params: ParamsResourceVerificationtokensGenerate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGenerateVerificationTokenResponse]
  ): Unit = js.native
  /**
    * Generates a token for the provided location data as a vetted [partner](https://support.google.com/business/answer/7674102). Throws PERMISSION_DENIED if the caller is not a vetted partner account. Throws FAILED_PRECONDITION if the caller's VettedStatus is INVALID.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/mybusinessverifications.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const mybusinessverifications = google.mybusinessverifications('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await mybusinessverifications.verificationTokens.generate({
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "location": {}
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "token": {}
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
  def generate(params: ParamsResourceVerificationtokensGenerate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def generate(
    params: ParamsResourceVerificationtokensGenerate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
