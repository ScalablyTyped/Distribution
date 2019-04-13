package typings
package highchartsLib.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ButtonTheme extends js.Object {
  var display: js.UndefOr[java.lang.String] = js.undefined
   // css attr eg: 'none'
  /**
    * The button fill color, SVG color definition
    */
  var fill: js.UndefOr[java.lang.String | Gradient] = js.undefined
  /**
    * The border radius
    */
  var r: js.UndefOr[scala.Double] = js.undefined
  /**
    * The button stroke color, SVG color definition
    */
  var stroke: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The button stroke width
    */
  var `stroke-width`: js.UndefOr[scala.Double] = js.undefined
  /**
    * CSS style
    */
  var style: js.UndefOr[js.Object] = js.undefined
}

object ButtonTheme {
  @scala.inline
  def apply(
    display: java.lang.String = null,
    fill: java.lang.String | Gradient = null,
    r: scala.Int | scala.Double = null,
    stroke: java.lang.String = null,
    `stroke-width`: scala.Int | scala.Double = null,
    style: js.Object = null
  ): ButtonTheme = {
    val __obj = js.Dynamic.literal()
    if (display != null) __obj.updateDynamic("display")(display)
    if (fill != null) __obj.updateDynamic("fill")(fill.asInstanceOf[js.Any])
    if (r != null) __obj.updateDynamic("r")(r.asInstanceOf[js.Any])
    if (stroke != null) __obj.updateDynamic("stroke")(stroke)
    if (`stroke-width` != null) __obj.updateDynamic("stroke-width")(`stroke-width`.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style)
    __obj.asInstanceOf[ButtonTheme]
  }
}

