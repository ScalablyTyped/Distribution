package typings.mathjax.MathJax

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Config extends StObject {
  
  var AsciiMath: js.UndefOr[AsciiMathInputProcessor] = js.undefined
  
  var CommonHTML: js.UndefOr[CommonHTMLOutputProcessor] = js.undefined
  
  var FontWarnings: js.UndefOr[typings.mathjax.MathJax.FontWarnings] = js.undefined
  
  var `HTML-CSS`: js.UndefOr[HTMLCSSOutputProcessor] = js.undefined
  
  var MMLorHTML: js.UndefOr[MMLorHTMLConfiguration] = js.undefined
  
  var MatchWebFonts: js.UndefOr[typings.mathjax.MathJax.MatchWebFonts] = js.undefined
  
  var MathEvents: js.UndefOr[typings.mathjax.MathJax.MathEvents] = js.undefined
  
  var MathML: js.UndefOr[MathMLInputProcessor] = js.undefined
  
  var MathMenu: js.UndefOr[typings.mathjax.MathJax.MathMenu] = js.undefined
  
  var MathZoom: js.UndefOr[typings.mathjax.MathJax.MathZoom] = js.undefined
  
  var NativeMML: js.UndefOr[NativeMMLOutputProcessor] = js.undefined
  
  var SVG: js.UndefOr[SVGOutputProcessor] = js.undefined
  
  var Safe: js.UndefOr[typings.mathjax.MathJax.Safe] = js.undefined
  
  var TeX: js.UndefOr[TeXInputProcessor] = js.undefined
  
  var asciimath2jax: js.UndefOr[Asciimath2jaxPreprocessor] = js.undefined
  
  /*A list of configuration files to load when MathJax starts up, e.g., to define local macros,
    * etc., and there is a sample config file named config/local/local.js. The default directory is the
    * MathJax/config directory. The MMLorHTML.js configuration is one such configuration file, and there are a
    * number of other pre-defined configurations (see Using a configuration file for more details).
    */
  var config: js.UndefOr[js.Array[String]] = js.undefined
  
  /*Normally MathJax will perform its startup commands (loading of configuration, styles, jax, and so on) as soon
    * as it can. If you expect to be doing additional configuration on the page, however, you may want to have it
    * wait until the page’s onload handler is called. If so, set this to "onload". You can also set this to
    * "configured", in which case, MathJax will delay its startup until you explicitly call
    * MathJax.Hub.Configured(). See Configuring MathJax after it is loaded for more details.
    */
  var delayStartupUntil: js.UndefOr[String] = js.undefined
  
  /*These two parameters control the alignment and shifting of displayed equations. The first can be "left",
    * "center", or "right", and determines the alignment of displayed equations. When the alignment is not "center",
    * the second determines an indentation from the left or right side for the displayed equations.*/
  var displayAlign: js.UndefOr[String] = js.undefined
  
  var displayIndent: js.UndefOr[String] = js.undefined
  
  /*This is a list of DOM element ID’s that are the ones to process for mathematics when any of the Hub typesetting
    * calls (Typeset(), Process(), Update(), etc.) are called with no element specified, and during MathJax’s initial
    * typesetting run when it starts up. This lets you restrict the processing to particular containers rather than
    * scanning the entire document for mathematics. If none are supplied, the complete document is processed.
    */
  var elements: js.UndefOr[js.Array[String]] = js.undefined
  
  /*This block contains settings that control how MathJax responds to unexpected errors while processing
    * mathematical equations. Rather than simply crash, MathJax can report an error and go on.
    */
  var errorSettings: js.UndefOr[ErrorSettings] = js.undefined
  
  /*A list of extensions to load at startup. The default directory is MathJax/extensions. The
    * tex2jax and mml2jax preprocessors can be listed here, as well as a FontWarnings extension that you can use to
    * inform your user that mathematics fonts are available that they can download to improve their experience of
    * your site.
    */
  var extensions: js.UndefOr[js.Array[String]] = js.undefined
  
  /*A list of input and output jax to initialize at startup. Their main code is loaded only when
    * they are actually used, so it is not inefficient to include jax that may not actually be used on the page.
    * These are found in the MathJax/jax directory.
    */
  var jax: js.UndefOr[js.Array[String]] = js.undefined
  
  var jsMath2jax: js.UndefOr[JSMath2jaxPreprocessor] = js.undefined
  
  /*This block contains settings for the mathematics contextual menu that act as the defaults for the user’s
    * settings in that menu.
    * There are also settings for format, renderer, font, mpContext, and mpMouse, but these are maintained by
    * MathJax and should not be set by the page author.
    */
  var menuSettings: js.UndefOr[MenuSettings] = js.undefined
  
  /*This value controls the verbosity of the messages in the lower left-hand corner. Set it to "none" to eliminate
    * all messages, or set it to "simple" to show “Loading...” and “Processing...” rather than showing the full file
    * name or the percentage of the mathematics processed.
    */
  var messageStyle: js.UndefOr[String] = js.undefined
  
  var mml2jax: js.UndefOr[MML2jaxPreprocessor] = js.undefined
  
  /*ince typesetting usually changes the vertical dimensions of the page, if the URL contains an anchor position,
    * then after the page is typeset, you may no longer be positioned at the correct position on the page. MathJax
    * can reposition to that location after it completes its initial typesetting of the page. This value controls
    * whether MathJax will reposition the browser to the #hash location from the page URL after typesetting for
    * the page.
    */
  var positionToHash: js.UndefOr[Boolean] = js.undefined
  
  var postJax: js.UndefOr[Any] = js.undefined
  
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
  var preJax: js.UndefOr[Any] = js.undefined
  
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
  var preRemoveClass: js.UndefOr[String] = js.undefined
  
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
  var showMathMenu: js.UndefOr[Boolean] = js.undefined
  
  var showMathMenuMSIE: js.UndefOr[Boolean] = js.undefined
  
  /*This value controls whether the Processing Math: nn% messages are displayed in the lower left-hand corner.
    * Set to false to prevent those messages (though file loading and other messages will still be shown).
    */
  var showProcessingMessages: js.UndefOr[Boolean] = js.undefined
  
  /*Normally MathJax will typeset the mathematics on the page as soon as the page is loaded. If you want to delay
    * that process, in which case you will need to call MathJax.Hub.Typeset() yourself by hand, set this value to
    * true.
    */
  var skipStartupTypeset: js.UndefOr[Boolean] = js.undefined
  
  /*A list of CSS stylesheet files to be loaded when MathJax starts up. The default directory is
    * the MathJax/config directory.
    */
  var styleSheets: js.UndefOr[js.Array[String]] = js.undefined
  
  /*CSS styles to be defined dynamically at startup time. These are in the form selector:rules (see CSS Style
    * Objects for complete details).
    */
  var styles: js.UndefOr[Any] = js.undefined
  
  var tex2jax: js.UndefOr[TEX2jaxPreprocessor] = js.undefined
  
  @JSName("v1.0-compatible")
  var `v1Dot0-compatible`: js.UndefOr[Boolean] = js.undefined
}
object Config {
  
