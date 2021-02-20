package typings.googleapis.v14Mod.adexchangebuyerV14

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaTargetingValueDayPartTargeting extends StObject {
  
  var dayParts: js.UndefOr[js.Array[SchemaTargetingValueDayPartTargetingDayPart]] = js.native
  
  var timeZoneType: js.UndefOr[String] = js.native
}
object SchemaTargetingValueDayPartTargeting {
  
  @scala.inline
  def apply(): SchemaTargetingValueDayPartTargeting = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTargetingValueDayPartTargeting]
  }
  
  @scala.inline
  implicit class SchemaTargetingValueDayPartTargetingMutableBuilder[Self <: SchemaTargetingValueDayPartTargeting] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDayParts(value: js.Array[SchemaTargetingValueDayPartTargetingDayPart]): Self = StObject.set(x, "dayParts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDayPartsUndefined: Self = StObject.set(x, "dayParts", js.undefined)
    
    @scala.inline
    def setDayPartsVarargs(value: SchemaTargetingValueDayPartTargetingDayPart*): Self = StObject.set(x, "dayParts", js.Array(value :_*))
    
    @scala.inline
    def setTimeZoneType(value: String): Self = StObject.set(x, "timeZoneType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeZoneTypeUndefined: Self = StObject.set(x, "timeZoneType", js.undefined)
  }
}
