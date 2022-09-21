package typings.maximMazurokGapiClientAnalytics

import typings.maximMazurokGapiClientAnalytics.gapi.client.analytics.DataResource
import typings.maximMazurokGapiClientAnalytics.gapi.client.analytics.ManagementResource
import typings.maximMazurokGapiClientAnalytics.gapi.client.analytics.MetadataResource
import typings.maximMazurokGapiClientAnalytics.gapi.client.analytics.ProvisioningResource
import typings.maximMazurokGapiClientAnalytics.gapi.client.analytics.UserDeletionResource
import typings.maximMazurokGapiClientAnalytics.maximMazurokGapiClientAnalyticsStrings.analytics
import typings.maximMazurokGapiClientAnalytics.maximMazurokGapiClientAnalyticsStrings.v3
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object gapi {
    
    object client {
      
      @JSGlobal("gapi.client")
      @js.native
      val ^ : js.Any = js.native
      
      object analytics {
        
        @JSGlobal("gapi.client.analytics.data")
        @js.native
        val data: DataResource = js.native
        
        @JSGlobal("gapi.client.analytics.management")
        @js.native
        val management: ManagementResource = js.native
        
        @JSGlobal("gapi.client.analytics.metadata")
        @js.native
        val metadata: MetadataResource = js.native
        
        @JSGlobal("gapi.client.analytics.provisioning")
        @js.native
        val provisioning: ProvisioningResource = js.native
        
        @JSGlobal("gapi.client.analytics.userDeletion")
        @js.native
        val userDeletion: UserDeletionResource = js.native
      }
      
      /** Load Google Analytics API v3 */
      inline def load(name: analytics, version: v3): js.Thenable[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any])).asInstanceOf[js.Thenable[Unit]]
      inline def load(name: analytics, version: v3, callback: js.Function0[Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    }
  }
}
