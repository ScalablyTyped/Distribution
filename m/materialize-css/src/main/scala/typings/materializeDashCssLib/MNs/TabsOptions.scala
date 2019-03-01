package typings
package materializeDashCssLib.MNs

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
  var duration: scala.Double
  /**
    * The maximum width of the screen, in pixels, where the swipeable functionality initializes.
    * @default infinity
    */
  var responsiveThreshold: scala.Double
  /**
    * Set to true to enable swipeable tabs. This also uses the responsiveThreshold option
    * @default false
    */
  var swipeable: scala.Boolean
  /**
    * Callback for when a new tab content is shown
    */
  def onShow(`this`: Tabs, newContent: stdLib.Element): scala.Unit
}

object TabsOptions {
  @scala.inline
  def apply(
    duration: scala.Double,
    onShow: js.Function2[Tabs, stdLib.Element, scala.Unit],
    responsiveThreshold: scala.Double,
    swipeable: scala.Boolean
  ): TabsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("duration")(duration)
    __obj.updateDynamic("onShow")(onShow)
    __obj.updateDynamic("responsiveThreshold")(responsiveThreshold)
    __obj.updateDynamic("swipeable")(swipeable)
    __obj.asInstanceOf[TabsOptions]
  }
}

