package typings
package materializeDashCssLib.MNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParallaxOptions extends js.Object {
  /**
    * The minimum width of the screen, in pixels, where the parallax functionality starts working
    * @default 0
    */
  var responsiveThreshold: scala.Double
}

object ParallaxOptions {
  @scala.inline
  def apply(responsiveThreshold: scala.Double): ParallaxOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("responsiveThreshold")(responsiveThreshold)
    __obj.asInstanceOf[ParallaxOptions]
  }
}

