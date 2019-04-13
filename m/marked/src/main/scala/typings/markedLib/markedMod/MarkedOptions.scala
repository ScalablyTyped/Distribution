package typings
package markedLib.markedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MarkedOptions extends js.Object {
  /**
    * A prefix URL for any relative link.
    */
  var baseUrl: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Enable GFM line breaks. This option requires the gfm option to be true.
    */
  var breaks: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Enable GitHub flavored markdown.
    */
  var gfm: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Include an id attribute when emitting headings.
    */
  var headerIds: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Set the prefix for header tag ids.
    */
  var headerPrefix: js.UndefOr[java.lang.String] = js.undefined
  /**
    * A function to highlight code blocks. The function takes three arguments: code, lang, and callback.
    */
  var highlight: js.UndefOr[
    js.Function3[
      /* code */ java.lang.String, 
      /* lang */ java.lang.String, 
      /* callback */ js.UndefOr[js.Function2[/* error */ js.UndefOr[_], /* code */ java.lang.String, scala.Unit]], 
      java.lang.String
    ]
  ] = js.undefined
  /**
    * Set the prefix for code block classes.
    */
  var langPrefix: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Mangle autolinks (<email@domain.com>).
    */
  var mangle: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Conform to obscure parts of markdown.pl as much as possible. Don't fix any of the original markdown bugs or poor behavior.
    */
  var pedantic: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Type: object Default: new Renderer()
    *
    * An object containing functions to render tokens to HTML.
    */
  var renderer: js.UndefOr[Renderer] = js.undefined
  /**
    * Sanitize the output. Ignore any HTML that has been input.
    */
  var sanitize: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Optionally sanitize found HTML with a sanitizer function.
    */
  var sanitizer: js.UndefOr[js.Function1[/* html */ java.lang.String, java.lang.String]] = js.undefined
  /**
    * Shows an HTML error message when rendering fails.
    */
  var silent: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Use smarter list behavior than the original markdown. May eventually be default with the old behavior moved into pedantic.
    */
  var smartLists: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Use "smart" typograhic punctuation for things like quotes and dashes.
    */
  var smartypants: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Enable GFM tables. This option requires the gfm option to be true.
    */
  var tables: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Generate closing slash for self-closing tags (<br/> instead of <br>)
    */
  var xhtml: js.UndefOr[scala.Boolean] = js.undefined
}

object MarkedOptions {
  @scala.inline
  def apply(
    baseUrl: java.lang.String = null,
    breaks: js.UndefOr[scala.Boolean] = js.undefined,
    gfm: js.UndefOr[scala.Boolean] = js.undefined,
    headerIds: js.UndefOr[scala.Boolean] = js.undefined,
    headerPrefix: java.lang.String = null,
    highlight: (/* code */ java.lang.String, /* lang */ java.lang.String, /* callback */ js.UndefOr[js.Function2[/* error */ js.UndefOr[_], /* code */ java.lang.String, scala.Unit]]) => java.lang.String = null,
    langPrefix: java.lang.String = null,
    mangle: js.UndefOr[scala.Boolean] = js.undefined,
    pedantic: js.UndefOr[scala.Boolean] = js.undefined,
    renderer: Renderer = null,
    sanitize: js.UndefOr[scala.Boolean] = js.undefined,
    sanitizer: /* html */ java.lang.String => java.lang.String = null,
    silent: js.UndefOr[scala.Boolean] = js.undefined,
    smartLists: js.UndefOr[scala.Boolean] = js.undefined,
    smartypants: js.UndefOr[scala.Boolean] = js.undefined,
    tables: js.UndefOr[scala.Boolean] = js.undefined,
    xhtml: js.UndefOr[scala.Boolean] = js.undefined
  ): MarkedOptions = {
    val __obj = js.Dynamic.literal()
    if (baseUrl != null) __obj.updateDynamic("baseUrl")(baseUrl)
    if (!js.isUndefined(breaks)) __obj.updateDynamic("breaks")(breaks)
    if (!js.isUndefined(gfm)) __obj.updateDynamic("gfm")(gfm)
    if (!js.isUndefined(headerIds)) __obj.updateDynamic("headerIds")(headerIds)
    if (headerPrefix != null) __obj.updateDynamic("headerPrefix")(headerPrefix)
    if (highlight != null) __obj.updateDynamic("highlight")(js.Any.fromFunction3(highlight))
    if (langPrefix != null) __obj.updateDynamic("langPrefix")(langPrefix)
    if (!js.isUndefined(mangle)) __obj.updateDynamic("mangle")(mangle)
    if (!js.isUndefined(pedantic)) __obj.updateDynamic("pedantic")(pedantic)
    if (renderer != null) __obj.updateDynamic("renderer")(renderer)
    if (!js.isUndefined(sanitize)) __obj.updateDynamic("sanitize")(sanitize)
    if (sanitizer != null) __obj.updateDynamic("sanitizer")(js.Any.fromFunction1(sanitizer))
    if (!js.isUndefined(silent)) __obj.updateDynamic("silent")(silent)
    if (!js.isUndefined(smartLists)) __obj.updateDynamic("smartLists")(smartLists)
    if (!js.isUndefined(smartypants)) __obj.updateDynamic("smartypants")(smartypants)
    if (!js.isUndefined(tables)) __obj.updateDynamic("tables")(tables)
    if (!js.isUndefined(xhtml)) __obj.updateDynamic("xhtml")(xhtml)
    __obj.asInstanceOf[MarkedOptions]
  }
}

