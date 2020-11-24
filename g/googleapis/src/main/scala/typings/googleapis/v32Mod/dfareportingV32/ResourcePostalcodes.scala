package typings.googleapis.v32Mod.dfareportingV32

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/dfareporting/v3.2", "dfareporting_v3_2.Resource$Postalcodes")
@js.native
class ResourcePostalcodes protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  /**
    * dfareporting.postalCodes.get
    * @desc Gets one postal code by ID.
    * @alias dfareporting.postalCodes.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.code Postal code ID.
    * @param {string} params.profileId User profile ID associated with this request.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaPostalCode] = js.native
  def get(callback: BodyResponseCallback[SchemaPostalCode]): Unit = js.native
  def get(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaPostalCode] = js.native
  def get(params: ParamsResourcePostalcodesGet): GaxiosPromise[SchemaPostalCode] = js.native
  def get(params: ParamsResourcePostalcodesGet, callback: BodyResponseCallback[SchemaPostalCode]): Unit = js.native
  def get(
    params: ParamsResourcePostalcodesGet,
    options: BodyResponseCallback[SchemaPostalCode],
    callback: BodyResponseCallback[SchemaPostalCode]
  ): Unit = js.native
  def get(params: ParamsResourcePostalcodesGet, options: MethodOptions): GaxiosPromise[SchemaPostalCode] = js.native
  def get(
    params: ParamsResourcePostalcodesGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaPostalCode]
  ): Unit = js.native
  
  /**
    * dfareporting.postalCodes.list
    * @desc Retrieves a list of postal codes.
    * @alias dfareporting.postalCodes.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.profileId User profile ID associated with this request.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaPostalCodesListResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaPostalCodesListResponse]): Unit = js.native
  def list(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaPostalCodesListResponse] = js.native
  def list(params: ParamsResourcePostalcodesList): GaxiosPromise[SchemaPostalCodesListResponse] = js.native
  def list(
    params: ParamsResourcePostalcodesList,
    callback: BodyResponseCallback[SchemaPostalCodesListResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourcePostalcodesList,
    options: BodyResponseCallback[SchemaPostalCodesListResponse],
    callback: BodyResponseCallback[SchemaPostalCodesListResponse]
  ): Unit = js.native
  def list(params: ParamsResourcePostalcodesList, options: MethodOptions): GaxiosPromise[SchemaPostalCodesListResponse] = js.native
  def list(
    params: ParamsResourcePostalcodesList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaPostalCodesListResponse]
  ): Unit = js.native
}
