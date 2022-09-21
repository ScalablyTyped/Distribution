package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LangAccessibilityExportingOptions extends StObject {
  
  var chartMenuLabel: js.UndefOr[String] = js.undefined
  
  var menuButtonLabel: js.UndefOr[String] = js.undefined
}
object LangAccessibilityExportingOptions {
  
  inline def apply(): LangAccessibilityExportingOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LangAccessibilityExportingOptions]
  }
  
  extension [Self <: LangAccessibilityExportingOptions](x: Self) {
    
    inline def setChartMenuLabel(value: String): Self = StObject.set(x, "chartMenuLabel", value.asInstanceOf[js.Any])
    
    inline def setChartMenuLabelUndefined: Self = StObject.set(x, "chartMenuLabel", js.undefined)
    
    inline def setMenuButtonLabel(value: String): Self = StObject.set(x, "menuButtonLabel", value.asInstanceOf[js.Any])
    
    inline def setMenuButtonLabelUndefined: Self = StObject.set(x, "menuButtonLabel", js.undefined)
  }
}
