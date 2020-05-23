package typings.materializeCss.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<materialize-css.M.ParallaxOptions> */
trait PartialParallaxOptions extends js.Object {
  var responsiveThreshold: js.UndefOr[Double] = js.undefined
}

object PartialParallaxOptions {
  @scala.inline
  def apply(responsiveThreshold: js.UndefOr[Double] = js.undefined): PartialParallaxOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(responsiveThreshold)) __obj.updateDynamic("responsiveThreshold")(responsiveThreshold.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialParallaxOptions]
  }
}

