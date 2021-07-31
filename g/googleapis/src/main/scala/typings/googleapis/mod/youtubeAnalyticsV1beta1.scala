package typings.googleapis.mod

import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object youtubeAnalyticsV1beta1 {
  
  @JSImport("googleapis", "youtubeAnalytics_v1beta1.Resource$Groupitems")
  @js.native
  class ResourceGroupitems protected ()
    extends typings.googleapis.youtubeAnalyticsV1beta1Mod.youtubeAnalyticsV1beta1.ResourceGroupitems {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "youtubeAnalytics_v1beta1.Resource$Groups")
  @js.native
  class ResourceGroups protected ()
    extends typings.googleapis.youtubeAnalyticsV1beta1Mod.youtubeAnalyticsV1beta1.ResourceGroups {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "youtubeAnalytics_v1beta1.Resource$Reports")
  @js.native
  class ResourceReports protected ()
    extends typings.googleapis.youtubeAnalyticsV1beta1Mod.youtubeAnalyticsV1beta1.ResourceReports {
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
  @JSImport("googleapis", "youtubeAnalytics_v1beta1.Youtubeanalytics")
  @js.native
  class Youtubeanalytics protected ()
    extends typings.googleapis.youtubeAnalyticsV1beta1Mod.youtubeAnalyticsV1beta1.Youtubeanalytics {
    def this(options: GlobalOptions) = this()
    def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  }
}
