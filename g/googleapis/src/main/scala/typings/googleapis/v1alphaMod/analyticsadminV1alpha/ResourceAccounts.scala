package typings.googleapis.v1alphaMod.analyticsadminV1alpha

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/analyticsadmin/v1alpha", "analyticsadmin_v1alpha.Resource$Accounts")
@js.native
open class ResourceAccounts protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def delete(): GaxiosPromise[SchemaGoogleProtobufEmpty] = js.native
  def delete(callback: BodyResponseCallback[SchemaGoogleProtobufEmpty]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleProtobufEmpty] = js.native
  def delete(params: ParamsResourceAccountsDelete): GaxiosPromise[SchemaGoogleProtobufEmpty] = js.native
  def delete(params: ParamsResourceAccountsDelete, callback: BodyResponseCallback[SchemaGoogleProtobufEmpty]): Unit = js.native
  def delete(
    params: ParamsResourceAccountsDelete,
    options: BodyResponseCallback[Readable | SchemaGoogleProtobufEmpty],
    callback: BodyResponseCallback[Readable | SchemaGoogleProtobufEmpty]
  ): Unit = js.native
  def delete(params: ParamsResourceAccountsDelete, options: MethodOptions): GaxiosPromise[SchemaGoogleProtobufEmpty] = js.native
  def delete(
    params: ParamsResourceAccountsDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleProtobufEmpty]
  ): Unit = js.native
  /**
    * Marks target Account as soft-deleted (ie: "trashed") and returns it. This API does not have a method to restore soft-deleted accounts. However, they can be restored using the Trash Can UI. If the accounts are not restored before the expiration time, the account and all child resources (eg: Properties, GoogleAdsLinks, Streams, UserLinks) will be permanently purged. https://support.google.com/analytics/answer/6154772 Returns an error if the target is not found.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/analyticsadmin.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const analyticsadmin = google.analyticsadmin('v1alpha');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/analytics.edit'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await analyticsadmin.accounts.delete({
    *     // Required. The name of the Account to soft-delete. Format: accounts/{account\} Example: "accounts/100"
    *     name: 'accounts/my-account',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {}
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
  def delete(params: ParamsResourceAccountsDelete, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def delete(
    params: ParamsResourceAccountsDelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def get(): GaxiosPromise[SchemaGoogleAnalyticsAdminV1alphaAccount] = js.native
  def get(callback: BodyResponseCallback[SchemaGoogleAnalyticsAdminV1alphaAccount]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleAnalyticsAdminV1alphaAccount] = js.native
  def get(params: ParamsResourceAccountsGet): GaxiosPromise[SchemaGoogleAnalyticsAdminV1alphaAccount] = js.native
  def get(
    params: ParamsResourceAccountsGet,
    callback: BodyResponseCallback[SchemaGoogleAnalyticsAdminV1alphaAccount]
  ): Unit = js.native
  def get(
    params: ParamsResourceAccountsGet,
    options: BodyResponseCallback[Readable | SchemaGoogleAnalyticsAdminV1alphaAccount],
    callback: BodyResponseCallback[Readable | SchemaGoogleAnalyticsAdminV1alphaAccount]
  ): Unit = js.native
  def get(params: ParamsResourceAccountsGet, options: MethodOptions): GaxiosPromise[SchemaGoogleAnalyticsAdminV1alphaAccount] = js.native
  def get(
    params: ParamsResourceAccountsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleAnalyticsAdminV1alphaAccount]
  ): Unit = js.native
  /**
    * Lookup for a single Account.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/analyticsadmin.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const analyticsadmin = google.analyticsadmin('v1alpha');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/analytics.edit',
    *       'https://www.googleapis.com/auth/analytics.readonly',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await analyticsadmin.accounts.get({
    *     // Required. The name of the account to lookup. Format: accounts/{account\} Example: "accounts/100"
    *     name: 'accounts/my-account',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "createTime": "my_createTime",
    *   //   "deleted": false,
    *   //   "displayName": "my_displayName",
    *   //   "name": "my_name",
    *   //   "regionCode": "my_regionCode",
    *   //   "updateTime": "my_updateTime"
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
  def get(params: ParamsResourceAccountsGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceAccountsGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def getDataSharingSettings(): GaxiosPromise[SchemaGoogleAnalyticsAdminV1alphaDataSharingSettings] = js.native
  def getDataSharingSettings(callback: BodyResponseCallback[SchemaGoogleAnalyticsAdminV1alphaDataSharingSettings]): Unit = js.native
  def getDataSharingSettings(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleAnalyticsAdminV1alphaDataSharingSettings] = js.native
  def getDataSharingSettings(params: ParamsResourceAccountsGetdatasharingsettings): GaxiosPromise[SchemaGoogleAnalyticsAdminV1alphaDataSharingSettings] = js.native
  def getDataSharingSettings(
    params: ParamsResourceAccountsGetdatasharingsettings,
    callback: BodyResponseCallback[SchemaGoogleAnalyticsAdminV1alphaDataSharingSettings]
  ): Unit = js.native
  def getDataSharingSettings(
    params: ParamsResourceAccountsGetdatasharingsettings,
    options: BodyResponseCallback[Readable | SchemaGoogleAnalyticsAdminV1alphaDataSharingSettings],
    callback: BodyResponseCallback[Readable | SchemaGoogleAnalyticsAdminV1alphaDataSharingSettings]
  ): Unit = js.native
  def getDataSharingSettings(params: ParamsResourceAccountsGetdatasharingsettings, options: MethodOptions): GaxiosPromise[SchemaGoogleAnalyticsAdminV1alphaDataSharingSettings] = js.native
  def getDataSharingSettings(
    params: ParamsResourceAccountsGetdatasharingsettings,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleAnalyticsAdminV1alphaDataSharingSettings]
  ): Unit = js.native
  /**
    * Get data sharing settings on an account. Data sharing settings are singletons.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/analyticsadmin.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const analyticsadmin = google.analyticsadmin('v1alpha');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/analytics.edit',
    *       'https://www.googleapis.com/auth/analytics.readonly',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await analyticsadmin.accounts.getDataSharingSettings({
    *     // Required. The name of the settings to lookup. Format: accounts/{account\}/dataSharingSettings Example: "accounts/1000/dataSharingSettings"
    *     name: 'accounts/my-account/dataSharingSettings',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "name": "my_name",
    *   //   "sharingWithGoogleAnySalesEnabled": false,
    *   //   "sharingWithGoogleAssignedSalesEnabled": false,
    *   //   "sharingWithGoogleProductsEnabled": false,
    *   //   "sharingWithGoogleSupportEnabled": false,
    *   //   "sharingWithOthersEnabled": false
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
  def getDataSharingSettings(params: ParamsResourceAccountsGetdatasharingsettings, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def getDataSharingSettings(
    params: ParamsResourceAccountsGetdatasharingsettings,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaGoogleAnalyticsAdminV1alphaListAccountsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaGoogleAnalyticsAdminV1alphaListAccountsResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleAnalyticsAdminV1alphaListAccountsResponse] = js.native
  def list(params: ParamsResourceAccountsList): GaxiosPromise[SchemaGoogleAnalyticsAdminV1alphaListAccountsResponse] = js.native
  def list(
    params: ParamsResourceAccountsList,
    callback: BodyResponseCallback[SchemaGoogleAnalyticsAdminV1alphaListAccountsResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceAccountsList,
    options: BodyResponseCallback[Readable | SchemaGoogleAnalyticsAdminV1alphaListAccountsResponse],
    callback: BodyResponseCallback[Readable | SchemaGoogleAnalyticsAdminV1alphaListAccountsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceAccountsList, options: MethodOptions): GaxiosPromise[SchemaGoogleAnalyticsAdminV1alphaListAccountsResponse] = js.native
  def list(
    params: ParamsResourceAccountsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleAnalyticsAdminV1alphaListAccountsResponse]
  ): Unit = js.native
  /**
    * Returns all accounts accessible by the caller. Note that these accounts might not currently have GA4 properties. Soft-deleted (ie: "trashed") accounts are excluded by default. Returns an empty list if no relevant accounts are found.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/analyticsadmin.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const analyticsadmin = google.analyticsadmin('v1alpha');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/analytics.edit',
    *       'https://www.googleapis.com/auth/analytics.readonly',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await analyticsadmin.accounts.list({
    *     // The maximum number of resources to return. The service may return fewer than this value, even if there are additional pages. If unspecified, at most 50 resources will be returned. The maximum value is 200; (higher values will be coerced to the maximum)
    *     pageSize: 'placeholder-value',
    *     // A page token, received from a previous `ListAccounts` call. Provide this to retrieve the subsequent page. When paginating, all other parameters provided to `ListAccounts` must match the call that provided the page token.
    *     pageToken: 'placeholder-value',
    *     // Whether to include soft-deleted (ie: "trashed") Accounts in the results. Accounts can be inspected to determine whether they are deleted or not.
    *     showDeleted: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "accounts": [],
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
  def list(params: ParamsResourceAccountsList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceAccountsList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def patch(): GaxiosPromise[SchemaGoogleAnalyticsAdminV1alphaAccount] = js.native
  def patch(callback: BodyResponseCallback[SchemaGoogleAnalyticsAdminV1alphaAccount]): Unit = js.native
  def patch(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleAnalyticsAdminV1alphaAccount] = js.native
  def patch(params: ParamsResourceAccountsPatch): GaxiosPromise[SchemaGoogleAnalyticsAdminV1alphaAccount] = js.native
  def patch(
    params: ParamsResourceAccountsPatch,
    callback: BodyResponseCallback[SchemaGoogleAnalyticsAdminV1alphaAccount]
  ): Unit = js.native
  def patch(
    params: ParamsResourceAccountsPatch,
    options: BodyResponseCallback[Readable | SchemaGoogleAnalyticsAdminV1alphaAccount],
    callback: BodyResponseCallback[Readable | SchemaGoogleAnalyticsAdminV1alphaAccount]
  ): Unit = js.native
  def patch(params: ParamsResourceAccountsPatch, options: MethodOptions): GaxiosPromise[SchemaGoogleAnalyticsAdminV1alphaAccount] = js.native
  def patch(
    params: ParamsResourceAccountsPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleAnalyticsAdminV1alphaAccount]
  ): Unit = js.native
  /**
    * Updates an account.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/analyticsadmin.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const analyticsadmin = google.analyticsadmin('v1alpha');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/analytics.edit'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await analyticsadmin.accounts.patch({
    *     // Output only. Resource name of this account. Format: accounts/{account\} Example: "accounts/100"
    *     name: 'accounts/my-account',
    *     // Required. The list of fields to be updated. Field names must be in snake case (e.g., "field_to_update"). Omitted fields will not be updated. To replace the entire entity, use one path with the string "*" to match all fields.
    *     updateMask: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "createTime": "my_createTime",
    *       //   "deleted": false,
    *       //   "displayName": "my_displayName",
    *       //   "name": "my_name",
    *       //   "regionCode": "my_regionCode",
    *       //   "updateTime": "my_updateTime"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "createTime": "my_createTime",
    *   //   "deleted": false,
    *   //   "displayName": "my_displayName",
    *   //   "name": "my_name",
    *   //   "regionCode": "my_regionCode",
    *   //   "updateTime": "my_updateTime"
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
  def patch(params: ParamsResourceAccountsPatch, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def patch(
    params: ParamsResourceAccountsPatch,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def provisionAccountTicket(): GaxiosPromise[SchemaGoogleAnalyticsAdminV1alphaProvisionAccountTicketResponse] = js.native
  def provisionAccountTicket(callback: BodyResponseCallback[SchemaGoogleAnalyticsAdminV1alphaProvisionAccountTicketResponse]): Unit = js.native
  def provisionAccountTicket(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleAnalyticsAdminV1alphaProvisionAccountTicketResponse] = js.native
  def provisionAccountTicket(params: ParamsResourceAccountsProvisionaccountticket): GaxiosPromise[SchemaGoogleAnalyticsAdminV1alphaProvisionAccountTicketResponse] = js.native
  def provisionAccountTicket(
    params: ParamsResourceAccountsProvisionaccountticket,
    callback: BodyResponseCallback[SchemaGoogleAnalyticsAdminV1alphaProvisionAccountTicketResponse]
  ): Unit = js.native
  def provisionAccountTicket(
    params: ParamsResourceAccountsProvisionaccountticket,
    options: BodyResponseCallback[Readable | SchemaGoogleAnalyticsAdminV1alphaProvisionAccountTicketResponse],
    callback: BodyResponseCallback[Readable | SchemaGoogleAnalyticsAdminV1alphaProvisionAccountTicketResponse]
  ): Unit = js.native
  def provisionAccountTicket(params: ParamsResourceAccountsProvisionaccountticket, options: MethodOptions): GaxiosPromise[SchemaGoogleAnalyticsAdminV1alphaProvisionAccountTicketResponse] = js.native
  def provisionAccountTicket(
    params: ParamsResourceAccountsProvisionaccountticket,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleAnalyticsAdminV1alphaProvisionAccountTicketResponse]
  ): Unit = js.native
  /**
    * Requests a ticket for creating an account.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/analyticsadmin.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const analyticsadmin = google.analyticsadmin('v1alpha');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/analytics.edit'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await analyticsadmin.accounts.provisionAccountTicket({
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "account": {},
    *       //   "redirectUri": "my_redirectUri"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "accountTicketId": "my_accountTicketId"
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
  def provisionAccountTicket(params: ParamsResourceAccountsProvisionaccountticket, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def provisionAccountTicket(
    params: ParamsResourceAccountsProvisionaccountticket,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def searchChangeHistoryEvents(): GaxiosPromise[SchemaGoogleAnalyticsAdminV1alphaSearchChangeHistoryEventsResponse] = js.native
  def searchChangeHistoryEvents(callback: BodyResponseCallback[SchemaGoogleAnalyticsAdminV1alphaSearchChangeHistoryEventsResponse]): Unit = js.native
  def searchChangeHistoryEvents(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleAnalyticsAdminV1alphaSearchChangeHistoryEventsResponse] = js.native
  def searchChangeHistoryEvents(params: ParamsResourceAccountsSearchchangehistoryevents): GaxiosPromise[SchemaGoogleAnalyticsAdminV1alphaSearchChangeHistoryEventsResponse] = js.native
  def searchChangeHistoryEvents(
    params: ParamsResourceAccountsSearchchangehistoryevents,
    callback: BodyResponseCallback[SchemaGoogleAnalyticsAdminV1alphaSearchChangeHistoryEventsResponse]
  ): Unit = js.native
  def searchChangeHistoryEvents(
    params: ParamsResourceAccountsSearchchangehistoryevents,
    options: BodyResponseCallback[Readable | SchemaGoogleAnalyticsAdminV1alphaSearchChangeHistoryEventsResponse],
    callback: BodyResponseCallback[Readable | SchemaGoogleAnalyticsAdminV1alphaSearchChangeHistoryEventsResponse]
  ): Unit = js.native
  def searchChangeHistoryEvents(params: ParamsResourceAccountsSearchchangehistoryevents, options: MethodOptions): GaxiosPromise[SchemaGoogleAnalyticsAdminV1alphaSearchChangeHistoryEventsResponse] = js.native
  def searchChangeHistoryEvents(
    params: ParamsResourceAccountsSearchchangehistoryevents,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleAnalyticsAdminV1alphaSearchChangeHistoryEventsResponse]
  ): Unit = js.native
  /**
    * Searches through all changes to an account or its children given the specified set of filters.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/analyticsadmin.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const analyticsadmin = google.analyticsadmin('v1alpha');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/analytics.edit'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await analyticsadmin.accounts.searchChangeHistoryEvents({
    *     // Required. The account resource for which to return change history resources.
    *     account: 'accounts/my-account',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "action": [],
    *       //   "actorEmail": [],
    *       //   "earliestChangeTime": "my_earliestChangeTime",
    *       //   "latestChangeTime": "my_latestChangeTime",
    *       //   "pageSize": 0,
    *       //   "pageToken": "my_pageToken",
    *       //   "property": "my_property",
    *       //   "resourceType": []
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "changeHistoryEvents": [],
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
  def searchChangeHistoryEvents(params: ParamsResourceAccountsSearchchangehistoryevents, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def searchChangeHistoryEvents(
    params: ParamsResourceAccountsSearchchangehistoryevents,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  var userLinks: ResourceAccountsUserlinks = js.native
}
