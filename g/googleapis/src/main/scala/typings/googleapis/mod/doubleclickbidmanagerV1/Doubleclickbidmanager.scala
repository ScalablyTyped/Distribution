package typings.googleapis.mod.doubleclickbidmanagerV1

import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * DoubleClick Bid Manager API
  *
  * API for viewing and managing your reports in DoubleClick Bid Manager.
  *
  * @example
  * const {google} = require('googleapis');
  * const doubleclickbidmanager = google.doubleclickbidmanager('v1');
  *
  * @namespace doubleclickbidmanager
  * @type {Function}
  * @version v1
  * @variation v1
  * @param {object=} options Options for Doubleclickbidmanager
  */
@JSImport("googleapis", "doubleclickbidmanager_v1.Doubleclickbidmanager")
@js.native
class Doubleclickbidmanager protected ()
  extends typings.googleapis.doubleclickbidmanagerV1Mod.doubleclickbidmanagerV1.Doubleclickbidmanager {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
}
