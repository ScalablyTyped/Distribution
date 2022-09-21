package typings.googleapis.v2beta1Mod.adexchangebuyer2V2beta1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/adexchangebuyer2/v2beta1", "adexchangebuyer2_v2beta1.Resource$Accounts$Creatives")
@js.native
open class ResourceAccountsCreatives protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def create(): GaxiosPromise[SchemaCreative] = js.native
  def create(callback: BodyResponseCallback[SchemaCreative]): Unit = js.native
  def create(params: Unit, options: MethodOptions): GaxiosPromise[SchemaCreative] = js.native
  def create(params: ParamsResourceAccountsCreativesCreate): GaxiosPromise[SchemaCreative] = js.native
  def create(params: ParamsResourceAccountsCreativesCreate, callback: BodyResponseCallback[SchemaCreative]): Unit = js.native
  def create(
    params: ParamsResourceAccountsCreativesCreate,
    options: BodyResponseCallback[Readable | SchemaCreative],
    callback: BodyResponseCallback[Readable | SchemaCreative]
  ): Unit = js.native
  def create(params: ParamsResourceAccountsCreativesCreate, options: MethodOptions): GaxiosPromise[SchemaCreative] = js.native
  def create(
    params: ParamsResourceAccountsCreativesCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaCreative]
  ): Unit = js.native
  /**
    * Creates a creative.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/adexchangebuyer2.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const adexchangebuyer2 = google.adexchangebuyer2('v2beta1');
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
    *   const res = await adexchangebuyer2.accounts.creatives.create({
    *     // The account that this creative belongs to. Can be used to filter the response of the creatives.list method.
    *     accountId: 'placeholder-value',
    *     // Indicates if multiple creatives can share an ID or not. Default is NO_DUPLICATES (one ID per creative).
    *     duplicateIdMode: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "accountId": "my_accountId",
    *       //   "adChoicesDestinationUrl": "my_adChoicesDestinationUrl",
    *       //   "adTechnologyProviders": {},
    *       //   "advertiserName": "my_advertiserName",
    *       //   "agencyId": "my_agencyId",
    *       //   "apiUpdateTime": "my_apiUpdateTime",
    *       //   "attributes": [],
    *       //   "clickThroughUrls": [],
    *       //   "corrections": [],
    *       //   "creativeId": "my_creativeId",
    *       //   "dealsStatus": "my_dealsStatus",
    *       //   "declaredClickThroughUrls": [],
    *       //   "detectedAdvertiserIds": [],
    *       //   "detectedDomains": [],
    *       //   "detectedLanguages": [],
    *       //   "detectedProductCategories": [],
    *       //   "detectedSensitiveCategories": [],
    *       //   "html": {},
    *       //   "impressionTrackingUrls": [],
    *       //   "native": {},
    *       //   "openAuctionStatus": "my_openAuctionStatus",
    *       //   "restrictedCategories": [],
    *       //   "servingRestrictions": [],
    *       //   "vendorIds": [],
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
    *   //   "adTechnologyProviders": {},
    *   //   "advertiserName": "my_advertiserName",
    *   //   "agencyId": "my_agencyId",
    *   //   "apiUpdateTime": "my_apiUpdateTime",
    *   //   "attributes": [],
    *   //   "clickThroughUrls": [],
    *   //   "corrections": [],
    *   //   "creativeId": "my_creativeId",
    *   //   "dealsStatus": "my_dealsStatus",
    *   //   "declaredClickThroughUrls": [],
    *   //   "detectedAdvertiserIds": [],
    *   //   "detectedDomains": [],
    *   //   "detectedLanguages": [],
    *   //   "detectedProductCategories": [],
    *   //   "detectedSensitiveCategories": [],
    *   //   "html": {},
    *   //   "impressionTrackingUrls": [],
    *   //   "native": {},
    *   //   "openAuctionStatus": "my_openAuctionStatus",
    *   //   "restrictedCategories": [],
    *   //   "servingRestrictions": [],
    *   //   "vendorIds": [],
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
  def create(params: ParamsResourceAccountsCreativesCreate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def create(
    params: ParamsResourceAccountsCreativesCreate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  var dealAssociations: ResourceAccountsCreativesDealassociations = js.native
  
  def get(): GaxiosPromise[SchemaCreative] = js.native
  def get(callback: BodyResponseCallback[SchemaCreative]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaCreative] = js.native
  def get(params: ParamsResourceAccountsCreativesGet): GaxiosPromise[SchemaCreative] = js.native
  def get(params: ParamsResourceAccountsCreativesGet, callback: BodyResponseCallback[SchemaCreative]): Unit = js.native
  def get(
    params: ParamsResourceAccountsCreativesGet,
    options: BodyResponseCallback[Readable | SchemaCreative],
    callback: BodyResponseCallback[Readable | SchemaCreative]
  ): Unit = js.native
  def get(params: ParamsResourceAccountsCreativesGet, options: MethodOptions): GaxiosPromise[SchemaCreative] = js.native
  def get(
    params: ParamsResourceAccountsCreativesGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaCreative]
  ): Unit = js.native
  /**
    * Gets a creative.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/adexchangebuyer2.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const adexchangebuyer2 = google.adexchangebuyer2('v2beta1');
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
    *   const res = await adexchangebuyer2.accounts.creatives.get({
    *     // The account the creative belongs to.
    *     accountId: 'placeholder-value',
    *     // The ID of the creative to retrieve.
    *     creativeId: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "accountId": "my_accountId",
    *   //   "adChoicesDestinationUrl": "my_adChoicesDestinationUrl",
    *   //   "adTechnologyProviders": {},
    *   //   "advertiserName": "my_advertiserName",
    *   //   "agencyId": "my_agencyId",
    *   //   "apiUpdateTime": "my_apiUpdateTime",
    *   //   "attributes": [],
    *   //   "clickThroughUrls": [],
    *   //   "corrections": [],
    *   //   "creativeId": "my_creativeId",
    *   //   "dealsStatus": "my_dealsStatus",
    *   //   "declaredClickThroughUrls": [],
    *   //   "detectedAdvertiserIds": [],
    *   //   "detectedDomains": [],
    *   //   "detectedLanguages": [],
    *   //   "detectedProductCategories": [],
    *   //   "detectedSensitiveCategories": [],
    *   //   "html": {},
    *   //   "impressionTrackingUrls": [],
    *   //   "native": {},
    *   //   "openAuctionStatus": "my_openAuctionStatus",
    *   //   "restrictedCategories": [],
    *   //   "servingRestrictions": [],
    *   //   "vendorIds": [],
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
  def get(params: ParamsResourceAccountsCreativesGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceAccountsCreativesGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaListCreativesResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListCreativesResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListCreativesResponse] = js.native
  def list(params: ParamsResourceAccountsCreativesList): GaxiosPromise[SchemaListCreativesResponse] = js.native
  def list(
    params: ParamsResourceAccountsCreativesList,
    callback: BodyResponseCallback[SchemaListCreativesResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceAccountsCreativesList,
    options: BodyResponseCallback[Readable | SchemaListCreativesResponse],
    callback: BodyResponseCallback[Readable | SchemaListCreativesResponse]
  ): Unit = js.native
  def list(params: ParamsResourceAccountsCreativesList, options: MethodOptions): GaxiosPromise[SchemaListCreativesResponse] = js.native
  def list(
    params: ParamsResourceAccountsCreativesList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListCreativesResponse]
  ): Unit = js.native
  /**
    * Lists creatives.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/adexchangebuyer2.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const adexchangebuyer2 = google.adexchangebuyer2('v2beta1');
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
    *   const res = await adexchangebuyer2.accounts.creatives.list({
    *     // The account to list the creatives from. Specify "-" to list all creatives the current user has access to.
    *     accountId: 'placeholder-value',
    *     // Requested page size. The server may return fewer creatives than requested (due to timeout constraint) even if more are available via another call. If unspecified, server will pick an appropriate default. Acceptable values are 1 to 1000, inclusive.
    *     pageSize: 'placeholder-value',
    *     // A token identifying a page of results the server should return. Typically, this is the value of ListCreativesResponse.next_page_token returned from the previous call to 'ListCreatives' method.
    *     pageToken: 'placeholder-value',
    *     // An optional query string to filter creatives. If no filter is specified, all active creatives will be returned. Supported queries are: - accountId=*account_id_string* - creativeId=*creative_id_string* - dealsStatus: {approved, conditionally_approved, disapproved, not_checked\} - openAuctionStatus: {approved, conditionally_approved, disapproved, not_checked\} - attribute: {a numeric attribute from the list of attributes\} - disapprovalReason: {a reason from DisapprovalReason\} Example: 'accountId=12345 AND (dealsStatus:disapproved AND disapprovalReason:unacceptable_content) OR attribute:47'
    *     query: 'placeholder-value',
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
  def list(params: ParamsResourceAccountsCreativesList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceAccountsCreativesList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def stopWatching(): GaxiosPromise[SchemaEmpty] = js.native
  def stopWatching(callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def stopWatching(params: Unit, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def stopWatching(params: ParamsResourceAccountsCreativesStopwatching): GaxiosPromise[SchemaEmpty] = js.native
  def stopWatching(params: ParamsResourceAccountsCreativesStopwatching, callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def stopWatching(
    params: ParamsResourceAccountsCreativesStopwatching,
    options: BodyResponseCallback[Readable | SchemaEmpty],
    callback: BodyResponseCallback[Readable | SchemaEmpty]
  ): Unit = js.native
  def stopWatching(params: ParamsResourceAccountsCreativesStopwatching, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def stopWatching(
    params: ParamsResourceAccountsCreativesStopwatching,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  /**
    * Stops watching a creative. Will stop push notifications being sent to the topics when the creative changes status.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/adexchangebuyer2.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const adexchangebuyer2 = google.adexchangebuyer2('v2beta1');
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
    *   const res = await adexchangebuyer2.accounts.creatives.stopWatching({
    *     // The account of the creative to stop notifications for.
    *     accountId: 'placeholder-value',
    *     // The creative ID of the creative to stop notifications for. Specify "-" to specify stopping account level notifications.
    *     creativeId: 'placeholder-value',
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
    *   // {}
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
  def stopWatching(params: ParamsResourceAccountsCreativesStopwatching, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def stopWatching(
    params: ParamsResourceAccountsCreativesStopwatching,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def update(): GaxiosPromise[SchemaCreative] = js.native
  def update(callback: BodyResponseCallback[SchemaCreative]): Unit = js.native
  def update(params: Unit, options: MethodOptions): GaxiosPromise[SchemaCreative] = js.native
  def update(params: ParamsResourceAccountsCreativesUpdate): GaxiosPromise[SchemaCreative] = js.native
  def update(params: ParamsResourceAccountsCreativesUpdate, callback: BodyResponseCallback[SchemaCreative]): Unit = js.native
  def update(
    params: ParamsResourceAccountsCreativesUpdate,
    options: BodyResponseCallback[Readable | SchemaCreative],
    callback: BodyResponseCallback[Readable | SchemaCreative]
  ): Unit = js.native
  def update(params: ParamsResourceAccountsCreativesUpdate, options: MethodOptions): GaxiosPromise[SchemaCreative] = js.native
  def update(
    params: ParamsResourceAccountsCreativesUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaCreative]
  ): Unit = js.native
  /**
    * Updates a creative.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/adexchangebuyer2.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const adexchangebuyer2 = google.adexchangebuyer2('v2beta1');
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
    *   const res = await adexchangebuyer2.accounts.creatives.update({
    *     // The account that this creative belongs to. Can be used to filter the response of the creatives.list method.
    *     accountId: 'placeholder-value',
    *     // The buyer-defined creative ID of this creative. Can be used to filter the response of the creatives.list method.
    *     creativeId: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "accountId": "my_accountId",
    *       //   "adChoicesDestinationUrl": "my_adChoicesDestinationUrl",
    *       //   "adTechnologyProviders": {},
    *       //   "advertiserName": "my_advertiserName",
    *       //   "agencyId": "my_agencyId",
    *       //   "apiUpdateTime": "my_apiUpdateTime",
    *       //   "attributes": [],
    *       //   "clickThroughUrls": [],
    *       //   "corrections": [],
    *       //   "creativeId": "my_creativeId",
    *       //   "dealsStatus": "my_dealsStatus",
    *       //   "declaredClickThroughUrls": [],
    *       //   "detectedAdvertiserIds": [],
    *       //   "detectedDomains": [],
    *       //   "detectedLanguages": [],
    *       //   "detectedProductCategories": [],
    *       //   "detectedSensitiveCategories": [],
    *       //   "html": {},
    *       //   "impressionTrackingUrls": [],
    *       //   "native": {},
    *       //   "openAuctionStatus": "my_openAuctionStatus",
    *       //   "restrictedCategories": [],
    *       //   "servingRestrictions": [],
    *       //   "vendorIds": [],
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
    *   //   "adTechnologyProviders": {},
    *   //   "advertiserName": "my_advertiserName",
    *   //   "agencyId": "my_agencyId",
    *   //   "apiUpdateTime": "my_apiUpdateTime",
    *   //   "attributes": [],
    *   //   "clickThroughUrls": [],
    *   //   "corrections": [],
    *   //   "creativeId": "my_creativeId",
    *   //   "dealsStatus": "my_dealsStatus",
    *   //   "declaredClickThroughUrls": [],
    *   //   "detectedAdvertiserIds": [],
    *   //   "detectedDomains": [],
    *   //   "detectedLanguages": [],
    *   //   "detectedProductCategories": [],
    *   //   "detectedSensitiveCategories": [],
    *   //   "html": {},
    *   //   "impressionTrackingUrls": [],
    *   //   "native": {},
    *   //   "openAuctionStatus": "my_openAuctionStatus",
    *   //   "restrictedCategories": [],
    *   //   "servingRestrictions": [],
    *   //   "vendorIds": [],
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
  def update(params: ParamsResourceAccountsCreativesUpdate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def update(
    params: ParamsResourceAccountsCreativesUpdate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def watch(): GaxiosPromise[SchemaEmpty] = js.native
  def watch(callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def watch(params: Unit, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def watch(params: ParamsResourceAccountsCreativesWatch): GaxiosPromise[SchemaEmpty] = js.native
  def watch(params: ParamsResourceAccountsCreativesWatch, callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def watch(
    params: ParamsResourceAccountsCreativesWatch,
    options: BodyResponseCallback[Readable | SchemaEmpty],
    callback: BodyResponseCallback[Readable | SchemaEmpty]
  ): Unit = js.native
  def watch(params: ParamsResourceAccountsCreativesWatch, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def watch(
    params: ParamsResourceAccountsCreativesWatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  /**
    * Watches a creative. Will result in push notifications being sent to the topic when the creative changes status.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/adexchangebuyer2.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const adexchangebuyer2 = google.adexchangebuyer2('v2beta1');
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
    *   const res = await adexchangebuyer2.accounts.creatives.watch({
    *     // The account of the creative to watch.
    *     accountId: 'placeholder-value',
    *     // The creative ID to watch for status changes. Specify "-" to watch all creatives under the above account. If both creative-level and account-level notifications are sent, only a single notification will be sent to the creative-level notification topic.
    *     creativeId: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "topic": "my_topic"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {}
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
  def watch(params: ParamsResourceAccountsCreativesWatch, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def watch(
    params: ParamsResourceAccountsCreativesWatch,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
