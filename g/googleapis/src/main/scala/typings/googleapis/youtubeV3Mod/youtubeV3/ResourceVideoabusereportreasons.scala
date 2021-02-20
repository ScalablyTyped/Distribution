package typings.googleapis.youtubeV3Mod.youtubeV3

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/youtube/v3", "youtube_v3.Resource$Videoabusereportreasons")
@js.native
class ResourceVideoabusereportreasons protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  /**
    * youtube.videoAbuseReportReasons.list
    * @desc Returns a list of abuse reasons that can be used for reporting
    * abusive videos.
    * @alias youtube.videoAbuseReportReasons.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.hl The hl parameter specifies the language that should be used for text values in the API response.
    * @param {string} params.part The part parameter specifies the videoCategory resource parts that the API response will include. Supported values are id and snippet.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaVideoAbuseReportReasonListResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaVideoAbuseReportReasonListResponse]): Unit = js.native
  def list(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaVideoAbuseReportReasonListResponse] = js.native
  def list(params: ParamsResourceVideoabusereportreasonsList): GaxiosPromise[SchemaVideoAbuseReportReasonListResponse] = js.native
  def list(
    params: ParamsResourceVideoabusereportreasonsList,
    callback: BodyResponseCallback[SchemaVideoAbuseReportReasonListResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceVideoabusereportreasonsList,
    options: BodyResponseCallback[SchemaVideoAbuseReportReasonListResponse],
    callback: BodyResponseCallback[SchemaVideoAbuseReportReasonListResponse]
  ): Unit = js.native
  def list(params: ParamsResourceVideoabusereportreasonsList, options: MethodOptions): GaxiosPromise[SchemaVideoAbuseReportReasonListResponse] = js.native
  def list(
    params: ParamsResourceVideoabusereportreasonsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaVideoAbuseReportReasonListResponse]
  ): Unit = js.native
}
