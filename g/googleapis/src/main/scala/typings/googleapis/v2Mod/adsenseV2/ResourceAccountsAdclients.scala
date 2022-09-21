package typings.googleapis.v2Mod.adsenseV2

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/adsense/v2", "adsense_v2.Resource$Accounts$Adclients")
@js.native
open class ResourceAccountsAdclients protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var adunits: ResourceAccountsAdclientsAdunits = js.native
  
  var context: APIRequestContext = js.native
  
  var customchannels: ResourceAccountsAdclientsCustomchannels = js.native
  
  def get(): GaxiosPromise[SchemaAdClient] = js.native
  def get(callback: BodyResponseCallback[SchemaAdClient]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaAdClient] = js.native
  def get(params: ParamsResourceAccountsAdclientsGet): GaxiosPromise[SchemaAdClient] = js.native
  def get(params: ParamsResourceAccountsAdclientsGet, callback: BodyResponseCallback[SchemaAdClient]): Unit = js.native
  def get(
    params: ParamsResourceAccountsAdclientsGet,
    options: BodyResponseCallback[Readable | SchemaAdClient],
    callback: BodyResponseCallback[Readable | SchemaAdClient]
  ): Unit = js.native
  def get(params: ParamsResourceAccountsAdclientsGet, options: MethodOptions): GaxiosPromise[SchemaAdClient] = js.native
  def get(
    params: ParamsResourceAccountsAdclientsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaAdClient]
  ): Unit = js.native
  /**
    * Gets the ad client from the given resource name.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/adsense.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const adsense = google.adsense('v2');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/adsense',
    *       'https://www.googleapis.com/auth/adsense.readonly',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await adsense.accounts.adclients.get({
    *     // Required. The name of the ad client to retrieve. Format: accounts/{account\}/adclients/{adclient\}
    *     name: 'accounts/my-account/adclients/my-adclient',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "name": "my_name",
    *   //   "productCode": "my_productCode",
    *   //   "reportingDimensionId": "my_reportingDimensionId",
    *   //   "state": "my_state"
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
  def get(params: ParamsResourceAccountsAdclientsGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceAccountsAdclientsGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def getAdcode(): GaxiosPromise[SchemaAdClientAdCode] = js.native
  def getAdcode(callback: BodyResponseCallback[SchemaAdClientAdCode]): Unit = js.native
  def getAdcode(params: Unit, options: MethodOptions): GaxiosPromise[SchemaAdClientAdCode] = js.native
  def getAdcode(params: ParamsResourceAccountsAdclientsGetadcode): GaxiosPromise[SchemaAdClientAdCode] = js.native
  def getAdcode(
    params: ParamsResourceAccountsAdclientsGetadcode,
    callback: BodyResponseCallback[SchemaAdClientAdCode]
  ): Unit = js.native
  def getAdcode(
    params: ParamsResourceAccountsAdclientsGetadcode,
    options: BodyResponseCallback[Readable | SchemaAdClientAdCode],
    callback: BodyResponseCallback[Readable | SchemaAdClientAdCode]
  ): Unit = js.native
  def getAdcode(params: ParamsResourceAccountsAdclientsGetadcode, options: MethodOptions): GaxiosPromise[SchemaAdClientAdCode] = js.native
  def getAdcode(
    params: ParamsResourceAccountsAdclientsGetadcode,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaAdClientAdCode]
  ): Unit = js.native
  /**
    * Gets the AdSense code for a given ad client. This returns what was previously known as the 'auto ad code'. This is only supported for ad clients with a product_code of AFC. For more information, see [About the AdSense code](https://support.google.com/adsense/answer/9274634).
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/adsense.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const adsense = google.adsense('v2');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/adsense',
    *       'https://www.googleapis.com/auth/adsense.readonly',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await adsense.accounts.adclients.getAdcode({
    *     // Required. Name of the ad client for which to get the adcode. Format: accounts/{account\}/adclients/{adclient\}
    *     name: 'accounts/my-account/adclients/my-adclient',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "adCode": "my_adCode",
    *   //   "ampBody": "my_ampBody",
    *   //   "ampHead": "my_ampHead"
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
  def getAdcode(params: ParamsResourceAccountsAdclientsGetadcode, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def getAdcode(
    params: ParamsResourceAccountsAdclientsGetadcode,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaListAdClientsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListAdClientsResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListAdClientsResponse] = js.native
  def list(params: ParamsResourceAccountsAdclientsList): GaxiosPromise[SchemaListAdClientsResponse] = js.native
  def list(
    params: ParamsResourceAccountsAdclientsList,
    callback: BodyResponseCallback[SchemaListAdClientsResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceAccountsAdclientsList,
    options: BodyResponseCallback[Readable | SchemaListAdClientsResponse],
    callback: BodyResponseCallback[Readable | SchemaListAdClientsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceAccountsAdclientsList, options: MethodOptions): GaxiosPromise[SchemaListAdClientsResponse] = js.native
  def list(
    params: ParamsResourceAccountsAdclientsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListAdClientsResponse]
  ): Unit = js.native
  /**
    * Lists all the ad clients available in an account.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/adsense.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const adsense = google.adsense('v2');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/adsense',
    *       'https://www.googleapis.com/auth/adsense.readonly',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await adsense.accounts.adclients.list({
    *     // The maximum number of ad clients to include in the response, used for paging. If unspecified, at most 10000 ad clients will be returned. The maximum value is 10000; values above 10000 will be coerced to 10000.
    *     pageSize: 'placeholder-value',
    *     // A page token, received from a previous `ListAdClients` call. Provide this to retrieve the subsequent page. When paginating, all other parameters provided to `ListAdClients` must match the call that provided the page token.
    *     pageToken: 'placeholder-value',
    *     // Required. The account which owns the collection of ad clients. Format: accounts/{account\}
    *     parent: 'accounts/my-account',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "adClients": [],
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
  def list(params: ParamsResourceAccountsAdclientsList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceAccountsAdclientsList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  var urlchannels: ResourceAccountsAdclientsUrlchannels = js.native
}
