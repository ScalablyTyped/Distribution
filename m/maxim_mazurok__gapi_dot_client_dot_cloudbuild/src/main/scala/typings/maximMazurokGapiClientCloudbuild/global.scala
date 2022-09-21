package typings.maximMazurokGapiClientCloudbuild

import typings.maximMazurokGapiClientCloudbuild.gapi.client.cloudbuild.LocationsResource
import typings.maximMazurokGapiClientCloudbuild.gapi.client.cloudbuild.OperationsResource
import typings.maximMazurokGapiClientCloudbuild.gapi.client.cloudbuild.ProjectsResource
import typings.maximMazurokGapiClientCloudbuild.gapi.client.cloudbuild.V1Resource
import typings.maximMazurokGapiClientCloudbuild.maximMazurokGapiClientCloudbuildStrings.cloudbuild
import typings.maximMazurokGapiClientCloudbuild.maximMazurokGapiClientCloudbuildStrings.v1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object gapi {
    
    object client {
      
      @JSGlobal("gapi.client")
      @js.native
      val ^ : js.Any = js.native
      
      object cloudbuild {
        
        @JSGlobal("gapi.client.cloudbuild.locations")
        @js.native
        val locations: LocationsResource = js.native
        
        @JSGlobal("gapi.client.cloudbuild.operations")
        @js.native
        val operations: OperationsResource = js.native
        
        @JSGlobal("gapi.client.cloudbuild.projects")
        @js.native
        val projects: ProjectsResource = js.native
        
        @JSGlobal("gapi.client.cloudbuild.v1")
        @js.native
        val v1: V1Resource = js.native
      }
      
      /** Load Cloud Build API v1 */
      inline def load(name: cloudbuild, version: v1): js.Thenable[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any])).asInstanceOf[js.Thenable[Unit]]
      inline def load(name: cloudbuild, version: v1, callback: js.Function0[Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    }
  }
}
