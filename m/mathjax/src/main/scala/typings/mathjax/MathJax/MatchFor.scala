package typings.mathjax.MathJax

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MatchFor extends js.Object {
  /*Whether to match the font size for the HTML-CSS output.*/
  var `HTML-CSS`: js.UndefOr[Boolean] = js.undefined
  /*Whether to match the font size for the NativeMML output.*/
  var NativeMML: js.UndefOr[Boolean] = js.undefined
  /*Whether to match the font size for the SVG output.*/
  var SVG: js.UndefOr[Boolean] = js.undefined
}

object MatchFor {
  @scala.inline
  def apply(
    `HTML-CSS`: js.UndefOr[Boolean] = js.undefined,
    NativeMML: js.UndefOr[Boolean] = js.undefined,
    SVG: js.UndefOr[Boolean] = js.undefined
  ): MatchFor = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(`HTML-CSS`)) __obj.updateDynamic("HTML-CSS")(`HTML-CSS`.get.asInstanceOf[js.Any])
    if (!js.isUndefined(NativeMML)) __obj.updateDynamic("NativeMML")(NativeMML.get.asInstanceOf[js.Any])
    if (!js.isUndefined(SVG)) __obj.updateDynamic("SVG")(SVG.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[MatchFor]
  }
}

