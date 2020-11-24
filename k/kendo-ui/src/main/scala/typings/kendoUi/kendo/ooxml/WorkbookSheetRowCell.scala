package typings.kendoUi.kendo.ooxml

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WorkbookSheetRowCell extends js.Object {
  
  var background: js.UndefOr[String] = js.native
  
  var bold: js.UndefOr[Boolean] = js.native
  
  var borderBottom: js.UndefOr[WorkbookSheetRowCellBorderBottom] = js.native
  
  var borderLeft: js.UndefOr[WorkbookSheetRowCellBorderLeft] = js.native
  
  var borderRight: js.UndefOr[WorkbookSheetRowCellBorderRight] = js.native
  
  var borderTop: js.UndefOr[WorkbookSheetRowCellBorderTop] = js.native
  
  var colSpan: js.UndefOr[Double] = js.native
  
  var color: js.UndefOr[String] = js.native
  
  var fontFamily: js.UndefOr[String] = js.native
  
  var fontName: js.UndefOr[String] = js.native
  
  var fontSize: js.UndefOr[Double] = js.native
  
  var format: js.UndefOr[String] = js.native
  
  var formula: js.UndefOr[String] = js.native
  
  var hAlign: js.UndefOr[String] = js.native
  
  var index: js.UndefOr[js.Any] = js.native
  
  var italic: js.UndefOr[Boolean] = js.native
  
  var rowSpan: js.UndefOr[Double] = js.native
  
  var textAlign: js.UndefOr[String] = js.native
  
  var underline: js.UndefOr[Boolean] = js.native
  
  var vAlign: js.UndefOr[String] = js.native
  
  var value: js.UndefOr[Date | Double | String | Boolean] = js.native
  
  var verticalAlign: js.UndefOr[String] = js.native
  
  var wrap: js.UndefOr[Boolean] = js.native
}
object WorkbookSheetRowCell {
  
  @scala.inline
  def apply(): WorkbookSheetRowCell = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorkbookSheetRowCell]
  }
  
  @scala.inline
  implicit class WorkbookSheetRowCellOps[Self <: WorkbookSheetRowCell] (val x: Self) extends AnyVal {
    
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
    def setBackground(value: String): Self = this.set("background", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackground: Self = this.set("background", js.undefined)
    
    @scala.inline
    def setBold(value: Boolean): Self = this.set("bold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBold: Self = this.set("bold", js.undefined)
    
    @scala.inline
    def setBorderBottom(value: WorkbookSheetRowCellBorderBottom): Self = this.set("borderBottom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBorderBottom: Self = this.set("borderBottom", js.undefined)
    
    @scala.inline
    def setBorderLeft(value: WorkbookSheetRowCellBorderLeft): Self = this.set("borderLeft", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBorderLeft: Self = this.set("borderLeft", js.undefined)
    
    @scala.inline
    def setBorderRight(value: WorkbookSheetRowCellBorderRight): Self = this.set("borderRight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBorderRight: Self = this.set("borderRight", js.undefined)
    
    @scala.inline
    def setBorderTop(value: WorkbookSheetRowCellBorderTop): Self = this.set("borderTop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBorderTop: Self = this.set("borderTop", js.undefined)
    
    @scala.inline
    def setColSpan(value: Double): Self = this.set("colSpan", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColSpan: Self = this.set("colSpan", js.undefined)
    
    @scala.inline
    def setColor(value: String): Self = this.set("color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    
    @scala.inline
    def setFontFamily(value: String): Self = this.set("fontFamily", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFontFamily: Self = this.set("fontFamily", js.undefined)
    
    @scala.inline
    def setFontName(value: String): Self = this.set("fontName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFontName: Self = this.set("fontName", js.undefined)
    
    @scala.inline
    def setFontSize(value: Double): Self = this.set("fontSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFontSize: Self = this.set("fontSize", js.undefined)
    
    @scala.inline
    def setFormat(value: String): Self = this.set("format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFormat: Self = this.set("format", js.undefined)
    
    @scala.inline
    def setFormula(value: String): Self = this.set("formula", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFormula: Self = this.set("formula", js.undefined)
    
    @scala.inline
    def setHAlign(value: String): Self = this.set("hAlign", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHAlign: Self = this.set("hAlign", js.undefined)
    
    @scala.inline
    def setIndex(value: js.Any): Self = this.set("index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIndex: Self = this.set("index", js.undefined)
    
    @scala.inline
    def setItalic(value: Boolean): Self = this.set("italic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItalic: Self = this.set("italic", js.undefined)
    
    @scala.inline
    def setRowSpan(value: Double): Self = this.set("rowSpan", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRowSpan: Self = this.set("rowSpan", js.undefined)
    
    @scala.inline
    def setTextAlign(value: String): Self = this.set("textAlign", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTextAlign: Self = this.set("textAlign", js.undefined)
    
    @scala.inline
    def setUnderline(value: Boolean): Self = this.set("underline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnderline: Self = this.set("underline", js.undefined)
    
    @scala.inline
    def setVAlign(value: String): Self = this.set("vAlign", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVAlign: Self = this.set("vAlign", js.undefined)
    
    @scala.inline
    def setValue(value: Date | Double | String | Boolean): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
    
    @scala.inline
    def setVerticalAlign(value: String): Self = this.set("verticalAlign", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVerticalAlign: Self = this.set("verticalAlign", js.undefined)
    
    @scala.inline
    def setWrap(value: Boolean): Self = this.set("wrap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWrap: Self = this.set("wrap", js.undefined)
  }
}
