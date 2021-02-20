package typings.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AppointmentDeletedEventUIParam extends StObject {
  
  /**
    * Gets the id of the deleted appointment.
    */
  var appointmentId: js.UndefOr[js.Any] = js.native
  
  /**
    * Gets a reference to the scheduler.
    */
  var owner: js.UndefOr[js.Any] = js.native
}
object AppointmentDeletedEventUIParam {
  
  @scala.inline
  def apply(): AppointmentDeletedEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AppointmentDeletedEventUIParam]
  }
  
  @scala.inline
  implicit class AppointmentDeletedEventUIParamMutableBuilder[Self <: AppointmentDeletedEventUIParam] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAppointmentId(value: js.Any): Self = StObject.set(x, "appointmentId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppointmentIdUndefined: Self = StObject.set(x, "appointmentId", js.undefined)
    
    @scala.inline
    def setOwner(value: js.Any): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
  }
}
