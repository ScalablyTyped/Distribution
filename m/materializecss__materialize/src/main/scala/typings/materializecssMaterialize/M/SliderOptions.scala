package typings.materializecssMaterialize.M

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SliderOptions extends StObject {
  
  /**
    * Set the duration of the transition animation in ms.
    * @default 500
    */
  var duration: Double
  
  /**
    * Set height of slider.
    * @default 400
    */
  var height: Double
  
  /**
    * Set to false to hide slide indicators.
    * @default true
    */
  var indicators: Boolean
  
  /**
    * Set the duration between transitions in ms.
    * @default 6000
    */
  var interval: Double
}
object SliderOptions {
  
  inline def apply(duration: Double, height: Double, indicators: Boolean, interval: Double): SliderOptions = {
    val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], indicators = indicators.asInstanceOf[js.Any], interval = interval.asInstanceOf[js.Any])
    __obj.asInstanceOf[SliderOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SliderOptions] (val x: Self) extends AnyVal {
    
    inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setIndicators(value: Boolean): Self = StObject.set(x, "indicators", value.asInstanceOf[js.Any])
    
    inline def setInterval(value: Double): Self = StObject.set(x, "interval", value.asInstanceOf[js.Any])
  }
}
