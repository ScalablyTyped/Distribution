package typings.maximMazurokGapiClientBillingbudgets

import typings.maximMazurokGapiClientBillingbudgets.gapi.client.billingbudgets.BillingAccountsResource
import typings.maximMazurokGapiClientBillingbudgets.maximMazurokGapiClientBillingbudgetsStrings.billingbudgets
import typings.maximMazurokGapiClientBillingbudgets.maximMazurokGapiClientBillingbudgetsStrings.v1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object gapi {
    
    object client {
      
      object billingbudgets {
        
        @JSGlobal("gapi.client.billingbudgets.billingAccounts")
        @js.native
        val billingAccounts: BillingAccountsResource = js.native
      }
      
      /** Load Cloud Billing Budget API v1 */
      @JSGlobal("gapi.client.load")
      @js.native
      def load(name: billingbudgets, version: v1): js.Thenable[Unit] = js.native
      @JSGlobal("gapi.client.load")
      @js.native
      def load(name: billingbudgets, version: v1, callback: js.Function0[_]): Unit = js.native
    }
  }
}
