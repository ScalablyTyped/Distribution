package typings.kendoUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WindowAnimationClose extends js.Object {
  var duration: js.UndefOr[Double] = js.undefined
  var effects: js.UndefOr[String] = js.undefined
  var reverse: js.UndefOr[Boolean] = js.undefined
}

object WindowAnimationClose {
  @scala.inline
  def apply(
    duration: js.UndefOr[Double] = js.undefined,
    effects: String = null,
    reverse: js.UndefOr[Boolean] = js.undefined
  ): WindowAnimationClose = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(duration)) __obj.updateDynamic("duration")(duration.get.asInstanceOf[js.Any])
    if (effects != null) __obj.updateDynamic("effects")(effects.asInstanceOf[js.Any])
    if (!js.isUndefined(reverse)) __obj.updateDynamic("reverse")(reverse.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[WindowAnimationClose]
  }
}

