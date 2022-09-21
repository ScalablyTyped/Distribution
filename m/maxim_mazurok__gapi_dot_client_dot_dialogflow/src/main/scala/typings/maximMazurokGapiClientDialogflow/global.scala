package typings.maximMazurokGapiClientDialogflow

import typings.maximMazurokGapiClientDialogflow.gapi.client.dialogflow.ProjectsResource
import typings.maximMazurokGapiClientDialogflow.maximMazurokGapiClientDialogflowStrings.dialogflow
import typings.maximMazurokGapiClientDialogflow.maximMazurokGapiClientDialogflowStrings.v3
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object gapi {
    
    object client {
      
      @JSGlobal("gapi.client")
      @js.native
      val ^ : js.Any = js.native
      
      object dialogflow {
        
        @JSGlobal("gapi.client.dialogflow.projects")
        @js.native
        val projects: ProjectsResource = js.native
      }
      
      /** Load Dialogflow API v3 */
      inline def load(name: dialogflow, version: v3): js.Thenable[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any])).asInstanceOf[js.Thenable[Unit]]
      inline def load(name: dialogflow, version: v3, callback: js.Function0[Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    }
  }
}
