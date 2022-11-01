package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlotTilemapJitterOptions extends StObject {
  
  /**
    * (Highcharts, Highstock) The maximal X offset for the random jitter
    * effect.
    */
  var x: js.UndefOr[Double] = js.undefined
  
  /**
    * (Highcharts, Highstock) The maximal Y offset for the random jitter
    * effect.
    */
  var y: js.UndefOr[Double] = js.undefined
}
object PlotTilemapJitterOptions {
  
  inline def apply(): PlotTilemapJitterOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlotTilemapJitterOptions]
  }
  
  extension [Self <: PlotTilemapJitterOptions](x: Self) {
    
    inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setXUndefined: Self = StObject.set(x, "x", js.undefined)
    
    inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    inline def setYUndefined: Self = StObject.set(x, "y", js.undefined)
  }
}
