package typings.kramed.mod

import typings.kramed.anon.Align
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KramedRenderer extends js.Object {
  
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
  implicit class KramedRendererOps[Self <: KramedRenderer] (val x: Self) extends AnyVal {
    
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
    def setBlockquote(value: String => String): Self = this.set("blockquote", js.Any.fromFunction1(value))
    
    @scala.inline
    def setBr(value: () => String): Self = this.set("br", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCode(value: (String, String) => String): Self = this.set("code", js.Any.fromFunction2(value))
    
    @scala.inline
    def setCodespan(value: String => String): Self = this.set("codespan", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDel(value: String => String): Self = this.set("del", js.Any.fromFunction1(value))
    
    @scala.inline
    def setEm(value: String => String): Self = this.set("em", js.Any.fromFunction1(value))
    
    @scala.inline
    def setHeading(value: (String, Double, String) => String): Self = this.set("heading", js.Any.fromFunction3(value))
    
    @scala.inline
    def setHr(value: () => String): Self = this.set("hr", js.Any.fromFunction0(value))
    
    @scala.inline
    def setHtml(value: String => String): Self = this.set("html", js.Any.fromFunction1(value))
    
    @scala.inline
    def setImage(value: (String, String, String) => String): Self = this.set("image", js.Any.fromFunction3(value))
    
    @scala.inline
    def setLink(value: (String, String, String) => String): Self = this.set("link", js.Any.fromFunction3(value))
    
    @scala.inline
    def setList(value: (String, Boolean) => String): Self = this.set("list", js.Any.fromFunction2(value))
    
    @scala.inline
    def setListitem(value: String => String): Self = this.set("listitem", js.Any.fromFunction1(value))
    
    @scala.inline
    def setParagraph(value: String => String): Self = this.set("paragraph", js.Any.fromFunction1(value))
    
    @scala.inline
    def setStrong(value: String => String): Self = this.set("strong", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTable(value: (String, String) => String): Self = this.set("table", js.Any.fromFunction2(value))
    
    @scala.inline
    def setTablecell(value: (String, Align) => String): Self = this.set("tablecell", js.Any.fromFunction2(value))
    
    @scala.inline
    def setTablerow(value: String => String): Self = this.set("tablerow", js.Any.fromFunction1(value))
    
    @scala.inline
    def setText(value: String => String): Self = this.set("text", js.Any.fromFunction1(value))
  }
}
