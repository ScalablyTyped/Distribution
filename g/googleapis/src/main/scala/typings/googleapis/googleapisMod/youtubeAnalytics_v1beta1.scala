package typings.googleapis.googleapisMod

import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.GlobalOptions
import typings.googleapisDashCommon.buildSrcApiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis", "youtubeAnalytics_v1beta1")
@js.native
object youtubeAnalytics_v1beta1 extends js.Object {
  @js.native
  class Resource$Groupitems protected ()
    extends typings.googleapis.buildSrcApisYoutubeAnalyticsV1beta1Mod.youtubeAnalytics_v1beta1.Resource$Groupitems {
    def this(context: APIRequestContext) = this()
  }
  
  @js.native
  class Resource$Groups protected ()
    extends typings.googleapis.buildSrcApisYoutubeAnalyticsV1beta1Mod.youtubeAnalytics_v1beta1.Resource$Groups {
    def this(context: APIRequestContext) = this()
  }
  
  @js.native
  class Resource$Reports protected ()
    extends typings.googleapis.buildSrcApisYoutubeAnalyticsV1beta1Mod.youtubeAnalytics_v1beta1.Resource$Reports {
    def this(context: APIRequestContext) = this()
  }
  
  /**
    * YouTube Analytics API
    *
    * Retrieves your YouTube Analytics data.
    *
    * @example
    * const {google} = require('googleapis');
    * const youtubeAnalytics = google.youtubeAnalytics('v1beta1');
    *
    * @namespace youtubeAnalytics
    * @type {Function}
    * @version v1beta1
    * @variation v1beta1
    * @param {object=} options Options for Youtubeanalytics
    */
  @js.native
  class Youtubeanalytics protected ()
    extends typings.googleapis.buildSrcApisYoutubeAnalyticsV1beta1Mod.youtubeAnalytics_v1beta1.Youtubeanalytics {
    def this(options: GlobalOptions) = this()
    def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  }
  
}