  inline def apply(): Config = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Config]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Config] (val x: Self) extends AnyVal {
    
    inline def setAsciiMath(value: AsciiMathInputProcessor): Self = StObject.set(x, "AsciiMath", value.asInstanceOf[js.Any])
    
    inline def setAsciiMathUndefined: Self = StObject.set(x, "AsciiMath", js.undefined)
    
    inline def setAsciimath2jax(value: Asciimath2jaxPreprocessor): Self = StObject.set(x, "asciimath2jax", value.asInstanceOf[js.Any])
    
    inline def setAsciimath2jaxUndefined: Self = StObject.set(x, "asciimath2jax", js.undefined)
    
    inline def setCommonHTML(value: CommonHTMLOutputProcessor): Self = StObject.set(x, "CommonHTML", value.asInstanceOf[js.Any])
    
    inline def setCommonHTMLUndefined: Self = StObject.set(x, "CommonHTML", js.undefined)
    
    inline def setConfig(value: js.Array[String]): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
    
    inline def setConfigUndefined: Self = StObject.set(x, "config", js.undefined)
    
    inline def setConfigVarargs(value: String*): Self = StObject.set(x, "config", js.Array(value*))
    
    inline def setDelayStartupUntil(value: String): Self = StObject.set(x, "delayStartupUntil", value.asInstanceOf[js.Any])
    
    inline def setDelayStartupUntilUndefined: Self = StObject.set(x, "delayStartupUntil", js.undefined)
    
    inline def setDisplayAlign(value: String): Self = StObject.set(x, "displayAlign", value.asInstanceOf[js.Any])
    
    inline def setDisplayAlignUndefined: Self = StObject.set(x, "displayAlign", js.undefined)
    
    inline def setDisplayIndent(value: String): Self = StObject.set(x, "displayIndent", value.asInstanceOf[js.Any])
    
    inline def setDisplayIndentUndefined: Self = StObject.set(x, "displayIndent", js.undefined)
    
    inline def setElements(value: js.Array[String]): Self = StObject.set(x, "elements", value.asInstanceOf[js.Any])
    
    inline def setElementsUndefined: Self = StObject.set(x, "elements", js.undefined)
    
    inline def setElementsVarargs(value: String*): Self = StObject.set(x, "elements", js.Array(value*))
    
    inline def setErrorSettings(value: ErrorSettings): Self = StObject.set(x, "errorSettings", value.asInstanceOf[js.Any])
    
    inline def setErrorSettingsUndefined: Self = StObject.set(x, "errorSettings", js.undefined)
    
    inline def setExtensions(value: js.Array[String]): Self = StObject.set(x, "extensions", value.asInstanceOf[js.Any])
    
    inline def setExtensionsUndefined: Self = StObject.set(x, "extensions", js.undefined)
    
    inline def setExtensionsVarargs(value: String*): Self = StObject.set(x, "extensions", js.Array(value*))
    
    inline def setFontWarnings(value: FontWarnings): Self = StObject.set(x, "FontWarnings", value.asInstanceOf[js.Any])
    
    inline def setFontWarningsUndefined: Self = StObject.set(x, "FontWarnings", js.undefined)
    
    inline def `setHTML-CSS`(value: HTMLCSSOutputProcessor): Self = StObject.set(x, "HTML-CSS", value.asInstanceOf[js.Any])
    
    inline def `setHTML-CSSUndefined`: Self = StObject.set(x, "HTML-CSS", js.undefined)
    
    inline def setJax(value: js.Array[String]): Self = StObject.set(x, "jax", value.asInstanceOf[js.Any])
    
    inline def setJaxUndefined: Self = StObject.set(x, "jax", js.undefined)
    
    inline def setJaxVarargs(value: String*): Self = StObject.set(x, "jax", js.Array(value*))
    
    inline def setJsMath2jax(value: JSMath2jaxPreprocessor): Self = StObject.set(x, "jsMath2jax", value.asInstanceOf[js.Any])
    
    inline def setJsMath2jaxUndefined: Self = StObject.set(x, "jsMath2jax", js.undefined)
    
    inline def setMMLorHTML(value: MMLorHTMLConfiguration): Self = StObject.set(x, "MMLorHTML", value.asInstanceOf[js.Any])
    
    inline def setMMLorHTMLUndefined: Self = StObject.set(x, "MMLorHTML", js.undefined)
    
    inline def setMatchWebFonts(value: MatchWebFonts): Self = StObject.set(x, "MatchWebFonts", value.asInstanceOf[js.Any])
    
    inline def setMatchWebFontsUndefined: Self = StObject.set(x, "MatchWebFonts", js.undefined)
    
    inline def setMathEvents(value: MathEvents): Self = StObject.set(x, "MathEvents", value.asInstanceOf[js.Any])
    
    inline def setMathEventsUndefined: Self = StObject.set(x, "MathEvents", js.undefined)
    
    inline def setMathML(value: MathMLInputProcessor): Self = StObject.set(x, "MathML", value.asInstanceOf[js.Any])
    
    inline def setMathMLUndefined: Self = StObject.set(x, "MathML", js.undefined)
    
    inline def setMathMenu(value: MathMenu): Self = StObject.set(x, "MathMenu", value.asInstanceOf[js.Any])
    
    inline def setMathMenuUndefined: Self = StObject.set(x, "MathMenu", js.undefined)
    
    inline def setMathZoom(value: MathZoom): Self = StObject.set(x, "MathZoom", value.asInstanceOf[js.Any])
    
    inline def setMathZoomUndefined: Self = StObject.set(x, "MathZoom", js.undefined)
    
    inline def setMenuSettings(value: MenuSettings): Self = StObject.set(x, "menuSettings", value.asInstanceOf[js.Any])
    
    inline def setMenuSettingsUndefined: Self = StObject.set(x, "menuSettings", js.undefined)
    
    inline def setMessageStyle(value: String): Self = StObject.set(x, "messageStyle", value.asInstanceOf[js.Any])
    
    inline def setMessageStyleUndefined: Self = StObject.set(x, "messageStyle", js.undefined)
    
    inline def setMml2jax(value: MML2jaxPreprocessor): Self = StObject.set(x, "mml2jax", value.asInstanceOf[js.Any])
    
    inline def setMml2jaxUndefined: Self = StObject.set(x, "mml2jax", js.undefined)
    
    inline def setNativeMML(value: NativeMMLOutputProcessor): Self = StObject.set(x, "NativeMML", value.asInstanceOf[js.Any])
    
    inline def setNativeMMLUndefined: Self = StObject.set(x, "NativeMML", js.undefined)
    
    inline def setPositionToHash(value: Boolean): Self = StObject.set(x, "positionToHash", value.asInstanceOf[js.Any])
    
    inline def setPositionToHashUndefined: Self = StObject.set(x, "positionToHash", js.undefined)
    
    inline def setPostJax(value: Any): Self = StObject.set(x, "postJax", value.asInstanceOf[js.Any])
    
    inline def setPostJaxUndefined: Self = StObject.set(x, "postJax", js.undefined)
    
    inline def setPreJax(value: Any): Self = StObject.set(x, "preJax", value.asInstanceOf[js.Any])
    
    inline def setPreJaxUndefined: Self = StObject.set(x, "preJax", js.undefined)
    
    inline def setPreRemoveClass(value: String): Self = StObject.set(x, "preRemoveClass", value.asInstanceOf[js.Any])
    
    inline def setPreRemoveClassUndefined: Self = StObject.set(x, "preRemoveClass", js.undefined)
    
    inline def setSVG(value: SVGOutputProcessor): Self = StObject.set(x, "SVG", value.asInstanceOf[js.Any])
    
    inline def setSVGUndefined: Self = StObject.set(x, "SVG", js.undefined)
    
    inline def setSafe(value: Safe): Self = StObject.set(x, "Safe", value.asInstanceOf[js.Any])
    
    inline def setSafeUndefined: Self = StObject.set(x, "Safe", js.undefined)
    
    inline def setShowMathMenu(value: Boolean): Self = StObject.set(x, "showMathMenu", value.asInstanceOf[js.Any])
    
    inline def setShowMathMenuMSIE(value: Boolean): Self = StObject.set(x, "showMathMenuMSIE", value.asInstanceOf[js.Any])
    
    inline def setShowMathMenuMSIEUndefined: Self = StObject.set(x, "showMathMenuMSIE", js.undefined)
    
    inline def setShowMathMenuUndefined: Self = StObject.set(x, "showMathMenu", js.undefined)
    
    inline def setShowProcessingMessages(value: Boolean): Self = StObject.set(x, "showProcessingMessages", value.asInstanceOf[js.Any])
    
    inline def setShowProcessingMessagesUndefined: Self = StObject.set(x, "showProcessingMessages", js.undefined)
    
    inline def setSkipStartupTypeset(value: Boolean): Self = StObject.set(x, "skipStartupTypeset", value.asInstanceOf[js.Any])
    
    inline def setSkipStartupTypesetUndefined: Self = StObject.set(x, "skipStartupTypeset", js.undefined)
    
    inline def setStyleSheets(value: js.Array[String]): Self = StObject.set(x, "styleSheets", value.asInstanceOf[js.Any])
    
    inline def setStyleSheetsUndefined: Self = StObject.set(x, "styleSheets", js.undefined)
    
    inline def setStyleSheetsVarargs(value: String*): Self = StObject.set(x, "styleSheets", js.Array(value*))
    
    inline def setStyles(value: Any): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
    
    inline def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
    
    inline def setTeX(value: TeXInputProcessor): Self = StObject.set(x, "TeX", value.asInstanceOf[js.Any])
    
    inline def setTeXUndefined: Self = StObject.set(x, "TeX", js.undefined)
    
    inline def setTex2jax(value: TEX2jaxPreprocessor): Self = StObject.set(x, "tex2jax", value.asInstanceOf[js.Any])
    
    inline def setTex2jaxUndefined: Self = StObject.set(x, "tex2jax", js.undefined)
    
    inline def `setV1Dot0-compatible`(value: Boolean): Self = StObject.set(x, "v1.0-compatible", value.asInstanceOf[js.Any])
    
    inline def `setV1Dot0-compatibleUndefined`: Self = StObject.set(x, "v1.0-compatible", js.undefined)
  }
}
