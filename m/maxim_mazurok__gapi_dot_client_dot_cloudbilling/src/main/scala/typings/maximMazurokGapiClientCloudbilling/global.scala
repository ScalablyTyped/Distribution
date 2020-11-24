package typings.maximMazurokGapiClientCloudbilling

import typings.maximMazurokGapiClientCloudbilling.gapi.client.cloudbilling.BillingAccountsResource
import typings.maximMazurokGapiClientCloudbilling.gapi.client.cloudbilling.ProjectsResource
import typings.maximMazurokGapiClientCloudbilling.gapi.client.cloudbilling.ServicesResource
import typings.maximMazurokGapiClientCloudbilling.maximMazurokGapiClientCloudbillingStrings.cloudbilling
import typings.maximMazurokGapiClientCloudbilling.maximMazurokGapiClientCloudbillingStrings.v1
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
      
      /** Load Cloud Billing API v1 */
      def load(name: cloudbilling, version: v1): js.Thenable[Unit] = js.native
      def load(name: cloudbilling, version: v1, callback: js.Function0[_]): Unit = js.native
      
      @js.native
      object cloudbilling extends js.Object {
        
        val billingAccounts: BillingAccountsResource = js.native
        
        val projects: ProjectsResource = js.native
        
        val services: ServicesResource = js.native
      }
    }
  }
}
