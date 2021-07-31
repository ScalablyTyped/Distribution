package typings.materializeCss.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<materialize-css.M.SliderOptions> */
trait PartialSliderOptions extends StObject {
  
  var duration: js.UndefOr[Double] = js.undefined
  
  var height: js.UndefOr[Double] = js.undefined
  
  var indicators: js.UndefOr[Boolean] = js.undefined
  
  var interval: js.UndefOr[Double] = js.undefined
}
object PartialSliderOptions {
  
  @scala.inline
  def apply(): PartialSliderOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialSliderOptions]
  }
  
  @scala.inline
  implicit class PartialSliderOptionsMutableBuilder[Self <: PartialSliderOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    @scala.inline
    def setIndicators(value: Boolean): Self = StObject.set(x, "indicators", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndicatorsUndefined: Self = StObject.set(x, "indicators", js.undefined)
    
    @scala.inline
    def setInterval(value: Double): Self = StObject.set(x, "interval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIntervalUndefined: Self = StObject.set(x, "interval", js.undefined)
  }
}
