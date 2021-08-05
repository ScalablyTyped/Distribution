package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChartResetZoomButtonPositionOptions extends StObject {
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) The horizontal alignment of the
    * button.
    */
  var align: js.UndefOr[String] = js.undefined
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) The vertical alignment of the
    * button.
    */
  var verticalAlign: js.UndefOr[VerticalAlignValue] = js.undefined
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) The horizontal offset of the
    * button.
    */
  var x: js.UndefOr[Double] = js.undefined
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) The vertical offset of the
    * button.
    */
  var y: js.UndefOr[Double] = js.undefined
}
object ChartResetZoomButtonPositionOptions {
  
  inline def apply(): ChartResetZoomButtonPositionOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartResetZoomButtonPositionOptions]
  }
  
  extension [Self <: ChartResetZoomButtonPositionOptions](x: Self) {
    
    inline def setAlign(value: String): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
    
    inline def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
    
    inline def setVerticalAlign(value: VerticalAlignValue): Self = StObject.set(x, "verticalAlign", value.asInstanceOf[js.Any])
    
    inline def setVerticalAlignUndefined: Self = StObject.set(x, "verticalAlign", js.undefined)
    
    inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setXUndefined: Self = StObject.set(x, "x", js.undefined)
    
    inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    inline def setYUndefined: Self = StObject.set(x, "y", js.undefined)
  }
}
