package typings.kendoUi.kendo.dataviz.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StockChartNavigatorPane extends StObject {
  
  var background: js.UndefOr[String] = js.native
  
  var border: js.UndefOr[StockChartNavigatorPaneBorder] = js.native
  
  var height: js.UndefOr[Double] = js.native
  
  var margin: js.UndefOr[Double | StockChartNavigatorPaneMargin] = js.native
  
  var name: js.UndefOr[String] = js.native
  
  var padding: js.UndefOr[Double | StockChartNavigatorPanePadding] = js.native
  
  var title: js.UndefOr[String | StockChartNavigatorPaneTitle] = js.native
}
object StockChartNavigatorPane {
  
  @scala.inline
  def apply(): StockChartNavigatorPane = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StockChartNavigatorPane]
  }
  
  @scala.inline
  implicit class StockChartNavigatorPaneMutableBuilder[Self <: StockChartNavigatorPane] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBackground(value: String): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackgroundUndefined: Self = StObject.set(x, "background", js.undefined)
    
    @scala.inline
    def setBorder(value: StockChartNavigatorPaneBorder): Self = StObject.set(x, "border", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderUndefined: Self = StObject.set(x, "border", js.undefined)
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    @scala.inline
    def setMargin(value: Double | StockChartNavigatorPaneMargin): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarginUndefined: Self = StObject.set(x, "margin", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setPadding(value: Double | StockChartNavigatorPanePadding): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
    
    @scala.inline
    def setTitle(value: String | StockChartNavigatorPaneTitle): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
