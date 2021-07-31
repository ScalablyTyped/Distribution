package typings.kendoUi.kendo.dataviz.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StockChartLegend extends StObject {
  
  var background: js.UndefOr[String] = js.undefined
  
  var border: js.UndefOr[StockChartLegendBorder] = js.undefined
  
  var inactiveItems: js.UndefOr[StockChartLegendInactiveItems] = js.undefined
  
  var item: js.UndefOr[StockChartLegendItem] = js.undefined
  
  var labels: js.UndefOr[StockChartLegendLabels] = js.undefined
  
  var margin: js.UndefOr[Double | js.Any] = js.undefined
  
  var offsetX: js.UndefOr[Double] = js.undefined
  
  var offsetY: js.UndefOr[Double] = js.undefined
  
  var padding: js.UndefOr[Double | js.Any] = js.undefined
  
  var position: js.UndefOr[String] = js.undefined
  
  var reverse: js.UndefOr[Boolean] = js.undefined
  
  var visible: js.UndefOr[Boolean] = js.undefined
}
object StockChartLegend {
  
  @scala.inline
  def apply(): StockChartLegend = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StockChartLegend]
  }
  
  @scala.inline
  implicit class StockChartLegendMutableBuilder[Self <: StockChartLegend] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBackground(value: String): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackgroundUndefined: Self = StObject.set(x, "background", js.undefined)
    
    @scala.inline
    def setBorder(value: StockChartLegendBorder): Self = StObject.set(x, "border", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderUndefined: Self = StObject.set(x, "border", js.undefined)
    
    @scala.inline
    def setInactiveItems(value: StockChartLegendInactiveItems): Self = StObject.set(x, "inactiveItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInactiveItemsUndefined: Self = StObject.set(x, "inactiveItems", js.undefined)
    
    @scala.inline
    def setItem(value: StockChartLegendItem): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemUndefined: Self = StObject.set(x, "item", js.undefined)
    
    @scala.inline
    def setLabels(value: StockChartLegendLabels): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    @scala.inline
    def setMargin(value: Double | js.Any): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarginUndefined: Self = StObject.set(x, "margin", js.undefined)
    
    @scala.inline
    def setOffsetX(value: Double): Self = StObject.set(x, "offsetX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffsetXUndefined: Self = StObject.set(x, "offsetX", js.undefined)
    
    @scala.inline
    def setOffsetY(value: Double): Self = StObject.set(x, "offsetY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffsetYUndefined: Self = StObject.set(x, "offsetY", js.undefined)
    
    @scala.inline
    def setPadding(value: Double | js.Any): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
    
    @scala.inline
    def setPosition(value: String): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    @scala.inline
    def setReverse(value: Boolean): Self = StObject.set(x, "reverse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReverseUndefined: Self = StObject.set(x, "reverse", js.undefined)
    
    @scala.inline
    def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
  }
}
