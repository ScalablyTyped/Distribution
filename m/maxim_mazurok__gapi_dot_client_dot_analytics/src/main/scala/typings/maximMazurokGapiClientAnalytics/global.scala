package typings.maximMazurokGapiClientAnalytics

import typings.maximMazurokGapiClientAnalytics.gapi.client.analytics.DataResource
import typings.maximMazurokGapiClientAnalytics.gapi.client.analytics.ManagementResource
import typings.maximMazurokGapiClientAnalytics.gapi.client.analytics.MetadataResource
import typings.maximMazurokGapiClientAnalytics.gapi.client.analytics.ProvisioningResource
import typings.maximMazurokGapiClientAnalytics.gapi.client.analytics.UserDeletionResource
import typings.maximMazurokGapiClientAnalytics.maximMazurokGapiClientAnalyticsStrings.analytics
import typings.maximMazurokGapiClientAnalytics.maximMazurokGapiClientAnalyticsStrings.v3
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
      
      /** Load Google Analytics API v3 */
      def load(name: analytics, version: v3): js.Thenable[Unit] = js.native
      def load(name: analytics, version: v3, callback: js.Function0[_]): Unit = js.native
      
      @js.native
      object analytics extends js.Object {
        
        val data: DataResource = js.native
        
        val management: ManagementResource = js.native
        
        val metadata: MetadataResource = js.native
        
        val provisioning: ProvisioningResource = js.native
        
        val userDeletion: UserDeletionResource = js.native
      }
    }
  }
}
