package typings.maximMazurokGapiClientDialogflow

import typings.maximMazurokGapiClientDialogflow.gapi.client.dialogflow.ProjectsResource
import typings.maximMazurokGapiClientDialogflow.maximMazurokGapiClientDialogflowStrings.dialogflow
import typings.maximMazurokGapiClientDialogflow.maximMazurokGapiClientDialogflowStrings.v2
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object gapi {
    
    object client {
      
      object dialogflow {
        
        @JSGlobal("gapi.client.dialogflow.projects")
        @js.native
        val projects: ProjectsResource = js.native
      }
      
      /** Load Dialogflow API v2 */
      @JSGlobal("gapi.client.load")
      @js.native
      def load(name: dialogflow, version: v2): js.Thenable[Unit] = js.native
      @JSGlobal("gapi.client.load")
      @js.native
      def load(name: dialogflow, version: v2, callback: js.Function0[_]): Unit = js.native
    }
  }
}
