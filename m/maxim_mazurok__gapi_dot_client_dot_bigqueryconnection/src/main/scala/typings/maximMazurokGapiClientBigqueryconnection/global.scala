package typings.maximMazurokGapiClientBigqueryconnection

import typings.maximMazurokGapiClientBigqueryconnection.gapi.client.bigqueryconnection.ProjectsResource
import typings.maximMazurokGapiClientBigqueryconnection.maximMazurokGapiClientBigqueryconnectionStrings.bigqueryconnection
import typings.maximMazurokGapiClientBigqueryconnection.maximMazurokGapiClientBigqueryconnectionStrings.v1beta1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object gapi {
    
    object client {
      
      object bigqueryconnection {
        
        @JSGlobal("gapi.client.bigqueryconnection.projects")
        @js.native
        val projects: ProjectsResource = js.native
      }
      
      /** Load BigQuery Connection API v1beta1 */
      @JSGlobal("gapi.client.load")
      @js.native
      def load(name: bigqueryconnection, version: v1beta1): js.Thenable[Unit] = js.native
      @JSGlobal("gapi.client.load")
      @js.native
      def load(name: bigqueryconnection, version: v1beta1, callback: js.Function0[_]): Unit = js.native
    }
  }
}
