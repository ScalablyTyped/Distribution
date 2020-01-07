package typings.googleapis.googleapisMod.speech_v1

import typings.googleapisDashCommon.buildSrcApiMod.GlobalOptions
import typings.googleapisDashCommon.buildSrcApiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Cloud Speech-to-Text API
  *
  * Converts audio to text by applying powerful neural network models.
  *
  * @example
  * const {google} = require('googleapis');
  * const speech = google.speech('v1');
  *
  * @namespace speech
  * @type {Function}
  * @version v1
  * @variation v1
  * @param {object=} options Options for Speech
  */
@JSImport("googleapis", "speech_v1.Speech")
@js.native
class Speech protected ()
  extends typings.googleapis.buildSrcApisSpeechV1Mod.speech_v1.Speech {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
}

