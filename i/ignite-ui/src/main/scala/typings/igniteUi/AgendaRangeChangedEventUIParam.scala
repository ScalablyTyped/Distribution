package typings.igniteUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AgendaRangeChangedEventUIParam extends js.Object {
  
  /**
    * Gets a reference to the days to be shown in AgendaView mode.
    */
  var dateRangeInterval: js.UndefOr[Double] = js.native
  
  /**
    * Gets a reference to the newly AgendaView start date.
    */
  var newAgendaRangeStartDate: js.UndefOr[js.Any] = js.native
  
  /**
    * Gets a reference to the scheduler.
    */
  var owner: js.UndefOr[js.Any] = js.native
}
object AgendaRangeChangedEventUIParam {
  
  @scala.inline
  def apply(): AgendaRangeChangedEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AgendaRangeChangedEventUIParam]
  }
  
  @scala.inline
  implicit class AgendaRangeChangedEventUIParamOps[Self <: AgendaRangeChangedEventUIParam] (val x: Self) extends AnyVal {
    
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
    def setDateRangeInterval(value: Double): Self = this.set("dateRangeInterval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDateRangeInterval: Self = this.set("dateRangeInterval", js.undefined)
    
    @scala.inline
    def setNewAgendaRangeStartDate(value: js.Any): Self = this.set("newAgendaRangeStartDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNewAgendaRangeStartDate: Self = this.set("newAgendaRangeStartDate", js.undefined)
    
    @scala.inline
    def setOwner(value: js.Any): Self = this.set("owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOwner: Self = this.set("owner", js.undefined)
  }
}
