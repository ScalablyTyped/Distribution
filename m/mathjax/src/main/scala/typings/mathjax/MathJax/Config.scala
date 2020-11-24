package typings.mathjax.MathJax

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Config extends js.Object {
  
  var AsciiMath: js.UndefOr[AsciiMathInputProcessor] = js.native
  
  var CommonHTML: js.UndefOr[CommonHTMLOutputProcessor] = js.native
  
  var FontWarnings: js.UndefOr[typings.mathjax.MathJax.FontWarnings] = js.native
  
  var `HTML-CSS`: js.UndefOr[HTMLCSSOutputProcessor] = js.native
  
  var MMLorHTML: js.UndefOr[MMLorHTMLConfiguration] = js.native
  
  var MatchWebFonts: js.UndefOr[typings.mathjax.MathJax.MatchWebFonts] = js.native
  
  var MathEvents: js.UndefOr[typings.mathjax.MathJax.MathEvents] = js.native
  
  var MathML: js.UndefOr[MathMLInputProcessor] = js.native
  
  var MathMenu: js.UndefOr[typings.mathjax.MathJax.MathMenu] = js.native
  
  var MathZoom: js.UndefOr[typings.mathjax.MathJax.MathZoom] = js.native
  
  var NativeMML: js.UndefOr[NativeMMLOutputProcessor] = js.native
  
  var SVG: js.UndefOr[SVGOutputProcessor] = js.native
  
  var Safe: js.UndefOr[typings.mathjax.MathJax.Safe] = js.native
  
  var TeX: js.UndefOr[TeXInputProcessor] = js.native
  
  var asciimath2jax: js.UndefOr[Asciimath2jaxPreprocessor] = js.native
  
  /*A list of configuration files to load when MathJax starts up, e.g., to define local macros,
    * etc., and there is a sample config file named config/local/local.js. The default directory is the
    * MathJax/config directory. The MMLorHTML.js configuration is one such configuration file, and there are a
    * number of other pre-defined configurations (see Using a configuration file for more details).
    */
  var config: js.UndefOr[js.Array[String]] = js.native
  
  /*Normally MathJax will perform its startup commands (loading of configuration, styles, jax, and so on) as soon
    * as it can. If you expect to be doing additional configuration on the page, however, you may want to have it
    * wait until the page’s onload handler is called. If so, set this to "onload". You can also set this to
    * "configured", in which case, MathJax will delay its startup until you explicitly call
    * MathJax.Hub.Configured(). See Configuring MathJax after it is loaded for more details.
    */
  var delayStartupUntil: js.UndefOr[String] = js.native
  
  /*These two parameters control the alignment and shifting of displayed equations. The first can be "left",
    * "center", or "right", and determines the alignment of displayed equations. When the alignment is not "center",
    * the second determines an indentation from the left or right side for the displayed equations.*/
  var displayAlign: js.UndefOr[String] = js.native
  
  var displayIndent: js.UndefOr[String] = js.native
  
  /*This is a list of DOM element ID’s that are the ones to process for mathematics when any of the Hub typesetting
    * calls (Typeset(), Process(), Update(), etc.) are called with no element specified, and during MathJax’s initial
    * typesetting run when it starts up. This lets you restrict the processing to particular containers rather than
    * scanning the entire document for mathematics. If none are supplied, the complete document is processed.
    */
  var elements: js.UndefOr[js.Array[String]] = js.native
  
  /*This block contains settings that control how MathJax responds to unexpected errors while processing
    * mathematical equations. Rather than simply crash, MathJax can report an error and go on.
    */
  var errorSettings: js.UndefOr[ErrorSettings] = js.native
  
  /*A list of extensions to load at startup. The default directory is MathJax/extensions. The
    * tex2jax and mml2jax preprocessors can be listed here, as well as a FontWarnings extension that you can use to
    * inform your user that mathematics fonts are available that they can download to improve their experience of
    * your site.
    */
  var extensions: js.UndefOr[js.Array[String]] = js.native
  
  /*A list of input and output jax to initialize at startup. Their main code is loaded only when
    * they are actually used, so it is not inefficient to include jax that may not actually be used on the page.
    * These are found in the MathJax/jax directory.
    */
  var jax: js.UndefOr[js.Array[String]] = js.native
  
  var jsMath2jax: js.UndefOr[JSMath2jaxPreprocessor] = js.native
  
  /*This block contains settings for the mathematics contextual menu that act as the defaults for the user’s
    * settings in that menu.
    * There are also settings for format, renderer, font, mpContext, and mpMouse, but these are maintained by
    * MathJax and should not be set by the page author.
    */
  var menuSettings: js.UndefOr[MenuSettings] = js.native
  
  /*This value controls the verbosity of the messages in the lower left-hand corner. Set it to "none" to eliminate
    * all messages, or set it to "simple" to show “Loading...” and “Processing...” rather than showing the full file
    * name or the percentage of the mathematics processed.
    */
  var messageStyle: js.UndefOr[String] = js.native
  
  var mml2jax: js.UndefOr[MML2jaxPreprocessor] = js.native
  
  /*ince typesetting usually changes the vertical dimensions of the page, if the URL contains an anchor position,
    * then after the page is typeset, you may no longer be positioned at the correct position on the page. MathJax
    * can reposition to that location after it completes its initial typesetting of the page. This value controls
    * whether MathJax will reposition the browser to the #hash location from the page URL after typesetting for
    * the page.
    */
  var positionToHash: js.UndefOr[Boolean] = js.native
  
  var postJax: js.UndefOr[js.Any] = js.native
  
  /*Patterns to remove from before and after math script tags. If you are not using one of the preprocessors, you
    * need to insert something extra into your HTML file in order to avoid a bug in Internet Explorer. IE removes
    * spaces from the DOM that it thinks are redundant, and since a <script> tag usually doesn’t add content to the
    * page, if there is a space before and after a MathJax <script> tag, IE will remove the first space. When
    * MathJax inserts the typeset mathematics, this means there will be no space before it and the preceding text.
    * In order to avoid this, you should include some “guard characters” before or after the math SCRIPT tag; define
    * the patterns you want to use below. Note that these are used as part of a regular expression, so you will need
    * to quote special characters. Furthermore, since they are javascript strings, you must quote javascript special
    * characters as well. So to obtain a backslash, you must use \\ (doubled for javascript). For example, "\\["
    * represents the pattern \[ in the regular expression, or [ in the text of the web page. That means that if you
    * want an actual backslash in your guard characters, you need to use "\\\\" in order to get \\ in the regular
    * expression, and \ in the actual text. If both preJax and postJax are defined, both must be present in order
    * to be removed.
    *
    * See also the preRemoveClass comments below.
    *
    * Examples:
    *
    * preJax: "\\\\\\\\\" makes a double backslash the preJax text
    *
    * preJax: "\\[\\[", postJax: "\\]\\]" makes it so jax scripts must be enclosed in double brackets.
    */
  var preJax: js.UndefOr[js.Any] = js.native
  
  /*This is the CSS class name for math previews that will be removed preceding a MathJax SCRIPT tag. If the tag
    * just before the MathJax <script> tag is of this class, its contents are removed when MathJax processes the
    * <script> tag. This allows you to include a math preview in a form that will be displayed prior to MathJax
    * performing its typesetting. It also avoids the Internet Explorer space-removal bug, and can be used in place
    * of preJax and postJax if that is more convenient.
    *
    * For example
    *
    * <span class="MathJax_Preview">[math]</span><script  type="math/tex">...</script>
    * would display “[math]” in place of the math until MathJax is able to typeset it.
    */
  var preRemoveClass: js.UndefOr[String] = js.native
  
  /*These control whether to attach the MathJax contextual menu to the expressions typeset by MathJax. Since the
    * code for handling MathPlayer in Internet Explorer is somewhat delicate, it is controlled separately via
    * showMathMenuMSIE, but the latter is now deprecated in favor of the MathJax contextual menu settings for
    * MathPlayer (see below).
    *
    * If showMathMenu is true, then right-clicking (on Windows or Linux) or control-clicking (on Mac OS X) will
    * produce a MathJax menu that allows you to get the source of the mathematics in various formats, change the
    * size of the mathematics relative to the surrounding text, get information about MathJax, and configure other
    * MathJax settings.
    *
    * Set this to false to disable the menu. When true, the MathMenu configuration block determines the operation
    * of the menu. See the MathMenu options for more details.
    *
    * These values used to be listed in the separate output jax, but have been moved to this more central location
    * since they are shared by all output jax. MathJax will still honor their values from their original positions,
    * if they are set there.
    */
  var showMathMenu: js.UndefOr[Boolean] = js.native
  
  var showMathMenuMSIE: js.UndefOr[Boolean] = js.native
  
  /*This value controls whether the Processing Math: nn% messages are displayed in the lower left-hand corner.
    * Set to false to prevent those messages (though file loading and other messages will still be shown).
    */
  var showProcessingMessages: js.UndefOr[Boolean] = js.native
  
  /*Normally MathJax will typeset the mathematics on the page as soon as the page is loaded. If you want to delay
    * that process, in which case you will need to call MathJax.Hub.Typeset() yourself by hand, set this value to
    * true.
    */
  var skipStartupTypeset: js.UndefOr[Boolean] = js.native
  
  /*A list of CSS stylesheet files to be loaded when MathJax starts up. The default directory is
    * the MathJax/config directory.
    */
  var styleSheets: js.UndefOr[js.Array[String]] = js.native
  
  /*CSS styles to be defined dynamically at startup time. These are in the form selector:rules (see CSS Style
    * Objects for complete details).
    */
  var styles: js.UndefOr[js.Any] = js.native
  
  var tex2jax: js.UndefOr[TEX2jaxPreprocessor] = js.native
  
  @JSName("v1.0-compatible")
  var `v1Dot0-compatible`: js.UndefOr[Boolean] = js.native
}
object Config {
  
