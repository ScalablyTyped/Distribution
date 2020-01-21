package typings.googleapis.v1p1beta1Mod.speechV1p1beta1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/speech/v1p1beta1", "speech_v1p1beta1.Resource$Speech")
@js.native
class ResourceSpeech protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * speech.speech.longrunningrecognize
    * @desc Performs asynchronous speech recognition: receive results via the
    * google.longrunning.Operations interface. Returns either an
    * `Operation.error` or an `Operation.response` which contains a
    * `LongRunningRecognizeResponse` message. For more information on
    * asynchronous speech recognition, see the
    * [how-to](https://cloud.google.com/speech-to-text/docs/async-recognize).
    * @alias speech.speech.longrunningrecognize
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {().LongRunningRecognizeRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def longrunningrecognize(): GaxiosPromise[SchemaOperation] = js.native
  def longrunningrecognize(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def longrunningrecognize(params: ParamsResourceSpeechLongrunningrecognize): GaxiosPromise[SchemaOperation] = js.native
  def longrunningrecognize(params: ParamsResourceSpeechLongrunningrecognize, callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def longrunningrecognize(
    params: ParamsResourceSpeechLongrunningrecognize,
    options: BodyResponseCallback[SchemaOperation],
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def longrunningrecognize(params: ParamsResourceSpeechLongrunningrecognize, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def longrunningrecognize(
    params: ParamsResourceSpeechLongrunningrecognize,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * speech.speech.recognize
    * @desc Performs synchronous speech recognition: receive results after all
    * audio has been sent and processed.
    * @alias speech.speech.recognize
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {().RecognizeRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def recognize(): GaxiosPromise[SchemaRecognizeResponse] = js.native
  def recognize(callback: BodyResponseCallback[SchemaRecognizeResponse]): Unit = js.native
  def recognize(params: ParamsResourceSpeechRecognize): GaxiosPromise[SchemaRecognizeResponse] = js.native
  def recognize(params: ParamsResourceSpeechRecognize, callback: BodyResponseCallback[SchemaRecognizeResponse]): Unit = js.native
  def recognize(
    params: ParamsResourceSpeechRecognize,
    options: BodyResponseCallback[SchemaRecognizeResponse],
    callback: BodyResponseCallback[SchemaRecognizeResponse]
  ): Unit = js.native
  def recognize(params: ParamsResourceSpeechRecognize, options: MethodOptions): GaxiosPromise[SchemaRecognizeResponse] = js.native
  def recognize(
    params: ParamsResourceSpeechRecognize,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaRecognizeResponse]
  ): Unit = js.native
}

