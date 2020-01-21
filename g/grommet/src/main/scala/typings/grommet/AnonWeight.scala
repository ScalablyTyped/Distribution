package typings.grommet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonWeight extends js.Object {
  var weight: js.UndefOr[String] = js.undefined
}

object AnonWeight {
  @scala.inline
  def apply(weight: String = null): AnonWeight = {
    val __obj = js.Dynamic.literal()
    if (weight != null) __obj.updateDynamic("weight")(weight.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonWeight]
  }
}

