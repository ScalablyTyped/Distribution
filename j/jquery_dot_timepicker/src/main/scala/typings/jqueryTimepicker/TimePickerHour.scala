package typings.jqueryTimepicker

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TimePickerHour extends StObject {
  
  /** last displayed hour */
  var ends: js.UndefOr[Double] = js.native
  
  /** first displayed hour */
  var starts: js.UndefOr[Double] = js.native
}
object TimePickerHour {
  
  @scala.inline
  def apply(): TimePickerHour = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TimePickerHour]
  }
  
  @scala.inline
  implicit class TimePickerHourMutableBuilder[Self <: TimePickerHour] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnds(value: Double): Self = StObject.set(x, "ends", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndsUndefined: Self = StObject.set(x, "ends", js.undefined)
    
    @scala.inline
    def setStarts(value: Double): Self = StObject.set(x, "starts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartsUndefined: Self = StObject.set(x, "starts", js.undefined)
  }
}
