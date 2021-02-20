package typings.kendoUi.kendo.dataviz.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StockChartCategoryAxisItemNotesDataItemLine extends StObject {
  
  var color: js.UndefOr[String] = js.native
  
  var length: js.UndefOr[Double] = js.native
  
  var width: js.UndefOr[Double] = js.native
}
object StockChartCategoryAxisItemNotesDataItemLine {
  
  @scala.inline
  def apply(): StockChartCategoryAxisItemNotesDataItemLine = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StockChartCategoryAxisItemNotesDataItemLine]
  }
  
  @scala.inline
  implicit class StockChartCategoryAxisItemNotesDataItemLineMutableBuilder[Self <: StockChartCategoryAxisItemNotesDataItemLine] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    @scala.inline
    def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLengthUndefined: Self = StObject.set(x, "length", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
