package typings.googleapis.mod.groupssettingsV1

import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Groups Settings API
  *
  * Manages permission levels and related settings of a group.
  *
  * @example
  * const {google} = require('googleapis');
  * const groupssettings = google.groupssettings('v1');
  *
  * @namespace groupssettings
  * @type {Function}
  * @version v1
  * @variation v1
  * @param {object=} options Options for Groupssettings
  */
@JSImport("googleapis", "groupssettings_v1.Groupssettings")
@js.native
class Groupssettings protected ()
  extends typings.googleapis.groupssettingsV1Mod.groupssettingsV1.Groupssettings {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
}

