package typings.maximMazurokGapiClientContainer

import typings.maximMazurokGapiClientContainer.gapi.client.container.ProjectsResource
import typings.maximMazurokGapiClientContainer.maximMazurokGapiClientContainerStrings.container
import typings.maximMazurokGapiClientContainer.maximMazurokGapiClientContainerStrings.v1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object gapi {
    
    object client {
      
      object container {
        
        @JSGlobal("gapi.client.container.projects")
        @js.native
        val projects: ProjectsResource = js.native
      }
      
      /** Load Kubernetes Engine API v1 */
      @JSGlobal("gapi.client.load")
      @js.native
      def load(name: container, version: v1): js.Thenable[Unit] = js.native
      @JSGlobal("gapi.client.load")
      @js.native
      def load(name: container, version: v1, callback: js.Function0[_]): Unit = js.native
    }
  }
}
