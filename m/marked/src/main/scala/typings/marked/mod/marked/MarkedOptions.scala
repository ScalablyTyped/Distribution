package typings.marked.mod.marked

import typings.marked.anon.Postprocess
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent std.Omit<marked.marked.marked.MarkedExtension, 'extensions'> */
trait MarkedOptions extends StObject {
  
  var async: js.UndefOr[Boolean] = js.undefined
  
  var baseUrl: js.UndefOr[String] = js.undefined
  
  var breaks: js.UndefOr[Boolean] = js.undefined
  
  var gfm: js.UndefOr[Boolean] = js.undefined
  
  var headerIds: js.UndefOr[Boolean] = js.undefined
  
  var headerPrefix: js.UndefOr[String] = js.undefined
  
  var highlight: js.UndefOr[
    js.Function3[
      /* code */ String, 
      /* lang */ String, 
      /* callback */ js.UndefOr[js.Function2[/* error */ Any, /* code */ js.UndefOr[String], Unit]], 
      String | Unit
    ]
  ] = js.undefined
  
  var hooks: js.UndefOr[Postprocess] = js.undefined
  
  var langPrefix: js.UndefOr[String] = js.undefined
  
  var mangle: js.UndefOr[Boolean] = js.undefined
  
  var pedantic: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Type: object Default: new Renderer()
    *
    * An object containing functions to render tokens to HTML.
    */
  var renderer: js.UndefOr[Renderer[scala.Nothing]] = js.undefined
  
  var sanitize: js.UndefOr[Boolean] = js.undefined
  
  var sanitizer: js.UndefOr[js.Function1[/* html */ String, String]] = js.undefined
  
  var silent: js.UndefOr[Boolean] = js.undefined
  
  var smartLists: js.UndefOr[Boolean] = js.undefined
  
  var smartypants: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The tokenizer defines how to turn markdown text into tokens.
    */
  var tokenizer: js.UndefOr[Tokenizer[scala.Nothing]] = js.undefined
  
  var walkTokens: js.UndefOr[js.Function1[/* token */ Token, Unit]] = js.undefined
  
  var xhtml: js.UndefOr[Boolean] = js.undefined
}
object MarkedOptions {
  
  inline def apply(): MarkedOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MarkedOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MarkedOptions] (val x: Self) extends AnyVal {
    
    inline def setAsync(value: Boolean): Self = StObject.set(x, "async", value.asInstanceOf[js.Any])
    
    inline def setAsyncUndefined: Self = StObject.set(x, "async", js.undefined)
    
    inline def setBaseUrl(value: String): Self = StObject.set(x, "baseUrl", value.asInstanceOf[js.Any])
    
    inline def setBaseUrlUndefined: Self = StObject.set(x, "baseUrl", js.undefined)
    
    inline def setBreaks(value: Boolean): Self = StObject.set(x, "breaks", value.asInstanceOf[js.Any])
    
    inline def setBreaksUndefined: Self = StObject.set(x, "breaks", js.undefined)
    
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
    
    inline def setHooks(value: Postprocess): Self = StObject.set(x, "hooks", value.asInstanceOf[js.Any])
    
    inline def setHooksUndefined: Self = StObject.set(x, "hooks", js.undefined)
    
    inline def setLangPrefix(value: String): Self = StObject.set(x, "langPrefix", value.asInstanceOf[js.Any])
    
    inline def setLangPrefixUndefined: Self = StObject.set(x, "langPrefix", js.undefined)
    
    inline def setMangle(value: Boolean): Self = StObject.set(x, "mangle", value.asInstanceOf[js.Any])
    
    inline def setMangleUndefined: Self = StObject.set(x, "mangle", js.undefined)
    
    inline def setPedantic(value: Boolean): Self = StObject.set(x, "pedantic", value.asInstanceOf[js.Any])
    
    inline def setPedanticUndefined: Self = StObject.set(x, "pedantic", js.undefined)
    
    inline def setRenderer(value: Renderer[scala.Nothing]): Self = StObject.set(x, "renderer", value.asInstanceOf[js.Any])
    
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
    
    inline def setTokenizer(value: Tokenizer[scala.Nothing]): Self = StObject.set(x, "tokenizer", value.asInstanceOf[js.Any])
    
    inline def setTokenizerUndefined: Self = StObject.set(x, "tokenizer", js.undefined)
    
    inline def setWalkTokens(value: /* token */ Token => Unit): Self = StObject.set(x, "walkTokens", js.Any.fromFunction1(value))
    
    inline def setWalkTokensUndefined: Self = StObject.set(x, "walkTokens", js.undefined)
    
    inline def setXhtml(value: Boolean): Self = StObject.set(x, "xhtml", value.asInstanceOf[js.Any])
    
    inline def setXhtmlUndefined: Self = StObject.set(x, "xhtml", js.undefined)
  }
}
