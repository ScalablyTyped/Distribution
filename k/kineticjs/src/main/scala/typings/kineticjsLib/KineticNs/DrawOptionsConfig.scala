package typings
package kineticjsLib.KineticNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DrawOptionsConfig extends js.Object {
  var fill: js.UndefOr[java.lang.String] = js.undefined
  var lineJoin: js.UndefOr[java.lang.String] = js.undefined
  var shadow: js.UndefOr[js.Any] = js.undefined
  var stroke: js.UndefOr[java.lang.String] = js.undefined
  var strokeWidth: js.UndefOr[scala.Double] = js.undefined
}

object DrawOptionsConfig {
  @scala.inline
  def apply(
    fill: java.lang.String = null,
    lineJoin: java.lang.String = null,
    shadow: js.Any = null,
    stroke: java.lang.String = null,
    strokeWidth: scala.Int | scala.Double = null
  ): DrawOptionsConfig = {
    val __obj = js.Dynamic.literal()
    if (fill != null) __obj.updateDynamic("fill")(fill)
    if (lineJoin != null) __obj.updateDynamic("lineJoin")(lineJoin)
    if (shadow != null) __obj.updateDynamic("shadow")(shadow)
    if (stroke != null) __obj.updateDynamic("stroke")(stroke)
    if (strokeWidth != null) __obj.updateDynamic("strokeWidth")(strokeWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[DrawOptionsConfig]
  }
}

