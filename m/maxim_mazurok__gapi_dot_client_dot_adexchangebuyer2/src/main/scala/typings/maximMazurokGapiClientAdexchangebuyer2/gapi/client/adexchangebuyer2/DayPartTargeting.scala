package typings.maximMazurokGapiClientAdexchangebuyer2.gapi.client.adexchangebuyer2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DayPartTargeting extends StObject {
  
  /** A list of day part targeting criterion. */
  var dayParts: js.UndefOr[js.Array[DayPart]] = js.undefined
  
  /** The timezone to use for interpreting the day part targeting. */
  var timeZoneType: js.UndefOr[String] = js.undefined
}
object DayPartTargeting {
  
  @scala.inline
  def apply(): DayPartTargeting = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DayPartTargeting]
  }
  
  @scala.inline
  implicit class DayPartTargetingMutableBuilder[Self <: DayPartTargeting] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDayParts(value: js.Array[DayPart]): Self = StObject.set(x, "dayParts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDayPartsUndefined: Self = StObject.set(x, "dayParts", js.undefined)
    
    @scala.inline
    def setDayPartsVarargs(value: DayPart*): Self = StObject.set(x, "dayParts", js.Array(value :_*))
    
    @scala.inline
    def setTimeZoneType(value: String): Self = StObject.set(x, "timeZoneType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeZoneTypeUndefined: Self = StObject.set(x, "timeZoneType", js.undefined)
  }
}
