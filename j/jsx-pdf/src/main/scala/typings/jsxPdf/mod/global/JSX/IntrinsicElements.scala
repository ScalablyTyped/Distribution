package typings.jsxPdf.mod.global.JSX

import typings.jsxPdf.anon.Content
import typings.jsxPdf.anon.EleNoChidlrenOmitContentI
import typings.jsxPdf.anon.EleNoChidlrenOmitContentQ
import typings.jsxPdf.anon.EleOmitContentColumnscolu
import typings.jsxPdf.anon.EleOmitContentOrderedList
import typings.jsxPdf.anon.EleOmitContentStackstack
import typings.jsxPdf.anon.EleOmitContentTabletableO
import typings.jsxPdf.anon.EleOmitContentTexttext
import typings.jsxPdf.anon.EleOmitContentUnorderedLi
import typings.jsxPdf.anon.EleOmitTDocumentDefinitio
import typings.jsxPdf.anon.Elewidthnumberstring
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IntrinsicElements extends js.Object {
  
  var cell: Ele[Element] = js.native
  
  var column: Elewidthnumberstring = js.native
  
  var columns: EleOmitContentColumnscolu = js.native
  
  var content: typings.jsxPdf.anon.Ele = js.native
  
  var document: EleOmitTDocumentDefinitio = js.native
  
  var footer: typings.jsxPdf.anon.Ele = js.native
  
  var header: typings.jsxPdf.anon.Ele = js.native
  
  var image: EleNoChidlrenOmitContentI = js.native
  
  var ol: EleOmitContentOrderedList = js.native
  
  var qr: EleNoChidlrenOmitContentQ = js.native
  
  var row: Ele[Element] = js.native
  
  var stack: EleOmitContentStackstack = js.native
  
  var svg: EleNoChidlren[Content] = js.native
  
  var table: EleOmitContentTabletableO = js.native
  
  var text: EleOmitContentTexttext = js.native
  
  var ul: EleOmitContentUnorderedLi = js.native
}
object IntrinsicElements {
  
  @scala.inline
  def apply(
    cell: Ele[Element],
    column: Elewidthnumberstring,
    columns: EleOmitContentColumnscolu,
    content: typings.jsxPdf.anon.Ele,
    document: EleOmitTDocumentDefinitio,
    footer: typings.jsxPdf.anon.Ele,
    header: typings.jsxPdf.anon.Ele,
    image: EleNoChidlrenOmitContentI,
    ol: EleOmitContentOrderedList,
    qr: EleNoChidlrenOmitContentQ,
    row: Ele[Element],
    stack: EleOmitContentStackstack,
    svg: EleNoChidlren[Content],
    table: EleOmitContentTabletableO,
    text: EleOmitContentTexttext,
    ul: EleOmitContentUnorderedLi
  ): IntrinsicElements = {
    val __obj = js.Dynamic.literal(cell = cell.asInstanceOf[js.Any], column = column.asInstanceOf[js.Any], columns = columns.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], document = document.asInstanceOf[js.Any], footer = footer.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], image = image.asInstanceOf[js.Any], ol = ol.asInstanceOf[js.Any], qr = qr.asInstanceOf[js.Any], row = row.asInstanceOf[js.Any], stack = stack.asInstanceOf[js.Any], svg = svg.asInstanceOf[js.Any], table = table.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], ul = ul.asInstanceOf[js.Any])
    __obj.asInstanceOf[IntrinsicElements]
  }
  
  @scala.inline
  implicit class IntrinsicElementsOps[Self <: IntrinsicElements] (val x: Self) extends AnyVal {
    
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
    def setCell(value: Ele[Element]): Self = this.set("cell", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumn(value: Elewidthnumberstring): Self = this.set("column", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumns(value: EleOmitContentColumnscolu): Self = this.set("columns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContent(value: typings.jsxPdf.anon.Ele): Self = this.set("content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDocument(value: EleOmitTDocumentDefinitio): Self = this.set("document", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFooter(value: typings.jsxPdf.anon.Ele): Self = this.set("footer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeader(value: typings.jsxPdf.anon.Ele): Self = this.set("header", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImage(value: EleNoChidlrenOmitContentI): Self = this.set("image", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOl(value: EleOmitContentOrderedList): Self = this.set("ol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQr(value: EleNoChidlrenOmitContentQ): Self = this.set("qr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRow(value: Ele[Element]): Self = this.set("row", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStack(value: EleOmitContentStackstack): Self = this.set("stack", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSvg(value: EleNoChidlren[Content]): Self = this.set("svg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTable(value: EleOmitContentTabletableO): Self = this.set("table", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setText(value: EleOmitContentTexttext): Self = this.set("text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUl(value: EleOmitContentUnorderedLi): Self = this.set("ul", value.asInstanceOf[js.Any])
  }
}
