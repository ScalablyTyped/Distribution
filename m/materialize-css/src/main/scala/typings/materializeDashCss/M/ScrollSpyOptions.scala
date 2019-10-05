package typings.materializeDashCss.M

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScrollSpyOptions extends js.Object {
  /**
    * Class applied to active elements
    * @default 'active'
    */
  var activeClass: String
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
  /**
    * Used to find active element
    * @default id => 'a[href="#' + id + '"]'
    */
  def getActiveElement(id: String): String
}

object ScrollSpyOptions {
  @scala.inline
  def apply(activeClass: String, getActiveElement: String => String, scrollOffset: Double, throttle: Double): ScrollSpyOptions = {
    val __obj = js.Dynamic.literal(activeClass = activeClass, getActiveElement = js.Any.fromFunction1(getActiveElement), scrollOffset = scrollOffset, throttle = throttle)
  
    __obj.asInstanceOf[ScrollSpyOptions]
  }
}

