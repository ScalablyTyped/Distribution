package typings.googleapis.licensingV1Mod.licensingV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/licensing/v1", "licensing_v1.Resource$Licenseassignments")
@js.native
class ResourceLicenseassignments protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * licensing.licenseAssignments.delete
    * @desc Revoke License.
    * @alias licensing.licenseAssignments.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.productId Name for product
    * @param {string} params.skuId Name for sku
    * @param {string} params.userId email id or unique Id of the user
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[Unit] = js.native
  def delete(callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceLicenseassignmentsDelete): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceLicenseassignmentsDelete, callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(
    params: ParamsResourceLicenseassignmentsDelete,
    options: BodyResponseCallback[Unit],
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def delete(params: ParamsResourceLicenseassignmentsDelete, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(
    params: ParamsResourceLicenseassignmentsDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  /**
    * licensing.licenseAssignments.get
    * @desc Get license assignment of a particular product and sku for a user
    * @alias licensing.licenseAssignments.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.productId Name for product
    * @param {string} params.skuId Name for sku
    * @param {string} params.userId email id or unique Id of the user
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaLicenseAssignment] = js.native
  def get(callback: BodyResponseCallback[SchemaLicenseAssignment]): Unit = js.native
  def get(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaLicenseAssignment] = js.native
  def get(params: ParamsResourceLicenseassignmentsGet): GaxiosPromise[SchemaLicenseAssignment] = js.native
  def get(
    params: ParamsResourceLicenseassignmentsGet,
    callback: BodyResponseCallback[SchemaLicenseAssignment]
  ): Unit = js.native
  def get(
    params: ParamsResourceLicenseassignmentsGet,
    options: BodyResponseCallback[SchemaLicenseAssignment],
    callback: BodyResponseCallback[SchemaLicenseAssignment]
  ): Unit = js.native
  def get(params: ParamsResourceLicenseassignmentsGet, options: MethodOptions): GaxiosPromise[SchemaLicenseAssignment] = js.native
  def get(
    params: ParamsResourceLicenseassignmentsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaLicenseAssignment]
  ): Unit = js.native
  /**
    * licensing.licenseAssignments.insert
    * @desc Assign License.
    * @alias licensing.licenseAssignments.insert
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.productId Name for product
    * @param {string} params.skuId Name for sku
    * @param {().LicenseAssignmentInsert} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def insert(): GaxiosPromise[SchemaLicenseAssignment] = js.native
  def insert(callback: BodyResponseCallback[SchemaLicenseAssignment]): Unit = js.native
  def insert(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaLicenseAssignment] = js.native
  def insert(params: ParamsResourceLicenseassignmentsInsert): GaxiosPromise[SchemaLicenseAssignment] = js.native
  def insert(
    params: ParamsResourceLicenseassignmentsInsert,
    callback: BodyResponseCallback[SchemaLicenseAssignment]
  ): Unit = js.native
  def insert(
    params: ParamsResourceLicenseassignmentsInsert,
    options: BodyResponseCallback[SchemaLicenseAssignment],
    callback: BodyResponseCallback[SchemaLicenseAssignment]
  ): Unit = js.native
  def insert(params: ParamsResourceLicenseassignmentsInsert, options: MethodOptions): GaxiosPromise[SchemaLicenseAssignment] = js.native
  def insert(
    params: ParamsResourceLicenseassignmentsInsert,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaLicenseAssignment]
  ): Unit = js.native
  /**
    * licensing.licenseAssignments.listForProduct
    * @desc List license assignments for given product of the customer.
    * @alias licensing.licenseAssignments.listForProduct
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.customerId CustomerId represents the customer for whom licenseassignments are queried
    * @param {integer=} params.maxResults Maximum number of campaigns to return at one time. Must be positive. Optional. Default value is 100.
    * @param {string=} params.pageToken Token to fetch the next page.Optional. By default server will return first page
    * @param {string} params.productId Name for product
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def listForProduct(): GaxiosPromise[SchemaLicenseAssignmentList] = js.native
  def listForProduct(callback: BodyResponseCallback[SchemaLicenseAssignmentList]): Unit = js.native
  def listForProduct(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaLicenseAssignmentList] = js.native
  def listForProduct(params: ParamsResourceLicenseassignmentsListforproduct): GaxiosPromise[SchemaLicenseAssignmentList] = js.native
  def listForProduct(
    params: ParamsResourceLicenseassignmentsListforproduct,
    callback: BodyResponseCallback[SchemaLicenseAssignmentList]
  ): Unit = js.native
  def listForProduct(
    params: ParamsResourceLicenseassignmentsListforproduct,
    options: BodyResponseCallback[SchemaLicenseAssignmentList],
    callback: BodyResponseCallback[SchemaLicenseAssignmentList]
  ): Unit = js.native
  def listForProduct(params: ParamsResourceLicenseassignmentsListforproduct, options: MethodOptions): GaxiosPromise[SchemaLicenseAssignmentList] = js.native
  def listForProduct(
    params: ParamsResourceLicenseassignmentsListforproduct,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaLicenseAssignmentList]
  ): Unit = js.native
  /**
    * licensing.licenseAssignments.listForProductAndSku
    * @desc List license assignments for given product and sku of the customer.
    * @alias licensing.licenseAssignments.listForProductAndSku
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.customerId CustomerId represents the customer for whom licenseassignments are queried
    * @param {integer=} params.maxResults Maximum number of campaigns to return at one time. Must be positive. Optional. Default value is 100.
    * @param {string=} params.pageToken Token to fetch the next page.Optional. By default server will return first page
    * @param {string} params.productId Name for product
    * @param {string} params.skuId Name for sku
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def listForProductAndSku(): GaxiosPromise[SchemaLicenseAssignmentList] = js.native
  def listForProductAndSku(callback: BodyResponseCallback[SchemaLicenseAssignmentList]): Unit = js.native
  def listForProductAndSku(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaLicenseAssignmentList] = js.native
  def listForProductAndSku(params: ParamsResourceLicenseassignmentsListforproductandsku): GaxiosPromise[SchemaLicenseAssignmentList] = js.native
  def listForProductAndSku(
    params: ParamsResourceLicenseassignmentsListforproductandsku,
    callback: BodyResponseCallback[SchemaLicenseAssignmentList]
  ): Unit = js.native
  def listForProductAndSku(
    params: ParamsResourceLicenseassignmentsListforproductandsku,
    options: BodyResponseCallback[SchemaLicenseAssignmentList],
    callback: BodyResponseCallback[SchemaLicenseAssignmentList]
  ): Unit = js.native
  def listForProductAndSku(params: ParamsResourceLicenseassignmentsListforproductandsku, options: MethodOptions): GaxiosPromise[SchemaLicenseAssignmentList] = js.native
  def listForProductAndSku(
    params: ParamsResourceLicenseassignmentsListforproductandsku,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaLicenseAssignmentList]
  ): Unit = js.native
  /**
    * licensing.licenseAssignments.patch
    * @desc Assign License. This method supports patch semantics.
    * @alias licensing.licenseAssignments.patch
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.productId Name for product
    * @param {string} params.skuId Name for sku for which license would be revoked
    * @param {string} params.userId email id or unique Id of the user
    * @param {().LicenseAssignment} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def patch(): GaxiosPromise[SchemaLicenseAssignment] = js.native
  def patch(callback: BodyResponseCallback[SchemaLicenseAssignment]): Unit = js.native
  def patch(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaLicenseAssignment] = js.native
  def patch(params: ParamsResourceLicenseassignmentsPatch): GaxiosPromise[SchemaLicenseAssignment] = js.native
  def patch(
    params: ParamsResourceLicenseassignmentsPatch,
    callback: BodyResponseCallback[SchemaLicenseAssignment]
  ): Unit = js.native
  def patch(
    params: ParamsResourceLicenseassignmentsPatch,
    options: BodyResponseCallback[SchemaLicenseAssignment],
    callback: BodyResponseCallback[SchemaLicenseAssignment]
  ): Unit = js.native
  def patch(params: ParamsResourceLicenseassignmentsPatch, options: MethodOptions): GaxiosPromise[SchemaLicenseAssignment] = js.native
  def patch(
    params: ParamsResourceLicenseassignmentsPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaLicenseAssignment]
  ): Unit = js.native
  /**
    * licensing.licenseAssignments.update
    * @desc Assign License.
    * @alias licensing.licenseAssignments.update
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.productId Name for product
    * @param {string} params.skuId Name for sku for which license would be revoked
    * @param {string} params.userId email id or unique Id of the user
    * @param {().LicenseAssignment} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def update(): GaxiosPromise[SchemaLicenseAssignment] = js.native
  def update(callback: BodyResponseCallback[SchemaLicenseAssignment]): Unit = js.native
  def update(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaLicenseAssignment] = js.native
  def update(params: ParamsResourceLicenseassignmentsUpdate): GaxiosPromise[SchemaLicenseAssignment] = js.native
  def update(
    params: ParamsResourceLicenseassignmentsUpdate,
    callback: BodyResponseCallback[SchemaLicenseAssignment]
  ): Unit = js.native
  def update(
    params: ParamsResourceLicenseassignmentsUpdate,
    options: BodyResponseCallback[SchemaLicenseAssignment],
    callback: BodyResponseCallback[SchemaLicenseAssignment]
  ): Unit = js.native
  def update(params: ParamsResourceLicenseassignmentsUpdate, options: MethodOptions): GaxiosPromise[SchemaLicenseAssignment] = js.native
  def update(
    params: ParamsResourceLicenseassignmentsUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaLicenseAssignment]
  ): Unit = js.native
}

