package typings.maximMazurokGapiClientAdexchangebuyer2.gapi.client.adexchangebuyer2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TargetingValue extends StObject {
  
  /** The creative size value to include/exclude. Filled in when key = GOOG_CREATIVE_SIZE */
  var creativeSizeValue: js.UndefOr[CreativeSize] = js.undefined
  
  /** The daypart targeting to include / exclude. Filled in when the key is GOOG_DAYPART_TARGETING. The definition of this targeting is derived from the structure used by Ad Manager. */
  var dayPartTargetingValue: js.UndefOr[DayPartTargeting] = js.undefined
  
  /** The long value to include/exclude. */
  var longValue: js.UndefOr[String] = js.undefined
  
  /** The string value to include/exclude. */
  var stringValue: js.UndefOr[String] = js.undefined
}
object TargetingValue {
  
  inline def apply(): TargetingValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TargetingValue]
  }
  
  extension [Self <: TargetingValue](x: Self) {
    
    inline def setCreativeSizeValue(value: CreativeSize): Self = StObject.set(x, "creativeSizeValue", value.asInstanceOf[js.Any])
    
    inline def setCreativeSizeValueUndefined: Self = StObject.set(x, "creativeSizeValue", js.undefined)
    
    inline def setDayPartTargetingValue(value: DayPartTargeting): Self = StObject.set(x, "dayPartTargetingValue", value.asInstanceOf[js.Any])
    
    inline def setDayPartTargetingValueUndefined: Self = StObject.set(x, "dayPartTargetingValue", js.undefined)
    
    inline def setLongValue(value: String): Self = StObject.set(x, "longValue", value.asInstanceOf[js.Any])
    
    inline def setLongValueUndefined: Self = StObject.set(x, "longValue", js.undefined)
    
    inline def setStringValue(value: String): Self = StObject.set(x, "stringValue", value.asInstanceOf[js.Any])
    
    inline def setStringValueUndefined: Self = StObject.set(x, "stringValue", js.undefined)
  }
}
