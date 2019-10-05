package typings.kendoDashUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WindowPosition extends js.Object {
  var left: js.UndefOr[Double | String] = js.undefined
  var top: js.UndefOr[Double | String] = js.undefined
}

object WindowPosition {
  @scala.inline
  def apply(left: Double | String = null, top: Double | String = null): WindowPosition = {
    val __obj = js.Dynamic.literal()
    if (left != null) __obj.updateDynamic("left")(left.asInstanceOf[js.Any])
    if (top != null) __obj.updateDynamic("top")(top.asInstanceOf[js.Any])
    __obj.asInstanceOf[WindowPosition]
  }
}

