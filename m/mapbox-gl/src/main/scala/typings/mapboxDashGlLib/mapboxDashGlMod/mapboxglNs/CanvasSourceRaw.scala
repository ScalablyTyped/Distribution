package typings
package mapboxDashGlLib.mapboxDashGlMod.mapboxglNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CanvasSourceRaw
  extends Source
     with CanvasSourceOptions
     with AnySourceData {
  @JSName("type")
  var type_CanvasSourceRaw: mapboxDashGlLib.mapboxDashGlLibStrings.canvas
}

object CanvasSourceRaw {
  @scala.inline
  def apply(
    canvas: java.lang.String | stdLib.HTMLCanvasElement,
    coordinates: js.Array[js.Array[scala.Double]],
    `type`: mapboxDashGlLib.mapboxDashGlLibStrings.canvas,
    animate: js.UndefOr[scala.Boolean] = js.undefined
  ): CanvasSourceRaw = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("canvas")(canvas.asInstanceOf[js.Any])
    __obj.updateDynamic("coordinates")(coordinates)
    if (!js.isUndefined(animate)) __obj.updateDynamic("animate")(animate)
    __obj.asInstanceOf[CanvasSourceRaw]
  }
}

