package typings.maximMazurokGapiClientCloudtasks

import typings.maximMazurokGapiClientCloudtasks.gapi.client.cloudtasks.ProjectsResource
import typings.maximMazurokGapiClientCloudtasks.maximMazurokGapiClientCloudtasksStrings.cloudtasks
import typings.maximMazurokGapiClientCloudtasks.maximMazurokGapiClientCloudtasksStrings.v2
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
      
      /** Load Cloud Tasks API v2 */
      def load(name: cloudtasks, version: v2): js.Thenable[Unit] = js.native
      def load(name: cloudtasks, version: v2, callback: js.Function0[_]): Unit = js.native
      
      @js.native
      object cloudtasks extends js.Object {
        
        val projects: ProjectsResource = js.native
      }
    }
  }
}
