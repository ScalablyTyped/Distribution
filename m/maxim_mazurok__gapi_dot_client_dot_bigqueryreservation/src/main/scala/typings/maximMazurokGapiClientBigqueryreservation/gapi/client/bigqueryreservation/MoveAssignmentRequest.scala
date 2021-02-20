package typings.maximMazurokGapiClientBigqueryreservation.gapi.client.bigqueryreservation

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MoveAssignmentRequest extends StObject {
  
  /** The new reservation ID, e.g.: `projects/myotherproject/locations/US/reservations/team2-prod` */
  var destinationId: js.UndefOr[String] = js.native
}
object MoveAssignmentRequest {
  
  @scala.inline
  def apply(): MoveAssignmentRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MoveAssignmentRequest]
  }
  
  @scala.inline
  implicit class MoveAssignmentRequestMutableBuilder[Self <: MoveAssignmentRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDestinationId(value: String): Self = StObject.set(x, "destinationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDestinationIdUndefined: Self = StObject.set(x, "destinationId", js.undefined)
  }
}
