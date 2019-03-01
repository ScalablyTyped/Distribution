package typings
package mathjaxLib.MathJaxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MatchFor extends js.Object {
  /*Whether to match the font size for the HTML-CSS output.*/
  var `HTML-CSS`: js.UndefOr[scala.Boolean] = js.undefined
  /*Whether to match the font size for the NativeMML output.*/
  var NativeMML: js.UndefOr[scala.Boolean] = js.undefined
  /*Whether to match the font size for the SVG output.*/
  var SVG: js.UndefOr[scala.Boolean] = js.undefined
}

object MatchFor {
  @scala.inline
  def apply(
    `HTML-CSS`: js.UndefOr[scala.Boolean] = js.undefined,
    NativeMML: js.UndefOr[scala.Boolean] = js.undefined,
    SVG: js.UndefOr[scala.Boolean] = js.undefined
  ): MatchFor = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(`HTML-CSS`)) __obj.updateDynamic("HTML-CSS")(`HTML-CSS`)
    if (!js.isUndefined(NativeMML)) __obj.updateDynamic("NativeMML")(NativeMML)
    if (!js.isUndefined(SVG)) __obj.updateDynamic("SVG")(SVG)
    __obj.asInstanceOf[MatchFor]
  }
}

