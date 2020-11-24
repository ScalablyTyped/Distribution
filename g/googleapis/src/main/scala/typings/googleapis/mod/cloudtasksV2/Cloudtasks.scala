package typings.googleapis.mod.cloudtasksV2

import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Cloud Tasks API
  *
  * Manages the execution of large numbers of distributed requests.
  *
  * @example
  * const {google} = require('googleapis');
  * const cloudtasks = google.cloudtasks('v2');
  *
  * @namespace cloudtasks
  * @type {Function}
  * @version v2
  * @variation v2
  * @param {object=} options Options for Cloudtasks
  */
@JSImport("googleapis", "cloudtasks_v2.Cloudtasks")
@js.native
class Cloudtasks protected ()
  extends typings.googleapis.cloudtasksV2Mod.cloudtasksV2.Cloudtasks {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
}
