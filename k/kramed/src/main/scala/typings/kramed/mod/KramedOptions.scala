package typings.kramed.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KramedOptions extends js.Object {
  /**
    * Enable GFM line breaks. This option requires the gfm option to be true.
    */
  var breaks: js.UndefOr[Boolean] = js.native
  /**
    * Enable GitHub flavored kramdown.
    */
  var gfm: js.UndefOr[Boolean] = js.native
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
  ] = js.native
  /**
    * Set the prefix for code block classes.
    */
  var langPrefix: js.UndefOr[String] = js.native
  /**
    * Conform to obscure parts of kramdown.pl as much as possible. Don't fix any of the original kramdown bugs or poor behavior.
    */
  var pedantic: js.UndefOr[Boolean] = js.native
  /**
    * Type: object Default: new Renderer()
    *
    * An object containing functions to render tokens to HTML.
    */
  var renderer: js.UndefOr[KramedRenderer] = js.native
  /**
    * Sanitize the output. Ignore any HTML that has been input.
    */
  var sanitize: js.UndefOr[Boolean] = js.native
  /**
    * Shows an HTML error message when rendering fails.
    */
  var silent: js.UndefOr[Boolean] = js.native
  /**
    * Use smarter list behavior than the original kramdown. May eventually be default with the old behavior moved into pedantic.
    */
  var smartLists: js.UndefOr[Boolean] = js.native
  /**
    * Use "smart" typograhic punctuation for things like quotes and dashes.
    */
  var smartypants: js.UndefOr[Boolean] = js.native
  /**
    * Enable GFM tables. This option requires the gfm option to be true.
    */
  var tables: js.UndefOr[Boolean] = js.native
}

object KramedOptions {
  @scala.inline
  def apply(): KramedOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KramedOptions]
  }
  @scala.inline
  implicit class KramedOptionsOps[Self <: KramedOptions] (val x: Self) extends AnyVal {
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
    def setGfm(value: Boolean): Self = this.set("gfm", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGfm: Self = this.set("gfm", js.undefined)
    @scala.inline
    def setHighlight(
      value: (/* code */ String, /* lang */ String, /* callback */ js.UndefOr[js.Function0[Unit]]) => String
    ): Self = this.set("highlight", js.Any.fromFunction3(value))
    @scala.inline
    def deleteHighlight: Self = this.set("highlight", js.undefined)
    @scala.inline
    def setLangPrefix(value: String): Self = this.set("langPrefix", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLangPrefix: Self = this.set("langPrefix", js.undefined)
    @scala.inline
    def setPedantic(value: Boolean): Self = this.set("pedantic", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePedantic: Self = this.set("pedantic", js.undefined)
    @scala.inline
    def setRenderer(value: KramedRenderer): Self = this.set("renderer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRenderer: Self = this.set("renderer", js.undefined)
    @scala.inline
    def setSanitize(value: Boolean): Self = this.set("sanitize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSanitize: Self = this.set("sanitize", js.undefined)
    @scala.inline
    def setSilent(value: Boolean): Self = this.set("silent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSilent: Self = this.set("silent", js.undefined)
    @scala.inline
    def setSmartLists(value: Boolean): Self = this.set("smartLists", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSmartLists: Self = this.set("smartLists", js.undefined)
    @scala.inline
    def setSmartypants(value: Boolean): Self = this.set("smartypants", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSmartypants: Self = this.set("smartypants", js.undefined)
    @scala.inline
    def setTables(value: Boolean): Self = this.set("tables", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTables: Self = this.set("tables", js.undefined)
  }
  
}

