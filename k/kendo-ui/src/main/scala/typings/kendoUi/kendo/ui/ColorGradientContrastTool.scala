package typings.kendoUi.kendo.ui

import typings.kendoUi.kendo.Color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ColorGradientContrastTool extends StObject {
  
  var backgroundColor: js.UndefOr[String | Color] = js.undefined
}
object ColorGradientContrastTool {
  
  inline def apply(): ColorGradientContrastTool = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColorGradientContrastTool]
  }
  
  extension [Self <: ColorGradientContrastTool](x: Self) {
    
    inline def setBackgroundColor(value: String | Color): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
    
    inline def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
  }
}
