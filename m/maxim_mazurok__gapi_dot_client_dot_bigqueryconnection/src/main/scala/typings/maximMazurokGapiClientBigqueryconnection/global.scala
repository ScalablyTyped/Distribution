package typings.maximMazurokGapiClientBigqueryconnection

import typings.maximMazurokGapiClientBigqueryconnection.gapi.client.bigqueryconnection.ProjectsResource
import typings.maximMazurokGapiClientBigqueryconnection.maximMazurokGapiClientBigqueryconnectionStrings.bigqueryconnection
import typings.maximMazurokGapiClientBigqueryconnection.maximMazurokGapiClientBigqueryconnectionStrings.v1beta1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object gapi {
    
    object client {
      
      @JSGlobal("gapi.client")
      @js.native
      val ^ : js.Any = js.native
      
      object bigqueryconnection {
        
        @JSGlobal("gapi.client.bigqueryconnection.projects")
        @js.native
        val projects: ProjectsResource = js.native
      }
      
      /** Load BigQuery Connection API v1beta1 */
      inline def load(name: bigqueryconnection, version: v1beta1): js.Thenable[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any])).asInstanceOf[js.Thenable[Unit]]
      inline def load(name: bigqueryconnection, version: v1beta1, callback: js.Function0[js.Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    }
  }
}
