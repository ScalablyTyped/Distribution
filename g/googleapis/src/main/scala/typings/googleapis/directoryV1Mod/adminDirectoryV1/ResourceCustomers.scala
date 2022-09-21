package typings.googleapis.directoryV1Mod.adminDirectoryV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/admin/directory_v1", "admin_directory_v1.Resource$Customers")
@js.native
open class ResourceCustomers protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var chrome: ResourceCustomersChrome = js.native
  
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
    * Retrieves a customer.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/admin.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const admin = google.admin('directory_v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/admin.directory.customer',
    *       'https://www.googleapis.com/auth/admin.directory.customer.readonly',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await directory.customers.get({
    *     // Id of the customer to be retrieved
    *     customerKey: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "alternateEmail": "my_alternateEmail",
    *   //   "customerCreationTime": "my_customerCreationTime",
    *   //   "customerDomain": "my_customerDomain",
    *   //   "etag": "my_etag",
    *   //   "id": "my_id",
    *   //   "kind": "my_kind",
    *   //   "language": "my_language",
    *   //   "phoneNumber": "my_phoneNumber",
    *   //   "postalAddress": {}
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
    * Patches a customer.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/admin.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const admin = google.admin('directory_v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/admin.directory.customer'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await directory.customers.patch({
    *     // Id of the customer to be updated
    *     customerKey: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "alternateEmail": "my_alternateEmail",
    *       //   "customerCreationTime": "my_customerCreationTime",
    *       //   "customerDomain": "my_customerDomain",
    *       //   "etag": "my_etag",
    *       //   "id": "my_id",
    *       //   "kind": "my_kind",
    *       //   "language": "my_language",
    *       //   "phoneNumber": "my_phoneNumber",
    *       //   "postalAddress": {}
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "alternateEmail": "my_alternateEmail",
    *   //   "customerCreationTime": "my_customerCreationTime",
    *   //   "customerDomain": "my_customerDomain",
    *   //   "etag": "my_etag",
    *   //   "id": "my_id",
    *   //   "kind": "my_kind",
    *   //   "language": "my_language",
    *   //   "phoneNumber": "my_phoneNumber",
    *   //   "postalAddress": {}
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
    * Updates a customer.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/admin.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const admin = google.admin('directory_v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/admin.directory.customer'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await directory.customers.update({
    *     // Id of the customer to be updated
    *     customerKey: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "alternateEmail": "my_alternateEmail",
    *       //   "customerCreationTime": "my_customerCreationTime",
    *       //   "customerDomain": "my_customerDomain",
    *       //   "etag": "my_etag",
    *       //   "id": "my_id",
    *       //   "kind": "my_kind",
    *       //   "language": "my_language",
    *       //   "phoneNumber": "my_phoneNumber",
    *       //   "postalAddress": {}
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "alternateEmail": "my_alternateEmail",
    *   //   "customerCreationTime": "my_customerCreationTime",
    *   //   "customerDomain": "my_customerDomain",
    *   //   "etag": "my_etag",
    *   //   "id": "my_id",
    *   //   "kind": "my_kind",
    *   //   "language": "my_language",
    *   //   "phoneNumber": "my_phoneNumber",
    *   //   "postalAddress": {}
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
