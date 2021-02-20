package typings.maximMazurokGapiClientCloudtasks

import typings.maximMazurokGapiClientCloudtasks.gapi.client.cloudtasks.ProjectsResource
import typings.maximMazurokGapiClientCloudtasks.maximMazurokGapiClientCloudtasksStrings.cloudtasks
import typings.maximMazurokGapiClientCloudtasks.maximMazurokGapiClientCloudtasksStrings.v2
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object gapi {
    
    object client {
      
      object cloudtasks {
        
        @JSGlobal("gapi.client.cloudtasks.projects")
        @js.native
        val projects: ProjectsResource = js.native
      }
      
      /** Load Cloud Tasks API v2 */
      @JSGlobal("gapi.client.load")
      @js.native
      def load(name: cloudtasks, version: v2): js.Thenable[Unit] = js.native
      @JSGlobal("gapi.client.load")
      @js.native
      def load(name: cloudtasks, version: v2, callback: js.Function0[_]): Unit = js.native
    }
  }
}
