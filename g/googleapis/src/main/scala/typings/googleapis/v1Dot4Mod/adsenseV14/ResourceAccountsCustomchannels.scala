package typings.googleapis.v1Dot4Mod.adsenseV14

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/adsense/v1.4", "adsense_v1_4.Resource$Accounts$Customchannels")
@js.native
open class ResourceAccountsCustomchannels protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var adunits: ResourceAccountsCustomchannelsAdunits = js.native
  
  var context: APIRequestContext = js.native
  
  def get(): GaxiosPromise[SchemaCustomChannel] = js.native
  def get(callback: BodyResponseCallback[SchemaCustomChannel]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaCustomChannel] = js.native
  def get(params: ParamsResourceAccountsCustomchannelsGet): GaxiosPromise[SchemaCustomChannel] = js.native
  def get(
    params: ParamsResourceAccountsCustomchannelsGet,
    callback: BodyResponseCallback[SchemaCustomChannel]
  ): Unit = js.native
  def get(
    params: ParamsResourceAccountsCustomchannelsGet,
    options: BodyResponseCallback[Readable | SchemaCustomChannel],
    callback: BodyResponseCallback[Readable | SchemaCustomChannel]
  ): Unit = js.native
  def get(params: ParamsResourceAccountsCustomchannelsGet, options: MethodOptions): GaxiosPromise[SchemaCustomChannel] = js.native
  def get(
    params: ParamsResourceAccountsCustomchannelsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaCustomChannel]
  ): Unit = js.native
  /**
    * Get the specified custom channel from the specified ad client for the specified account.
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
    * const adsense = google.adsense('v1.4');
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
    *   const res = await adsense.accounts.customchannels.get({
    *     // Account to which the ad client belongs.
    *     accountId: 'placeholder-value',
    *     // Ad client which contains the custom channel.
    *     adClientId: 'placeholder-value',
    *     // Custom channel to retrieve.
    *     customChannelId: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "code": "my_code",
    *   //   "id": "my_id",
    *   //   "kind": "my_kind",
    *   //   "name": "my_name",
    *   //   "targetingInfo": {}
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
  def get(params: ParamsResourceAccountsCustomchannelsGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceAccountsCustomchannelsGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaCustomChannels] = js.native
  def list(callback: BodyResponseCallback[SchemaCustomChannels]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaCustomChannels] = js.native
  def list(params: ParamsResourceAccountsCustomchannelsList): GaxiosPromise[SchemaCustomChannels] = js.native
  def list(
    params: ParamsResourceAccountsCustomchannelsList,
    callback: BodyResponseCallback[SchemaCustomChannels]
  ): Unit = js.native
  def list(
    params: ParamsResourceAccountsCustomchannelsList,
    options: BodyResponseCallback[Readable | SchemaCustomChannels],
    callback: BodyResponseCallback[Readable | SchemaCustomChannels]
  ): Unit = js.native
  def list(params: ParamsResourceAccountsCustomchannelsList, options: MethodOptions): GaxiosPromise[SchemaCustomChannels] = js.native
  def list(
    params: ParamsResourceAccountsCustomchannelsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaCustomChannels]
  ): Unit = js.native
  /**
    * List all custom channels in the specified ad client for the specified account.
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
    * const adsense = google.adsense('v1.4');
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
    *   const res = await adsense.accounts.customchannels.list({
    *     // Account to which the ad client belongs.
    *     accountId: 'placeholder-value',
    *     // Ad client for which to list custom channels.
    *     adClientId: 'placeholder-value',
    *     // The maximum number of custom channels to include in the response, used for paging.
    *     maxResults: 'placeholder-value',
    *     // A continuation token, used to page through custom channels. To retrieve the next page, set this parameter to the value of "nextPageToken" from the previous response.
    *     pageToken: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "etag": "my_etag",
    *   //   "items": [],
    *   //   "kind": "my_kind",
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
  def list(params: ParamsResourceAccountsCustomchannelsList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceAccountsCustomchannelsList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
