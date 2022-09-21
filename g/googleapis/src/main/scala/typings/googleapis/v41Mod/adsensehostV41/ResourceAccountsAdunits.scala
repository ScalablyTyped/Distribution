package typings.googleapis.v41Mod.adsensehostV41

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/adsensehost/v4.1", "adsensehost_v4_1.Resource$Accounts$Adunits")
@js.native
open class ResourceAccountsAdunits protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def delete(): GaxiosPromise[SchemaAdUnit] = js.native
  def delete(callback: BodyResponseCallback[SchemaAdUnit]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[SchemaAdUnit] = js.native
  def delete(params: ParamsResourceAccountsAdunitsDelete): GaxiosPromise[SchemaAdUnit] = js.native
  def delete(params: ParamsResourceAccountsAdunitsDelete, callback: BodyResponseCallback[SchemaAdUnit]): Unit = js.native
  def delete(
    params: ParamsResourceAccountsAdunitsDelete,
    options: BodyResponseCallback[Readable | SchemaAdUnit],
    callback: BodyResponseCallback[Readable | SchemaAdUnit]
  ): Unit = js.native
  def delete(params: ParamsResourceAccountsAdunitsDelete, options: MethodOptions): GaxiosPromise[SchemaAdUnit] = js.native
  def delete(
    params: ParamsResourceAccountsAdunitsDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaAdUnit]
  ): Unit = js.native
  /**
    * Delete the specified ad unit from the specified publisher AdSense account.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/adsensehost.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const adsensehost = google.adsensehost('v4.1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/adsensehost'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await adsensehost.accounts.adunits.delete({
    *     // Account which contains the ad unit.
    *     accountId: 'placeholder-value',
    *     // Ad client for which to get ad unit.
    *     adClientId: 'placeholder-value',
    *     // Ad unit to delete.
    *     adUnitId: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "code": "my_code",
    *   //   "contentAdsSettings": {},
    *   //   "customStyle": {},
    *   //   "id": "my_id",
    *   //   "kind": "my_kind",
    *   //   "mobileContentAdsSettings": {},
    *   //   "name": "my_name",
    *   //   "status": "my_status"
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
  def delete(params: ParamsResourceAccountsAdunitsDelete, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def delete(
    params: ParamsResourceAccountsAdunitsDelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def get(): GaxiosPromise[SchemaAdUnit] = js.native
  def get(callback: BodyResponseCallback[SchemaAdUnit]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaAdUnit] = js.native
  def get(params: ParamsResourceAccountsAdunitsGet): GaxiosPromise[SchemaAdUnit] = js.native
  def get(params: ParamsResourceAccountsAdunitsGet, callback: BodyResponseCallback[SchemaAdUnit]): Unit = js.native
  def get(
    params: ParamsResourceAccountsAdunitsGet,
    options: BodyResponseCallback[Readable | SchemaAdUnit],
    callback: BodyResponseCallback[Readable | SchemaAdUnit]
  ): Unit = js.native
  def get(params: ParamsResourceAccountsAdunitsGet, options: MethodOptions): GaxiosPromise[SchemaAdUnit] = js.native
  def get(
    params: ParamsResourceAccountsAdunitsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaAdUnit]
  ): Unit = js.native
  /**
    * Get the specified host ad unit in this AdSense account.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/adsensehost.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const adsensehost = google.adsensehost('v4.1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/adsensehost'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await adsensehost.accounts.adunits.get({
    *     // Account which contains the ad unit.
    *     accountId: 'placeholder-value',
    *     // Ad client for which to get ad unit.
    *     adClientId: 'placeholder-value',
    *     // Ad unit to get.
    *     adUnitId: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "code": "my_code",
    *   //   "contentAdsSettings": {},
    *   //   "customStyle": {},
    *   //   "id": "my_id",
    *   //   "kind": "my_kind",
    *   //   "mobileContentAdsSettings": {},
    *   //   "name": "my_name",
    *   //   "status": "my_status"
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
  def get(params: ParamsResourceAccountsAdunitsGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceAccountsAdunitsGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def getAdCode(): GaxiosPromise[SchemaAdCode] = js.native
  def getAdCode(callback: BodyResponseCallback[SchemaAdCode]): Unit = js.native
  def getAdCode(params: Unit, options: MethodOptions): GaxiosPromise[SchemaAdCode] = js.native
  def getAdCode(params: ParamsResourceAccountsAdunitsGetadcode): GaxiosPromise[SchemaAdCode] = js.native
  def getAdCode(params: ParamsResourceAccountsAdunitsGetadcode, callback: BodyResponseCallback[SchemaAdCode]): Unit = js.native
  def getAdCode(
    params: ParamsResourceAccountsAdunitsGetadcode,
    options: BodyResponseCallback[Readable | SchemaAdCode],
    callback: BodyResponseCallback[Readable | SchemaAdCode]
  ): Unit = js.native
  def getAdCode(params: ParamsResourceAccountsAdunitsGetadcode, options: MethodOptions): GaxiosPromise[SchemaAdCode] = js.native
  def getAdCode(
    params: ParamsResourceAccountsAdunitsGetadcode,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaAdCode]
  ): Unit = js.native
  /**
    * Get ad code for the specified ad unit, attaching the specified host custom channels.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/adsensehost.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const adsensehost = google.adsensehost('v4.1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/adsensehost'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await adsensehost.accounts.adunits.getAdCode({
    *     // Account which contains the ad client.
    *     accountId: 'placeholder-value',
    *     // Ad client with contains the ad unit.
    *     adClientId: 'placeholder-value',
    *     // Ad unit to get the code for.
    *     adUnitId: 'placeholder-value',
    *     // Host custom channel to attach to the ad code.
    *     hostCustomChannelId: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "adCode": "my_adCode",
    *   //   "kind": "my_kind"
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
  def getAdCode(params: ParamsResourceAccountsAdunitsGetadcode, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def getAdCode(
    params: ParamsResourceAccountsAdunitsGetadcode,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def insert(): GaxiosPromise[SchemaAdUnit] = js.native
  def insert(callback: BodyResponseCallback[SchemaAdUnit]): Unit = js.native
  def insert(params: Unit, options: MethodOptions): GaxiosPromise[SchemaAdUnit] = js.native
  def insert(params: ParamsResourceAccountsAdunitsInsert): GaxiosPromise[SchemaAdUnit] = js.native
  def insert(params: ParamsResourceAccountsAdunitsInsert, callback: BodyResponseCallback[SchemaAdUnit]): Unit = js.native
  def insert(
    params: ParamsResourceAccountsAdunitsInsert,
    options: BodyResponseCallback[Readable | SchemaAdUnit],
    callback: BodyResponseCallback[Readable | SchemaAdUnit]
  ): Unit = js.native
  def insert(params: ParamsResourceAccountsAdunitsInsert, options: MethodOptions): GaxiosPromise[SchemaAdUnit] = js.native
  def insert(
    params: ParamsResourceAccountsAdunitsInsert,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaAdUnit]
  ): Unit = js.native
  /**
    * Insert the supplied ad unit into the specified publisher AdSense account.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/adsensehost.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const adsensehost = google.adsensehost('v4.1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/adsensehost'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await adsensehost.accounts.adunits.insert({
    *     // Account which will contain the ad unit.
    *     accountId: 'placeholder-value',
    *     // Ad client into which to insert the ad unit.
    *     adClientId: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "code": "my_code",
    *       //   "contentAdsSettings": {},
    *       //   "customStyle": {},
    *       //   "id": "my_id",
    *       //   "kind": "my_kind",
    *       //   "mobileContentAdsSettings": {},
    *       //   "name": "my_name",
    *       //   "status": "my_status"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "code": "my_code",
    *   //   "contentAdsSettings": {},
    *   //   "customStyle": {},
    *   //   "id": "my_id",
    *   //   "kind": "my_kind",
    *   //   "mobileContentAdsSettings": {},
    *   //   "name": "my_name",
    *   //   "status": "my_status"
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
  def insert(params: ParamsResourceAccountsAdunitsInsert, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def insert(
    params: ParamsResourceAccountsAdunitsInsert,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaAdUnits] = js.native
  def list(callback: BodyResponseCallback[SchemaAdUnits]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaAdUnits] = js.native
  def list(params: ParamsResourceAccountsAdunitsList): GaxiosPromise[SchemaAdUnits] = js.native
  def list(params: ParamsResourceAccountsAdunitsList, callback: BodyResponseCallback[SchemaAdUnits]): Unit = js.native
  def list(
    params: ParamsResourceAccountsAdunitsList,
    options: BodyResponseCallback[Readable | SchemaAdUnits],
    callback: BodyResponseCallback[Readable | SchemaAdUnits]
  ): Unit = js.native
  def list(params: ParamsResourceAccountsAdunitsList, options: MethodOptions): GaxiosPromise[SchemaAdUnits] = js.native
  def list(
    params: ParamsResourceAccountsAdunitsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaAdUnits]
  ): Unit = js.native
  /**
    * List all ad units in the specified publisher's AdSense account.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/adsensehost.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const adsensehost = google.adsensehost('v4.1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/adsensehost'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await adsensehost.accounts.adunits.list({
    *     // Account which contains the ad client.
    *     accountId: 'placeholder-value',
    *     // Ad client for which to list ad units.
    *     adClientId: 'placeholder-value',
    *     // Whether to include inactive ad units. Default: true.
    *     includeInactive: 'placeholder-value',
    *     // The maximum number of ad units to include in the response, used for paging.
    *     maxResults: 'placeholder-value',
    *     // A continuation token, used to page through ad units. To retrieve the next page, set this parameter to the value of "nextPageToken" from the previous response.
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
  def list(params: ParamsResourceAccountsAdunitsList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceAccountsAdunitsList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def patch(): GaxiosPromise[SchemaAdUnit] = js.native
  def patch(callback: BodyResponseCallback[SchemaAdUnit]): Unit = js.native
  def patch(params: Unit, options: MethodOptions): GaxiosPromise[SchemaAdUnit] = js.native
  def patch(params: ParamsResourceAccountsAdunitsPatch): GaxiosPromise[SchemaAdUnit] = js.native
  def patch(params: ParamsResourceAccountsAdunitsPatch, callback: BodyResponseCallback[SchemaAdUnit]): Unit = js.native
  def patch(
    params: ParamsResourceAccountsAdunitsPatch,
    options: BodyResponseCallback[Readable | SchemaAdUnit],
    callback: BodyResponseCallback[Readable | SchemaAdUnit]
  ): Unit = js.native
  def patch(params: ParamsResourceAccountsAdunitsPatch, options: MethodOptions): GaxiosPromise[SchemaAdUnit] = js.native
  def patch(
    params: ParamsResourceAccountsAdunitsPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaAdUnit]
  ): Unit = js.native
  /**
    * Update the supplied ad unit in the specified publisher AdSense account. This method supports patch semantics.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/adsensehost.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const adsensehost = google.adsensehost('v4.1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/adsensehost'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await adsensehost.accounts.adunits.patch({
    *     // Account which contains the ad client.
    *     accountId: 'placeholder-value',
    *     // Ad client which contains the ad unit.
    *     adClientId: 'placeholder-value',
    *     // Ad unit to get.
    *     adUnitId: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "code": "my_code",
    *       //   "contentAdsSettings": {},
    *       //   "customStyle": {},
    *       //   "id": "my_id",
    *       //   "kind": "my_kind",
    *       //   "mobileContentAdsSettings": {},
    *       //   "name": "my_name",
    *       //   "status": "my_status"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "code": "my_code",
    *   //   "contentAdsSettings": {},
    *   //   "customStyle": {},
    *   //   "id": "my_id",
    *   //   "kind": "my_kind",
    *   //   "mobileContentAdsSettings": {},
    *   //   "name": "my_name",
    *   //   "status": "my_status"
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
  def patch(params: ParamsResourceAccountsAdunitsPatch, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def patch(
    params: ParamsResourceAccountsAdunitsPatch,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def update(): GaxiosPromise[SchemaAdUnit] = js.native
  def update(callback: BodyResponseCallback[SchemaAdUnit]): Unit = js.native
  def update(params: Unit, options: MethodOptions): GaxiosPromise[SchemaAdUnit] = js.native
  def update(params: ParamsResourceAccountsAdunitsUpdate): GaxiosPromise[SchemaAdUnit] = js.native
  def update(params: ParamsResourceAccountsAdunitsUpdate, callback: BodyResponseCallback[SchemaAdUnit]): Unit = js.native
  def update(
    params: ParamsResourceAccountsAdunitsUpdate,
    options: BodyResponseCallback[Readable | SchemaAdUnit],
    callback: BodyResponseCallback[Readable | SchemaAdUnit]
  ): Unit = js.native
  def update(params: ParamsResourceAccountsAdunitsUpdate, options: MethodOptions): GaxiosPromise[SchemaAdUnit] = js.native
  def update(
    params: ParamsResourceAccountsAdunitsUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaAdUnit]
  ): Unit = js.native
  /**
    * Update the supplied ad unit in the specified publisher AdSense account.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/adsensehost.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const adsensehost = google.adsensehost('v4.1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/adsensehost'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await adsensehost.accounts.adunits.update({
    *     // Account which contains the ad client.
    *     accountId: 'placeholder-value',
    *     // Ad client which contains the ad unit.
    *     adClientId: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "code": "my_code",
    *       //   "contentAdsSettings": {},
    *       //   "customStyle": {},
    *       //   "id": "my_id",
    *       //   "kind": "my_kind",
    *       //   "mobileContentAdsSettings": {},
    *       //   "name": "my_name",
    *       //   "status": "my_status"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "code": "my_code",
    *   //   "contentAdsSettings": {},
    *   //   "customStyle": {},
    *   //   "id": "my_id",
    *   //   "kind": "my_kind",
    *   //   "mobileContentAdsSettings": {},
    *   //   "name": "my_name",
    *   //   "status": "my_status"
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
  def update(params: ParamsResourceAccountsAdunitsUpdate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def update(
    params: ParamsResourceAccountsAdunitsUpdate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
