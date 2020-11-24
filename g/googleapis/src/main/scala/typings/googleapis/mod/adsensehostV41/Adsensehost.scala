package typings.googleapis.mod.adsensehostV41

import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * AdSense Host API
  *
  * Generates performance reports, generates ad codes, and provides publisher
  * management capabilities for AdSense Hosts.
  *
  * @example
  * const {google} = require('googleapis');
  * const adsensehost = google.adsensehost('v4.1');
  *
  * @namespace adsensehost
  * @type {Function}
  * @version v4.1
  * @variation v4.1
  * @param {object=} options Options for Adsensehost
  */
@JSImport("googleapis", "adsensehost_v4_1.Adsensehost")
@js.native
class Adsensehost protected ()
  extends typings.googleapis.v41Mod.adsensehostV41.Adsensehost {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
}
