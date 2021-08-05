package typings.maximMazurokGapiClientCloudtrace

import typings.maximMazurokGapiClientCloudtrace.gapi.client.cloudtrace.ProjectsResource
import typings.maximMazurokGapiClientCloudtrace.maximMazurokGapiClientCloudtraceStrings.cloudtrace
import typings.maximMazurokGapiClientCloudtrace.maximMazurokGapiClientCloudtraceStrings.v2
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object gapi {
    
    object client {
      
      @JSGlobal("gapi.client")
      @js.native
      val ^ : js.Any = js.native
      
      object cloudtrace {
        
        @JSGlobal("gapi.client.cloudtrace.projects")
        @js.native
        val projects: ProjectsResource = js.native
      }
      
      /** Load Cloud Trace API v2 */
      inline def load(name: cloudtrace, version: v2): js.Thenable[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any])).asInstanceOf[js.Thenable[Unit]]
      inline def load(name: cloudtrace, version: v2, callback: js.Function0[js.Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    }
  }
}
