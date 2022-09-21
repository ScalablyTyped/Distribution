package typings.googleapis.resellerV1Mod.resellerV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/reseller/v1", "reseller_v1.Resource$Customers")
@js.native
open class ResourceCustomers protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def get(): GaxiosPromise[SchemaCustomer] = js.native
  def get(callback: BodyResponseCallback[SchemaCustomer]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaCustomer] = js.native
  def get(params: ParamsResourceCustomersGet): GaxiosPromise[SchemaCustomer] = js.native
  def get(params: ParamsResourceCustomersGet, callback: BodyResponseCallback[SchemaCustomer]): Unit = js.native
  def get(
    params: ParamsResourceCustomersGet,
    options: BodyResponseCallback[Readable | SchemaCustomer],
    callback: BodyResponseCallback[Readable | SchemaCustomer]
  ): Unit = js.native
  def get(params: ParamsResourceCustomersGet, options: MethodOptions): GaxiosPromise[SchemaCustomer] = js.native
  def get(
    params: ParamsResourceCustomersGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaCustomer]
  ): Unit = js.native
  /**
    * Gets a customer account. Use this operation to see a customer account already in your reseller management, or to see the minimal account information for an existing customer that you do not manage. For more information about the API response for existing customers, see [retrieving a customer account](/admin-sdk/reseller/v1/how-tos/manage_customers#get_customer).
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/reseller.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const reseller = google.reseller('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/apps.order',
    *       'https://www.googleapis.com/auth/apps.order.readonly',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await reseller.customers.get({
    *     // This can be either the customer's primary domain name or the customer's unique identifier. If the domain name for a customer changes, the old domain name cannot be used to access the customer, but the customer's unique identifier (as returned by the API) can always be used. We recommend storing the unique identifier in your systems where applicable.
    *     customerId: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "alternateEmail": "my_alternateEmail",
    *   //   "customerDomain": "my_customerDomain",
    *   //   "customerDomainVerified": false,
    *   //   "customerId": "my_customerId",
    *   //   "customerType": "my_customerType",
    *   //   "kind": "my_kind",
    *   //   "phoneNumber": "my_phoneNumber",
    *   //   "postalAddress": {},
    *   //   "primaryAdmin": {},
    *   //   "resourceUiUrl": "my_resourceUiUrl"
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
  def get(params: ParamsResourceCustomersGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceCustomersGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def insert(): GaxiosPromise[SchemaCustomer] = js.native
  def insert(callback: BodyResponseCallback[SchemaCustomer]): Unit = js.native
  def insert(params: Unit, options: MethodOptions): GaxiosPromise[SchemaCustomer] = js.native
  def insert(params: ParamsResourceCustomersInsert): GaxiosPromise[SchemaCustomer] = js.native
  def insert(params: ParamsResourceCustomersInsert, callback: BodyResponseCallback[SchemaCustomer]): Unit = js.native
  def insert(
    params: ParamsResourceCustomersInsert,
    options: BodyResponseCallback[Readable | SchemaCustomer],
    callback: BodyResponseCallback[Readable | SchemaCustomer]
  ): Unit = js.native
  def insert(params: ParamsResourceCustomersInsert, options: MethodOptions): GaxiosPromise[SchemaCustomer] = js.native
  def insert(
    params: ParamsResourceCustomersInsert,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaCustomer]
  ): Unit = js.native
  /**
    * Orders a new customer's account. Before ordering a new customer account, establish whether the customer account already exists using the [`customers.get`](/admin-sdk/reseller/v1/reference/customers/get) If the customer account exists as a direct Google account or as a resold customer account from another reseller, use the `customerAuthToken\` as described in [order a resold account for an existing customer](/admin-sdk/reseller/v1/how-tos/manage_customers#create_existing_customer). For more information about ordering a new customer account, see [order a new customer account](/admin-sdk/reseller/v1/how-tos/manage_customers#create_customer). After creating a new customer account, you must provision a user as an administrator. The customer's administrator is required to sign in to the Admin console and sign the G Suite via Reseller agreement to activate the account. Resellers are prohibited from signing the G Suite via Reseller agreement on the customer's behalf. For more information, see [order a new customer account](/admin-sdk/reseller/v1/how-tos/manage_customers#tos).
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/reseller.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const reseller = google.reseller('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/apps.order'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await reseller.customers.insert({
    *     // The `customerAuthToken` query string is required when creating a resold account that transfers a direct customer's subscription or transfers another reseller customer's subscription to your reseller management. This is a hexadecimal authentication token needed to complete the subscription transfer. For more information, see the administrator help center.
    *     customerAuthToken: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "alternateEmail": "my_alternateEmail",
    *       //   "customerDomain": "my_customerDomain",
    *       //   "customerDomainVerified": false,
    *       //   "customerId": "my_customerId",
    *       //   "customerType": "my_customerType",
    *       //   "kind": "my_kind",
    *       //   "phoneNumber": "my_phoneNumber",
    *       //   "postalAddress": {},
    *       //   "primaryAdmin": {},
    *       //   "resourceUiUrl": "my_resourceUiUrl"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "alternateEmail": "my_alternateEmail",
    *   //   "customerDomain": "my_customerDomain",
    *   //   "customerDomainVerified": false,
    *   //   "customerId": "my_customerId",
    *   //   "customerType": "my_customerType",
    *   //   "kind": "my_kind",
    *   //   "phoneNumber": "my_phoneNumber",
    *   //   "postalAddress": {},
    *   //   "primaryAdmin": {},
    *   //   "resourceUiUrl": "my_resourceUiUrl"
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
  def insert(params: ParamsResourceCustomersInsert, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def insert(
    params: ParamsResourceCustomersInsert,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def patch(): GaxiosPromise[SchemaCustomer] = js.native
  def patch(callback: BodyResponseCallback[SchemaCustomer]): Unit = js.native
  def patch(params: Unit, options: MethodOptions): GaxiosPromise[SchemaCustomer] = js.native
  def patch(params: ParamsResourceCustomersPatch): GaxiosPromise[SchemaCustomer] = js.native
  def patch(params: ParamsResourceCustomersPatch, callback: BodyResponseCallback[SchemaCustomer]): Unit = js.native
  def patch(
    params: ParamsResourceCustomersPatch,
    options: BodyResponseCallback[Readable | SchemaCustomer],
    callback: BodyResponseCallback[Readable | SchemaCustomer]
  ): Unit = js.native
  def patch(params: ParamsResourceCustomersPatch, options: MethodOptions): GaxiosPromise[SchemaCustomer] = js.native
  def patch(
    params: ParamsResourceCustomersPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaCustomer]
  ): Unit = js.native
  /**
    * Updates a customer account's settings. This method supports patch semantics. You cannot update `customerType` via the Reseller API, but a `"team"` customer can verify their domain and become `customerType = "domain"`. For more information, see [Verify your domain to unlock Essentials features](https://support.google.com/a/answer/9122284).
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/reseller.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const reseller = google.reseller('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/apps.order'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await reseller.customers.patch({
    *     // This can be either the customer's primary domain name or the customer's unique identifier. If the domain name for a customer changes, the old domain name cannot be used to access the customer, but the customer's unique identifier (as returned by the API) can always be used. We recommend storing the unique identifier in your systems where applicable.
    *     customerId: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "alternateEmail": "my_alternateEmail",
    *       //   "customerDomain": "my_customerDomain",
    *       //   "customerDomainVerified": false,
    *       //   "customerId": "my_customerId",
    *       //   "customerType": "my_customerType",
    *       //   "kind": "my_kind",
    *       //   "phoneNumber": "my_phoneNumber",
    *       //   "postalAddress": {},
    *       //   "primaryAdmin": {},
    *       //   "resourceUiUrl": "my_resourceUiUrl"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "alternateEmail": "my_alternateEmail",
    *   //   "customerDomain": "my_customerDomain",
    *   //   "customerDomainVerified": false,
    *   //   "customerId": "my_customerId",
    *   //   "customerType": "my_customerType",
    *   //   "kind": "my_kind",
    *   //   "phoneNumber": "my_phoneNumber",
    *   //   "postalAddress": {},
    *   //   "primaryAdmin": {},
    *   //   "resourceUiUrl": "my_resourceUiUrl"
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
  def patch(params: ParamsResourceCustomersPatch, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def patch(
    params: ParamsResourceCustomersPatch,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def update(): GaxiosPromise[SchemaCustomer] = js.native
  def update(callback: BodyResponseCallback[SchemaCustomer]): Unit = js.native
  def update(params: Unit, options: MethodOptions): GaxiosPromise[SchemaCustomer] = js.native
  def update(params: ParamsResourceCustomersUpdate): GaxiosPromise[SchemaCustomer] = js.native
  def update(params: ParamsResourceCustomersUpdate, callback: BodyResponseCallback[SchemaCustomer]): Unit = js.native
  def update(
    params: ParamsResourceCustomersUpdate,
    options: BodyResponseCallback[Readable | SchemaCustomer],
    callback: BodyResponseCallback[Readable | SchemaCustomer]
  ): Unit = js.native
  def update(params: ParamsResourceCustomersUpdate, options: MethodOptions): GaxiosPromise[SchemaCustomer] = js.native
  def update(
    params: ParamsResourceCustomersUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaCustomer]
  ): Unit = js.native
  /**
    * Updates a customer account's settings. You cannot update `customerType` via the Reseller API, but a `"team"` customer can verify their domain and become `customerType = "domain"`. For more information, see [update a customer's settings](/admin-sdk/reseller/v1/how-tos/manage_customers#update_customer).
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/reseller.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const reseller = google.reseller('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/apps.order'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await reseller.customers.update({
    *     // This can be either the customer's primary domain name or the customer's unique identifier. If the domain name for a customer changes, the old domain name cannot be used to access the customer, but the customer's unique identifier (as returned by the API) can always be used. We recommend storing the unique identifier in your systems where applicable.
    *     customerId: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "alternateEmail": "my_alternateEmail",
    *       //   "customerDomain": "my_customerDomain",
    *       //   "customerDomainVerified": false,
    *       //   "customerId": "my_customerId",
    *       //   "customerType": "my_customerType",
    *       //   "kind": "my_kind",
    *       //   "phoneNumber": "my_phoneNumber",
    *       //   "postalAddress": {},
    *       //   "primaryAdmin": {},
    *       //   "resourceUiUrl": "my_resourceUiUrl"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "alternateEmail": "my_alternateEmail",
    *   //   "customerDomain": "my_customerDomain",
    *   //   "customerDomainVerified": false,
    *   //   "customerId": "my_customerId",
    *   //   "customerType": "my_customerType",
    *   //   "kind": "my_kind",
    *   //   "phoneNumber": "my_phoneNumber",
    *   //   "postalAddress": {},
    *   //   "primaryAdmin": {},
    *   //   "resourceUiUrl": "my_resourceUiUrl"
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
  def update(params: ParamsResourceCustomersUpdate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def update(
    params: ParamsResourceCustomersUpdate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
