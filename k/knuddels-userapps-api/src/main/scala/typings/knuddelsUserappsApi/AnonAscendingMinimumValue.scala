package typings.knuddelsUserappsApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAscendingMinimumValue extends js.Object {
  var ascending: js.UndefOr[Boolean] = js.undefined
  var minimumValue: js.UndefOr[Double] = js.undefined
}

object AnonAscendingMinimumValue {
  @scala.inline
  def apply(ascending: js.UndefOr[Boolean] = js.undefined, minimumValue: Int | Double = null): AnonAscendingMinimumValue = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(ascending)) __obj.updateDynamic("ascending")(ascending.asInstanceOf[js.Any])
    if (minimumValue != null) __obj.updateDynamic("minimumValue")(minimumValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAscendingMinimumValue]
  }
}

