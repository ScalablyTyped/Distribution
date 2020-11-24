package typings.googleapis.mod.loggingV2beta1

import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Stackdriver Logging API
  *
  * Writes log entries and manages your Logging configuration.
  *
  * @example
  * const {google} = require('googleapis');
  * const logging = google.logging('v2beta1');
  *
  * @namespace logging
  * @type {Function}
  * @version v2beta1
  * @variation v2beta1
  * @param {object=} options Options for Logging
  */
@JSImport("googleapis", "logging_v2beta1.Logging")
@js.native
class Logging protected ()
  extends typings.googleapis.loggingV2beta1Mod.loggingV2beta1.Logging {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
}
