package typings.maximMazurokGapiClientCloudscheduler

import typings.maximMazurokGapiClientCloudscheduler.gapi.client.cloudscheduler.ProjectsResource
import typings.maximMazurokGapiClientCloudscheduler.maximMazurokGapiClientCloudschedulerStrings.cloudscheduler
import typings.maximMazurokGapiClientCloudscheduler.maximMazurokGapiClientCloudschedulerStrings.v1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object gapi {
    
    object client {
      
      object cloudscheduler {
        
        @JSGlobal("gapi.client.cloudscheduler.projects")
        @js.native
        val projects: ProjectsResource = js.native
      }
      
      /** Load Cloud Scheduler API v1 */
      @JSGlobal("gapi.client.load")
      @js.native
      def load(name: cloudscheduler, version: v1): js.Thenable[Unit] = js.native
      @JSGlobal("gapi.client.load")
      @js.native
      def load(name: cloudscheduler, version: v1, callback: js.Function0[_]): Unit = js.native
    }
  }
}
