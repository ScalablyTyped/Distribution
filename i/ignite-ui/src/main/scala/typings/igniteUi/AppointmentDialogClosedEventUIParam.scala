package typings.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AppointmentDialogClosedEventUIParam extends StObject {
  
  /**
    * Gets a reference to the appointment dialog.
    */
  var element: js.UndefOr[Any] = js.undefined
  
  /**
    * Gets whether we are creating or updating an appointment.
    */
  var isAppointmentNew: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Gets a reference to the scheduler.
    */
  var owner: js.UndefOr[Any] = js.undefined
}
object AppointmentDialogClosedEventUIParam {
  
  inline def apply(): AppointmentDialogClosedEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AppointmentDialogClosedEventUIParam]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AppointmentDialogClosedEventUIParam] (val x: Self) extends AnyVal {
    
    inline def setElement(value: Any): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
    
    inline def setElementUndefined: Self = StObject.set(x, "element", js.undefined)
    
    inline def setIsAppointmentNew(value: Boolean): Self = StObject.set(x, "isAppointmentNew", value.asInstanceOf[js.Any])
    
    inline def setIsAppointmentNewUndefined: Self = StObject.set(x, "isAppointmentNew", js.undefined)
    
    inline def setOwner(value: Any): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    inline def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
  }
}
