package typings.googleapis.googleapisMod

import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.GlobalOptions
import typings.googleapisDashCommon.buildSrcApiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis", "texttospeech_v1")
@js.native
object texttospeech_v1 extends js.Object {
  @js.native
  class Resource$Text protected ()
    extends typings.googleapis.buildSrcApisTexttospeechV1Mod.texttospeech_v1.Resource$Text {
    def this(context: APIRequestContext) = this()
  }
  
  @js.native
  class Resource$Voices protected ()
    extends typings.googleapis.buildSrcApisTexttospeechV1Mod.texttospeech_v1.Resource$Voices {
    def this(context: APIRequestContext) = this()
  }
  
  /**
    * Cloud Text-to-Speech API
    *
    * Synthesizes natural-sounding speech by applying powerful neural network
    * models.
    *
    * @example
    * const {google} = require('googleapis');
    * const texttospeech = google.texttospeech('v1');
    *
    * @namespace texttospeech
    * @type {Function}
    * @version v1
    * @variation v1
    * @param {object=} options Options for Texttospeech
    */
  @js.native
  class Texttospeech protected ()
    extends typings.googleapis.buildSrcApisTexttospeechV1Mod.texttospeech_v1.Texttospeech {
    def this(options: GlobalOptions) = this()
    def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  }
  
}

