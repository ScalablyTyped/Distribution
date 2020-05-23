package typings.knuddelsUserappsApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MaximumValue extends js.Object {
  var maximumValue: js.UndefOr[Double] = js.undefined
  var minimumValue: js.UndefOr[Double] = js.undefined
}

object MaximumValue {
  @scala.inline
  def apply(maximumValue: js.UndefOr[Double] = js.undefined, minimumValue: js.UndefOr[Double] = js.undefined): MaximumValue = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(maximumValue)) __obj.updateDynamic("maximumValue")(maximumValue.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minimumValue)) __obj.updateDynamic("minimumValue")(minimumValue.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[MaximumValue]
  }
}

