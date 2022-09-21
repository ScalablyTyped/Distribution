package typings.googleapis.stsV1betaMod.stsV1beta

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/sts/v1beta", "sts_v1beta.Resource$V1beta")
@js.native
open class ResourceV1beta protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def token(): GaxiosPromise[SchemaGoogleIdentityStsV1betaExchangeTokenResponse] = js.native
  def token(callback: BodyResponseCallback[SchemaGoogleIdentityStsV1betaExchangeTokenResponse]): Unit = js.native
  def token(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleIdentityStsV1betaExchangeTokenResponse] = js.native
  def token(params: ParamsResourceV1betaToken): GaxiosPromise[SchemaGoogleIdentityStsV1betaExchangeTokenResponse] = js.native
  def token(
    params: ParamsResourceV1betaToken,
    callback: BodyResponseCallback[SchemaGoogleIdentityStsV1betaExchangeTokenResponse]
  ): Unit = js.native
  def token(
    params: ParamsResourceV1betaToken,
    options: BodyResponseCallback[Readable | SchemaGoogleIdentityStsV1betaExchangeTokenResponse],
    callback: BodyResponseCallback[Readable | SchemaGoogleIdentityStsV1betaExchangeTokenResponse]
  ): Unit = js.native
  def token(params: ParamsResourceV1betaToken, options: MethodOptions): GaxiosPromise[SchemaGoogleIdentityStsV1betaExchangeTokenResponse] = js.native
  def token(
    params: ParamsResourceV1betaToken,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleIdentityStsV1betaExchangeTokenResponse]
  ): Unit = js.native
  /**
    * Exchanges a credential for a Google OAuth 2.0 access token. The token asserts an external identity within a workload identity pool, or it applies a Credential Access Boundary to a Google access token. When you call this method, do not send the `Authorization` HTTP header in the request. This method does not require the `Authorization` header, and using the header can cause the request to fail.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/sts.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const sts = google.sts('v1beta');
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
    *   const res = await sts.token({
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "audience": "my_audience",
    *       //   "grantType": "my_grantType",
    *       //   "options": "my_options",
    *       //   "requestedTokenType": "my_requestedTokenType",
    *       //   "scope": "my_scope",
    *       //   "subjectToken": "my_subjectToken",
    *       //   "subjectTokenType": "my_subjectTokenType"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "access_token": "my_access_token",
    *   //   "expires_in": 0,
    *   //   "issued_token_type": "my_issued_token_type",
    *   //   "token_type": "my_token_type"
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
  def token(params: ParamsResourceV1betaToken, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def token(
    params: ParamsResourceV1betaToken,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
