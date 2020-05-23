package typings.leafletPolylinedecorator.mod.Symbol

import typings.leaflet.mod.PathOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DashOptions extends js.Object {
  var pathOptions: js.UndefOr[PathOptions] = js.undefined
  var pixelSize: js.UndefOr[Double] = js.undefined
}

object DashOptions {
  @scala.inline
  def apply(pathOptions: PathOptions = null, pixelSize: js.UndefOr[Double] = js.undefined): DashOptions = {
    val __obj = js.Dynamic.literal()
    if (pathOptions != null) __obj.updateDynamic("pathOptions")(pathOptions.asInstanceOf[js.Any])
    if (!js.isUndefined(pixelSize)) __obj.updateDynamic("pixelSize")(pixelSize.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[DashOptions]
  }
}

