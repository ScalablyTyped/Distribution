package typings.maximMazurokGapiClientAdmin

import typings.maximMazurokGapiClientAdmin.gapi.client.admin.ActivitiesResource
import typings.maximMazurokGapiClientAdmin.gapi.client.admin.ChannelsResource
import typings.maximMazurokGapiClientAdmin.gapi.client.admin.CustomerUsageReportsResource
import typings.maximMazurokGapiClientAdmin.gapi.client.admin.EntityUsageReportsResource
import typings.maximMazurokGapiClientAdmin.gapi.client.admin.UserUsageReportResource
import typings.maximMazurokGapiClientAdmin.maximMazurokGapiClientAdminStrings.admin
import typings.maximMazurokGapiClientAdmin.maximMazurokGapiClientAdminStrings.reports_v1
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
      
      /** Load Admin SDK reports_v1 */
      def load(name: admin, version: reports_v1): js.Thenable[Unit] = js.native
      def load(name: admin, version: reports_v1, callback: js.Function0[_]): Unit = js.native
      
      @js.native
      object admin extends js.Object {
        
        val activities: ActivitiesResource = js.native
        
        val channels: ChannelsResource = js.native
        
        val customerUsageReports: CustomerUsageReportsResource = js.native
        
        val entityUsageReports: EntityUsageReportsResource = js.native
        
        val userUsageReport: UserUsageReportResource = js.native
      }
    }
  }
}
