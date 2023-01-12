package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlotAreaOnPointOptions extends StObject {
  
  /**
    * (Highcharts, Highstock) Options for the connector in the _Series on
    * point_ feature.
    *
    * In styled mode, the connector can be styled with the
    * `.highcharts-connector-seriesonpoint` class name.
    */
  var connectorOptions: js.UndefOr[PlotAreaOnPointConnectorOptions | SVGAttributes] = js.undefined
  
  /**
    * (Highcharts, Highstock) The `id` of the point that we connect the series
    * to. Only points with a given `plotX` and `plotY` values and map points
    * are valid.
    */
  var id: js.UndefOr[String] = js.undefined
  
  /**
    * (Highcharts, Highstock) Options allowing to set a position and an offset
    * of the series in the _Series on point_ feature.
    */
  var position: js.UndefOr[js.Object | PlotAreaOnPointPositionOptions] = js.undefined
}
object PlotAreaOnPointOptions {
  
  inline def apply(): PlotAreaOnPointOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlotAreaOnPointOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PlotAreaOnPointOptions] (val x: Self) extends AnyVal {
    
    inline def setConnectorOptions(value: PlotAreaOnPointConnectorOptions | SVGAttributes): Self = StObject.set(x, "connectorOptions", value.asInstanceOf[js.Any])
    
    inline def setConnectorOptionsUndefined: Self = StObject.set(x, "connectorOptions", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setPosition(value: js.Object | PlotAreaOnPointPositionOptions): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
  }
}
