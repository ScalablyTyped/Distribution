package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SeriesSolidgaugeDataDataLabelsAnimationOptions extends StObject {
  
  /**
    * (Highcharts, Highstock, Gantt) The animation delay time in milliseconds.
    * Set to `0` to render the data labels immediately. As `undefined` inherits
    * defer time from the series.animation.defer.
    */
  var defer: js.UndefOr[Double] = js.undefined
}
object SeriesSolidgaugeDataDataLabelsAnimationOptions {
  
  inline def apply(): SeriesSolidgaugeDataDataLabelsAnimationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SeriesSolidgaugeDataDataLabelsAnimationOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SeriesSolidgaugeDataDataLabelsAnimationOptions] (val x: Self) extends AnyVal {
    
    inline def setDefer(value: Double): Self = StObject.set(x, "defer", value.asInstanceOf[js.Any])
    
    inline def setDeferUndefined: Self = StObject.set(x, "defer", js.undefined)
  }
}
