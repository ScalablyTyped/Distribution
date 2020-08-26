package typings.googleapis.videointelligenceV1beta2Mod.videointelligenceV1beta2

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/videointelligence/v1beta2", "videointelligence_v1beta2.Resource$Videos")
@js.native
class ResourceVideos protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * videointelligence.videos.annotate
    * @desc Performs asynchronous video annotation. Progress and results can be
    * retrieved through the `google.longrunning.Operations` interface.
    * `Operation.metadata` contains `AnnotateVideoProgress` (progress).
    * `Operation.response` contains `AnnotateVideoResponse` (results).
    * @alias videointelligence.videos.annotate
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {().GoogleCloudVideointelligenceV1beta2_AnnotateVideoRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def annotate(): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def annotate(callback: BodyResponseCallback[SchemaGoogleLongrunningOperation]): Unit = js.native
  def annotate(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def annotate(params: ParamsResourceVideosAnnotate): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def annotate(
    params: ParamsResourceVideosAnnotate,
    callback: BodyResponseCallback[SchemaGoogleLongrunningOperation]
  ): Unit = js.native
  def annotate(
    params: ParamsResourceVideosAnnotate,
    options: BodyResponseCallback[SchemaGoogleLongrunningOperation],
    callback: BodyResponseCallback[SchemaGoogleLongrunningOperation]
  ): Unit = js.native
  def annotate(params: ParamsResourceVideosAnnotate, options: MethodOptions): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def annotate(
    params: ParamsResourceVideosAnnotate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleLongrunningOperation]
  ): Unit = js.native
}

