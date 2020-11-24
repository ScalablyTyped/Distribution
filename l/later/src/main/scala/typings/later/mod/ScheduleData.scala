package typings.later.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ScheduleData extends js.Object {
  
  /**
    * A code to identify any errors in the composite schedule and exceptions.
    * The number tells you the position of the error within the schedule.
    */
  var error: Double = js.native
  
  /**
    * A list of exceptions to the composite recurrence information.
    */
  var exceptions: js.Array[Recurrence] = js.native
  
  /**
    * A list of recurrence information as a composite schedule.
    */
  var schedules: js.Array[Recurrence] = js.native
}
object ScheduleData {
  
  @scala.inline
  def apply(error: Double, exceptions: js.Array[Recurrence], schedules: js.Array[Recurrence]): ScheduleData = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], exceptions = exceptions.asInstanceOf[js.Any], schedules = schedules.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScheduleData]
  }
  
  @scala.inline
  implicit class ScheduleDataOps[Self <: ScheduleData] (val x: Self) extends AnyVal {
    
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
    def setError(value: Double): Self = this.set("error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExceptionsVarargs(value: Recurrence*): Self = this.set("exceptions", js.Array(value :_*))
    
    @scala.inline
    def setExceptions(value: js.Array[Recurrence]): Self = this.set("exceptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSchedulesVarargs(value: Recurrence*): Self = this.set("schedules", js.Array(value :_*))
    
    @scala.inline
    def setSchedules(value: js.Array[Recurrence]): Self = this.set("schedules", value.asInstanceOf[js.Any])
  }
}
