package typings.maximMazurokGapiClientAdmob

import typings.maximMazurokGapiClientAdmob.gapi.client.admob.AccountsResource
import typings.maximMazurokGapiClientAdmob.maximMazurokGapiClientAdmobStrings.admob
import typings.maximMazurokGapiClientAdmob.maximMazurokGapiClientAdmobStrings.v1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object gapi {
    
    object client {
      
      @JSGlobal("gapi.client")
      @js.native
      val ^ : js.Any = js.native
      
      object admob {
        
        @JSGlobal("gapi.client.admob.accounts")
        @js.native
        val accounts: AccountsResource = js.native
      }
      
      /** Load AdMob API v1 */
      inline def load(name: admob, version: v1): js.Thenable[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any])).asInstanceOf[js.Thenable[Unit]]
      inline def load(name: admob, version: v1, callback: js.Function0[js.Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    }
  }
}
