package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DateRangePickerMessages extends StObject {
  
  var endLabel: js.UndefOr[String] = js.native
  
  var startLabel: js.UndefOr[String] = js.native
}
object DateRangePickerMessages {
  
  @scala.inline
  def apply(): DateRangePickerMessages = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DateRangePickerMessages]
  }
  
  @scala.inline
  implicit class DateRangePickerMessagesMutableBuilder[Self <: DateRangePickerMessages] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEndLabel(value: String): Self = StObject.set(x, "endLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndLabelUndefined: Self = StObject.set(x, "endLabel", js.undefined)
    
    @scala.inline
    def setStartLabel(value: String): Self = StObject.set(x, "startLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartLabelUndefined: Self = StObject.set(x, "startLabel", js.undefined)
  }
}
