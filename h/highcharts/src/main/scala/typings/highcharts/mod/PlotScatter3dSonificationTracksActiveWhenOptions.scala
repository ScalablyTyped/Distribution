package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlotScatter3dSonificationTracksActiveWhenOptions extends StObject {
  
  /**
    * (Highcharts) Track is only active when `prop` was above, and is now at or
    * below this value.
    *
    * If both `crossingUp` and `crossingDown` are defined, the track is active
    * if either condition is met.
    */
  var crossingDown: js.UndefOr[Double] = js.undefined
  
  /**
    * (Highcharts) Track is only active when `prop` was below, and is now at or
    * above this value.
    *
    * If both `crossingUp` and `crossingDown` are defined, the track is active
    * if either condition is met.
    */
  var crossingUp: js.UndefOr[Double] = js.undefined
  
  /**
    * (Highcharts) Track is only active when `prop` is below or at this value.
    */
  var max: js.UndefOr[Double] = js.undefined
  
  /**
    * (Highcharts) Track is only active when `prop` is above or at this value.
    */
  var min: js.UndefOr[Double] = js.undefined
  
  /**
    * (Highcharts) The point property to compare, for example `y` or `x`.
    */
  var prop: js.UndefOr[String] = js.undefined
}
object PlotScatter3dSonificationTracksActiveWhenOptions {
  
  inline def apply(): PlotScatter3dSonificationTracksActiveWhenOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlotScatter3dSonificationTracksActiveWhenOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PlotScatter3dSonificationTracksActiveWhenOptions] (val x: Self) extends AnyVal {
    
    inline def setCrossingDown(value: Double): Self = StObject.set(x, "crossingDown", value.asInstanceOf[js.Any])
    
    inline def setCrossingDownUndefined: Self = StObject.set(x, "crossingDown", js.undefined)
    
    inline def setCrossingUp(value: Double): Self = StObject.set(x, "crossingUp", value.asInstanceOf[js.Any])
    
    inline def setCrossingUpUndefined: Self = StObject.set(x, "crossingUp", js.undefined)
    
    inline def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
    
    inline def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    inline def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
    
    inline def setProp(value: String): Self = StObject.set(x, "prop", value.asInstanceOf[js.Any])
    
    inline def setPropUndefined: Self = StObject.set(x, "prop", js.undefined)
  }
}
