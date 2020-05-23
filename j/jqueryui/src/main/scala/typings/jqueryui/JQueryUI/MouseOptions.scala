package typings.jqueryui.JQueryUI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// UI //////////////////////////////////////////////////
trait MouseOptions extends js.Object {
  var cancel: js.UndefOr[String] = js.undefined
  var delay: js.UndefOr[Double] = js.undefined
  var distance: js.UndefOr[Double] = js.undefined
}

object MouseOptions {
  @scala.inline
  def apply(
    cancel: String = null,
    delay: js.UndefOr[Double] = js.undefined,
    distance: js.UndefOr[Double] = js.undefined
  ): MouseOptions = {
    val __obj = js.Dynamic.literal()
    if (cancel != null) __obj.updateDynamic("cancel")(cancel.asInstanceOf[js.Any])
    if (!js.isUndefined(delay)) __obj.updateDynamic("delay")(delay.get.asInstanceOf[js.Any])
    if (!js.isUndefined(distance)) __obj.updateDynamic("distance")(distance.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[MouseOptions]
  }
}

