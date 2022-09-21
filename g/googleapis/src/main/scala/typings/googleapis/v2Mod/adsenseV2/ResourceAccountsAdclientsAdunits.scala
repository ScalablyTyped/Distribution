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

@JSImport("googleapis/build/src/apis/adsense/v2", "adsense_v2.Resource$Accounts$Adclients$Adunits")
@js.native
open class ResourceAccountsAdclientsAdunits protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def get(): GaxiosPromise[SchemaAdUnit] = js.native
  def get(callback: BodyResponseCallback[SchemaAdUnit]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaAdUnit] = js.native
  def get(params: ParamsResourceAccountsAdclientsAdunitsGet): GaxiosPromise[SchemaAdUnit] = js.native
  def get(params: ParamsResourceAccountsAdclientsAdunitsGet, callback: BodyResponseCallback[SchemaAdUnit]): Unit = js.native
  def get(
    params: ParamsResourceAccountsAdclientsAdunitsGet,
    options: BodyResponseCallback[Readable | SchemaAdUnit],
    callback: BodyResponseCallback[Readable | SchemaAdUnit]
  ): Unit = js.native
  def get(params: ParamsResourceAccountsAdclientsAdunitsGet, options: MethodOptions): GaxiosPromise[SchemaAdUnit] = js.native
  def get(
    params: ParamsResourceAccountsAdclientsAdunitsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaAdUnit]
  ): Unit = js.native
  /**
    * Gets an ad unit from a specified account and ad client.
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
    *   const res = await adsense.accounts.adclients.adunits.get({
    *     // Required. AdUnit to get information about. Format: accounts/{account\}/adclients/{adclient\}/adunits/{adunit\}
    *     name: 'accounts/my-account/adclients/my-adclient/adunits/my-adunit',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "contentAdsSettings": {},
    *   //   "displayName": "my_displayName",
    *   //   "name": "my_name",
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
  def get(params: ParamsResourceAccountsAdclientsAdunitsGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceAccountsAdclientsAdunitsGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def getAdcode(): GaxiosPromise[SchemaAdUnitAdCode] = js.native
  def getAdcode(callback: BodyResponseCallback[SchemaAdUnitAdCode]): Unit = js.native
  def getAdcode(params: Unit, options: MethodOptions): GaxiosPromise[SchemaAdUnitAdCode] = js.native
  def getAdcode(params: ParamsResourceAccountsAdclientsAdunitsGetadcode): GaxiosPromise[SchemaAdUnitAdCode] = js.native
  def getAdcode(
    params: ParamsResourceAccountsAdclientsAdunitsGetadcode,
    callback: BodyResponseCallback[SchemaAdUnitAdCode]
  ): Unit = js.native
  def getAdcode(
    params: ParamsResourceAccountsAdclientsAdunitsGetadcode,
    options: BodyResponseCallback[Readable | SchemaAdUnitAdCode],
    callback: BodyResponseCallback[Readable | SchemaAdUnitAdCode]
  ): Unit = js.native
  def getAdcode(params: ParamsResourceAccountsAdclientsAdunitsGetadcode, options: MethodOptions): GaxiosPromise[SchemaAdUnitAdCode] = js.native
  def getAdcode(
    params: ParamsResourceAccountsAdclientsAdunitsGetadcode,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaAdUnitAdCode]
  ): Unit = js.native
  /**
    * Gets the ad unit code for a given ad unit. For more information, see [About the AdSense code](https://support.google.com/adsense/answer/9274634) and [Where to place the ad code in your HTML](https://support.google.com/adsense/answer/9190028).
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
    *   const res = await adsense.accounts.adclients.adunits.getAdcode({
    *     // Required. Name of the adunit for which to get the adcode. Format: accounts/{account\}/adclients/{adclient\}/adunits/{adunit\}
    *     name: 'accounts/my-account/adclients/my-adclient/adunits/my-adunit',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "adCode": "my_adCode"
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
  def getAdcode(params: ParamsResourceAccountsAdclientsAdunitsGetadcode, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def getAdcode(
    params: ParamsResourceAccountsAdclientsAdunitsGetadcode,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaListAdUnitsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListAdUnitsResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListAdUnitsResponse] = js.native
  def list(params: ParamsResourceAccountsAdclientsAdunitsList): GaxiosPromise[SchemaListAdUnitsResponse] = js.native
  def list(
    params: ParamsResourceAccountsAdclientsAdunitsList,
    callback: BodyResponseCallback[SchemaListAdUnitsResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceAccountsAdclientsAdunitsList,
    options: BodyResponseCallback[Readable | SchemaListAdUnitsResponse],
    callback: BodyResponseCallback[Readable | SchemaListAdUnitsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceAccountsAdclientsAdunitsList, options: MethodOptions): GaxiosPromise[SchemaListAdUnitsResponse] = js.native
  def list(
    params: ParamsResourceAccountsAdclientsAdunitsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListAdUnitsResponse]
  ): Unit = js.native
  /**
    * Lists all ad units under a specified account and ad client.
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
    *   const res = await adsense.accounts.adclients.adunits.list({
    *     // The maximum number of ad units to include in the response, used for paging. If unspecified, at most 10000 ad units will be returned. The maximum value is 10000; values above 10000 will be coerced to 10000.
    *     pageSize: 'placeholder-value',
    *     // A page token, received from a previous `ListAdUnits` call. Provide this to retrieve the subsequent page. When paginating, all other parameters provided to `ListAdUnits` must match the call that provided the page token.
    *     pageToken: 'placeholder-value',
    *     // Required. The ad client which owns the collection of ad units. Format: accounts/{account\}/adclients/{adclient\}
    *     parent: 'accounts/my-account/adclients/my-adclient',
    *   });
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
  def list(params: ParamsResourceAccountsAdclientsAdunitsList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceAccountsAdclientsAdunitsList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def listLinkedCustomChannels(): GaxiosPromise[SchemaListLinkedCustomChannelsResponse] = js.native
  def listLinkedCustomChannels(callback: BodyResponseCallback[SchemaListLinkedCustomChannelsResponse]): Unit = js.native
  def listLinkedCustomChannels(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListLinkedCustomChannelsResponse] = js.native
  def listLinkedCustomChannels(params: ParamsResourceAccountsAdclientsAdunitsListlinkedcustomchannels): GaxiosPromise[SchemaListLinkedCustomChannelsResponse] = js.native
  def listLinkedCustomChannels(
    params: ParamsResourceAccountsAdclientsAdunitsListlinkedcustomchannels,
    callback: BodyResponseCallback[SchemaListLinkedCustomChannelsResponse]
  ): Unit = js.native
  def listLinkedCustomChannels(
    params: ParamsResourceAccountsAdclientsAdunitsListlinkedcustomchannels,
    options: BodyResponseCallback[Readable | SchemaListLinkedCustomChannelsResponse],
    callback: BodyResponseCallback[Readable | SchemaListLinkedCustomChannelsResponse]
  ): Unit = js.native
  def listLinkedCustomChannels(params: ParamsResourceAccountsAdclientsAdunitsListlinkedcustomchannels, options: MethodOptions): GaxiosPromise[SchemaListLinkedCustomChannelsResponse] = js.native
  def listLinkedCustomChannels(
    params: ParamsResourceAccountsAdclientsAdunitsListlinkedcustomchannels,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListLinkedCustomChannelsResponse]
  ): Unit = js.native
  /**
    * Lists all the custom channels available for an ad unit.
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
    *   const res = await adsense.accounts.adclients.adunits.listLinkedCustomChannels(
    *     {
    *       // The maximum number of custom channels to include in the response, used for paging. If unspecified, at most 10000 custom channels will be returned. The maximum value is 10000; values above 10000 will be coerced to 10000.
    *       pageSize: 'placeholder-value',
    *       // A page token, received from a previous `ListLinkedCustomChannels` call. Provide this to retrieve the subsequent page. When paginating, all other parameters provided to `ListLinkedCustomChannels` must match the call that provided the page token.
    *       pageToken: 'placeholder-value',
    *       // Required. The ad unit which owns the collection of custom channels. Format: accounts/{account\}/adclients/{adclient\}/adunits/{adunit\}
    *       parent: 'accounts/my-account/adclients/my-adclient/adunits/my-adunit',
    *     }
    *   );
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
  def listLinkedCustomChannels(
    params: ParamsResourceAccountsAdclientsAdunitsListlinkedcustomchannels,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def listLinkedCustomChannels(
    params: ParamsResourceAccountsAdclientsAdunitsListlinkedcustomchannels,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
