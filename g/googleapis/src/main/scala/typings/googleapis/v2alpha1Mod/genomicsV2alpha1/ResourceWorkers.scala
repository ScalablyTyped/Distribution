package typings.googleapis.v2alpha1Mod.genomicsV2alpha1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/genomics/v2alpha1", "genomics_v2alpha1.Resource$Workers")
@js.native
class ResourceWorkers protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  
  /**
    * genomics.workers.checkIn
    * @desc The worker uses this method to retrieve the assigned operation and
    * provide periodic status updates.
    * @alias genomics.workers.checkIn
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.id The worker id, assigned when it was created.
    * @param {().CheckInRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def checkIn(): GaxiosPromise[SchemaCheckInResponse] = js.native
  def checkIn(callback: BodyResponseCallback[SchemaCheckInResponse]): Unit = js.native
  def checkIn(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaCheckInResponse] = js.native
  def checkIn(params: ParamsResourceWorkersCheckin): GaxiosPromise[SchemaCheckInResponse] = js.native
  def checkIn(params: ParamsResourceWorkersCheckin, callback: BodyResponseCallback[SchemaCheckInResponse]): Unit = js.native
  def checkIn(
    params: ParamsResourceWorkersCheckin,
    options: BodyResponseCallback[SchemaCheckInResponse],
    callback: BodyResponseCallback[SchemaCheckInResponse]
  ): Unit = js.native
  def checkIn(params: ParamsResourceWorkersCheckin, options: MethodOptions): GaxiosPromise[SchemaCheckInResponse] = js.native
  def checkIn(
    params: ParamsResourceWorkersCheckin,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaCheckInResponse]
  ): Unit = js.native
  
  var context: APIRequestContext = js.native
}
