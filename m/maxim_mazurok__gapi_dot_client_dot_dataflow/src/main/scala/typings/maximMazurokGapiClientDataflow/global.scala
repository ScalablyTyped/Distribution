package typings.maximMazurokGapiClientDataflow

import typings.maximMazurokGapiClientDataflow.gapi.client.dataflow.ProjectsResource
import typings.maximMazurokGapiClientDataflow.maximMazurokGapiClientDataflowStrings.dataflow
import typings.maximMazurokGapiClientDataflow.maximMazurokGapiClientDataflowStrings.v1b3
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
      
      /** Load Dataflow API v1b3 */
      def load(name: dataflow, version: v1b3): js.Thenable[Unit] = js.native
      def load(name: dataflow, version: v1b3, callback: js.Function0[_]): Unit = js.native
      
      @js.native
      object dataflow extends js.Object {
        
        val projects: ProjectsResource = js.native
      }
    }
  }
}
