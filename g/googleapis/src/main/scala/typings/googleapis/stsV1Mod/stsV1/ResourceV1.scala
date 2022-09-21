package typings.googleapis.stsV1Mod.stsV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/sts/v1", "sts_v1.Resource$V1")
@js.native
open class ResourceV1 protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def introspect(): GaxiosPromise[SchemaGoogleIdentityStsV1IntrospectTokenResponse] = js.native
  def introspect(callback: BodyResponseCallback[SchemaGoogleIdentityStsV1IntrospectTokenResponse]): Unit = js.native
  def introspect(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleIdentityStsV1IntrospectTokenResponse] = js.native
  def introspect(params: ParamsResourceV1Introspect): GaxiosPromise[SchemaGoogleIdentityStsV1IntrospectTokenResponse] = js.native
  def introspect(
    params: ParamsResourceV1Introspect,
    callback: BodyResponseCallback[SchemaGoogleIdentityStsV1IntrospectTokenResponse]
  ): Unit = js.native
  def introspect(
    params: ParamsResourceV1Introspect,
    options: BodyResponseCallback[Readable | SchemaGoogleIdentityStsV1IntrospectTokenResponse],
    callback: BodyResponseCallback[Readable | SchemaGoogleIdentityStsV1IntrospectTokenResponse]
  ): Unit = js.native
  def introspect(params: ParamsResourceV1Introspect, options: MethodOptions): GaxiosPromise[SchemaGoogleIdentityStsV1IntrospectTokenResponse] = js.native
  def introspect(
    params: ParamsResourceV1Introspect,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleIdentityStsV1IntrospectTokenResponse]
  ): Unit = js.native
  /**
    * Gets information about a Google OAuth 2.0 access token issued by the Google Cloud [Security Token Service API](https://cloud.google.com/iam/docs/reference/sts/rest).
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
    * const sts = google.sts('v1');
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
    *   const res = await sts.introspect({
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "token": "my_token",
    *       //   "tokenTypeHint": "my_tokenTypeHint"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "active": false,
    *   //   "client_id": "my_client_id",
    *   //   "exp": "my_exp",
    *   //   "iat": "my_iat",
    *   //   "iss": "my_iss",
    *   //   "scope": "my_scope",
    *   //   "sub": "my_sub",
    *   //   "username": "my_username"
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
  def introspect(params: ParamsResourceV1Introspect, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def introspect(
    params: ParamsResourceV1Introspect,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def token(): GaxiosPromise[SchemaGoogleIdentityStsV1ExchangeTokenResponse] = js.native
  def token(callback: BodyResponseCallback[SchemaGoogleIdentityStsV1ExchangeTokenResponse]): Unit = js.native
  def token(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleIdentityStsV1ExchangeTokenResponse] = js.native
  def token(params: ParamsResourceV1Token): GaxiosPromise[SchemaGoogleIdentityStsV1ExchangeTokenResponse] = js.native
  def token(
    params: ParamsResourceV1Token,
    callback: BodyResponseCallback[SchemaGoogleIdentityStsV1ExchangeTokenResponse]
  ): Unit = js.native
  def token(
    params: ParamsResourceV1Token,
    options: BodyResponseCallback[Readable | SchemaGoogleIdentityStsV1ExchangeTokenResponse],
    callback: BodyResponseCallback[Readable | SchemaGoogleIdentityStsV1ExchangeTokenResponse]
  ): Unit = js.native
  def token(params: ParamsResourceV1Token, options: MethodOptions): GaxiosPromise[SchemaGoogleIdentityStsV1ExchangeTokenResponse] = js.native
  def token(
    params: ParamsResourceV1Token,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleIdentityStsV1ExchangeTokenResponse]
  ): Unit = js.native
  /**
    * Exchanges a credential for a Google OAuth 2.0 access token. The token asserts an external identity within an identity pool, or it applies a Credential Access Boundary to a Google access token. When you call this method, do not send the `Authorization` HTTP header in the request. This method does not require the `Authorization` header, and using the header can cause the request to fail.
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
    * const sts = google.sts('v1');
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
  def token(params: ParamsResourceV1Token, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def token(
    params: ParamsResourceV1Token,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
