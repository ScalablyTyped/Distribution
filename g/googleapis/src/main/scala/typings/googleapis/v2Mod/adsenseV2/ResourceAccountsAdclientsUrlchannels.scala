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

@JSImport("googleapis/build/src/apis/adsense/v2", "adsense_v2.Resource$Accounts$Adclients$Urlchannels")
@js.native
open class ResourceAccountsAdclientsUrlchannels protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def get(): GaxiosPromise[SchemaUrlChannel] = js.native
  def get(callback: BodyResponseCallback[SchemaUrlChannel]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaUrlChannel] = js.native
  def get(params: ParamsResourceAccountsAdclientsUrlchannelsGet): GaxiosPromise[SchemaUrlChannel] = js.native
  def get(
    params: ParamsResourceAccountsAdclientsUrlchannelsGet,
    callback: BodyResponseCallback[SchemaUrlChannel]
  ): Unit = js.native
  def get(
    params: ParamsResourceAccountsAdclientsUrlchannelsGet,
    options: BodyResponseCallback[Readable | SchemaUrlChannel],
    callback: BodyResponseCallback[Readable | SchemaUrlChannel]
  ): Unit = js.native
  def get(params: ParamsResourceAccountsAdclientsUrlchannelsGet, options: MethodOptions): GaxiosPromise[SchemaUrlChannel] = js.native
  def get(
    params: ParamsResourceAccountsAdclientsUrlchannelsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaUrlChannel]
  ): Unit = js.native
  /**
    * Gets information about the selected url channel.
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
    *   const res = await adsense.accounts.adclients.urlchannels.get({
    *     // Required. The name of the url channel to retrieve. Format: accounts/{account\}/adclients/{adclient\}/urlchannels/{urlchannel\}
    *     name: 'accounts/my-account/adclients/my-adclient/urlchannels/my-urlchannel',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "name": "my_name",
    *   //   "reportingDimensionId": "my_reportingDimensionId",
    *   //   "uriPattern": "my_uriPattern"
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
  def get(params: ParamsResourceAccountsAdclientsUrlchannelsGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceAccountsAdclientsUrlchannelsGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaListUrlChannelsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListUrlChannelsResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListUrlChannelsResponse] = js.native
  def list(params: ParamsResourceAccountsAdclientsUrlchannelsList): GaxiosPromise[SchemaListUrlChannelsResponse] = js.native
  def list(
    params: ParamsResourceAccountsAdclientsUrlchannelsList,
    callback: BodyResponseCallback[SchemaListUrlChannelsResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceAccountsAdclientsUrlchannelsList,
    options: BodyResponseCallback[Readable | SchemaListUrlChannelsResponse],
    callback: BodyResponseCallback[Readable | SchemaListUrlChannelsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceAccountsAdclientsUrlchannelsList, options: MethodOptions): GaxiosPromise[SchemaListUrlChannelsResponse] = js.native
  def list(
    params: ParamsResourceAccountsAdclientsUrlchannelsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListUrlChannelsResponse]
  ): Unit = js.native
  /**
    * Lists active url channels.
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
    *   const res = await adsense.accounts.adclients.urlchannels.list({
    *     // The maximum number of url channels to include in the response, used for paging. If unspecified, at most 10000 url channels will be returned. The maximum value is 10000; values above 10000 will be coerced to 10000.
    *     pageSize: 'placeholder-value',
    *     // A page token, received from a previous `ListUrlChannels` call. Provide this to retrieve the subsequent page. When paginating, all other parameters provided to `ListUrlChannels` must match the call that provided the page token.
    *     pageToken: 'placeholder-value',
    *     // Required. The ad client which owns the collection of url channels. Format: accounts/{account\}/adclients/{adclient\}
    *     parent: 'accounts/my-account/adclients/my-adclient',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "nextPageToken": "my_nextPageToken",
    *   //   "urlChannels": []
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
  def list(params: ParamsResourceAccountsAdclientsUrlchannelsList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceAccountsAdclientsUrlchannelsList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
