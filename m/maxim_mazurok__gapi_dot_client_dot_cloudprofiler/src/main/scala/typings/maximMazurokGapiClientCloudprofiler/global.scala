package typings.maximMazurokGapiClientCloudprofiler

import typings.maximMazurokGapiClientCloudprofiler.gapi.client.cloudprofiler.ProjectsResource
import typings.maximMazurokGapiClientCloudprofiler.maximMazurokGapiClientCloudprofilerStrings.cloudprofiler
import typings.maximMazurokGapiClientCloudprofiler.maximMazurokGapiClientCloudprofilerStrings.v2
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
      
      /** Load Stackdriver Profiler API v2 */
      def load(name: cloudprofiler, version: v2): js.Thenable[Unit] = js.native
      def load(name: cloudprofiler, version: v2, callback: js.Function0[_]): Unit = js.native
      
      @js.native
      object cloudprofiler extends js.Object {
        
        val projects: ProjectsResource = js.native
      }
    }
  }
}
