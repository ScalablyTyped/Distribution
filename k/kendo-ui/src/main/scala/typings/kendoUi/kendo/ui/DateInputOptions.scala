package typings.kendoUi.kendo.ui

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DateInputOptions extends StObject {
  
  var change: js.UndefOr[js.Function1[/* e */ DateInputChangeEvent, Unit]] = js.native
  
  var format: js.UndefOr[String] = js.native
  
  var max: js.UndefOr[Date] = js.native
  
  var messages: js.UndefOr[DateInputMessages] = js.native
  
  var min: js.UndefOr[Date] = js.native
  
  var name: js.UndefOr[String] = js.native
  
  var value: js.UndefOr[Date] = js.native
}
object DateInputOptions {
  
  @scala.inline
  def apply(): DateInputOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DateInputOptions]
  }
  
  @scala.inline
  implicit class DateInputOptionsMutableBuilder[Self <: DateInputOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChange(value: /* e */ DateInputChangeEvent => Unit): Self = StObject.set(x, "change", js.Any.fromFunction1(value))
    
    @scala.inline
    def setChangeUndefined: Self = StObject.set(x, "change", js.undefined)
    
    @scala.inline
    def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    @scala.inline
    def setMax(value: Date): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
    
    @scala.inline
    def setMessages(value: DateInputMessages): Self = StObject.set(x, "messages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessagesUndefined: Self = StObject.set(x, "messages", js.undefined)
    
    @scala.inline
    def setMin(value: Date): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setValue(value: Date): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
