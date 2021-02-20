package typings.maximMazurokGapiClientArtifactregistry

import typings.maximMazurokGapiClientArtifactregistry.gapi.client.artifactregistry.ProjectsResource
import typings.maximMazurokGapiClientArtifactregistry.maximMazurokGapiClientArtifactregistryStrings.artifactregistry
import typings.maximMazurokGapiClientArtifactregistry.maximMazurokGapiClientArtifactregistryStrings.v1beta2
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object gapi {
    
    object client {
      
      object artifactregistry {
        
        @JSGlobal("gapi.client.artifactregistry.projects")
        @js.native
        val projects: ProjectsResource = js.native
      }
      
      /** Load Artifact Registry API v1beta2 */
      @JSGlobal("gapi.client.load")
      @js.native
      def load(name: artifactregistry, version: v1beta2): js.Thenable[Unit] = js.native
      @JSGlobal("gapi.client.load")
      @js.native
      def load(name: artifactregistry, version: v1beta2, callback: js.Function0[_]): Unit = js.native
    }
  }
}
