package typings.googleapis.identitytoolkitV2Mod.identitytoolkitV2

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/identitytoolkit/v2", "identitytoolkit_v2.Resource$Accounts$Mfasignin")
@js.native
open class ResourceAccountsMfasignin protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def finalize(callback: BodyResponseCallback[SchemaGoogleCloudIdentitytoolkitV2FinalizeMfaSignInResponse]): Unit = js.native
  def finalize(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudIdentitytoolkitV2FinalizeMfaSignInResponse] = js.native
  def finalize(params: ParamsResourceAccountsMfasigninFinalize): GaxiosPromise[SchemaGoogleCloudIdentitytoolkitV2FinalizeMfaSignInResponse] = js.native
  def finalize(
    params: ParamsResourceAccountsMfasigninFinalize,
    callback: BodyResponseCallback[SchemaGoogleCloudIdentitytoolkitV2FinalizeMfaSignInResponse]
  ): Unit = js.native
  def finalize(
    params: ParamsResourceAccountsMfasigninFinalize,
    options: BodyResponseCallback[Readable | SchemaGoogleCloudIdentitytoolkitV2FinalizeMfaSignInResponse],
    callback: BodyResponseCallback[Readable | SchemaGoogleCloudIdentitytoolkitV2FinalizeMfaSignInResponse]
  ): Unit = js.native
  def finalize(params: ParamsResourceAccountsMfasigninFinalize, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudIdentitytoolkitV2FinalizeMfaSignInResponse] = js.native
  def finalize(
    params: ParamsResourceAccountsMfasigninFinalize,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudIdentitytoolkitV2FinalizeMfaSignInResponse]
  ): Unit = js.native
  /**
    * Verifies the MFA challenge and performs sign-in
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/identitytoolkit.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const identitytoolkit = google.identitytoolkit('v2');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/cloud-platform'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await identitytoolkit.accounts.mfaSignIn.finalize({
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "mfaPendingCredential": "my_mfaPendingCredential",
    *       //   "phoneVerificationInfo": {},
    *       //   "tenantId": "my_tenantId"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "idToken": "my_idToken",
    *   //   "phoneAuthInfo": {},
    *   //   "refreshToken": "my_refreshToken"
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
  def finalize(params: ParamsResourceAccountsMfasigninFinalize, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def finalize(
    params: ParamsResourceAccountsMfasigninFinalize,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def start(): GaxiosPromise[SchemaGoogleCloudIdentitytoolkitV2StartMfaSignInResponse] = js.native
  def start(callback: BodyResponseCallback[SchemaGoogleCloudIdentitytoolkitV2StartMfaSignInResponse]): Unit = js.native
  def start(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudIdentitytoolkitV2StartMfaSignInResponse] = js.native
  def start(params: ParamsResourceAccountsMfasigninStart): GaxiosPromise[SchemaGoogleCloudIdentitytoolkitV2StartMfaSignInResponse] = js.native
  def start(
    params: ParamsResourceAccountsMfasigninStart,
    callback: BodyResponseCallback[SchemaGoogleCloudIdentitytoolkitV2StartMfaSignInResponse]
  ): Unit = js.native
  def start(
    params: ParamsResourceAccountsMfasigninStart,
    options: BodyResponseCallback[Readable | SchemaGoogleCloudIdentitytoolkitV2StartMfaSignInResponse],
    callback: BodyResponseCallback[Readable | SchemaGoogleCloudIdentitytoolkitV2StartMfaSignInResponse]
  ): Unit = js.native
  def start(params: ParamsResourceAccountsMfasigninStart, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudIdentitytoolkitV2StartMfaSignInResponse] = js.native
  def start(
    params: ParamsResourceAccountsMfasigninStart,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudIdentitytoolkitV2StartMfaSignInResponse]
  ): Unit = js.native
  /**
    * Sends the MFA challenge
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/identitytoolkit.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const identitytoolkit = google.identitytoolkit('v2');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/cloud-platform'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await identitytoolkit.accounts.mfaSignIn.start({
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "mfaEnrollmentId": "my_mfaEnrollmentId",
    *       //   "mfaPendingCredential": "my_mfaPendingCredential",
    *       //   "phoneSignInInfo": {},
    *       //   "tenantId": "my_tenantId"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "phoneResponseInfo": {}
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
  def start(params: ParamsResourceAccountsMfasigninStart, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def start(
    params: ParamsResourceAccountsMfasigninStart,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
