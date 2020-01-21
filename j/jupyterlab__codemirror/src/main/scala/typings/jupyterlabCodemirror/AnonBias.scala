package typings.jupyterlabCodemirror

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBias extends js.Object {
  var bias: js.UndefOr[Double] = js.undefined
  var origin: js.UndefOr[String] = js.undefined
  var scroll: js.UndefOr[Boolean] = js.undefined
}

object AnonBias {
  @scala.inline
  def apply(bias: Int | Double = null, origin: String = null, scroll: js.UndefOr[Boolean] = js.undefined): AnonBias = {
    val __obj = js.Dynamic.literal()
    if (bias != null) __obj.updateDynamic("bias")(bias.asInstanceOf[js.Any])
    if (origin != null) __obj.updateDynamic("origin")(origin.asInstanceOf[js.Any])
    if (!js.isUndefined(scroll)) __obj.updateDynamic("scroll")(scroll.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBias]
  }
}

