package typings.googleapis.v24Mod.analyticsV24

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/analytics/v2.4", "analytics_v2_4.Resource$Management$Segments")
@js.native
class ResourceManagementSegments protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * analytics.management.segments.list
    * @desc Lists advanced segments to which the user has access.
    * @alias analytics.management.segments.list
    * @memberOf! ()
    *
    * @param {object=} params Parameters for request
    * @param {integer=} params.max-results The maximum number of advanced segments to include in this response.
    * @param {integer=} params.start-index An index of the first advanced segment to retrieve. Use this parameter as a pagination mechanism along with the max-results parameter.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Unit] = js.native
  def list(callback: BodyResponseCallback[Unit]): Unit = js.native
  def list(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[Unit] = js.native
  def list(params: ParamsResourceManagementSegmentsList): GaxiosPromise[Unit] = js.native
  def list(params: ParamsResourceManagementSegmentsList, callback: BodyResponseCallback[Unit]): Unit = js.native
  def list(
    params: ParamsResourceManagementSegmentsList,
    options: BodyResponseCallback[Unit],
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def list(params: ParamsResourceManagementSegmentsList, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def list(
    params: ParamsResourceManagementSegmentsList,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
}

