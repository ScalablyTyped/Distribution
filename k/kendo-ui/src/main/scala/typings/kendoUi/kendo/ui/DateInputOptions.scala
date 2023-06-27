package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DateInputOptions
  extends StObject
     with AllEditorOptions {
  
  var autoCorrectParts: js.UndefOr[Boolean] = js.undefined
  
  var autoSwitchKeys: js.UndefOr[Any] = js.undefined
  
  var autoSwitchParts: js.UndefOr[Boolean] = js.undefined
  
  var change: js.UndefOr[js.Function1[/* e */ DateInputChangeEvent, Unit]] = js.undefined
  
  var enableMouseWheel: js.UndefOr[Boolean] = js.undefined
  
  var fillMode: js.UndefOr[String] = js.undefined
  
  var format: js.UndefOr[String] = js.undefined
  
  var label: js.UndefOr[String | js.Function | BaseLabel] = js.undefined
  
  var max: js.UndefOr[js.Date] = js.undefined
  
  var messages: js.UndefOr[DateInputMessages] = js.undefined
  
  var min: js.UndefOr[js.Date] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var rounded: js.UndefOr[String] = js.undefined
  
  var size: js.UndefOr[String] = js.undefined
  
  var steps: js.UndefOr[DateInputSteps] = js.undefined
  
  var value: js.UndefOr[js.Date] = js.undefined
}
object DateInputOptions {
  
  inline def apply(): DateInputOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DateInputOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DateInputOptions] (val x: Self) extends AnyVal {
    
    inline def setAutoCorrectParts(value: Boolean): Self = StObject.set(x, "autoCorrectParts", value.asInstanceOf[js.Any])
    
    inline def setAutoCorrectPartsUndefined: Self = StObject.set(x, "autoCorrectParts", js.undefined)
    
    inline def setAutoSwitchKeys(value: Any): Self = StObject.set(x, "autoSwitchKeys", value.asInstanceOf[js.Any])
    
    inline def setAutoSwitchKeysUndefined: Self = StObject.set(x, "autoSwitchKeys", js.undefined)
    
    inline def setAutoSwitchParts(value: Boolean): Self = StObject.set(x, "autoSwitchParts", value.asInstanceOf[js.Any])
    
    inline def setAutoSwitchPartsUndefined: Self = StObject.set(x, "autoSwitchParts", js.undefined)
    
    inline def setChange(value: /* e */ DateInputChangeEvent => Unit): Self = StObject.set(x, "change", js.Any.fromFunction1(value))
    
    inline def setChangeUndefined: Self = StObject.set(x, "change", js.undefined)
    
    inline def setEnableMouseWheel(value: Boolean): Self = StObject.set(x, "enableMouseWheel", value.asInstanceOf[js.Any])
    
    inline def setEnableMouseWheelUndefined: Self = StObject.set(x, "enableMouseWheel", js.undefined)
    
    inline def setFillMode(value: String): Self = StObject.set(x, "fillMode", value.asInstanceOf[js.Any])
    
    inline def setFillModeUndefined: Self = StObject.set(x, "fillMode", js.undefined)
    
    inline def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    inline def setLabel(value: String | js.Function | BaseLabel): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    inline def setMax(value: js.Date): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
    
    inline def setMessages(value: DateInputMessages): Self = StObject.set(x, "messages", value.asInstanceOf[js.Any])
    
    inline def setMessagesUndefined: Self = StObject.set(x, "messages", js.undefined)
    
    inline def setMin(value: js.Date): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    inline def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setRounded(value: String): Self = StObject.set(x, "rounded", value.asInstanceOf[js.Any])
    
    inline def setRoundedUndefined: Self = StObject.set(x, "rounded", js.undefined)
    
    inline def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    inline def setSteps(value: DateInputSteps): Self = StObject.set(x, "steps", value.asInstanceOf[js.Any])
    
    inline def setStepsUndefined: Self = StObject.set(x, "steps", js.undefined)
    
    inline def setValue(value: js.Date): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
