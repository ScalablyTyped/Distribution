package typings.iotaLibJs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait End extends js.Object {
  var end: js.UndefOr[Double] = js.undefined
  var security: js.UndefOr[typings.iotaLibJs.mod.Security] = js.undefined
  var start: js.UndefOr[Double] = js.undefined
  var threshold: js.UndefOr[Boolean] = js.undefined
}

object End {
  @scala.inline
  def apply(
    end: js.UndefOr[Double] = js.undefined,
    security: typings.iotaLibJs.mod.Security = null,
    start: js.UndefOr[Double] = js.undefined,
    threshold: js.UndefOr[Boolean] = js.undefined
  ): End = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(end)) __obj.updateDynamic("end")(end.get.asInstanceOf[js.Any])
    if (security != null) __obj.updateDynamic("security")(security.asInstanceOf[js.Any])
    if (!js.isUndefined(start)) __obj.updateDynamic("start")(start.get.asInstanceOf[js.Any])
    if (!js.isUndefined(threshold)) __obj.updateDynamic("threshold")(threshold.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[End]
  }
}

