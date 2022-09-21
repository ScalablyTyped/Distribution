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

@JSImport("googleapis/build/src/apis/mybusinessverifications/v1", "mybusinessverifications_v1.Resource$Locations")
@js.native
open class ResourceLocations protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def fetchVerificationOptions(): GaxiosPromise[SchemaFetchVerificationOptionsResponse] = js.native
  def fetchVerificationOptions(callback: BodyResponseCallback[SchemaFetchVerificationOptionsResponse]): Unit = js.native
  def fetchVerificationOptions(params: Unit, options: MethodOptions): GaxiosPromise[SchemaFetchVerificationOptionsResponse] = js.native
  def fetchVerificationOptions(params: ParamsResourceLocationsFetchverificationoptions): GaxiosPromise[SchemaFetchVerificationOptionsResponse] = js.native
  def fetchVerificationOptions(
    params: ParamsResourceLocationsFetchverificationoptions,
    callback: BodyResponseCallback[SchemaFetchVerificationOptionsResponse]
  ): Unit = js.native
  def fetchVerificationOptions(
    params: ParamsResourceLocationsFetchverificationoptions,
    options: BodyResponseCallback[Readable | SchemaFetchVerificationOptionsResponse],
    callback: BodyResponseCallback[Readable | SchemaFetchVerificationOptionsResponse]
  ): Unit = js.native
  def fetchVerificationOptions(params: ParamsResourceLocationsFetchverificationoptions, options: MethodOptions): GaxiosPromise[SchemaFetchVerificationOptionsResponse] = js.native
  def fetchVerificationOptions(
    params: ParamsResourceLocationsFetchverificationoptions,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaFetchVerificationOptionsResponse]
  ): Unit = js.native
  /**
    * Reports all eligible verification options for a location in a specific language.
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
    *   const res = await mybusinessverifications.locations.fetchVerificationOptions({
    *     // Required. The location to verify.
    *     location: 'locations/my-location',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "context": {},
    *       //   "languageCode": "my_languageCode"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "options": []
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
  def fetchVerificationOptions(params: ParamsResourceLocationsFetchverificationoptions, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def fetchVerificationOptions(
    params: ParamsResourceLocationsFetchverificationoptions,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def getVoiceOfMerchantState(): GaxiosPromise[SchemaVoiceOfMerchantState] = js.native
  def getVoiceOfMerchantState(callback: BodyResponseCallback[SchemaVoiceOfMerchantState]): Unit = js.native
  def getVoiceOfMerchantState(params: Unit, options: MethodOptions): GaxiosPromise[SchemaVoiceOfMerchantState] = js.native
  def getVoiceOfMerchantState(params: ParamsResourceLocationsGetvoiceofmerchantstate): GaxiosPromise[SchemaVoiceOfMerchantState] = js.native
  def getVoiceOfMerchantState(
    params: ParamsResourceLocationsGetvoiceofmerchantstate,
    callback: BodyResponseCallback[SchemaVoiceOfMerchantState]
  ): Unit = js.native
  def getVoiceOfMerchantState(
    params: ParamsResourceLocationsGetvoiceofmerchantstate,
    options: BodyResponseCallback[Readable | SchemaVoiceOfMerchantState],
    callback: BodyResponseCallback[Readable | SchemaVoiceOfMerchantState]
  ): Unit = js.native
  def getVoiceOfMerchantState(params: ParamsResourceLocationsGetvoiceofmerchantstate, options: MethodOptions): GaxiosPromise[SchemaVoiceOfMerchantState] = js.native
  def getVoiceOfMerchantState(
    params: ParamsResourceLocationsGetvoiceofmerchantstate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaVoiceOfMerchantState]
  ): Unit = js.native
  /**
    * Gets the VoiceOfMerchant state.
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
    *   const res = await mybusinessverifications.locations.getVoiceOfMerchantState({
    *     // Required. Resource name of the location.
    *     name: 'locations/my-location',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "complyWithGuidelines": {},
    *   //   "hasBusinessAuthority": false,
    *   //   "hasVoiceOfMerchant": false,
    *   //   "resolveOwnershipConflict": {},
    *   //   "verify": {},
    *   //   "waitForVoiceOfMerchant": {}
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
  def getVoiceOfMerchantState(params: ParamsResourceLocationsGetvoiceofmerchantstate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def getVoiceOfMerchantState(
    params: ParamsResourceLocationsGetvoiceofmerchantstate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  var verifications: ResourceLocationsVerifications = js.native
  
  def verify(): GaxiosPromise[SchemaVerifyLocationResponse] = js.native
  def verify(callback: BodyResponseCallback[SchemaVerifyLocationResponse]): Unit = js.native
  def verify(params: Unit, options: MethodOptions): GaxiosPromise[SchemaVerifyLocationResponse] = js.native
  def verify(params: ParamsResourceLocationsVerify): GaxiosPromise[SchemaVerifyLocationResponse] = js.native
  def verify(
    params: ParamsResourceLocationsVerify,
    callback: BodyResponseCallback[SchemaVerifyLocationResponse]
  ): Unit = js.native
  def verify(
    params: ParamsResourceLocationsVerify,
    options: BodyResponseCallback[Readable | SchemaVerifyLocationResponse],
    callback: BodyResponseCallback[Readable | SchemaVerifyLocationResponse]
  ): Unit = js.native
  def verify(params: ParamsResourceLocationsVerify, options: MethodOptions): GaxiosPromise[SchemaVerifyLocationResponse] = js.native
  def verify(
    params: ParamsResourceLocationsVerify,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaVerifyLocationResponse]
  ): Unit = js.native
  /**
    * Starts the verification process for a location.
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
    *   const res = await mybusinessverifications.locations.verify({
    *     // Required. Resource name of the location to verify.
    *     name: 'locations/my-location',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "context": {},
    *       //   "emailAddress": "my_emailAddress",
    *       //   "languageCode": "my_languageCode",
    *       //   "mailerContact": "my_mailerContact",
    *       //   "method": "my_method",
    *       //   "phoneNumber": "my_phoneNumber",
    *       //   "token": {}
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "verification": {}
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
  def verify(params: ParamsResourceLocationsVerify, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def verify(
    params: ParamsResourceLocationsVerify,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
