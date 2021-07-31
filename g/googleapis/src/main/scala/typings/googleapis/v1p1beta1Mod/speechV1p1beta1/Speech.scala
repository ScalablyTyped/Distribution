package typings.googleapis.v1p1beta1Mod.speechV1p1beta1

import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Cloud Speech-to-Text API
  *
  * Converts audio to text by applying powerful neural network models.
  *
  * @example
  * const {google} = require('googleapis');
  * const speech = google.speech('v1p1beta1');
  *
  * @namespace speech
  * @type {Function}
  * @version v1p1beta1
  * @variation v1p1beta1
  * @param {object=} options Options for Speech
  */
@JSImport("googleapis/build/src/apis/speech/v1p1beta1", "speech_v1p1beta1.Speech")
@js.native
class Speech protected () extends StObject {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  
  var context: APIRequestContext = js.native
  
  var operations: ResourceOperations = js.native
  
  var projects: ResourceProjects = js.native
  
  var speech: ResourceSpeech = js.native
}
