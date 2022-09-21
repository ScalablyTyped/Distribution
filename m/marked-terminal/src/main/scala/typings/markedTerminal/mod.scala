package typings.markedTerminal

import typings.chalk.mod.Chalk
import typings.marked.mod.Renderer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("marked-terminal", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends Renderer[scala.Nothing] {
    def this(options: TerminalRendererOptions) = this()
  }
  
  type TerminalRenderer = Renderer[scala.Nothing]
  
  trait TerminalRendererOptions extends StObject {
    
    var blockquote: js.UndefOr[Chalk | (js.Function1[/* s */ String, String])] = js.undefined
    
    var code: js.UndefOr[Chalk | (js.Function1[/* s */ String, String])] = js.undefined
    
    var codespan: js.UndefOr[Chalk | (js.Function1[/* s */ String, String])] = js.undefined
    
    var del: js.UndefOr[Chalk | (js.Function1[/* s */ String, String])] = js.undefined
    
    var em: js.UndefOr[Chalk | (js.Function1[/* s */ String, String])] = js.undefined
    
    // Whether or not to show emojis
    var emoji: js.UndefOr[Boolean] = js.undefined
    
    var firstHeading: js.UndefOr[Chalk | (js.Function1[/* s */ String, String])] = js.undefined
    
    var heading: js.UndefOr[Chalk | (js.Function1[/* s */ String, String])] = js.undefined
    
    var hr: js.UndefOr[Chalk | (js.Function1[/* s */ String, String])] = js.undefined
    
    var href: js.UndefOr[Chalk | (js.Function1[/* s */ String, String])] = js.undefined
    
    var html: js.UndefOr[Chalk | (js.Function1[/* s */ String, String])] = js.undefined
    
    var link: js.UndefOr[Chalk | (js.Function1[/* s */ String, String])] = js.undefined
    
    // Formats the bulletpoints and numbers for lists
    var list: js.UndefOr[js.Function2[/* body */ String, /* ordered */ js.UndefOr[Boolean], String]] = js.undefined
    
    var listitem: js.UndefOr[Chalk | (js.Function1[/* s */ String, String])] = js.undefined
    
    var paragraph: js.UndefOr[Chalk | (js.Function1[/* s */ String, String])] = js.undefined
    
    // only applicable when reflow is true
    var reflowText: js.UndefOr[Boolean] = js.undefined
    
    // Should it prefix headers?
    var showSectionPrefix: js.UndefOr[Boolean] = js.undefined
    
    var strong: js.UndefOr[Chalk | (js.Function1[/* s */ String, String])] = js.undefined
    
    // The size of tabs in number of spaces or as tab characters
    var tab: js.UndefOr[Double] = js.undefined
    
    var table: js.UndefOr[Chalk | (js.Function1[/* s */ String, String])] = js.undefined
    
    // Options passed to cli-table
    var tableOptions: js.UndefOr[Any] = js.undefined
    
    // Whether or not to undo marked escaping
    // of enitities (" -> &quot; etc)
    var unescape: js.UndefOr[Boolean] = js.undefined
    
    // Reflow and print-out width
    var width: js.UndefOr[Double] = js.undefined
  }
  object TerminalRendererOptions {
    
    inline def apply(): TerminalRendererOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TerminalRendererOptions]
    }
    
    extension [Self <: TerminalRendererOptions](x: Self) {
      
      inline def setBlockquote(value: Chalk | (js.Function1[/* s */ String, String])): Self = StObject.set(x, "blockquote", value.asInstanceOf[js.Any])
      
      inline def setBlockquoteFunction1(value: /* s */ String => String): Self = StObject.set(x, "blockquote", js.Any.fromFunction1(value))
      
      inline def setBlockquoteUndefined: Self = StObject.set(x, "blockquote", js.undefined)
      
      inline def setCode(value: Chalk | (js.Function1[/* s */ String, String])): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      inline def setCodeFunction1(value: /* s */ String => String): Self = StObject.set(x, "code", js.Any.fromFunction1(value))
      
      inline def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
      
      inline def setCodespan(value: Chalk | (js.Function1[/* s */ String, String])): Self = StObject.set(x, "codespan", value.asInstanceOf[js.Any])
      
      inline def setCodespanFunction1(value: /* s */ String => String): Self = StObject.set(x, "codespan", js.Any.fromFunction1(value))
      
      inline def setCodespanUndefined: Self = StObject.set(x, "codespan", js.undefined)
      
      inline def setDel(value: Chalk | (js.Function1[/* s */ String, String])): Self = StObject.set(x, "del", value.asInstanceOf[js.Any])
      
      inline def setDelFunction1(value: /* s */ String => String): Self = StObject.set(x, "del", js.Any.fromFunction1(value))
      
      inline def setDelUndefined: Self = StObject.set(x, "del", js.undefined)
      
      inline def setEm(value: Chalk | (js.Function1[/* s */ String, String])): Self = StObject.set(x, "em", value.asInstanceOf[js.Any])
      
      inline def setEmFunction1(value: /* s */ String => String): Self = StObject.set(x, "em", js.Any.fromFunction1(value))
      
      inline def setEmUndefined: Self = StObject.set(x, "em", js.undefined)
      
      inline def setEmoji(value: Boolean): Self = StObject.set(x, "emoji", value.asInstanceOf[js.Any])
      
      inline def setEmojiUndefined: Self = StObject.set(x, "emoji", js.undefined)
      
      inline def setFirstHeading(value: Chalk | (js.Function1[/* s */ String, String])): Self = StObject.set(x, "firstHeading", value.asInstanceOf[js.Any])
      
      inline def setFirstHeadingFunction1(value: /* s */ String => String): Self = StObject.set(x, "firstHeading", js.Any.fromFunction1(value))
      
      inline def setFirstHeadingUndefined: Self = StObject.set(x, "firstHeading", js.undefined)
      
      inline def setHeading(value: Chalk | (js.Function1[/* s */ String, String])): Self = StObject.set(x, "heading", value.asInstanceOf[js.Any])
      
      inline def setHeadingFunction1(value: /* s */ String => String): Self = StObject.set(x, "heading", js.Any.fromFunction1(value))
      
      inline def setHeadingUndefined: Self = StObject.set(x, "heading", js.undefined)
      
      inline def setHr(value: Chalk | (js.Function1[/* s */ String, String])): Self = StObject.set(x, "hr", value.asInstanceOf[js.Any])
      
      inline def setHrFunction1(value: /* s */ String => String): Self = StObject.set(x, "hr", js.Any.fromFunction1(value))
      
      inline def setHrUndefined: Self = StObject.set(x, "hr", js.undefined)
      
      inline def setHref(value: Chalk | (js.Function1[/* s */ String, String])): Self = StObject.set(x, "href", value.asInstanceOf[js.Any])
      
      inline def setHrefFunction1(value: /* s */ String => String): Self = StObject.set(x, "href", js.Any.fromFunction1(value))
      
      inline def setHrefUndefined: Self = StObject.set(x, "href", js.undefined)
      
      inline def setHtml(value: Chalk | (js.Function1[/* s */ String, String])): Self = StObject.set(x, "html", value.asInstanceOf[js.Any])
      
      inline def setHtmlFunction1(value: /* s */ String => String): Self = StObject.set(x, "html", js.Any.fromFunction1(value))
      
      inline def setHtmlUndefined: Self = StObject.set(x, "html", js.undefined)
      
      inline def setLink(value: Chalk | (js.Function1[/* s */ String, String])): Self = StObject.set(x, "link", value.asInstanceOf[js.Any])
      
      inline def setLinkFunction1(value: /* s */ String => String): Self = StObject.set(x, "link", js.Any.fromFunction1(value))
      
      inline def setLinkUndefined: Self = StObject.set(x, "link", js.undefined)
      
      inline def setList(value: (/* body */ String, /* ordered */ js.UndefOr[Boolean]) => String): Self = StObject.set(x, "list", js.Any.fromFunction2(value))
      
      inline def setListUndefined: Self = StObject.set(x, "list", js.undefined)
      
      inline def setListitem(value: Chalk | (js.Function1[/* s */ String, String])): Self = StObject.set(x, "listitem", value.asInstanceOf[js.Any])
      
      inline def setListitemFunction1(value: /* s */ String => String): Self = StObject.set(x, "listitem", js.Any.fromFunction1(value))
      
      inline def setListitemUndefined: Self = StObject.set(x, "listitem", js.undefined)
      
      inline def setParagraph(value: Chalk | (js.Function1[/* s */ String, String])): Self = StObject.set(x, "paragraph", value.asInstanceOf[js.Any])
      
      inline def setParagraphFunction1(value: /* s */ String => String): Self = StObject.set(x, "paragraph", js.Any.fromFunction1(value))
      
      inline def setParagraphUndefined: Self = StObject.set(x, "paragraph", js.undefined)
      
      inline def setReflowText(value: Boolean): Self = StObject.set(x, "reflowText", value.asInstanceOf[js.Any])
      
      inline def setReflowTextUndefined: Self = StObject.set(x, "reflowText", js.undefined)
      
      inline def setShowSectionPrefix(value: Boolean): Self = StObject.set(x, "showSectionPrefix", value.asInstanceOf[js.Any])
      
      inline def setShowSectionPrefixUndefined: Self = StObject.set(x, "showSectionPrefix", js.undefined)
      
      inline def setStrong(value: Chalk | (js.Function1[/* s */ String, String])): Self = StObject.set(x, "strong", value.asInstanceOf[js.Any])
      
      inline def setStrongFunction1(value: /* s */ String => String): Self = StObject.set(x, "strong", js.Any.fromFunction1(value))
      
      inline def setStrongUndefined: Self = StObject.set(x, "strong", js.undefined)
      
      inline def setTab(value: Double): Self = StObject.set(x, "tab", value.asInstanceOf[js.Any])
      
      inline def setTabUndefined: Self = StObject.set(x, "tab", js.undefined)
      
      inline def setTable(value: Chalk | (js.Function1[/* s */ String, String])): Self = StObject.set(x, "table", value.asInstanceOf[js.Any])
      
      inline def setTableFunction1(value: /* s */ String => String): Self = StObject.set(x, "table", js.Any.fromFunction1(value))
      
      inline def setTableOptions(value: Any): Self = StObject.set(x, "tableOptions", value.asInstanceOf[js.Any])
      
      inline def setTableOptionsUndefined: Self = StObject.set(x, "tableOptions", js.undefined)
      
      inline def setTableUndefined: Self = StObject.set(x, "table", js.undefined)
      
      inline def setUnescape(value: Boolean): Self = StObject.set(x, "unescape", value.asInstanceOf[js.Any])
      
      inline def setUnescapeUndefined: Self = StObject.set(x, "unescape", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
}
