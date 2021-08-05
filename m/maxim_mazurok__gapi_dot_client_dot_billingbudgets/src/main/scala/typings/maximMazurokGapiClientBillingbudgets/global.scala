package typings.maximMazurokGapiClientBillingbudgets

import typings.maximMazurokGapiClientBillingbudgets.gapi.client.billingbudgets.BillingAccountsResource
import typings.maximMazurokGapiClientBillingbudgets.maximMazurokGapiClientBillingbudgetsStrings.billingbudgets
import typings.maximMazurokGapiClientBillingbudgets.maximMazurokGapiClientBillingbudgetsStrings.v1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object gapi {
    
    object client {
      
      @JSGlobal("gapi.client")
      @js.native
      val ^ : js.Any = js.native
      
      object billingbudgets {
        
        @JSGlobal("gapi.client.billingbudgets.billingAccounts")
        @js.native
        val billingAccounts: BillingAccountsResource = js.native
      }
      
      /** Load Cloud Billing Budget API v1 */
      inline def load(name: billingbudgets, version: v1): js.Thenable[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any])).asInstanceOf[js.Thenable[Unit]]
      inline def load(name: billingbudgets, version: v1, callback: js.Function0[js.Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    }
  }
}
