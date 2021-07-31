package typings.maximMazurokGapiClientAdexchangebuyer.gapi.client.adexchangebuyer

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TargetingValueDayPartTargeting extends StObject {
  
  var dayParts: js.UndefOr[js.Array[TargetingValueDayPartTargetingDayPart]] = js.undefined
  
  var timeZoneType: js.UndefOr[String] = js.undefined
}
object TargetingValueDayPartTargeting {
  
  @scala.inline
  def apply(): TargetingValueDayPartTargeting = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TargetingValueDayPartTargeting]
  }
  
  @scala.inline
  implicit class TargetingValueDayPartTargetingMutableBuilder[Self <: TargetingValueDayPartTargeting] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDayParts(value: js.Array[TargetingValueDayPartTargetingDayPart]): Self = StObject.set(x, "dayParts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDayPartsUndefined: Self = StObject.set(x, "dayParts", js.undefined)
    
    @scala.inline
    def setDayPartsVarargs(value: TargetingValueDayPartTargetingDayPart*): Self = StObject.set(x, "dayParts", js.Array(value :_*))
    
    @scala.inline
    def setTimeZoneType(value: String): Self = StObject.set(x, "timeZoneType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeZoneTypeUndefined: Self = StObject.set(x, "timeZoneType", js.undefined)
  }
}
