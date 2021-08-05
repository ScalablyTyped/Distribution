package typings.maximMazurokGapiClientDataflow

import typings.maximMazurokGapiClientDataflow.gapi.client.dataflow.ProjectsResource
import typings.maximMazurokGapiClientDataflow.maximMazurokGapiClientDataflowStrings.dataflow
import typings.maximMazurokGapiClientDataflow.maximMazurokGapiClientDataflowStrings.v1b3
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object gapi {
    
    object client {
      
      @JSGlobal("gapi.client")
      @js.native
      val ^ : js.Any = js.native
      
      object dataflow {
        
        @JSGlobal("gapi.client.dataflow.projects")
        @js.native
        val projects: ProjectsResource = js.native
      }
      
      /** Load Dataflow API v1b3 */
      inline def load(name: dataflow, version: v1b3): js.Thenable[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any])).asInstanceOf[js.Thenable[Unit]]
      inline def load(name: dataflow, version: v1b3, callback: js.Function0[js.Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    }
  }
}
