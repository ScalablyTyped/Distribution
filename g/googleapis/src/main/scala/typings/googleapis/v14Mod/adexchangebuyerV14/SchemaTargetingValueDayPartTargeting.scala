package typings.googleapis.v14Mod.adexchangebuyerV14

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaTargetingValueDayPartTargeting extends StObject {
  
  var dayParts: js.UndefOr[js.Array[SchemaTargetingValueDayPartTargetingDayPart]] = js.undefined
  
  var timeZoneType: js.UndefOr[String] = js.undefined
}
object SchemaTargetingValueDayPartTargeting {
  
  inline def apply(): SchemaTargetingValueDayPartTargeting = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTargetingValueDayPartTargeting]
  }
  
  extension [Self <: SchemaTargetingValueDayPartTargeting](x: Self) {
    
    inline def setDayParts(value: js.Array[SchemaTargetingValueDayPartTargetingDayPart]): Self = StObject.set(x, "dayParts", value.asInstanceOf[js.Any])
    
    inline def setDayPartsUndefined: Self = StObject.set(x, "dayParts", js.undefined)
    
    inline def setDayPartsVarargs(value: SchemaTargetingValueDayPartTargetingDayPart*): Self = StObject.set(x, "dayParts", js.Array(value :_*))
    
    inline def setTimeZoneType(value: String): Self = StObject.set(x, "timeZoneType", value.asInstanceOf[js.Any])
    
    inline def setTimeZoneTypeUndefined: Self = StObject.set(x, "timeZoneType", js.undefined)
  }
}
