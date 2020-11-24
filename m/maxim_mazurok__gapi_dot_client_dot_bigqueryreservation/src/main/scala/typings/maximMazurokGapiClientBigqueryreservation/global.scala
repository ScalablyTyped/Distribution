package typings.maximMazurokGapiClientBigqueryreservation

import typings.maximMazurokGapiClientBigqueryreservation.gapi.client.bigqueryreservation.OperationsResource
import typings.maximMazurokGapiClientBigqueryreservation.gapi.client.bigqueryreservation.ProjectsResource
import typings.maximMazurokGapiClientBigqueryreservation.maximMazurokGapiClientBigqueryreservationStrings.bigqueryreservation
import typings.maximMazurokGapiClientBigqueryreservation.maximMazurokGapiClientBigqueryreservationStrings.v1
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
      
      /** Load BigQuery Reservation API v1 */
      def load(name: bigqueryreservation, version: v1): js.Thenable[Unit] = js.native
      def load(name: bigqueryreservation, version: v1, callback: js.Function0[_]): Unit = js.native
      
      @js.native
      object bigqueryreservation extends js.Object {
        
        val operations: OperationsResource = js.native
        
        val projects: ProjectsResource = js.native
      }
    }
  }
}
