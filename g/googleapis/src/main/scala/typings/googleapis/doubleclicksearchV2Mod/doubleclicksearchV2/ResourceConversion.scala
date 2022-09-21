package typings.googleapis.doubleclicksearchV2Mod.doubleclicksearchV2

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/doubleclicksearch/v2", "doubleclicksearch_v2.Resource$Conversion")
@js.native
open class ResourceConversion protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def get(): GaxiosPromise[SchemaConversionList] = js.native
  def get(callback: BodyResponseCallback[SchemaConversionList]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaConversionList] = js.native
  def get(params: ParamsResourceConversionGet): GaxiosPromise[SchemaConversionList] = js.native
  def get(params: ParamsResourceConversionGet, callback: BodyResponseCallback[SchemaConversionList]): Unit = js.native
  def get(
    params: ParamsResourceConversionGet,
    options: BodyResponseCallback[Readable | SchemaConversionList],
    callback: BodyResponseCallback[Readable | SchemaConversionList]
  ): Unit = js.native
  def get(params: ParamsResourceConversionGet, options: MethodOptions): GaxiosPromise[SchemaConversionList] = js.native
  def get(
    params: ParamsResourceConversionGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaConversionList]
  ): Unit = js.native
  /**
    * Retrieves a list of conversions from a DoubleClick Search engine account.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/doubleclicksearch.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const doubleclicksearch = google.doubleclicksearch('v2');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/doubleclicksearch'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await doubleclicksearch.conversion.get({
    *     // Numeric ID of the ad group.
    *     adGroupId: 'placeholder-value',
    *     // Numeric ID of the ad.
    *     adId: 'placeholder-value',
    *     // Numeric ID of the advertiser.
    *     advertiserId: 'placeholder-value',
    *     // Numeric ID of the agency.
    *     agencyId: 'placeholder-value',
    *     // Numeric ID of the campaign.
    *     campaignId: 'placeholder-value',
    *     // Numeric ID of the criterion.
    *     criterionId: 'placeholder-value',
    *     // Last date (inclusive) on which to retrieve conversions. Format is yyyymmdd.
    *     endDate: 'placeholder-value',
    *     // Numeric ID of the engine account.
    *     engineAccountId: 'placeholder-value',
    *     // The number of conversions to return per call.
    *     rowCount: 'placeholder-value',
    *     // First date (inclusive) on which to retrieve conversions. Format is yyyymmdd.
    *     startDate: 'placeholder-value',
    *     // The 0-based starting index for retrieving conversions results.
    *     startRow: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "conversion": [],
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
  def get(params: ParamsResourceConversionGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceConversionGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def insert(): GaxiosPromise[SchemaConversionList] = js.native
  def insert(callback: BodyResponseCallback[SchemaConversionList]): Unit = js.native
  def insert(params: Unit, options: MethodOptions): GaxiosPromise[SchemaConversionList] = js.native
  def insert(params: ParamsResourceConversionInsert): GaxiosPromise[SchemaConversionList] = js.native
  def insert(params: ParamsResourceConversionInsert, callback: BodyResponseCallback[SchemaConversionList]): Unit = js.native
  def insert(
    params: ParamsResourceConversionInsert,
    options: BodyResponseCallback[Readable | SchemaConversionList],
    callback: BodyResponseCallback[Readable | SchemaConversionList]
  ): Unit = js.native
  def insert(params: ParamsResourceConversionInsert, options: MethodOptions): GaxiosPromise[SchemaConversionList] = js.native
  def insert(
    params: ParamsResourceConversionInsert,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaConversionList]
  ): Unit = js.native
  /**
    * Inserts a batch of new conversions into DoubleClick Search.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/doubleclicksearch.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const doubleclicksearch = google.doubleclicksearch('v2');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/doubleclicksearch'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await doubleclicksearch.conversion.insert({
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "conversion": [],
    *       //   "kind": "my_kind"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "conversion": [],
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
  def insert(params: ParamsResourceConversionInsert, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def insert(
    params: ParamsResourceConversionInsert,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def update(): GaxiosPromise[SchemaConversionList] = js.native
  def update(callback: BodyResponseCallback[SchemaConversionList]): Unit = js.native
  def update(params: Unit, options: MethodOptions): GaxiosPromise[SchemaConversionList] = js.native
  def update(params: ParamsResourceConversionUpdate): GaxiosPromise[SchemaConversionList] = js.native
  def update(params: ParamsResourceConversionUpdate, callback: BodyResponseCallback[SchemaConversionList]): Unit = js.native
  def update(
    params: ParamsResourceConversionUpdate,
    options: BodyResponseCallback[Readable | SchemaConversionList],
    callback: BodyResponseCallback[Readable | SchemaConversionList]
  ): Unit = js.native
  def update(params: ParamsResourceConversionUpdate, options: MethodOptions): GaxiosPromise[SchemaConversionList] = js.native
  def update(
    params: ParamsResourceConversionUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaConversionList]
  ): Unit = js.native
  /**
    * Updates a batch of conversions in DoubleClick Search.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/doubleclicksearch.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const doubleclicksearch = google.doubleclicksearch('v2');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/doubleclicksearch'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await doubleclicksearch.conversion.update({
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "conversion": [],
    *       //   "kind": "my_kind"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "conversion": [],
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
  def update(params: ParamsResourceConversionUpdate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def update(
    params: ParamsResourceConversionUpdate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def updateAvailability(): GaxiosPromise[SchemaUpdateAvailabilityResponse] = js.native
  def updateAvailability(callback: BodyResponseCallback[SchemaUpdateAvailabilityResponse]): Unit = js.native
  def updateAvailability(params: Unit, options: MethodOptions): GaxiosPromise[SchemaUpdateAvailabilityResponse] = js.native
  def updateAvailability(params: ParamsResourceConversionUpdateavailability): GaxiosPromise[SchemaUpdateAvailabilityResponse] = js.native
  def updateAvailability(
    params: ParamsResourceConversionUpdateavailability,
    callback: BodyResponseCallback[SchemaUpdateAvailabilityResponse]
  ): Unit = js.native
  def updateAvailability(
    params: ParamsResourceConversionUpdateavailability,
    options: BodyResponseCallback[Readable | SchemaUpdateAvailabilityResponse],
    callback: BodyResponseCallback[Readable | SchemaUpdateAvailabilityResponse]
  ): Unit = js.native
  def updateAvailability(params: ParamsResourceConversionUpdateavailability, options: MethodOptions): GaxiosPromise[SchemaUpdateAvailabilityResponse] = js.native
  def updateAvailability(
    params: ParamsResourceConversionUpdateavailability,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaUpdateAvailabilityResponse]
  ): Unit = js.native
  /**
    * Updates the availabilities of a batch of floodlight activities in DoubleClick Search.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/doubleclicksearch.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const doubleclicksearch = google.doubleclicksearch('v2');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/doubleclicksearch'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await doubleclicksearch.conversion.updateAvailability({
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "availabilities": []
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "availabilities": []
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
  def updateAvailability(params: ParamsResourceConversionUpdateavailability, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def updateAvailability(
    params: ParamsResourceConversionUpdateavailability,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
