package typings.googleapis.dfareportingV4Mod.dfareportingV4

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/dfareporting/v4", "dfareporting_v4.Resource$Billingprofiles")
@js.native
open class ResourceBillingprofiles protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def get(): GaxiosPromise[SchemaBillingProfile] = js.native
  def get(callback: BodyResponseCallback[SchemaBillingProfile]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaBillingProfile] = js.native
  def get(params: ParamsResourceBillingprofilesGet): GaxiosPromise[SchemaBillingProfile] = js.native
  def get(params: ParamsResourceBillingprofilesGet, callback: BodyResponseCallback[SchemaBillingProfile]): Unit = js.native
  def get(
    params: ParamsResourceBillingprofilesGet,
    options: BodyResponseCallback[Readable | SchemaBillingProfile],
    callback: BodyResponseCallback[Readable | SchemaBillingProfile]
  ): Unit = js.native
  def get(params: ParamsResourceBillingprofilesGet, options: MethodOptions): GaxiosPromise[SchemaBillingProfile] = js.native
  def get(
    params: ParamsResourceBillingprofilesGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaBillingProfile]
  ): Unit = js.native
  /**
    * Gets one billing profile by ID.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/dfareporting.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const dfareporting = google.dfareporting('v4');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/dfatrafficking'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await dfareporting.billingProfiles.get({
    *     // Billing Profile ID.
    *     id: 'placeholder-value',
    *     // User profile ID associated with this request.
    *     profileId: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "consolidatedInvoice": false,
    *   //   "countryCode": "my_countryCode",
    *   //   "currencyCode": "my_currencyCode",
    *   //   "id": "my_id",
    *   //   "invoiceLevel": "my_invoiceLevel",
    *   //   "isDefault": false,
    *   //   "kind": "my_kind",
    *   //   "name": "my_name",
    *   //   "paymentsAccountId": "my_paymentsAccountId",
    *   //   "paymentsCustomerId": "my_paymentsCustomerId",
    *   //   "purchaseOrder": "my_purchaseOrder",
    *   //   "secondaryPaymentsCustomerId": "my_secondaryPaymentsCustomerId",
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
  def get(params: ParamsResourceBillingprofilesGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceBillingprofilesGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaBillingProfilesListResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaBillingProfilesListResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaBillingProfilesListResponse] = js.native
  def list(params: ParamsResourceBillingprofilesList): GaxiosPromise[SchemaBillingProfilesListResponse] = js.native
  def list(
    params: ParamsResourceBillingprofilesList,
    callback: BodyResponseCallback[SchemaBillingProfilesListResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceBillingprofilesList,
    options: BodyResponseCallback[Readable | SchemaBillingProfilesListResponse],
    callback: BodyResponseCallback[Readable | SchemaBillingProfilesListResponse]
  ): Unit = js.native
  def list(params: ParamsResourceBillingprofilesList, options: MethodOptions): GaxiosPromise[SchemaBillingProfilesListResponse] = js.native
  def list(
    params: ParamsResourceBillingprofilesList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaBillingProfilesListResponse]
  ): Unit = js.native
  /**
    * Retrieves a list of billing profiles, possibly filtered. This method supports paging.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/dfareporting.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const dfareporting = google.dfareporting('v4');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/dfatrafficking'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await dfareporting.billingProfiles.list({
    *     // Select only billing profile with currency.
    *     currency_code: 'placeholder-value',
    *     // Select only billing profile with these IDs.
    *     ids: 'placeholder-value',
    *     // Maximum number of results to return.
    *     maxResults: 'placeholder-value',
    *     // Allows searching for billing profiles by name. Wildcards (*) are allowed. For example, "profile*2020" will return objects with names like "profile June 2020", "profile April 2020", or simply "profile 2020". Most of the searches also add wildcards implicitly at the start and the end of the search string. For example, a search string of "profile" will match objects with name "my profile", "profile 2021", or simply "profile".
    *     name: 'placeholder-value',
    *     // Select only billing profile which is suggested for the currency_code & subaccount_id using the Billing Suggestion API.
    *     onlySuggestion: 'placeholder-value',
    *     // Value of the nextPageToken from the previous result page.
    *     pageToken: 'placeholder-value',
    *     // User profile ID associated with this request.
    *     profileId: 'placeholder-value',
    *     // Field by which to sort the list.
    *     sortField: 'placeholder-value',
    *     // Order of sorted results.
    *     sortOrder: 'placeholder-value',
    *     // Select only billing profile with the specified status.
    *     status: 'placeholder-value',
    *     // Select only billing profile with the specified subaccount.When only_suggestion is true, only a single subaccount_id is supported.
    *     subaccountIds: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "billingProfiles": [],
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
  def list(params: ParamsResourceBillingprofilesList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceBillingprofilesList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def update(): GaxiosPromise[SchemaBillingProfile] = js.native
  def update(callback: BodyResponseCallback[SchemaBillingProfile]): Unit = js.native
  def update(params: Unit, options: MethodOptions): GaxiosPromise[SchemaBillingProfile] = js.native
  def update(params: ParamsResourceBillingprofilesUpdate): GaxiosPromise[SchemaBillingProfile] = js.native
  def update(params: ParamsResourceBillingprofilesUpdate, callback: BodyResponseCallback[SchemaBillingProfile]): Unit = js.native
  def update(
    params: ParamsResourceBillingprofilesUpdate,
    options: BodyResponseCallback[Readable | SchemaBillingProfile],
    callback: BodyResponseCallback[Readable | SchemaBillingProfile]
  ): Unit = js.native
  def update(params: ParamsResourceBillingprofilesUpdate, options: MethodOptions): GaxiosPromise[SchemaBillingProfile] = js.native
  def update(
    params: ParamsResourceBillingprofilesUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaBillingProfile]
  ): Unit = js.native
  /**
    * Updates an existing billing profile.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/dfareporting.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const dfareporting = google.dfareporting('v4');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/dfatrafficking'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await dfareporting.billingProfiles.update({
    *     // User profile ID associated with this request.
    *     profileId: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "consolidatedInvoice": false,
    *       //   "countryCode": "my_countryCode",
    *       //   "currencyCode": "my_currencyCode",
    *       //   "id": "my_id",
    *       //   "invoiceLevel": "my_invoiceLevel",
    *       //   "isDefault": false,
    *       //   "kind": "my_kind",
    *       //   "name": "my_name",
    *       //   "paymentsAccountId": "my_paymentsAccountId",
    *       //   "paymentsCustomerId": "my_paymentsCustomerId",
    *       //   "purchaseOrder": "my_purchaseOrder",
    *       //   "secondaryPaymentsCustomerId": "my_secondaryPaymentsCustomerId",
    *       //   "status": "my_status"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "consolidatedInvoice": false,
    *   //   "countryCode": "my_countryCode",
    *   //   "currencyCode": "my_currencyCode",
    *   //   "id": "my_id",
    *   //   "invoiceLevel": "my_invoiceLevel",
    *   //   "isDefault": false,
    *   //   "kind": "my_kind",
    *   //   "name": "my_name",
    *   //   "paymentsAccountId": "my_paymentsAccountId",
    *   //   "paymentsCustomerId": "my_paymentsCustomerId",
    *   //   "purchaseOrder": "my_purchaseOrder",
    *   //   "secondaryPaymentsCustomerId": "my_secondaryPaymentsCustomerId",
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
  def update(params: ParamsResourceBillingprofilesUpdate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def update(
    params: ParamsResourceBillingprofilesUpdate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
