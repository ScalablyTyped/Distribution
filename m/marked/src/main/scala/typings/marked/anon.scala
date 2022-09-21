package typings.marked

import typings.marked.markedBooleans.`true`
import typings.marked.markedStrings.center
import typings.marked.markedStrings.left
import typings.marked.markedStrings.right
import typings.marked.mod.marked.MarkedOptions
import typings.marked.mod.marked.Renderer
import typings.marked.mod.marked.Token
import typings.marked.mod.marked.Tokenizer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Align extends StObject {
    
    var align: center | left | right | Null
    
    var header: Boolean
  }
  object Align {
    
    inline def apply(header: Boolean): Align = {
      val __obj = js.Dynamic.literal(header = header.asInstanceOf[js.Any], align = null)
      __obj.asInstanceOf[Align]
    }
    
    extension [Self <: Align](x: Self) {
      
      inline def setAlign(value: center | left | right): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
      
      inline def setAlignNull: Self = StObject.set(x, "align", null)
      
      inline def setHeader(value: Boolean): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait FnCall extends StObject {
    
    def apply(src: String): String = js.native
    def apply(src: String, callback: js.Function2[/* error */ Any, /* parseResult */ String, Unit]): Unit = js.native
    def apply(src: String, options: MarkedOptionsasynctrue): js.Promise[String] = js.native
    def apply(src: String, options: MarkedOptions): String = js.native
    def apply(
      src: String,
      options: MarkedOptions,
      callback: js.Function2[/* error */ Any, /* parseResult */ String, Unit]
    ): Unit = js.native
  }
  
  trait Href extends StObject {
    
    var href: String | Null
    
    var title: String | Null
  }
  object Href {
    
    inline def apply(): Href = {
      val __obj = js.Dynamic.literal(href = null, title = null)
      __obj.asInstanceOf[Href]
    }
    
    extension [Self <: Href](x: Self) {
      
      inline def setHref(value: String): Self = StObject.set(x, "href", value.asInstanceOf[js.Any])
      
      inline def setHrefNull: Self = StObject.set(x, "href", null)
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleNull: Self = StObject.set(x, "title", null)
    }
  }
  
  trait InLink extends StObject {
    
    var inLink: Boolean
    
    var inRawBlock: Boolean
    
    var top: Boolean
  }
  object InLink {
    
    inline def apply(inLink: Boolean, inRawBlock: Boolean, top: Boolean): InLink = {
      val __obj = js.Dynamic.literal(inLink = inLink.asInstanceOf[js.Any], inRawBlock = inRawBlock.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any])
      __obj.asInstanceOf[InLink]
    }
    
    extension [Self <: InLink](x: Self) {
      
      inline def setInLink(value: Boolean): Self = StObject.set(x, "inLink", value.asInstanceOf[js.Any])
      
      inline def setInRawBlock(value: Boolean): Self = StObject.set(x, "inRawBlock", value.asInstanceOf[js.Any])
      
      inline def setTop(value: Boolean): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined marked.marked.marked.MarkedOptions & {  async :true} */
  trait MarkedOptionsasynctrue extends StObject {
    
    var async: js.UndefOr[Boolean] & `true`
    
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
  object MarkedOptionsasynctrue {
    
    inline def apply(async: js.UndefOr[Boolean] & `true`): MarkedOptionsasynctrue = {
      val __obj = js.Dynamic.literal(async = async.asInstanceOf[js.Any])
      __obj.asInstanceOf[MarkedOptionsasynctrue]
    }
    
    extension [Self <: MarkedOptionsasynctrue](x: Self) {
      
      inline def setAsync(value: js.UndefOr[Boolean] & `true`): Self = StObject.set(x, "async", value.asInstanceOf[js.Any])
      
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
}
