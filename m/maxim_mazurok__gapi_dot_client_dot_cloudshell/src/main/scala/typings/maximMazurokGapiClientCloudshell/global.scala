package typings.maximMazurokGapiClientCloudshell

import typings.maximMazurokGapiClientCloudshell.gapi.client.cloudshell.OperationsResource
import typings.maximMazurokGapiClientCloudshell.gapi.client.cloudshell.UsersResource
import typings.maximMazurokGapiClientCloudshell.maximMazurokGapiClientCloudshellStrings.cloudshell
import typings.maximMazurokGapiClientCloudshell.maximMazurokGapiClientCloudshellStrings.v1
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
      
      /** Load Cloud Shell API v1 */
      def load(name: cloudshell, version: v1): js.Thenable[Unit] = js.native
      def load(name: cloudshell, version: v1, callback: js.Function0[_]): Unit = js.native
      
      @js.native
      object cloudshell extends js.Object {
        
        val operations: OperationsResource = js.native
        
        val users: UsersResource = js.native
      }
    }
  }
}
