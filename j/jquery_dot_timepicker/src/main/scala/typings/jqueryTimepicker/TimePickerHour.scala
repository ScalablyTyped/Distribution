package typings.jqueryTimepicker

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TimePickerHour extends StObject {
  
  /** last displayed hour */
  var ends: js.UndefOr[Double] = js.undefined
  
  /** first displayed hour */
  var starts: js.UndefOr[Double] = js.undefined
}
object TimePickerHour {
  
  inline def apply(): TimePickerHour = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TimePickerHour]
  }
  
  extension [Self <: TimePickerHour](x: Self) {
    
    inline def setEnds(value: Double): Self = StObject.set(x, "ends", value.asInstanceOf[js.Any])
    
    inline def setEndsUndefined: Self = StObject.set(x, "ends", js.undefined)
    
    inline def setStarts(value: Double): Self = StObject.set(x, "starts", value.asInstanceOf[js.Any])
    
    inline def setStartsUndefined: Self = StObject.set(x, "starts", js.undefined)
  }
}
