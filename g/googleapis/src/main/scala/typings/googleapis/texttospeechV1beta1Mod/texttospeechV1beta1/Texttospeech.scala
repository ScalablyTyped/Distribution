package typings.googleapis.texttospeechV1beta1Mod.texttospeechV1beta1

import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Cloud Text-to-Speech API
  *
  * Synthesizes natural-sounding speech by applying powerful neural network
  * models.
  *
  * @example
  * const {google} = require('googleapis');
  * const texttospeech = google.texttospeech('v1beta1');
  *
  * @namespace texttospeech
  * @type {Function}
  * @version v1beta1
  * @variation v1beta1
  * @param {object=} options Options for Texttospeech
  */
@JSImport("googleapis/build/src/apis/texttospeech/v1beta1", "texttospeech_v1beta1.Texttospeech")
@js.native
class Texttospeech protected () extends js.Object {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  var context: APIRequestContext = js.native
  var text: ResourceText = js.native
  var voices: ResourceVoices = js.native
}

