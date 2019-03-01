package typings
package highchartsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ControlledAxis extends js.Object {
  var controlledAxis: js.UndefOr[Anon_Next] = js.undefined
  var cursor: js.UndefOr[java.lang.String] = js.undefined
  var enabled: js.UndefOr[scala.Boolean] = js.undefined
  var lineColor: js.UndefOr[java.lang.String] = js.undefined
  var lineDashStyle: js.UndefOr[java.lang.String] = js.undefined
  var lineWidth: js.UndefOr[scala.Double] = js.undefined
  var x: js.UndefOr[scala.Double] = js.undefined
  var y: js.UndefOr[scala.Double] = js.undefined
}

object Anon_ControlledAxis {
  @scala.inline
  def apply(
    controlledAxis: Anon_Next = null,
    cursor: java.lang.String = null,
    enabled: js.UndefOr[scala.Boolean] = js.undefined,
    lineColor: java.lang.String = null,
    lineDashStyle: java.lang.String = null,
    lineWidth: scala.Int | scala.Double = null,
    x: scala.Int | scala.Double = null,
    y: scala.Int | scala.Double = null
  ): Anon_ControlledAxis = {
    val __obj = js.Dynamic.literal()
    if (controlledAxis != null) __obj.updateDynamic("controlledAxis")(controlledAxis)
    if (cursor != null) __obj.updateDynamic("cursor")(cursor)
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled)
    if (lineColor != null) __obj.updateDynamic("lineColor")(lineColor)
    if (lineDashStyle != null) __obj.updateDynamic("lineDashStyle")(lineDashStyle)
    if (lineWidth != null) __obj.updateDynamic("lineWidth")(lineWidth.asInstanceOf[js.Any])
    if (x != null) __obj.updateDynamic("x")(x.asInstanceOf[js.Any])
    if (y != null) __obj.updateDynamic("y")(y.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ControlledAxis]
  }
}

