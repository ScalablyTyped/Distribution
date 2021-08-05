package typings.maximMazurokGapiClientAlertcenter

import typings.maximMazurokGapiClientAlertcenter.gapi.client.alertcenter.AlertsResource
import typings.maximMazurokGapiClientAlertcenter.gapi.client.alertcenter.V1beta1Resource
import typings.maximMazurokGapiClientAlertcenter.maximMazurokGapiClientAlertcenterStrings.alertcenter
import typings.maximMazurokGapiClientAlertcenter.maximMazurokGapiClientAlertcenterStrings.v1beta1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object gapi {
    
    object client {
      
      @JSGlobal("gapi.client")
      @js.native
      val ^ : js.Any = js.native
      
      object alertcenter {
        
        @JSGlobal("gapi.client.alertcenter.alerts")
        @js.native
        val alerts: AlertsResource = js.native
        
        @JSGlobal("gapi.client.alertcenter.v1beta1")
        @js.native
        val v1beta1: V1beta1Resource = js.native
      }
      
      /** Load G Suite Alert Center API v1beta1 */
      inline def load(name: alertcenter, version: v1beta1): js.Thenable[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any])).asInstanceOf[js.Thenable[Unit]]
      inline def load(name: alertcenter, version: v1beta1, callback: js.Function0[js.Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    }
  }
}
