package typings.maximMazurokGapiClientAdexchangebuyer.gapi.client.adexchangebuyer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TargetingValueDayPartTargeting extends js.Object {
  
  var dayParts: js.UndefOr[js.Array[TargetingValueDayPartTargetingDayPart]] = js.native
  
  var timeZoneType: js.UndefOr[String] = js.native
}
object TargetingValueDayPartTargeting {
  
  @scala.inline
  def apply(): TargetingValueDayPartTargeting = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TargetingValueDayPartTargeting]
  }
  
  @scala.inline
  implicit class TargetingValueDayPartTargetingOps[Self <: TargetingValueDayPartTargeting] (val x: Self) extends AnyVal {
    
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
    def setDayPartsVarargs(value: TargetingValueDayPartTargetingDayPart*): Self = this.set("dayParts", js.Array(value :_*))
    
    @scala.inline
    def setDayParts(value: js.Array[TargetingValueDayPartTargetingDayPart]): Self = this.set("dayParts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDayParts: Self = this.set("dayParts", js.undefined)
    
    @scala.inline
    def setTimeZoneType(value: String): Self = this.set("timeZoneType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeZoneType: Self = this.set("timeZoneType", js.undefined)
  }
}
