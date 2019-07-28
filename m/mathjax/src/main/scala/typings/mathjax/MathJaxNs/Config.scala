package typings.mathjax.MathJaxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Config extends js.Object {
  var AsciiMath: js.UndefOr[AsciiMathInputProcessor] = js.undefined
  var CommonHTML: js.UndefOr[CommonHTMLOutputProcessor] = js.undefined
  var FontWarnings: js.UndefOr[typings.mathjax.MathJaxNs.FontWarnings] = js.undefined
  var `HTML-CSS`: js.UndefOr[HTMLCSSOutputProcessor] = js.undefined
  var MMLorHTML: js.UndefOr[MMLorHTMLConfiguration] = js.undefined
  var MatchWebFonts: js.UndefOr[typings.mathjax.MathJaxNs.MatchWebFonts] = js.undefined
  var MathEvents: js.UndefOr[typings.mathjax.MathJaxNs.MathEvents] = js.undefined
  var MathML: js.UndefOr[MathMLInputProcessor] = js.undefined
  var MathMenu: js.UndefOr[typings.mathjax.MathJaxNs.MathMenu] = js.undefined
  var MathZoom: js.UndefOr[typings.mathjax.MathJaxNs.MathZoom] = js.undefined
  var NativeMML: js.UndefOr[NativeMMLOutputProcessor] = js.undefined
  var SVG: js.UndefOr[SVGOutputProcessor] = js.undefined
  var Safe: js.UndefOr[typings.mathjax.MathJaxNs.Safe] = js.undefined
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
  var postJax: js.UndefOr[js.Any] = js.undefined
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
  var preJax: js.UndefOr[js.Any] = js.undefined
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
  var styles: js.UndefOr[js.Any] = js.undefined
  var tex2jax: js.UndefOr[TEX2jaxPreprocessor] = js.undefined
  var `v1.0-compatible`: js.UndefOr[Boolean] = js.undefined
}

