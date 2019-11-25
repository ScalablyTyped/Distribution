package typings.materializeDashCss.M

import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Options for the Tabs
  */
trait TabsOptions extends js.Object {
  /**
    * Transition duration in milliseconds.
    * @default 300
    */
  var duration: Double
  /**
    * The maximum width of the screen, in pixels, where the swipeable functionality initializes.
    * @default infinity
    */
  var responsiveThreshold: Double
  /**
    * Set to true to enable swipeable tabs. This also uses the responsiveThreshold option
    * @default false
    */
  var swipeable: Boolean
  /**
    * Callback for when a new tab content is shown
    */
  def onShow(`this`: Tabs, newContent: Element): Unit
}

object TabsOptions {
  @scala.inline
  def apply(duration: Double, onShow: (Tabs, Element) => Unit, responsiveThreshold: Double, swipeable: Boolean): TabsOptions = {
    val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any], onShow = js.Any.fromFunction2(onShow), responsiveThreshold = responsiveThreshold.asInstanceOf[js.Any], swipeable = swipeable.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TabsOptions]
  }
}

