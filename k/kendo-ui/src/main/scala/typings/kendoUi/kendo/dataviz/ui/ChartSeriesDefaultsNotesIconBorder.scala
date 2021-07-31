package typings.kendoUi.kendo.dataviz.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChartSeriesDefaultsNotesIconBorder extends StObject {
  
  var color: js.UndefOr[String] = js.undefined
  
  var width: js.UndefOr[Double] = js.undefined
}
object ChartSeriesDefaultsNotesIconBorder {
  
  @scala.inline
  def apply(): ChartSeriesDefaultsNotesIconBorder = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartSeriesDefaultsNotesIconBorder]
  }
  
  @scala.inline
  implicit class ChartSeriesDefaultsNotesIconBorderMutableBuilder[Self <: ChartSeriesDefaultsNotesIconBorder] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
