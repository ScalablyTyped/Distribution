package typings.googleapis.testingV1Mod.testingV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/testing/v1", "testing_v1.Resource$Applicationdetailservice")
@js.native
class ResourceApplicationdetailservice protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  /**
    * testing.applicationDetailService.getApkDetails
    * @desc Gets the details of an Android application APK.
    * @alias testing.applicationDetailService.getApkDetails
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {().FileReference} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def getApkDetails(): GaxiosPromise[SchemaGetApkDetailsResponse] = js.native
  def getApkDetails(callback: BodyResponseCallback[SchemaGetApkDetailsResponse]): Unit = js.native
  def getApkDetails(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaGetApkDetailsResponse] = js.native
  def getApkDetails(params: ParamsResourceApplicationdetailserviceGetapkdetails): GaxiosPromise[SchemaGetApkDetailsResponse] = js.native
  def getApkDetails(
    params: ParamsResourceApplicationdetailserviceGetapkdetails,
    callback: BodyResponseCallback[SchemaGetApkDetailsResponse]
  ): Unit = js.native
  def getApkDetails(
    params: ParamsResourceApplicationdetailserviceGetapkdetails,
    options: BodyResponseCallback[SchemaGetApkDetailsResponse],
    callback: BodyResponseCallback[SchemaGetApkDetailsResponse]
  ): Unit = js.native
  def getApkDetails(params: ParamsResourceApplicationdetailserviceGetapkdetails, options: MethodOptions): GaxiosPromise[SchemaGetApkDetailsResponse] = js.native
  def getApkDetails(
    params: ParamsResourceApplicationdetailserviceGetapkdetails,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGetApkDetailsResponse]
  ): Unit = js.native
}
