package typings.mathjax.MathJax

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NativeMMLOutputProcessor extends js.Object {
  /*This option indicates whether MathJax should try to adjust the x-height of equations to match the x-height of
    * the surrounding text. See the MatchWebFonts options for finer control, especially if you are using Web fonts.
    */
  var matchFontHeight: js.UndefOr[Boolean] = js.undefined
  /*This gives a minimum scale (as a percent) for the scaling used by MathJax to match the equation to the
    * surrounding text. This will prevent MathJax from making the mathematics too small.
    */
  var minScaleAdjust: js.UndefOr[Double] = js.undefined
  /*The scaling factor (as a percentage) of math with respect to the surrounding text. The NativeMML output
    * processor tries to match the ex-size of the mathematics with that of the text where it is placed, but you may
    * want to adjust the results using this scaling factor. The user can also adjust this value using the contextual
    * menu item associated with the typeset mathematics.
    */
  var scale: js.UndefOr[Double] = js.undefined
  /*This is a list of CSS declarations for styling the NativeMML output. See the definitions in
    * jax/output/NativeMML/config.js for some examples of what are defined by default. See CSS Style Objects for
    * details on how to specify CSS style in a JavaScript object.
    */
  var styles: js.UndefOr[js.Any] = js.undefined
}

object NativeMMLOutputProcessor {
  @scala.inline
  def apply(
    matchFontHeight: js.UndefOr[Boolean] = js.undefined,
    minScaleAdjust: Int | Double = null,
    scale: Int | Double = null,
    styles: js.Any = null
  ): NativeMMLOutputProcessor = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(matchFontHeight)) __obj.updateDynamic("matchFontHeight")(matchFontHeight)
    if (minScaleAdjust != null) __obj.updateDynamic("minScaleAdjust")(minScaleAdjust.asInstanceOf[js.Any])
    if (scale != null) __obj.updateDynamic("scale")(scale.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles)
    __obj.asInstanceOf[NativeMMLOutputProcessor]
  }
}

