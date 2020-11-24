package typings.maximMazurokGapiClientAnalytics.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EventConditions extends js.Object {
  
  /** List of event conditions. */
  var eventConditions: js.UndefOr[js.Array[ComparisonType]] = js.native
  
  /** Determines if the event value should be used as the value for this goal. */
  var useEventValue: js.UndefOr[Boolean] = js.native
}
object EventConditions {
  
  @scala.inline
  def apply(): EventConditions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EventConditions]
  }
  
  @scala.inline
  implicit class EventConditionsOps[Self <: EventConditions] (val x: Self) extends AnyVal {
    
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
    def setEventConditionsVarargs(value: ComparisonType*): Self = this.set("eventConditions", js.Array(value :_*))
    
    @scala.inline
    def setEventConditions(value: js.Array[ComparisonType]): Self = this.set("eventConditions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEventConditions: Self = this.set("eventConditions", js.undefined)
    
    @scala.inline
    def setUseEventValue(value: Boolean): Self = this.set("useEventValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseEventValue: Self = this.set("useEventValue", js.undefined)
  }
}
