package typings.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AppointmentDeletedEventUIParam extends StObject {
  
  /**
    * Gets the id of the deleted appointment.
    */
  var appointmentId: js.UndefOr[Any] = js.undefined
  
  /**
    * Gets a reference to the scheduler.
    */
  var owner: js.UndefOr[Any] = js.undefined
}
object AppointmentDeletedEventUIParam {
  
  inline def apply(): AppointmentDeletedEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AppointmentDeletedEventUIParam]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AppointmentDeletedEventUIParam] (val x: Self) extends AnyVal {
    
    inline def setAppointmentId(value: Any): Self = StObject.set(x, "appointmentId", value.asInstanceOf[js.Any])
    
    inline def setAppointmentIdUndefined: Self = StObject.set(x, "appointmentId", js.undefined)
    
    inline def setOwner(value: Any): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    inline def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
  }
}
