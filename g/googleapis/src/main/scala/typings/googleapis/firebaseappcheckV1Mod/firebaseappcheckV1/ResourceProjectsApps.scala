package typings.googleapis.firebaseappcheckV1Mod.firebaseappcheckV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/firebaseappcheck/v1", "firebaseappcheck_v1.Resource$Projects$Apps")
@js.native
open class ResourceProjectsApps protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var appAttestConfig: ResourceProjectsAppsAppattestconfig = js.native
  
  var context: APIRequestContext = js.native
  
  var debugTokens: ResourceProjectsAppsDebugtokens = js.native
  
  var deviceCheckConfig: ResourceProjectsAppsDevicecheckconfig = js.native
  
  def exchangeAppAttestAssertion(): GaxiosPromise[SchemaGoogleFirebaseAppcheckV1AppCheckToken] = js.native
  def exchangeAppAttestAssertion(callback: BodyResponseCallback[SchemaGoogleFirebaseAppcheckV1AppCheckToken]): Unit = js.native
  def exchangeAppAttestAssertion(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleFirebaseAppcheckV1AppCheckToken] = js.native
  def exchangeAppAttestAssertion(params: ParamsResourceProjectsAppsExchangeappattestassertion): GaxiosPromise[SchemaGoogleFirebaseAppcheckV1AppCheckToken] = js.native
  def exchangeAppAttestAssertion(
    params: ParamsResourceProjectsAppsExchangeappattestassertion,
    callback: BodyResponseCallback[SchemaGoogleFirebaseAppcheckV1AppCheckToken]
  ): Unit = js.native
  def exchangeAppAttestAssertion(
    params: ParamsResourceProjectsAppsExchangeappattestassertion,
    options: BodyResponseCallback[Readable | SchemaGoogleFirebaseAppcheckV1AppCheckToken],
    callback: BodyResponseCallback[Readable | SchemaGoogleFirebaseAppcheckV1AppCheckToken]
  ): Unit = js.native
  def exchangeAppAttestAssertion(params: ParamsResourceProjectsAppsExchangeappattestassertion, options: MethodOptions): GaxiosPromise[SchemaGoogleFirebaseAppcheckV1AppCheckToken] = js.native
  def exchangeAppAttestAssertion(
    params: ParamsResourceProjectsAppsExchangeappattestassertion,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleFirebaseAppcheckV1AppCheckToken]
  ): Unit = js.native
  /**
    * Accepts an App Attest assertion and an artifact previously obtained from ExchangeAppAttestAttestation and verifies those with Apple. If valid, returns an AppCheckToken.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/firebaseappcheck.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const firebaseappcheck = google.firebaseappcheck('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/cloud-platform',
    *       'https://www.googleapis.com/auth/firebase',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await firebaseappcheck.projects.apps.exchangeAppAttestAssertion({
    *     // Required. The relative resource name of the iOS app, in the format: ``` projects/{project_number\}/apps/{app_id\} ``` If necessary, the `project_number` element can be replaced with the project ID of the Firebase project. Learn more about using project identifiers in Google's [AIP 2510](https://google.aip.dev/cloud/2510) standard.
    *     app: 'projects/my-project/apps/my-app',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "artifact": "my_artifact",
    *       //   "assertion": "my_assertion",
    *       //   "challenge": "my_challenge"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "token": "my_token",
    *   //   "ttl": "my_ttl"
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
  def exchangeAppAttestAssertion(params: ParamsResourceProjectsAppsExchangeappattestassertion, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def exchangeAppAttestAssertion(
    params: ParamsResourceProjectsAppsExchangeappattestassertion,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def exchangeAppAttestAttestation(): GaxiosPromise[SchemaGoogleFirebaseAppcheckV1ExchangeAppAttestAttestationResponse] = js.native
  def exchangeAppAttestAttestation(callback: BodyResponseCallback[SchemaGoogleFirebaseAppcheckV1ExchangeAppAttestAttestationResponse]): Unit = js.native
  def exchangeAppAttestAttestation(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleFirebaseAppcheckV1ExchangeAppAttestAttestationResponse] = js.native
  def exchangeAppAttestAttestation(params: ParamsResourceProjectsAppsExchangeappattestattestation): GaxiosPromise[SchemaGoogleFirebaseAppcheckV1ExchangeAppAttestAttestationResponse] = js.native
  def exchangeAppAttestAttestation(
    params: ParamsResourceProjectsAppsExchangeappattestattestation,
    callback: BodyResponseCallback[SchemaGoogleFirebaseAppcheckV1ExchangeAppAttestAttestationResponse]
  ): Unit = js.native
  def exchangeAppAttestAttestation(
    params: ParamsResourceProjectsAppsExchangeappattestattestation,
    options: BodyResponseCallback[Readable | SchemaGoogleFirebaseAppcheckV1ExchangeAppAttestAttestationResponse],
    callback: BodyResponseCallback[Readable | SchemaGoogleFirebaseAppcheckV1ExchangeAppAttestAttestationResponse]
  ): Unit = js.native
  def exchangeAppAttestAttestation(params: ParamsResourceProjectsAppsExchangeappattestattestation, options: MethodOptions): GaxiosPromise[SchemaGoogleFirebaseAppcheckV1ExchangeAppAttestAttestationResponse] = js.native
  def exchangeAppAttestAttestation(
    params: ParamsResourceProjectsAppsExchangeappattestattestation,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleFirebaseAppcheckV1ExchangeAppAttestAttestationResponse]
  ): Unit = js.native
  /**
    * Accepts an App Attest CBOR attestation and verifies it with Apple using your preconfigured team and bundle IDs. If valid, returns an attestation artifact that can later be exchanged for an AppCheckToken using ExchangeAppAttestAssertion. For convenience and performance, this method's response object will also contain an AppCheckToken (if the verification is successful).
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/firebaseappcheck.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const firebaseappcheck = google.firebaseappcheck('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/cloud-platform',
    *       'https://www.googleapis.com/auth/firebase',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await firebaseappcheck.projects.apps.exchangeAppAttestAttestation(
    *     {
    *       // Required. The relative resource name of the iOS app, in the format: ``` projects/{project_number\}/apps/{app_id\} ``` If necessary, the `project_number` element can be replaced with the project ID of the Firebase project. Learn more about using project identifiers in Google's [AIP 2510](https://google.aip.dev/cloud/2510) standard.
    *       app: 'projects/my-project/apps/my-app',
    *
    *       // Request body metadata
    *       requestBody: {
    *         // request body parameters
    *         // {
    *         //   "attestationStatement": "my_attestationStatement",
    *         //   "challenge": "my_challenge",
    *         //   "keyId": "my_keyId"
    *         // }
    *       },
    *     }
    *   );
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "appCheckToken": {},
    *   //   "artifact": "my_artifact"
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
  def exchangeAppAttestAttestation(params: ParamsResourceProjectsAppsExchangeappattestattestation, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def exchangeAppAttestAttestation(
    params: ParamsResourceProjectsAppsExchangeappattestattestation,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def exchangeCustomToken(): GaxiosPromise[SchemaGoogleFirebaseAppcheckV1AppCheckToken] = js.native
  def exchangeCustomToken(callback: BodyResponseCallback[SchemaGoogleFirebaseAppcheckV1AppCheckToken]): Unit = js.native
  def exchangeCustomToken(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleFirebaseAppcheckV1AppCheckToken] = js.native
  def exchangeCustomToken(params: ParamsResourceProjectsAppsExchangecustomtoken): GaxiosPromise[SchemaGoogleFirebaseAppcheckV1AppCheckToken] = js.native
  def exchangeCustomToken(
    params: ParamsResourceProjectsAppsExchangecustomtoken,
    callback: BodyResponseCallback[SchemaGoogleFirebaseAppcheckV1AppCheckToken]
  ): Unit = js.native
  def exchangeCustomToken(
    params: ParamsResourceProjectsAppsExchangecustomtoken,
    options: BodyResponseCallback[Readable | SchemaGoogleFirebaseAppcheckV1AppCheckToken],
    callback: BodyResponseCallback[Readable | SchemaGoogleFirebaseAppcheckV1AppCheckToken]
  ): Unit = js.native
  def exchangeCustomToken(params: ParamsResourceProjectsAppsExchangecustomtoken, options: MethodOptions): GaxiosPromise[SchemaGoogleFirebaseAppcheckV1AppCheckToken] = js.native
  def exchangeCustomToken(
    params: ParamsResourceProjectsAppsExchangecustomtoken,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleFirebaseAppcheckV1AppCheckToken]
  ): Unit = js.native
  /**
    * Validates a custom token signed using your project's Admin SDK service account credentials. If valid, returns an AppCheckToken.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/firebaseappcheck.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const firebaseappcheck = google.firebaseappcheck('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/cloud-platform',
    *       'https://www.googleapis.com/auth/firebase',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await firebaseappcheck.projects.apps.exchangeCustomToken({
    *     // Required. The relative resource name of the app, in the format: ``` projects/{project_number\}/apps/{app_id\} ``` If necessary, the `project_number` element can be replaced with the project ID of the Firebase project. Learn more about using project identifiers in Google's [AIP 2510](https://google.aip.dev/cloud/2510) standard.
    *     app: 'projects/my-project/apps/my-app',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "customToken": "my_customToken"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "token": "my_token",
    *   //   "ttl": "my_ttl"
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
  def exchangeCustomToken(params: ParamsResourceProjectsAppsExchangecustomtoken, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def exchangeCustomToken(
    params: ParamsResourceProjectsAppsExchangecustomtoken,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def exchangeDebugToken(): GaxiosPromise[SchemaGoogleFirebaseAppcheckV1AppCheckToken] = js.native
  def exchangeDebugToken(callback: BodyResponseCallback[SchemaGoogleFirebaseAppcheckV1AppCheckToken]): Unit = js.native
  def exchangeDebugToken(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleFirebaseAppcheckV1AppCheckToken] = js.native
  def exchangeDebugToken(params: ParamsResourceProjectsAppsExchangedebugtoken): GaxiosPromise[SchemaGoogleFirebaseAppcheckV1AppCheckToken] = js.native
  def exchangeDebugToken(
    params: ParamsResourceProjectsAppsExchangedebugtoken,
    callback: BodyResponseCallback[SchemaGoogleFirebaseAppcheckV1AppCheckToken]
  ): Unit = js.native
  def exchangeDebugToken(
    params: ParamsResourceProjectsAppsExchangedebugtoken,
    options: BodyResponseCallback[Readable | SchemaGoogleFirebaseAppcheckV1AppCheckToken],
    callback: BodyResponseCallback[Readable | SchemaGoogleFirebaseAppcheckV1AppCheckToken]
  ): Unit = js.native
  def exchangeDebugToken(params: ParamsResourceProjectsAppsExchangedebugtoken, options: MethodOptions): GaxiosPromise[SchemaGoogleFirebaseAppcheckV1AppCheckToken] = js.native
  def exchangeDebugToken(
    params: ParamsResourceProjectsAppsExchangedebugtoken,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleFirebaseAppcheckV1AppCheckToken]
  ): Unit = js.native
  /**
    * Validates a debug token secret that you have previously created using CreateDebugToken. If valid, returns an AppCheckToken. Note that a restrictive quota is enforced on this method to prevent accidental exposure of the app to abuse.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/firebaseappcheck.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const firebaseappcheck = google.firebaseappcheck('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/cloud-platform',
    *       'https://www.googleapis.com/auth/firebase',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await firebaseappcheck.projects.apps.exchangeDebugToken({
    *     // Required. The relative resource name of the app, in the format: ``` projects/{project_number\}/apps/{app_id\} ``` If necessary, the `project_number` element can be replaced with the project ID of the Firebase project. Learn more about using project identifiers in Google's [AIP 2510](https://google.aip.dev/cloud/2510) standard.
    *     app: 'projects/my-project/apps/my-app',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "debugToken": "my_debugToken"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "token": "my_token",
    *   //   "ttl": "my_ttl"
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
  def exchangeDebugToken(params: ParamsResourceProjectsAppsExchangedebugtoken, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def exchangeDebugToken(
    params: ParamsResourceProjectsAppsExchangedebugtoken,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def exchangeDeviceCheckToken(): GaxiosPromise[SchemaGoogleFirebaseAppcheckV1AppCheckToken] = js.native
  def exchangeDeviceCheckToken(callback: BodyResponseCallback[SchemaGoogleFirebaseAppcheckV1AppCheckToken]): Unit = js.native
  def exchangeDeviceCheckToken(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleFirebaseAppcheckV1AppCheckToken] = js.native
  def exchangeDeviceCheckToken(params: ParamsResourceProjectsAppsExchangedevicechecktoken): GaxiosPromise[SchemaGoogleFirebaseAppcheckV1AppCheckToken] = js.native
  def exchangeDeviceCheckToken(
    params: ParamsResourceProjectsAppsExchangedevicechecktoken,
    callback: BodyResponseCallback[SchemaGoogleFirebaseAppcheckV1AppCheckToken]
  ): Unit = js.native
  def exchangeDeviceCheckToken(
    params: ParamsResourceProjectsAppsExchangedevicechecktoken,
    options: BodyResponseCallback[Readable | SchemaGoogleFirebaseAppcheckV1AppCheckToken],
    callback: BodyResponseCallback[Readable | SchemaGoogleFirebaseAppcheckV1AppCheckToken]
  ): Unit = js.native
  def exchangeDeviceCheckToken(params: ParamsResourceProjectsAppsExchangedevicechecktoken, options: MethodOptions): GaxiosPromise[SchemaGoogleFirebaseAppcheckV1AppCheckToken] = js.native
  def exchangeDeviceCheckToken(
    params: ParamsResourceProjectsAppsExchangedevicechecktoken,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleFirebaseAppcheckV1AppCheckToken]
  ): Unit = js.native
  /**
    * Accepts a [`device_token`](https://developer.apple.com/documentation/devicecheck/dcdevice) issued by DeviceCheck, and attempts to validate it with Apple. If valid, returns an AppCheckToken.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/firebaseappcheck.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const firebaseappcheck = google.firebaseappcheck('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/cloud-platform',
    *       'https://www.googleapis.com/auth/firebase',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await firebaseappcheck.projects.apps.exchangeDeviceCheckToken({
    *     // Required. The relative resource name of the iOS app, in the format: ``` projects/{project_number\}/apps/{app_id\} ``` If necessary, the `project_number` element can be replaced with the project ID of the Firebase project. Learn more about using project identifiers in Google's [AIP 2510](https://google.aip.dev/cloud/2510) standard.
    *     app: 'projects/my-project/apps/my-app',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "deviceToken": "my_deviceToken"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "token": "my_token",
    *   //   "ttl": "my_ttl"
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
  def exchangeDeviceCheckToken(params: ParamsResourceProjectsAppsExchangedevicechecktoken, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def exchangeDeviceCheckToken(
    params: ParamsResourceProjectsAppsExchangedevicechecktoken,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def exchangePlayIntegrityToken(): GaxiosPromise[SchemaGoogleFirebaseAppcheckV1AppCheckToken] = js.native
  def exchangePlayIntegrityToken(callback: BodyResponseCallback[SchemaGoogleFirebaseAppcheckV1AppCheckToken]): Unit = js.native
  def exchangePlayIntegrityToken(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleFirebaseAppcheckV1AppCheckToken] = js.native
  def exchangePlayIntegrityToken(params: ParamsResourceProjectsAppsExchangeplayintegritytoken): GaxiosPromise[SchemaGoogleFirebaseAppcheckV1AppCheckToken] = js.native
  def exchangePlayIntegrityToken(
    params: ParamsResourceProjectsAppsExchangeplayintegritytoken,
    callback: BodyResponseCallback[SchemaGoogleFirebaseAppcheckV1AppCheckToken]
  ): Unit = js.native
  def exchangePlayIntegrityToken(
    params: ParamsResourceProjectsAppsExchangeplayintegritytoken,
    options: BodyResponseCallback[Readable | SchemaGoogleFirebaseAppcheckV1AppCheckToken],
    callback: BodyResponseCallback[Readable | SchemaGoogleFirebaseAppcheckV1AppCheckToken]
  ): Unit = js.native
  def exchangePlayIntegrityToken(params: ParamsResourceProjectsAppsExchangeplayintegritytoken, options: MethodOptions): GaxiosPromise[SchemaGoogleFirebaseAppcheckV1AppCheckToken] = js.native
  def exchangePlayIntegrityToken(
    params: ParamsResourceProjectsAppsExchangeplayintegritytoken,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleFirebaseAppcheckV1AppCheckToken]
  ): Unit = js.native
  /**
    * Validates an [integrity verdict response token from Play Integrity](https://developer.android.com/google/play/integrity/verdict#decrypt-verify). If valid, returns an AppCheckToken.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/firebaseappcheck.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const firebaseappcheck = google.firebaseappcheck('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/cloud-platform',
    *       'https://www.googleapis.com/auth/firebase',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await firebaseappcheck.projects.apps.exchangePlayIntegrityToken({
    *     // Required. The relative resource name of the Android app, in the format: ``` projects/{project_number\}/apps/{app_id\} ``` If necessary, the `project_number` element can be replaced with the project ID of the Firebase project. Learn more about using project identifiers in Google's [AIP 2510](https://google.aip.dev/cloud/2510) standard.
    *     app: 'projects/my-project/apps/my-app',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "playIntegrityToken": "my_playIntegrityToken"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "token": "my_token",
    *   //   "ttl": "my_ttl"
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
  def exchangePlayIntegrityToken(params: ParamsResourceProjectsAppsExchangeplayintegritytoken, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def exchangePlayIntegrityToken(
    params: ParamsResourceProjectsAppsExchangeplayintegritytoken,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def exchangeRecaptchaEnterpriseToken(): GaxiosPromise[SchemaGoogleFirebaseAppcheckV1AppCheckToken] = js.native
  def exchangeRecaptchaEnterpriseToken(callback: BodyResponseCallback[SchemaGoogleFirebaseAppcheckV1AppCheckToken]): Unit = js.native
  def exchangeRecaptchaEnterpriseToken(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleFirebaseAppcheckV1AppCheckToken] = js.native
  def exchangeRecaptchaEnterpriseToken(params: ParamsResourceProjectsAppsExchangerecaptchaenterprisetoken): GaxiosPromise[SchemaGoogleFirebaseAppcheckV1AppCheckToken] = js.native
  def exchangeRecaptchaEnterpriseToken(
    params: ParamsResourceProjectsAppsExchangerecaptchaenterprisetoken,
    callback: BodyResponseCallback[SchemaGoogleFirebaseAppcheckV1AppCheckToken]
  ): Unit = js.native
  def exchangeRecaptchaEnterpriseToken(
    params: ParamsResourceProjectsAppsExchangerecaptchaenterprisetoken,
    options: BodyResponseCallback[Readable | SchemaGoogleFirebaseAppcheckV1AppCheckToken],
    callback: BodyResponseCallback[Readable | SchemaGoogleFirebaseAppcheckV1AppCheckToken]
  ): Unit = js.native
  def exchangeRecaptchaEnterpriseToken(params: ParamsResourceProjectsAppsExchangerecaptchaenterprisetoken, options: MethodOptions): GaxiosPromise[SchemaGoogleFirebaseAppcheckV1AppCheckToken] = js.native
  def exchangeRecaptchaEnterpriseToken(
    params: ParamsResourceProjectsAppsExchangerecaptchaenterprisetoken,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleFirebaseAppcheckV1AppCheckToken]
  ): Unit = js.native
  /**
    * Validates a [reCAPTCHA Enterprise response token](https://cloud.google.com/recaptcha-enterprise/docs/create-assessment#retrieve_token). If valid, returns an AppCheckToken.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/firebaseappcheck.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const firebaseappcheck = google.firebaseappcheck('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/cloud-platform',
    *       'https://www.googleapis.com/auth/firebase',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res =
    *     await firebaseappcheck.projects.apps.exchangeRecaptchaEnterpriseToken({
    *       // Required. The relative resource name of the web app, in the format: ``` projects/{project_number\}/apps/{app_id\} ``` If necessary, the `project_number` element can be replaced with the project ID of the Firebase project. Learn more about using project identifiers in Google's [AIP 2510](https://google.aip.dev/cloud/2510) standard.
    *       app: 'projects/my-project/apps/my-app',
    *
    *       // Request body metadata
    *       requestBody: {
    *         // request body parameters
    *         // {
    *         //   "recaptchaEnterpriseToken": "my_recaptchaEnterpriseToken"
    *         // }
    *       },
    *     });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "token": "my_token",
    *   //   "ttl": "my_ttl"
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
  def exchangeRecaptchaEnterpriseToken(params: ParamsResourceProjectsAppsExchangerecaptchaenterprisetoken, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def exchangeRecaptchaEnterpriseToken(
    params: ParamsResourceProjectsAppsExchangerecaptchaenterprisetoken,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def exchangeRecaptchaV3Token(): GaxiosPromise[SchemaGoogleFirebaseAppcheckV1AppCheckToken] = js.native
  def exchangeRecaptchaV3Token(callback: BodyResponseCallback[SchemaGoogleFirebaseAppcheckV1AppCheckToken]): Unit = js.native
  def exchangeRecaptchaV3Token(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleFirebaseAppcheckV1AppCheckToken] = js.native
  def exchangeRecaptchaV3Token(params: ParamsResourceProjectsAppsExchangerecaptchav3token): GaxiosPromise[SchemaGoogleFirebaseAppcheckV1AppCheckToken] = js.native
  def exchangeRecaptchaV3Token(
    params: ParamsResourceProjectsAppsExchangerecaptchav3token,
    callback: BodyResponseCallback[SchemaGoogleFirebaseAppcheckV1AppCheckToken]
  ): Unit = js.native
  def exchangeRecaptchaV3Token(
    params: ParamsResourceProjectsAppsExchangerecaptchav3token,
    options: BodyResponseCallback[Readable | SchemaGoogleFirebaseAppcheckV1AppCheckToken],
    callback: BodyResponseCallback[Readable | SchemaGoogleFirebaseAppcheckV1AppCheckToken]
  ): Unit = js.native
  def exchangeRecaptchaV3Token(params: ParamsResourceProjectsAppsExchangerecaptchav3token, options: MethodOptions): GaxiosPromise[SchemaGoogleFirebaseAppcheckV1AppCheckToken] = js.native
  def exchangeRecaptchaV3Token(
    params: ParamsResourceProjectsAppsExchangerecaptchav3token,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleFirebaseAppcheckV1AppCheckToken]
  ): Unit = js.native
  /**
    * Validates a [reCAPTCHA v3 response token](https://developers.google.com/recaptcha/docs/v3). If valid, returns an AppCheckToken.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/firebaseappcheck.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const firebaseappcheck = google.firebaseappcheck('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/cloud-platform',
    *       'https://www.googleapis.com/auth/firebase',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await firebaseappcheck.projects.apps.exchangeRecaptchaV3Token({
    *     // Required. The relative resource name of the web app, in the format: ``` projects/{project_number\}/apps/{app_id\} ``` If necessary, the `project_number` element can be replaced with the project ID of the Firebase project. Learn more about using project identifiers in Google's [AIP 2510](https://google.aip.dev/cloud/2510) standard.
    *     app: 'projects/my-project/apps/my-app',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "recaptchaV3Token": "my_recaptchaV3Token"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "token": "my_token",
    *   //   "ttl": "my_ttl"
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
  def exchangeRecaptchaV3Token(params: ParamsResourceProjectsAppsExchangerecaptchav3token, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def exchangeRecaptchaV3Token(
    params: ParamsResourceProjectsAppsExchangerecaptchav3token,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def exchangeSafetyNetToken(): GaxiosPromise[SchemaGoogleFirebaseAppcheckV1AppCheckToken] = js.native
  def exchangeSafetyNetToken(callback: BodyResponseCallback[SchemaGoogleFirebaseAppcheckV1AppCheckToken]): Unit = js.native
  def exchangeSafetyNetToken(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleFirebaseAppcheckV1AppCheckToken] = js.native
  def exchangeSafetyNetToken(params: ParamsResourceProjectsAppsExchangesafetynettoken): GaxiosPromise[SchemaGoogleFirebaseAppcheckV1AppCheckToken] = js.native
  def exchangeSafetyNetToken(
    params: ParamsResourceProjectsAppsExchangesafetynettoken,
    callback: BodyResponseCallback[SchemaGoogleFirebaseAppcheckV1AppCheckToken]
  ): Unit = js.native
  def exchangeSafetyNetToken(
    params: ParamsResourceProjectsAppsExchangesafetynettoken,
    options: BodyResponseCallback[Readable | SchemaGoogleFirebaseAppcheckV1AppCheckToken],
    callback: BodyResponseCallback[Readable | SchemaGoogleFirebaseAppcheckV1AppCheckToken]
  ): Unit = js.native
  def exchangeSafetyNetToken(params: ParamsResourceProjectsAppsExchangesafetynettoken, options: MethodOptions): GaxiosPromise[SchemaGoogleFirebaseAppcheckV1AppCheckToken] = js.native
  def exchangeSafetyNetToken(
    params: ParamsResourceProjectsAppsExchangesafetynettoken,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleFirebaseAppcheckV1AppCheckToken]
  ): Unit = js.native
  /**
    * Validates a [SafetyNet token](https://developer.android.com/training/safetynet/attestation#request-attestation-step). If valid, returns an AppCheckToken.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/firebaseappcheck.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const firebaseappcheck = google.firebaseappcheck('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/cloud-platform',
    *       'https://www.googleapis.com/auth/firebase',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await firebaseappcheck.projects.apps.exchangeSafetyNetToken({
    *     // Required. The relative resource name of the Android app, in the format: ``` projects/{project_number\}/apps/{app_id\} ``` If necessary, the `project_number` element can be replaced with the project ID of the Firebase project. Learn more about using project identifiers in Google's [AIP 2510](https://google.aip.dev/cloud/2510) standard.
    *     app: 'projects/my-project/apps/my-app',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "safetyNetToken": "my_safetyNetToken"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "token": "my_token",
    *   //   "ttl": "my_ttl"
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
  def exchangeSafetyNetToken(params: ParamsResourceProjectsAppsExchangesafetynettoken, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def exchangeSafetyNetToken(
    params: ParamsResourceProjectsAppsExchangesafetynettoken,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def generateAppAttestChallenge(): GaxiosPromise[SchemaGoogleFirebaseAppcheckV1GenerateAppAttestChallengeResponse] = js.native
  def generateAppAttestChallenge(callback: BodyResponseCallback[SchemaGoogleFirebaseAppcheckV1GenerateAppAttestChallengeResponse]): Unit = js.native
  def generateAppAttestChallenge(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleFirebaseAppcheckV1GenerateAppAttestChallengeResponse] = js.native
  def generateAppAttestChallenge(params: ParamsResourceProjectsAppsGenerateappattestchallenge): GaxiosPromise[SchemaGoogleFirebaseAppcheckV1GenerateAppAttestChallengeResponse] = js.native
  def generateAppAttestChallenge(
    params: ParamsResourceProjectsAppsGenerateappattestchallenge,
    callback: BodyResponseCallback[SchemaGoogleFirebaseAppcheckV1GenerateAppAttestChallengeResponse]
  ): Unit = js.native
  def generateAppAttestChallenge(
    params: ParamsResourceProjectsAppsGenerateappattestchallenge,
    options: BodyResponseCallback[Readable | SchemaGoogleFirebaseAppcheckV1GenerateAppAttestChallengeResponse],
    callback: BodyResponseCallback[Readable | SchemaGoogleFirebaseAppcheckV1GenerateAppAttestChallengeResponse]
  ): Unit = js.native
  def generateAppAttestChallenge(params: ParamsResourceProjectsAppsGenerateappattestchallenge, options: MethodOptions): GaxiosPromise[SchemaGoogleFirebaseAppcheckV1GenerateAppAttestChallengeResponse] = js.native
  def generateAppAttestChallenge(
    params: ParamsResourceProjectsAppsGenerateappattestchallenge,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleFirebaseAppcheckV1GenerateAppAttestChallengeResponse]
  ): Unit = js.native
  /**
    * Generates a challenge that protects the integrity of an immediately following call to ExchangeAppAttestAttestation or ExchangeAppAttestAssertion. A challenge should not be reused for multiple calls.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/firebaseappcheck.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const firebaseappcheck = google.firebaseappcheck('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/cloud-platform',
    *       'https://www.googleapis.com/auth/firebase',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await firebaseappcheck.projects.apps.generateAppAttestChallenge({
    *     // Required. The relative resource name of the iOS app, in the format: ``` projects/{project_number\}/apps/{app_id\} ``` If necessary, the `project_number` element can be replaced with the project ID of the Firebase project. Learn more about using project identifiers in Google's [AIP 2510](https://google.aip.dev/cloud/2510) standard.
    *     app: 'projects/my-project/apps/my-app',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {}
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "challenge": "my_challenge",
    *   //   "ttl": "my_ttl"
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
  def generateAppAttestChallenge(params: ParamsResourceProjectsAppsGenerateappattestchallenge, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def generateAppAttestChallenge(
    params: ParamsResourceProjectsAppsGenerateappattestchallenge,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def generatePlayIntegrityChallenge(): GaxiosPromise[SchemaGoogleFirebaseAppcheckV1GeneratePlayIntegrityChallengeResponse] = js.native
  def generatePlayIntegrityChallenge(
    callback: BodyResponseCallback[SchemaGoogleFirebaseAppcheckV1GeneratePlayIntegrityChallengeResponse]
  ): Unit = js.native
  def generatePlayIntegrityChallenge(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleFirebaseAppcheckV1GeneratePlayIntegrityChallengeResponse] = js.native
  def generatePlayIntegrityChallenge(params: ParamsResourceProjectsAppsGenerateplayintegritychallenge): GaxiosPromise[SchemaGoogleFirebaseAppcheckV1GeneratePlayIntegrityChallengeResponse] = js.native
  def generatePlayIntegrityChallenge(
    params: ParamsResourceProjectsAppsGenerateplayintegritychallenge,
    callback: BodyResponseCallback[SchemaGoogleFirebaseAppcheckV1GeneratePlayIntegrityChallengeResponse]
  ): Unit = js.native
  def generatePlayIntegrityChallenge(
    params: ParamsResourceProjectsAppsGenerateplayintegritychallenge,
    options: BodyResponseCallback[Readable | SchemaGoogleFirebaseAppcheckV1GeneratePlayIntegrityChallengeResponse],
    callback: BodyResponseCallback[Readable | SchemaGoogleFirebaseAppcheckV1GeneratePlayIntegrityChallengeResponse]
  ): Unit = js.native
  def generatePlayIntegrityChallenge(params: ParamsResourceProjectsAppsGenerateplayintegritychallenge, options: MethodOptions): GaxiosPromise[SchemaGoogleFirebaseAppcheckV1GeneratePlayIntegrityChallengeResponse] = js.native
  def generatePlayIntegrityChallenge(
    params: ParamsResourceProjectsAppsGenerateplayintegritychallenge,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleFirebaseAppcheckV1GeneratePlayIntegrityChallengeResponse]
  ): Unit = js.native
  /**
    * Generates a challenge that protects the integrity of an immediately following integrity verdict request to the Play Integrity API. The next call to ExchangePlayIntegrityToken using the resulting integrity token will verify the presence and validity of the challenge. A challenge should not be reused for multiple calls.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/firebaseappcheck.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const firebaseappcheck = google.firebaseappcheck('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/cloud-platform',
    *       'https://www.googleapis.com/auth/firebase',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res =
    *     await firebaseappcheck.projects.apps.generatePlayIntegrityChallenge({
    *       // Required. The relative resource name of the app, in the format: ``` projects/{project_number\}/apps/{app_id\} ``` If necessary, the `project_number` element can be replaced with the project ID of the Firebase project. Learn more about using project identifiers in Google's [AIP 2510](https://google.aip.dev/cloud/2510) standard.
    *       app: 'projects/my-project/apps/my-app',
    *
    *       // Request body metadata
    *       requestBody: {
    *         // request body parameters
    *         // {}
    *       },
    *     });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "challenge": "my_challenge",
    *   //   "ttl": "my_ttl"
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
  def generatePlayIntegrityChallenge(params: ParamsResourceProjectsAppsGenerateplayintegritychallenge, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def generatePlayIntegrityChallenge(
    params: ParamsResourceProjectsAppsGenerateplayintegritychallenge,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  var playIntegrityConfig: ResourceProjectsAppsPlayintegrityconfig = js.native
  
  var recaptchaEnterpriseConfig: ResourceProjectsAppsRecaptchaenterpriseconfig = js.native
  
  var recaptchaV3Config: ResourceProjectsAppsRecaptchav3config = js.native
  
  var safetyNetConfig: ResourceProjectsAppsSafetynetconfig = js.native
}
