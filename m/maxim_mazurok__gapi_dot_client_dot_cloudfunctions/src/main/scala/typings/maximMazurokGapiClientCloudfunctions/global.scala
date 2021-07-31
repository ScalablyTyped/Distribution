package typings.maximMazurokGapiClientCloudfunctions

import typings.maximMazurokGapiClientCloudfunctions.gapi.client.cloudfunctions.OperationsResource
import typings.maximMazurokGapiClientCloudfunctions.gapi.client.cloudfunctions.ProjectsResource
import typings.maximMazurokGapiClientCloudfunctions.maximMazurokGapiClientCloudfunctionsStrings.cloudfunctions
import typings.maximMazurokGapiClientCloudfunctions.maximMazurokGapiClientCloudfunctionsStrings.v1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object gapi {
    
    object client {
      
      @JSGlobal("gapi.client")
      @js.native
      val ^ : js.Any = js.native
      
      object cloudfunctions {
        
        @JSGlobal("gapi.client.cloudfunctions.operations")
        @js.native
        val operations: OperationsResource = js.native
        
        @JSGlobal("gapi.client.cloudfunctions.projects")
        @js.native
        val projects: ProjectsResource = js.native
      }
      
      /** Load Cloud Functions API v1 */
      @scala.inline
      def load(name: cloudfunctions, version: v1): js.Thenable[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any])).asInstanceOf[js.Thenable[Unit]]
      @scala.inline
      def load(name: cloudfunctions, version: v1, callback: js.Function0[js.Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    }
  }
}
