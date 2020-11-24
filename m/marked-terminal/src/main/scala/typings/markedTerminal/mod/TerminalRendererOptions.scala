package typings.markedTerminal.mod

import typings.chalk.mod.Chalk
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TerminalRendererOptions extends js.Object {
  
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
  implicit class TerminalRendererOptionsOps[Self <: TerminalRendererOptions] (val x: Self) extends AnyVal {
    
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
    def setBlockquoteFunction1(value: /* s */ String => String): Self = this.set("blockquote", js.Any.fromFunction1(value))
    
    @scala.inline
    def setBlockquote(value: Chalk | (js.Function1[/* s */ String, String])): Self = this.set("blockquote", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBlockquote: Self = this.set("blockquote", js.undefined)
    
    @scala.inline
    def setCodeFunction1(value: /* s */ String => String): Self = this.set("code", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCode(value: Chalk | (js.Function1[/* s */ String, String])): Self = this.set("code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCode: Self = this.set("code", js.undefined)
    
    @scala.inline
    def setCodespanFunction1(value: /* s */ String => String): Self = this.set("codespan", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCodespan(value: Chalk | (js.Function1[/* s */ String, String])): Self = this.set("codespan", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCodespan: Self = this.set("codespan", js.undefined)
    
    @scala.inline
    def setDelFunction1(value: /* s */ String => String): Self = this.set("del", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDel(value: Chalk | (js.Function1[/* s */ String, String])): Self = this.set("del", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDel: Self = this.set("del", js.undefined)
    
    @scala.inline
    def setEmFunction1(value: /* s */ String => String): Self = this.set("em", js.Any.fromFunction1(value))
    
    @scala.inline
    def setEm(value: Chalk | (js.Function1[/* s */ String, String])): Self = this.set("em", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEm: Self = this.set("em", js.undefined)
    
    @scala.inline
    def setEmoji(value: Boolean): Self = this.set("emoji", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEmoji: Self = this.set("emoji", js.undefined)
    
    @scala.inline
    def setFirstHeadingFunction1(value: /* s */ String => String): Self = this.set("firstHeading", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFirstHeading(value: Chalk | (js.Function1[/* s */ String, String])): Self = this.set("firstHeading", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFirstHeading: Self = this.set("firstHeading", js.undefined)
    
    @scala.inline
    def setHeadingFunction1(value: /* s */ String => String): Self = this.set("heading", js.Any.fromFunction1(value))
    
    @scala.inline
    def setHeading(value: Chalk | (js.Function1[/* s */ String, String])): Self = this.set("heading", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeading: Self = this.set("heading", js.undefined)
    
    @scala.inline
    def setHrFunction1(value: /* s */ String => String): Self = this.set("hr", js.Any.fromFunction1(value))
    
    @scala.inline
    def setHr(value: Chalk | (js.Function1[/* s */ String, String])): Self = this.set("hr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHr: Self = this.set("hr", js.undefined)
    
    @scala.inline
    def setHrefFunction1(value: /* s */ String => String): Self = this.set("href", js.Any.fromFunction1(value))
    
    @scala.inline
    def setHref(value: Chalk | (js.Function1[/* s */ String, String])): Self = this.set("href", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHref: Self = this.set("href", js.undefined)
    
    @scala.inline
    def setHtmlFunction1(value: /* s */ String => String): Self = this.set("html", js.Any.fromFunction1(value))
    
    @scala.inline
    def setHtml(value: Chalk | (js.Function1[/* s */ String, String])): Self = this.set("html", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHtml: Self = this.set("html", js.undefined)
    
    @scala.inline
    def setLinkFunction1(value: /* s */ String => String): Self = this.set("link", js.Any.fromFunction1(value))
    
    @scala.inline
    def setLink(value: Chalk | (js.Function1[/* s */ String, String])): Self = this.set("link", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLink: Self = this.set("link", js.undefined)
    
    @scala.inline
    def setList(value: (/* body */ String, /* ordered */ js.UndefOr[Boolean]) => String): Self = this.set("list", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteList: Self = this.set("list", js.undefined)
    
    @scala.inline
    def setListitemFunction1(value: /* s */ String => String): Self = this.set("listitem", js.Any.fromFunction1(value))
    
    @scala.inline
    def setListitem(value: Chalk | (js.Function1[/* s */ String, String])): Self = this.set("listitem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteListitem: Self = this.set("listitem", js.undefined)
    
    @scala.inline
    def setParagraphFunction1(value: /* s */ String => String): Self = this.set("paragraph", js.Any.fromFunction1(value))
    
    @scala.inline
    def setParagraph(value: Chalk | (js.Function1[/* s */ String, String])): Self = this.set("paragraph", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParagraph: Self = this.set("paragraph", js.undefined)
    
    @scala.inline
    def setReflowText(value: Boolean): Self = this.set("reflowText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReflowText: Self = this.set("reflowText", js.undefined)
    
    @scala.inline
    def setShowSectionPrefix(value: Boolean): Self = this.set("showSectionPrefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowSectionPrefix: Self = this.set("showSectionPrefix", js.undefined)
    
    @scala.inline
    def setStrongFunction1(value: /* s */ String => String): Self = this.set("strong", js.Any.fromFunction1(value))
    
    @scala.inline
    def setStrong(value: Chalk | (js.Function1[/* s */ String, String])): Self = this.set("strong", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStrong: Self = this.set("strong", js.undefined)
    
    @scala.inline
    def setTab(value: Double): Self = this.set("tab", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTab: Self = this.set("tab", js.undefined)
    
    @scala.inline
    def setTableFunction1(value: /* s */ String => String): Self = this.set("table", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTable(value: Chalk | (js.Function1[/* s */ String, String])): Self = this.set("table", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTable: Self = this.set("table", js.undefined)
    
    @scala.inline
    def setTableOptions(value: js.Any): Self = this.set("tableOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTableOptions: Self = this.set("tableOptions", js.undefined)
    
    @scala.inline
    def setUnescape(value: Boolean): Self = this.set("unescape", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnescape: Self = this.set("unescape", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
}
