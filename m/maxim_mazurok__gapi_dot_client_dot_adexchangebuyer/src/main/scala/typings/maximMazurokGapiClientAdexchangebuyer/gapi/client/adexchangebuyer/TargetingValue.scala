package typings.maximMazurokGapiClientAdexchangebuyer.gapi.client.adexchangebuyer

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TargetingValue extends StObject {
  
  /** The creative size value to exclude/include. */
  var creativeSizeValue: js.UndefOr[TargetingValueCreativeSize] = js.undefined
  
  /** The daypart targeting to include / exclude. Filled in when the key is GOOG_DAYPART_TARGETING. */
  var dayPartTargetingValue: js.UndefOr[TargetingValueDayPartTargeting] = js.undefined
  
  var demogAgeCriteriaValue: js.UndefOr[TargetingValueDemogAgeCriteria] = js.undefined
  
  var demogGenderCriteriaValue: js.UndefOr[TargetingValueDemogGenderCriteria] = js.undefined
  
  /** The long value to exclude/include. */
  var longValue: js.UndefOr[String] = js.undefined
  
  var requestPlatformTargetingValue: js.UndefOr[TargetingValueRequestPlatformTargeting] = js.undefined
  
  /** The string value to exclude/include. */
  var stringValue: js.UndefOr[String] = js.undefined
}
object TargetingValue {
  
  @scala.inline
  def apply(): TargetingValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TargetingValue]
  }
  
  @scala.inline
  implicit class TargetingValueMutableBuilder[Self <: TargetingValue] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreativeSizeValue(value: TargetingValueCreativeSize): Self = StObject.set(x, "creativeSizeValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreativeSizeValueUndefined: Self = StObject.set(x, "creativeSizeValue", js.undefined)
    
    @scala.inline
    def setDayPartTargetingValue(value: TargetingValueDayPartTargeting): Self = StObject.set(x, "dayPartTargetingValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDayPartTargetingValueUndefined: Self = StObject.set(x, "dayPartTargetingValue", js.undefined)
    
    @scala.inline
    def setDemogAgeCriteriaValue(value: TargetingValueDemogAgeCriteria): Self = StObject.set(x, "demogAgeCriteriaValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDemogAgeCriteriaValueUndefined: Self = StObject.set(x, "demogAgeCriteriaValue", js.undefined)
    
    @scala.inline
    def setDemogGenderCriteriaValue(value: TargetingValueDemogGenderCriteria): Self = StObject.set(x, "demogGenderCriteriaValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDemogGenderCriteriaValueUndefined: Self = StObject.set(x, "demogGenderCriteriaValue", js.undefined)
    
    @scala.inline
    def setLongValue(value: String): Self = StObject.set(x, "longValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLongValueUndefined: Self = StObject.set(x, "longValue", js.undefined)
    
    @scala.inline
    def setRequestPlatformTargetingValue(value: TargetingValueRequestPlatformTargeting): Self = StObject.set(x, "requestPlatformTargetingValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestPlatformTargetingValueUndefined: Self = StObject.set(x, "requestPlatformTargetingValue", js.undefined)
    
    @scala.inline
    def setStringValue(value: String): Self = StObject.set(x, "stringValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStringValueUndefined: Self = StObject.set(x, "stringValue", js.undefined)
  }
}
