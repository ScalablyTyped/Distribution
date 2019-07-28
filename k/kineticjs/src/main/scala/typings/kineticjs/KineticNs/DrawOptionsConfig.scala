package typings.kineticjs.KineticNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DrawOptionsConfig extends js.Object {
  var fill: js.UndefOr[String] = js.undefined
  var lineJoin: js.UndefOr[String] = js.undefined
  var shadow: js.UndefOr[js.Any] = js.undefined
  var stroke: js.UndefOr[String] = js.undefined
  var strokeWidth: js.UndefOr[Double] = js.undefined
}

object DrawOptionsConfig {
  @scala.inline
  def apply(
    fill: String = null,
    lineJoin: String = null,
    shadow: js.Any = null,
    stroke: String = null,
    strokeWidth: Int | Double = null
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

