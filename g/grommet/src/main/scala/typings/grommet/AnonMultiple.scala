package typings.grommet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonMultiple extends js.Object {
  var multiple: js.UndefOr[String] = js.undefined
}

object AnonMultiple {
  @scala.inline
  def apply(multiple: String = null): AnonMultiple = {
    val __obj = js.Dynamic.literal()
    if (multiple != null) __obj.updateDynamic("multiple")(multiple.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonMultiple]
  }
}

