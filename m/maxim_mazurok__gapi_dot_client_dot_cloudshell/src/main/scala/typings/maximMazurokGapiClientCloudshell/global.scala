package typings.maximMazurokGapiClientCloudshell

import typings.maximMazurokGapiClientCloudshell.gapi.client.cloudshell.OperationsResource
import typings.maximMazurokGapiClientCloudshell.gapi.client.cloudshell.UsersResource
import typings.maximMazurokGapiClientCloudshell.maximMazurokGapiClientCloudshellStrings.cloudshell
import typings.maximMazurokGapiClientCloudshell.maximMazurokGapiClientCloudshellStrings.v1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object gapi {
    
    object client {
      
      @JSGlobal("gapi.client")
      @js.native
      val ^ : js.Any = js.native
      
      object cloudshell {
        
        @JSGlobal("gapi.client.cloudshell.operations")
        @js.native
        val operations: OperationsResource = js.native
        
        @JSGlobal("gapi.client.cloudshell.users")
        @js.native
        val users: UsersResource = js.native
      }
      
      /** Load Cloud Shell API v1 */
      inline def load(name: cloudshell, version: v1): js.Thenable[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any])).asInstanceOf[js.Thenable[Unit]]
      inline def load(name: cloudshell, version: v1, callback: js.Function0[js.Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    }
  }
}
