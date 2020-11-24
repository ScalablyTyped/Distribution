package typings.googleapis.texttospeechV1beta1Mod.texttospeechV1beta1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/texttospeech/v1beta1", "texttospeech_v1beta1.Resource$Text")
@js.native
class ResourceText protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  /**
    * texttospeech.text.synthesize
    * @desc Synthesizes speech synchronously: receive results after all text
    * input has been processed.
    * @alias texttospeech.text.synthesize
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {().SynthesizeSpeechRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def synthesize(): GaxiosPromise[SchemaSynthesizeSpeechResponse] = js.native
  def synthesize(callback: BodyResponseCallback[SchemaSynthesizeSpeechResponse]): Unit = js.native
  def synthesize(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaSynthesizeSpeechResponse] = js.native
  def synthesize(params: ParamsResourceTextSynthesize): GaxiosPromise[SchemaSynthesizeSpeechResponse] = js.native
  def synthesize(
    params: ParamsResourceTextSynthesize,
    callback: BodyResponseCallback[SchemaSynthesizeSpeechResponse]
  ): Unit = js.native
  def synthesize(
    params: ParamsResourceTextSynthesize,
    options: BodyResponseCallback[SchemaSynthesizeSpeechResponse],
    callback: BodyResponseCallback[SchemaSynthesizeSpeechResponse]
  ): Unit = js.native
  def synthesize(params: ParamsResourceTextSynthesize, options: MethodOptions): GaxiosPromise[SchemaSynthesizeSpeechResponse] = js.native
  def synthesize(
    params: ParamsResourceTextSynthesize,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaSynthesizeSpeechResponse]
  ): Unit = js.native
}
