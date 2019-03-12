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
    getCanvas: () => stdLib.HTMLCanvasElement,
    pause: () => scala.Unit,
    play: () => scala.Unit,
    setCoordinates: js.Array[js.Array[scala.Double]] => CanvasSource,
    `type`: mapboxDashGlLib.mapboxDashGlLibStrings.canvas,
    animate: js.UndefOr[scala.Boolean] = js.undefined
  ): CanvasSource = {
    val __obj = js.Dynamic.literal(canvas = canvas.asInstanceOf[js.Any], coordinates = coordinates, getCanvas = js.Any.fromFunction0(getCanvas), pause = js.Any.fromFunction0(pause), play = js.Any.fromFunction0(play), setCoordinates = js.Any.fromFunction1(setCoordinates))
    __obj.updateDynamic("type")(`type`)
    if (!js.isUndefined(animate)) __obj.updateDynamic("animate")(animate)
    __obj.asInstanceOf[CanvasSource]
  }
}

