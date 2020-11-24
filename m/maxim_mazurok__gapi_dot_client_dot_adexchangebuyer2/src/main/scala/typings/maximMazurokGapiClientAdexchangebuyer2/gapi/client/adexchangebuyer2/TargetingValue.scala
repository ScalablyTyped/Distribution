package typings.maximMazurokGapiClientAdexchangebuyer2.gapi.client.adexchangebuyer2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TargetingValue extends js.Object {
  
  /** The creative size value to include/exclude. Filled in when key = GOOG_CREATIVE_SIZE */
  var creativeSizeValue: js.UndefOr[CreativeSize] = js.native
  
  /** The daypart targeting to include / exclude. Filled in when the key is GOOG_DAYPART_TARGETING. The definition of this targeting is derived from the structure used by Ad Manager. */
  var dayPartTargetingValue: js.UndefOr[DayPartTargeting] = js.native
  
  /** The long value to include/exclude. */
  var longValue: js.UndefOr[String] = js.native
  
  /** The string value to include/exclude. */
  var stringValue: js.UndefOr[String] = js.native
}
object TargetingValue {
  
  @scala.inline
  def apply(): TargetingValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TargetingValue]
  }
  
  @scala.inline
  implicit class TargetingValueOps[Self <: TargetingValue] (val x: Self) extends AnyVal {
    
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
    def setCreativeSizeValue(value: CreativeSize): Self = this.set("creativeSizeValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreativeSizeValue: Self = this.set("creativeSizeValue", js.undefined)
    
    @scala.inline
    def setDayPartTargetingValue(value: DayPartTargeting): Self = this.set("dayPartTargetingValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDayPartTargetingValue: Self = this.set("dayPartTargetingValue", js.undefined)
    
    @scala.inline
    def setLongValue(value: String): Self = this.set("longValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLongValue: Self = this.set("longValue", js.undefined)
    
    @scala.inline
    def setStringValue(value: String): Self = this.set("stringValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStringValue: Self = this.set("stringValue", js.undefined)
  }
}
