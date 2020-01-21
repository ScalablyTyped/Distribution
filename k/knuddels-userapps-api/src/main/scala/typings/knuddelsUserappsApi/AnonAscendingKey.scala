package typings.knuddelsUserappsApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAscendingKey extends js.Object {
  var ascending: js.UndefOr[Boolean] = js.undefined
  var maximumCount: js.UndefOr[Double] = js.undefined
  var maximumValue: js.UndefOr[Double] = js.undefined
  var minimumValue: js.UndefOr[Double] = js.undefined
  var onEnd: js.UndefOr[js.Function2[/* totalCount */ Double, /* key */ String, Unit]] = js.undefined
  var onStart: js.UndefOr[js.Function2[/* totalCount */ Double, /* key */ String, Unit]] = js.undefined
}

object AnonAscendingKey {
  @scala.inline
  def apply(
    ascending: js.UndefOr[Boolean] = js.undefined,
    maximumCount: Int | Double = null,
    maximumValue: Int | Double = null,
    minimumValue: Int | Double = null,
    onEnd: (/* totalCount */ Double, /* key */ String) => Unit = null,
    onStart: (/* totalCount */ Double, /* key */ String) => Unit = null
  ): AnonAscendingKey = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(ascending)) __obj.updateDynamic("ascending")(ascending.asInstanceOf[js.Any])
    if (maximumCount != null) __obj.updateDynamic("maximumCount")(maximumCount.asInstanceOf[js.Any])
    if (maximumValue != null) __obj.updateDynamic("maximumValue")(maximumValue.asInstanceOf[js.Any])
    if (minimumValue != null) __obj.updateDynamic("minimumValue")(minimumValue.asInstanceOf[js.Any])
    if (onEnd != null) __obj.updateDynamic("onEnd")(js.Any.fromFunction2(onEnd))
    if (onStart != null) __obj.updateDynamic("onStart")(js.Any.fromFunction2(onStart))
    __obj.asInstanceOf[AnonAscendingKey]
  }
}

