package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LangAccessibilityTableOptions extends StObject {
  
  var tableSummary: js.UndefOr[String] = js.undefined
  
  var viewAsDataTableButtonText: js.UndefOr[String] = js.undefined
}
object LangAccessibilityTableOptions {
  
  inline def apply(): LangAccessibilityTableOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LangAccessibilityTableOptions]
  }
  
  extension [Self <: LangAccessibilityTableOptions](x: Self) {
    
    inline def setTableSummary(value: String): Self = StObject.set(x, "tableSummary", value.asInstanceOf[js.Any])
    
    inline def setTableSummaryUndefined: Self = StObject.set(x, "tableSummary", js.undefined)
    
    inline def setViewAsDataTableButtonText(value: String): Self = StObject.set(x, "viewAsDataTableButtonText", value.asInstanceOf[js.Any])
    
    inline def setViewAsDataTableButtonTextUndefined: Self = StObject.set(x, "viewAsDataTableButtonText", js.undefined)
  }
}
