package typings.googleapis.visionV1p1beta1Mod.visionV1p1beta1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/vision/v1p1beta1", "vision_v1p1beta1.Resource$Images")
@js.native
class ResourceImages protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  
  /**
    * vision.images.annotate
    * @desc Run image detection and annotation for a batch of images.
    * @alias vision.images.annotate
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {().GoogleCloudVisionV1p1beta1BatchAnnotateImagesRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def annotate(): GaxiosPromise[SchemaGoogleCloudVisionV1p1beta1BatchAnnotateImagesResponse] = js.native
  def annotate(callback: BodyResponseCallback[SchemaGoogleCloudVisionV1p1beta1BatchAnnotateImagesResponse]): Unit = js.native
  def annotate(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaGoogleCloudVisionV1p1beta1BatchAnnotateImagesResponse] = js.native
  def annotate(params: ParamsResourceImagesAnnotate): GaxiosPromise[SchemaGoogleCloudVisionV1p1beta1BatchAnnotateImagesResponse] = js.native
  def annotate(
    params: ParamsResourceImagesAnnotate,
    callback: BodyResponseCallback[SchemaGoogleCloudVisionV1p1beta1BatchAnnotateImagesResponse]
  ): Unit = js.native
  def annotate(
    params: ParamsResourceImagesAnnotate,
    options: BodyResponseCallback[SchemaGoogleCloudVisionV1p1beta1BatchAnnotateImagesResponse],
    callback: BodyResponseCallback[SchemaGoogleCloudVisionV1p1beta1BatchAnnotateImagesResponse]
  ): Unit = js.native
  def annotate(params: ParamsResourceImagesAnnotate, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudVisionV1p1beta1BatchAnnotateImagesResponse] = js.native
  def annotate(
    params: ParamsResourceImagesAnnotate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudVisionV1p1beta1BatchAnnotateImagesResponse]
  ): Unit = js.native
  
  var context: APIRequestContext = js.native
}
