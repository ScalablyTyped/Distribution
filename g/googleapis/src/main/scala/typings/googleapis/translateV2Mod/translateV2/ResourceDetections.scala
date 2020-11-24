package typings.googleapis.translateV2Mod.translateV2

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/translate/v2", "translate_v2.Resource$Detections")
@js.native
class ResourceDetections protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  /**
    * language.detections.detect
    * @desc Detects the language of text within a request.
    * @alias language.detections.detect
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {().DetectLanguageRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def detect(): GaxiosPromise[SchemaDetectionsListResponse] = js.native
  def detect(callback: BodyResponseCallback[SchemaDetectionsListResponse]): Unit = js.native
  def detect(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaDetectionsListResponse] = js.native
  def detect(params: ParamsResourceDetectionsDetect): GaxiosPromise[SchemaDetectionsListResponse] = js.native
  def detect(
    params: ParamsResourceDetectionsDetect,
    callback: BodyResponseCallback[SchemaDetectionsListResponse]
  ): Unit = js.native
  def detect(
    params: ParamsResourceDetectionsDetect,
    options: BodyResponseCallback[SchemaDetectionsListResponse],
    callback: BodyResponseCallback[SchemaDetectionsListResponse]
  ): Unit = js.native
  def detect(params: ParamsResourceDetectionsDetect, options: MethodOptions): GaxiosPromise[SchemaDetectionsListResponse] = js.native
  def detect(
    params: ParamsResourceDetectionsDetect,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaDetectionsListResponse]
  ): Unit = js.native
  
  /**
    * language.detections.list
    * @desc Detects the language of text within a request.
    * @alias language.detections.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.q The input text upon which to perform language detection. Repeat this parameter to perform language detection on multiple text inputs.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaDetectionsListResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaDetectionsListResponse]): Unit = js.native
  def list(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaDetectionsListResponse] = js.native
  def list(params: ParamsResourceDetectionsList): GaxiosPromise[SchemaDetectionsListResponse] = js.native
  def list(params: ParamsResourceDetectionsList, callback: BodyResponseCallback[SchemaDetectionsListResponse]): Unit = js.native
  def list(
    params: ParamsResourceDetectionsList,
    options: BodyResponseCallback[SchemaDetectionsListResponse],
    callback: BodyResponseCallback[SchemaDetectionsListResponse]
  ): Unit = js.native
  def list(params: ParamsResourceDetectionsList, options: MethodOptions): GaxiosPromise[SchemaDetectionsListResponse] = js.native
  def list(
    params: ParamsResourceDetectionsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaDetectionsListResponse]
  ): Unit = js.native
}
