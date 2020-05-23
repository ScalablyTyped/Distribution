package typings.mapboxGl.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MaxWidth extends js.Object {
  var maxWidth: js.UndefOr[Double] = js.undefined
  var unit: js.UndefOr[String] = js.undefined
}

object MaxWidth {
  @scala.inline
  def apply(maxWidth: js.UndefOr[Double] = js.undefined, unit: String = null): MaxWidth = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(maxWidth)) __obj.updateDynamic("maxWidth")(maxWidth.get.asInstanceOf[js.Any])
    if (unit != null) __obj.updateDynamic("unit")(unit.asInstanceOf[js.Any])
    __obj.asInstanceOf[MaxWidth]
  }
}

