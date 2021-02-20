package typings.maximMazurokGapiClientAdexchangebuyer2

import typings.maximMazurokGapiClientAdexchangebuyer2.gapi.client.adexchangebuyer2.AccountsResource
import typings.maximMazurokGapiClientAdexchangebuyer2.gapi.client.adexchangebuyer2.BiddersResource
import typings.maximMazurokGapiClientAdexchangebuyer2.maximMazurokGapiClientAdexchangebuyer2Strings.adexchangebuyer2
import typings.maximMazurokGapiClientAdexchangebuyer2.maximMazurokGapiClientAdexchangebuyer2Strings.v2beta1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object gapi {
    
    object client {
      
      object adexchangebuyer2 {
        
        @JSGlobal("gapi.client.adexchangebuyer2.accounts")
        @js.native
        val accounts: AccountsResource = js.native
        
        @JSGlobal("gapi.client.adexchangebuyer2.bidders")
        @js.native
        val bidders: BiddersResource = js.native
      }
      
      /** Load Ad Exchange Buyer API II v2beta1 */
      @JSGlobal("gapi.client.load")
      @js.native
      def load(name: adexchangebuyer2, version: v2beta1): js.Thenable[Unit] = js.native
      @JSGlobal("gapi.client.load")
      @js.native
      def load(name: adexchangebuyer2, version: v2beta1, callback: js.Function0[_]): Unit = js.native
    }
  }
}
