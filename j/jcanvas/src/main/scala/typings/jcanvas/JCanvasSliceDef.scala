package typings.jcanvas

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JCanvasSliceDef extends js.Object {
  /**
  	 * End angle in degrees from north
  	 */
  var end: Double
  var fillStyle: String
  var groups: js.UndefOr[js.Array[String]] = js.undefined
  var layer: js.UndefOr[Boolean] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  /**
  	 * Radius in pixels
  	 */
  var radius: Double
  /**
  	 * Distance between slices as a fraction of the radius
  	 */
  var spread: js.UndefOr[Double] = js.undefined
  /**
  	 * Start angle in degrees from north
  	 */
  var start: Double
  var x: Double
  var y: Double
}

object JCanvasSliceDef {
  @scala.inline
  def apply(
    end: Double,
    fillStyle: String,
    radius: Double,
    start: Double,
    x: Double,
    y: Double,
    groups: js.Array[String] = null,
    layer: js.UndefOr[Boolean] = js.undefined,
    name: String = null,
    spread: Int | Double = null
  ): JCanvasSliceDef = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], fillStyle = fillStyle.asInstanceOf[js.Any], radius = radius.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    if (groups != null) __obj.updateDynamic("groups")(groups.asInstanceOf[js.Any])
    if (!js.isUndefined(layer)) __obj.updateDynamic("layer")(layer.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (spread != null) __obj.updateDynamic("spread")(spread.asInstanceOf[js.Any])
    __obj.asInstanceOf[JCanvasSliceDef]
  }
}

