package typings.mapboxDashGl.mapboxDashGlMod

import typings.std.HTMLCanvasElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CanvasSourceOptions extends js.Object {
  var animate: js.UndefOr[Boolean] = js.undefined
  var canvas: String | HTMLCanvasElement
  var coordinates: js.Array[js.Array[Double]]
}

object CanvasSourceOptions {
  @scala.inline
  def apply(
    canvas: String | HTMLCanvasElement,
    coordinates: js.Array[js.Array[Double]],
    animate: js.UndefOr[Boolean] = js.undefined
  ): CanvasSourceOptions = {
    val __obj = js.Dynamic.literal(canvas = canvas.asInstanceOf[js.Any], coordinates = coordinates.asInstanceOf[js.Any])
    if (!js.isUndefined(animate)) __obj.updateDynamic("animate")(animate.asInstanceOf[js.Any])
    __obj.asInstanceOf[CanvasSourceOptions]
  }
}

