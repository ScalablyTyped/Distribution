package typings.maximMazurokGapiClientDialogflow

import typings.maximMazurokGapiClientDialogflow.gapi.client.dialogflow.ProjectsResource
import typings.maximMazurokGapiClientDialogflow.maximMazurokGapiClientDialogflowStrings.dialogflow
import typings.maximMazurokGapiClientDialogflow.maximMazurokGapiClientDialogflowStrings.v2
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
      
      /** Load Dialogflow API v2 */
      def load(name: dialogflow, version: v2): js.Thenable[Unit] = js.native
      def load(name: dialogflow, version: v2, callback: js.Function0[_]): Unit = js.native
      
      @js.native
      object dialogflow extends js.Object {
        
        val projects: ProjectsResource = js.native
      }
    }
  }
}
