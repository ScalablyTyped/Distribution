package typings.googleapis.proximitybeaconV1beta1Mod.proximitybeaconV1beta1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/proximitybeacon/v1beta1", "proximitybeacon_v1beta1.Resource$Beacons$Diagnostics")
@js.native
class ResourceBeaconsDiagnostics protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  /**
    * proximitybeacon.beacons.diagnostics.list
    * @desc List the diagnostics for a single beacon. You can also list
    * diagnostics for all the beacons owned by your Google Developers Console
    * project by using the beacon name `beacons/-`.  Authenticate using an
    * [OAuth access
    * token](https://developers.google.com/identity/protocols/OAuth2) from a
    * signed-in user with **viewer**, **Is owner** or **Can edit** permissions
    * in the Google Developers Console project.
    * @alias proximitybeacon.beacons.diagnostics.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.alertFilter Requests only beacons that have the given alert. For example, to find beacons that have low batteries use `alert_filter=LOW_BATTERY`.
    * @param {string} params.beaconName Beacon that the diagnostics are for.
    * @param {integer=} params.pageSize Specifies the maximum number of results to return. Defaults to 10. Maximum 1000. Optional.
    * @param {string=} params.pageToken Requests results that occur after the `page_token`, obtained from the response to a previous request. Optional.
    * @param {string=} params.projectId Requests only diagnostic records for the given project id. If not set, then the project making the request will be used for looking up diagnostic records. Optional.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaListDiagnosticsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListDiagnosticsResponse]): Unit = js.native
  def list(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaListDiagnosticsResponse] = js.native
  def list(params: ParamsResourceBeaconsDiagnosticsList): GaxiosPromise[SchemaListDiagnosticsResponse] = js.native
  def list(
    params: ParamsResourceBeaconsDiagnosticsList,
    callback: BodyResponseCallback[SchemaListDiagnosticsResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceBeaconsDiagnosticsList,
    options: BodyResponseCallback[SchemaListDiagnosticsResponse],
    callback: BodyResponseCallback[SchemaListDiagnosticsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceBeaconsDiagnosticsList, options: MethodOptions): GaxiosPromise[SchemaListDiagnosticsResponse] = js.native
  def list(
    params: ParamsResourceBeaconsDiagnosticsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListDiagnosticsResponse]
  ): Unit = js.native
}
