package typings.knuddelsUserappsApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MaximumCount extends js.Object {
  var ascending: js.UndefOr[Boolean] = js.undefined
  var maximumCount: js.UndefOr[Double] = js.undefined
  var maximumValue: js.UndefOr[Double] = js.undefined
  var minimumValue: js.UndefOr[Double] = js.undefined
  var onEnd: js.UndefOr[js.Function2[/* totalCount */ Double, /* key */ String, Unit]] = js.undefined
  var onStart: js.UndefOr[js.Function2[/* totalCount */ Double, /* key */ String, Unit]] = js.undefined
  var online: js.UndefOr[Boolean] = js.undefined
}

object MaximumCount {
  @scala.inline
  def apply(
    ascending: js.UndefOr[Boolean] = js.undefined,
    maximumCount: js.UndefOr[Double] = js.undefined,
    maximumValue: js.UndefOr[Double] = js.undefined,
    minimumValue: js.UndefOr[Double] = js.undefined,
    onEnd: (/* totalCount */ Double, /* key */ String) => Unit = null,
    onStart: (/* totalCount */ Double, /* key */ String) => Unit = null,
    online: js.UndefOr[Boolean] = js.undefined
  ): MaximumCount = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(ascending)) __obj.updateDynamic("ascending")(ascending.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maximumCount)) __obj.updateDynamic("maximumCount")(maximumCount.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maximumValue)) __obj.updateDynamic("maximumValue")(maximumValue.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minimumValue)) __obj.updateDynamic("minimumValue")(minimumValue.get.asInstanceOf[js.Any])
    if (onEnd != null) __obj.updateDynamic("onEnd")(js.Any.fromFunction2(onEnd))
    if (onStart != null) __obj.updateDynamic("onStart")(js.Any.fromFunction2(onStart))
    if (!js.isUndefined(online)) __obj.updateDynamic("online")(online.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[MaximumCount]
  }
}

