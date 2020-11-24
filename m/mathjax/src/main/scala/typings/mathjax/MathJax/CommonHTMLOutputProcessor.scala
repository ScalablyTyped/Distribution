package typings.mathjax.MathJax

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CommonHTMLOutputProcessor extends js.Object {
  
  /*This is an object that configures automatic linebreaking in the CommonHTML output. In order to be backward
    * compatible with earlier versions of MathJax, only explicit line breaks are performed by default, so you must
    * enable line breaks if you want automatic ones.
    */
  var linebreaks: js.UndefOr[LineBreaks] = js.native
  
  /*This gives a minimum scale (as a percent) for the scaling used by MathJax to match the equation to the
    * surrounding text. This will prevent MathJax from making the mathematics too small.
    */
  var minScaleAdjust: js.UndefOr[Double] = js.native
  
  /*This setting controls whether <mtext> elements will be typeset using the math fonts or the font of the
    * surrounding text. When false, the font for mathvariant="normal" will be used; when true, the font will be
    * inherited from the surrounding paragraph.
    */
  var mtextFontInherit: js.UndefOr[Boolean] = js.native
  
  /*The scaling factor (as a percentage) of math with respect to the surrounding text. The CommonHTML output
    * processor tries to match the ex-size of the mathematics with that of the text where it is placed, but you may
    * want to adjust the results using this scaling factor. The user can also adjust this value using the contextual
    * menu item associated with the typeset mathematics.
    */
  var scale: js.UndefOr[Double] = js.native
}
object CommonHTMLOutputProcessor {
  
  @scala.inline
  def apply(): CommonHTMLOutputProcessor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CommonHTMLOutputProcessor]
  }
  
  @scala.inline
  implicit class CommonHTMLOutputProcessorOps[Self <: CommonHTMLOutputProcessor] (val x: Self) extends AnyVal {
    
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
    def setLinebreaks(value: LineBreaks): Self = this.set("linebreaks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLinebreaks: Self = this.set("linebreaks", js.undefined)
    
    @scala.inline
    def setMinScaleAdjust(value: Double): Self = this.set("minScaleAdjust", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinScaleAdjust: Self = this.set("minScaleAdjust", js.undefined)
    
    @scala.inline
    def setMtextFontInherit(value: Boolean): Self = this.set("mtextFontInherit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMtextFontInherit: Self = this.set("mtextFontInherit", js.undefined)
    
    @scala.inline
    def setScale(value: Double): Self = this.set("scale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScale: Self = this.set("scale", js.undefined)
  }
}
