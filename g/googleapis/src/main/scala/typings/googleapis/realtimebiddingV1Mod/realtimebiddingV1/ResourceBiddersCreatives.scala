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

@JSImport("googleapis/build/src/apis/realtimebidding/v1", "realtimebidding_v1.Resource$Bidders$Creatives")
@js.native
open class ResourceBiddersCreatives protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def list(): GaxiosPromise[SchemaListCreativesResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListCreativesResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListCreativesResponse] = js.native
  def list(params: ParamsResourceBiddersCreativesList): GaxiosPromise[SchemaListCreativesResponse] = js.native
  def list(
    params: ParamsResourceBiddersCreativesList,
    callback: BodyResponseCallback[SchemaListCreativesResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceBiddersCreativesList,
    options: BodyResponseCallback[Readable | SchemaListCreativesResponse],
    callback: BodyResponseCallback[Readable | SchemaListCreativesResponse]
  ): Unit = js.native
  def list(params: ParamsResourceBiddersCreativesList, options: MethodOptions): GaxiosPromise[SchemaListCreativesResponse] = js.native
  def list(
    params: ParamsResourceBiddersCreativesList,
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
    *   const res = await realtimebidding.bidders.creatives.list({
    *     // Query string to filter creatives. If no filter is specified, all active creatives will be returned. Example: 'accountId=12345 AND (dealsStatus:DISAPPROVED AND disapprovalReason:UNACCEPTABLE_CONTENT) OR declaredAttributes:IS_COOKIE_TARGETED'
    *     filter: 'placeholder-value',
    *     // Requested page size. The server may return fewer creatives than requested (due to timeout constraint) even if more are available via another call. If unspecified, server will pick an appropriate default. Acceptable values are 1 to 1000, inclusive.
    *     pageSize: 'placeholder-value',
    *     // A token identifying a page of results the server should return. Typically, this is the value of ListCreativesResponse.nextPageToken returned from the previous call to the 'ListCreatives' method. Page tokens for continued pages are valid for up to five hours, counting from the call to 'ListCreatives' for the first page.
    *     pageToken: 'placeholder-value',
    *     // Required. Name of the parent buyer that owns the creatives. The pattern for this resource is either `buyers/{buyerAccountId\}` or `bidders/{bidderAccountId\}`. For `buyers/{buyerAccountId\}`, the `buyerAccountId` can be one of the following: 1. The ID of the buyer that is accessing their own creatives. 2. The ID of the child seat buyer under a bidder account. So for listing creatives pertaining to the child seat buyer (`456`) under bidder account (`123`), you would use the pattern: `buyers/456`. 3. The ID of the bidder itself. So for listing creatives pertaining to bidder (`123`), you would use `buyers/123`. If you want to access all creatives pertaining to both the bidder and all of its child seat accounts, you would use `bidders/{bidderAccountId\}`, e.g., for all creatives pertaining to bidder (`123`), use `bidders/123`.
    *     parent: 'bidders/my-bidder',
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
  def list(params: ParamsResourceBiddersCreativesList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceBiddersCreativesList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def watch(): GaxiosPromise[SchemaWatchCreativesResponse] = js.native
  def watch(callback: BodyResponseCallback[SchemaWatchCreativesResponse]): Unit = js.native
  def watch(params: Unit, options: MethodOptions): GaxiosPromise[SchemaWatchCreativesResponse] = js.native
  def watch(params: ParamsResourceBiddersCreativesWatch): GaxiosPromise[SchemaWatchCreativesResponse] = js.native
  def watch(
    params: ParamsResourceBiddersCreativesWatch,
    callback: BodyResponseCallback[SchemaWatchCreativesResponse]
  ): Unit = js.native
  def watch(
    params: ParamsResourceBiddersCreativesWatch,
    options: BodyResponseCallback[Readable | SchemaWatchCreativesResponse],
    callback: BodyResponseCallback[Readable | SchemaWatchCreativesResponse]
  ): Unit = js.native
  def watch(params: ParamsResourceBiddersCreativesWatch, options: MethodOptions): GaxiosPromise[SchemaWatchCreativesResponse] = js.native
  def watch(
    params: ParamsResourceBiddersCreativesWatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaWatchCreativesResponse]
  ): Unit = js.native
  /**
    * Watches all creatives pertaining to a bidder. It is sufficient to invoke this endpoint once per bidder. A Pub/Sub topic will be created and notifications will be pushed to the topic when any of the bidder's creatives change status. All of the bidder's service accounts will have access to read from the topic. Subsequent invocations of this method will return the existing Pub/Sub configuration.
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
    *   const res = await realtimebidding.bidders.creatives.watch({
    *     // Required. To watch all creatives pertaining to the bidder and all its child seat accounts, the bidder must follow the pattern `bidders/{bidderAccountId\}`.
    *     parent: 'bidders/my-bidder',
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
    *   //   "subscription": "my_subscription",
    *   //   "topic": "my_topic"
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
  def watch(params: ParamsResourceBiddersCreativesWatch, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def watch(
    params: ParamsResourceBiddersCreativesWatch,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
