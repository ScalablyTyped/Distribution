package typings.grommet.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColorValue extends js.Object {
  var color: js.UndefOr[String | Dark] = js.undefined
  var value: Double
}

object ColorValue {
  @scala.inline
  def apply(value: Double, color: String | Dark = null): ColorValue = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColorValue]
  }
}

