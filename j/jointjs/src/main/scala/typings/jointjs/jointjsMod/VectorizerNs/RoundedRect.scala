package typings.jointjs.jointjsMod.VectorizerNs

import typings.jointjs.jointjsMod.gNs.PlainRect
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RoundedRect extends PlainRect {
  var `bottom-rx`: js.UndefOr[Double] = js.undefined
  var `bottom-ry`: js.UndefOr[Double] = js.undefined
  var rx: js.UndefOr[Double] = js.undefined
  var ry: js.UndefOr[Double] = js.undefined
  var `top-rx`: js.UndefOr[Double] = js.undefined
  var `top-ry`: js.UndefOr[Double] = js.undefined
}

object RoundedRect {
  @scala.inline
  def apply(
    height: Double,
    width: Double,
    x: Double,
    y: Double,
    `bottom-rx`: Int | Double = null,
    `bottom-ry`: Int | Double = null,
    rx: Int | Double = null,
    ry: Int | Double = null,
    `top-rx`: Int | Double = null,
    `top-ry`: Int | Double = null
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

