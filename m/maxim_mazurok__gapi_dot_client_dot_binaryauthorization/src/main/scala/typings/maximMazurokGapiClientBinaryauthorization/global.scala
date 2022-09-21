package typings.maximMazurokGapiClientBinaryauthorization

import typings.maximMazurokGapiClientBinaryauthorization.gapi.client.binaryauthorization.ProjectsResource
import typings.maximMazurokGapiClientBinaryauthorization.gapi.client.binaryauthorization.SystempolicyResource
import typings.maximMazurokGapiClientBinaryauthorization.maximMazurokGapiClientBinaryauthorizationStrings.binaryauthorization
import typings.maximMazurokGapiClientBinaryauthorization.maximMazurokGapiClientBinaryauthorizationStrings.v1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object gapi {
    
    object client {
      
      @JSGlobal("gapi.client")
      @js.native
      val ^ : js.Any = js.native
      
      object binaryauthorization {
        
        @JSGlobal("gapi.client.binaryauthorization.projects")
        @js.native
        val projects: ProjectsResource = js.native
        
        @JSGlobal("gapi.client.binaryauthorization.systempolicy")
        @js.native
        val systempolicy: SystempolicyResource = js.native
      }
      
      /** Load Binary Authorization API v1 */
      inline def load(name: binaryauthorization, version: v1): js.Thenable[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any])).asInstanceOf[js.Thenable[Unit]]
      inline def load(name: binaryauthorization, version: v1, callback: js.Function0[Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    }
  }
}
