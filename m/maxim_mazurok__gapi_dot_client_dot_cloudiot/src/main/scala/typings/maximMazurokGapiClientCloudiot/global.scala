package typings.maximMazurokGapiClientCloudiot

import typings.maximMazurokGapiClientCloudiot.gapi.client.cloudiot.ProjectsResource
import typings.maximMazurokGapiClientCloudiot.maximMazurokGapiClientCloudiotStrings.cloudiot
import typings.maximMazurokGapiClientCloudiot.maximMazurokGapiClientCloudiotStrings.v1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object gapi {
    
    object client {
      
      @JSGlobal("gapi.client")
      @js.native
      val ^ : js.Any = js.native
      
      object cloudiot {
        
        @JSGlobal("gapi.client.cloudiot.projects")
        @js.native
        val projects: ProjectsResource = js.native
      }
      
      /** Load Cloud IoT API v1 */
      inline def load(name: cloudiot, version: v1): js.Thenable[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any])).asInstanceOf[js.Thenable[Unit]]
      inline def load(name: cloudiot, version: v1, callback: js.Function0[js.Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    }
  }
}
