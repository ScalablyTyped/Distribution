package typings.maximMazurokGapiClientBigqueryreservation

import typings.maximMazurokGapiClientBigqueryreservation.gapi.client.bigqueryreservation.OperationsResource
import typings.maximMazurokGapiClientBigqueryreservation.gapi.client.bigqueryreservation.ProjectsResource
import typings.maximMazurokGapiClientBigqueryreservation.maximMazurokGapiClientBigqueryreservationStrings.bigqueryreservation
import typings.maximMazurokGapiClientBigqueryreservation.maximMazurokGapiClientBigqueryreservationStrings.v1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object gapi {
    
    object client {
      
      @JSGlobal("gapi.client")
      @js.native
      val ^ : js.Any = js.native
      
      object bigqueryreservation {
        
        @JSGlobal("gapi.client.bigqueryreservation.operations")
        @js.native
        val operations: OperationsResource = js.native
        
        @JSGlobal("gapi.client.bigqueryreservation.projects")
        @js.native
        val projects: ProjectsResource = js.native
      }
      
      /** Load BigQuery Reservation API v1 */
      inline def load(name: bigqueryreservation, version: v1): js.Thenable[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any])).asInstanceOf[js.Thenable[Unit]]
      inline def load(name: bigqueryreservation, version: v1, callback: js.Function0[js.Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    }
  }
}
