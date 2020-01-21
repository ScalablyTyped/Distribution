package typings.marked.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MarkedOptions extends js.Object {
  /**
    * A prefix URL for any relative link.
    */
  var baseUrl: js.UndefOr[String] = js.undefined
  /**
    * Enable GFM line breaks. This option requires the gfm option to be true.
    */
  var breaks: js.UndefOr[Boolean] = js.undefined
  /**
    * Enable GitHub flavored markdown.
    */
  var gfm: js.UndefOr[Boolean] = js.undefined
  /**
    * Include an id attribute when emitting headings.
    */
  var headerIds: js.UndefOr[Boolean] = js.undefined
  /**
    * Set the prefix for header tag ids.
    */
  var headerPrefix: js.UndefOr[String] = js.undefined
  /**
    * A function to highlight code blocks. The function takes three arguments: code, lang, and callback.
    */
  var highlight: js.UndefOr[
    js.Function3[
      /* code */ String, 
      /* lang */ String, 
      /* callback */ js.UndefOr[js.Function2[/* error */ js.UndefOr[js.Any], /* code */ String, Unit]], 
      String
    ]
  ] = js.undefined
  /**
    * Set the prefix for code block classes.
    */
  var langPrefix: js.UndefOr[String] = js.undefined
  /**
    * Mangle autolinks (<email@domain.com>).
    */
  var mangle: js.UndefOr[Boolean] = js.undefined
  /**
    * Conform to obscure parts of markdown.pl as much as possible. Don't fix any of the original markdown bugs or poor behavior.
    */
  var pedantic: js.UndefOr[Boolean] = js.undefined
  /**
    * Type: object Default: new Renderer()
    *
    * An object containing functions to render tokens to HTML.
    */
  var renderer: js.UndefOr[Renderer] = js.undefined
  /**
    * Sanitize the output. Ignore any HTML that has been input.
    */
  var sanitize: js.UndefOr[Boolean] = js.undefined
  /**
    * Optionally sanitize found HTML with a sanitizer function.
    */
  var sanitizer: js.UndefOr[js.Function1[/* html */ String, String]] = js.undefined
  /**
    * Shows an HTML error message when rendering fails.
    */
  var silent: js.UndefOr[Boolean] = js.undefined
  /**
    * Use smarter list behavior than the original markdown. May eventually be default with the old behavior moved into pedantic.
    */
  var smartLists: js.UndefOr[Boolean] = js.undefined
  /**
    * Use "smart" typograhic punctuation for things like quotes and dashes.
    */
  var smartypants: js.UndefOr[Boolean] = js.undefined
  /**
    * Generate closing slash for self-closing tags (<br/> instead of <br>)
    */
  var xhtml: js.UndefOr[Boolean] = js.undefined
}

object MarkedOptions {
  @scala.inline
  def apply(
    baseUrl: String = null,
    breaks: js.UndefOr[Boolean] = js.undefined,
    gfm: js.UndefOr[Boolean] = js.undefined,
    headerIds: js.UndefOr[Boolean] = js.undefined,
    headerPrefix: String = null,
    highlight: (/* code */ String, /* lang */ String, /* callback */ js.UndefOr[js.Function2[/* error */ js.UndefOr[js.Any], /* code */ String, Unit]]) => String = null,
    langPrefix: String = null,
    mangle: js.UndefOr[Boolean] = js.undefined,
    pedantic: js.UndefOr[Boolean] = js.undefined,
    renderer: Renderer = null,
    sanitize: js.UndefOr[Boolean] = js.undefined,
    sanitizer: /* html */ String => String = null,
    silent: js.UndefOr[Boolean] = js.undefined,
    smartLists: js.UndefOr[Boolean] = js.undefined,
    smartypants: js.UndefOr[Boolean] = js.undefined,
    xhtml: js.UndefOr[Boolean] = js.undefined
  ): MarkedOptions = {
    val __obj = js.Dynamic.literal()
    if (baseUrl != null) __obj.updateDynamic("baseUrl")(baseUrl.asInstanceOf[js.Any])
    if (!js.isUndefined(breaks)) __obj.updateDynamic("breaks")(breaks.asInstanceOf[js.Any])
    if (!js.isUndefined(gfm)) __obj.updateDynamic("gfm")(gfm.asInstanceOf[js.Any])
    if (!js.isUndefined(headerIds)) __obj.updateDynamic("headerIds")(headerIds.asInstanceOf[js.Any])
    if (headerPrefix != null) __obj.updateDynamic("headerPrefix")(headerPrefix.asInstanceOf[js.Any])
    if (highlight != null) __obj.updateDynamic("highlight")(js.Any.fromFunction3(highlight))
    if (langPrefix != null) __obj.updateDynamic("langPrefix")(langPrefix.asInstanceOf[js.Any])
    if (!js.isUndefined(mangle)) __obj.updateDynamic("mangle")(mangle.asInstanceOf[js.Any])
    if (!js.isUndefined(pedantic)) __obj.updateDynamic("pedantic")(pedantic.asInstanceOf[js.Any])
    if (renderer != null) __obj.updateDynamic("renderer")(renderer.asInstanceOf[js.Any])
    if (!js.isUndefined(sanitize)) __obj.updateDynamic("sanitize")(sanitize.asInstanceOf[js.Any])
    if (sanitizer != null) __obj.updateDynamic("sanitizer")(js.Any.fromFunction1(sanitizer))
    if (!js.isUndefined(silent)) __obj.updateDynamic("silent")(silent.asInstanceOf[js.Any])
    if (!js.isUndefined(smartLists)) __obj.updateDynamic("smartLists")(smartLists.asInstanceOf[js.Any])
    if (!js.isUndefined(smartypants)) __obj.updateDynamic("smartypants")(smartypants.asInstanceOf[js.Any])
    if (!js.isUndefined(xhtml)) __obj.updateDynamic("xhtml")(xhtml.asInstanceOf[js.Any])
    __obj.asInstanceOf[MarkedOptions]
  }
}