object Config {
  @scala.inline
  def apply(
    AsciiMath: AsciiMathInputProcessor = null,
    CommonHTML: CommonHTMLOutputProcessor = null,
    FontWarnings: FontWarnings = null,
    `HTML-CSS`: HTMLCSSOutputProcessor = null,
    MMLorHTML: MMLorHTMLConfiguration = null,
    MatchWebFonts: MatchWebFonts = null,
    MathEvents: MathEvents = null,
    MathML: MathMLInputProcessor = null,
    MathMenu: MathMenu = null,
    MathZoom: MathZoom = null,
    NativeMML: NativeMMLOutputProcessor = null,
    SVG: SVGOutputProcessor = null,
    Safe: Safe = null,
    TeX: TeXInputProcessor = null,
    asciimath2jax: Asciimath2jaxPreprocessor = null,
    config: js.Array[String] = null,
    delayStartupUntil: String = null,
    displayAlign: String = null,
    displayIndent: String = null,
    elements: js.Array[String] = null,
    errorSettings: ErrorSettings = null,
    extensions: js.Array[String] = null,
    jax: js.Array[String] = null,
    jsMath2jax: JSMath2jaxPreprocessor = null,
    menuSettings: MenuSettings = null,
    messageStyle: String = null,
    mml2jax: MML2jaxPreprocessor = null,
    positionToHash: js.UndefOr[Boolean] = js.undefined,
    postJax: js.Any = null,
    preJax: js.Any = null,
    preRemoveClass: String = null,
    showMathMenu: js.UndefOr[Boolean] = js.undefined,
    showMathMenuMSIE: js.UndefOr[Boolean] = js.undefined,
    showProcessingMessages: js.UndefOr[Boolean] = js.undefined,
    skipStartupTypeset: js.UndefOr[Boolean] = js.undefined,
    styleSheets: js.Array[String] = null,
    styles: js.Any = null,
    tex2jax: TEX2jaxPreprocessor = null,
    `v1.0-compatible`: js.UndefOr[Boolean] = js.undefined
  ): Config = {
    val __obj = js.Dynamic.literal()
    if (AsciiMath != null) __obj.updateDynamic("AsciiMath")(AsciiMath)
    if (CommonHTML != null) __obj.updateDynamic("CommonHTML")(CommonHTML)
    if (FontWarnings != null) __obj.updateDynamic("FontWarnings")(FontWarnings)
    if (`HTML-CSS` != null) __obj.updateDynamic("HTML-CSS")(`HTML-CSS`)
    if (MMLorHTML != null) __obj.updateDynamic("MMLorHTML")(MMLorHTML)
    if (MatchWebFonts != null) __obj.updateDynamic("MatchWebFonts")(MatchWebFonts)
    if (MathEvents != null) __obj.updateDynamic("MathEvents")(MathEvents)
    if (MathML != null) __obj.updateDynamic("MathML")(MathML)
    if (MathMenu != null) __obj.updateDynamic("MathMenu")(MathMenu)
    if (MathZoom != null) __obj.updateDynamic("MathZoom")(MathZoom)
    if (NativeMML != null) __obj.updateDynamic("NativeMML")(NativeMML)
    if (SVG != null) __obj.updateDynamic("SVG")(SVG)
    if (Safe != null) __obj.updateDynamic("Safe")(Safe)
    if (TeX != null) __obj.updateDynamic("TeX")(TeX)
    if (asciimath2jax != null) __obj.updateDynamic("asciimath2jax")(asciimath2jax)
    if (config != null) __obj.updateDynamic("config")(config)
    if (delayStartupUntil != null) __obj.updateDynamic("delayStartupUntil")(delayStartupUntil)
    if (displayAlign != null) __obj.updateDynamic("displayAlign")(displayAlign)
    if (displayIndent != null) __obj.updateDynamic("displayIndent")(displayIndent)
    if (elements != null) __obj.updateDynamic("elements")(elements)
    if (errorSettings != null) __obj.updateDynamic("errorSettings")(errorSettings)
    if (extensions != null) __obj.updateDynamic("extensions")(extensions)
    if (jax != null) __obj.updateDynamic("jax")(jax)
    if (jsMath2jax != null) __obj.updateDynamic("jsMath2jax")(jsMath2jax)
    if (menuSettings != null) __obj.updateDynamic("menuSettings")(menuSettings)
    if (messageStyle != null) __obj.updateDynamic("messageStyle")(messageStyle)
    if (mml2jax != null) __obj.updateDynamic("mml2jax")(mml2jax)
    if (!js.isUndefined(positionToHash)) __obj.updateDynamic("positionToHash")(positionToHash)
    if (postJax != null) __obj.updateDynamic("postJax")(postJax)
    if (preJax != null) __obj.updateDynamic("preJax")(preJax)
    if (preRemoveClass != null) __obj.updateDynamic("preRemoveClass")(preRemoveClass)
    if (!js.isUndefined(showMathMenu)) __obj.updateDynamic("showMathMenu")(showMathMenu)
    if (!js.isUndefined(showMathMenuMSIE)) __obj.updateDynamic("showMathMenuMSIE")(showMathMenuMSIE)
    if (!js.isUndefined(showProcessingMessages)) __obj.updateDynamic("showProcessingMessages")(showProcessingMessages)
    if (!js.isUndefined(skipStartupTypeset)) __obj.updateDynamic("skipStartupTypeset")(skipStartupTypeset)
    if (styleSheets != null) __obj.updateDynamic("styleSheets")(styleSheets)
    if (styles != null) __obj.updateDynamic("styles")(styles)
    if (tex2jax != null) __obj.updateDynamic("tex2jax")(tex2jax)
    if (!js.isUndefined(`v1.0-compatible`)) __obj.updateDynamic("v1.0-compatible")(`v1.0-compatible`)
    __obj.asInstanceOf[Config]
  }
}

