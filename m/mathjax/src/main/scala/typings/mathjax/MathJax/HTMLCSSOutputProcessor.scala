package typings.mathjax.MathJax

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HTMLCSSOutputProcessor extends js.Object {
  /*EqnChunk is the number of equations that will be typeset before they appear on screen. Larger values make for
    * less visual flicker as the equations are drawn, but also mean longer delays before the reader sees anything.
    */
  var EqnChunk: js.UndefOr[Double] = js.undefined
  /*EqChunkDelay is the time (in milliseconds) to delay between chunks (to allow the browser to respond to other
    * user interaction).
    * Set EqnChunk to 1, EqnChunkFactor to 1, and EqnChunkDelay to 10 to get the behavior from MathJax v1.1 and
    * below.
    */
  var EqnChunkDelay: js.UndefOr[Double] = js.undefined
  /*EqChunkFactor is the factor by which the EqnChunk will grow after each chunk is displayed.*/
  var EqnChunkFactor: js.UndefOr[Double] = js.undefined
  /*This is a list of the fonts to look for on a user’s computer in preference to using MathJax’s web-based fonts.
    * These must correspond to directories available in the jax/output/HTML-CSS/fonts directory, where MathJax
    * stores data about the characters available in the fonts. Set this to ["TeX"], for example, to prevent the use
    * of the STIX fonts, or set it to an empty list, [], if you want to force MathJax to use web-based or image
    * fonts.
    */
  var availableFonts: js.UndefOr[js.Array[String]] = js.undefined
  /* This is the font to use for image fallback mode (when none of the fonts listed above are available and the
    * browser doesn’t support web-fonts via the @font-face CSS directive). Note that currently only the TeX font is
    * available as an image font (they are stored in the fonts/HTML-CSS directory).
    *
    * Set this to null if you want to prevent the use of image fonts (e.g., you have deleted or not installed the
    * image fonts on your server). In this case, only browsers that support web-based fonts will be able to view
    * your pages without having the fonts installed on the client computer. The browsers that support web-based
    * fonts include: IE6 and later, Chrome, Safari3.1 and above, Firefox3.5 and later, and Opera10 and later. Note
    * that Firefox3.0 is not on this list.
    */
  var imageFont: js.UndefOr[String] = js.undefined
  /*This is an object that configures automatic linebreaking in the SVG output. In order to be backward compatible
    * with earlier versions of MathJax, only explicit line breaks are performed by default, so you must enable line
    * breaks if you want automatic ones.
    */
  var linebreaks: js.UndefOr[LineBreaks] = js.undefined
  /*This option indicates whether MathJax should try to adjust the x-height of equations to match the x-height of
    * the surrounding text. See the MatchWebFonts options for finer control, especially if you are using Web fonts.
    */
  var matchFontHeight: js.UndefOr[Boolean] = js.undefined
  /*This gives a minimum scale (as a percent) for the scaling used by MathJax to match the equation to the
    * surrounding text. This will prevent MathJax from making the mathematics too small.
    */
  var minScaleAdjust: js.UndefOr[Double] = js.undefined
  /*This setting controls whether <mtext> elements will be typeset using the math fonts or the font of the
    * surrounding text. When false, the font for mathvariant="normal" will be used; when true, the font will be
    * inherited from the surrounding paragraph.
    */
  var mtextFontInherit: js.UndefOr[Boolean] = js.undefined
  /*Which font to prefer out of the availableFonts list, when more than one is available on the user’s computer.
    * Set it to null if you want MathJax to use web-based or image fonts.
    */
  var preferredFont: js.UndefOr[String] = js.undefined
  /*The scaling factor (as a percentage) of math with respect to the surrounding text. The HTML-CSS output
    * processor tries to match the ex-size of the mathematics with that of the text where it is placed, but you may
    * want to adjust the results using this scaling factor. The user can also adjust this value using the contextual
    * menu item associated with the typeset mathematics.
    */
  var scale: js.UndefOr[Double] = js.undefined
  /*This value has been moved to the core configuration block, since it applies to all output jax, but it will
    * still be honored (for now) if it is set here. See the Core configuration options for more details.
    */
  var showMathMenu: js.UndefOr[Boolean] = js.undefined
  /*This is a list of CSS declarations for styling the SVG output. See the definitions in jax/output/SVG/config.js
    * for some examples of what are defined by default. See CSS Style Objects for details on how to specify CSS
    * style in a JavaScript object.
    */
  var styles: js.UndefOr[js.Any] = js.undefined
  /*This sets the configuration options for <maction> elements with actiontype="tooltip". (See also the
    * #MathJax_Tooltip style setting in jax/output/SVG/config.js, which can be overridden using the styles option
    * above.)
    */
  var tooltip: js.UndefOr[ToolTip] = js.undefined
  /*This is the font-family CSS value used for characters that are not in the selected font (e.g., for web-based
    * fonts, this is where to look for characters not included in the MathJax web fonts). IE will stop looking after
    * the first font that exists on the system (even if it doesn’t contain the needed character), so order these
    * carefully.
    */
  var undefinedFamily: js.UndefOr[js.Array[String]] = js.undefined
  /*This is the web-based font to use when none of the fonts listed above are available on the user’s computer. The
    * possible values are TeX, STIX-Web, Asana-Math, Neo-Euler, Gyre-Pagella, Gyre-Termes and Latin-Modern. Note
    * that not all mathematical characters are available in all fonts (e.g., Neo-Euler does not include italic
    * characters), so some mathematics may work better in some fonts than in others. The STIX-Web font is the most
    * complete.
    *
    * These fonts are stored in the fonts/HTML-CSS folder in the MathJax directory. Set this to null to disable web
    * fonts.
    */
  var webFont: js.UndefOr[String] = js.undefined
}

