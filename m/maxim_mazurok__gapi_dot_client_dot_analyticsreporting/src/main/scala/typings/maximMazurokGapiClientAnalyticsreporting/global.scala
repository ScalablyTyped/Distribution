package typings.maximMazurokGapiClientAnalyticsreporting

import typings.maximMazurokGapiClientAnalyticsreporting.gapi.client.analyticsreporting.ReportsResource
import typings.maximMazurokGapiClientAnalyticsreporting.gapi.client.analyticsreporting.UserActivityResource
import typings.maximMazurokGapiClientAnalyticsreporting.maximMazurokGapiClientAnalyticsreportingStrings.analyticsreporting
import typings.maximMazurokGapiClientAnalyticsreporting.maximMazurokGapiClientAnalyticsreportingStrings.v4
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object gapi {
    
    object client {
      
      object analyticsreporting {
        
        @JSGlobal("gapi.client.analyticsreporting.reports")
        @js.native
        val reports: ReportsResource = js.native
        
        @JSGlobal("gapi.client.analyticsreporting.userActivity")
        @js.native
        val userActivity: UserActivityResource = js.native
      }
      
      /** Load Analytics Reporting API v4 */
      @JSGlobal("gapi.client.load")
      @js.native
      def load(name: analyticsreporting, version: v4): js.Thenable[Unit] = js.native
      @JSGlobal("gapi.client.load")
      @js.native
      def load(name: analyticsreporting, version: v4, callback: js.Function0[_]): Unit = js.native
    }
  }
}
