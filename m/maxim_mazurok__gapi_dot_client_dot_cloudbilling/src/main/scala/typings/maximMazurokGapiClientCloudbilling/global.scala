package typings.maximMazurokGapiClientCloudbilling

import typings.maximMazurokGapiClientCloudbilling.gapi.client.cloudbilling.BillingAccountsResource
import typings.maximMazurokGapiClientCloudbilling.gapi.client.cloudbilling.ProjectsResource
import typings.maximMazurokGapiClientCloudbilling.gapi.client.cloudbilling.ServicesResource
import typings.maximMazurokGapiClientCloudbilling.maximMazurokGapiClientCloudbillingStrings.cloudbilling
import typings.maximMazurokGapiClientCloudbilling.maximMazurokGapiClientCloudbillingStrings.v1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object gapi {
    
    object client {
      
      object cloudbilling {
        
        @JSGlobal("gapi.client.cloudbilling.billingAccounts")
        @js.native
        val billingAccounts: BillingAccountsResource = js.native
        
        @JSGlobal("gapi.client.cloudbilling.projects")
        @js.native
        val projects: ProjectsResource = js.native
        
        @JSGlobal("gapi.client.cloudbilling.services")
        @js.native
        val services: ServicesResource = js.native
      }
      
      /** Load Cloud Billing API v1 */
      @JSGlobal("gapi.client.load")
      @js.native
      def load(name: cloudbilling, version: v1): js.Thenable[Unit] = js.native
      @JSGlobal("gapi.client.load")
      @js.native
      def load(name: cloudbilling, version: v1, callback: js.Function0[_]): Unit = js.native
    }
  }
}
