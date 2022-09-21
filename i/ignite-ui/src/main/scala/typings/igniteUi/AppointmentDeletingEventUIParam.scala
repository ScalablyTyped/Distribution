package typings.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AppointmentDeletingEventUIParam extends StObject {
  
  /**
    * Gets a reference to the appointment which is going to be deleted.
    */
  var appointment: js.UndefOr[Any] = js.undefined
  
  /**
    * Gets a reference to the scheduler.
    */
  var owner: js.UndefOr[Any] = js.undefined
}
object AppointmentDeletingEventUIParam {
  
  inline def apply(): AppointmentDeletingEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AppointmentDeletingEventUIParam]
  }
  
  extension [Self <: AppointmentDeletingEventUIParam](x: Self) {
    
    inline def setAppointment(value: Any): Self = StObject.set(x, "appointment", value.asInstanceOf[js.Any])
    
    inline def setAppointmentUndefined: Self = StObject.set(x, "appointment", js.undefined)
    
    inline def setOwner(value: Any): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    inline def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
  }
}
