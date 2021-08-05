package typings.maximMazurokGapiClientArtifactregistry

import typings.maximMazurokGapiClientArtifactregistry.gapi.client.artifactregistry.ProjectsResource
import typings.maximMazurokGapiClientArtifactregistry.maximMazurokGapiClientArtifactregistryStrings.artifactregistry
import typings.maximMazurokGapiClientArtifactregistry.maximMazurokGapiClientArtifactregistryStrings.v1beta2
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object gapi {
    
    object client {
      
      @JSGlobal("gapi.client")
      @js.native
      val ^ : js.Any = js.native
      
      object artifactregistry {
        
        @JSGlobal("gapi.client.artifactregistry.projects")
        @js.native
        val projects: ProjectsResource = js.native
      }
      
      /** Load Artifact Registry API v1beta2 */
      inline def load(name: artifactregistry, version: v1beta2): js.Thenable[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any])).asInstanceOf[js.Thenable[Unit]]
      inline def load(name: artifactregistry, version: v1beta2, callback: js.Function0[js.Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    }
  }
}
