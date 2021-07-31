package typings.maximMazurokGapiClientCompute.gapi.client.compute

import typings.maximMazurokGapiClientCompute.anon.Code
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReservationsScopedList extends StObject {
  
  /** A list of reservations contained in this scope. */
  var reservations: js.UndefOr[js.Array[Reservation]] = js.undefined
  
  /** Informational warning which replaces the list of reservations when the list is empty. */
  var warning: js.UndefOr[Code] = js.undefined
}
object ReservationsScopedList {
  
  @scala.inline
  def apply(): ReservationsScopedList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReservationsScopedList]
  }
  
  @scala.inline
  implicit class ReservationsScopedListMutableBuilder[Self <: ReservationsScopedList] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setReservations(value: js.Array[Reservation]): Self = StObject.set(x, "reservations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReservationsUndefined: Self = StObject.set(x, "reservations", js.undefined)
    
    @scala.inline
    def setReservationsVarargs(value: Reservation*): Self = StObject.set(x, "reservations", js.Array(value :_*))
    
    @scala.inline
    def setWarning(value: Code): Self = StObject.set(x, "warning", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWarningUndefined: Self = StObject.set(x, "warning", js.undefined)
  }
}
