package typings.markdownIt.libMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
    * Set `true` to convert `\n` in paragraphs into `<br>`.
    * @default false
    */
  var breaks: js.UndefOr[Boolean] = js.undefined
  /**
    * Highlighter function for fenced code blocks.
    * Highlighter `function (str, lang)` should return escaped HTML. It can also
    * return empty string if the source was not changed and should be escaped
    * externaly. If result starts with <pre... internal wrapper is skipped.
    * @default null
    */
  var highlight: js.UndefOr[(js.Function2[/* str */ String, /* lang */ String, String]) | Null] = js.undefined
  /**
    * Set `true` to enable HTML tags in source. Be careful!
    * That's not safe! You may need external sanitizer to protect output from XSS.
    * It's better to extend features via plugins, instead of enabling HTML.
    * @default false
    */
  var html: js.UndefOr[Boolean] = js.undefined
  /**
    * CSS language class prefix for fenced blocks.
    * Can be useful for external highlighters.
    * @default 'language-'
    */
  var langPrefix: js.UndefOr[String] = js.undefined
  /**
    * Set `true` to autoconvert URL-like text to links.
    * @default false
    */
  var linkify: js.UndefOr[Boolean] = js.undefined
  /**
    * Double + single quotes replacement
    * pairs, when typographer enabled and smartquotes on. For example, you can
    * use `'«»„“'` for Russian, `'„“‚‘'` for German, and
    * `['«\xA0', '\xA0»', '‹\xA0', '\xA0›']` for French (including nbsp).
    * @default '“”‘’'
    */
  var quotes: js.UndefOr[String | js.Array[String]] = js.undefined
  /**
    * Set `true` to enable [some language-neutral replacement](https://github.com/markdown-it/markdown-it/blob/master/lib/rules_core/replacements.js) +
    * quotes beautification (smartquotes).
    * @default false
    */
  var typographer: js.UndefOr[Boolean] = js.undefined
  /**
    * Set `true` to add '/' when closing single tags
    * (`<br />`). This is needed only for full CommonMark compatibility. In real
    * world you will need HTML output.
    * @default false
    */
  var xhtmlOut: js.UndefOr[Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    breaks: js.UndefOr[Boolean] = js.undefined,
    highlight: (/* str */ String, /* lang */ String) => String = null,
    html: js.UndefOr[Boolean] = js.undefined,
    langPrefix: String = null,
    linkify: js.UndefOr[Boolean] = js.undefined,
    quotes: String | js.Array[String] = null,
    typographer: js.UndefOr[Boolean] = js.undefined,
    xhtmlOut: js.UndefOr[Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(breaks)) __obj.updateDynamic("breaks")(breaks.asInstanceOf[js.Any])
    if (highlight != null) __obj.updateDynamic("highlight")(js.Any.fromFunction2(highlight))
    if (!js.isUndefined(html)) __obj.updateDynamic("html")(html.asInstanceOf[js.Any])
    if (langPrefix != null) __obj.updateDynamic("langPrefix")(langPrefix.asInstanceOf[js.Any])
    if (!js.isUndefined(linkify)) __obj.updateDynamic("linkify")(linkify.asInstanceOf[js.Any])
    if (quotes != null) __obj.updateDynamic("quotes")(quotes.asInstanceOf[js.Any])
    if (!js.isUndefined(typographer)) __obj.updateDynamic("typographer")(typographer.asInstanceOf[js.Any])
    if (!js.isUndefined(xhtmlOut)) __obj.updateDynamic("xhtmlOut")(xhtmlOut.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

