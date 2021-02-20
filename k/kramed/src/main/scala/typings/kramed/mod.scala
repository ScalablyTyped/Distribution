package typings.kramed

import org.scalablytyped.runtime.Shortcut
import typings.kramed.anon.Align
import typings.kramed.anon.Instantiable
import typings.kramed.anon.InstantiableKramedParser
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object kramed extends Shortcut {
    
    @JSImport("kramed", "kramed")
    @js.native
    val ^ : KramedStatic = js.native
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("kramed", "kramed.Parser")
    @js.native
    class Parser protected () extends KramedParser {
      def this(options: KramedOptions) = this()
    }
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("kramed", "kramed.Renderer")
    @js.native
    class Renderer () extends KramedRenderer
    
    type _To = KramedStatic
    
    /* This means you don't have to write `^`, but can instead just say `kramed.foo` */
    override def _to: KramedStatic = ^
  }
  
  @js.native
  trait KramedOptions extends StObject {
    
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
    implicit class KramedOptionsMutableBuilder[Self <: KramedOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBreaks(value: Boolean): Self = StObject.set(x, "breaks", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBreaksUndefined: Self = StObject.set(x, "breaks", js.undefined)
      
      @scala.inline
      def setGfm(value: Boolean): Self = StObject.set(x, "gfm", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGfmUndefined: Self = StObject.set(x, "gfm", js.undefined)
      
      @scala.inline
      def setHighlight(
        value: (/* code */ String, /* lang */ String, /* callback */ js.UndefOr[js.Function0[Unit]]) => String
      ): Self = StObject.set(x, "highlight", js.Any.fromFunction3(value))
      
      @scala.inline
      def setHighlightUndefined: Self = StObject.set(x, "highlight", js.undefined)
      
      @scala.inline
      def setLangPrefix(value: String): Self = StObject.set(x, "langPrefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLangPrefixUndefined: Self = StObject.set(x, "langPrefix", js.undefined)
      
      @scala.inline
      def setPedantic(value: Boolean): Self = StObject.set(x, "pedantic", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPedanticUndefined: Self = StObject.set(x, "pedantic", js.undefined)
      
      @scala.inline
      def setRenderer(value: KramedRenderer): Self = StObject.set(x, "renderer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRendererUndefined: Self = StObject.set(x, "renderer", js.undefined)
      
      @scala.inline
      def setSanitize(value: Boolean): Self = StObject.set(x, "sanitize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSanitizeUndefined: Self = StObject.set(x, "sanitize", js.undefined)
      
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
      def setTables(value: Boolean): Self = StObject.set(x, "tables", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTablesUndefined: Self = StObject.set(x, "tables", js.undefined)
    }
  }
  
  @js.native
  trait KramedParser extends StObject {
    
    def parse(source: js.Array[_]): String = js.native
  }
  object KramedParser {
    
    @scala.inline
    def apply(parse: js.Array[_] => String): KramedParser = {
      val __obj = js.Dynamic.literal(parse = js.Any.fromFunction1(parse))
      __obj.asInstanceOf[KramedParser]
    }
    
    @scala.inline
    implicit class KramedParserMutableBuilder[Self <: KramedParser] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setParse(value: js.Array[_] => String): Self = StObject.set(x, "parse", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait KramedRenderer extends StObject {
    
    def blockquote(quote: String): String = js.native
    
    def br(): String = js.native
    
    def code(code: String, language: String): String = js.native
    
    def codespan(code: String): String = js.native
    
    def del(text: String): String = js.native
    
    def em(text: String): String = js.native
    
    def heading(text: String, level: Double, raw: String): String = js.native
    
    def hr(): String = js.native
    
    def html(html: String): String = js.native
    
    def image(href: String, title: String, text: String): String = js.native
    
    def link(href: String, title: String, text: String): String = js.native
    
    def list(body: String, ordered: Boolean): String = js.native
    
    def listitem(text: String): String = js.native
    
    def paragraph(text: String): String = js.native
    
    def strong(text: String): String = js.native
    
    def table(header: String, body: String): String = js.native
    
    def tablecell(content: String, flags: Align): String = js.native
    
    def tablerow(content: String): String = js.native
    
    def text(text: String): String = js.native
  }
  object KramedRenderer {
    
    @scala.inline
    def apply(
      blockquote: String => String,
      br: () => String,
      code: (String, String) => String,
      codespan: String => String,
      del: String => String,
      em: String => String,
      heading: (String, Double, String) => String,
      hr: () => String,
      html: String => String,
      image: (String, String, String) => String,
      link: (String, String, String) => String,
      list: (String, Boolean) => String,
      listitem: String => String,
      paragraph: String => String,
      strong: String => String,
      table: (String, String) => String,
      tablecell: (String, Align) => String,
      tablerow: String => String,
      text: String => String
    ): KramedRenderer = {
      val __obj = js.Dynamic.literal(blockquote = js.Any.fromFunction1(blockquote), br = js.Any.fromFunction0(br), code = js.Any.fromFunction2(code), codespan = js.Any.fromFunction1(codespan), del = js.Any.fromFunction1(del), em = js.Any.fromFunction1(em), heading = js.Any.fromFunction3(heading), hr = js.Any.fromFunction0(hr), html = js.Any.fromFunction1(html), image = js.Any.fromFunction3(image), link = js.Any.fromFunction3(link), list = js.Any.fromFunction2(list), listitem = js.Any.fromFunction1(listitem), paragraph = js.Any.fromFunction1(paragraph), strong = js.Any.fromFunction1(strong), table = js.Any.fromFunction2(table), tablecell = js.Any.fromFunction2(tablecell), tablerow = js.Any.fromFunction1(tablerow), text = js.Any.fromFunction1(text))
      __obj.asInstanceOf[KramedRenderer]
    }
    
    @scala.inline
    implicit class KramedRendererMutableBuilder[Self <: KramedRenderer] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBlockquote(value: String => String): Self = StObject.set(x, "blockquote", js.Any.fromFunction1(value))
      
      @scala.inline
      def setBr(value: () => String): Self = StObject.set(x, "br", js.Any.fromFunction0(value))
      
      @scala.inline
      def setCode(value: (String, String) => String): Self = StObject.set(x, "code", js.Any.fromFunction2(value))
      
      @scala.inline
      def setCodespan(value: String => String): Self = StObject.set(x, "codespan", js.Any.fromFunction1(value))
      
      @scala.inline
      def setDel(value: String => String): Self = StObject.set(x, "del", js.Any.fromFunction1(value))
      
      @scala.inline
      def setEm(value: String => String): Self = StObject.set(x, "em", js.Any.fromFunction1(value))
      
      @scala.inline
      def setHeading(value: (String, Double, String) => String): Self = StObject.set(x, "heading", js.Any.fromFunction3(value))
      
      @scala.inline
      def setHr(value: () => String): Self = StObject.set(x, "hr", js.Any.fromFunction0(value))
      
      @scala.inline
      def setHtml(value: String => String): Self = StObject.set(x, "html", js.Any.fromFunction1(value))
      
      @scala.inline
      def setImage(value: (String, String, String) => String): Self = StObject.set(x, "image", js.Any.fromFunction3(value))
      
      @scala.inline
      def setLink(value: (String, String, String) => String): Self = StObject.set(x, "link", js.Any.fromFunction3(value))
      
      @scala.inline
      def setList(value: (String, Boolean) => String): Self = StObject.set(x, "list", js.Any.fromFunction2(value))
      
      @scala.inline
      def setListitem(value: String => String): Self = StObject.set(x, "listitem", js.Any.fromFunction1(value))
      
      @scala.inline
      def setParagraph(value: String => String): Self = StObject.set(x, "paragraph", js.Any.fromFunction1(value))
      
      @scala.inline
      def setStrong(value: String => String): Self = StObject.set(x, "strong", js.Any.fromFunction1(value))
      
      @scala.inline
      def setTable(value: (String, String) => String): Self = StObject.set(x, "table", js.Any.fromFunction2(value))
      
      @scala.inline
      def setTablecell(value: (String, Align) => String): Self = StObject.set(x, "tablecell", js.Any.fromFunction2(value))
      
      @scala.inline
      def setTablerow(value: String => String): Self = StObject.set(x, "tablerow", js.Any.fromFunction1(value))
      
      @scala.inline
      def setText(value: String => String): Self = StObject.set(x, "text", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait KramedStatic extends StObject {
    
    /**
      * Compiles kramdown to HTML.
      *
      * @param src String of kramdown source to be compiled
      * @param options Hash of options
      * @param callback Function called when the kramdownString has been fully parsed when using async highlighting
      * @return String of compiled HTML
      */
    def apply(src: String): String = js.native
    /**
      * Compiles kramdown to HTML.
      *
      * @param src String of kramdown source to be compiled
      * @param callback Function called when the kramdownString has been fully parsed when using async highlighting
      * @return String of compiled HTML
      */
    def apply(src: String, callback: js.Function0[Unit]): String = js.native
    def apply(src: String, options: js.UndefOr[scala.Nothing], callback: js.Function0[Unit]): String = js.native
    def apply(src: String, options: KramedOptions): String = js.native
    def apply(src: String, options: KramedOptions, callback: js.Function0[Unit]): String = js.native
    
    var Parser: InstantiableKramedParser = js.native
    
    var Renderer: Instantiable = js.native
    
    /**
      * @param src String of kramdown source to be compiled
      * @param options Hash of options
      */
    def lexer(src: String): js.Array[_] = js.native
    def lexer(src: String, options: KramedOptions): js.Array[_] = js.native
    
    /**
      * Compiles kramdown to HTML.
      *
      * @param src String of kramdown source to be compiled
      * @param options Hash of options
      * @param callback Function called when the kramdownString has been fully parsed when using async highlighting
      * @return String of compiled HTML
      */
    def parse(src: String): String = js.native
    /**
      * Compiles kramdown to HTML.
      *
      * @param src String of kramdown source to be compiled
      * @param callback Function called when the kramdownString has been fully parsed when using async highlighting
      * @return String of compiled HTML
      */
    def parse(src: String, callback: js.Function0[Unit]): String = js.native
    def parse(src: String, options: js.UndefOr[scala.Nothing], callback: js.Function0[Unit]): String = js.native
    def parse(src: String, options: KramedOptions): String = js.native
    def parse(src: String, options: KramedOptions, callback: js.Function0[Unit]): String = js.native
    
    /**
      * @param options Hash of options
      */
    def parser(src: js.Array[_]): String = js.native
    def parser(src: js.Array[_], options: KramedOptions): String = js.native
    
    /**
      * Sets the default options.
      *
      * @param options Hash of options
      */
    def setOptions(options: KramedOptions): KramedStatic = js.native
  }
}
