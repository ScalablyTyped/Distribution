package typings.knuddelsDashUserappsDashApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AscendingMinimumValue extends js.Object {
  var ascending: js.UndefOr[Boolean] = js.undefined
  var minimumValue: js.UndefOr[Double] = js.undefined
}

object Anon_AscendingMinimumValue {
  @scala.inline
  def apply(ascending: js.UndefOr[Boolean] = js.undefined, minimumValue: Int | Double = null): Anon_AscendingMinimumValue = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(ascending)) __obj.updateDynamic("ascending")(ascending.asInstanceOf[js.Any])
    if (minimumValue != null) __obj.updateDynamic("minimumValue")(minimumValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_AscendingMinimumValue]
  }
}

