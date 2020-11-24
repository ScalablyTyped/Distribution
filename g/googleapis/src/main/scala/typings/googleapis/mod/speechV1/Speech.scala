package typings.googleapis.mod.speechV1

import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  extends typings.googleapis.speechV1Mod.speechV1.Speech {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
}
