package typings.lazyDashBrush.lazyDashBrushMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var enabled: js.UndefOr[Boolean] = js.undefined
  var initialPoint: js.UndefOr[Coordinates] = js.undefined
  var radius: js.UndefOr[Double] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    enabled: js.UndefOr[Boolean] = js.undefined,
    initialPoint: Coordinates = null,
    radius: Int | Double = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.asInstanceOf[js.Any])
    if (initialPoint != null) __obj.updateDynamic("initialPoint")(initialPoint.asInstanceOf[js.Any])
    if (radius != null) __obj.updateDynamic("radius")(radius.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

