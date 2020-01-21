package typings.googleapis.mod.servicecontrolV1

import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Service Control API
  *
  * Provides control plane functionality to managed services, such as logging,
  * monitoring, and status checks.
  *
  * @example
  * const {google} = require('googleapis');
  * const servicecontrol = google.servicecontrol('v1');
  *
  * @namespace servicecontrol
  * @type {Function}
  * @version v1
  * @variation v1
  * @param {object=} options Options for Servicecontrol
  */
@JSImport("googleapis", "servicecontrol_v1.Servicecontrol")
@js.native
class Servicecontrol protected ()
  extends typings.googleapis.servicecontrolV1Mod.servicecontrolV1.Servicecontrol {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
}

