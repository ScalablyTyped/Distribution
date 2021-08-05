package typings.maximMazurokGapiClientBigqueryreservation.gapi.client.bigqueryreservation

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MoveAssignmentRequest extends StObject {
  
  /** The new reservation ID, e.g.: `projects/myotherproject/locations/US/reservations/team2-prod` */
  var destinationId: js.UndefOr[String] = js.undefined
}
object MoveAssignmentRequest {
  
  inline def apply(): MoveAssignmentRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MoveAssignmentRequest]
  }
  
  extension [Self <: MoveAssignmentRequest](x: Self) {
    
    inline def setDestinationId(value: String): Self = StObject.set(x, "destinationId", value.asInstanceOf[js.Any])
    
    inline def setDestinationIdUndefined: Self = StObject.set(x, "destinationId", js.undefined)
  }
}
