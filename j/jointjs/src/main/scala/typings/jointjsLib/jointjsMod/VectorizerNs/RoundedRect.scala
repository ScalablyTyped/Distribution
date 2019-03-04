package typings
package jointjsLib.jointjsMod.VectorizerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RoundedRect
  extends jointjsLib.jointjsMod.gNs.PlainRect {
  var `bottom-rx`: js.UndefOr[scala.Double] = js.undefined
  var `bottom-ry`: js.UndefOr[scala.Double] = js.undefined
  var rx: js.UndefOr[scala.Double] = js.undefined
  var ry: js.UndefOr[scala.Double] = js.undefined
  var `top-rx`: js.UndefOr[scala.Double] = js.undefined
  var `top-ry`: js.UndefOr[scala.Double] = js.undefined
}

object RoundedRect {
  @scala.inline
  def apply(
    height: scala.Double,
    width: scala.Double,
    x: scala.Double,
    y: scala.Double,
    `bottom-rx`: scala.Int | scala.Double = null,
    `bottom-ry`: scala.Int | scala.Double = null,
    rx: scala.Int | scala.Double = null,
    ry: scala.Int | scala.Double = null,
    `top-rx`: scala.Int | scala.Double = null,
    `top-ry`: scala.Int | scala.Double = null
  ): RoundedRect = {
    val __obj = js.Dynamic.literal(height = height, width = width, x = x, y = y)
    if (`bottom-rx` != null) __obj.updateDynamic("bottom-rx")(`bottom-rx`.asInstanceOf[js.Any])
    if (`bottom-ry` != null) __obj.updateDynamic("bottom-ry")(`bottom-ry`.asInstanceOf[js.Any])
    if (rx != null) __obj.updateDynamic("rx")(rx.asInstanceOf[js.Any])
    if (ry != null) __obj.updateDynamic("ry")(ry.asInstanceOf[js.Any])
    if (`top-rx` != null) __obj.updateDynamic("top-rx")(`top-rx`.asInstanceOf[js.Any])
    if (`top-ry` != null) __obj.updateDynamic("top-ry")(`top-ry`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RoundedRect]
  }
}

