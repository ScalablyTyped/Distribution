package typings.leafletDraw

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonClickable extends js.Object {
  var clickable: js.UndefOr[Boolean] = js.undefined
}

object AnonClickable {
  @scala.inline
  def apply(clickable: js.UndefOr[Boolean] = js.undefined): AnonClickable = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(clickable)) __obj.updateDynamic("clickable")(clickable.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonClickable]
  }
}

