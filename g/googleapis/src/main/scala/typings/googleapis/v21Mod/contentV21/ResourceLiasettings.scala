package typings.googleapis.v21Mod.contentV21

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/content/v2.1", "content_v2_1.Resource$Liasettings")
@js.native
open class ResourceLiasettings protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def custombatch(): GaxiosPromise[SchemaLiasettingsCustomBatchResponse] = js.native
  def custombatch(callback: BodyResponseCallback[SchemaLiasettingsCustomBatchResponse]): Unit = js.native
  def custombatch(params: Unit, options: MethodOptions): GaxiosPromise[SchemaLiasettingsCustomBatchResponse] = js.native
  def custombatch(params: ParamsResourceLiasettingsCustombatch): GaxiosPromise[SchemaLiasettingsCustomBatchResponse] = js.native
  def custombatch(
    params: ParamsResourceLiasettingsCustombatch,
    callback: BodyResponseCallback[SchemaLiasettingsCustomBatchResponse]
  ): Unit = js.native
  def custombatch(
    params: ParamsResourceLiasettingsCustombatch,
    options: BodyResponseCallback[Readable | SchemaLiasettingsCustomBatchResponse],
    callback: BodyResponseCallback[Readable | SchemaLiasettingsCustomBatchResponse]
  ): Unit = js.native
  def custombatch(params: ParamsResourceLiasettingsCustombatch, options: MethodOptions): GaxiosPromise[SchemaLiasettingsCustomBatchResponse] = js.native
  def custombatch(
    params: ParamsResourceLiasettingsCustombatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaLiasettingsCustomBatchResponse]
  ): Unit = js.native
  /**
    * Retrieves and/or updates the LIA settings of multiple accounts in a single request.
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
    * const content = google.content('v2.1');
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
    *   const res = await content.liasettings.custombatch({
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
  def custombatch(params: ParamsResourceLiasettingsCustombatch, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def custombatch(
    params: ParamsResourceLiasettingsCustombatch,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def get(): GaxiosPromise[SchemaLiaSettings] = js.native
  def get(callback: BodyResponseCallback[SchemaLiaSettings]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaLiaSettings] = js.native
  def get(params: ParamsResourceLiasettingsGet): GaxiosPromise[SchemaLiaSettings] = js.native
  def get(params: ParamsResourceLiasettingsGet, callback: BodyResponseCallback[SchemaLiaSettings]): Unit = js.native
  def get(
    params: ParamsResourceLiasettingsGet,
    options: BodyResponseCallback[Readable | SchemaLiaSettings],
    callback: BodyResponseCallback[Readable | SchemaLiaSettings]
  ): Unit = js.native
  def get(params: ParamsResourceLiasettingsGet, options: MethodOptions): GaxiosPromise[SchemaLiaSettings] = js.native
  def get(
    params: ParamsResourceLiasettingsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaLiaSettings]
  ): Unit = js.native
  /**
    * Retrieves the LIA settings of the account.
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
    * const content = google.content('v2.1');
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
    *   const res = await content.liasettings.get({
    *     // The ID of the account for which to get or update LIA settings.
    *     accountId: 'placeholder-value',
    *     // The ID of the managing account. If this parameter is not the same as accountId, then this account must be a multi-client account and `accountId` must be the ID of a sub-account of this account.
    *     merchantId: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "accountId": "my_accountId",
    *   //   "countrySettings": [],
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
  def get(params: ParamsResourceLiasettingsGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceLiasettingsGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def getaccessiblegmbaccounts(): GaxiosPromise[SchemaLiasettingsGetAccessibleGmbAccountsResponse] = js.native
  def getaccessiblegmbaccounts(callback: BodyResponseCallback[SchemaLiasettingsGetAccessibleGmbAccountsResponse]): Unit = js.native
  def getaccessiblegmbaccounts(params: Unit, options: MethodOptions): GaxiosPromise[SchemaLiasettingsGetAccessibleGmbAccountsResponse] = js.native
  def getaccessiblegmbaccounts(params: ParamsResourceLiasettingsGetaccessiblegmbaccounts): GaxiosPromise[SchemaLiasettingsGetAccessibleGmbAccountsResponse] = js.native
  def getaccessiblegmbaccounts(
    params: ParamsResourceLiasettingsGetaccessiblegmbaccounts,
    callback: BodyResponseCallback[SchemaLiasettingsGetAccessibleGmbAccountsResponse]
  ): Unit = js.native
  def getaccessiblegmbaccounts(
    params: ParamsResourceLiasettingsGetaccessiblegmbaccounts,
    options: BodyResponseCallback[Readable | SchemaLiasettingsGetAccessibleGmbAccountsResponse],
    callback: BodyResponseCallback[Readable | SchemaLiasettingsGetAccessibleGmbAccountsResponse]
  ): Unit = js.native
  def getaccessiblegmbaccounts(params: ParamsResourceLiasettingsGetaccessiblegmbaccounts, options: MethodOptions): GaxiosPromise[SchemaLiasettingsGetAccessibleGmbAccountsResponse] = js.native
  def getaccessiblegmbaccounts(
    params: ParamsResourceLiasettingsGetaccessiblegmbaccounts,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaLiasettingsGetAccessibleGmbAccountsResponse]
  ): Unit = js.native
  /**
    * Retrieves the list of accessible Business Profiles.
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
    * const content = google.content('v2.1');
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
    *   const res = await content.liasettings.getaccessiblegmbaccounts({
    *     // The ID of the account for which to retrieve accessible Business Profiles.
    *     accountId: 'placeholder-value',
    *     // The ID of the managing account. If this parameter is not the same as accountId, then this account must be a multi-client account and `accountId` must be the ID of a sub-account of this account.
    *     merchantId: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "accountId": "my_accountId",
    *   //   "gmbAccounts": [],
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
  def getaccessiblegmbaccounts(params: ParamsResourceLiasettingsGetaccessiblegmbaccounts, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def getaccessiblegmbaccounts(
    params: ParamsResourceLiasettingsGetaccessiblegmbaccounts,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaLiasettingsListResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaLiasettingsListResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaLiasettingsListResponse] = js.native
  def list(params: ParamsResourceLiasettingsList): GaxiosPromise[SchemaLiasettingsListResponse] = js.native
  def list(
    params: ParamsResourceLiasettingsList,
    callback: BodyResponseCallback[SchemaLiasettingsListResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceLiasettingsList,
    options: BodyResponseCallback[Readable | SchemaLiasettingsListResponse],
    callback: BodyResponseCallback[Readable | SchemaLiasettingsListResponse]
  ): Unit = js.native
  def list(params: ParamsResourceLiasettingsList, options: MethodOptions): GaxiosPromise[SchemaLiasettingsListResponse] = js.native
  def list(
    params: ParamsResourceLiasettingsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaLiasettingsListResponse]
  ): Unit = js.native
  /**
    * Lists the LIA settings of the sub-accounts in your Merchant Center account.
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
    * const content = google.content('v2.1');
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
    *   const res = await content.liasettings.list({
    *     // The maximum number of LIA settings to return in the response, used for paging.
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
  def list(params: ParamsResourceLiasettingsList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceLiasettingsList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def listposdataproviders(): GaxiosPromise[SchemaLiasettingsListPosDataProvidersResponse] = js.native
  def listposdataproviders(callback: BodyResponseCallback[SchemaLiasettingsListPosDataProvidersResponse]): Unit = js.native
  def listposdataproviders(params: Unit, options: MethodOptions): GaxiosPromise[SchemaLiasettingsListPosDataProvidersResponse] = js.native
  def listposdataproviders(params: ParamsResourceLiasettingsListposdataproviders): GaxiosPromise[SchemaLiasettingsListPosDataProvidersResponse] = js.native
  def listposdataproviders(
    params: ParamsResourceLiasettingsListposdataproviders,
    callback: BodyResponseCallback[SchemaLiasettingsListPosDataProvidersResponse]
  ): Unit = js.native
  def listposdataproviders(
    params: ParamsResourceLiasettingsListposdataproviders,
    options: BodyResponseCallback[Readable | SchemaLiasettingsListPosDataProvidersResponse],
    callback: BodyResponseCallback[Readable | SchemaLiasettingsListPosDataProvidersResponse]
  ): Unit = js.native
  def listposdataproviders(params: ParamsResourceLiasettingsListposdataproviders, options: MethodOptions): GaxiosPromise[SchemaLiasettingsListPosDataProvidersResponse] = js.native
  def listposdataproviders(
    params: ParamsResourceLiasettingsListposdataproviders,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaLiasettingsListPosDataProvidersResponse]
  ): Unit = js.native
  /**
    * Retrieves the list of POS data providers that have active settings for the all eiligible countries.
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
    * const content = google.content('v2.1');
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
    *   const res = await content.liasettings.listposdataproviders({});
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "kind": "my_kind",
    *   //   "posDataProviders": []
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
  def listposdataproviders(params: ParamsResourceLiasettingsListposdataproviders, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def listposdataproviders(
    params: ParamsResourceLiasettingsListposdataproviders,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def requestgmbaccess(): GaxiosPromise[SchemaLiasettingsRequestGmbAccessResponse] = js.native
  def requestgmbaccess(callback: BodyResponseCallback[SchemaLiasettingsRequestGmbAccessResponse]): Unit = js.native
  def requestgmbaccess(params: Unit, options: MethodOptions): GaxiosPromise[SchemaLiasettingsRequestGmbAccessResponse] = js.native
  def requestgmbaccess(params: ParamsResourceLiasettingsRequestgmbaccess): GaxiosPromise[SchemaLiasettingsRequestGmbAccessResponse] = js.native
  def requestgmbaccess(
    params: ParamsResourceLiasettingsRequestgmbaccess,
    callback: BodyResponseCallback[SchemaLiasettingsRequestGmbAccessResponse]
  ): Unit = js.native
  def requestgmbaccess(
    params: ParamsResourceLiasettingsRequestgmbaccess,
    options: BodyResponseCallback[Readable | SchemaLiasettingsRequestGmbAccessResponse],
    callback: BodyResponseCallback[Readable | SchemaLiasettingsRequestGmbAccessResponse]
  ): Unit = js.native
  def requestgmbaccess(params: ParamsResourceLiasettingsRequestgmbaccess, options: MethodOptions): GaxiosPromise[SchemaLiasettingsRequestGmbAccessResponse] = js.native
  def requestgmbaccess(
    params: ParamsResourceLiasettingsRequestgmbaccess,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaLiasettingsRequestGmbAccessResponse]
  ): Unit = js.native
  /**
    * Requests access to a specified Business Profile.
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
    * const content = google.content('v2.1');
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
    *   const res = await content.liasettings.requestgmbaccess({
    *     // The ID of the account for which Business Profile access is requested.
    *     accountId: 'placeholder-value',
    *     // The email of the Business Profile.
    *     gmbEmail: 'placeholder-value',
    *     // The ID of the managing account. If this parameter is not the same as accountId, then this account must be a multi-client account and `accountId` must be the ID of a sub-account of this account.
    *     merchantId: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
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
  def requestgmbaccess(params: ParamsResourceLiasettingsRequestgmbaccess, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def requestgmbaccess(
    params: ParamsResourceLiasettingsRequestgmbaccess,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def requestinventoryverification(): GaxiosPromise[SchemaLiasettingsRequestInventoryVerificationResponse] = js.native
  def requestinventoryverification(callback: BodyResponseCallback[SchemaLiasettingsRequestInventoryVerificationResponse]): Unit = js.native
  def requestinventoryverification(params: Unit, options: MethodOptions): GaxiosPromise[SchemaLiasettingsRequestInventoryVerificationResponse] = js.native
  def requestinventoryverification(params: ParamsResourceLiasettingsRequestinventoryverification): GaxiosPromise[SchemaLiasettingsRequestInventoryVerificationResponse] = js.native
  def requestinventoryverification(
    params: ParamsResourceLiasettingsRequestinventoryverification,
    callback: BodyResponseCallback[SchemaLiasettingsRequestInventoryVerificationResponse]
  ): Unit = js.native
  def requestinventoryverification(
    params: ParamsResourceLiasettingsRequestinventoryverification,
    options: BodyResponseCallback[Readable | SchemaLiasettingsRequestInventoryVerificationResponse],
    callback: BodyResponseCallback[Readable | SchemaLiasettingsRequestInventoryVerificationResponse]
  ): Unit = js.native
  def requestinventoryverification(params: ParamsResourceLiasettingsRequestinventoryverification, options: MethodOptions): GaxiosPromise[SchemaLiasettingsRequestInventoryVerificationResponse] = js.native
  def requestinventoryverification(
    params: ParamsResourceLiasettingsRequestinventoryverification,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaLiasettingsRequestInventoryVerificationResponse]
  ): Unit = js.native
  /**
    * Requests inventory validation for the specified country.
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
    * const content = google.content('v2.1');
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
    *   const res = await content.liasettings.requestinventoryverification({
    *     // The ID of the account that manages the order. This cannot be a multi-client account.
    *     accountId: 'placeholder-value',
    *     // The country for which inventory validation is requested.
    *     country: 'placeholder-value',
    *     // The ID of the managing account. If this parameter is not the same as accountId, then this account must be a multi-client account and `accountId` must be the ID of a sub-account of this account.
    *     merchantId: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
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
  def requestinventoryverification(params: ParamsResourceLiasettingsRequestinventoryverification, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def requestinventoryverification(
    params: ParamsResourceLiasettingsRequestinventoryverification,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def setinventoryverificationcontact(): GaxiosPromise[SchemaLiasettingsSetInventoryVerificationContactResponse] = js.native
  def setinventoryverificationcontact(callback: BodyResponseCallback[SchemaLiasettingsSetInventoryVerificationContactResponse]): Unit = js.native
  def setinventoryverificationcontact(params: Unit, options: MethodOptions): GaxiosPromise[SchemaLiasettingsSetInventoryVerificationContactResponse] = js.native
  def setinventoryverificationcontact(params: ParamsResourceLiasettingsSetinventoryverificationcontact): GaxiosPromise[SchemaLiasettingsSetInventoryVerificationContactResponse] = js.native
  def setinventoryverificationcontact(
    params: ParamsResourceLiasettingsSetinventoryverificationcontact,
    callback: BodyResponseCallback[SchemaLiasettingsSetInventoryVerificationContactResponse]
  ): Unit = js.native
  def setinventoryverificationcontact(
    params: ParamsResourceLiasettingsSetinventoryverificationcontact,
    options: BodyResponseCallback[Readable | SchemaLiasettingsSetInventoryVerificationContactResponse],
    callback: BodyResponseCallback[Readable | SchemaLiasettingsSetInventoryVerificationContactResponse]
  ): Unit = js.native
  def setinventoryverificationcontact(params: ParamsResourceLiasettingsSetinventoryverificationcontact, options: MethodOptions): GaxiosPromise[SchemaLiasettingsSetInventoryVerificationContactResponse] = js.native
  def setinventoryverificationcontact(
    params: ParamsResourceLiasettingsSetinventoryverificationcontact,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaLiasettingsSetInventoryVerificationContactResponse]
  ): Unit = js.native
  /**
    * Sets the inventory verification contract for the specified country.
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
    * const content = google.content('v2.1');
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
    *   const res = await content.liasettings.setinventoryverificationcontact({
    *     // The ID of the account that manages the order. This cannot be a multi-client account.
    *     accountId: 'placeholder-value',
    *     // The email of the inventory verification contact.
    *     contactEmail: 'placeholder-value',
    *     // The name of the inventory verification contact.
    *     contactName: 'placeholder-value',
    *     // The country for which inventory verification is requested.
    *     country: 'placeholder-value',
    *     // The language for which inventory verification is requested.
    *     language: 'placeholder-value',
    *     // The ID of the managing account. If this parameter is not the same as accountId, then this account must be a multi-client account and `accountId` must be the ID of a sub-account of this account.
    *     merchantId: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
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
  def setinventoryverificationcontact(params: ParamsResourceLiasettingsSetinventoryverificationcontact, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def setinventoryverificationcontact(
    params: ParamsResourceLiasettingsSetinventoryverificationcontact,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def setposdataprovider(): GaxiosPromise[SchemaLiasettingsSetPosDataProviderResponse] = js.native
  def setposdataprovider(callback: BodyResponseCallback[SchemaLiasettingsSetPosDataProviderResponse]): Unit = js.native
  def setposdataprovider(params: Unit, options: MethodOptions): GaxiosPromise[SchemaLiasettingsSetPosDataProviderResponse] = js.native
  def setposdataprovider(params: ParamsResourceLiasettingsSetposdataprovider): GaxiosPromise[SchemaLiasettingsSetPosDataProviderResponse] = js.native
  def setposdataprovider(
    params: ParamsResourceLiasettingsSetposdataprovider,
    callback: BodyResponseCallback[SchemaLiasettingsSetPosDataProviderResponse]
  ): Unit = js.native
  def setposdataprovider(
    params: ParamsResourceLiasettingsSetposdataprovider,
    options: BodyResponseCallback[Readable | SchemaLiasettingsSetPosDataProviderResponse],
    callback: BodyResponseCallback[Readable | SchemaLiasettingsSetPosDataProviderResponse]
  ): Unit = js.native
  def setposdataprovider(params: ParamsResourceLiasettingsSetposdataprovider, options: MethodOptions): GaxiosPromise[SchemaLiasettingsSetPosDataProviderResponse] = js.native
  def setposdataprovider(
    params: ParamsResourceLiasettingsSetposdataprovider,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaLiasettingsSetPosDataProviderResponse]
  ): Unit = js.native
  /**
    * Sets the POS data provider for the specified country.
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
    * const content = google.content('v2.1');
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
    *   const res = await content.liasettings.setposdataprovider({
    *     // The ID of the account for which to retrieve accessible Business Profiles.
    *     accountId: 'placeholder-value',
    *     // The country for which the POS data provider is selected.
    *     country: 'placeholder-value',
    *     // The ID of the managing account. If this parameter is not the same as accountId, then this account must be a multi-client account and `accountId` must be the ID of a sub-account of this account.
    *     merchantId: 'placeholder-value',
    *     // The ID of POS data provider.
    *     posDataProviderId: 'placeholder-value',
    *     // The account ID by which this merchant is known to the POS data provider.
    *     posExternalAccountId: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
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
  def setposdataprovider(params: ParamsResourceLiasettingsSetposdataprovider, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def setposdataprovider(
    params: ParamsResourceLiasettingsSetposdataprovider,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def update(): GaxiosPromise[SchemaLiaSettings] = js.native
  def update(callback: BodyResponseCallback[SchemaLiaSettings]): Unit = js.native
  def update(params: Unit, options: MethodOptions): GaxiosPromise[SchemaLiaSettings] = js.native
  def update(params: ParamsResourceLiasettingsUpdate): GaxiosPromise[SchemaLiaSettings] = js.native
  def update(params: ParamsResourceLiasettingsUpdate, callback: BodyResponseCallback[SchemaLiaSettings]): Unit = js.native
  def update(
    params: ParamsResourceLiasettingsUpdate,
    options: BodyResponseCallback[Readable | SchemaLiaSettings],
    callback: BodyResponseCallback[Readable | SchemaLiaSettings]
  ): Unit = js.native
  def update(params: ParamsResourceLiasettingsUpdate, options: MethodOptions): GaxiosPromise[SchemaLiaSettings] = js.native
  def update(
    params: ParamsResourceLiasettingsUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaLiaSettings]
  ): Unit = js.native
  /**
    * Updates the LIA settings of the account. Any fields that are not provided are deleted from the resource.
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
    * const content = google.content('v2.1');
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
    *   const res = await content.liasettings.update({
    *     // The ID of the account for which to get or update LIA settings.
    *     accountId: 'placeholder-value',
    *     // The ID of the managing account. If this parameter is not the same as accountId, then this account must be a multi-client account and `accountId` must be the ID of a sub-account of this account.
    *     merchantId: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "accountId": "my_accountId",
    *       //   "countrySettings": [],
    *       //   "kind": "my_kind"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "accountId": "my_accountId",
    *   //   "countrySettings": [],
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
  def update(params: ParamsResourceLiasettingsUpdate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def update(
    params: ParamsResourceLiasettingsUpdate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
