package typings.googleapis.texttospeechV1beta1Mod.texttospeechV1beta1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/texttospeech/v1beta1", "texttospeech_v1beta1.Resource$Voices")
@js.native
class ResourceVoices protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * texttospeech.voices.list
    * @desc Returns a list of Voice supported for synthesis.
    * @alias texttospeech.voices.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.languageCode Optional (but recommended) [BCP-47](https://www.rfc-editor.org/rfc/bcp/bcp47.txt) language tag. If specified, the ListVoices call will only return voices that can be used to synthesize this language_code. E.g. when specifying "en-NZ", you will get supported "en-*" voices; when specifying "no", you will get supported "no-*" (Norwegian) and "nb-*" (Norwegian Bokmal) voices; specifying "zh" will also get supported "cmn-*" voices; specifying "zh-hk" will also get supported "yue-*" voices.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaListVoicesResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListVoicesResponse]): Unit = js.native
  def list(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaListVoicesResponse] = js.native
  def list(params: ParamsResourceVoicesList): GaxiosPromise[SchemaListVoicesResponse] = js.native
  def list(params: ParamsResourceVoicesList, callback: BodyResponseCallback[SchemaListVoicesResponse]): Unit = js.native
  def list(
    params: ParamsResourceVoicesList,
    options: BodyResponseCallback[SchemaListVoicesResponse],
    callback: BodyResponseCallback[SchemaListVoicesResponse]
  ): Unit = js.native
  def list(params: ParamsResourceVoicesList, options: MethodOptions): GaxiosPromise[SchemaListVoicesResponse] = js.native
  def list(
    params: ParamsResourceVoicesList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListVoicesResponse]
  ): Unit = js.native
}

