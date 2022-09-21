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

@JSImport("googleapis/build/src/apis/adexchangebuyer2/v2beta1", "adexchangebuyer2_v2beta1.Resource$Bidders$Filtersets$Bidresponseerrors")
@js.native
open class ResourceBiddersFiltersetsBidresponseerrors protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def list(): GaxiosPromise[SchemaListBidResponseErrorsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListBidResponseErrorsResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListBidResponseErrorsResponse] = js.native
  def list(params: ParamsResourceBiddersFiltersetsBidresponseerrorsList): GaxiosPromise[SchemaListBidResponseErrorsResponse] = js.native
  def list(
    params: ParamsResourceBiddersFiltersetsBidresponseerrorsList,
    callback: BodyResponseCallback[SchemaListBidResponseErrorsResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceBiddersFiltersetsBidresponseerrorsList,
    options: BodyResponseCallback[Readable | SchemaListBidResponseErrorsResponse],
    callback: BodyResponseCallback[Readable | SchemaListBidResponseErrorsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceBiddersFiltersetsBidresponseerrorsList, options: MethodOptions): GaxiosPromise[SchemaListBidResponseErrorsResponse] = js.native
  def list(
    params: ParamsResourceBiddersFiltersetsBidresponseerrorsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListBidResponseErrorsResponse]
  ): Unit = js.native
  /**
    * List all errors that occurred in bid responses, with the number of bid responses affected for each reason.
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
    *   const res = await adexchangebuyer2.bidders.filterSets.bidResponseErrors.list({
    *     // Name of the filter set that should be applied to the requested metrics. For example: - For a bidder-level filter set for bidder 123: `bidders/123/filterSets/abc` - For an account-level filter set for the buyer account representing bidder 123: `bidders/123/accounts/123/filterSets/abc` - For an account-level filter set for the child seat buyer account 456 whose bidder is 123: `bidders/123/accounts/456/filterSets/abc`
    *     filterSetName: 'bidders/my-bidder/filterSets/my-filterSet',
    *     // Requested page size. The server may return fewer results than requested. If unspecified, the server will pick an appropriate default.
    *     pageSize: 'placeholder-value',
    *     // A token identifying a page of results the server should return. Typically, this is the value of ListBidResponseErrorsResponse.nextPageToken returned from the previous call to the bidResponseErrors.list method.
    *     pageToken: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "calloutStatusRows": [],
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
  def list(params: ParamsResourceBiddersFiltersetsBidresponseerrorsList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceBiddersFiltersetsBidresponseerrorsList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
