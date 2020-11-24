package typings.maximMazurokGapiClientArtifactregistry

import typings.maximMazurokGapiClientArtifactregistry.gapi.client.artifactregistry.ProjectsResource
import typings.maximMazurokGapiClientArtifactregistry.maximMazurokGapiClientArtifactregistryStrings.artifactregistry
import typings.maximMazurokGapiClientArtifactregistry.maximMazurokGapiClientArtifactregistryStrings.v1beta2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobalScope
@js.native
object global extends js.Object {
  
  @js.native
  object gapi extends js.Object {
    
    @js.native
    object client extends js.Object {
      
      /** Load Artifact Registry API v1beta2 */
      def load(name: artifactregistry, version: v1beta2): js.Thenable[Unit] = js.native
      def load(name: artifactregistry, version: v1beta2, callback: js.Function0[_]): Unit = js.native
      
      @js.native
      object artifactregistry extends js.Object {
        
        val projects: ProjectsResource = js.native
      }
    }
  }
}
