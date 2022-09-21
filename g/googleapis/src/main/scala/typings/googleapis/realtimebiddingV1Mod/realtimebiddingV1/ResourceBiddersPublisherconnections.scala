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

@JSImport("googleapis/build/src/apis/realtimebidding/v1", "realtimebidding_v1.Resource$Bidders$Publisherconnections")
@js.native
open class ResourceBiddersPublisherconnections protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  def batchApprove(): GaxiosPromise[SchemaBatchApprovePublisherConnectionsResponse] = js.native
  def batchApprove(callback: BodyResponseCallback[SchemaBatchApprovePublisherConnectionsResponse]): Unit = js.native
  def batchApprove(params: Unit, options: MethodOptions): GaxiosPromise[SchemaBatchApprovePublisherConnectionsResponse] = js.native
  def batchApprove(params: ParamsResourceBiddersPublisherconnectionsBatchapprove): GaxiosPromise[SchemaBatchApprovePublisherConnectionsResponse] = js.native
  def batchApprove(
    params: ParamsResourceBiddersPublisherconnectionsBatchapprove,
    callback: BodyResponseCallback[SchemaBatchApprovePublisherConnectionsResponse]
  ): Unit = js.native
  def batchApprove(
    params: ParamsResourceBiddersPublisherconnectionsBatchapprove,
    options: BodyResponseCallback[Readable | SchemaBatchApprovePublisherConnectionsResponse],
    callback: BodyResponseCallback[Readable | SchemaBatchApprovePublisherConnectionsResponse]
  ): Unit = js.native
  def batchApprove(params: ParamsResourceBiddersPublisherconnectionsBatchapprove, options: MethodOptions): GaxiosPromise[SchemaBatchApprovePublisherConnectionsResponse] = js.native
  def batchApprove(
    params: ParamsResourceBiddersPublisherconnectionsBatchapprove,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaBatchApprovePublisherConnectionsResponse]
  ): Unit = js.native
  /**
    * Batch approves multiple publisher connections.
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
    *   const res = await realtimebidding.bidders.publisherConnections.batchApprove({
    *     // Required. The bidder for whom publisher connections will be approved. Format: `bidders/{bidder\}` where `{bidder\}` is the account ID of the bidder.
    *     parent: 'bidders/my-bidder',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "names": []
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "publisherConnections": []
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
  def batchApprove(params: ParamsResourceBiddersPublisherconnectionsBatchapprove, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def batchApprove(
    params: ParamsResourceBiddersPublisherconnectionsBatchapprove,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def batchReject(): GaxiosPromise[SchemaBatchRejectPublisherConnectionsResponse] = js.native
  def batchReject(callback: BodyResponseCallback[SchemaBatchRejectPublisherConnectionsResponse]): Unit = js.native
  def batchReject(params: Unit, options: MethodOptions): GaxiosPromise[SchemaBatchRejectPublisherConnectionsResponse] = js.native
  def batchReject(params: ParamsResourceBiddersPublisherconnectionsBatchreject): GaxiosPromise[SchemaBatchRejectPublisherConnectionsResponse] = js.native
  def batchReject(
    params: ParamsResourceBiddersPublisherconnectionsBatchreject,
    callback: BodyResponseCallback[SchemaBatchRejectPublisherConnectionsResponse]
  ): Unit = js.native
  def batchReject(
    params: ParamsResourceBiddersPublisherconnectionsBatchreject,
    options: BodyResponseCallback[Readable | SchemaBatchRejectPublisherConnectionsResponse],
    callback: BodyResponseCallback[Readable | SchemaBatchRejectPublisherConnectionsResponse]
  ): Unit = js.native
  def batchReject(params: ParamsResourceBiddersPublisherconnectionsBatchreject, options: MethodOptions): GaxiosPromise[SchemaBatchRejectPublisherConnectionsResponse] = js.native
  def batchReject(
    params: ParamsResourceBiddersPublisherconnectionsBatchreject,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaBatchRejectPublisherConnectionsResponse]
  ): Unit = js.native
  /**
    * Batch rejects multiple publisher connections.
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
    *   const res = await realtimebidding.bidders.publisherConnections.batchReject({
    *     // Required. The bidder for whom publisher connections will be rejected. Format: `bidders/{bidder\}` where `{bidder\}` is the account ID of the bidder.
    *     parent: 'bidders/my-bidder',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "names": []
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "publisherConnections": []
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
  def batchReject(params: ParamsResourceBiddersPublisherconnectionsBatchreject, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def batchReject(
    params: ParamsResourceBiddersPublisherconnectionsBatchreject,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  var context: APIRequestContext = js.native
  
  def get(): GaxiosPromise[SchemaPublisherConnection] = js.native
  def get(callback: BodyResponseCallback[SchemaPublisherConnection]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaPublisherConnection] = js.native
  def get(params: ParamsResourceBiddersPublisherconnectionsGet): GaxiosPromise[SchemaPublisherConnection] = js.native
  def get(
    params: ParamsResourceBiddersPublisherconnectionsGet,
    callback: BodyResponseCallback[SchemaPublisherConnection]
  ): Unit = js.native
  def get(
    params: ParamsResourceBiddersPublisherconnectionsGet,
    options: BodyResponseCallback[Readable | SchemaPublisherConnection],
    callback: BodyResponseCallback[Readable | SchemaPublisherConnection]
  ): Unit = js.native
  def get(params: ParamsResourceBiddersPublisherconnectionsGet, options: MethodOptions): GaxiosPromise[SchemaPublisherConnection] = js.native
  def get(
    params: ParamsResourceBiddersPublisherconnectionsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaPublisherConnection]
  ): Unit = js.native
  /**
    * Gets a publisher connection.
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
    *   const res = await realtimebidding.bidders.publisherConnections.get({
    *     // Required. Name of the publisher whose connection information is to be retrieved. In the pattern `bidders/{bidder\}/publisherConnections/{publisher\}` where `{bidder\}` is the account ID of the bidder, and `{publisher\}` is the ads.txt/app-ads.txt publisher ID. See publisherConnection.name.
    *     name: 'bidders/my-bidder/publisherConnections/my-publisherConnection',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "biddingState": "my_biddingState",
    *   //   "createTime": "my_createTime",
    *   //   "displayName": "my_displayName",
    *   //   "name": "my_name",
    *   //   "publisherPlatform": "my_publisherPlatform"
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
  def get(params: ParamsResourceBiddersPublisherconnectionsGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceBiddersPublisherconnectionsGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaListPublisherConnectionsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListPublisherConnectionsResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListPublisherConnectionsResponse] = js.native
  def list(params: ParamsResourceBiddersPublisherconnectionsList): GaxiosPromise[SchemaListPublisherConnectionsResponse] = js.native
  def list(
    params: ParamsResourceBiddersPublisherconnectionsList,
    callback: BodyResponseCallback[SchemaListPublisherConnectionsResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceBiddersPublisherconnectionsList,
    options: BodyResponseCallback[Readable | SchemaListPublisherConnectionsResponse],
    callback: BodyResponseCallback[Readable | SchemaListPublisherConnectionsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceBiddersPublisherconnectionsList, options: MethodOptions): GaxiosPromise[SchemaListPublisherConnectionsResponse] = js.native
  def list(
    params: ParamsResourceBiddersPublisherconnectionsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListPublisherConnectionsResponse]
  ): Unit = js.native
  /**
    * Lists publisher connections for a given bidder.
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
    *   const res = await realtimebidding.bidders.publisherConnections.list({
    *     // Query string to filter publisher connections. Connections can be filtered by `displayName`, `publisherPlatform`, and `biddingState`. If no filter is specified, all publisher connections will be returned. Example: 'displayName="Great Publisher*" AND publisherPlatform=ADMOB AND biddingState != PENDING' See https://google.aip.dev/160 for more information about filtering syntax.
    *     filter: 'placeholder-value',
    *     // Order specification by which results should be sorted. If no sort order is specified, the results will be returned in an arbitrary order. Currently results can be sorted by `createTime`. Example: 'createTime DESC'.
    *     orderBy: 'placeholder-value',
    *     // Requested page size. The server may return fewer results than requested (due to timeout constraint) even if more are available via another call. If unspecified, the server will pick an appropriate default. Acceptable values are 1 to 5000, inclusive.
    *     pageSize: 'placeholder-value',
    *     // A token identifying a page of results the server should return. Typically, this is the value of ListPublisherConnectionsResponse.nextPageToken returned from the previous call to the 'ListPublisherConnections' method.
    *     pageToken: 'placeholder-value',
    *     // Required. Name of the bidder for which publishers have initiated connections. The pattern for this resource is `bidders/{bidder\}` where `{bidder\}` represents the account ID of the bidder.
    *     parent: 'bidders/my-bidder',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "nextPageToken": "my_nextPageToken",
    *   //   "publisherConnections": []
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
  def list(params: ParamsResourceBiddersPublisherconnectionsList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceBiddersPublisherconnectionsList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
