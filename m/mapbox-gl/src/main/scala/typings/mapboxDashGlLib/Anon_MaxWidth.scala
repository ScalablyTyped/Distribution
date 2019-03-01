package typings
package mapboxDashGlLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_MaxWidth extends js.Object {
  var maxWidth: js.UndefOr[scala.Double] = js.undefined
  var unit: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_MaxWidth {
  @scala.inline
  def apply(maxWidth: scala.Int | scala.Double = null, unit: java.lang.String = null): Anon_MaxWidth = {
    val __obj = js.Dynamic.literal()
    if (maxWidth != null) __obj.updateDynamic("maxWidth")(maxWidth.asInstanceOf[js.Any])
    if (unit != null) __obj.updateDynamic("unit")(unit)
    __obj.asInstanceOf[Anon_MaxWidth]
  }
}

