package typings.maximMazurokGapiClientCloudtrace

import typings.maximMazurokGapiClientCloudtrace.gapi.client.cloudtrace.ProjectsResource
import typings.maximMazurokGapiClientCloudtrace.maximMazurokGapiClientCloudtraceStrings.cloudtrace
import typings.maximMazurokGapiClientCloudtrace.maximMazurokGapiClientCloudtraceStrings.v2
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object gapi {
    
    object client {
      
      object cloudtrace {
        
        @JSGlobal("gapi.client.cloudtrace.projects")
        @js.native
        val projects: ProjectsResource = js.native
      }
      
      /** Load Cloud Trace API v2 */
      @JSGlobal("gapi.client.load")
      @js.native
      def load(name: cloudtrace, version: v2): js.Thenable[Unit] = js.native
      @JSGlobal("gapi.client.load")
      @js.native
      def load(name: cloudtrace, version: v2, callback: js.Function0[_]): Unit = js.native
    }
  }
}
