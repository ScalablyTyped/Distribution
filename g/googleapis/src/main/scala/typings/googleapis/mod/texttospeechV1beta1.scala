package typings.googleapis.mod

import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object texttospeechV1beta1 {
  
  @JSImport("googleapis", "texttospeech_v1beta1.Resource$Text")
  @js.native
  class ResourceText protected ()
    extends typings.googleapis.texttospeechV1beta1Mod.texttospeechV1beta1.ResourceText {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "texttospeech_v1beta1.Resource$Voices")
  @js.native
  class ResourceVoices protected ()
    extends typings.googleapis.texttospeechV1beta1Mod.texttospeechV1beta1.ResourceVoices {
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
    * const texttospeech = google.texttospeech('v1beta1');
    *
    * @namespace texttospeech
    * @type {Function}
    * @version v1beta1
    * @variation v1beta1
    * @param {object=} options Options for Texttospeech
    */
  @JSImport("googleapis", "texttospeech_v1beta1.Texttospeech")
  @js.native
  class Texttospeech protected ()
    extends typings.googleapis.texttospeechV1beta1Mod.texttospeechV1beta1.Texttospeech {
    def this(options: GlobalOptions) = this()
    def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  }
}
