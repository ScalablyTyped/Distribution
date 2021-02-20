package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LangAccessibilityTableOptions extends StObject {
  
  var tableSummary: js.UndefOr[String] = js.native
  
  var viewAsDataTableButtonText: js.UndefOr[String] = js.native
}
object LangAccessibilityTableOptions {
  
  @scala.inline
  def apply(): LangAccessibilityTableOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LangAccessibilityTableOptions]
  }
  
  @scala.inline
  implicit class LangAccessibilityTableOptionsMutableBuilder[Self <: LangAccessibilityTableOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTableSummary(value: String): Self = StObject.set(x, "tableSummary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTableSummaryUndefined: Self = StObject.set(x, "tableSummary", js.undefined)
    
    @scala.inline
    def setViewAsDataTableButtonText(value: String): Self = StObject.set(x, "viewAsDataTableButtonText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewAsDataTableButtonTextUndefined: Self = StObject.set(x, "viewAsDataTableButtonText", js.undefined)
  }
}
