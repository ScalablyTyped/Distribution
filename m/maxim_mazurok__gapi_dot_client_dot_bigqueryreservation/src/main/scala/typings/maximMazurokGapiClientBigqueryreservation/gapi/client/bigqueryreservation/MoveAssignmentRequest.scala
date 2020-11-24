package typings.maximMazurokGapiClientBigqueryreservation.gapi.client.bigqueryreservation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MoveAssignmentRequest extends js.Object {
  
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
  implicit class MoveAssignmentRequestOps[Self <: MoveAssignmentRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDestinationId(value: String): Self = this.set("destinationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDestinationId: Self = this.set("destinationId", js.undefined)
  }
}
