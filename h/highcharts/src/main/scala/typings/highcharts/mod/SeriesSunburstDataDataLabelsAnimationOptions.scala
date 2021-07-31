package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SeriesSunburstDataDataLabelsAnimationOptions extends StObject {
  
  /**
    * (Highcharts) The animation delay time in milliseconds. Set to `0` renders
    * dataLabel immediately. As `undefined` inherits defer time from the
    * series.animation.defer.
    */
  var defer: js.UndefOr[Double] = js.undefined
}
object SeriesSunburstDataDataLabelsAnimationOptions {
  
  @scala.inline
  def apply(): SeriesSunburstDataDataLabelsAnimationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SeriesSunburstDataDataLabelsAnimationOptions]
  }
  
  @scala.inline
  implicit class SeriesSunburstDataDataLabelsAnimationOptionsMutableBuilder[Self <: SeriesSunburstDataDataLabelsAnimationOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefer(value: Double): Self = StObject.set(x, "defer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeferUndefined: Self = StObject.set(x, "defer", js.undefined)
  }
}
