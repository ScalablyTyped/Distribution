package typings.knuddelsUserappsApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCount extends js.Object {
  var ascending: js.UndefOr[Boolean] = js.undefined
  var count: js.UndefOr[Double] = js.undefined
  var maximumValue: js.UndefOr[Double] = js.undefined
  var minimumValue: js.UndefOr[Double] = js.undefined
  var page: js.UndefOr[Double] = js.undefined
}

object AnonCount {
  @scala.inline
  def apply(
    ascending: js.UndefOr[Boolean] = js.undefined,
    count: Int | Double = null,
    maximumValue: Int | Double = null,
    minimumValue: Int | Double = null,
    page: Int | Double = null
  ): AnonCount = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(ascending)) __obj.updateDynamic("ascending")(ascending.asInstanceOf[js.Any])
    if (count != null) __obj.updateDynamic("count")(count.asInstanceOf[js.Any])
    if (maximumValue != null) __obj.updateDynamic("maximumValue")(maximumValue.asInstanceOf[js.Any])
    if (minimumValue != null) __obj.updateDynamic("minimumValue")(minimumValue.asInstanceOf[js.Any])
    if (page != null) __obj.updateDynamic("page")(page.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCount]
  }
}

