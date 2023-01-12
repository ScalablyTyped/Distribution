package typings.materializecssMaterialize.M

import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CarouselOptions extends StObject {
  
  /**
    * Perspective zoom. If 0, all items are the same size
    * @default -100
    */
  var dist: Double
  
  /**
    * Transition duration in milliseconds
    * @default 200
    */
  var duration: Double
  
  /**
    * Make the carousel a full width slider like the second example
    * @default false
    */
  var fullWidth: Boolean
  
  /**
    * Set to true to show indicators
    * @default false
    */
  var indicators: Boolean
  
  /**
    * Don't wrap around and cycle through items
    * @default false
    */
  var noWrap: Boolean
  
  /**
    * Set the number of visible items
    * @default 5
    */
  var numVisible: Double
  
  /**
    * Callback for when a new slide is cycled to
    * @default null
    */
  def onCycleTo(current: Element, dragged: Boolean): Unit
  
  /**
    * Set the padding between non center items
    * @default 0
    */
  var padding: Double
  
  /**
    * Set the spacing of the center item
    * @default 0
    */
  var shift: Double
}
object CarouselOptions {
  
  inline def apply(
    dist: Double,
    duration: Double,
    fullWidth: Boolean,
    indicators: Boolean,
    noWrap: Boolean,
    numVisible: Double,
    onCycleTo: (Element, Boolean) => Unit,
    padding: Double,
    shift: Double
  ): CarouselOptions = {
    val __obj = js.Dynamic.literal(dist = dist.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], fullWidth = fullWidth.asInstanceOf[js.Any], indicators = indicators.asInstanceOf[js.Any], noWrap = noWrap.asInstanceOf[js.Any], numVisible = numVisible.asInstanceOf[js.Any], onCycleTo = js.Any.fromFunction2(onCycleTo), padding = padding.asInstanceOf[js.Any], shift = shift.asInstanceOf[js.Any])
    __obj.asInstanceOf[CarouselOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CarouselOptions] (val x: Self) extends AnyVal {
    
    inline def setDist(value: Double): Self = StObject.set(x, "dist", value.asInstanceOf[js.Any])
    
    inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setFullWidth(value: Boolean): Self = StObject.set(x, "fullWidth", value.asInstanceOf[js.Any])
    
    inline def setIndicators(value: Boolean): Self = StObject.set(x, "indicators", value.asInstanceOf[js.Any])
    
    inline def setNoWrap(value: Boolean): Self = StObject.set(x, "noWrap", value.asInstanceOf[js.Any])
    
    inline def setNumVisible(value: Double): Self = StObject.set(x, "numVisible", value.asInstanceOf[js.Any])
    
    inline def setOnCycleTo(value: (Element, Boolean) => Unit): Self = StObject.set(x, "onCycleTo", js.Any.fromFunction2(value))
    
    inline def setPadding(value: Double): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
    
    inline def setShift(value: Double): Self = StObject.set(x, "shift", value.asInstanceOf[js.Any])
  }
}
