package typings.mathjax.MathJax

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NativeMMLOutputProcessor extends js.Object {
  /*This option indicates whether MathJax should try to adjust the x-height of equations to match the x-height of
    * the surrounding text. See the MatchWebFonts options for finer control, especially if you are using Web fonts.
    */
  var matchFontHeight: js.UndefOr[Boolean] = js.native
  /*This gives a minimum scale (as a percent) for the scaling used by MathJax to match the equation to the
    * surrounding text. This will prevent MathJax from making the mathematics too small.
    */
  var minScaleAdjust: js.UndefOr[Double] = js.native
  /*The scaling factor (as a percentage) of math with respect to the surrounding text. The NativeMML output
    * processor tries to match the ex-size of the mathematics with that of the text where it is placed, but you may
    * want to adjust the results using this scaling factor. The user can also adjust this value using the contextual
    * menu item associated with the typeset mathematics.
    */
  var scale: js.UndefOr[Double] = js.native
  /*This is a list of CSS declarations for styling the NativeMML output. See the definitions in
    * jax/output/NativeMML/config.js for some examples of what are defined by default. See CSS Style Objects for
    * details on how to specify CSS style in a JavaScript object.
    */
  var styles: js.UndefOr[js.Any] = js.native
}

object NativeMMLOutputProcessor {
  @scala.inline
  def apply(): NativeMMLOutputProcessor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NativeMMLOutputProcessor]
  }
  @scala.inline
  implicit class NativeMMLOutputProcessorOps[Self <: NativeMMLOutputProcessor] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setMatchFontHeight(value: Boolean): Self = this.set("matchFontHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMatchFontHeight: Self = this.set("matchFontHeight", js.undefined)
    @scala.inline
    def setMinScaleAdjust(value: Double): Self = this.set("minScaleAdjust", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinScaleAdjust: Self = this.set("minScaleAdjust", js.undefined)
    @scala.inline
    def setScale(value: Double): Self = this.set("scale", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScale: Self = this.set("scale", js.undefined)
    @scala.inline
    def setStyles(value: js.Any): Self = this.set("styles", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyles: Self = this.set("styles", js.undefined)
  }
  
}

