package typings.maximMazurokGapiClientCompute.gapi.client.compute

import typings.maximMazurokGapiClientCompute.anon.Code
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReservationsScopedList extends js.Object {
  
  /** A list of reservations contained in this scope. */
  var reservations: js.UndefOr[js.Array[Reservation]] = js.native
  
  /** Informational warning which replaces the list of reservations when the list is empty. */
  var warning: js.UndefOr[Code] = js.native
}
object ReservationsScopedList {
  
  @scala.inline
  def apply(): ReservationsScopedList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReservationsScopedList]
  }
  
  @scala.inline
  implicit class ReservationsScopedListOps[Self <: ReservationsScopedList] (val x: Self) extends AnyVal {
    
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
    def setReservationsVarargs(value: Reservation*): Self = this.set("reservations", js.Array(value :_*))
    
    @scala.inline
    def setReservations(value: js.Array[Reservation]): Self = this.set("reservations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReservations: Self = this.set("reservations", js.undefined)
    
    @scala.inline
    def setWarning(value: Code): Self = this.set("warning", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWarning: Self = this.set("warning", js.undefined)
  }
}
