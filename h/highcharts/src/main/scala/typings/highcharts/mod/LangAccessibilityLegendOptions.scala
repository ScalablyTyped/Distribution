package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LangAccessibilityLegendOptions extends StObject {
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Accessible label for individual
    * legend items. `{itemName}` refers to the visual text in the legend for
    * that item.
    */
  var legendItem: js.UndefOr[String] = js.undefined
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Accessible label for the legend,
    * for charts where there is a legend title defined. `{legendTitle}` refers
    * to the visual text in the legend title.
    */
  var legendLabel: js.UndefOr[String] = js.undefined
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Accessible label for the legend,
    * for charts where there is no legend title defined.
    */
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
