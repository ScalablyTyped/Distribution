package typings.googleapis.mod.gamesManagementV1management

import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Google Play Game Services Management API
  *
  * The Management API for Google Play Game Services.
  *
  * @example
  * const {google} = require('googleapis');
  * const gamesManagement = google.gamesManagement('v1management');
  *
  * @namespace gamesManagement
  * @type {Function}
  * @version v1management
  * @variation v1management
  * @param {object=} options Options for Gamesmanagement
  */
@JSImport("googleapis", "gamesManagement_v1management.Gamesmanagement")
@js.native
class Gamesmanagement protected ()
  extends typings.googleapis.v1managementMod.gamesManagementV1management.Gamesmanagement {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
}

