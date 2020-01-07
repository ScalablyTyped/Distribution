package typings.googleapis.googleapisMod

import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.GlobalOptions
import typings.googleapisDashCommon.buildSrcApiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis", "youtubeAnalytics_v2")
@js.native
object youtubeAnalytics_v2 extends js.Object {
  @js.native
  class Resource$Groupitems protected ()
    extends typings.googleapis.buildSrcApisYoutubeAnalyticsV2Mod.youtubeAnalytics_v2.Resource$Groupitems {
    def this(context: APIRequestContext) = this()
  }
  
  @js.native
  class Resource$Groups protected ()
    extends typings.googleapis.buildSrcApisYoutubeAnalyticsV2Mod.youtubeAnalytics_v2.Resource$Groups {
    def this(context: APIRequestContext) = this()
  }
  
  @js.native
  class Resource$Reports protected ()
    extends typings.googleapis.buildSrcApisYoutubeAnalyticsV2Mod.youtubeAnalytics_v2.Resource$Reports {
    def this(context: APIRequestContext) = this()
  }
  
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
  @js.native
  class Youtubeanalytics protected ()
    extends typings.googleapis.buildSrcApisYoutubeAnalyticsV2Mod.youtubeAnalytics_v2.Youtubeanalytics {
    def this(options: GlobalOptions) = this()
    def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  }
  
}

