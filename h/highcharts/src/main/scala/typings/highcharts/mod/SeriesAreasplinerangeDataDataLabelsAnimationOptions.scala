package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SeriesAreasplinerangeDataDataLabelsAnimationOptions extends StObject {
  
  /**
    * (Highcharts, Highstock) The animation delay time in milliseconds. Set to
    * `0` renders dataLabel immediately. As `undefined` inherits defer time
    * from the series.animation.defer.
    */
  var defer: js.UndefOr[Double] = js.undefined
}
object SeriesAreasplinerangeDataDataLabelsAnimationOptions {
  
  @scala.inline
  def apply(): SeriesAreasplinerangeDataDataLabelsAnimationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SeriesAreasplinerangeDataDataLabelsAnimationOptions]
  }
  
  @scala.inline
  implicit class SeriesAreasplinerangeDataDataLabelsAnimationOptionsMutableBuilder[Self <: SeriesAreasplinerangeDataDataLabelsAnimationOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefer(value: Double): Self = StObject.set(x, "defer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeferUndefined: Self = StObject.set(x, "defer", js.undefined)
  }
}
