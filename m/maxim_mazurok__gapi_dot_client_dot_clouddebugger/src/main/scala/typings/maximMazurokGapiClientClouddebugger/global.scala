package typings.maximMazurokGapiClientClouddebugger

import typings.maximMazurokGapiClientClouddebugger.gapi.client.clouddebugger.ControllerResource
import typings.maximMazurokGapiClientClouddebugger.maximMazurokGapiClientClouddebuggerStrings.clouddebugger
import typings.maximMazurokGapiClientClouddebugger.maximMazurokGapiClientClouddebuggerStrings.v2
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object gapi {
    
    object client {
      
      object clouddebugger {
        
        @JSGlobal("gapi.client.clouddebugger.controller")
        @js.native
        val controller: ControllerResource = js.native
      }
      
      /** Load Cloud Debugger API v2 */
      @JSGlobal("gapi.client.load")
      @js.native
      def load(name: clouddebugger, version: v2): js.Thenable[Unit] = js.native
      @JSGlobal("gapi.client.load")
      @js.native
      def load(name: clouddebugger, version: v2, callback: js.Function0[_]): Unit = js.native
    }
  }
}
