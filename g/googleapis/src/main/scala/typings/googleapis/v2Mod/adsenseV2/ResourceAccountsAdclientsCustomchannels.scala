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

@JSImport("googleapis/build/src/apis/adsense/v2", "adsense_v2.Resource$Accounts$Adclients$Customchannels")
@js.native
open class ResourceAccountsAdclientsCustomchannels protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def get(): GaxiosPromise[SchemaCustomChannel] = js.native
  def get(callback: BodyResponseCallback[SchemaCustomChannel]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaCustomChannel] = js.native
  def get(params: ParamsResourceAccountsAdclientsCustomchannelsGet): GaxiosPromise[SchemaCustomChannel] = js.native
  def get(
    params: ParamsResourceAccountsAdclientsCustomchannelsGet,
    callback: BodyResponseCallback[SchemaCustomChannel]
  ): Unit = js.native
  def get(
    params: ParamsResourceAccountsAdclientsCustomchannelsGet,
    options: BodyResponseCallback[Readable | SchemaCustomChannel],
    callback: BodyResponseCallback[Readable | SchemaCustomChannel]
  ): Unit = js.native
  def get(params: ParamsResourceAccountsAdclientsCustomchannelsGet, options: MethodOptions): GaxiosPromise[SchemaCustomChannel] = js.native
  def get(
    params: ParamsResourceAccountsAdclientsCustomchannelsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaCustomChannel]
  ): Unit = js.native
  /**
    * Gets information about the selected custom channel.
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
    *   const res = await adsense.accounts.adclients.customchannels.get({
    *     // Required. Name of the custom channel. Format: accounts/{account\}/adclients/{adclient\}/customchannels/{customchannel\}
    *     name: 'accounts/my-account/adclients/my-adclient/customchannels/my-customchannel',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "displayName": "my_displayName",
    *   //   "name": "my_name",
    *   //   "reportingDimensionId": "my_reportingDimensionId"
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
  def get(params: ParamsResourceAccountsAdclientsCustomchannelsGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceAccountsAdclientsCustomchannelsGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaListCustomChannelsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListCustomChannelsResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListCustomChannelsResponse] = js.native
  def list(params: ParamsResourceAccountsAdclientsCustomchannelsList): GaxiosPromise[SchemaListCustomChannelsResponse] = js.native
  def list(
    params: ParamsResourceAccountsAdclientsCustomchannelsList,
    callback: BodyResponseCallback[SchemaListCustomChannelsResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceAccountsAdclientsCustomchannelsList,
    options: BodyResponseCallback[Readable | SchemaListCustomChannelsResponse],
    callback: BodyResponseCallback[Readable | SchemaListCustomChannelsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceAccountsAdclientsCustomchannelsList, options: MethodOptions): GaxiosPromise[SchemaListCustomChannelsResponse] = js.native
  def list(
    params: ParamsResourceAccountsAdclientsCustomchannelsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListCustomChannelsResponse]
  ): Unit = js.native
  /**
    * Lists all the custom channels available in an ad client.
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
    *   const res = await adsense.accounts.adclients.customchannels.list({
    *     // The maximum number of custom channels to include in the response, used for paging. If unspecified, at most 10000 custom channels will be returned. The maximum value is 10000; values above 10000 will be coerced to 10000.
    *     pageSize: 'placeholder-value',
    *     // A page token, received from a previous `ListCustomChannels` call. Provide this to retrieve the subsequent page. When paginating, all other parameters provided to `ListCustomChannels` must match the call that provided the page token.
    *     pageToken: 'placeholder-value',
    *     // Required. The ad client which owns the collection of custom channels. Format: accounts/{account\}/adclients/{adclient\}
    *     parent: 'accounts/my-account/adclients/my-adclient',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "customChannels": [],
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
  def list(params: ParamsResourceAccountsAdclientsCustomchannelsList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceAccountsAdclientsCustomchannelsList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def listLinkedAdUnits(): GaxiosPromise[SchemaListLinkedAdUnitsResponse] = js.native
  def listLinkedAdUnits(callback: BodyResponseCallback[SchemaListLinkedAdUnitsResponse]): Unit = js.native
  def listLinkedAdUnits(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListLinkedAdUnitsResponse] = js.native
  def listLinkedAdUnits(params: ParamsResourceAccountsAdclientsCustomchannelsListlinkedadunits): GaxiosPromise[SchemaListLinkedAdUnitsResponse] = js.native
  def listLinkedAdUnits(
    params: ParamsResourceAccountsAdclientsCustomchannelsListlinkedadunits,
    callback: BodyResponseCallback[SchemaListLinkedAdUnitsResponse]
  ): Unit = js.native
  def listLinkedAdUnits(
    params: ParamsResourceAccountsAdclientsCustomchannelsListlinkedadunits,
    options: BodyResponseCallback[Readable | SchemaListLinkedAdUnitsResponse],
    callback: BodyResponseCallback[Readable | SchemaListLinkedAdUnitsResponse]
  ): Unit = js.native
  def listLinkedAdUnits(params: ParamsResourceAccountsAdclientsCustomchannelsListlinkedadunits, options: MethodOptions): GaxiosPromise[SchemaListLinkedAdUnitsResponse] = js.native
  def listLinkedAdUnits(
    params: ParamsResourceAccountsAdclientsCustomchannelsListlinkedadunits,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListLinkedAdUnitsResponse]
  ): Unit = js.native
  /**
    * Lists all the ad units available for a custom channel.
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
    *   const res = await adsense.accounts.adclients.customchannels.listLinkedAdUnits(
    *     {
    *       // The maximum number of ad units to include in the response, used for paging. If unspecified, at most 10000 ad units will be returned. The maximum value is 10000; values above 10000 will be coerced to 10000.
    *       pageSize: 'placeholder-value',
    *       // A page token, received from a previous `ListLinkedAdUnits` call. Provide this to retrieve the subsequent page. When paginating, all other parameters provided to `ListLinkedAdUnits` must match the call that provided the page token.
    *       pageToken: 'placeholder-value',
    *       // Required. The custom channel which owns the collection of ad units. Format: accounts/{account\}/adclients/{adclient\}/customchannels/{customchannel\}
    *       parent:
    *         'accounts/my-account/adclients/my-adclient/customchannels/my-customchannel',
    *     }
    *   );
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "adUnits": [],
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
  def listLinkedAdUnits(
    params: ParamsResourceAccountsAdclientsCustomchannelsListlinkedadunits,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def listLinkedAdUnits(
    params: ParamsResourceAccountsAdclientsCustomchannelsListlinkedadunits,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
