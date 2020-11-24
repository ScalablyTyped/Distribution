package typings.maximMazurokGapiClientAdexchangebuyer.gapi.client.adexchangebuyer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TargetingValue extends js.Object {
  
  /** The creative size value to exclude/include. */
  var creativeSizeValue: js.UndefOr[TargetingValueCreativeSize] = js.native
  
  /** The daypart targeting to include / exclude. Filled in when the key is GOOG_DAYPART_TARGETING. */
  var dayPartTargetingValue: js.UndefOr[TargetingValueDayPartTargeting] = js.native
  
  var demogAgeCriteriaValue: js.UndefOr[TargetingValueDemogAgeCriteria] = js.native
  
  var demogGenderCriteriaValue: js.UndefOr[TargetingValueDemogGenderCriteria] = js.native
  
  /** The long value to exclude/include. */
  var longValue: js.UndefOr[String] = js.native
  
  var requestPlatformTargetingValue: js.UndefOr[TargetingValueRequestPlatformTargeting] = js.native
  
  /** The string value to exclude/include. */
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
    def setCreativeSizeValue(value: TargetingValueCreativeSize): Self = this.set("creativeSizeValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreativeSizeValue: Self = this.set("creativeSizeValue", js.undefined)
    
    @scala.inline
    def setDayPartTargetingValue(value: TargetingValueDayPartTargeting): Self = this.set("dayPartTargetingValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDayPartTargetingValue: Self = this.set("dayPartTargetingValue", js.undefined)
    
    @scala.inline
    def setDemogAgeCriteriaValue(value: TargetingValueDemogAgeCriteria): Self = this.set("demogAgeCriteriaValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDemogAgeCriteriaValue: Self = this.set("demogAgeCriteriaValue", js.undefined)
    
    @scala.inline
    def setDemogGenderCriteriaValue(value: TargetingValueDemogGenderCriteria): Self = this.set("demogGenderCriteriaValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDemogGenderCriteriaValue: Self = this.set("demogGenderCriteriaValue", js.undefined)
    
    @scala.inline
    def setLongValue(value: String): Self = this.set("longValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLongValue: Self = this.set("longValue", js.undefined)
    
    @scala.inline
    def setRequestPlatformTargetingValue(value: TargetingValueRequestPlatformTargeting): Self = this.set("requestPlatformTargetingValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequestPlatformTargetingValue: Self = this.set("requestPlatformTargetingValue", js.undefined)
    
    @scala.inline
    def setStringValue(value: String): Self = this.set("stringValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStringValue: Self = this.set("stringValue", js.undefined)
  }
}
