package typings.googleapis.mod.adsenseV14

import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * AdSense Management API
  *
  * Accesses AdSense publishers&#39; inventory and generates performance
  * reports.
  *
  * @example
  * const {google} = require('googleapis');
  * const adsense = google.adsense('v1.4');
  *
  * @namespace adsense
  * @type {Function}
  * @version v1.4
  * @variation v1.4
  * @param {object=} options Options for Adsense
  */
@JSImport("googleapis", "adsense_v1_4.Adsense")
@js.native
class Adsense protected ()
  extends typings.googleapis.v1Dot4Mod.adsenseV14.Adsense {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
}
