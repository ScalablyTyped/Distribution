package typings.googleapis.mod.youtubeAnalyticsV2

import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * YouTube Analytics API
  *
  * Retrieves your YouTube Analytics data.
  *
  * @example
  * const {google} = require('googleapis');
  * const youtubeAnalytics = google.youtubeAnalytics('v2');
  *
  * @namespace youtubeAnalytics
  * @type {Function}
  * @version v2
  * @variation v2
  * @param {object=} options Options for Youtubeanalytics
  */
@JSImport("googleapis", "youtubeAnalytics_v2.Youtubeanalytics")
@js.native
class Youtubeanalytics protected ()
  extends typings.googleapis.youtubeAnalyticsV2Mod.youtubeAnalyticsV2.Youtubeanalytics {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
}
