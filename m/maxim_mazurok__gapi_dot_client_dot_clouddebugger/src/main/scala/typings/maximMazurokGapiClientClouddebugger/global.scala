package typings.maximMazurokGapiClientClouddebugger

import typings.maximMazurokGapiClientClouddebugger.gapi.client.clouddebugger.ControllerResource
import typings.maximMazurokGapiClientClouddebugger.maximMazurokGapiClientClouddebuggerStrings.clouddebugger
import typings.maximMazurokGapiClientClouddebugger.maximMazurokGapiClientClouddebuggerStrings.v2
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
      
      /** Load Cloud Debugger API v2 */
      def load(name: clouddebugger, version: v2): js.Thenable[Unit] = js.native
      def load(name: clouddebugger, version: v2, callback: js.Function0[_]): Unit = js.native
      
      @js.native
      object clouddebugger extends js.Object {
        
        val controller: ControllerResource = js.native
      }
    }
  }
}
