package typings.materializeCss.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<materialize-css.M.ParallaxOptions> */
@js.native
trait PartialParallaxOptions extends js.Object {
  var responsiveThreshold: js.UndefOr[Double] = js.native
}

object PartialParallaxOptions {
  @scala.inline
  def apply(): PartialParallaxOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialParallaxOptions]
  }
  @scala.inline
  implicit class PartialParallaxOptionsOps[Self <: PartialParallaxOptions] (val x: Self) extends AnyVal {
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
    @scala.inline
    def deleteResponsiveThreshold: Self = this.set("responsiveThreshold", js.undefined)
  }
  
}

