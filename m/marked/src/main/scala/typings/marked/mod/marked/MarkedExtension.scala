package typings.marked.mod.marked

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MarkedExtension extends StObject {
  
  /**
    * True will tell marked to await any walkTokens functions before parsing the tokens and returning an HTML string.
    */
  var async: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A prefix URL for any relative link.
    */
  var baseUrl: js.UndefOr[String] = js.undefined
  
  /**
    * Enable GFM line breaks. This option requires the gfm option to be true.
    */
  var breaks: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Add tokenizers and renderers to marked
    */
  var extensions: js.UndefOr[
    js.Array[
      TokenizerExtension | RendererExtension | (TokenizerExtension & RendererExtension)
    ]
  ] = js.undefined
  
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
    * A function to highlight code blocks. The function can either be
    * synchronous (returning a string) or asynchronous (callback invoked
    * with an error if any occurred during highlighting and a string
    * if highlighting was successful)
    */
  var highlight: js.UndefOr[
    js.Function3[
      /* code */ String, 
      /* lang */ String, 
      /* callback */ js.UndefOr[js.Function2[/* error */ Any, /* code */ js.UndefOr[String], Unit]], 
      String | Unit
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
  var renderer: js.UndefOr[Renderer[scala.Nothing] | RendererObject] = js.undefined
  
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
    * The tokenizer defines how to turn markdown text into tokens.
    */
  var tokenizer: js.UndefOr[Tokenizer[scala.Nothing] | TokenizerObject] = js.undefined
  
  /**
    * The walkTokens function gets called with every token.
    * Child tokens are called before moving on to sibling tokens.
    * Each token is passed by reference so updates are persisted when passed to the parser.
    * The return value of the function is ignored.
    */
  var walkTokens: js.UndefOr[js.Function1[/* token */ Token, Unit]] = js.undefined
  
  /**
    * Generate closing slash for self-closing tags (<br/> instead of <br>)
    */
  var xhtml: js.UndefOr[Boolean] = js.undefined
}
object MarkedExtension {
  
  inline def apply(): MarkedExtension = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MarkedExtension]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MarkedExtension] (val x: Self) extends AnyVal {
    
    inline def setAsync(value: Boolean): Self = StObject.set(x, "async", value.asInstanceOf[js.Any])
    
    inline def setAsyncUndefined: Self = StObject.set(x, "async", js.undefined)
    
    inline def setBaseUrl(value: String): Self = StObject.set(x, "baseUrl", value.asInstanceOf[js.Any])
    
    inline def setBaseUrlUndefined: Self = StObject.set(x, "baseUrl", js.undefined)
    
    inline def setBreaks(value: Boolean): Self = StObject.set(x, "breaks", value.asInstanceOf[js.Any])
    
    inline def setBreaksUndefined: Self = StObject.set(x, "breaks", js.undefined)
    
    inline def setExtensions(
      value: js.Array[
          TokenizerExtension | RendererExtension | (TokenizerExtension & RendererExtension)
        ]
    ): Self = StObject.set(x, "extensions", value.asInstanceOf[js.Any])
    
    inline def setExtensionsUndefined: Self = StObject.set(x, "extensions", js.undefined)
    
    inline def setExtensionsVarargs(value: (TokenizerExtension | RendererExtension | (TokenizerExtension & RendererExtension))*): Self = StObject.set(x, "extensions", js.Array(value*))
    
    inline def setGfm(value: Boolean): Self = StObject.set(x, "gfm", value.asInstanceOf[js.Any])
    
    inline def setGfmUndefined: Self = StObject.set(x, "gfm", js.undefined)
    
    inline def setHeaderIds(value: Boolean): Self = StObject.set(x, "headerIds", value.asInstanceOf[js.Any])
    
    inline def setHeaderIdsUndefined: Self = StObject.set(x, "headerIds", js.undefined)
    
    inline def setHeaderPrefix(value: String): Self = StObject.set(x, "headerPrefix", value.asInstanceOf[js.Any])
    
    inline def setHeaderPrefixUndefined: Self = StObject.set(x, "headerPrefix", js.undefined)
    
    inline def setHighlight(
      value: (/* code */ String, /* lang */ String, /* callback */ js.UndefOr[js.Function2[/* error */ Any, /* code */ js.UndefOr[String], Unit]]) => String | Unit
    ): Self = StObject.set(x, "highlight", js.Any.fromFunction3(value))
    
    inline def setHighlightUndefined: Self = StObject.set(x, "highlight", js.undefined)
    
    inline def setLangPrefix(value: String): Self = StObject.set(x, "langPrefix", value.asInstanceOf[js.Any])
    
    inline def setLangPrefixUndefined: Self = StObject.set(x, "langPrefix", js.undefined)
    
    inline def setMangle(value: Boolean): Self = StObject.set(x, "mangle", value.asInstanceOf[js.Any])
    
    inline def setMangleUndefined: Self = StObject.set(x, "mangle", js.undefined)
    
    inline def setPedantic(value: Boolean): Self = StObject.set(x, "pedantic", value.asInstanceOf[js.Any])
    
    inline def setPedanticUndefined: Self = StObject.set(x, "pedantic", js.undefined)
    
    inline def setRenderer(value: Renderer[scala.Nothing] | RendererObject): Self = StObject.set(x, "renderer", value.asInstanceOf[js.Any])
    
    inline def setRendererUndefined: Self = StObject.set(x, "renderer", js.undefined)
    
    inline def setSanitize(value: Boolean): Self = StObject.set(x, "sanitize", value.asInstanceOf[js.Any])
    
    inline def setSanitizeUndefined: Self = StObject.set(x, "sanitize", js.undefined)
    
    inline def setSanitizer(value: /* html */ String => String): Self = StObject.set(x, "sanitizer", js.Any.fromFunction1(value))
    
    inline def setSanitizerUndefined: Self = StObject.set(x, "sanitizer", js.undefined)
    
    inline def setSilent(value: Boolean): Self = StObject.set(x, "silent", value.asInstanceOf[js.Any])
    
    inline def setSilentUndefined: Self = StObject.set(x, "silent", js.undefined)
    
    inline def setSmartLists(value: Boolean): Self = StObject.set(x, "smartLists", value.asInstanceOf[js.Any])
    
    inline def setSmartListsUndefined: Self = StObject.set(x, "smartLists", js.undefined)
    
    inline def setSmartypants(value: Boolean): Self = StObject.set(x, "smartypants", value.asInstanceOf[js.Any])
    
    inline def setSmartypantsUndefined: Self = StObject.set(x, "smartypants", js.undefined)
    
    inline def setTokenizer(value: Tokenizer[scala.Nothing] | TokenizerObject): Self = StObject.set(x, "tokenizer", value.asInstanceOf[js.Any])
    
    inline def setTokenizerUndefined: Self = StObject.set(x, "tokenizer", js.undefined)
    
    inline def setWalkTokens(value: /* token */ Token => Unit): Self = StObject.set(x, "walkTokens", js.Any.fromFunction1(value))
    
    inline def setWalkTokensUndefined: Self = StObject.set(x, "walkTokens", js.undefined)
    
    inline def setXhtml(value: Boolean): Self = StObject.set(x, "xhtml", value.asInstanceOf[js.Any])
    
    inline def setXhtmlUndefined: Self = StObject.set(x, "xhtml", js.undefined)
  }
}
