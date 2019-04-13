package typings
package highchartsLib.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ButtonStatesTheme extends ButtonTheme {
  /**
    * Themed button states. Only hover is supported for reset zoom button.
    */
  var states: js.UndefOr[highchartsLib.Anon_Hover] = js.undefined
}

object ButtonStatesTheme {
  @scala.inline
  def apply(
    display: java.lang.String = null,
    fill: java.lang.String | Gradient = null,
    r: scala.Int | scala.Double = null,
    states: highchartsLib.Anon_Hover = null,
    stroke: java.lang.String = null,
    `stroke-width`: scala.Int | scala.Double = null,
    style: js.Object = null
  ): ButtonStatesTheme = {
    val __obj = js.Dynamic.literal()
    if (display != null) __obj.updateDynamic("display")(display)
    if (fill != null) __obj.updateDynamic("fill")(fill.asInstanceOf[js.Any])
    if (r != null) __obj.updateDynamic("r")(r.asInstanceOf[js.Any])
    if (states != null) __obj.updateDynamic("states")(states)
    if (stroke != null) __obj.updateDynamic("stroke")(stroke)
    if (`stroke-width` != null) __obj.updateDynamic("stroke-width")(`stroke-width`.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style)
    __obj.asInstanceOf[ButtonStatesTheme]
  }
}

