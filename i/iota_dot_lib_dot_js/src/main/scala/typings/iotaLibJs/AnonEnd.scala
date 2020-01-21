package typings.iotaLibJs

import typings.iotaLibJs.mod.Security
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonEnd extends js.Object {
  var end: js.UndefOr[Double] = js.undefined
  var security: js.UndefOr[Security] = js.undefined
  var start: js.UndefOr[Double] = js.undefined
  var threshold: js.UndefOr[Boolean] = js.undefined
}

object AnonEnd {
  @scala.inline
  def apply(
    end: Int | Double = null,
    security: Security = null,
    start: Int | Double = null,
    threshold: js.UndefOr[Boolean] = js.undefined
  ): AnonEnd = {
    val __obj = js.Dynamic.literal()
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (security != null) __obj.updateDynamic("security")(security.asInstanceOf[js.Any])
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    if (!js.isUndefined(threshold)) __obj.updateDynamic("threshold")(threshold.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonEnd]
  }
}

