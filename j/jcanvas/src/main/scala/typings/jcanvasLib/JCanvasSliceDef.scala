package typings
package jcanvasLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JCanvasSliceDef extends js.Object {
  /**
  	 * End angle in degrees from north
  	 */
  var end: scala.Double
  var fillStyle: java.lang.String
  var groups: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var layer: js.UndefOr[scala.Boolean] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Radius in pixels
  	 */
  var radius: scala.Double
  /**
  	 * Distance between slices as a fraction of the radius
  	 */
  var spread: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Start angle in degrees from north
  	 */
  var start: scala.Double
  var x: scala.Double
  var y: scala.Double
}

object JCanvasSliceDef {
  @scala.inline
  def apply(
    end: scala.Double,
    fillStyle: java.lang.String,
    radius: scala.Double,
    start: scala.Double,
    x: scala.Double,
    y: scala.Double,
    groups: js.Array[java.lang.String] = null,
    layer: js.UndefOr[scala.Boolean] = js.undefined,
    name: java.lang.String = null,
    spread: scala.Int | scala.Double = null
  ): JCanvasSliceDef = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("end")(end)
    __obj.updateDynamic("fillStyle")(fillStyle)
    __obj.updateDynamic("radius")(radius)
    __obj.updateDynamic("start")(start)
    __obj.updateDynamic("x")(x)
    __obj.updateDynamic("y")(y)
    if (groups != null) __obj.updateDynamic("groups")(groups)
    if (!js.isUndefined(layer)) __obj.updateDynamic("layer")(layer)
    if (name != null) __obj.updateDynamic("name")(name)
    if (spread != null) __obj.updateDynamic("spread")(spread.asInstanceOf[js.Any])
    __obj.asInstanceOf[JCanvasSliceDef]
  }
}

