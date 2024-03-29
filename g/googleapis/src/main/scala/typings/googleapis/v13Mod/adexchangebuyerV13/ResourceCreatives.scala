package typings.googleapis.v13Mod.adexchangebuyerV13

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/adexchangebuyer/v1.3", "adexchangebuyer_v1_3.Resource$Creatives")
@js.native
open class ResourceCreatives protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def get(): GaxiosPromise[SchemaCreative] = js.native
  def get(callback: BodyResponseCallback[SchemaCreative]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaCreative] = js.native
  def get(params: ParamsResourceCreativesGet): GaxiosPromise[SchemaCreative] = js.native
  def get(params: ParamsResourceCreativesGet, callback: BodyResponseCallback[SchemaCreative]): Unit = js.native
  def get(
    params: ParamsResourceCreativesGet,
    options: BodyResponseCallback[Readable | SchemaCreative],
    callback: BodyResponseCallback[Readable | SchemaCreative]
  ): Unit = js.native
  def get(params: ParamsResourceCreativesGet, options: MethodOptions): GaxiosPromise[SchemaCreative] = js.native
  def get(
    params: ParamsResourceCreativesGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaCreative]
  ): Unit = js.native
  /**
    * Gets the status for a single creative. A creative will be available 30-40 minutes after submission.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/adexchangebuyer.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const adexchangebuyer = google.adexchangebuyer('v1.3');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/adexchange.buyer'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await adexchangebuyer.creatives.get({
    *     // The id for the account that will serve this creative.
    *     accountId: 'placeholder-value',
    *     // The buyer-specific id for this creative.
    *     buyerCreativeId: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "HTMLSnippet": "my_HTMLSnippet",
    *   //   "accountId": 0,
    *   //   "adTechnologyProviders": {},
    *   //   "advertiserId": [],
    *   //   "advertiserName": "my_advertiserName",
    *   //   "agencyId": "my_agencyId",
    *   //   "apiUploadTimestamp": "my_apiUploadTimestamp",
    *   //   "attribute": [],
    *   //   "buyerCreativeId": "my_buyerCreativeId",
    *   //   "clickThroughUrl": [],
    *   //   "corrections": [],
    *   //   "disapprovalReasons": [],
    *   //   "filteringReasons": {},
    *   //   "height": 0,
    *   //   "impressionTrackingUrl": [],
    *   //   "kind": "my_kind",
    *   //   "nativeAd": {},
    *   //   "productCategories": [],
    *   //   "restrictedCategories": [],
    *   //   "sensitiveCategories": [],
    *   //   "status": "my_status",
    *   //   "vendorType": [],
    *   //   "version": 0,
    *   //   "videoURL": "my_videoURL",
    *   //   "width": 0
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
  def get(params: ParamsResourceCreativesGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceCreativesGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def insert(): GaxiosPromise[SchemaCreative] = js.native
  def insert(callback: BodyResponseCallback[SchemaCreative]): Unit = js.native
  def insert(params: Unit, options: MethodOptions): GaxiosPromise[SchemaCreative] = js.native
  def insert(params: ParamsResourceCreativesInsert): GaxiosPromise[SchemaCreative] = js.native
  def insert(params: ParamsResourceCreativesInsert, callback: BodyResponseCallback[SchemaCreative]): Unit = js.native
  def insert(
    params: ParamsResourceCreativesInsert,
    options: BodyResponseCallback[Readable | SchemaCreative],
    callback: BodyResponseCallback[Readable | SchemaCreative]
  ): Unit = js.native
  def insert(params: ParamsResourceCreativesInsert, options: MethodOptions): GaxiosPromise[SchemaCreative] = js.native
  def insert(
    params: ParamsResourceCreativesInsert,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaCreative]
  ): Unit = js.native
  /**
    * Submit a new creative.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/adexchangebuyer.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const adexchangebuyer = google.adexchangebuyer('v1.3');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/adexchange.buyer'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await adexchangebuyer.creatives.insert({
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "HTMLSnippet": "my_HTMLSnippet",
    *       //   "accountId": 0,
    *       //   "adTechnologyProviders": {},
    *       //   "advertiserId": [],
    *       //   "advertiserName": "my_advertiserName",
    *       //   "agencyId": "my_agencyId",
    *       //   "apiUploadTimestamp": "my_apiUploadTimestamp",
    *       //   "attribute": [],
    *       //   "buyerCreativeId": "my_buyerCreativeId",
    *       //   "clickThroughUrl": [],
    *       //   "corrections": [],
    *       //   "disapprovalReasons": [],
    *       //   "filteringReasons": {},
    *       //   "height": 0,
    *       //   "impressionTrackingUrl": [],
    *       //   "kind": "my_kind",
    *       //   "nativeAd": {},
    *       //   "productCategories": [],
    *       //   "restrictedCategories": [],
    *       //   "sensitiveCategories": [],
    *       //   "status": "my_status",
    *       //   "vendorType": [],
    *       //   "version": 0,
    *       //   "videoURL": "my_videoURL",
    *       //   "width": 0
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "HTMLSnippet": "my_HTMLSnippet",
    *   //   "accountId": 0,
    *   //   "adTechnologyProviders": {},
    *   //   "advertiserId": [],
    *   //   "advertiserName": "my_advertiserName",
    *   //   "agencyId": "my_agencyId",
    *   //   "apiUploadTimestamp": "my_apiUploadTimestamp",
    *   //   "attribute": [],
    *   //   "buyerCreativeId": "my_buyerCreativeId",
    *   //   "clickThroughUrl": [],
    *   //   "corrections": [],
    *   //   "disapprovalReasons": [],
    *   //   "filteringReasons": {},
    *   //   "height": 0,
    *   //   "impressionTrackingUrl": [],
    *   //   "kind": "my_kind",
    *   //   "nativeAd": {},
    *   //   "productCategories": [],
    *   //   "restrictedCategories": [],
    *   //   "sensitiveCategories": [],
    *   //   "status": "my_status",
    *   //   "vendorType": [],
    *   //   "version": 0,
    *   //   "videoURL": "my_videoURL",
    *   //   "width": 0
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
  def insert(params: ParamsResourceCreativesInsert, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def insert(
    params: ParamsResourceCreativesInsert,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaCreativesList] = js.native
  def list(callback: BodyResponseCallback[SchemaCreativesList]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaCreativesList] = js.native
  def list(params: ParamsResourceCreativesList): GaxiosPromise[SchemaCreativesList] = js.native
  def list(params: ParamsResourceCreativesList, callback: BodyResponseCallback[SchemaCreativesList]): Unit = js.native
  def list(
    params: ParamsResourceCreativesList,
    options: BodyResponseCallback[Readable | SchemaCreativesList],
    callback: BodyResponseCallback[Readable | SchemaCreativesList]
  ): Unit = js.native
  def list(params: ParamsResourceCreativesList, options: MethodOptions): GaxiosPromise[SchemaCreativesList] = js.native
  def list(
    params: ParamsResourceCreativesList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaCreativesList]
  ): Unit = js.native
  /**
    * Retrieves a list of the authenticated user's active creatives. A creative will be available 30-40 minutes after submission.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/adexchangebuyer.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const adexchangebuyer = google.adexchangebuyer('v1.3');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/adexchange.buyer'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await adexchangebuyer.creatives.list({
    *     // When specified, only creatives for the given account ids are returned.
    *     accountId: 'placeholder-value',
    *     // When specified, only creatives for the given buyer creative ids are returned.
    *     buyerCreativeId: 'placeholder-value',
    *     // Maximum number of entries returned on one result page. If not set, the default is 100. Optional.
    *     maxResults: 'placeholder-value',
    *     // A continuation token, used to page through ad clients. To retrieve the next page, set this parameter to the value of "nextPageToken" from the previous response. Optional.
    *     pageToken: 'placeholder-value',
    *     // When specified, only creatives having the given status are returned.
    *     statusFilter: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "items": [],
    *   //   "kind": "my_kind",
    *   //   "nextPageToken": "my_nextPageToken"
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
  def list(params: ParamsResourceCreativesList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceCreativesList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
