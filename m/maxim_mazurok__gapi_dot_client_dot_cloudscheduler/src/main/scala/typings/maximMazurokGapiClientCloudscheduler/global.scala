package typings.maximMazurokGapiClientCloudscheduler

import typings.maximMazurokGapiClientCloudscheduler.gapi.client.cloudscheduler.ProjectsResource
import typings.maximMazurokGapiClientCloudscheduler.maximMazurokGapiClientCloudschedulerStrings.cloudscheduler
import typings.maximMazurokGapiClientCloudscheduler.maximMazurokGapiClientCloudschedulerStrings.v1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object gapi {
    
    object client {
      
      @JSGlobal("gapi.client")
      @js.native
      val ^ : js.Any = js.native
      
      object cloudscheduler {
        
        @JSGlobal("gapi.client.cloudscheduler.projects")
        @js.native
        val projects: ProjectsResource = js.native
      }
      
      /** Load Cloud Scheduler API v1 */
      @scala.inline
      def load(name: cloudscheduler, version: v1): js.Thenable[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any])).asInstanceOf[js.Thenable[Unit]]
      @scala.inline
      def load(name: cloudscheduler, version: v1, callback: js.Function0[js.Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    }
  }
}
