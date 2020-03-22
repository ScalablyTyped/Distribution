package typings.grommet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonColorValue extends js.Object {
  var color: js.UndefOr[String | AnonLight] = js.undefined
  var value: Double
}

object AnonColorValue {
  @scala.inline
  def apply(value: Double, color: String | AnonLight = null): AnonColorValue = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonColorValue]
  }
}

