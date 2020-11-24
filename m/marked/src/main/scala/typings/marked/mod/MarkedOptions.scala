package typings.marked.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MarkedOptions extends js.Object {
  
  /**
    * A prefix URL for any relative link.
    */
  var baseUrl: js.UndefOr[String] = js.native
  
  /**
    * Enable GFM line breaks. This option requires the gfm option to be true.
    */
  var breaks: js.UndefOr[Boolean] = js.native
  
  /**
    * Enable GitHub flavored markdown.
    */
  var gfm: js.UndefOr[Boolean] = js.native
  
  /**
    * Include an id attribute when emitting headings.
    */
  var headerIds: js.UndefOr[Boolean] = js.native
  
  /**
    * Set the prefix for header tag ids.
    */
  var headerPrefix: js.UndefOr[String] = js.native
  
  /**
    * A function to highlight code blocks. The function can either be
    * synchronous (returning a string) or asynchronous (callback invoked
    * with an error if any occurred during highlighting and a string
    * if highlighting was successful)
    */
  var highlight: js.UndefOr[
    js.Function3[
      /* code */ String, 
      /* lang */ String, 
      /* callback */ js.UndefOr[
        js.Function2[/* error */ js.UndefOr[js.Any], /* code */ js.UndefOr[String], Unit]
      ], 
      String | Unit
    ]
  ] = js.native
  
  /**
    * Set the prefix for code block classes.
    */
  var langPrefix: js.UndefOr[String] = js.native
  
  /**
    * Mangle autolinks (<email@domain.com>).
    */
  var mangle: js.UndefOr[Boolean] = js.native
  
  /**
    * Conform to obscure parts of markdown.pl as much as possible. Don't fix any of the original markdown bugs or poor behavior.
    */
  var pedantic: js.UndefOr[Boolean] = js.native
  
  /**
    * Type: object Default: new Renderer()
    *
    * An object containing functions to render tokens to HTML.
    */
  var renderer: js.UndefOr[Renderer] = js.native
  
  /**
    * Sanitize the output. Ignore any HTML that has been input.
    */
  var sanitize: js.UndefOr[Boolean] = js.native
  
  /**
    * Optionally sanitize found HTML with a sanitizer function.
    */
  var sanitizer: js.UndefOr[js.Function1[/* html */ String, String]] = js.native
  
  /**
    * Shows an HTML error message when rendering fails.
    */
  var silent: js.UndefOr[Boolean] = js.native
  
  /**
    * Use smarter list behavior than the original markdown. May eventually be default with the old behavior moved into pedantic.
    */
  var smartLists: js.UndefOr[Boolean] = js.native
  
  /**
    * Use "smart" typograhic punctuation for things like quotes and dashes.
    */
  var smartypants: js.UndefOr[Boolean] = js.native
  
  /**
    * The tokenizer defines how to turn markdown text into tokens.
    */
  var tokenizer: js.UndefOr[Tokenizer] = js.native
  
  /**
    * The walkTokens function gets called with every token.
    * Child tokens are called before moving on to sibling tokens.
    * Each token is passed by reference so updates are persisted when passed to the parser.
    * The return value of the function is ignored.
    */
  var walkTokens: js.UndefOr[
    js.Function2[/* tokens */ TokensList, /* callback */ js.Function1[/* token */ Token, Unit], _]
  ] = js.native
  
  /**
    * Generate closing slash for self-closing tags (<br/> instead of <br>)
    */
  var xhtml: js.UndefOr[Boolean] = js.native
}
object MarkedOptions {
  
  @scala.inline
  def apply(): MarkedOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MarkedOptions]
  }
  
  @scala.inline
  implicit class MarkedOptionsOps[Self <: MarkedOptions] (val x: Self) extends AnyVal {
    
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
    def setBaseUrl(value: String): Self = this.set("baseUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBaseUrl: Self = this.set("baseUrl", js.undefined)
    
    @scala.inline
    def setBreaks(value: Boolean): Self = this.set("breaks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBreaks: Self = this.set("breaks", js.undefined)
    
    @scala.inline
    def setGfm(value: Boolean): Self = this.set("gfm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGfm: Self = this.set("gfm", js.undefined)
    
    @scala.inline
    def setHeaderIds(value: Boolean): Self = this.set("headerIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeaderIds: Self = this.set("headerIds", js.undefined)
    
    @scala.inline
    def setHeaderPrefix(value: String): Self = this.set("headerPrefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeaderPrefix: Self = this.set("headerPrefix", js.undefined)
    
    @scala.inline
    def setHighlight(
      value: (/* code */ String, /* lang */ String, /* callback */ js.UndefOr[
          js.Function2[/* error */ js.UndefOr[js.Any], /* code */ js.UndefOr[String], Unit]
        ]) => String | Unit
    ): Self = this.set("highlight", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteHighlight: Self = this.set("highlight", js.undefined)
    
    @scala.inline
    def setLangPrefix(value: String): Self = this.set("langPrefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLangPrefix: Self = this.set("langPrefix", js.undefined)
    
    @scala.inline
    def setMangle(value: Boolean): Self = this.set("mangle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMangle: Self = this.set("mangle", js.undefined)
    
    @scala.inline
    def setPedantic(value: Boolean): Self = this.set("pedantic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePedantic: Self = this.set("pedantic", js.undefined)
    
    @scala.inline
    def setRenderer(value: Renderer): Self = this.set("renderer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRenderer: Self = this.set("renderer", js.undefined)
    
    @scala.inline
    def setSanitize(value: Boolean): Self = this.set("sanitize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSanitize: Self = this.set("sanitize", js.undefined)
    
    @scala.inline
    def setSanitizer(value: /* html */ String => String): Self = this.set("sanitizer", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSanitizer: Self = this.set("sanitizer", js.undefined)
    
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
    def setTokenizer(value: Tokenizer): Self = this.set("tokenizer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTokenizer: Self = this.set("tokenizer", js.undefined)
    
    @scala.inline
    def setWalkTokens(value: (/* tokens */ TokensList, /* callback */ js.Function1[/* token */ Token, Unit]) => _): Self = this.set("walkTokens", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteWalkTokens: Self = this.set("walkTokens", js.undefined)
    
    @scala.inline
    def setXhtml(value: Boolean): Self = this.set("xhtml", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteXhtml: Self = this.set("xhtml", js.undefined)
  }
}
