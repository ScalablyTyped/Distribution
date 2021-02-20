package typings.mathjax.MathJax

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NativeMMLOutputProcessor extends StObject {
  
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
  implicit class NativeMMLOutputProcessorMutableBuilder[Self <: NativeMMLOutputProcessor] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMatchFontHeight(value: Boolean): Self = StObject.set(x, "matchFontHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMatchFontHeightUndefined: Self = StObject.set(x, "matchFontHeight", js.undefined)
    
    @scala.inline
    def setMinScaleAdjust(value: Double): Self = StObject.set(x, "minScaleAdjust", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinScaleAdjustUndefined: Self = StObject.set(x, "minScaleAdjust", js.undefined)
    
    @scala.inline
    def setScale(value: Double): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScaleUndefined: Self = StObject.set(x, "scale", js.undefined)
    
    @scala.inline
    def setStyles(value: js.Any): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
  }
}
