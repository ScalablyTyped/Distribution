package typings.mapboxGl

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonMaxWidth extends js.Object {
  var maxWidth: js.UndefOr[Double] = js.undefined
  var unit: js.UndefOr[String] = js.undefined
}

object AnonMaxWidth {
  @scala.inline
  def apply(maxWidth: Int | Double = null, unit: String = null): AnonMaxWidth = {
    val __obj = js.Dynamic.literal()
    if (maxWidth != null) __obj.updateDynamic("maxWidth")(maxWidth.asInstanceOf[js.Any])
    if (unit != null) __obj.updateDynamic("unit")(unit.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonMaxWidth]
  }
}