  @scala.inline
  def apply(): Config = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Config]
  }
  
  @scala.inline
  implicit class ConfigOps[Self <: Config] (val x: Self) extends AnyVal {
    
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
    def setAsciiMath(value: AsciiMathInputProcessor): Self = this.set("AsciiMath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAsciiMath: Self = this.set("AsciiMath", js.undefined)
    
    @scala.inline
    def setCommonHTML(value: CommonHTMLOutputProcessor): Self = this.set("CommonHTML", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCommonHTML: Self = this.set("CommonHTML", js.undefined)
    
    @scala.inline
    def setFontWarnings(value: FontWarnings): Self = this.set("FontWarnings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFontWarnings: Self = this.set("FontWarnings", js.undefined)
    
    @scala.inline
    def `setHTML-CSS`(value: HTMLCSSOutputProcessor): Self = this.set("HTML-CSS", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteHTML-CSS`: Self = this.set("HTML-CSS", js.undefined)
    
    @scala.inline
    def setMMLorHTML(value: MMLorHTMLConfiguration): Self = this.set("MMLorHTML", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMMLorHTML: Self = this.set("MMLorHTML", js.undefined)
    
    @scala.inline
    def setMatchWebFonts(value: MatchWebFonts): Self = this.set("MatchWebFonts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMatchWebFonts: Self = this.set("MatchWebFonts", js.undefined)
    
    @scala.inline
    def setMathEvents(value: MathEvents): Self = this.set("MathEvents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMathEvents: Self = this.set("MathEvents", js.undefined)
    
    @scala.inline
    def setMathML(value: MathMLInputProcessor): Self = this.set("MathML", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMathML: Self = this.set("MathML", js.undefined)
    
    @scala.inline
    def setMathMenu(value: MathMenu): Self = this.set("MathMenu", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMathMenu: Self = this.set("MathMenu", js.undefined)
    
    @scala.inline
    def setMathZoom(value: MathZoom): Self = this.set("MathZoom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMathZoom: Self = this.set("MathZoom", js.undefined)
    
    @scala.inline
    def setNativeMML(value: NativeMMLOutputProcessor): Self = this.set("NativeMML", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNativeMML: Self = this.set("NativeMML", js.undefined)
    
    @scala.inline
    def setSVG(value: SVGOutputProcessor): Self = this.set("SVG", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSVG: Self = this.set("SVG", js.undefined)
    
    @scala.inline
    def setSafe(value: Safe): Self = this.set("Safe", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSafe: Self = this.set("Safe", js.undefined)
    
    @scala.inline
    def setTeX(value: TeXInputProcessor): Self = this.set("TeX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTeX: Self = this.set("TeX", js.undefined)
    
    @scala.inline
    def setAsciimath2jax(value: Asciimath2jaxPreprocessor): Self = this.set("asciimath2jax", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAsciimath2jax: Self = this.set("asciimath2jax", js.undefined)
    
    @scala.inline
    def setConfigVarargs(value: String*): Self = this.set("config", js.Array(value :_*))
    
    @scala.inline
    def setConfig(value: js.Array[String]): Self = this.set("config", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConfig: Self = this.set("config", js.undefined)
    
    @scala.inline
    def setDelayStartupUntil(value: String): Self = this.set("delayStartupUntil", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDelayStartupUntil: Self = this.set("delayStartupUntil", js.undefined)
    
    @scala.inline
    def setDisplayAlign(value: String): Self = this.set("displayAlign", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisplayAlign: Self = this.set("displayAlign", js.undefined)
    
    @scala.inline
    def setDisplayIndent(value: String): Self = this.set("displayIndent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisplayIndent: Self = this.set("displayIndent", js.undefined)
    
    @scala.inline
    def setElementsVarargs(value: String*): Self = this.set("elements", js.Array(value :_*))
    
    @scala.inline
    def setElements(value: js.Array[String]): Self = this.set("elements", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteElements: Self = this.set("elements", js.undefined)
    
    @scala.inline
    def setErrorSettings(value: ErrorSettings): Self = this.set("errorSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteErrorSettings: Self = this.set("errorSettings", js.undefined)
    
    @scala.inline
    def setExtensionsVarargs(value: String*): Self = this.set("extensions", js.Array(value :_*))
    
    @scala.inline
    def setExtensions(value: js.Array[String]): Self = this.set("extensions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExtensions: Self = this.set("extensions", js.undefined)
    
    @scala.inline
    def setJaxVarargs(value: String*): Self = this.set("jax", js.Array(value :_*))
    
    @scala.inline
    def setJax(value: js.Array[String]): Self = this.set("jax", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteJax: Self = this.set("jax", js.undefined)
    
    @scala.inline
    def setJsMath2jax(value: JSMath2jaxPreprocessor): Self = this.set("jsMath2jax", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteJsMath2jax: Self = this.set("jsMath2jax", js.undefined)
    
    @scala.inline
    def setMenuSettings(value: MenuSettings): Self = this.set("menuSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMenuSettings: Self = this.set("menuSettings", js.undefined)
    
    @scala.inline
    def setMessageStyle(value: String): Self = this.set("messageStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMessageStyle: Self = this.set("messageStyle", js.undefined)
    
    @scala.inline
    def setMml2jax(value: MML2jaxPreprocessor): Self = this.set("mml2jax", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMml2jax: Self = this.set("mml2jax", js.undefined)
    
    @scala.inline
    def setPositionToHash(value: Boolean): Self = this.set("positionToHash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePositionToHash: Self = this.set("positionToHash", js.undefined)
    
    @scala.inline
    def setPostJax(value: js.Any): Self = this.set("postJax", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePostJax: Self = this.set("postJax", js.undefined)
    
    @scala.inline
    def setPreJax(value: js.Any): Self = this.set("preJax", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreJax: Self = this.set("preJax", js.undefined)
    
    @scala.inline
    def setPreRemoveClass(value: String): Self = this.set("preRemoveClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreRemoveClass: Self = this.set("preRemoveClass", js.undefined)
    
    @scala.inline
    def setShowMathMenu(value: Boolean): Self = this.set("showMathMenu", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowMathMenu: Self = this.set("showMathMenu", js.undefined)
    
    @scala.inline
    def setShowMathMenuMSIE(value: Boolean): Self = this.set("showMathMenuMSIE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowMathMenuMSIE: Self = this.set("showMathMenuMSIE", js.undefined)
    
    @scala.inline
    def setShowProcessingMessages(value: Boolean): Self = this.set("showProcessingMessages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowProcessingMessages: Self = this.set("showProcessingMessages", js.undefined)
    
    @scala.inline
    def setSkipStartupTypeset(value: Boolean): Self = this.set("skipStartupTypeset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSkipStartupTypeset: Self = this.set("skipStartupTypeset", js.undefined)
    
    @scala.inline
    def setStyleSheetsVarargs(value: String*): Self = this.set("styleSheets", js.Array(value :_*))
    
    @scala.inline
    def setStyleSheets(value: js.Array[String]): Self = this.set("styleSheets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyleSheets: Self = this.set("styleSheets", js.undefined)
    
    @scala.inline
    def setStyles(value: js.Any): Self = this.set("styles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyles: Self = this.set("styles", js.undefined)
    
    @scala.inline
    def setTex2jax(value: TEX2jaxPreprocessor): Self = this.set("tex2jax", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTex2jax: Self = this.set("tex2jax", js.undefined)
    
    @scala.inline
    def `setV1Dot0-compatible`(value: Boolean): Self = this.set("v1.0-compatible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteV1Dot0-compatible`: Self = this.set("v1.0-compatible", js.undefined)
  }
}
