package typings.googleapis.googleapisMod.adsense_v1_4

import typings.googleapisDashCommon.buildSrcApiMod.GlobalOptions
import typings.googleapisDashCommon.buildSrcApiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  extends typings.googleapis.buildSrcApisAdsenseV1Dot4Mod.adsense_v1_4.Adsense {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
}

