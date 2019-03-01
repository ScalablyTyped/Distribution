package typings
package mapboxDashGlLib.mapboxDashGlMod.mapboxglNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CanvasSource
  extends CanvasSourceRaw
     with AnySourceImpl {
  def getCanvas(): stdLib.HTMLCanvasElement
  def pause(): scala.Unit
  def play(): scala.Unit
  def setCoordinates(coordinates: js.Array[js.Array[scala.Double]]): this.type
}

object CanvasSource {
  @scala.inline
  def apply(
    canvas: java.lang.String | stdLib.HTMLCanvasElement,
    coordinates: js.Array[js.Array[scala.Double]],
    getCanvas: js.Function0[stdLib.HTMLCanvasElement],
    pause: js.Function0[scala.Unit],
    play: js.Function0[scala.Unit],
    setCoordinates: js.Function1[js.Array[js.Array[scala.Double]], CanvasSource],
    `type`: mapboxDashGlLib.mapboxDashGlLibStrings.canvas,
    animate: js.UndefOr[scala.Boolean] = js.undefined
  ): CanvasSource = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("canvas")(canvas.asInstanceOf[js.Any])
    __obj.updateDynamic("coordinates")(coordinates)
    __obj.updateDynamic("getCanvas")(getCanvas)
    __obj.updateDynamic("pause")(pause)
    __obj.updateDynamic("play")(play)
    __obj.updateDynamic("setCoordinates")(setCoordinates)
    if (!js.isUndefined(animate)) __obj.updateDynamic("animate")(animate)
    __obj.asInstanceOf[CanvasSource]
  }
}

