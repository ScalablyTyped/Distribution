package typings.mapnik

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Layer extends js.Object {
  var layer: js.UndefOr[String] = js.undefined
  var tolerance: js.UndefOr[Double] = js.undefined
}

object Anon_Layer {
  @scala.inline
  def apply(layer: String = null, tolerance: Int | Double = null): Anon_Layer = {
    val __obj = js.Dynamic.literal()
    if (layer != null) __obj.updateDynamic("layer")(layer.asInstanceOf[js.Any])
    if (tolerance != null) __obj.updateDynamic("tolerance")(tolerance.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Layer]
  }
}

