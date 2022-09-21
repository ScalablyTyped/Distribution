package typings.googleapis.contentV2Mod.contentV2

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/content/v2", "content_v2.Resource$Shippingsettings")
@js.native
open class ResourceShippingsettings protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def custombatch(): GaxiosPromise[SchemaShippingsettingsCustomBatchResponse] = js.native
  def custombatch(callback: BodyResponseCallback[SchemaShippingsettingsCustomBatchResponse]): Unit = js.native
  def custombatch(params: Unit, options: MethodOptions): GaxiosPromise[SchemaShippingsettingsCustomBatchResponse] = js.native
  def custombatch(params: ParamsResourceShippingsettingsCustombatch): GaxiosPromise[SchemaShippingsettingsCustomBatchResponse] = js.native
  def custombatch(
    params: ParamsResourceShippingsettingsCustombatch,
    callback: BodyResponseCallback[SchemaShippingsettingsCustomBatchResponse]
  ): Unit = js.native
  def custombatch(
    params: ParamsResourceShippingsettingsCustombatch,
    options: BodyResponseCallback[Readable | SchemaShippingsettingsCustomBatchResponse],
    callback: BodyResponseCallback[Readable | SchemaShippingsettingsCustomBatchResponse]
  ): Unit = js.native
  def custombatch(params: ParamsResourceShippingsettingsCustombatch, options: MethodOptions): GaxiosPromise[SchemaShippingsettingsCustomBatchResponse] = js.native
  def custombatch(
    params: ParamsResourceShippingsettingsCustombatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaShippingsettingsCustomBatchResponse]
  ): Unit = js.native
  /**
    * Retrieves and updates the shipping settings of multiple accounts in a single request.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/content.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const content = google.content('v2');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/content'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await content.shippingsettings.custombatch({
    *     // Flag to simulate a request like in a live environment. If set to true, dry-run mode checks the validity of the request and returns errors (if any).
    *     dryRun: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "entries": []
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "entries": [],
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
  def custombatch(params: ParamsResourceShippingsettingsCustombatch, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def custombatch(
    params: ParamsResourceShippingsettingsCustombatch,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def get(): GaxiosPromise[SchemaShippingSettings] = js.native
  def get(callback: BodyResponseCallback[SchemaShippingSettings]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaShippingSettings] = js.native
  def get(params: ParamsResourceShippingsettingsGet): GaxiosPromise[SchemaShippingSettings] = js.native
  def get(params: ParamsResourceShippingsettingsGet, callback: BodyResponseCallback[SchemaShippingSettings]): Unit = js.native
  def get(
    params: ParamsResourceShippingsettingsGet,
    options: BodyResponseCallback[Readable | SchemaShippingSettings],
    callback: BodyResponseCallback[Readable | SchemaShippingSettings]
  ): Unit = js.native
  def get(params: ParamsResourceShippingsettingsGet, options: MethodOptions): GaxiosPromise[SchemaShippingSettings] = js.native
  def get(
    params: ParamsResourceShippingsettingsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaShippingSettings]
  ): Unit = js.native
  /**
    * Retrieves the shipping settings of the account.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/content.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const content = google.content('v2');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/content'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await content.shippingsettings.get({
    *     // The ID of the account for which to get/update shipping settings.
    *     accountId: 'placeholder-value',
    *     // The ID of the managing account. If this parameter is not the same as accountId, then this account must be a multi-client account and `accountId` must be the ID of a sub-account of this account.
    *     merchantId: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "accountId": "my_accountId",
    *   //   "postalCodeGroups": [],
    *   //   "services": [],
    *   //   "warehouses": []
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
  def get(params: ParamsResourceShippingsettingsGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceShippingsettingsGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def getsupportedcarriers(): GaxiosPromise[SchemaShippingsettingsGetSupportedCarriersResponse] = js.native
  def getsupportedcarriers(callback: BodyResponseCallback[SchemaShippingsettingsGetSupportedCarriersResponse]): Unit = js.native
  def getsupportedcarriers(params: Unit, options: MethodOptions): GaxiosPromise[SchemaShippingsettingsGetSupportedCarriersResponse] = js.native
  def getsupportedcarriers(params: ParamsResourceShippingsettingsGetsupportedcarriers): GaxiosPromise[SchemaShippingsettingsGetSupportedCarriersResponse] = js.native
  def getsupportedcarriers(
    params: ParamsResourceShippingsettingsGetsupportedcarriers,
    callback: BodyResponseCallback[SchemaShippingsettingsGetSupportedCarriersResponse]
  ): Unit = js.native
  def getsupportedcarriers(
    params: ParamsResourceShippingsettingsGetsupportedcarriers,
    options: BodyResponseCallback[Readable | SchemaShippingsettingsGetSupportedCarriersResponse],
    callback: BodyResponseCallback[Readable | SchemaShippingsettingsGetSupportedCarriersResponse]
  ): Unit = js.native
  def getsupportedcarriers(params: ParamsResourceShippingsettingsGetsupportedcarriers, options: MethodOptions): GaxiosPromise[SchemaShippingsettingsGetSupportedCarriersResponse] = js.native
  def getsupportedcarriers(
    params: ParamsResourceShippingsettingsGetsupportedcarriers,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaShippingsettingsGetSupportedCarriersResponse]
  ): Unit = js.native
  /**
    * Retrieves supported carriers and carrier services for an account.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/content.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const content = google.content('v2');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/content'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await content.shippingsettings.getsupportedcarriers({
    *     // The ID of the account for which to retrieve the supported carriers.
    *     merchantId: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "carriers": [],
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
  def getsupportedcarriers(params: ParamsResourceShippingsettingsGetsupportedcarriers, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def getsupportedcarriers(
    params: ParamsResourceShippingsettingsGetsupportedcarriers,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def getsupportedholidays(): GaxiosPromise[SchemaShippingsettingsGetSupportedHolidaysResponse] = js.native
  def getsupportedholidays(callback: BodyResponseCallback[SchemaShippingsettingsGetSupportedHolidaysResponse]): Unit = js.native
  def getsupportedholidays(params: Unit, options: MethodOptions): GaxiosPromise[SchemaShippingsettingsGetSupportedHolidaysResponse] = js.native
  def getsupportedholidays(params: ParamsResourceShippingsettingsGetsupportedholidays): GaxiosPromise[SchemaShippingsettingsGetSupportedHolidaysResponse] = js.native
  def getsupportedholidays(
    params: ParamsResourceShippingsettingsGetsupportedholidays,
    callback: BodyResponseCallback[SchemaShippingsettingsGetSupportedHolidaysResponse]
  ): Unit = js.native
  def getsupportedholidays(
    params: ParamsResourceShippingsettingsGetsupportedholidays,
    options: BodyResponseCallback[Readable | SchemaShippingsettingsGetSupportedHolidaysResponse],
    callback: BodyResponseCallback[Readable | SchemaShippingsettingsGetSupportedHolidaysResponse]
  ): Unit = js.native
  def getsupportedholidays(params: ParamsResourceShippingsettingsGetsupportedholidays, options: MethodOptions): GaxiosPromise[SchemaShippingsettingsGetSupportedHolidaysResponse] = js.native
  def getsupportedholidays(
    params: ParamsResourceShippingsettingsGetsupportedholidays,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaShippingsettingsGetSupportedHolidaysResponse]
  ): Unit = js.native
  /**
    * Retrieves supported holidays for an account.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/content.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const content = google.content('v2');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/content'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await content.shippingsettings.getsupportedholidays({
    *     // The ID of the account for which to retrieve the supported holidays.
    *     merchantId: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "holidays": [],
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
  def getsupportedholidays(params: ParamsResourceShippingsettingsGetsupportedholidays, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def getsupportedholidays(
    params: ParamsResourceShippingsettingsGetsupportedholidays,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def getsupportedpickupservices(): GaxiosPromise[SchemaShippingsettingsGetSupportedPickupServicesResponse] = js.native
  def getsupportedpickupservices(callback: BodyResponseCallback[SchemaShippingsettingsGetSupportedPickupServicesResponse]): Unit = js.native
  def getsupportedpickupservices(params: Unit, options: MethodOptions): GaxiosPromise[SchemaShippingsettingsGetSupportedPickupServicesResponse] = js.native
  def getsupportedpickupservices(params: ParamsResourceShippingsettingsGetsupportedpickupservices): GaxiosPromise[SchemaShippingsettingsGetSupportedPickupServicesResponse] = js.native
  def getsupportedpickupservices(
    params: ParamsResourceShippingsettingsGetsupportedpickupservices,
    callback: BodyResponseCallback[SchemaShippingsettingsGetSupportedPickupServicesResponse]
  ): Unit = js.native
  def getsupportedpickupservices(
    params: ParamsResourceShippingsettingsGetsupportedpickupservices,
    options: BodyResponseCallback[Readable | SchemaShippingsettingsGetSupportedPickupServicesResponse],
    callback: BodyResponseCallback[Readable | SchemaShippingsettingsGetSupportedPickupServicesResponse]
  ): Unit = js.native
  def getsupportedpickupservices(params: ParamsResourceShippingsettingsGetsupportedpickupservices, options: MethodOptions): GaxiosPromise[SchemaShippingsettingsGetSupportedPickupServicesResponse] = js.native
  def getsupportedpickupservices(
    params: ParamsResourceShippingsettingsGetsupportedpickupservices,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaShippingsettingsGetSupportedPickupServicesResponse]
  ): Unit = js.native
  /**
    * Retrieves supported pickup services for an account.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/content.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const content = google.content('v2');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/content'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await content.shippingsettings.getsupportedpickupservices({
    *     // The ID of the account for which to retrieve the supported pickup services.
    *     merchantId: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "kind": "my_kind",
    *   //   "pickupServices": []
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
  def getsupportedpickupservices(params: ParamsResourceShippingsettingsGetsupportedpickupservices, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def getsupportedpickupservices(
    params: ParamsResourceShippingsettingsGetsupportedpickupservices,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaShippingsettingsListResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaShippingsettingsListResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaShippingsettingsListResponse] = js.native
  def list(params: ParamsResourceShippingsettingsList): GaxiosPromise[SchemaShippingsettingsListResponse] = js.native
  def list(
    params: ParamsResourceShippingsettingsList,
    callback: BodyResponseCallback[SchemaShippingsettingsListResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceShippingsettingsList,
    options: BodyResponseCallback[Readable | SchemaShippingsettingsListResponse],
    callback: BodyResponseCallback[Readable | SchemaShippingsettingsListResponse]
  ): Unit = js.native
  def list(params: ParamsResourceShippingsettingsList, options: MethodOptions): GaxiosPromise[SchemaShippingsettingsListResponse] = js.native
  def list(
    params: ParamsResourceShippingsettingsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaShippingsettingsListResponse]
  ): Unit = js.native
  /**
    * Lists the shipping settings of the sub-accounts in your Merchant Center account.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/content.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const content = google.content('v2');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/content'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await content.shippingsettings.list({
    *     // The maximum number of shipping settings to return in the response, used for paging.
    *     maxResults: 'placeholder-value',
    *     // The ID of the managing account. This must be a multi-client account.
    *     merchantId: 'placeholder-value',
    *     // The token returned by the previous request.
    *     pageToken: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "kind": "my_kind",
    *   //   "nextPageToken": "my_nextPageToken",
    *   //   "resources": []
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
  def list(params: ParamsResourceShippingsettingsList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceShippingsettingsList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def update(): GaxiosPromise[SchemaShippingSettings] = js.native
  def update(callback: BodyResponseCallback[SchemaShippingSettings]): Unit = js.native
  def update(params: Unit, options: MethodOptions): GaxiosPromise[SchemaShippingSettings] = js.native
  def update(params: ParamsResourceShippingsettingsUpdate): GaxiosPromise[SchemaShippingSettings] = js.native
  def update(
    params: ParamsResourceShippingsettingsUpdate,
    callback: BodyResponseCallback[SchemaShippingSettings]
  ): Unit = js.native
  def update(
    params: ParamsResourceShippingsettingsUpdate,
    options: BodyResponseCallback[Readable | SchemaShippingSettings],
    callback: BodyResponseCallback[Readable | SchemaShippingSettings]
  ): Unit = js.native
  def update(params: ParamsResourceShippingsettingsUpdate, options: MethodOptions): GaxiosPromise[SchemaShippingSettings] = js.native
  def update(
    params: ParamsResourceShippingsettingsUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaShippingSettings]
  ): Unit = js.native
  /**
    * Updates the shipping settings of the account. Any fields that are not provided are deleted from the resource.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/content.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const content = google.content('v2');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/content'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await content.shippingsettings.update({
    *     // The ID of the account for which to get/update shipping settings.
    *     accountId: 'placeholder-value',
    *     // Flag to simulate a request like in a live environment. If set to true, dry-run mode checks the validity of the request and returns errors (if any).
    *     dryRun: 'placeholder-value',
    *     // The ID of the managing account. If this parameter is not the same as accountId, then this account must be a multi-client account and `accountId` must be the ID of a sub-account of this account.
    *     merchantId: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "accountId": "my_accountId",
    *       //   "postalCodeGroups": [],
    *       //   "services": [],
    *       //   "warehouses": []
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "accountId": "my_accountId",
    *   //   "postalCodeGroups": [],
    *   //   "services": [],
    *   //   "warehouses": []
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
  def update(params: ParamsResourceShippingsettingsUpdate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def update(
    params: ParamsResourceShippingsettingsUpdate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
