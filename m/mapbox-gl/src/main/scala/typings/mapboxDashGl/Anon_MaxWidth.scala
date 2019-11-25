package typings.mapboxDashGl

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_MaxWidth extends js.Object {
  var maxWidth: js.UndefOr[Double] = js.undefined
  var unit: js.UndefOr[String] = js.undefined
}

object Anon_MaxWidth {
  @scala.inline
  def apply(maxWidth: Int | Double = null, unit: String = null): Anon_MaxWidth = {
    val __obj = js.Dynamic.literal()
    if (maxWidth != null) __obj.updateDynamic("maxWidth")(maxWidth.asInstanceOf[js.Any])
    if (unit != null) __obj.updateDynamic("unit")(unit.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_MaxWidth]
  }
}

