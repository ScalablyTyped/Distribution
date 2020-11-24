package typings.kendoUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchedulerCurrentTimeMarker extends js.Object {
  
  var updateInterval: js.UndefOr[Double] = js.native
  
  var useLocalTimezone: js.UndefOr[Boolean] = js.native
}
object SchedulerCurrentTimeMarker {
  
  @scala.inline
  def apply(): SchedulerCurrentTimeMarker = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchedulerCurrentTimeMarker]
  }
  
  @scala.inline
  implicit class SchedulerCurrentTimeMarkerOps[Self <: SchedulerCurrentTimeMarker] (val x: Self) extends AnyVal {
    
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
    def setUpdateInterval(value: Double): Self = this.set("updateInterval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpdateInterval: Self = this.set("updateInterval", js.undefined)
    
    @scala.inline
    def setUseLocalTimezone(value: Boolean): Self = this.set("useLocalTimezone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseLocalTimezone: Self = this.set("useLocalTimezone", js.undefined)
  }
}
