package typings.maximMazurokGapiClientAnalyticsreporting

import typings.maximMazurokGapiClientAnalyticsreporting.gapi.client.analyticsreporting.ReportsResource
import typings.maximMazurokGapiClientAnalyticsreporting.gapi.client.analyticsreporting.UserActivityResource
import typings.maximMazurokGapiClientAnalyticsreporting.maximMazurokGapiClientAnalyticsreportingStrings.analyticsreporting
import typings.maximMazurokGapiClientAnalyticsreporting.maximMazurokGapiClientAnalyticsreportingStrings.v4
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobalScope
@js.native
object global extends js.Object {
  
  @js.native
  object gapi extends js.Object {
    
    @js.native
    object client extends js.Object {
      
      /** Load Analytics Reporting API v4 */
      def load(name: analyticsreporting, version: v4): js.Thenable[Unit] = js.native
      def load(name: analyticsreporting, version: v4, callback: js.Function0[_]): Unit = js.native
      
      @js.native
      object analyticsreporting extends js.Object {
        
        val reports: ReportsResource = js.native
        
        val userActivity: UserActivityResource = js.native
      }
    }
  }
}
