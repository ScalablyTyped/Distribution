package typings.googleapis.mod.dialogflowV2

import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Dialogflow API
  *
  * Builds conversational interfaces (for example, chatbots, and voice-powered
  * apps and devices).
  *
  * @example
  * const {google} = require('googleapis');
  * const dialogflow = google.dialogflow('v2');
  *
  * @namespace dialogflow
  * @type {Function}
  * @version v2
  * @variation v2
  * @param {object=} options Options for Dialogflow
  */
@JSImport("googleapis", "dialogflow_v2.Dialogflow")
@js.native
class Dialogflow protected ()
  extends typings.googleapis.dialogflowV2Mod.dialogflowV2.Dialogflow {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
}
