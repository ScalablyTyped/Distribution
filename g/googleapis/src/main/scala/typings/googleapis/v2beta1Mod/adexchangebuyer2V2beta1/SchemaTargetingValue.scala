package typings.googleapis.v2beta1Mod.adexchangebuyer2V2beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaTargetingValue extends StObject {
  
  /**
    * The creative size value to include/exclude. Filled in when key = GOOG_CREATIVE_SIZE
    */
  var creativeSizeValue: js.UndefOr[SchemaCreativeSize] = js.undefined
  
  /**
    * The daypart targeting to include / exclude. Filled in when the key is GOOG_DAYPART_TARGETING. The definition of this targeting is derived from the structure used by Ad Manager.
    */
  var dayPartTargetingValue: js.UndefOr[SchemaDayPartTargeting] = js.undefined
  
  /**
    * The long value to include/exclude.
    */
  var longValue: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The string value to include/exclude.
    */
  var stringValue: js.UndefOr[String | Null] = js.undefined
}
object SchemaTargetingValue {
  
  inline def apply(): SchemaTargetingValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTargetingValue]
  }
  
  extension [Self <: SchemaTargetingValue](x: Self) {
    
    inline def setCreativeSizeValue(value: SchemaCreativeSize): Self = StObject.set(x, "creativeSizeValue", value.asInstanceOf[js.Any])
    
    inline def setCreativeSizeValueUndefined: Self = StObject.set(x, "creativeSizeValue", js.undefined)
    
    inline def setDayPartTargetingValue(value: SchemaDayPartTargeting): Self = StObject.set(x, "dayPartTargetingValue", value.asInstanceOf[js.Any])
    
    inline def setDayPartTargetingValueUndefined: Self = StObject.set(x, "dayPartTargetingValue", js.undefined)
    
    inline def setLongValue(value: String): Self = StObject.set(x, "longValue", value.asInstanceOf[js.Any])
    
    inline def setLongValueNull: Self = StObject.set(x, "longValue", null)
    
    inline def setLongValueUndefined: Self = StObject.set(x, "longValue", js.undefined)
    
    inline def setStringValue(value: String): Self = StObject.set(x, "stringValue", value.asInstanceOf[js.Any])
    
    inline def setStringValueNull: Self = StObject.set(x, "stringValue", null)
    
    inline def setStringValueUndefined: Self = StObject.set(x, "stringValue", js.undefined)
  }
}
