package typings.marked

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typings.marked.markedStrings.center
import typings.marked.markedStrings.left
import typings.marked.markedStrings.right
import typings.marked.mod.InlineLexer_
import typings.marked.mod.Lexer_
import typings.marked.mod.MarkedOptions
import typings.marked.mod.Parser_
import typings.marked.mod.Rules
import typings.marked.mod.Token
import typings.marked.mod.TokensList
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Align extends StObject {
    
    var align: center | left | right | Null = js.native
    
    var header: Boolean = js.native
  }
  object Align {
    
    @scala.inline
    def apply(header: Boolean): Align = {
      val __obj = js.Dynamic.literal(header = header.asInstanceOf[js.Any])
      __obj.asInstanceOf[Align]
    }
    
    @scala.inline
    implicit class AlignMutableBuilder[Self <: Align] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAlign(value: center | left | right): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlignNull: Self = StObject.set(x, "align", null)
      
      @scala.inline
      def setHeader(value: Boolean): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Href extends StObject {
    
    var href: String | Null = js.native
    
    var title: String | Null = js.native
  }
  object Href {
    
    @scala.inline
    def apply(): Href = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Href]
    }
    
    @scala.inline
    implicit class HrefMutableBuilder[Self <: Href] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHref(value: String): Self = StObject.set(x, "href", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHrefNull: Self = StObject.set(x, "href", null)
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleNull: Self = StObject.set(x, "title", null)
    }
  }
  
  @js.native
  trait TypeofInlineLexer extends StObject {
    
    /* static member */
    def escapes(text: String): String = js.native
    
    /* static member */
    def output(src: String, links: js.Array[String]): String = js.native
    def output(src: String, links: js.Array[String], options: MarkedOptions): String = js.native
    
    /* static member */
    var rules: Rules = js.native
  }
  
  @js.native
  trait TypeofLexer extends StObject {
    
    /* static member */
    def lex(src: TokensList): TokensList = js.native
    def lex(src: TokensList, options: MarkedOptions): TokensList = js.native
    
    /* static member */
    var rules: Rules = js.native
  }
  
  @js.native
  trait TypeofParser extends StObject {
    
    /* static member */
    def parse(src: TokensList): String = js.native
    def parse(src: TokensList, options: MarkedOptions): String = js.native
  }
  
  @js.native
  trait Typeofmarked extends StObject {
    
    /**
      * Compiles markdown to HTML synchronously.
      *
      * @param src String of markdown source to be compiled
      * @param options Optional hash of options
      * @return String of compiled HTML
      */
    def apply(src: String): String = js.native
    /**
      * Compiles markdown to HTML asynchronously.
      *
      * @param src String of markdown source to be compiled
      * @param callback Function called when the markdownString has been fully parsed when using async highlighting
      */
    def apply(
      src: String,
      callback: js.Function2[/* error */ js.UndefOr[js.Any], /* parseResult */ String, Unit]
    ): Unit = js.native
    def apply(src: String, options: MarkedOptions): String = js.native
    /**
      * Compiles markdown to HTML asynchronously.
      *
      * @param src String of markdown source to be compiled
      * @param options Hash of options
      * @param callback Function called when the markdownString has been fully parsed when using async highlighting
      */
    def apply(
      src: String,
      options: MarkedOptions,
      callback: js.Function2[/* error */ js.UndefOr[js.Any], /* parseResult */ String, Unit]
    ): Unit = js.native
    
    var InlineLexer: (Instantiable2[/* links */ js.Array[String], /* options */ js.UndefOr[MarkedOptions], InlineLexer_]) with TypeofInlineLexer = js.native
    
    var Lexer: (Instantiable1[/* options */ js.UndefOr[MarkedOptions], Lexer_]) with TypeofLexer = js.native
    
    var Parser: (Instantiable1[/* options */ js.UndefOr[MarkedOptions], Parser_]) with TypeofParser = js.native
    
    var Renderer: Instantiable1[/* options */ js.UndefOr[MarkedOptions], typings.marked.mod.Renderer] = js.native
    
    var Slugger: Instantiable0[typings.marked.mod.Slugger] = js.native
    
    var TextRenderer: Instantiable0[typings.marked.mod.TextRenderer] = js.native
    
    var Tokenizer: Instantiable1[/* options */ js.UndefOr[MarkedOptions], typings.marked.mod.Tokenizer] = js.native
    
    val Tokens: js.Any = js.native
    
    val defaults: MarkedOptions = js.native
    
    /**
      * Gets the original marked default options.
      */
    def getDefaults(): MarkedOptions = js.native
    
    /**
      * @param src String of markdown source to be compiled
      * @param links Array of links
      * @param options Hash of options
      * @return String of compiled HTML
      */
    def inlineLexer(src: String, links: js.Array[String]): String = js.native
    def inlineLexer(src: String, links: js.Array[String], options: MarkedOptions): String = js.native
    
    /**
      * @param src String of markdown source to be compiled
      * @param options Hash of options
      */
    def lexer(src: String): TokensList = js.native
    def lexer(src: String, options: MarkedOptions): TokensList = js.native
    
    /**
      * Sets the default options.
      *
      * @param options Hash of options
      */
    def options(options: MarkedOptions): /* import warning: importer.ImportType#apply Failed type conversion: typeof marked */ js.Any = js.native
    
    /**
      * Compiles markdown to HTML.
      *
      * @param src String of markdown source to be compiled
      * @param options Hash of options
      * @param callback Function called when the markdownString has been fully parsed when using async highlighting
      * @return String of compiled HTML
      */
    def parse(src: String): String = js.native
    /**
      * Compiles markdown to HTML.
      *
      * @param src String of markdown source to be compiled
      * @param callback Function called when the markdownString has been fully parsed when using async highlighting
      * @return String of compiled HTML
      */
    def parse(
      src: String,
      callback: js.Function2[/* error */ js.UndefOr[js.Any], /* parseResult */ String, Unit]
    ): String = js.native
    def parse(
      src: String,
      options: js.UndefOr[scala.Nothing],
      callback: js.Function2[/* error */ js.UndefOr[js.Any], /* parseResult */ String, Unit]
    ): String = js.native
    def parse(src: String, options: MarkedOptions): String = js.native
    def parse(
      src: String,
      options: MarkedOptions,
      callback: js.Function2[/* error */ js.UndefOr[js.Any], /* parseResult */ String, Unit]
    ): String = js.native
    
    /**
      * Compiles markdown to HTML without enclosing `p` tag.
      *
      * @param src String of markdown source to be compiled
      * @param options Hash of options
      * @return String of compiled HTML
      */
    def parseInline(src: String): String = js.native
    def parseInline(src: String, options: MarkedOptions): String = js.native
    
    /**
      * @param src Tokenized source as array of tokens
      * @param options Hash of options
      */
    def parser(src: TokensList): String = js.native
    def parser(src: TokensList, options: MarkedOptions): String = js.native
    
    /**
      * Sets the default options.
      *
      * @param options Hash of options
      */
    def setOptions(options: MarkedOptions): /* import warning: importer.ImportType#apply Failed type conversion: typeof marked */ js.Any = js.native
    
    /**
      * Use Extension
      * @param Renderer
      */
    def use(options: MarkedOptions): Unit = js.native
    
    def walkTokens(tokens: TokensList, callback: js.Function1[/* token */ Token, Unit]): /* import warning: importer.ImportType#apply Failed type conversion: typeof marked */ js.Any = js.native
  }
}
