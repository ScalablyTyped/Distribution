package typings.grommet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonColorValueAnonDark extends js.Object {
  var color: js.UndefOr[String | AnonDark] = js.undefined
  var value: Double
}

object AnonColorValueAnonDark {
  @scala.inline
  def apply(value: Double, color: String | AnonDark = null): AnonColorValueAnonDark = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonColorValueAnonDark]
  }
}

