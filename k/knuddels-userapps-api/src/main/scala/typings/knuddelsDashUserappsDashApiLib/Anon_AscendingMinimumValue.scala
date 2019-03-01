package typings
package knuddelsDashUserappsDashApiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AscendingMinimumValue extends js.Object {
  var ascending: js.UndefOr[scala.Boolean] = js.undefined
  var minimumValue: js.UndefOr[scala.Double] = js.undefined
}

object Anon_AscendingMinimumValue {
  @scala.inline
  def apply(ascending: js.UndefOr[scala.Boolean] = js.undefined, minimumValue: scala.Int | scala.Double = null): Anon_AscendingMinimumValue = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(ascending)) __obj.updateDynamic("ascending")(ascending)
    if (minimumValue != null) __obj.updateDynamic("minimumValue")(minimumValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_AscendingMinimumValue]
  }
}

