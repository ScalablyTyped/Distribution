package typings.maximMazurokGapiClientCloudprofiler

import typings.maximMazurokGapiClientCloudprofiler.gapi.client.cloudprofiler.ProjectsResource
import typings.maximMazurokGapiClientCloudprofiler.maximMazurokGapiClientCloudprofilerStrings.cloudprofiler
import typings.maximMazurokGapiClientCloudprofiler.maximMazurokGapiClientCloudprofilerStrings.v2
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object gapi {
    
    object client {
      
      @JSGlobal("gapi.client")
      @js.native
      val ^ : js.Any = js.native
      
      object cloudprofiler {
        
        @JSGlobal("gapi.client.cloudprofiler.projects")
        @js.native
        val projects: ProjectsResource = js.native
      }
      
      /** Load Stackdriver Profiler API v2 */
      inline def load(name: cloudprofiler, version: v2): js.Thenable[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any])).asInstanceOf[js.Thenable[Unit]]
      inline def load(name: cloudprofiler, version: v2, callback: js.Function0[js.Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    }
  }
}
