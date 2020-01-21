package typings.kramed.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KramedOptions extends js.Object {
  /**
    * Enable GFM line breaks. This option requires the gfm option to be true.
    */
  var breaks: js.UndefOr[Boolean] = js.undefined
  /**
    * Enable GitHub flavored kramdown.
    */
  var gfm: js.UndefOr[Boolean] = js.undefined
  /**
    * A function to highlight code blocks. The function takes three arguments: code, lang, and callback.
    */
  var highlight: js.UndefOr[
    js.Function3[
      /* code */ String, 
      /* lang */ String, 
      /* callback */ js.UndefOr[js.Function0[Unit]], 
      String
    ]
  ] = js.undefined
  /**
    * Set the prefix for code block classes.
    */
  var langPrefix: js.UndefOr[String] = js.undefined
  /**
    * Conform to obscure parts of kramdown.pl as much as possible. Don't fix any of the original kramdown bugs or poor behavior.
    */
  var pedantic: js.UndefOr[Boolean] = js.undefined
  /**
    * Type: object Default: new Renderer()
    *
    * An object containing functions to render tokens to HTML.
    */
  var renderer: js.UndefOr[KramedRenderer] = js.undefined
  /**
    * Sanitize the output. Ignore any HTML that has been input.
    */
  var sanitize: js.UndefOr[Boolean] = js.undefined
  /**
    * Shows an HTML error message when rendering fails.
    */
  var silent: js.UndefOr[Boolean] = js.undefined
  /**
    * Use smarter list behavior than the original kramdown. May eventually be default with the old behavior moved into pedantic.
    */
  var smartLists: js.UndefOr[Boolean] = js.undefined
  /**
    * Use "smart" typograhic punctuation for things like quotes and dashes.
    */
  var smartypants: js.UndefOr[Boolean] = js.undefined
  /**
    * Enable GFM tables. This option requires the gfm option to be true.
    */
  var tables: js.UndefOr[Boolean] = js.undefined
}

object KramedOptions {
  @scala.inline
  def apply(
    breaks: js.UndefOr[Boolean] = js.undefined,
    gfm: js.UndefOr[Boolean] = js.undefined,
    highlight: (/* code */ String, /* lang */ String, /* callback */ js.UndefOr[js.Function0[Unit]]) => String = null,
    langPrefix: String = null,
    pedantic: js.UndefOr[Boolean] = js.undefined,
    renderer: KramedRenderer = null,
    sanitize: js.UndefOr[Boolean] = js.undefined,
    silent: js.UndefOr[Boolean] = js.undefined,
    smartLists: js.UndefOr[Boolean] = js.undefined,
    smartypants: js.UndefOr[Boolean] = js.undefined,
    tables: js.UndefOr[Boolean] = js.undefined
  ): KramedOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(breaks)) __obj.updateDynamic("breaks")(breaks.asInstanceOf[js.Any])
    if (!js.isUndefined(gfm)) __obj.updateDynamic("gfm")(gfm.asInstanceOf[js.Any])
    if (highlight != null) __obj.updateDynamic("highlight")(js.Any.fromFunction3(highlight))
    if (langPrefix != null) __obj.updateDynamic("langPrefix")(langPrefix.asInstanceOf[js.Any])
    if (!js.isUndefined(pedantic)) __obj.updateDynamic("pedantic")(pedantic.asInstanceOf[js.Any])
    if (renderer != null) __obj.updateDynamic("renderer")(renderer.asInstanceOf[js.Any])
    if (!js.isUndefined(sanitize)) __obj.updateDynamic("sanitize")(sanitize.asInstanceOf[js.Any])
    if (!js.isUndefined(silent)) __obj.updateDynamic("silent")(silent.asInstanceOf[js.Any])
    if (!js.isUndefined(smartLists)) __obj.updateDynamic("smartLists")(smartLists.asInstanceOf[js.Any])
    if (!js.isUndefined(smartypants)) __obj.updateDynamic("smartypants")(smartypants.asInstanceOf[js.Any])
    if (!js.isUndefined(tables)) __obj.updateDynamic("tables")(tables.asInstanceOf[js.Any])
    __obj.asInstanceOf[KramedOptions]
  }
}

