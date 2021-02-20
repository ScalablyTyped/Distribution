package typings.maximMazurokGapiClientCloudbuild

import typings.maximMazurokGapiClientCloudbuild.gapi.client.cloudbuild.OperationsResource
import typings.maximMazurokGapiClientCloudbuild.gapi.client.cloudbuild.ProjectsResource
import typings.maximMazurokGapiClientCloudbuild.maximMazurokGapiClientCloudbuildStrings.cloudbuild
import typings.maximMazurokGapiClientCloudbuild.maximMazurokGapiClientCloudbuildStrings.v1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object gapi {
    
    object client {
      
      object cloudbuild {
        
        @JSGlobal("gapi.client.cloudbuild.operations")
        @js.native
        val operations: OperationsResource = js.native
        
        @JSGlobal("gapi.client.cloudbuild.projects")
        @js.native
        val projects: ProjectsResource = js.native
      }
      
      /** Load Cloud Build API v1 */
      @JSGlobal("gapi.client.load")
      @js.native
      def load(name: cloudbuild, version: v1): js.Thenable[Unit] = js.native
      @JSGlobal("gapi.client.load")
      @js.native
      def load(name: cloudbuild, version: v1, callback: js.Function0[_]): Unit = js.native
    }
  }
}
