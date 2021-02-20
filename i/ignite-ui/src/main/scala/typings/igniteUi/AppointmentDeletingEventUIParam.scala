package typings.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AppointmentDeletingEventUIParam extends StObject {
  
  /**
    * Gets a reference to the appointment which is going to be deleted.
    */
  var appointment: js.UndefOr[js.Any] = js.native
  
  /**
    * Gets a reference to the scheduler.
    */
  var owner: js.UndefOr[js.Any] = js.native
}
object AppointmentDeletingEventUIParam {
  
  @scala.inline
  def apply(): AppointmentDeletingEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AppointmentDeletingEventUIParam]
  }
  
  @scala.inline
  implicit class AppointmentDeletingEventUIParamMutableBuilder[Self <: AppointmentDeletingEventUIParam] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAppointment(value: js.Any): Self = StObject.set(x, "appointment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppointmentUndefined: Self = StObject.set(x, "appointment", js.undefined)
    
    @scala.inline
    def setOwner(value: js.Any): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
  }
}
