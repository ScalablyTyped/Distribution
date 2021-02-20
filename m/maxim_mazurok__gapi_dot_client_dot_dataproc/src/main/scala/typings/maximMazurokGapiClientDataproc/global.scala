package typings.maximMazurokGapiClientDataproc

import typings.maximMazurokGapiClientDataproc.gapi.client.dataproc.ProjectsResource
import typings.maximMazurokGapiClientDataproc.maximMazurokGapiClientDataprocStrings.dataproc
import typings.maximMazurokGapiClientDataproc.maximMazurokGapiClientDataprocStrings.v1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object gapi {
    
    object client {
      
      object dataproc {
        
        @JSGlobal("gapi.client.dataproc.projects")
        @js.native
        val projects: ProjectsResource = js.native
      }
      
      /** Load Cloud Dataproc API v1 */
      @JSGlobal("gapi.client.load")
      @js.native
      def load(name: dataproc, version: v1): js.Thenable[Unit] = js.native
      @JSGlobal("gapi.client.load")
      @js.native
      def load(name: dataproc, version: v1, callback: js.Function0[_]): Unit = js.native
    }
  }
}
