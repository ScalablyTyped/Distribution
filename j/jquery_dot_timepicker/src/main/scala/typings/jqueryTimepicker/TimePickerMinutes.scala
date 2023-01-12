package typings.jqueryTimepicker

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TimePickerMinutes extends StObject {
  
  /** last displayed minute */
  var ends: js.UndefOr[Double] = js.undefined
  
  /** interval of displayed minutes */
  var interval: js.UndefOr[Double] = js.undefined
  
  /** first displayed minute */
  var starts: js.UndefOr[Double] = js.undefined
}
object TimePickerMinutes {
  
  inline def apply(): TimePickerMinutes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TimePickerMinutes]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TimePickerMinutes] (val x: Self) extends AnyVal {
    
    inline def setEnds(value: Double): Self = StObject.set(x, "ends", value.asInstanceOf[js.Any])
    
    inline def setEndsUndefined: Self = StObject.set(x, "ends", js.undefined)
    
    inline def setInterval(value: Double): Self = StObject.set(x, "interval", value.asInstanceOf[js.Any])
    
    inline def setIntervalUndefined: Self = StObject.set(x, "interval", js.undefined)
    
    inline def setStarts(value: Double): Self = StObject.set(x, "starts", value.asInstanceOf[js.Any])
    
    inline def setStartsUndefined: Self = StObject.set(x, "starts", js.undefined)
  }
}
