package typings.googleapis.directoryV1Mod.adminDirectoryV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/admin/directory_v1", "admin_directory_v1.Resource$Customers")
@js.native
class ResourceCustomers protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  /**
    * directory.customers.get
    * @desc Retrieves a customer.
    * @alias directory.customers.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.customerKey Id of the customer to be retrieved
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaCustomer] = js.native
  def get(callback: BodyResponseCallback[SchemaCustomer]): Unit = js.native
  def get(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaCustomer] = js.native
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
    * directory.customers.patch
    * @desc Updates a customer. This method supports patch semantics.
    * @alias directory.customers.patch
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.customerKey Id of the customer to be updated
    * @param {().Customer} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def patch(): GaxiosPromise[SchemaCustomer] = js.native
  def patch(callback: BodyResponseCallback[SchemaCustomer]): Unit = js.native
  def patch(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaCustomer] = js.native
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
    * directory.customers.update
    * @desc Updates a customer.
    * @alias directory.customers.update
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.customerKey Id of the customer to be updated
    * @param {().Customer} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def update(): GaxiosPromise[SchemaCustomer] = js.native
  def update(callback: BodyResponseCallback[SchemaCustomer]): Unit = js.native
  def update(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaCustomer] = js.native
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
