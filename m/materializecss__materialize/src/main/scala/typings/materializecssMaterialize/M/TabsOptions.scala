package typings.materializecssMaterialize.M

import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Options for the Tabs
  */
trait TabsOptions extends StObject {
  
  /**
    * Transition duration in milliseconds.
    * @default 300
    */
  var duration: Double
  
  /**
    * Callback for when a new tab content is shown.
    * @default null
    */
  def onShow(newContent: Element): Unit
  
  /**
    * The maximum width of the screen, in pixels,
    * where the swipeable functionality initializes.
    * @default infinity
    */
  var responsiveThreshold: Double
  
  /**
    * Set to true to enable swipeable tabs.
    * This also uses the responsiveThreshold option.
    * @default false
    */
  var swipeable: Boolean
}
object TabsOptions {
  
  inline def apply(duration: Double, onShow: Element => Unit, responsiveThreshold: Double, swipeable: Boolean): TabsOptions = {
    val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any], onShow = js.Any.fromFunction1(onShow), responsiveThreshold = responsiveThreshold.asInstanceOf[js.Any], swipeable = swipeable.asInstanceOf[js.Any])
    __obj.asInstanceOf[TabsOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TabsOptions] (val x: Self) extends AnyVal {
    
    inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setOnShow(value: Element => Unit): Self = StObject.set(x, "onShow", js.Any.fromFunction1(value))
    
    inline def setResponsiveThreshold(value: Double): Self = StObject.set(x, "responsiveThreshold", value.asInstanceOf[js.Any])
    
    inline def setSwipeable(value: Boolean): Self = StObject.set(x, "swipeable", value.asInstanceOf[js.Any])
  }
}
