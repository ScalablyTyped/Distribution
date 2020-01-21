package typings.grommet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonValueNumber extends js.Object {
  var value: js.UndefOr[Double] = js.undefined
}

object AnonValueNumber {
  @scala.inline
  def apply(value: Int | Double = null): AnonValueNumber = {
    val __obj = js.Dynamic.literal()
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonValueNumber]
  }
}

