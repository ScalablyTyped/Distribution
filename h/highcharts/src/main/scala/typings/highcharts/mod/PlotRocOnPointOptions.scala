package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlotRocOnPointOptions extends StObject {
  
  /**
    * (Highstock) Options for the connector in the _Series on point_ feature.
    *
    * In styled mode, the connector can be styled with the
    * `.highcharts-connector-seriesonpoint` class name.
    */
  var connectorOptions: js.UndefOr[PlotRocOnPointConnectorOptions | SVGAttributes] = js.undefined
  
  /**
    * (Highstock) The `id` of the point that we connect the series to. Only
    * points with a given `plotX` and `plotY` values and map points are valid.
    */
  var id: js.UndefOr[String] = js.undefined
  
  /**
    * (Highstock) Options allowing to set a position and an offset of the
    * series in the _Series on point_ feature.
    */
  var position: js.UndefOr[js.Object | PlotRocOnPointPositionOptions] = js.undefined
}
object PlotRocOnPointOptions {
  
  inline def apply(): PlotRocOnPointOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlotRocOnPointOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PlotRocOnPointOptions] (val x: Self) extends AnyVal {
    
    inline def setConnectorOptions(value: PlotRocOnPointConnectorOptions | SVGAttributes): Self = StObject.set(x, "connectorOptions", value.asInstanceOf[js.Any])
    
    inline def setConnectorOptionsUndefined: Self = StObject.set(x, "connectorOptions", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setPosition(value: js.Object | PlotRocOnPointPositionOptions): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
  }
}
