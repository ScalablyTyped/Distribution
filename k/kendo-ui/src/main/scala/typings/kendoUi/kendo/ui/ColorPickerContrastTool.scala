package typings.kendoUi.kendo.ui

import typings.kendoUi.kendo.Color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ColorPickerContrastTool extends StObject {
  
  var backgroundColor: js.UndefOr[String | Color] = js.undefined
}
object ColorPickerContrastTool {
  
  inline def apply(): ColorPickerContrastTool = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColorPickerContrastTool]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ColorPickerContrastTool] (val x: Self) extends AnyVal {
    
    inline def setBackgroundColor(value: String | Color): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
    
    inline def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
  }
}
