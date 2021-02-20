package typings.marked.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MarkedOptions extends StObject {
  
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
  implicit class MarkedOptionsMutableBuilder[Self <: MarkedOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBaseUrl(value: String): Self = StObject.set(x, "baseUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBaseUrlUndefined: Self = StObject.set(x, "baseUrl", js.undefined)
    
    @scala.inline
    def setBreaks(value: Boolean): Self = StObject.set(x, "breaks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBreaksUndefined: Self = StObject.set(x, "breaks", js.undefined)
    
    @scala.inline
    def setGfm(value: Boolean): Self = StObject.set(x, "gfm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGfmUndefined: Self = StObject.set(x, "gfm", js.undefined)
    
    @scala.inline
    def setHeaderIds(value: Boolean): Self = StObject.set(x, "headerIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaderIdsUndefined: Self = StObject.set(x, "headerIds", js.undefined)
    
    @scala.inline
    def setHeaderPrefix(value: String): Self = StObject.set(x, "headerPrefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaderPrefixUndefined: Self = StObject.set(x, "headerPrefix", js.undefined)
    
    @scala.inline
    def setHighlight(
      value: (/* code */ String, /* lang */ String, /* callback */ js.UndefOr[
          js.Function2[/* error */ js.UndefOr[js.Any], /* code */ js.UndefOr[String], Unit]
        ]) => String | Unit
    ): Self = StObject.set(x, "highlight", js.Any.fromFunction3(value))
    
    @scala.inline
    def setHighlightUndefined: Self = StObject.set(x, "highlight", js.undefined)
    
    @scala.inline
    def setLangPrefix(value: String): Self = StObject.set(x, "langPrefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLangPrefixUndefined: Self = StObject.set(x, "langPrefix", js.undefined)
    
    @scala.inline
    def setMangle(value: Boolean): Self = StObject.set(x, "mangle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMangleUndefined: Self = StObject.set(x, "mangle", js.undefined)
    
    @scala.inline
    def setPedantic(value: Boolean): Self = StObject.set(x, "pedantic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPedanticUndefined: Self = StObject.set(x, "pedantic", js.undefined)
    
    @scala.inline
    def setRenderer(value: Renderer): Self = StObject.set(x, "renderer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRendererUndefined: Self = StObject.set(x, "renderer", js.undefined)
    
    @scala.inline
    def setSanitize(value: Boolean): Self = StObject.set(x, "sanitize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSanitizeUndefined: Self = StObject.set(x, "sanitize", js.undefined)
    
    @scala.inline
    def setSanitizer(value: /* html */ String => String): Self = StObject.set(x, "sanitizer", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSanitizerUndefined: Self = StObject.set(x, "sanitizer", js.undefined)
    
    @scala.inline
    def setSilent(value: Boolean): Self = StObject.set(x, "silent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSilentUndefined: Self = StObject.set(x, "silent", js.undefined)
    
    @scala.inline
    def setSmartLists(value: Boolean): Self = StObject.set(x, "smartLists", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSmartListsUndefined: Self = StObject.set(x, "smartLists", js.undefined)
    
    @scala.inline
    def setSmartypants(value: Boolean): Self = StObject.set(x, "smartypants", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSmartypantsUndefined: Self = StObject.set(x, "smartypants", js.undefined)
    
    @scala.inline
    def setTokenizer(value: Tokenizer): Self = StObject.set(x, "tokenizer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTokenizerUndefined: Self = StObject.set(x, "tokenizer", js.undefined)
    
    @scala.inline
    def setWalkTokens(value: (/* tokens */ TokensList, /* callback */ js.Function1[/* token */ Token, Unit]) => _): Self = StObject.set(x, "walkTokens", js.Any.fromFunction2(value))
    
    @scala.inline
    def setWalkTokensUndefined: Self = StObject.set(x, "walkTokens", js.undefined)
    
    @scala.inline
    def setXhtml(value: Boolean): Self = StObject.set(x, "xhtml", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXhtmlUndefined: Self = StObject.set(x, "xhtml", js.undefined)
  }
}
