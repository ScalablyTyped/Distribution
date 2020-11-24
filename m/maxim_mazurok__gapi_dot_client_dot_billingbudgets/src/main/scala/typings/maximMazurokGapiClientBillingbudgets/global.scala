package typings.maximMazurokGapiClientBillingbudgets

import typings.maximMazurokGapiClientBillingbudgets.gapi.client.billingbudgets.BillingAccountsResource
import typings.maximMazurokGapiClientBillingbudgets.maximMazurokGapiClientBillingbudgetsStrings.billingbudgets
import typings.maximMazurokGapiClientBillingbudgets.maximMazurokGapiClientBillingbudgetsStrings.v1
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
      
      /** Load Cloud Billing Budget API v1 */
      def load(name: billingbudgets, version: v1): js.Thenable[Unit] = js.native
      def load(name: billingbudgets, version: v1, callback: js.Function0[_]): Unit = js.native
      
      @js.native
      object billingbudgets extends js.Object {
        
        val billingAccounts: BillingAccountsResource = js.native
      }
    }
  }
}
