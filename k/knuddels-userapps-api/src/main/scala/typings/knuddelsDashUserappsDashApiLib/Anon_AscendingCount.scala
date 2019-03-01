package typings
package knuddelsDashUserappsDashApiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AscendingCount extends js.Object {
  var ascending: js.UndefOr[scala.Boolean] = js.undefined
  var count: js.UndefOr[scala.Double] = js.undefined
  var maximumValue: js.UndefOr[scala.Double] = js.undefined
  var minimumValue: js.UndefOr[scala.Double] = js.undefined
  var page: js.UndefOr[scala.Double] = js.undefined
}

object Anon_AscendingCount {
  @scala.inline
  def apply(
    ascending: js.UndefOr[scala.Boolean] = js.undefined,
    count: scala.Int | scala.Double = null,
    maximumValue: scala.Int | scala.Double = null,
    minimumValue: scala.Int | scala.Double = null,
    page: scala.Int | scala.Double = null
  ): Anon_AscendingCount = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(ascending)) __obj.updateDynamic("ascending")(ascending)
    if (count != null) __obj.updateDynamic("count")(count.asInstanceOf[js.Any])
    if (maximumValue != null) __obj.updateDynamic("maximumValue")(maximumValue.asInstanceOf[js.Any])
    if (minimumValue != null) __obj.updateDynamic("minimumValue")(minimumValue.asInstanceOf[js.Any])
    if (page != null) __obj.updateDynamic("page")(page.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_AscendingCount]
  }
}

