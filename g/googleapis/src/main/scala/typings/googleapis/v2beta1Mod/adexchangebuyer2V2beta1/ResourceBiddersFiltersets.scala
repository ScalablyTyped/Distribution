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

@JSImport("googleapis/build/src/apis/adexchangebuyer2/v2beta1", "adexchangebuyer2_v2beta1.Resource$Bidders$Filtersets")
@js.native
open class ResourceBiddersFiltersets protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var bidMetrics: ResourceBiddersFiltersetsBidmetrics = js.native
  
  var bidResponseErrors: ResourceBiddersFiltersetsBidresponseerrors = js.native
  
  var bidResponsesWithoutBids: ResourceBiddersFiltersetsBidresponseswithoutbids = js.native
  
  var context: APIRequestContext = js.native
  
  def create(): GaxiosPromise[SchemaFilterSet] = js.native
  def create(callback: BodyResponseCallback[SchemaFilterSet]): Unit = js.native
  def create(params: Unit, options: MethodOptions): GaxiosPromise[SchemaFilterSet] = js.native
  def create(params: ParamsResourceBiddersFiltersetsCreate): GaxiosPromise[SchemaFilterSet] = js.native
  def create(params: ParamsResourceBiddersFiltersetsCreate, callback: BodyResponseCallback[SchemaFilterSet]): Unit = js.native
  def create(
    params: ParamsResourceBiddersFiltersetsCreate,
    options: BodyResponseCallback[Readable | SchemaFilterSet],
    callback: BodyResponseCallback[Readable | SchemaFilterSet]
  ): Unit = js.native
  def create(params: ParamsResourceBiddersFiltersetsCreate, options: MethodOptions): GaxiosPromise[SchemaFilterSet] = js.native
  def create(
    params: ParamsResourceBiddersFiltersetsCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaFilterSet]
  ): Unit = js.native
  /**
    * Creates the specified filter set for the account with the given account ID.
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
    *   const res = await adexchangebuyer2.bidders.filterSets.create({
    *     // Whether the filter set is transient, or should be persisted indefinitely. By default, filter sets are not transient. If transient, it will be available for at least 1 hour after creation.
    *     isTransient: 'placeholder-value',
    *     // Name of the owner (bidder or account) of the filter set to be created. For example: - For a bidder-level filter set for bidder 123: `bidders/123` - For an account-level filter set for the buyer account representing bidder 123: `bidders/123/accounts/123` - For an account-level filter set for the child seat buyer account 456 whose bidder is 123: `bidders/123/accounts/456`
    *     ownerName: 'bidders/my-bidder',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "absoluteDateRange": {},
    *       //   "breakdownDimensions": [],
    *       //   "creativeId": "my_creativeId",
    *       //   "dealId": "my_dealId",
    *       //   "environment": "my_environment",
    *       //   "format": "my_format",
    *       //   "formats": [],
    *       //   "name": "my_name",
    *       //   "platforms": [],
    *       //   "publisherIdentifiers": [],
    *       //   "realtimeTimeRange": {},
    *       //   "relativeDateRange": {},
    *       //   "sellerNetworkIds": [],
    *       //   "timeSeriesGranularity": "my_timeSeriesGranularity"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "absoluteDateRange": {},
    *   //   "breakdownDimensions": [],
    *   //   "creativeId": "my_creativeId",
    *   //   "dealId": "my_dealId",
    *   //   "environment": "my_environment",
    *   //   "format": "my_format",
    *   //   "formats": [],
    *   //   "name": "my_name",
    *   //   "platforms": [],
    *   //   "publisherIdentifiers": [],
    *   //   "realtimeTimeRange": {},
    *   //   "relativeDateRange": {},
    *   //   "sellerNetworkIds": [],
    *   //   "timeSeriesGranularity": "my_timeSeriesGranularity"
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
  def create(params: ParamsResourceBiddersFiltersetsCreate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def create(
    params: ParamsResourceBiddersFiltersetsCreate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def delete(): GaxiosPromise[SchemaEmpty] = js.native
  def delete(callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def delete(params: ParamsResourceBiddersFiltersetsDelete): GaxiosPromise[SchemaEmpty] = js.native
  def delete(params: ParamsResourceBiddersFiltersetsDelete, callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def delete(
    params: ParamsResourceBiddersFiltersetsDelete,
    options: BodyResponseCallback[Readable | SchemaEmpty],
    callback: BodyResponseCallback[Readable | SchemaEmpty]
  ): Unit = js.native
  def delete(params: ParamsResourceBiddersFiltersetsDelete, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def delete(
    params: ParamsResourceBiddersFiltersetsDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  /**
    * Deletes the requested filter set from the account with the given account ID.
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
    *   const res = await adexchangebuyer2.bidders.filterSets.delete({
    *     // Full name of the resource to delete. For example: - For a bidder-level filter set for bidder 123: `bidders/123/filterSets/abc` - For an account-level filter set for the buyer account representing bidder 123: `bidders/123/accounts/123/filterSets/abc` - For an account-level filter set for the child seat buyer account 456 whose bidder is 123: `bidders/123/accounts/456/filterSets/abc`
    *     name: 'bidders/my-bidder/filterSets/my-filterSet',
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
  def delete(params: ParamsResourceBiddersFiltersetsDelete, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def delete(
    params: ParamsResourceBiddersFiltersetsDelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  var filteredBidRequests: ResourceBiddersFiltersetsFilteredbidrequests = js.native
  
  var filteredBids: ResourceBiddersFiltersetsFilteredbids = js.native
  
  def get(): GaxiosPromise[SchemaFilterSet] = js.native
  def get(callback: BodyResponseCallback[SchemaFilterSet]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaFilterSet] = js.native
  def get(params: ParamsResourceBiddersFiltersetsGet): GaxiosPromise[SchemaFilterSet] = js.native
  def get(params: ParamsResourceBiddersFiltersetsGet, callback: BodyResponseCallback[SchemaFilterSet]): Unit = js.native
  def get(
    params: ParamsResourceBiddersFiltersetsGet,
    options: BodyResponseCallback[Readable | SchemaFilterSet],
    callback: BodyResponseCallback[Readable | SchemaFilterSet]
  ): Unit = js.native
  def get(params: ParamsResourceBiddersFiltersetsGet, options: MethodOptions): GaxiosPromise[SchemaFilterSet] = js.native
  def get(
    params: ParamsResourceBiddersFiltersetsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaFilterSet]
  ): Unit = js.native
  /**
    * Retrieves the requested filter set for the account with the given account ID.
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
    *   const res = await adexchangebuyer2.bidders.filterSets.get({
    *     // Full name of the resource being requested. For example: - For a bidder-level filter set for bidder 123: `bidders/123/filterSets/abc` - For an account-level filter set for the buyer account representing bidder 123: `bidders/123/accounts/123/filterSets/abc` - For an account-level filter set for the child seat buyer account 456 whose bidder is 123: `bidders/123/accounts/456/filterSets/abc`
    *     name: 'bidders/my-bidder/filterSets/my-filterSet',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "absoluteDateRange": {},
    *   //   "breakdownDimensions": [],
    *   //   "creativeId": "my_creativeId",
    *   //   "dealId": "my_dealId",
    *   //   "environment": "my_environment",
    *   //   "format": "my_format",
    *   //   "formats": [],
    *   //   "name": "my_name",
    *   //   "platforms": [],
    *   //   "publisherIdentifiers": [],
    *   //   "realtimeTimeRange": {},
    *   //   "relativeDateRange": {},
    *   //   "sellerNetworkIds": [],
    *   //   "timeSeriesGranularity": "my_timeSeriesGranularity"
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
  def get(params: ParamsResourceBiddersFiltersetsGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceBiddersFiltersetsGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  var impressionMetrics: ResourceBiddersFiltersetsImpressionmetrics = js.native
  
  def list(): GaxiosPromise[SchemaListFilterSetsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListFilterSetsResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListFilterSetsResponse] = js.native
  def list(params: ParamsResourceBiddersFiltersetsList): GaxiosPromise[SchemaListFilterSetsResponse] = js.native
  def list(
    params: ParamsResourceBiddersFiltersetsList,
    callback: BodyResponseCallback[SchemaListFilterSetsResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceBiddersFiltersetsList,
    options: BodyResponseCallback[Readable | SchemaListFilterSetsResponse],
    callback: BodyResponseCallback[Readable | SchemaListFilterSetsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceBiddersFiltersetsList, options: MethodOptions): GaxiosPromise[SchemaListFilterSetsResponse] = js.native
  def list(
    params: ParamsResourceBiddersFiltersetsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListFilterSetsResponse]
  ): Unit = js.native
  /**
    * Lists all filter sets for the account with the given account ID.
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
    *   const res = await adexchangebuyer2.bidders.filterSets.list({
    *     // Name of the owner (bidder or account) of the filter sets to be listed. For example: - For a bidder-level filter set for bidder 123: `bidders/123` - For an account-level filter set for the buyer account representing bidder 123: `bidders/123/accounts/123` - For an account-level filter set for the child seat buyer account 456 whose bidder is 123: `bidders/123/accounts/456`
    *     ownerName: 'bidders/my-bidder',
    *     // Requested page size. The server may return fewer results than requested. If unspecified, the server will pick an appropriate default.
    *     pageSize: 'placeholder-value',
    *     // A token identifying a page of results the server should return. Typically, this is the value of ListFilterSetsResponse.nextPageToken returned from the previous call to the accounts.filterSets.list method.
    *     pageToken: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "filterSets": [],
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
  def list(params: ParamsResourceBiddersFiltersetsList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceBiddersFiltersetsList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  var losingBids: ResourceBiddersFiltersetsLosingbids = js.native
  
  var nonBillableWinningBids: ResourceBiddersFiltersetsNonbillablewinningbids = js.native
}
