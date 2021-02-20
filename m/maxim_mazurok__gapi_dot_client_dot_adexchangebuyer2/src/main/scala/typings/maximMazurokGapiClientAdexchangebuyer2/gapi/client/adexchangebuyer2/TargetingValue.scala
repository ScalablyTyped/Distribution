package typings.maximMazurokGapiClientAdexchangebuyer2.gapi.client.adexchangebuyer2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TargetingValue extends StObject {
  
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
  implicit class TargetingValueMutableBuilder[Self <: TargetingValue] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreativeSizeValue(value: CreativeSize): Self = StObject.set(x, "creativeSizeValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreativeSizeValueUndefined: Self = StObject.set(x, "creativeSizeValue", js.undefined)
    
    @scala.inline
    def setDayPartTargetingValue(value: DayPartTargeting): Self = StObject.set(x, "dayPartTargetingValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDayPartTargetingValueUndefined: Self = StObject.set(x, "dayPartTargetingValue", js.undefined)
    
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
