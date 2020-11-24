package typings.googleapis.youtubeAnalyticsV1Mod.youtubeAnalyticsV1

import typings.googleapisCommon.apiMod.APIRequestContext
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
  * const youtubeAnalytics = google.youtubeAnalytics('v1');
  *
  * @namespace youtubeAnalytics
  * @type {Function}
  * @version v1
  * @variation v1
  * @param {object=} options Options for Youtubeanalytics
  */
@JSImport("googleapis/build/src/apis/youtubeAnalytics/v1", "youtubeAnalytics_v1.Youtubeanalytics")
@js.native
class Youtubeanalytics protected () extends js.Object {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  
  var context: APIRequestContext = js.native
  
  var groupItems: ResourceGroupitems = js.native
  
  var groups: ResourceGroups = js.native
  
  var reports: ResourceReports = js.native
}
