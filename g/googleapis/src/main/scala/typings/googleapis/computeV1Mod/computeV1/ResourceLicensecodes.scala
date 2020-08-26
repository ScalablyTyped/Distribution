package typings.googleapis.computeV1Mod.computeV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/compute/v1", "compute_v1.Resource$Licensecodes")
@js.native
class ResourceLicensecodes protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * compute.licenseCodes.get
    * @desc Return a specified license code. License codes are mirrored across
    * all projects that have permissions to read the License Code.
    * @alias compute.licenseCodes.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.licenseCode Number corresponding to the License code resource to return.
    * @param {string} params.project Project ID for this request.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaLicenseCode] = js.native
  def get(callback: BodyResponseCallback[SchemaLicenseCode]): Unit = js.native
  def get(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaLicenseCode] = js.native
  def get(params: ParamsResourceLicensecodesGet): GaxiosPromise[SchemaLicenseCode] = js.native
  def get(params: ParamsResourceLicensecodesGet, callback: BodyResponseCallback[SchemaLicenseCode]): Unit = js.native
  def get(
    params: ParamsResourceLicensecodesGet,
    options: BodyResponseCallback[SchemaLicenseCode],
    callback: BodyResponseCallback[SchemaLicenseCode]
  ): Unit = js.native
  def get(params: ParamsResourceLicensecodesGet, options: MethodOptions): GaxiosPromise[SchemaLicenseCode] = js.native
  def get(
    params: ParamsResourceLicensecodesGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaLicenseCode]
  ): Unit = js.native
  /**
    * compute.licenseCodes.testIamPermissions
    * @desc Returns permissions that a caller has on the specified resource.
    * @alias compute.licenseCodes.testIamPermissions
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.project Project ID for this request.
    * @param {string} params.resource_ Name or id of the resource for this request.
    * @param {().TestPermissionsRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def testIamPermissions(): GaxiosPromise[SchemaTestPermissionsResponse] = js.native
  def testIamPermissions(callback: BodyResponseCallback[SchemaTestPermissionsResponse]): Unit = js.native
  def testIamPermissions(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaTestPermissionsResponse] = js.native
  def testIamPermissions(params: ParamsResourceLicensecodesTestiampermissions): GaxiosPromise[SchemaTestPermissionsResponse] = js.native
  def testIamPermissions(
    params: ParamsResourceLicensecodesTestiampermissions,
    callback: BodyResponseCallback[SchemaTestPermissionsResponse]
  ): Unit = js.native
  def testIamPermissions(
    params: ParamsResourceLicensecodesTestiampermissions,
    options: BodyResponseCallback[SchemaTestPermissionsResponse],
    callback: BodyResponseCallback[SchemaTestPermissionsResponse]
  ): Unit = js.native
  def testIamPermissions(params: ParamsResourceLicensecodesTestiampermissions, options: MethodOptions): GaxiosPromise[SchemaTestPermissionsResponse] = js.native
  def testIamPermissions(
    params: ParamsResourceLicensecodesTestiampermissions,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaTestPermissionsResponse]
  ): Unit = js.native
}

