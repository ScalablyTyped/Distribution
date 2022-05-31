package typings.marked

import typings.marked.anon.Typeofmarked
import typings.marked.mod.MarkedOptions
import typings.marked.mod.Rules
import typings.marked.mod.Token
import typings.marked.mod.TokensList
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object marked {
    
    /**
      * Compiles markdown to HTML synchronously.
      *
      * @param src String of markdown source to be compiled
      * @param options Optional hash of options
      * @return String of compiled HTML
      */
    inline def apply(src: String): String = ^.asInstanceOf[js.Dynamic].apply(src.asInstanceOf[js.Any]).asInstanceOf[String]
    /**
      * Compiles markdown to HTML asynchronously.
      *
      * @param src String of markdown source to be compiled
      * @param callback Function called when the markdownString has been fully parsed when using async highlighting
      */
    inline def apply(
      src: String,
      callback: js.Function2[/* error */ js.UndefOr[js.Any], /* parseResult */ String, Unit]
    ): Unit = (^.asInstanceOf[js.Dynamic].apply(src.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def apply(src: String, options: MarkedOptions): String = (^.asInstanceOf[js.Dynamic].apply(src.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
    /**
      * Compiles markdown to HTML asynchronously.
      *
      * @param src String of markdown source to be compiled
      * @param options Hash of options
      * @param callback Function called when the markdownString has been fully parsed when using async highlighting
      */
    inline def apply(
      src: String,
      options: MarkedOptions,
      callback: js.Function2[/* error */ js.UndefOr[js.Any], /* parseResult */ String, Unit]
    ): Unit = (^.asInstanceOf[js.Dynamic].apply(src.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    @JSGlobal("marked")
    @js.native
    val ^ : js.Any = js.native
    
    @JSGlobal("marked.InlineLexer")
    @js.native
    class InlineLexer_ protected ()
      extends typings.marked.mod.InlineLexer_ {
      def this(links: js.Array[String]) = this()
      def this(links: js.Array[String], options: MarkedOptions) = this()
    }
    object InlineLexer_ {
      
      @JSGlobal("marked.InlineLexer")
      @js.native
      val ^ : js.Any = js.native
      
      /* static member */
      inline def escapes(text: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("escapes")(text.asInstanceOf[js.Any]).asInstanceOf[String]
      
      /* static member */
      inline def output(src: String, links: js.Array[String]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("output")(src.asInstanceOf[js.Any], links.asInstanceOf[js.Any])).asInstanceOf[String]
      inline def output(src: String, links: js.Array[String], options: MarkedOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("output")(src.asInstanceOf[js.Any], links.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
      
      /* static member */
      @JSGlobal("marked.InlineLexer.rules")
      @js.native
      def rules: Rules = js.native
      inline def rules_=(x: Rules): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rules")(x.asInstanceOf[js.Any])
    }
    
    @JSGlobal("marked.Lexer")
    @js.native
    class Lexer_ ()
      extends typings.marked.mod.Lexer_ {
      def this(options: MarkedOptions) = this()
    }
    object Lexer_ {
      
      @JSGlobal("marked.Lexer")
      @js.native
      val ^ : js.Any = js.native
      
      /* static member */
      inline def lex(src: TokensList): TokensList = ^.asInstanceOf[js.Dynamic].applyDynamic("lex")(src.asInstanceOf[js.Any]).asInstanceOf[TokensList]
      inline def lex(src: TokensList, options: MarkedOptions): TokensList = (^.asInstanceOf[js.Dynamic].applyDynamic("lex")(src.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[TokensList]
      
      /* static member */
      @JSGlobal("marked.Lexer.rules")
      @js.native
      def rules: Rules = js.native
      inline def rules_=(x: Rules): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rules")(x.asInstanceOf[js.Any])
    }
    
    @JSGlobal("marked.Parser")
    @js.native
    class Parser_ ()
      extends typings.marked.mod.Parser_ {
      def this(options: MarkedOptions) = this()
    }
    object Parser_ {
      
      @JSGlobal("marked.Parser")
      @js.native
      val ^ : js.Any = js.native
      
      /* static member */
      inline def parse(src: TokensList): String = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(src.asInstanceOf[js.Any]).asInstanceOf[String]
      inline def parse(src: TokensList, options: MarkedOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(src.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
    }
    
    @JSGlobal("marked.Renderer")
    @js.native
    class Renderer ()
      extends typings.marked.mod.Renderer {
      def this(options: MarkedOptions) = this()
    }
    
    @JSGlobal("marked.Slugger")
    @js.native
    class Slugger ()
      extends typings.marked.mod.Slugger
    
    @JSGlobal("marked.TextRenderer")
    @js.native
    class TextRenderer ()
      extends typings.marked.mod.TextRenderer
    
    @JSGlobal("marked.Tokenizer")
    @js.native
    class Tokenizer ()
      extends typings.marked.mod.Tokenizer {
      def this(options: MarkedOptions) = this()
    }
    
    @JSGlobal("marked.defaults")
    @js.native
    val defaults: MarkedOptions = js.native
    
    /**
      * Gets the original marked default options.
      */
    inline def getDefaults(): MarkedOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("getDefaults")().asInstanceOf[MarkedOptions]
    
    /**
      * @param src String of markdown source to be compiled
      * @param links Array of links
      * @param options Hash of options
      * @return String of compiled HTML
      */
    inline def inlineLexer(src: String, links: js.Array[String]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("inlineLexer")(src.asInstanceOf[js.Any], links.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def inlineLexer(src: String, links: js.Array[String], options: MarkedOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("inlineLexer")(src.asInstanceOf[js.Any], links.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
    
    /**
      * @param src String of markdown source to be compiled
      * @param options Hash of options
      */
    inline def lexer(src: String): TokensList = ^.asInstanceOf[js.Dynamic].applyDynamic("lexer")(src.asInstanceOf[js.Any]).asInstanceOf[TokensList]
    inline def lexer(src: String, options: MarkedOptions): TokensList = (^.asInstanceOf[js.Dynamic].applyDynamic("lexer")(src.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[TokensList]
    
    /**
      * Sets the default options.
      *
      * @param options Hash of options
      */
    inline def options(options: MarkedOptions): Typeofmarked = ^.asInstanceOf[js.Dynamic].applyDynamic("options")(options.asInstanceOf[js.Any]).asInstanceOf[Typeofmarked]
    
    /**
      * Compiles markdown to HTML.
      *
      * @param src String of markdown source to be compiled
      * @param options Hash of options
      * @param callback Function called when the markdownString has been fully parsed when using async highlighting
      * @return String of compiled HTML
      */
    inline def parse(src: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(src.asInstanceOf[js.Any]).asInstanceOf[String]
    /**
      * Compiles markdown to HTML.
      *
      * @param src String of markdown source to be compiled
      * @param callback Function called when the markdownString has been fully parsed when using async highlighting
      * @return String of compiled HTML
      */
    inline def parse(
      src: String,
      callback: js.Function2[/* error */ js.UndefOr[js.Any], /* parseResult */ String, Unit]
    ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(src.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def parse(
      src: String,
      options: Unit,
      callback: js.Function2[/* error */ js.UndefOr[js.Any], /* parseResult */ String, Unit]
    ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(src.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def parse(src: String, options: MarkedOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(src.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def parse(
      src: String,
      options: MarkedOptions,
      callback: js.Function2[/* error */ js.UndefOr[js.Any], /* parseResult */ String, Unit]
    ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(src.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[String]
    
    /**
      * Compiles markdown to HTML without enclosing `p` tag.
      *
      * @param src String of markdown source to be compiled
      * @param options Hash of options
      * @return String of compiled HTML
      */
    inline def parseInline(src: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("parseInline")(src.asInstanceOf[js.Any]).asInstanceOf[String]
    inline def parseInline(src: String, options: MarkedOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("parseInline")(src.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
    
    /**
      * @param src Tokenized source as array of tokens
      * @param options Hash of options
      */
    inline def parser(src: TokensList): String = ^.asInstanceOf[js.Dynamic].applyDynamic("parser")(src.asInstanceOf[js.Any]).asInstanceOf[String]
    inline def parser(src: TokensList, options: MarkedOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("parser")(src.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
    
    /**
      * Sets the default options.
      *
      * @param options Hash of options
      */
    inline def setOptions(options: MarkedOptions): Typeofmarked = ^.asInstanceOf[js.Dynamic].applyDynamic("setOptions")(options.asInstanceOf[js.Any]).asInstanceOf[Typeofmarked]
    
    /**
      * Use Extension
      * @param Renderer
      */
    inline def use(options: MarkedOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("use")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def walkTokens(tokens: TokensList, callback: js.Function1[/* token */ Token, Unit]): Typeofmarked = (^.asInstanceOf[js.Dynamic].applyDynamic("walkTokens")(tokens.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Typeofmarked]
  }
}
