package typings.materializeCss

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<materialize-css.M.ParallaxOptions> */
trait PartialParallaxOptions extends js.Object {
  var responsiveThreshold: js.UndefOr[Double] = js.undefined
}

object PartialParallaxOptions {
  @scala.inline
  def apply(responsiveThreshold: Int | Double = null): PartialParallaxOptions = {
    val __obj = js.Dynamic.literal()
    if (responsiveThreshold != null) __obj.updateDynamic("responsiveThreshold")(responsiveThreshold.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialParallaxOptions]
  }
}

