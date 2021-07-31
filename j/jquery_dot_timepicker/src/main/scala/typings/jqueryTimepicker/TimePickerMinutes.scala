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
  
  @scala.inline
  def apply(): TimePickerMinutes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TimePickerMinutes]
  }
  
  @scala.inline
  implicit class TimePickerMinutesMutableBuilder[Self <: TimePickerMinutes] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnds(value: Double): Self = StObject.set(x, "ends", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndsUndefined: Self = StObject.set(x, "ends", js.undefined)
    
    @scala.inline
    def setInterval(value: Double): Self = StObject.set(x, "interval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIntervalUndefined: Self = StObject.set(x, "interval", js.undefined)
    
    @scala.inline
    def setStarts(value: Double): Self = StObject.set(x, "starts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartsUndefined: Self = StObject.set(x, "starts", js.undefined)
  }
}
