package typings.googleapis.googleapisMod.analytics_v3

import typings.googleapisDashCommon.buildSrcApiMod.GlobalOptions
import typings.googleapisDashCommon.buildSrcApiMod.GoogleConfigurable
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
  extends typings.googleapis.buildSrcApisAnalyticsV3Mod.analytics_v3.Analytics {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
}

