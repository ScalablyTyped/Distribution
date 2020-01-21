package typings.googleapis.mod.analyticsV3

import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Google Analytics API
  *
  * Views and manages your Google Analytics data.
  *
  * @example
  * const {google} = require('googleapis');
  * const analytics = google.analytics('v3');
  *
  * @namespace analytics
  * @type {Function}
  * @version v3
  * @variation v3
  * @param {object=} options Options for Analytics
  */
@JSImport("googleapis", "analytics_v3.Analytics")
@js.native
class Analytics protected ()
  extends typings.googleapis.v3Mod.analyticsV3.Analytics {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
}

