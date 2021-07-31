package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LangAccessibilityLegendOptions extends StObject {
  
  var legendItem: js.UndefOr[String] = js.undefined
  
  var legendLabel: js.UndefOr[String] = js.undefined
}
object LangAccessibilityLegendOptions {
  
  @scala.inline
  def apply(): LangAccessibilityLegendOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LangAccessibilityLegendOptions]
  }
  
  @scala.inline
  implicit class LangAccessibilityLegendOptionsMutableBuilder[Self <: LangAccessibilityLegendOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLegendItem(value: String): Self = StObject.set(x, "legendItem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLegendItemUndefined: Self = StObject.set(x, "legendItem", js.undefined)
    
    @scala.inline
    def setLegendLabel(value: String): Self = StObject.set(x, "legendLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLegendLabelUndefined: Self = StObject.set(x, "legendLabel", js.undefined)
  }
}
