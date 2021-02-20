package typings.markedTerminal

import typings.chalk.mod.Chalk
import typings.marked.mod.Renderer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("marked-terminal", JSImport.Namespace)
  @js.native
  class ^ () extends Renderer {
    def this(options: TerminalRendererOptions) = this()
  }
  
  type TerminalRenderer = Renderer
  
  @js.native
  trait TerminalRendererOptions extends StObject {
    
    var blockquote: js.UndefOr[Chalk | (js.Function1[/* s */ String, String])] = js.native
    
    var code: js.UndefOr[Chalk | (js.Function1[/* s */ String, String])] = js.native
    
    var codespan: js.UndefOr[Chalk | (js.Function1[/* s */ String, String])] = js.native
    
    var del: js.UndefOr[Chalk | (js.Function1[/* s */ String, String])] = js.native
    
    var em: js.UndefOr[Chalk | (js.Function1[/* s */ String, String])] = js.native
    
    // Whether or not to show emojis
    var emoji: js.UndefOr[Boolean] = js.native
    
    var firstHeading: js.UndefOr[Chalk | (js.Function1[/* s */ String, String])] = js.native
    
    var heading: js.UndefOr[Chalk | (js.Function1[/* s */ String, String])] = js.native
    
    var hr: js.UndefOr[Chalk | (js.Function1[/* s */ String, String])] = js.native
    
    var href: js.UndefOr[Chalk | (js.Function1[/* s */ String, String])] = js.native
    
    var html: js.UndefOr[Chalk | (js.Function1[/* s */ String, String])] = js.native
    
    var link: js.UndefOr[Chalk | (js.Function1[/* s */ String, String])] = js.native
    
    // Formats the bulletpoints and numbers for lists
    var list: js.UndefOr[js.Function2[/* body */ String, /* ordered */ js.UndefOr[Boolean], String]] = js.native
    
    var listitem: js.UndefOr[Chalk | (js.Function1[/* s */ String, String])] = js.native
    
    var paragraph: js.UndefOr[Chalk | (js.Function1[/* s */ String, String])] = js.native
    
    // only applicable when reflow is true
    var reflowText: js.UndefOr[Boolean] = js.native
    
    // Should it prefix headers?
    var showSectionPrefix: js.UndefOr[Boolean] = js.native
    
    var strong: js.UndefOr[Chalk | (js.Function1[/* s */ String, String])] = js.native
    
    // The size of tabs in number of spaces or as tab characters
    var tab: js.UndefOr[Double] = js.native
    
    var table: js.UndefOr[Chalk | (js.Function1[/* s */ String, String])] = js.native
    
    // Options passed to cli-table
    var tableOptions: js.UndefOr[js.Any] = js.native
    
    // Whether or not to undo marked escaping
    // of enitities (" -> &quot; etc)
    var unescape: js.UndefOr[Boolean] = js.native
    
    // Reflow and print-out width
    var width: js.UndefOr[Double] = js.native
  }
  object TerminalRendererOptions {
    
    @scala.inline
    def apply(): TerminalRendererOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TerminalRendererOptions]
    }
    
    @scala.inline
    implicit class TerminalRendererOptionsMutableBuilder[Self <: TerminalRendererOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBlockquote(value: Chalk | (js.Function1[/* s */ String, String])): Self = StObject.set(x, "blockquote", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBlockquoteFunction1(value: /* s */ String => String): Self = StObject.set(x, "blockquote", js.Any.fromFunction1(value))
      
      @scala.inline
      def setBlockquoteUndefined: Self = StObject.set(x, "blockquote", js.undefined)
      
      @scala.inline
      def setCode(value: Chalk | (js.Function1[/* s */ String, String])): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCodeFunction1(value: /* s */ String => String): Self = StObject.set(x, "code", js.Any.fromFunction1(value))
      
      @scala.inline
      def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
      
      @scala.inline
      def setCodespan(value: Chalk | (js.Function1[/* s */ String, String])): Self = StObject.set(x, "codespan", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCodespanFunction1(value: /* s */ String => String): Self = StObject.set(x, "codespan", js.Any.fromFunction1(value))
      
      @scala.inline
      def setCodespanUndefined: Self = StObject.set(x, "codespan", js.undefined)
      
      @scala.inline
      def setDel(value: Chalk | (js.Function1[/* s */ String, String])): Self = StObject.set(x, "del", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDelFunction1(value: /* s */ String => String): Self = StObject.set(x, "del", js.Any.fromFunction1(value))
      
      @scala.inline
      def setDelUndefined: Self = StObject.set(x, "del", js.undefined)
      
      @scala.inline
      def setEm(value: Chalk | (js.Function1[/* s */ String, String])): Self = StObject.set(x, "em", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEmFunction1(value: /* s */ String => String): Self = StObject.set(x, "em", js.Any.fromFunction1(value))
      
      @scala.inline
      def setEmUndefined: Self = StObject.set(x, "em", js.undefined)
      
      @scala.inline
      def setEmoji(value: Boolean): Self = StObject.set(x, "emoji", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEmojiUndefined: Self = StObject.set(x, "emoji", js.undefined)
      
      @scala.inline
      def setFirstHeading(value: Chalk | (js.Function1[/* s */ String, String])): Self = StObject.set(x, "firstHeading", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFirstHeadingFunction1(value: /* s */ String => String): Self = StObject.set(x, "firstHeading", js.Any.fromFunction1(value))
      
      @scala.inline
      def setFirstHeadingUndefined: Self = StObject.set(x, "firstHeading", js.undefined)
      
      @scala.inline
      def setHeading(value: Chalk | (js.Function1[/* s */ String, String])): Self = StObject.set(x, "heading", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeadingFunction1(value: /* s */ String => String): Self = StObject.set(x, "heading", js.Any.fromFunction1(value))
      
      @scala.inline
      def setHeadingUndefined: Self = StObject.set(x, "heading", js.undefined)
      
      @scala.inline
      def setHr(value: Chalk | (js.Function1[/* s */ String, String])): Self = StObject.set(x, "hr", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHrFunction1(value: /* s */ String => String): Self = StObject.set(x, "hr", js.Any.fromFunction1(value))
      
      @scala.inline
      def setHrUndefined: Self = StObject.set(x, "hr", js.undefined)
      
      @scala.inline
      def setHref(value: Chalk | (js.Function1[/* s */ String, String])): Self = StObject.set(x, "href", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHrefFunction1(value: /* s */ String => String): Self = StObject.set(x, "href", js.Any.fromFunction1(value))
      
      @scala.inline
      def setHrefUndefined: Self = StObject.set(x, "href", js.undefined)
      
      @scala.inline
      def setHtml(value: Chalk | (js.Function1[/* s */ String, String])): Self = StObject.set(x, "html", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHtmlFunction1(value: /* s */ String => String): Self = StObject.set(x, "html", js.Any.fromFunction1(value))
      
      @scala.inline
      def setHtmlUndefined: Self = StObject.set(x, "html", js.undefined)
      
      @scala.inline
      def setLink(value: Chalk | (js.Function1[/* s */ String, String])): Self = StObject.set(x, "link", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLinkFunction1(value: /* s */ String => String): Self = StObject.set(x, "link", js.Any.fromFunction1(value))
      
      @scala.inline
      def setLinkUndefined: Self = StObject.set(x, "link", js.undefined)
      
      @scala.inline
      def setList(value: (/* body */ String, /* ordered */ js.UndefOr[Boolean]) => String): Self = StObject.set(x, "list", js.Any.fromFunction2(value))
      
      @scala.inline
      def setListUndefined: Self = StObject.set(x, "list", js.undefined)
      
      @scala.inline
      def setListitem(value: Chalk | (js.Function1[/* s */ String, String])): Self = StObject.set(x, "listitem", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setListitemFunction1(value: /* s */ String => String): Self = StObject.set(x, "listitem", js.Any.fromFunction1(value))
      
      @scala.inline
      def setListitemUndefined: Self = StObject.set(x, "listitem", js.undefined)
      
      @scala.inline
      def setParagraph(value: Chalk | (js.Function1[/* s */ String, String])): Self = StObject.set(x, "paragraph", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParagraphFunction1(value: /* s */ String => String): Self = StObject.set(x, "paragraph", js.Any.fromFunction1(value))
      
      @scala.inline
      def setParagraphUndefined: Self = StObject.set(x, "paragraph", js.undefined)
      
      @scala.inline
      def setReflowText(value: Boolean): Self = StObject.set(x, "reflowText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReflowTextUndefined: Self = StObject.set(x, "reflowText", js.undefined)
      
      @scala.inline
      def setShowSectionPrefix(value: Boolean): Self = StObject.set(x, "showSectionPrefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowSectionPrefixUndefined: Self = StObject.set(x, "showSectionPrefix", js.undefined)
      
      @scala.inline
      def setStrong(value: Chalk | (js.Function1[/* s */ String, String])): Self = StObject.set(x, "strong", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrongFunction1(value: /* s */ String => String): Self = StObject.set(x, "strong", js.Any.fromFunction1(value))
      
      @scala.inline
      def setStrongUndefined: Self = StObject.set(x, "strong", js.undefined)
      
      @scala.inline
      def setTab(value: Double): Self = StObject.set(x, "tab", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTabUndefined: Self = StObject.set(x, "tab", js.undefined)
      
      @scala.inline
      def setTable(value: Chalk | (js.Function1[/* s */ String, String])): Self = StObject.set(x, "table", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTableFunction1(value: /* s */ String => String): Self = StObject.set(x, "table", js.Any.fromFunction1(value))
      
      @scala.inline
      def setTableOptions(value: js.Any): Self = StObject.set(x, "tableOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTableOptionsUndefined: Self = StObject.set(x, "tableOptions", js.undefined)
      
      @scala.inline
      def setTableUndefined: Self = StObject.set(x, "table", js.undefined)
      
      @scala.inline
      def setUnescape(value: Boolean): Self = StObject.set(x, "unescape", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnescapeUndefined: Self = StObject.set(x, "unescape", js.undefined)
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
}
