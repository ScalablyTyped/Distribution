package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlotDisparityindexSonificationDefaultSpeechActiveWhenOptions extends StObject {
  
  /**
    * (Highstock) Track is only active when `prop` was above, and is now at or
    * below this value.
    *
    * If both `crossingUp` and `crossingDown` are defined, the track is active
    * if either condition is met.
    */
  var crossingDown: js.UndefOr[Double] = js.undefined
  
  /**
    * (Highstock) Track is only active when `prop` was below, and is now at or
    * above this value.
    *
    * If both `crossingUp` and `crossingDown` are defined, the track is active
    * if either condition is met.
    */
  var crossingUp: js.UndefOr[Double] = js.undefined
  
  /**
    * (Highstock) Track is only active when `prop` is below or at this value.
    */
  var max: js.UndefOr[Double] = js.undefined
  
  /**
    * (Highstock) Track is only active when `prop` is above or at this value.
    */
  var min: js.UndefOr[Double] = js.undefined
  
  /**
    * (Highstock) The point property to compare, for example `y` or `x`.
    */
  var prop: js.UndefOr[String] = js.undefined
}
object PlotDisparityindexSonificationDefaultSpeechActiveWhenOptions {
  
  inline def apply(): PlotDisparityindexSonificationDefaultSpeechActiveWhenOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlotDisparityindexSonificationDefaultSpeechActiveWhenOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PlotDisparityindexSonificationDefaultSpeechActiveWhenOptions] (val x: Self) extends AnyVal {
    
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
