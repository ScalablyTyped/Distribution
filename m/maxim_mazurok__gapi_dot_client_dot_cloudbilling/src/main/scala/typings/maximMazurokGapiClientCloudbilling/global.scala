package typings.maximMazurokGapiClientCloudbilling

import typings.maximMazurokGapiClientCloudbilling.gapi.client.cloudbilling.BillingAccountsResource
import typings.maximMazurokGapiClientCloudbilling.gapi.client.cloudbilling.ProjectsResource
import typings.maximMazurokGapiClientCloudbilling.gapi.client.cloudbilling.ServicesResource
import typings.maximMazurokGapiClientCloudbilling.maximMazurokGapiClientCloudbillingStrings.cloudbilling
import typings.maximMazurokGapiClientCloudbilling.maximMazurokGapiClientCloudbillingStrings.v1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object gapi {
    
    object client {
      
      @JSGlobal("gapi.client")
      @js.native
      val ^ : js.Any = js.native
      
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
      inline def load(name: cloudbilling, version: v1): js.Thenable[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any])).asInstanceOf[js.Thenable[Unit]]
      inline def load(name: cloudbilling, version: v1, callback: js.Function0[Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    }
  }
}
