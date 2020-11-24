package typings.maximMazurokGapiClientAdmob

import typings.maximMazurokGapiClientAdmob.gapi.client.admob.AccountsResource
import typings.maximMazurokGapiClientAdmob.maximMazurokGapiClientAdmobStrings.admob
import typings.maximMazurokGapiClientAdmob.maximMazurokGapiClientAdmobStrings.v1
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
      
      /** Load AdMob API v1 */
      def load(name: admob, version: v1): js.Thenable[Unit] = js.native
      def load(name: admob, version: v1, callback: js.Function0[_]): Unit = js.native
      
      @js.native
      object admob extends js.Object {
        
        val accounts: AccountsResource = js.native
      }
    }
  }
}
