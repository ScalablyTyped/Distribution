package typings.maximMazurokGapiClientClouddebugger

import typings.maximMazurokGapiClientClouddebugger.gapi.client.clouddebugger.ControllerResource
import typings.maximMazurokGapiClientClouddebugger.maximMazurokGapiClientClouddebuggerStrings.clouddebugger
import typings.maximMazurokGapiClientClouddebugger.maximMazurokGapiClientClouddebuggerStrings.v2
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object gapi {
    
    object client {
      
      @JSGlobal("gapi.client")
      @js.native
      val ^ : js.Any = js.native
      
      object clouddebugger {
        
        @JSGlobal("gapi.client.clouddebugger.controller")
        @js.native
        val controller: ControllerResource = js.native
      }
      
      /** Load Cloud Debugger API v2 */
      inline def load(name: clouddebugger, version: v2): js.Thenable[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any])).asInstanceOf[js.Thenable[Unit]]
      inline def load(name: clouddebugger, version: v2, callback: js.Function0[Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    }
  }
}
