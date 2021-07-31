package typings.googleapis.resellerV1Mod.resellerV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/reseller/v1", "reseller_v1.Resource$Customers")
@js.native
class ResourceCustomers protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  /**
    * reseller.customers.get
    * @desc Get a customer account.
    * @alias reseller.customers.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.customerId Either the customer's primary domain name or the customer's unique identifier. If using the domain name, we do not recommend using a customerId as a key for persistent data. If the domain name for a customerId is changed, the Google system automatically updates.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaCustomer] = js.native
  def get(callback: BodyResponseCallback[SchemaCustomer]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaCustomer] = js.native
  def get(params: ParamsResourceCustomersGet): GaxiosPromise[SchemaCustomer] = js.native
  def get(params: ParamsResourceCustomersGet, callback: BodyResponseCallback[SchemaCustomer]): Unit = js.native
  def get(
    params: ParamsResourceCustomersGet,
    options: BodyResponseCallback[SchemaCustomer],
    callback: BodyResponseCallback[SchemaCustomer]
  ): Unit = js.native
  def get(params: ParamsResourceCustomersGet, options: MethodOptions): GaxiosPromise[SchemaCustomer] = js.native
  def get(
    params: ParamsResourceCustomersGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaCustomer]
  ): Unit = js.native
  
  /**
    * reseller.customers.insert
    * @desc Order a new customer's account.
    * @alias reseller.customers.insert
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.customerAuthToken The customerAuthToken query string is required when creating a resold account that transfers a direct customer's subscription or transfers another reseller customer's subscription to your reseller management. This is a hexadecimal authentication token needed to complete the subscription transfer. For more information, see the administrator help center.
    * @param {().Customer} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def insert(): GaxiosPromise[SchemaCustomer] = js.native
  def insert(callback: BodyResponseCallback[SchemaCustomer]): Unit = js.native
  def insert(params: Unit, options: MethodOptions): GaxiosPromise[SchemaCustomer] = js.native
  def insert(params: ParamsResourceCustomersInsert): GaxiosPromise[SchemaCustomer] = js.native
  def insert(params: ParamsResourceCustomersInsert, callback: BodyResponseCallback[SchemaCustomer]): Unit = js.native
  def insert(
    params: ParamsResourceCustomersInsert,
    options: BodyResponseCallback[SchemaCustomer],
    callback: BodyResponseCallback[SchemaCustomer]
  ): Unit = js.native
  def insert(params: ParamsResourceCustomersInsert, options: MethodOptions): GaxiosPromise[SchemaCustomer] = js.native
  def insert(
    params: ParamsResourceCustomersInsert,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaCustomer]
  ): Unit = js.native
  
  /**
    * reseller.customers.patch
    * @desc Update a customer account's settings. This method supports patch
    * semantics.
    * @alias reseller.customers.patch
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.customerId Either the customer's primary domain name or the customer's unique identifier. If using the domain name, we do not recommend using a customerId as a key for persistent data. If the domain name for a customerId is changed, the Google system automatically updates.
    * @param {().Customer} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def patch(): GaxiosPromise[SchemaCustomer] = js.native
  def patch(callback: BodyResponseCallback[SchemaCustomer]): Unit = js.native
  def patch(params: Unit, options: MethodOptions): GaxiosPromise[SchemaCustomer] = js.native
  def patch(params: ParamsResourceCustomersPatch): GaxiosPromise[SchemaCustomer] = js.native
  def patch(params: ParamsResourceCustomersPatch, callback: BodyResponseCallback[SchemaCustomer]): Unit = js.native
  def patch(
    params: ParamsResourceCustomersPatch,
    options: BodyResponseCallback[SchemaCustomer],
    callback: BodyResponseCallback[SchemaCustomer]
  ): Unit = js.native
  def patch(params: ParamsResourceCustomersPatch, options: MethodOptions): GaxiosPromise[SchemaCustomer] = js.native
  def patch(
    params: ParamsResourceCustomersPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaCustomer]
  ): Unit = js.native
  
  /**
    * reseller.customers.update
    * @desc Update a customer account's settings.
    * @alias reseller.customers.update
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.customerId Either the customer's primary domain name or the customer's unique identifier. If using the domain name, we do not recommend using a customerId as a key for persistent data. If the domain name for a customerId is changed, the Google system automatically updates.
    * @param {().Customer} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def update(): GaxiosPromise[SchemaCustomer] = js.native
  def update(callback: BodyResponseCallback[SchemaCustomer]): Unit = js.native
  def update(params: Unit, options: MethodOptions): GaxiosPromise[SchemaCustomer] = js.native
  def update(params: ParamsResourceCustomersUpdate): GaxiosPromise[SchemaCustomer] = js.native
  def update(params: ParamsResourceCustomersUpdate, callback: BodyResponseCallback[SchemaCustomer]): Unit = js.native
  def update(
    params: ParamsResourceCustomersUpdate,
    options: BodyResponseCallback[SchemaCustomer],
    callback: BodyResponseCallback[SchemaCustomer]
  ): Unit = js.native
  def update(params: ParamsResourceCustomersUpdate, options: MethodOptions): GaxiosPromise[SchemaCustomer] = js.native
  def update(
    params: ParamsResourceCustomersUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaCustomer]
  ): Unit = js.native
}
