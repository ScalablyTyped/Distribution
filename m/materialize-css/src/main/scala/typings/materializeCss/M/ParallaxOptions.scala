package typings.materializeCss.M

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParallaxOptions extends js.Object {
  /**
    * The minimum width of the screen, in pixels, where the parallax functionality starts working
    * @default 0
    */
  var responsiveThreshold: Double = js.native
}

object ParallaxOptions {
  @scala.inline
  def apply(responsiveThreshold: Double): ParallaxOptions = {
    val __obj = js.Dynamic.literal(responsiveThreshold = responsiveThreshold.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParallaxOptions]
  }
  @scala.inline
  implicit class ParallaxOptionsOps[Self <: ParallaxOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setResponsiveThreshold(value: Double): Self = this.set("responsiveThreshold", value.asInstanceOf[js.Any])
  }
  
}

