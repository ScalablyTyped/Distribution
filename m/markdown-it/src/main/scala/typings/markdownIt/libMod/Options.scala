package typings.markdownIt.libMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  /**
    * Set `true` to convert `\n` in paragraphs into `<br>`.
    * @default false
    */
  var breaks: js.UndefOr[Boolean] = js.native
  /**
    * Highlighter function for fenced code blocks.
    * Highlighter `function (str, lang)` should return escaped HTML. It can also
    * return empty string if the source was not changed and should be escaped
    * externaly. If result starts with <pre... internal wrapper is skipped.
    * @default null
    */
  var highlight: js.UndefOr[(js.Function2[/* str */ String, /* lang */ String, String]) | Null] = js.native
  /**
    * Set `true` to enable HTML tags in source. Be careful!
    * That's not safe! You may need external sanitizer to protect output from XSS.
    * It's better to extend features via plugins, instead of enabling HTML.
    * @default false
    */
  var html: js.UndefOr[Boolean] = js.native
  /**
    * CSS language class prefix for fenced blocks.
    * Can be useful for external highlighters.
    * @default 'language-'
    */
  var langPrefix: js.UndefOr[String] = js.native
  /**
    * Set `true` to autoconvert URL-like text to links.
    * @default false
    */
  var linkify: js.UndefOr[Boolean] = js.native
  /**
    * Double + single quotes replacement
    * pairs, when typographer enabled and smartquotes on. For example, you can
    * use `'«»„“'` for Russian, `'„“‚‘'` for German, and
    * `['«\xA0', '\xA0»', '‹\xA0', '\xA0›']` for French (including nbsp).
    * @default '“”‘’'
    */
  var quotes: js.UndefOr[String | js.Array[String]] = js.native
  /**
    * Set `true` to enable [some language-neutral replacement](https://github.com/markdown-it/markdown-it/blob/master/lib/rules_core/replacements.js) +
    * quotes beautification (smartquotes).
    * @default false
    */
  var typographer: js.UndefOr[Boolean] = js.native
  /**
    * Set `true` to add '/' when closing single tags
    * (`<br />`). This is needed only for full CommonMark compatibility. In real
    * world you will need HTML output.
    * @default false
    */
  var xhtmlOut: js.UndefOr[Boolean] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
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
    def setBreaks(value: Boolean): Self = this.set("breaks", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBreaks: Self = this.set("breaks", js.undefined)
    @scala.inline
    def setHighlight(value: (/* str */ String, /* lang */ String) => String): Self = this.set("highlight", js.Any.fromFunction2(value))
    @scala.inline
    def deleteHighlight: Self = this.set("highlight", js.undefined)
    @scala.inline
    def setHighlightNull: Self = this.set("highlight", null)
    @scala.inline
    def setHtml(value: Boolean): Self = this.set("html", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHtml: Self = this.set("html", js.undefined)
    @scala.inline
    def setLangPrefix(value: String): Self = this.set("langPrefix", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLangPrefix: Self = this.set("langPrefix", js.undefined)
    @scala.inline
    def setLinkify(value: Boolean): Self = this.set("linkify", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLinkify: Self = this.set("linkify", js.undefined)
    @scala.inline
    def setQuotesVarargs(value: String*): Self = this.set("quotes", js.Array(value :_*))
    @scala.inline
    def setQuotes(value: String | js.Array[String]): Self = this.set("quotes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQuotes: Self = this.set("quotes", js.undefined)
    @scala.inline
    def setTypographer(value: Boolean): Self = this.set("typographer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTypographer: Self = this.set("typographer", js.undefined)
    @scala.inline
    def setXhtmlOut(value: Boolean): Self = this.set("xhtmlOut", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteXhtmlOut: Self = this.set("xhtmlOut", js.undefined)
  }
  
}

