package typings.googleapis.prodTtSasportalV1alpha1Mod.prodTtSasportalV1alpha1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/prod_tt_sasportal/v1alpha1", "prod_tt_sasportal_v1alpha1.Resource$Customers")
@js.native
open class ResourceCustomers protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  var deployments: ResourceCustomersDeployments = js.native
  
  var devices: ResourceCustomersDevices = js.native
  
  def get(): GaxiosPromise[SchemaSasPortalCustomer] = js.native
  def get(callback: BodyResponseCallback[SchemaSasPortalCustomer]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaSasPortalCustomer] = js.native
  def get(params: ParamsResourceCustomersGet): GaxiosPromise[SchemaSasPortalCustomer] = js.native
  def get(params: ParamsResourceCustomersGet, callback: BodyResponseCallback[SchemaSasPortalCustomer]): Unit = js.native
  def get(
    params: ParamsResourceCustomersGet,
    options: BodyResponseCallback[Readable | SchemaSasPortalCustomer],
    callback: BodyResponseCallback[Readable | SchemaSasPortalCustomer]
  ): Unit = js.native
  def get(params: ParamsResourceCustomersGet, options: MethodOptions): GaxiosPromise[SchemaSasPortalCustomer] = js.native
  def get(
    params: ParamsResourceCustomersGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaSasPortalCustomer]
  ): Unit = js.native
  /**
    * Returns a requested customer.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/prod_tt_sasportal.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const prod_tt_sasportal = google.prod_tt_sasportal('v1alpha1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/sasportal',
    *       'https://www.googleapis.com/auth/userinfo.email',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await prod_tt_sasportal.customers.get({
    *     // Required. The name of the customer.
    *     name: 'customers/my-customer',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "displayName": "my_displayName",
    *   //   "name": "my_name",
    *   //   "sasUserIds": []
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
  
  def list(): GaxiosPromise[SchemaSasPortalListCustomersResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaSasPortalListCustomersResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaSasPortalListCustomersResponse] = js.native
  def list(params: ParamsResourceCustomersList): GaxiosPromise[SchemaSasPortalListCustomersResponse] = js.native
  def list(
    params: ParamsResourceCustomersList,
    callback: BodyResponseCallback[SchemaSasPortalListCustomersResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceCustomersList,
    options: BodyResponseCallback[Readable | SchemaSasPortalListCustomersResponse],
    callback: BodyResponseCallback[Readable | SchemaSasPortalListCustomersResponse]
  ): Unit = js.native
  def list(params: ParamsResourceCustomersList, options: MethodOptions): GaxiosPromise[SchemaSasPortalListCustomersResponse] = js.native
  def list(
    params: ParamsResourceCustomersList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaSasPortalListCustomersResponse]
  ): Unit = js.native
  /**
    * Returns a list of requested customers.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/prod_tt_sasportal.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const prod_tt_sasportal = google.prod_tt_sasportal('v1alpha1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/sasportal',
    *       'https://www.googleapis.com/auth/userinfo.email',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await prod_tt_sasportal.customers.list({
    *     // The maximum number of customers to return in the response.
    *     pageSize: 'placeholder-value',
    *     // A pagination token returned from a previous call to ListCustomers that indicates where this listing should continue from.
    *     pageToken: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "customers": [],
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
  def list(params: ParamsResourceCustomersList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceCustomersList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  var nodes: ResourceCustomersNodes = js.native
  
  def patch(): GaxiosPromise[SchemaSasPortalCustomer] = js.native
  def patch(callback: BodyResponseCallback[SchemaSasPortalCustomer]): Unit = js.native
  def patch(params: Unit, options: MethodOptions): GaxiosPromise[SchemaSasPortalCustomer] = js.native
  def patch(params: ParamsResourceCustomersPatch): GaxiosPromise[SchemaSasPortalCustomer] = js.native
  def patch(params: ParamsResourceCustomersPatch, callback: BodyResponseCallback[SchemaSasPortalCustomer]): Unit = js.native
  def patch(
    params: ParamsResourceCustomersPatch,
    options: BodyResponseCallback[Readable | SchemaSasPortalCustomer],
    callback: BodyResponseCallback[Readable | SchemaSasPortalCustomer]
  ): Unit = js.native
  def patch(params: ParamsResourceCustomersPatch, options: MethodOptions): GaxiosPromise[SchemaSasPortalCustomer] = js.native
  def patch(
    params: ParamsResourceCustomersPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaSasPortalCustomer]
  ): Unit = js.native
  /**
    * Updates an existing customer.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/prod_tt_sasportal.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const prod_tt_sasportal = google.prod_tt_sasportal('v1alpha1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/sasportal',
    *       'https://www.googleapis.com/auth/userinfo.email',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await prod_tt_sasportal.customers.patch({
    *     // Output only. Resource name of the customer.
    *     name: 'customers/my-customer',
    *     // Fields to be updated.
    *     updateMask: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "displayName": "my_displayName",
    *       //   "name": "my_name",
    *       //   "sasUserIds": []
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "displayName": "my_displayName",
    *   //   "name": "my_name",
    *   //   "sasUserIds": []
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
}
