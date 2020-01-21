package typings.googleapis.mod.cloudtasksV2beta3

import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Cloud Tasks API
  *
  * Manages the execution of large numbers of distributed requests.
  *
  * @example
  * const {google} = require('googleapis');
  * const cloudtasks = google.cloudtasks('v2beta3');
  *
  * @namespace cloudtasks
  * @type {Function}
  * @version v2beta3
  * @variation v2beta3
  * @param {object=} options Options for Cloudtasks
  */
@JSImport("googleapis", "cloudtasks_v2beta3.Cloudtasks")
@js.native
class Cloudtasks protected ()
  extends typings.googleapis.v2beta3Mod.cloudtasksV2beta3.Cloudtasks {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
}

