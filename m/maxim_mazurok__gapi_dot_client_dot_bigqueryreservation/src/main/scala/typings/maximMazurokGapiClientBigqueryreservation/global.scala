package typings.maximMazurokGapiClientBigqueryreservation

import typings.maximMazurokGapiClientBigqueryreservation.gapi.client.bigqueryreservation.OperationsResource
import typings.maximMazurokGapiClientBigqueryreservation.gapi.client.bigqueryreservation.ProjectsResource
import typings.maximMazurokGapiClientBigqueryreservation.maximMazurokGapiClientBigqueryreservationStrings.bigqueryreservation
import typings.maximMazurokGapiClientBigqueryreservation.maximMazurokGapiClientBigqueryreservationStrings.v1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object gapi {
    
    object client {
      
      object bigqueryreservation {
        
        @JSGlobal("gapi.client.bigqueryreservation.operations")
        @js.native
        val operations: OperationsResource = js.native
        
        @JSGlobal("gapi.client.bigqueryreservation.projects")
        @js.native
        val projects: ProjectsResource = js.native
      }
      
      /** Load BigQuery Reservation API v1 */
      @JSGlobal("gapi.client.load")
      @js.native
      def load(name: bigqueryreservation, version: v1): js.Thenable[Unit] = js.native
      @JSGlobal("gapi.client.load")
      @js.native
      def load(name: bigqueryreservation, version: v1, callback: js.Function0[_]): Unit = js.native
    }
  }
}
