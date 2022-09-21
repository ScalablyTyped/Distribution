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

@JSImport("googleapis/build/src/apis/realtimebidding/v1", "realtimebidding_v1.Resource$Bidders")
@js.native
open class ResourceBidders protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  var creatives: ResourceBiddersCreatives = js.native
  
  var endpoints: ResourceBiddersEndpoints = js.native
  
  def get(): GaxiosPromise[SchemaBidder] = js.native
  def get(callback: BodyResponseCallback[SchemaBidder]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaBidder] = js.native
  def get(params: ParamsResourceBiddersGet): GaxiosPromise[SchemaBidder] = js.native
  def get(params: ParamsResourceBiddersGet, callback: BodyResponseCallback[SchemaBidder]): Unit = js.native
  def get(
    params: ParamsResourceBiddersGet,
    options: BodyResponseCallback[Readable | SchemaBidder],
    callback: BodyResponseCallback[Readable | SchemaBidder]
  ): Unit = js.native
  def get(params: ParamsResourceBiddersGet, options: MethodOptions): GaxiosPromise[SchemaBidder] = js.native
  def get(
    params: ParamsResourceBiddersGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaBidder]
  ): Unit = js.native
  /**
    * Gets a bidder account by its name.
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
    *   const res = await realtimebidding.bidders.get({
    *     // Required. Name of the bidder to get. Format: `bidders/{bidderAccountId\}`
    *     name: 'bidders/my-bidder',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "bypassNonguaranteedDealsPretargeting": false,
    *   //   "cookieMatchingNetworkId": "my_cookieMatchingNetworkId",
    *   //   "cookieMatchingUrl": "my_cookieMatchingUrl",
    *   //   "dealsBillingId": "my_dealsBillingId",
    *   //   "name": "my_name"
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
  def get(params: ParamsResourceBiddersGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceBiddersGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaListBiddersResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListBiddersResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListBiddersResponse] = js.native
  def list(params: ParamsResourceBiddersList): GaxiosPromise[SchemaListBiddersResponse] = js.native
  def list(params: ParamsResourceBiddersList, callback: BodyResponseCallback[SchemaListBiddersResponse]): Unit = js.native
  def list(
    params: ParamsResourceBiddersList,
    options: BodyResponseCallback[Readable | SchemaListBiddersResponse],
    callback: BodyResponseCallback[Readable | SchemaListBiddersResponse]
  ): Unit = js.native
  def list(params: ParamsResourceBiddersList, options: MethodOptions): GaxiosPromise[SchemaListBiddersResponse] = js.native
  def list(
    params: ParamsResourceBiddersList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListBiddersResponse]
  ): Unit = js.native
  /**
    * Lists all the bidder accounts that belong to the caller.
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
    *   const res = await realtimebidding.bidders.list({
    *     // The maximum number of bidders to return. If unspecified, at most 100 bidders will be returned. The maximum value is 500; values above 500 will be coerced to 500.
    *     pageSize: 'placeholder-value',
    *     // A token identifying a page of results the server should return. This value is received from a previous `ListBidders` call in ListBiddersResponse.nextPageToken.
    *     pageToken: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "bidders": [],
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
  def list(params: ParamsResourceBiddersList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceBiddersList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  var pretargetingConfigs: ResourceBiddersPretargetingconfigs = js.native
  
  var publisherConnections: ResourceBiddersPublisherconnections = js.native
}
