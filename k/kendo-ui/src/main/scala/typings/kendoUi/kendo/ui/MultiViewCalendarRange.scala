package typings.kendoUi.kendo.ui

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MultiViewCalendarRange extends StObject {
  
  var end: js.UndefOr[Date] = js.native
  
  var start: js.UndefOr[Date] = js.native
}
object MultiViewCalendarRange {
  
  @scala.inline
  def apply(): MultiViewCalendarRange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MultiViewCalendarRange]
  }
  
  @scala.inline
  implicit class MultiViewCalendarRangeMutableBuilder[Self <: MultiViewCalendarRange] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnd(value: Date): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
    
    @scala.inline
    def setStart(value: Date): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
  }
}
