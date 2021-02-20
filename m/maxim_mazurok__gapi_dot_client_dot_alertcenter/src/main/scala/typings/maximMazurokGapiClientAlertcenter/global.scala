package typings.maximMazurokGapiClientAlertcenter

import typings.maximMazurokGapiClientAlertcenter.gapi.client.alertcenter.AlertsResource
import typings.maximMazurokGapiClientAlertcenter.gapi.client.alertcenter.V1beta1Resource
import typings.maximMazurokGapiClientAlertcenter.maximMazurokGapiClientAlertcenterStrings.alertcenter
import typings.maximMazurokGapiClientAlertcenter.maximMazurokGapiClientAlertcenterStrings.v1beta1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object gapi {
    
    object client {
      
      object alertcenter {
        
        @JSGlobal("gapi.client.alertcenter.alerts")
        @js.native
        val alerts: AlertsResource = js.native
        
        @JSGlobal("gapi.client.alertcenter.v1beta1")
        @js.native
        val v1beta1: V1beta1Resource = js.native
      }
      
      /** Load G Suite Alert Center API v1beta1 */
      @JSGlobal("gapi.client.load")
      @js.native
      def load(name: alertcenter, version: v1beta1): js.Thenable[Unit] = js.native
      @JSGlobal("gapi.client.load")
      @js.native
      def load(name: alertcenter, version: v1beta1, callback: js.Function0[_]): Unit = js.native
    }
  }
}
