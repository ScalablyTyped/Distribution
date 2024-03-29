package typings.kendoUi.kendo.ui

import typings.kendoUi.kendoUiStrings.auto
import typings.kendoUi.kendoUiStrings.none
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TimePickerOptions
  extends StObject
     with AllEditorOptions {
  
  var adaptiveMode: js.UndefOr[none | auto] = js.undefined
  
  var animation: js.UndefOr[Boolean | TimePickerAnimation] = js.undefined
  
  var change: js.UndefOr[js.Function1[/* e */ TimePickerChangeEvent, Unit]] = js.undefined
  
  var close: js.UndefOr[js.Function1[/* e */ TimePickerCloseEvent, Unit]] = js.undefined
  
  var culture: js.UndefOr[String] = js.undefined
  
  var dateInput: js.UndefOr[Boolean] = js.undefined
  
  var dates: js.UndefOr[Any] = js.undefined
  
  var fillMode: js.UndefOr[String] = js.undefined
  
  var format: js.UndefOr[String] = js.undefined
  
  var interval: js.UndefOr[Double] = js.undefined
  
  var label: js.UndefOr[String | js.Function | BaseLabel] = js.undefined
  
  var max: js.UndefOr[js.Date] = js.undefined
  
  var messages: js.UndefOr[TimePickerMessages] = js.undefined
  
  var min: js.UndefOr[js.Date] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var open: js.UndefOr[js.Function1[/* e */ TimePickerOpenEvent, Unit]] = js.undefined
  
  var parseFormats: js.UndefOr[Any] = js.undefined
  
  var rounded: js.UndefOr[String] = js.undefined
  
  var size: js.UndefOr[String] = js.undefined
  
  var value: js.UndefOr[js.Date] = js.undefined
}
object TimePickerOptions {
  
  inline def apply(): TimePickerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TimePickerOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TimePickerOptions] (val x: Self) extends AnyVal {
    
    inline def setAdaptiveMode(value: none | auto): Self = StObject.set(x, "adaptiveMode", value.asInstanceOf[js.Any])
    
    inline def setAdaptiveModeUndefined: Self = StObject.set(x, "adaptiveMode", js.undefined)
    
    inline def setAnimation(value: Boolean | TimePickerAnimation): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
    
    inline def setAnimationUndefined: Self = StObject.set(x, "animation", js.undefined)
    
    inline def setChange(value: /* e */ TimePickerChangeEvent => Unit): Self = StObject.set(x, "change", js.Any.fromFunction1(value))
    
    inline def setChangeUndefined: Self = StObject.set(x, "change", js.undefined)
    
    inline def setClose(value: /* e */ TimePickerCloseEvent => Unit): Self = StObject.set(x, "close", js.Any.fromFunction1(value))
    
    inline def setCloseUndefined: Self = StObject.set(x, "close", js.undefined)
    
    inline def setCulture(value: String): Self = StObject.set(x, "culture", value.asInstanceOf[js.Any])
    
    inline def setCultureUndefined: Self = StObject.set(x, "culture", js.undefined)
    
    inline def setDateInput(value: Boolean): Self = StObject.set(x, "dateInput", value.asInstanceOf[js.Any])
    
    inline def setDateInputUndefined: Self = StObject.set(x, "dateInput", js.undefined)
    
    inline def setDates(value: Any): Self = StObject.set(x, "dates", value.asInstanceOf[js.Any])
    
    inline def setDatesUndefined: Self = StObject.set(x, "dates", js.undefined)
    
    inline def setFillMode(value: String): Self = StObject.set(x, "fillMode", value.asInstanceOf[js.Any])
    
    inline def setFillModeUndefined: Self = StObject.set(x, "fillMode", js.undefined)
    
    inline def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    inline def setInterval(value: Double): Self = StObject.set(x, "interval", value.asInstanceOf[js.Any])
    
    inline def setIntervalUndefined: Self = StObject.set(x, "interval", js.undefined)
    
    inline def setLabel(value: String | js.Function | BaseLabel): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    inline def setMax(value: js.Date): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
    
    inline def setMessages(value: TimePickerMessages): Self = StObject.set(x, "messages", value.asInstanceOf[js.Any])
    
    inline def setMessagesUndefined: Self = StObject.set(x, "messages", js.undefined)
    
    inline def setMin(value: js.Date): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    inline def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setOpen(value: /* e */ TimePickerOpenEvent => Unit): Self = StObject.set(x, "open", js.Any.fromFunction1(value))
    
    inline def setOpenUndefined: Self = StObject.set(x, "open", js.undefined)
    
    inline def setParseFormats(value: Any): Self = StObject.set(x, "parseFormats", value.asInstanceOf[js.Any])
    
    inline def setParseFormatsUndefined: Self = StObject.set(x, "parseFormats", js.undefined)
    
    inline def setRounded(value: String): Self = StObject.set(x, "rounded", value.asInstanceOf[js.Any])
    
    inline def setRoundedUndefined: Self = StObject.set(x, "rounded", js.undefined)
    
    inline def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    inline def setValue(value: js.Date): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
