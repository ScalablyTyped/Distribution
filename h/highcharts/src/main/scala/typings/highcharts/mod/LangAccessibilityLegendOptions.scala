package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LangAccessibilityLegendOptions extends StObject {
  
  var legendItem: js.UndefOr[String] = js.undefined
  
  var legendLabel: js.UndefOr[String] = js.undefined
  
  var legendLabelNoTitle: js.UndefOr[String] = js.undefined
}
object LangAccessibilityLegendOptions {
  
  inline def apply(): LangAccessibilityLegendOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LangAccessibilityLegendOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LangAccessibilityLegendOptions] (val x: Self) extends AnyVal {
    
    inline def setLegendItem(value: String): Self = StObject.set(x, "legendItem", value.asInstanceOf[js.Any])
    
    inline def setLegendItemUndefined: Self = StObject.set(x, "legendItem", js.undefined)
    
    inline def setLegendLabel(value: String): Self = StObject.set(x, "legendLabel", value.asInstanceOf[js.Any])
    
    inline def setLegendLabelNoTitle(value: String): Self = StObject.set(x, "legendLabelNoTitle", value.asInstanceOf[js.Any])
    
    inline def setLegendLabelNoTitleUndefined: Self = StObject.set(x, "legendLabelNoTitle", js.undefined)
    
    inline def setLegendLabelUndefined: Self = StObject.set(x, "legendLabel", js.undefined)
  }
}
