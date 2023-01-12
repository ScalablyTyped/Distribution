package typings.materializecssMaterialize.M

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScrollSpyOptions extends StObject {
  
  /**
    * Class applied to active elements
    * @default 'active'
    */
  var activeClass: String
  
  /**
    * Used to find active element
    * @default id => 'a[href="#' + id + '"]'
    */
  def getActiveElement(id: String): String
  
  /**
    * Offset for centering element when scrolled to
    * @default 200
    */
  var scrollOffset: Double
  
  /**
    * Throttle of scroll handler
    * @default 100
    */
  var throttle: Double
}
object ScrollSpyOptions {
  
  inline def apply(activeClass: String, getActiveElement: String => String, scrollOffset: Double, throttle: Double): ScrollSpyOptions = {
    val __obj = js.Dynamic.literal(activeClass = activeClass.asInstanceOf[js.Any], getActiveElement = js.Any.fromFunction1(getActiveElement), scrollOffset = scrollOffset.asInstanceOf[js.Any], throttle = throttle.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScrollSpyOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ScrollSpyOptions] (val x: Self) extends AnyVal {
    
    inline def setActiveClass(value: String): Self = StObject.set(x, "activeClass", value.asInstanceOf[js.Any])
    
    inline def setGetActiveElement(value: String => String): Self = StObject.set(x, "getActiveElement", js.Any.fromFunction1(value))
    
    inline def setScrollOffset(value: Double): Self = StObject.set(x, "scrollOffset", value.asInstanceOf[js.Any])
    
    inline def setThrottle(value: Double): Self = StObject.set(x, "throttle", value.asInstanceOf[js.Any])
  }
}
