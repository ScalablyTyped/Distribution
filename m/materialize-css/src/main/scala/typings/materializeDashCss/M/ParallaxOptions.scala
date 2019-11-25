package typings.materializeDashCss.M

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParallaxOptions extends js.Object {
  /**
    * The minimum width of the screen, in pixels, where the parallax functionality starts working
    * @default 0
    */
  var responsiveThreshold: Double
}

object ParallaxOptions {
  @scala.inline
  def apply(responsiveThreshold: Double): ParallaxOptions = {
    val __obj = js.Dynamic.literal(responsiveThreshold = responsiveThreshold.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ParallaxOptions]
  }
}

