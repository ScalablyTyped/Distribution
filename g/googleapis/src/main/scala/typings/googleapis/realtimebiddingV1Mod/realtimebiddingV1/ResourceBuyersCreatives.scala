package typings.googleapis.realtimebiddingV1Mod.realtimebiddingV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/realtimebidding/v1", "realtimebidding_v1.Resource$Buyers$Creatives")
@js.native
open class ResourceBuyersCreatives protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def create(): GaxiosPromise[SchemaCreative] = js.native
  def create(callback: BodyResponseCallback[SchemaCreative]): Unit = js.native
  def create(params: Unit, options: MethodOptions): GaxiosPromise[SchemaCreative] = js.native
  def create(params: ParamsResourceBuyersCreativesCreate): GaxiosPromise[SchemaCreative] = js.native
  def create(params: ParamsResourceBuyersCreativesCreate, callback: BodyResponseCallback[SchemaCreative]): Unit = js.native
  def create(
    params: ParamsResourceBuyersCreativesCreate,
    options: BodyResponseCallback[Readable | SchemaCreative],
    callback: BodyResponseCallback[Readable | SchemaCreative]
  ): Unit = js.native
  def create(params: ParamsResourceBuyersCreativesCreate, options: MethodOptions): GaxiosPromise[SchemaCreative] = js.native
  def create(
    params: ParamsResourceBuyersCreativesCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaCreative]
  ): Unit = js.native
  /**
    * Creates a creative.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/realtimebidding.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const realtimebidding = google.realtimebidding('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/realtime-bidding'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await realtimebidding.buyers.creatives.create({
    *     // Required. The name of the parent buyer that the new creative belongs to that must follow the pattern `buyers/{buyerAccountId\}`, where `{buyerAccountId\}` represents the account ID of the buyer who owns a creative. For a bidder accessing creatives on behalf of a child seat buyer, `{buyerAccountId\}` should represent the account ID of the child seat buyer.
    *     parent: 'buyers/my-buyer',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "accountId": "my_accountId",
    *       //   "adChoicesDestinationUrl": "my_adChoicesDestinationUrl",
    *       //   "advertiserName": "my_advertiserName",
    *       //   "agencyId": "my_agencyId",
    *       //   "apiUpdateTime": "my_apiUpdateTime",
    *       //   "creativeFormat": "my_creativeFormat",
    *       //   "creativeId": "my_creativeId",
    *       //   "creativeServingDecision": {},
    *       //   "dealIds": [],
    *       //   "declaredAttributes": [],
    *       //   "declaredClickThroughUrls": [],
    *       //   "declaredRestrictedCategories": [],
    *       //   "declaredVendorIds": [],
    *       //   "html": {},
    *       //   "impressionTrackingUrls": [],
    *       //   "name": "my_name",
    *       //   "native": {},
    *       //   "restrictedCategories": [],
    *       //   "version": 0,
    *       //   "video": {}
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "accountId": "my_accountId",
    *   //   "adChoicesDestinationUrl": "my_adChoicesDestinationUrl",
    *   //   "advertiserName": "my_advertiserName",
    *   //   "agencyId": "my_agencyId",
    *   //   "apiUpdateTime": "my_apiUpdateTime",
    *   //   "creativeFormat": "my_creativeFormat",
    *   //   "creativeId": "my_creativeId",
    *   //   "creativeServingDecision": {},
    *   //   "dealIds": [],
    *   //   "declaredAttributes": [],
    *   //   "declaredClickThroughUrls": [],
    *   //   "declaredRestrictedCategories": [],
    *   //   "declaredVendorIds": [],
    *   //   "html": {},
    *   //   "impressionTrackingUrls": [],
    *   //   "name": "my_name",
    *   //   "native": {},
    *   //   "restrictedCategories": [],
    *   //   "version": 0,
    *   //   "video": {}
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
  def create(params: ParamsResourceBuyersCreativesCreate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def create(
    params: ParamsResourceBuyersCreativesCreate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def get(): GaxiosPromise[SchemaCreative] = js.native
  def get(callback: BodyResponseCallback[SchemaCreative]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaCreative] = js.native
  def get(params: ParamsResourceBuyersCreativesGet): GaxiosPromise[SchemaCreative] = js.native
  def get(params: ParamsResourceBuyersCreativesGet, callback: BodyResponseCallback[SchemaCreative]): Unit = js.native
  def get(
    params: ParamsResourceBuyersCreativesGet,
    options: BodyResponseCallback[Readable | SchemaCreative],
    callback: BodyResponseCallback[Readable | SchemaCreative]
  ): Unit = js.native
  def get(params: ParamsResourceBuyersCreativesGet, options: MethodOptions): GaxiosPromise[SchemaCreative] = js.native
  def get(
    params: ParamsResourceBuyersCreativesGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaCreative]
  ): Unit = js.native
  /**
    * Gets a creative.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/realtimebidding.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const realtimebidding = google.realtimebidding('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/realtime-bidding'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await realtimebidding.buyers.creatives.get({
    *     // Required. Name of the creative to retrieve. See creative.name.
    *     name: 'buyers/my-buyer/creatives/my-creative',
    *     // Controls the amount of information included in the response. By default only creativeServingDecision is included. To retrieve the entire creative resource (including the declared fields and the creative content) specify the view as "FULL".
    *     view: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "accountId": "my_accountId",
    *   //   "adChoicesDestinationUrl": "my_adChoicesDestinationUrl",
    *   //   "advertiserName": "my_advertiserName",
    *   //   "agencyId": "my_agencyId",
    *   //   "apiUpdateTime": "my_apiUpdateTime",
    *   //   "creativeFormat": "my_creativeFormat",
    *   //   "creativeId": "my_creativeId",
    *   //   "creativeServingDecision": {},
    *   //   "dealIds": [],
    *   //   "declaredAttributes": [],
    *   //   "declaredClickThroughUrls": [],
    *   //   "declaredRestrictedCategories": [],
    *   //   "declaredVendorIds": [],
    *   //   "html": {},
    *   //   "impressionTrackingUrls": [],
    *   //   "name": "my_name",
    *   //   "native": {},
    *   //   "restrictedCategories": [],
    *   //   "version": 0,
    *   //   "video": {}
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
  def get(params: ParamsResourceBuyersCreativesGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceBuyersCreativesGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaListCreativesResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListCreativesResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListCreativesResponse] = js.native
  def list(params: ParamsResourceBuyersCreativesList): GaxiosPromise[SchemaListCreativesResponse] = js.native
  def list(
    params: ParamsResourceBuyersCreativesList,
    callback: BodyResponseCallback[SchemaListCreativesResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceBuyersCreativesList,
    options: BodyResponseCallback[Readable | SchemaListCreativesResponse],
    callback: BodyResponseCallback[Readable | SchemaListCreativesResponse]
  ): Unit = js.native
  def list(params: ParamsResourceBuyersCreativesList, options: MethodOptions): GaxiosPromise[SchemaListCreativesResponse] = js.native
  def list(
    params: ParamsResourceBuyersCreativesList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListCreativesResponse]
  ): Unit = js.native
  /**
    * Lists creatives as they are at the time of the initial request. This call may take multiple hours to complete. For large, paginated requests, this method returns a snapshot of creatives at the time of request for the first page. `lastStatusUpdate` and `creativeServingDecision` may be outdated for creatives on sequential pages. We recommend [Google Cloud Pub/Sub](//cloud.google.com/pubsub/docs/overview) to view the latest status.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/realtimebidding.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const realtimebidding = google.realtimebidding('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/realtime-bidding'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await realtimebidding.buyers.creatives.list({
    *     // Query string to filter creatives. If no filter is specified, all active creatives will be returned. Example: 'accountId=12345 AND (dealsStatus:DISAPPROVED AND disapprovalReason:UNACCEPTABLE_CONTENT) OR declaredAttributes:IS_COOKIE_TARGETED'
    *     filter: 'placeholder-value',
    *     // Requested page size. The server may return fewer creatives than requested (due to timeout constraint) even if more are available via another call. If unspecified, server will pick an appropriate default. Acceptable values are 1 to 1000, inclusive.
    *     pageSize: 'placeholder-value',
    *     // A token identifying a page of results the server should return. Typically, this is the value of ListCreativesResponse.nextPageToken returned from the previous call to the 'ListCreatives' method. Page tokens for continued pages are valid for up to five hours, counting from the call to 'ListCreatives' for the first page.
    *     pageToken: 'placeholder-value',
    *     // Required. Name of the parent buyer that owns the creatives. The pattern for this resource is either `buyers/{buyerAccountId\}` or `bidders/{bidderAccountId\}`. For `buyers/{buyerAccountId\}`, the `buyerAccountId` can be one of the following: 1. The ID of the buyer that is accessing their own creatives. 2. The ID of the child seat buyer under a bidder account. So for listing creatives pertaining to the child seat buyer (`456`) under bidder account (`123`), you would use the pattern: `buyers/456`. 3. The ID of the bidder itself. So for listing creatives pertaining to bidder (`123`), you would use `buyers/123`. If you want to access all creatives pertaining to both the bidder and all of its child seat accounts, you would use `bidders/{bidderAccountId\}`, e.g., for all creatives pertaining to bidder (`123`), use `bidders/123`.
    *     parent: 'buyers/my-buyer',
    *     // Controls the amount of information included in the response. By default only creativeServingDecision is included. To retrieve the entire creative resource (including the declared fields and the creative content) specify the view as "FULL".
    *     view: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "creatives": [],
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
  def list(params: ParamsResourceBuyersCreativesList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceBuyersCreativesList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def patch(): GaxiosPromise[SchemaCreative] = js.native
  def patch(callback: BodyResponseCallback[SchemaCreative]): Unit = js.native
  def patch(params: Unit, options: MethodOptions): GaxiosPromise[SchemaCreative] = js.native
  def patch(params: ParamsResourceBuyersCreativesPatch): GaxiosPromise[SchemaCreative] = js.native
  def patch(params: ParamsResourceBuyersCreativesPatch, callback: BodyResponseCallback[SchemaCreative]): Unit = js.native
  def patch(
    params: ParamsResourceBuyersCreativesPatch,
    options: BodyResponseCallback[Readable | SchemaCreative],
    callback: BodyResponseCallback[Readable | SchemaCreative]
  ): Unit = js.native
  def patch(params: ParamsResourceBuyersCreativesPatch, options: MethodOptions): GaxiosPromise[SchemaCreative] = js.native
  def patch(
    params: ParamsResourceBuyersCreativesPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaCreative]
  ): Unit = js.native
  /**
    * Updates a creative.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/realtimebidding.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const realtimebidding = google.realtimebidding('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/realtime-bidding'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await realtimebidding.buyers.creatives.patch({
    *     // Output only. Name of the creative. Follows the pattern `buyers/{buyer\}/creatives/{creative\}`, where `{buyer\}` represents the account ID of the buyer who owns the creative, and `{creative\}` is the buyer-specific creative ID that references this creative in the bid response.
    *     name: 'buyers/my-buyer/creatives/my-creative',
    *     // Field mask to use for partial in-place updates.
    *     updateMask: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "accountId": "my_accountId",
    *       //   "adChoicesDestinationUrl": "my_adChoicesDestinationUrl",
    *       //   "advertiserName": "my_advertiserName",
    *       //   "agencyId": "my_agencyId",
    *       //   "apiUpdateTime": "my_apiUpdateTime",
    *       //   "creativeFormat": "my_creativeFormat",
    *       //   "creativeId": "my_creativeId",
    *       //   "creativeServingDecision": {},
    *       //   "dealIds": [],
    *       //   "declaredAttributes": [],
    *       //   "declaredClickThroughUrls": [],
    *       //   "declaredRestrictedCategories": [],
    *       //   "declaredVendorIds": [],
    *       //   "html": {},
    *       //   "impressionTrackingUrls": [],
    *       //   "name": "my_name",
    *       //   "native": {},
    *       //   "restrictedCategories": [],
    *       //   "version": 0,
    *       //   "video": {}
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "accountId": "my_accountId",
    *   //   "adChoicesDestinationUrl": "my_adChoicesDestinationUrl",
    *   //   "advertiserName": "my_advertiserName",
    *   //   "agencyId": "my_agencyId",
    *   //   "apiUpdateTime": "my_apiUpdateTime",
    *   //   "creativeFormat": "my_creativeFormat",
    *   //   "creativeId": "my_creativeId",
    *   //   "creativeServingDecision": {},
    *   //   "dealIds": [],
    *   //   "declaredAttributes": [],
    *   //   "declaredClickThroughUrls": [],
    *   //   "declaredRestrictedCategories": [],
    *   //   "declaredVendorIds": [],
    *   //   "html": {},
    *   //   "impressionTrackingUrls": [],
    *   //   "name": "my_name",
    *   //   "native": {},
    *   //   "restrictedCategories": [],
    *   //   "version": 0,
    *   //   "video": {}
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
  def patch(params: ParamsResourceBuyersCreativesPatch, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def patch(
    params: ParamsResourceBuyersCreativesPatch,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
