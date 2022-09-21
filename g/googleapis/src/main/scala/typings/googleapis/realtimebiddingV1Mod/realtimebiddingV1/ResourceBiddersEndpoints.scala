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

@JSImport("googleapis/build/src/apis/realtimebidding/v1", "realtimebidding_v1.Resource$Bidders$Endpoints")
@js.native
open class ResourceBiddersEndpoints protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def get(): GaxiosPromise[SchemaEndpoint] = js.native
  def get(callback: BodyResponseCallback[SchemaEndpoint]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaEndpoint] = js.native
  def get(params: ParamsResourceBiddersEndpointsGet): GaxiosPromise[SchemaEndpoint] = js.native
  def get(params: ParamsResourceBiddersEndpointsGet, callback: BodyResponseCallback[SchemaEndpoint]): Unit = js.native
  def get(
    params: ParamsResourceBiddersEndpointsGet,
    options: BodyResponseCallback[Readable | SchemaEndpoint],
    callback: BodyResponseCallback[Readable | SchemaEndpoint]
  ): Unit = js.native
  def get(params: ParamsResourceBiddersEndpointsGet, options: MethodOptions): GaxiosPromise[SchemaEndpoint] = js.native
  def get(
    params: ParamsResourceBiddersEndpointsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEndpoint]
  ): Unit = js.native
  /**
    * Gets a bidder endpoint by its name.
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
    *   const res = await realtimebidding.bidders.endpoints.get({
    *     // Required. Name of the bidder endpoint to get. Format: `bidders/{bidderAccountId\}/endpoints/{endpointId\}`
    *     name: 'bidders/my-bidder/endpoints/my-endpoint',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "bidProtocol": "my_bidProtocol",
    *   //   "maximumQps": "my_maximumQps",
    *   //   "name": "my_name",
    *   //   "tradingLocation": "my_tradingLocation",
    *   //   "url": "my_url"
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
  def get(params: ParamsResourceBiddersEndpointsGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceBiddersEndpointsGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaListEndpointsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListEndpointsResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListEndpointsResponse] = js.native
  def list(params: ParamsResourceBiddersEndpointsList): GaxiosPromise[SchemaListEndpointsResponse] = js.native
  def list(
    params: ParamsResourceBiddersEndpointsList,
    callback: BodyResponseCallback[SchemaListEndpointsResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceBiddersEndpointsList,
    options: BodyResponseCallback[Readable | SchemaListEndpointsResponse],
    callback: BodyResponseCallback[Readable | SchemaListEndpointsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceBiddersEndpointsList, options: MethodOptions): GaxiosPromise[SchemaListEndpointsResponse] = js.native
  def list(
    params: ParamsResourceBiddersEndpointsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListEndpointsResponse]
  ): Unit = js.native
  /**
    * Lists all the bidder's endpoints.
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
    *   const res = await realtimebidding.bidders.endpoints.list({
    *     // The maximum number of endpoints to return. If unspecified, at most 100 endpoints will be returned. The maximum value is 500; values above 500 will be coerced to 500.
    *     pageSize: 'placeholder-value',
    *     // A token identifying a page of results the server should return. This value is received from a previous `ListEndpoints` call in ListEndpointsResponse.nextPageToken.
    *     pageToken: 'placeholder-value',
    *     // Required. Name of the bidder whose endpoints will be listed. Format: `bidders/{bidderAccountId\}`
    *     parent: 'bidders/my-bidder',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "endpoints": [],
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
  def list(params: ParamsResourceBiddersEndpointsList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceBiddersEndpointsList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def patch(): GaxiosPromise[SchemaEndpoint] = js.native
  def patch(callback: BodyResponseCallback[SchemaEndpoint]): Unit = js.native
  def patch(params: Unit, options: MethodOptions): GaxiosPromise[SchemaEndpoint] = js.native
  def patch(params: ParamsResourceBiddersEndpointsPatch): GaxiosPromise[SchemaEndpoint] = js.native
  def patch(params: ParamsResourceBiddersEndpointsPatch, callback: BodyResponseCallback[SchemaEndpoint]): Unit = js.native
  def patch(
    params: ParamsResourceBiddersEndpointsPatch,
    options: BodyResponseCallback[Readable | SchemaEndpoint],
    callback: BodyResponseCallback[Readable | SchemaEndpoint]
  ): Unit = js.native
  def patch(params: ParamsResourceBiddersEndpointsPatch, options: MethodOptions): GaxiosPromise[SchemaEndpoint] = js.native
  def patch(
    params: ParamsResourceBiddersEndpointsPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEndpoint]
  ): Unit = js.native
  /**
    * Updates a bidder's endpoint.
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
    *   const res = await realtimebidding.bidders.endpoints.patch({
    *     // Output only. Name of the endpoint resource that must follow the pattern `bidders/{bidderAccountId\}/endpoints/{endpointId\}`, where {bidderAccountId\} is the account ID of the bidder who operates this endpoint, and {endpointId\} is a unique ID assigned by the server.
    *     name: 'bidders/my-bidder/endpoints/my-endpoint',
    *     // Field mask to use for partial in-place updates.
    *     updateMask: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "bidProtocol": "my_bidProtocol",
    *       //   "maximumQps": "my_maximumQps",
    *       //   "name": "my_name",
    *       //   "tradingLocation": "my_tradingLocation",
    *       //   "url": "my_url"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "bidProtocol": "my_bidProtocol",
    *   //   "maximumQps": "my_maximumQps",
    *   //   "name": "my_name",
    *   //   "tradingLocation": "my_tradingLocation",
    *   //   "url": "my_url"
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
  def patch(params: ParamsResourceBiddersEndpointsPatch, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def patch(
    params: ParamsResourceBiddersEndpointsPatch,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
