package typings.mathjax.MathJax

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SVGOutputProcessor extends js.Object {
  
  /*EqnChunk is the number of equations that will be typeset before they appear on screen. Larger values make for
    * less visual flicker as the equations are drawn, but also mean longer delays before the reader sees anything.
    */
  var EqnChunk: js.UndefOr[Double] = js.native
  
  /*EqChunkDelay is the time (in milliseconds) to delay between chunks (to allow the browser to respond to other
    * user interaction).
    * Set EqnChunk to 1, EqnChunkFactor to 1, and EqnChunkDelay to 10 to get the behavior from MathJax v1.1 and
    * below.
    */
  var EqnChunkDelay: js.UndefOr[Double] = js.native
  
  /*EqChunkFactor is the factor by which the EqnChunk will grow after each chunk is displayed.*/
  var EqnChunkFactor: js.UndefOr[Double] = js.native
  
  /*This controls whether the MathML structure is retained and CSS classes are added to mark the original MathML
    * elements (as in the output from the HTML-CSS output jax). By default, the SVG output jax removes unneeded
    * nesting in order to produce a more efficient markup, but if you want to use CSS to style the elements as if
    * they were MathML, you might need to set this to true.
    */
  var addMMLclasses: js.UndefOr[Boolean] = js.native
  
  /*This is the stroke width to use for all character paths (1em = 1000 units). This is a cheap way of getting
    * slightly lighter or darker characters, but remember that not all displays will act the same, so a value that
    * is good for you may not be good for everyone.
    */
  var blacker: js.UndefOr[Double] = js.native
  
  /*This is the font to use for rendering the mathematics. The possible values are TeX, STIX-Web, Asana-Math,
    * Neo-Euler, Gyre-Pagella, Gyre-Termes and Latin-Modern. Note that not all mathematical characters are available
    * in all fonts (e.g., Neo-Euler does not include italic characters), so some mathematics may work better in some
    * fonts than in others. The STIX-Web font is the most complete.
    */
  var font: js.UndefOr[String] = js.native
  
  /*This is an object that configures automatic linebreaking in the SVG output. In order to be backward compatible
    * with earlier versions of MathJax, only explicit line breaks are performed by default, so you must enable line
    * breaks if you want automatic ones.
    */
  var linebreaks: js.UndefOr[LineBreaks] = js.native
  
  /*This option indicates whether MathJax should try to adjust the x-height of equations to match the x-height of
    * the surrounding text. See the MatchWebFonts options for finer control, especially if you are using Web fonts.
    */
  var matchFontHeight: js.UndefOr[Boolean] = js.native
  
  /*This gives a minimum scale (as a percent) for the scaling used by MathJax to match the equation to the
    * surrounding text. This will prevent MathJax from making the mathematics too small.
    */
  var minScaleAdjust: js.UndefOr[Double] = js.native
  
  /*This setting controls whether <mtext> elements will be typeset using the math fonts or the font of the
    * surrounding text. When false, the font for mathvariant="normal" will be used; when true, the font will be
    * inherited from the surrounding paragraph.
    */
  var mtextFontInherit: js.UndefOr[Boolean] = js.native
  
  /*The scaling factor (as a percentage) of math with respect to the surrounding text. The SVG output processor
    * tries to match the ex-size of the mathematics with that of the text where it is placed, but you may want to
    * adjust the results using this scaling factor. The user can also adjust this value using the contextual menu
    * item associated with the typeset mathematics.
    */
  var scale: js.UndefOr[Double] = js.native
  
  /*This is a list of CSS declarations for styling the SVG output. See the definitions in jax/output/SVG/config.js
    * for some examples of what are defined by default. See CSS Style Objects for details on how to specify CSS
    * style in a JavaScript object.
    */
  var styles: js.UndefOr[js.Any] = js.native
  
  /*This sets the configuration options for <maction> elements with actiontype="tooltip". (See also the
    * #MathJax_Tooltip style setting in jax/output/SVG/config.js, which can be overridden using the styles option
    * above.)
    */
  var tooltip: js.UndefOr[ToolTip] = js.native
  
  /*This is the font-family CSS value used for characters that are not in the selected font (e.g., this is where
    * to look for characters not included in the MathJax TeX fonts). IE will stop looking after the first font that
    * exists on the system (even if it doesn’t contain the needed character), so order these carefully.
    */
  var undefinedFamily: js.UndefOr[String] = js.native
  
  /*This controls whether the SVG output uses <use> elements to re-use font paths rather than repeat paths every
    * time. If useGlobalCache (see below) is set to false, this will still reduce duplication of paths while keeping
    * each SVG self-contained.
    */
  var useFontCache: js.UndefOr[Boolean] = js.native
  
  /*When set to true the SVG Output stores paths (corresponding to “fonts” in the SVG output) in a global SVG
    * object using <defs> elements so that it can re-use them in all equations via <use> elements (much like a font
    * file allows re-use of characters across the document). While set to true by default, it will have no effect if
    * useFontCache is set to false.
    */
  var useGlobalCache: js.UndefOr[Boolean] = js.native
}
object SVGOutputProcessor {
  
  @scala.inline
  def apply(): SVGOutputProcessor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SVGOutputProcessor]
  }
  
  @scala.inline
  implicit class SVGOutputProcessorOps[Self <: SVGOutputProcessor] (val x: Self) extends AnyVal {
    
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
    def setEqnChunk(value: Double): Self = this.set("EqnChunk", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEqnChunk: Self = this.set("EqnChunk", js.undefined)
    
    @scala.inline
    def setEqnChunkDelay(value: Double): Self = this.set("EqnChunkDelay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEqnChunkDelay: Self = this.set("EqnChunkDelay", js.undefined)
    
    @scala.inline
    def setEqnChunkFactor(value: Double): Self = this.set("EqnChunkFactor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEqnChunkFactor: Self = this.set("EqnChunkFactor", js.undefined)
    
    @scala.inline
    def setAddMMLclasses(value: Boolean): Self = this.set("addMMLclasses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAddMMLclasses: Self = this.set("addMMLclasses", js.undefined)
    
    @scala.inline
    def setBlacker(value: Double): Self = this.set("blacker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBlacker: Self = this.set("blacker", js.undefined)
    
    @scala.inline
    def setFont(value: String): Self = this.set("font", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFont: Self = this.set("font", js.undefined)
    
    @scala.inline
    def setLinebreaks(value: LineBreaks): Self = this.set("linebreaks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLinebreaks: Self = this.set("linebreaks", js.undefined)
    
    @scala.inline
    def setMatchFontHeight(value: Boolean): Self = this.set("matchFontHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMatchFontHeight: Self = this.set("matchFontHeight", js.undefined)
    
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
    
    @scala.inline
    def setStyles(value: js.Any): Self = this.set("styles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyles: Self = this.set("styles", js.undefined)
    
    @scala.inline
    def setTooltip(value: ToolTip): Self = this.set("tooltip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTooltip: Self = this.set("tooltip", js.undefined)
    
    @scala.inline
    def setUndefinedFamily(value: String): Self = this.set("undefinedFamily", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUndefinedFamily: Self = this.set("undefinedFamily", js.undefined)
    
    @scala.inline
    def setUseFontCache(value: Boolean): Self = this.set("useFontCache", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseFontCache: Self = this.set("useFontCache", js.undefined)
    
    @scala.inline
    def setUseGlobalCache(value: Boolean): Self = this.set("useGlobalCache", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseGlobalCache: Self = this.set("useGlobalCache", js.undefined)
  }
}
