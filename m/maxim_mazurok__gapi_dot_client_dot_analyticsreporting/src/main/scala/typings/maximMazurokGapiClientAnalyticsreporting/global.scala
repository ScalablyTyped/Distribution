package typings.maximMazurokGapiClientAnalyticsreporting

import typings.maximMazurokGapiClientAnalyticsreporting.gapi.client.analyticsreporting.ReportsResource
import typings.maximMazurokGapiClientAnalyticsreporting.gapi.client.analyticsreporting.UserActivityResource
import typings.maximMazurokGapiClientAnalyticsreporting.maximMazurokGapiClientAnalyticsreportingStrings.analyticsreporting
import typings.maximMazurokGapiClientAnalyticsreporting.maximMazurokGapiClientAnalyticsreportingStrings.v4
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object gapi {
    
    object client {
      
      @JSGlobal("gapi.client")
      @js.native
      val ^ : js.Any = js.native
      
      object analyticsreporting {
        
        @JSGlobal("gapi.client.analyticsreporting.reports")
        @js.native
        val reports: ReportsResource = js.native
        
        @JSGlobal("gapi.client.analyticsreporting.userActivity")
        @js.native
        val userActivity: UserActivityResource = js.native
      }
      
      /** Load Analytics Reporting API v4 */
      @scala.inline
      def load(name: analyticsreporting, version: v4): js.Thenable[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any])).asInstanceOf[js.Thenable[Unit]]
      @scala.inline
      def load(name: analyticsreporting, version: v4, callback: js.Function0[js.Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    }
  }
}
