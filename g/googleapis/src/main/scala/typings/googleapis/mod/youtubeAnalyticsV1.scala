package typings.googleapis.mod

import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object youtubeAnalyticsV1 {
  
  /**
    * YouTube Analytics API
    *
    * Retrieves your YouTube Analytics data.
    *
    * @example
    * ```js
    * const {google} = require('googleapis');
    * const youtubeAnalytics = google.youtubeAnalytics('v1');
    * ```
    */
  @JSImport("googleapis", "youtubeAnalytics_v1.Youtubeanalytics")
  @js.native
  open class Youtubeanalytics protected ()
    extends typings.googleapis.youtubeAnalyticsV1Mod.youtubeAnalyticsV1.Youtubeanalytics {
    def this(options: GlobalOptions) = this()
    def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  }
}
