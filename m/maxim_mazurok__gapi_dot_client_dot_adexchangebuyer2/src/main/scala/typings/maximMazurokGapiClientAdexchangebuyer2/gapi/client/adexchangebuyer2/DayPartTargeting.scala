package typings.maximMazurokGapiClientAdexchangebuyer2.gapi.client.adexchangebuyer2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DayPartTargeting extends js.Object {
  
  /** A list of day part targeting criterion. */
  var dayParts: js.UndefOr[js.Array[DayPart]] = js.native
  
  /** The timezone to use for interpreting the day part targeting. */
  var timeZoneType: js.UndefOr[String] = js.native
}
object DayPartTargeting {
  
  @scala.inline
  def apply(): DayPartTargeting = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DayPartTargeting]
  }
  
  @scala.inline
  implicit class DayPartTargetingOps[Self <: DayPartTargeting] (val x: Self) extends AnyVal {
    
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
    def setDayPartsVarargs(value: DayPart*): Self = this.set("dayParts", js.Array(value :_*))
    
    @scala.inline
    def setDayParts(value: js.Array[DayPart]): Self = this.set("dayParts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDayParts: Self = this.set("dayParts", js.undefined)
    
    @scala.inline
    def setTimeZoneType(value: String): Self = this.set("timeZoneType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeZoneType: Self = this.set("timeZoneType", js.undefined)
  }
}
