package typings.maximMazurokGapiClientAdmin

import typings.maximMazurokGapiClientAdmin.gapi.client.admin.ActivitiesResource
import typings.maximMazurokGapiClientAdmin.gapi.client.admin.ChannelsResource
import typings.maximMazurokGapiClientAdmin.gapi.client.admin.CustomerUsageReportsResource
import typings.maximMazurokGapiClientAdmin.gapi.client.admin.EntityUsageReportsResource
import typings.maximMazurokGapiClientAdmin.gapi.client.admin.UserUsageReportResource
import typings.maximMazurokGapiClientAdmin.maximMazurokGapiClientAdminStrings.admin
import typings.maximMazurokGapiClientAdmin.maximMazurokGapiClientAdminStrings.reports_v1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object gapi {
    
    object client {
      
      @JSGlobal("gapi.client")
      @js.native
      val ^ : js.Any = js.native
      
      object admin {
        
        @JSGlobal("gapi.client.admin.activities")
        @js.native
        val activities: ActivitiesResource = js.native
        
        @JSGlobal("gapi.client.admin.channels")
        @js.native
        val channels: ChannelsResource = js.native
        
        @JSGlobal("gapi.client.admin.customerUsageReports")
        @js.native
        val customerUsageReports: CustomerUsageReportsResource = js.native
        
        @JSGlobal("gapi.client.admin.entityUsageReports")
        @js.native
        val entityUsageReports: EntityUsageReportsResource = js.native
        
        @JSGlobal("gapi.client.admin.userUsageReport")
        @js.native
        val userUsageReport: UserUsageReportResource = js.native
      }
      
      /** Load Admin SDK API reports_v1 */
      inline def load(name: admin, version: reports_v1): js.Thenable[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any])).asInstanceOf[js.Thenable[Unit]]
      inline def load(name: admin, version: reports_v1, callback: js.Function0[Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    }
  }
}
