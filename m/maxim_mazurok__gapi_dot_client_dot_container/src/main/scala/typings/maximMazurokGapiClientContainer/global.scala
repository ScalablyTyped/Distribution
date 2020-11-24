package typings.maximMazurokGapiClientContainer

import typings.maximMazurokGapiClientContainer.gapi.client.container.ProjectsResource
import typings.maximMazurokGapiClientContainer.maximMazurokGapiClientContainerStrings.container
import typings.maximMazurokGapiClientContainer.maximMazurokGapiClientContainerStrings.v1
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
      
      /** Load Kubernetes Engine API v1 */
      def load(name: container, version: v1): js.Thenable[Unit] = js.native
      def load(name: container, version: v1, callback: js.Function0[_]): Unit = js.native
      
      @js.native
      object container extends js.Object {
        
        val projects: ProjectsResource = js.native
      }
    }
  }
}
