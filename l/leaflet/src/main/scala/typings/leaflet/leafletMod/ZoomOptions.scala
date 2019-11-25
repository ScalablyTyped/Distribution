package typings.leaflet.leafletMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ZoomOptions extends js.Object {
  var animate: js.UndefOr[Boolean] = js.undefined
}

object ZoomOptions {
  @scala.inline
  def apply(animate: js.UndefOr[Boolean] = js.undefined): ZoomOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(animate)) __obj.updateDynamic("animate")(animate.asInstanceOf[js.Any])
    __obj.asInstanceOf[ZoomOptions]
  }
}

