package typings.knuddelsUserappsApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AscendingMinimumValue extends js.Object {
  var ascending: js.UndefOr[Boolean] = js.undefined
  var minimumValue: js.UndefOr[Double] = js.undefined
}

object AscendingMinimumValue {
  @scala.inline
  def apply(ascending: js.UndefOr[Boolean] = js.undefined, minimumValue: js.UndefOr[Double] = js.undefined): AscendingMinimumValue = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(ascending)) __obj.updateDynamic("ascending")(ascending.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minimumValue)) __obj.updateDynamic("minimumValue")(minimumValue.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[AscendingMinimumValue]
  }
}

