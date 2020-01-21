package typings.leafletPancontrol.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MapOptions extends js.Object {
  var panControl: js.UndefOr[Boolean] = js.undefined
}

object MapOptions {
  @scala.inline
  def apply(panControl: js.UndefOr[Boolean] = js.undefined): MapOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(panControl)) __obj.updateDynamic("panControl")(panControl.asInstanceOf[js.Any])
    __obj.asInstanceOf[MapOptions]
  }
}

