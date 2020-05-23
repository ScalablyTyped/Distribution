package typings.mapnik.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Layer extends js.Object {
  var layer: js.UndefOr[String] = js.undefined
  var tolerance: js.UndefOr[Double] = js.undefined
}

object Layer {
  @scala.inline
  def apply(layer: String = null, tolerance: js.UndefOr[Double] = js.undefined): Layer = {
    val __obj = js.Dynamic.literal()
    if (layer != null) __obj.updateDynamic("layer")(layer.asInstanceOf[js.Any])
    if (!js.isUndefined(tolerance)) __obj.updateDynamic("tolerance")(tolerance.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Layer]
  }
}

