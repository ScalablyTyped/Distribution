package typings.maximMazurokGapiClientAdexchangebuyer2

import typings.maximMazurokGapiClientAdexchangebuyer2.gapi.client.adexchangebuyer2.AccountsResource
import typings.maximMazurokGapiClientAdexchangebuyer2.gapi.client.adexchangebuyer2.BiddersResource
import typings.maximMazurokGapiClientAdexchangebuyer2.maximMazurokGapiClientAdexchangebuyer2Strings.adexchangebuyer2
import typings.maximMazurokGapiClientAdexchangebuyer2.maximMazurokGapiClientAdexchangebuyer2Strings.v2beta1
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
      
      /** Load Ad Exchange Buyer API II v2beta1 */
      def load(name: adexchangebuyer2, version: v2beta1): js.Thenable[Unit] = js.native
      def load(name: adexchangebuyer2, version: v2beta1, callback: js.Function0[_]): Unit = js.native
      
      @js.native
      object adexchangebuyer2 extends js.Object {
        
        val accounts: AccountsResource = js.native
        
        val bidders: BiddersResource = js.native
      }
    }
  }
}
