package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlotVbpOnPointPositionOptions extends StObject {
  
  /**
    * (Highstock) Series center offset from the original x position. If
    * defined, the connector line is drawn connecting original position with
    * new position.
    */
  var offsetX: js.UndefOr[Double] = js.undefined
  
  /**
    * (Highstock) Series center offset from the original y position. If
    * defined, the connector line is drawn from original position to a new
    * position.
    */
  var offsetY: js.UndefOr[Double] = js.undefined
  
  /**
    * (Highstock) X position of the series center. By default, the series is
    * displayed on the point that it is connected to.
    */
  var x: js.UndefOr[Double] = js.undefined
  
  /**
    * (Highstock) Y position of the series center. By default, the series is
    * displayed on the point that it is connected to.
    */
  var y: js.UndefOr[Double] = js.undefined
}
object PlotVbpOnPointPositionOptions {
  
  inline def apply(): PlotVbpOnPointPositionOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlotVbpOnPointPositionOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PlotVbpOnPointPositionOptions] (val x: Self) extends AnyVal {
    
    inline def setOffsetX(value: Double): Self = StObject.set(x, "offsetX", value.asInstanceOf[js.Any])
    
    inline def setOffsetXUndefined: Self = StObject.set(x, "offsetX", js.undefined)
    
    inline def setOffsetY(value: Double): Self = StObject.set(x, "offsetY", value.asInstanceOf[js.Any])
    
    inline def setOffsetYUndefined: Self = StObject.set(x, "offsetY", js.undefined)
    
    inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setXUndefined: Self = StObject.set(x, "x", js.undefined)
    
    inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    inline def setYUndefined: Self = StObject.set(x, "y", js.undefined)
  }
}
