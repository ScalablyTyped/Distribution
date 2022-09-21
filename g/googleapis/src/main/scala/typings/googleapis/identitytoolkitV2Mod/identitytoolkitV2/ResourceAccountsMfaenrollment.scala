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

@JSImport("googleapis/build/src/apis/identitytoolkit/v2", "identitytoolkit_v2.Resource$Accounts$Mfaenrollment")
@js.native
open class ResourceAccountsMfaenrollment protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def finalize(callback: BodyResponseCallback[SchemaGoogleCloudIdentitytoolkitV2FinalizeMfaEnrollmentResponse]): Unit = js.native
  def finalize(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudIdentitytoolkitV2FinalizeMfaEnrollmentResponse] = js.native
  def finalize(params: ParamsResourceAccountsMfaenrollmentFinalize): GaxiosPromise[SchemaGoogleCloudIdentitytoolkitV2FinalizeMfaEnrollmentResponse] = js.native
  def finalize(
    params: ParamsResourceAccountsMfaenrollmentFinalize,
    callback: BodyResponseCallback[SchemaGoogleCloudIdentitytoolkitV2FinalizeMfaEnrollmentResponse]
  ): Unit = js.native
  def finalize(
    params: ParamsResourceAccountsMfaenrollmentFinalize,
    options: BodyResponseCallback[Readable | SchemaGoogleCloudIdentitytoolkitV2FinalizeMfaEnrollmentResponse],
    callback: BodyResponseCallback[Readable | SchemaGoogleCloudIdentitytoolkitV2FinalizeMfaEnrollmentResponse]
  ): Unit = js.native
  def finalize(params: ParamsResourceAccountsMfaenrollmentFinalize, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudIdentitytoolkitV2FinalizeMfaEnrollmentResponse] = js.native
  def finalize(
    params: ParamsResourceAccountsMfaenrollmentFinalize,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudIdentitytoolkitV2FinalizeMfaEnrollmentResponse]
  ): Unit = js.native
  /**
    * Finishes enrolling a second factor for the user.
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
    *   const res = await identitytoolkit.accounts.mfaEnrollment.finalize({
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "displayName": "my_displayName",
    *       //   "idToken": "my_idToken",
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
  def finalize(params: ParamsResourceAccountsMfaenrollmentFinalize, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def finalize(
    params: ParamsResourceAccountsMfaenrollmentFinalize,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def start(): GaxiosPromise[SchemaGoogleCloudIdentitytoolkitV2StartMfaEnrollmentResponse] = js.native
  def start(callback: BodyResponseCallback[SchemaGoogleCloudIdentitytoolkitV2StartMfaEnrollmentResponse]): Unit = js.native
  def start(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudIdentitytoolkitV2StartMfaEnrollmentResponse] = js.native
  def start(params: ParamsResourceAccountsMfaenrollmentStart): GaxiosPromise[SchemaGoogleCloudIdentitytoolkitV2StartMfaEnrollmentResponse] = js.native
  def start(
    params: ParamsResourceAccountsMfaenrollmentStart,
    callback: BodyResponseCallback[SchemaGoogleCloudIdentitytoolkitV2StartMfaEnrollmentResponse]
  ): Unit = js.native
  def start(
    params: ParamsResourceAccountsMfaenrollmentStart,
    options: BodyResponseCallback[Readable | SchemaGoogleCloudIdentitytoolkitV2StartMfaEnrollmentResponse],
    callback: BodyResponseCallback[Readable | SchemaGoogleCloudIdentitytoolkitV2StartMfaEnrollmentResponse]
  ): Unit = js.native
  def start(params: ParamsResourceAccountsMfaenrollmentStart, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudIdentitytoolkitV2StartMfaEnrollmentResponse] = js.native
  def start(
    params: ParamsResourceAccountsMfaenrollmentStart,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudIdentitytoolkitV2StartMfaEnrollmentResponse]
  ): Unit = js.native
  /**
    * Step one of the MFA enrollment process. In SMS case, this sends an SMS verification code to the user.
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
    *   const res = await identitytoolkit.accounts.mfaEnrollment.start({
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "idToken": "my_idToken",
    *       //   "phoneEnrollmentInfo": {},
    *       //   "tenantId": "my_tenantId"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "phoneSessionInfo": {}
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
  def start(params: ParamsResourceAccountsMfaenrollmentStart, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def start(
    params: ParamsResourceAccountsMfaenrollmentStart,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def withdraw(): GaxiosPromise[SchemaGoogleCloudIdentitytoolkitV2WithdrawMfaResponse] = js.native
  def withdraw(callback: BodyResponseCallback[SchemaGoogleCloudIdentitytoolkitV2WithdrawMfaResponse]): Unit = js.native
  def withdraw(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudIdentitytoolkitV2WithdrawMfaResponse] = js.native
  def withdraw(params: ParamsResourceAccountsMfaenrollmentWithdraw): GaxiosPromise[SchemaGoogleCloudIdentitytoolkitV2WithdrawMfaResponse] = js.native
  def withdraw(
    params: ParamsResourceAccountsMfaenrollmentWithdraw,
    callback: BodyResponseCallback[SchemaGoogleCloudIdentitytoolkitV2WithdrawMfaResponse]
  ): Unit = js.native
  def withdraw(
    params: ParamsResourceAccountsMfaenrollmentWithdraw,
    options: BodyResponseCallback[Readable | SchemaGoogleCloudIdentitytoolkitV2WithdrawMfaResponse],
    callback: BodyResponseCallback[Readable | SchemaGoogleCloudIdentitytoolkitV2WithdrawMfaResponse]
  ): Unit = js.native
  def withdraw(params: ParamsResourceAccountsMfaenrollmentWithdraw, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudIdentitytoolkitV2WithdrawMfaResponse] = js.native
  def withdraw(
    params: ParamsResourceAccountsMfaenrollmentWithdraw,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudIdentitytoolkitV2WithdrawMfaResponse]
  ): Unit = js.native
  /**
    * Revokes one second factor from the enrolled second factors for an account.
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
    *   const res = await identitytoolkit.accounts.mfaEnrollment.withdraw({
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "idToken": "my_idToken",
    *       //   "mfaEnrollmentId": "my_mfaEnrollmentId",
    *       //   "tenantId": "my_tenantId"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "idToken": "my_idToken",
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
  def withdraw(params: ParamsResourceAccountsMfaenrollmentWithdraw, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def withdraw(
    params: ParamsResourceAccountsMfaenrollmentWithdraw,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
