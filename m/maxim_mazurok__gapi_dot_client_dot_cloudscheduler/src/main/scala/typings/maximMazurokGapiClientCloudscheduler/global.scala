package typings.maximMazurokGapiClientCloudscheduler

import typings.maximMazurokGapiClientCloudscheduler.gapi.client.cloudscheduler.ProjectsResource
import typings.maximMazurokGapiClientCloudscheduler.maximMazurokGapiClientCloudschedulerStrings.cloudscheduler
import typings.maximMazurokGapiClientCloudscheduler.maximMazurokGapiClientCloudschedulerStrings.v1
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
      
      /** Load Cloud Scheduler API v1 */
      def load(name: cloudscheduler, version: v1): js.Thenable[Unit] = js.native
      def load(name: cloudscheduler, version: v1, callback: js.Function0[_]): Unit = js.native
      
      @js.native
      object cloudscheduler extends js.Object {
        
        val projects: ProjectsResource = js.native
      }
    }
  }
}
