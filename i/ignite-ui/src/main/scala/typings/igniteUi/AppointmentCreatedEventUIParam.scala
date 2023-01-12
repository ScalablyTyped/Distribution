package typings.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AppointmentCreatedEventUIParam extends StObject {
  
  /**
    * Gets a reference to the created appointment.
    */
  var appointment: js.UndefOr[Any] = js.undefined
  
  /**
    * Gets a reference to the scheduler.
    */
  var owner: js.UndefOr[Any] = js.undefined
}
object AppointmentCreatedEventUIParam {
  
  inline def apply(): AppointmentCreatedEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AppointmentCreatedEventUIParam]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AppointmentCreatedEventUIParam] (val x: Self) extends AnyVal {
    
    inline def setAppointment(value: Any): Self = StObject.set(x, "appointment", value.asInstanceOf[js.Any])
    
    inline def setAppointmentUndefined: Self = StObject.set(x, "appointment", js.undefined)
    
    inline def setOwner(value: Any): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    inline def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
  }
}
