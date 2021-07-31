package typings.googleapis.v14Mod.adexchangebuyerV14

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaTargetingValue extends StObject {
  
  /**
    * The creative size value to exclude/include.
    */
  var creativeSizeValue: js.UndefOr[SchemaTargetingValueCreativeSize] = js.undefined
  
  /**
    * The daypart targeting to include / exclude. Filled in when the key is
    * GOOG_DAYPART_TARGETING.
    */
  var dayPartTargetingValue: js.UndefOr[SchemaTargetingValueDayPartTargeting] = js.undefined
  
  var demogAgeCriteriaValue: js.UndefOr[SchemaTargetingValueDemogAgeCriteria] = js.undefined
  
  var demogGenderCriteriaValue: js.UndefOr[SchemaTargetingValueDemogGenderCriteria] = js.undefined
  
  /**
    * The long value to exclude/include.
    */
  var longValue: js.UndefOr[String] = js.undefined
  
  /**
    * The string value to exclude/include.
    */
  var stringValue: js.UndefOr[String] = js.undefined
}
object SchemaTargetingValue {
  
  @scala.inline
  def apply(): SchemaTargetingValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTargetingValue]
  }
  
  @scala.inline
  implicit class SchemaTargetingValueMutableBuilder[Self <: SchemaTargetingValue] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreativeSizeValue(value: SchemaTargetingValueCreativeSize): Self = StObject.set(x, "creativeSizeValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreativeSizeValueUndefined: Self = StObject.set(x, "creativeSizeValue", js.undefined)
    
    @scala.inline
    def setDayPartTargetingValue(value: SchemaTargetingValueDayPartTargeting): Self = StObject.set(x, "dayPartTargetingValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDayPartTargetingValueUndefined: Self = StObject.set(x, "dayPartTargetingValue", js.undefined)
    
    @scala.inline
    def setDemogAgeCriteriaValue(value: SchemaTargetingValueDemogAgeCriteria): Self = StObject.set(x, "demogAgeCriteriaValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDemogAgeCriteriaValueUndefined: Self = StObject.set(x, "demogAgeCriteriaValue", js.undefined)
    
    @scala.inline
    def setDemogGenderCriteriaValue(value: SchemaTargetingValueDemogGenderCriteria): Self = StObject.set(x, "demogGenderCriteriaValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDemogGenderCriteriaValueUndefined: Self = StObject.set(x, "demogGenderCriteriaValue", js.undefined)
    
    @scala.inline
    def setLongValue(value: String): Self = StObject.set(x, "longValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLongValueUndefined: Self = StObject.set(x, "longValue", js.undefined)
    
    @scala.inline
    def setStringValue(value: String): Self = StObject.set(x, "stringValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStringValueUndefined: Self = StObject.set(x, "stringValue", js.undefined)
  }
}