object HTMLCSSOutputProcessor {
  @scala.inline
  def apply(
    EqnChunk: Int | Double = null,
    EqnChunkDelay: Int | Double = null,
    EqnChunkFactor: Int | Double = null,
    availableFonts: js.Array[String] = null,
    imageFont: String = null,
    linebreaks: LineBreaks = null,
    matchFontHeight: js.UndefOr[Boolean] = js.undefined,
    minScaleAdjust: Int | Double = null,
    mtextFontInherit: js.UndefOr[Boolean] = js.undefined,
    preferredFont: String = null,
    scale: Int | Double = null,
    showMathMenu: js.UndefOr[Boolean] = js.undefined,
    styles: js.Any = null,
    tooltip: ToolTip = null,
    undefinedFamily: js.Array[String] = null,
    webFont: String = null
  ): HTMLCSSOutputProcessor = {
    val __obj = js.Dynamic.literal()
    if (EqnChunk != null) __obj.updateDynamic("EqnChunk")(EqnChunk.asInstanceOf[js.Any])
    if (EqnChunkDelay != null) __obj.updateDynamic("EqnChunkDelay")(EqnChunkDelay.asInstanceOf[js.Any])
    if (EqnChunkFactor != null) __obj.updateDynamic("EqnChunkFactor")(EqnChunkFactor.asInstanceOf[js.Any])
    if (availableFonts != null) __obj.updateDynamic("availableFonts")(availableFonts.asInstanceOf[js.Any])
    if (imageFont != null) __obj.updateDynamic("imageFont")(imageFont.asInstanceOf[js.Any])
    if (linebreaks != null) __obj.updateDynamic("linebreaks")(linebreaks.asInstanceOf[js.Any])
    if (!js.isUndefined(matchFontHeight)) __obj.updateDynamic("matchFontHeight")(matchFontHeight.asInstanceOf[js.Any])
    if (minScaleAdjust != null) __obj.updateDynamic("minScaleAdjust")(minScaleAdjust.asInstanceOf[js.Any])
    if (!js.isUndefined(mtextFontInherit)) __obj.updateDynamic("mtextFontInherit")(mtextFontInherit.asInstanceOf[js.Any])
    if (preferredFont != null) __obj.updateDynamic("preferredFont")(preferredFont.asInstanceOf[js.Any])
    if (scale != null) __obj.updateDynamic("scale")(scale.asInstanceOf[js.Any])
    if (!js.isUndefined(showMathMenu)) __obj.updateDynamic("showMathMenu")(showMathMenu.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    if (tooltip != null) __obj.updateDynamic("tooltip")(tooltip.asInstanceOf[js.Any])
    if (undefinedFamily != null) __obj.updateDynamic("undefinedFamily")(undefinedFamily.asInstanceOf[js.Any])
    if (webFont != null) __obj.updateDynamic("webFont")(webFont.asInstanceOf[js.Any])
    __obj.asInstanceOf[HTMLCSSOutputProcessor]
  }
}

