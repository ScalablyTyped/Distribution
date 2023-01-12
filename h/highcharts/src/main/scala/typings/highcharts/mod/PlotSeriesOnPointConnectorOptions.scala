package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlotSeriesOnPointConnectorOptions extends StObject {
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) A name for the dash style to use
    * for the connector.
    */
  var dashstyle: js.UndefOr[String] = js.undefined
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Color of the connector line. By
    * default it's the series' color.
    */
  var stroke: js.UndefOr[String] = js.undefined
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Pixel width of the connector
    * line.
    */
  var width: js.UndefOr[Double] = js.undefined
}
object PlotSeriesOnPointConnectorOptions {
  
  inline def apply(): PlotSeriesOnPointConnectorOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlotSeriesOnPointConnectorOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PlotSeriesOnPointConnectorOptions] (val x: Self) extends AnyVal {
    
    inline def setDashstyle(value: String): Self = StObject.set(x, "dashstyle", value.asInstanceOf[js.Any])
    
    inline def setDashstyleUndefined: Self = StObject.set(x, "dashstyle", js.undefined)
    
    inline def setStroke(value: String): Self = StObject.set(x, "stroke", value.asInstanceOf[js.Any])
    
    inline def setStrokeUndefined: Self = StObject.set(x, "stroke", js.undefined)
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
