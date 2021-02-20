package typings.maximMazurokGapiClientDataflow

import typings.maximMazurokGapiClientDataflow.gapi.client.dataflow.ProjectsResource
import typings.maximMazurokGapiClientDataflow.maximMazurokGapiClientDataflowStrings.dataflow
import typings.maximMazurokGapiClientDataflow.maximMazurokGapiClientDataflowStrings.v1b3
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object gapi {
    
    object client {
      
      object dataflow {
        
        @JSGlobal("gapi.client.dataflow.projects")
        @js.native
        val projects: ProjectsResource = js.native
      }
      
      /** Load Dataflow API v1b3 */
      @JSGlobal("gapi.client.load")
      @js.native
      def load(name: dataflow, version: v1b3): js.Thenable[Unit] = js.native
      @JSGlobal("gapi.client.load")
      @js.native
      def load(name: dataflow, version: v1b3, callback: js.Function0[_]): Unit = js.native
    }
  }
}
