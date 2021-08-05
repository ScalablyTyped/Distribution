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
  
  inline def apply(): ReservationsScopedList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReservationsScopedList]
  }
  
  extension [Self <: ReservationsScopedList](x: Self) {
    
    inline def setReservations(value: js.Array[Reservation]): Self = StObject.set(x, "reservations", value.asInstanceOf[js.Any])
    
    inline def setReservationsUndefined: Self = StObject.set(x, "reservations", js.undefined)
    
    inline def setReservationsVarargs(value: Reservation*): Self = StObject.set(x, "reservations", js.Array(value :_*))
    
    inline def setWarning(value: Code): Self = StObject.set(x, "warning", value.asInstanceOf[js.Any])
    
    inline def setWarningUndefined: Self = StObject.set(x, "warning", js.undefined)
  }
}
