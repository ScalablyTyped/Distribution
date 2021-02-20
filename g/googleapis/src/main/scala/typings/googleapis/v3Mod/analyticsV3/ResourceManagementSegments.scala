package typings.googleapis.v3Mod.analyticsV3

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/analytics/v3", "analytics_v3.Resource$Management$Segments")
@js.native
class ResourceManagementSegments protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  /**
    * analytics.management.segments.list
    * @desc Lists segments to which the user has access.
    * @alias analytics.management.segments.list
    * @memberOf! ()
    *
    * @param {object=} params Parameters for request
    * @param {integer=} params.max-results The maximum number of segments to include in this response.
    * @param {integer=} params.start-index An index of the first segment to retrieve. Use this parameter as a pagination mechanism along with the max-results parameter.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaSegments] = js.native
  def list(callback: BodyResponseCallback[SchemaSegments]): Unit = js.native
  def list(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaSegments] = js.native
  def list(params: ParamsResourceManagementSegmentsList): GaxiosPromise[SchemaSegments] = js.native
  def list(params: ParamsResourceManagementSegmentsList, callback: BodyResponseCallback[SchemaSegments]): Unit = js.native
  def list(
    params: ParamsResourceManagementSegmentsList,
    options: BodyResponseCallback[SchemaSegments],
    callback: BodyResponseCallback[SchemaSegments]
  ): Unit = js.native
  def list(params: ParamsResourceManagementSegmentsList, options: MethodOptions): GaxiosPromise[SchemaSegments] = js.native
  def list(
    params: ParamsResourceManagementSegmentsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaSegments]
  ): Unit = js.native
}
