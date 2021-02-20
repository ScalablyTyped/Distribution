package typings.maximMazurokGapiClientCloudprofiler

import typings.maximMazurokGapiClientCloudprofiler.gapi.client.cloudprofiler.ProjectsResource
import typings.maximMazurokGapiClientCloudprofiler.maximMazurokGapiClientCloudprofilerStrings.cloudprofiler
import typings.maximMazurokGapiClientCloudprofiler.maximMazurokGapiClientCloudprofilerStrings.v2
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object gapi {
    
    object client {
      
      object cloudprofiler {
        
        @JSGlobal("gapi.client.cloudprofiler.projects")
        @js.native
        val projects: ProjectsResource = js.native
      }
      
      /** Load Stackdriver Profiler API v2 */
      @JSGlobal("gapi.client.load")
      @js.native
      def load(name: cloudprofiler, version: v2): js.Thenable[Unit] = js.native
      @JSGlobal("gapi.client.load")
      @js.native
      def load(name: cloudprofiler, version: v2, callback: js.Function0[_]): Unit = js.native
    }
  }
}
