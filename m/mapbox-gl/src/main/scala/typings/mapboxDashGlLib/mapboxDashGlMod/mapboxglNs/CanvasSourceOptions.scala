package typings
package mapboxDashGlLib.mapboxDashGlMod.mapboxglNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CanvasSourceOptions extends js.Object {
  var animate: js.UndefOr[scala.Boolean] = js.undefined
  var canvas: java.lang.String | stdLib.HTMLCanvasElement
  var coordinates: js.Array[js.Array[scala.Double]]
}

object CanvasSourceOptions {
  @scala.inline
  def apply(
    canvas: java.lang.String | stdLib.HTMLCanvasElement,
    coordinates: js.Array[js.Array[scala.Double]],
    animate: js.UndefOr[scala.Boolean] = js.undefined
  ): CanvasSourceOptions = {
    val __obj = js.Dynamic.literal(canvas = canvas.asInstanceOf[js.Any], coordinates = coordinates)
    if (!js.isUndefined(animate)) __obj.updateDynamic("animate")(animate)
    __obj.asInstanceOf[CanvasSourceOptions]
  }
}

