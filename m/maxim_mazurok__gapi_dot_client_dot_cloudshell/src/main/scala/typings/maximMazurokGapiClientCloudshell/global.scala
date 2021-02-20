package typings.maximMazurokGapiClientCloudshell

import typings.maximMazurokGapiClientCloudshell.gapi.client.cloudshell.OperationsResource
import typings.maximMazurokGapiClientCloudshell.gapi.client.cloudshell.UsersResource
import typings.maximMazurokGapiClientCloudshell.maximMazurokGapiClientCloudshellStrings.cloudshell
import typings.maximMazurokGapiClientCloudshell.maximMazurokGapiClientCloudshellStrings.v1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object gapi {
    
    object client {
      
      object cloudshell {
        
        @JSGlobal("gapi.client.cloudshell.operations")
        @js.native
        val operations: OperationsResource = js.native
        
        @JSGlobal("gapi.client.cloudshell.users")
        @js.native
        val users: UsersResource = js.native
      }
      
      /** Load Cloud Shell API v1 */
      @JSGlobal("gapi.client.load")
      @js.native
      def load(name: cloudshell, version: v1): js.Thenable[Unit] = js.native
      @JSGlobal("gapi.client.load")
      @js.native
      def load(name: cloudshell, version: v1, callback: js.Function0[_]): Unit = js.native
    }
  }
}
