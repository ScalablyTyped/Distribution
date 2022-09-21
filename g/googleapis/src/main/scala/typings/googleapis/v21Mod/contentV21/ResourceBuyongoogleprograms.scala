package typings.googleapis.v21Mod.contentV21

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/content/v2.1", "content_v2_1.Resource$Buyongoogleprograms")
@js.native
open class ResourceBuyongoogleprograms protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  def activate(): GaxiosPromise[Unit] = js.native
  def activate(callback: BodyResponseCallback[Unit]): Unit = js.native
  def activate(params: Unit, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def activate(params: ParamsResourceBuyongoogleprogramsActivate): GaxiosPromise[Unit] = js.native
  def activate(params: ParamsResourceBuyongoogleprogramsActivate, callback: BodyResponseCallback[Unit]): Unit = js.native
  def activate(
    params: ParamsResourceBuyongoogleprogramsActivate,
    options: BodyResponseCallback[Readable | Unit],
    callback: BodyResponseCallback[Readable | Unit]
  ): Unit = js.native
  def activate(params: ParamsResourceBuyongoogleprogramsActivate, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def activate(
    params: ParamsResourceBuyongoogleprogramsActivate,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  /**
    * Reactivates the BoG program in your Merchant Center account. Moves the program to the active state when allowed, for example, when paused. This method is only available to selected merchants.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/content.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const content = google.content('v2.1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/content'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await content.buyongoogleprograms.activate({
    *     // Required. The ID of the account.
    *     merchantId: 'placeholder-value',
    *     // Required. The program region code [ISO 3166-1 alpha-2](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2). Currently only US is available.
    *     regionCode: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {}
    *     },
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
  def activate(params: ParamsResourceBuyongoogleprogramsActivate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def activate(
    params: ParamsResourceBuyongoogleprogramsActivate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  var context: APIRequestContext = js.native
  
  def get(): GaxiosPromise[SchemaBuyOnGoogleProgramStatus] = js.native
  def get(callback: BodyResponseCallback[SchemaBuyOnGoogleProgramStatus]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaBuyOnGoogleProgramStatus] = js.native
  def get(params: ParamsResourceBuyongoogleprogramsGet): GaxiosPromise[SchemaBuyOnGoogleProgramStatus] = js.native
  def get(
    params: ParamsResourceBuyongoogleprogramsGet,
    callback: BodyResponseCallback[SchemaBuyOnGoogleProgramStatus]
  ): Unit = js.native
  def get(
    params: ParamsResourceBuyongoogleprogramsGet,
    options: BodyResponseCallback[Readable | SchemaBuyOnGoogleProgramStatus],
    callback: BodyResponseCallback[Readable | SchemaBuyOnGoogleProgramStatus]
  ): Unit = js.native
  def get(params: ParamsResourceBuyongoogleprogramsGet, options: MethodOptions): GaxiosPromise[SchemaBuyOnGoogleProgramStatus] = js.native
  def get(
    params: ParamsResourceBuyongoogleprogramsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaBuyOnGoogleProgramStatus]
  ): Unit = js.native
  /**
    * Retrieves a status of the BoG program for your Merchant Center account.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/content.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const content = google.content('v2.1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/content'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await content.buyongoogleprograms.get({
    *     // Required. The ID of the account.
    *     merchantId: 'placeholder-value',
    *     // Required. The Program region code [ISO 3166-1 alpha-2](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2). Currently only US is available.
    *     regionCode: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "businessModel": [],
    *   //   "customerServicePendingEmail": "my_customerServicePendingEmail",
    *   //   "customerServicePendingPhoneNumber": "my_customerServicePendingPhoneNumber",
    *   //   "customerServicePendingPhoneRegionCode": "my_customerServicePendingPhoneRegionCode",
    *   //   "customerServiceVerifiedEmail": "my_customerServiceVerifiedEmail",
    *   //   "customerServiceVerifiedPhoneNumber": "my_customerServiceVerifiedPhoneNumber",
    *   //   "customerServiceVerifiedPhoneRegionCode": "my_customerServiceVerifiedPhoneRegionCode",
    *   //   "onlineSalesChannel": "my_onlineSalesChannel",
    *   //   "participationStage": "my_participationStage"
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
  def get(params: ParamsResourceBuyongoogleprogramsGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceBuyongoogleprogramsGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def onboard(): GaxiosPromise[Unit] = js.native
  def onboard(callback: BodyResponseCallback[Unit]): Unit = js.native
  def onboard(params: Unit, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def onboard(params: ParamsResourceBuyongoogleprogramsOnboard): GaxiosPromise[Unit] = js.native
  def onboard(params: ParamsResourceBuyongoogleprogramsOnboard, callback: BodyResponseCallback[Unit]): Unit = js.native
  def onboard(
    params: ParamsResourceBuyongoogleprogramsOnboard,
    options: BodyResponseCallback[Readable | Unit],
    callback: BodyResponseCallback[Readable | Unit]
  ): Unit = js.native
  def onboard(params: ParamsResourceBuyongoogleprogramsOnboard, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def onboard(
    params: ParamsResourceBuyongoogleprogramsOnboard,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  /**
    * Onboards the BoG program in your Merchant Center account. By using this method, you agree to the [Terms of Service](https://merchants.google.com/mc/termsofservice/transactions/US/latest). Calling this method is only possible if the authenticated account is the same as the merchant id in the request. Calling this method multiple times will only accept Terms of Service if the latest version is not currently signed.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/content.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const content = google.content('v2.1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/content'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await content.buyongoogleprograms.onboard({
    *     // Required. The ID of the account.
    *     merchantId: 'placeholder-value',
    *     // Required. The program region code [ISO 3166-1 alpha-2](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2). Currently only US is available.
    *     regionCode: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "customerServiceEmail": "my_customerServiceEmail"
    *       // }
    *     },
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
  def onboard(params: ParamsResourceBuyongoogleprogramsOnboard, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def onboard(
    params: ParamsResourceBuyongoogleprogramsOnboard,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def patch(): GaxiosPromise[SchemaBuyOnGoogleProgramStatus] = js.native
  def patch(callback: BodyResponseCallback[SchemaBuyOnGoogleProgramStatus]): Unit = js.native
  def patch(params: Unit, options: MethodOptions): GaxiosPromise[SchemaBuyOnGoogleProgramStatus] = js.native
  def patch(params: ParamsResourceBuyongoogleprogramsPatch): GaxiosPromise[SchemaBuyOnGoogleProgramStatus] = js.native
  def patch(
    params: ParamsResourceBuyongoogleprogramsPatch,
    callback: BodyResponseCallback[SchemaBuyOnGoogleProgramStatus]
  ): Unit = js.native
  def patch(
    params: ParamsResourceBuyongoogleprogramsPatch,
    options: BodyResponseCallback[Readable | SchemaBuyOnGoogleProgramStatus],
    callback: BodyResponseCallback[Readable | SchemaBuyOnGoogleProgramStatus]
  ): Unit = js.native
  def patch(params: ParamsResourceBuyongoogleprogramsPatch, options: MethodOptions): GaxiosPromise[SchemaBuyOnGoogleProgramStatus] = js.native
  def patch(
    params: ParamsResourceBuyongoogleprogramsPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaBuyOnGoogleProgramStatus]
  ): Unit = js.native
  /**
    * Updates the status of the BoG program for your Merchant Center account.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/content.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const content = google.content('v2.1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/content'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await content.buyongoogleprograms.patch({
    *     // Required. The ID of the account.
    *     merchantId: 'placeholder-value',
    *     // Required. The program region code [ISO 3166-1 alpha-2](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2). Currently only US is available.
    *     regionCode: 'placeholder-value',
    *     // The list of fields to update. If the update mask is not provided, then all the fields set in buyOnGoogleProgramStatus will be updated. Clearing fields is only possible if update mask is provided.
    *     updateMask: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "businessModel": [],
    *       //   "customerServicePendingEmail": "my_customerServicePendingEmail",
    *       //   "customerServicePendingPhoneNumber": "my_customerServicePendingPhoneNumber",
    *       //   "customerServicePendingPhoneRegionCode": "my_customerServicePendingPhoneRegionCode",
    *       //   "customerServiceVerifiedEmail": "my_customerServiceVerifiedEmail",
    *       //   "customerServiceVerifiedPhoneNumber": "my_customerServiceVerifiedPhoneNumber",
    *       //   "customerServiceVerifiedPhoneRegionCode": "my_customerServiceVerifiedPhoneRegionCode",
    *       //   "onlineSalesChannel": "my_onlineSalesChannel",
    *       //   "participationStage": "my_participationStage"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "businessModel": [],
    *   //   "customerServicePendingEmail": "my_customerServicePendingEmail",
    *   //   "customerServicePendingPhoneNumber": "my_customerServicePendingPhoneNumber",
    *   //   "customerServicePendingPhoneRegionCode": "my_customerServicePendingPhoneRegionCode",
    *   //   "customerServiceVerifiedEmail": "my_customerServiceVerifiedEmail",
    *   //   "customerServiceVerifiedPhoneNumber": "my_customerServiceVerifiedPhoneNumber",
    *   //   "customerServiceVerifiedPhoneRegionCode": "my_customerServiceVerifiedPhoneRegionCode",
    *   //   "onlineSalesChannel": "my_onlineSalesChannel",
    *   //   "participationStage": "my_participationStage"
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
  def patch(params: ParamsResourceBuyongoogleprogramsPatch, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def patch(
    params: ParamsResourceBuyongoogleprogramsPatch,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def pause(): GaxiosPromise[Unit] = js.native
  def pause(callback: BodyResponseCallback[Unit]): Unit = js.native
  def pause(params: Unit, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def pause(params: ParamsResourceBuyongoogleprogramsPause): GaxiosPromise[Unit] = js.native
  def pause(params: ParamsResourceBuyongoogleprogramsPause, callback: BodyResponseCallback[Unit]): Unit = js.native
  def pause(
    params: ParamsResourceBuyongoogleprogramsPause,
    options: BodyResponseCallback[Readable | Unit],
    callback: BodyResponseCallback[Readable | Unit]
  ): Unit = js.native
  def pause(params: ParamsResourceBuyongoogleprogramsPause, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def pause(
    params: ParamsResourceBuyongoogleprogramsPause,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  /**
    * Pauses the BoG program in your Merchant Center account. This method is only available to selected merchants.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/content.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const content = google.content('v2.1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/content'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await content.buyongoogleprograms.pause({
    *     // Required. The ID of the account.
    *     merchantId: 'placeholder-value',
    *     // Required. The program region code [ISO 3166-1 alpha-2](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2). Currently only US is available.
    *     regionCode: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {}
    *     },
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
  def pause(params: ParamsResourceBuyongoogleprogramsPause, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def pause(
    params: ParamsResourceBuyongoogleprogramsPause,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def requestreview(): GaxiosPromise[Unit] = js.native
  def requestreview(callback: BodyResponseCallback[Unit]): Unit = js.native
  def requestreview(params: Unit, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def requestreview(params: ParamsResourceBuyongoogleprogramsRequestreview): GaxiosPromise[Unit] = js.native
  def requestreview(params: ParamsResourceBuyongoogleprogramsRequestreview, callback: BodyResponseCallback[Unit]): Unit = js.native
  def requestreview(
    params: ParamsResourceBuyongoogleprogramsRequestreview,
    options: BodyResponseCallback[Readable | Unit],
    callback: BodyResponseCallback[Readable | Unit]
  ): Unit = js.native
  def requestreview(params: ParamsResourceBuyongoogleprogramsRequestreview, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def requestreview(
    params: ParamsResourceBuyongoogleprogramsRequestreview,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  /**
    * Requests review and then activates the BoG program in your Merchant Center account for the first time. Moves the program to the REVIEW_PENDING state. This method is only available to selected merchants.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/content.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const content = google.content('v2.1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/content'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await content.buyongoogleprograms.requestreview({
    *     // Required. The ID of the account.
    *     merchantId: 'placeholder-value',
    *     // Required. The program region code [ISO 3166-1 alpha-2](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2). Currently only US is available.
    *     regionCode: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {}
    *     },
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
  def requestreview(params: ParamsResourceBuyongoogleprogramsRequestreview, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def requestreview(
    params: ParamsResourceBuyongoogleprogramsRequestreview,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
