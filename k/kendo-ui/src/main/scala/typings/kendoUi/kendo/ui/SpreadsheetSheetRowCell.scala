package typings.kendoUi.kendo.ui

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SpreadsheetSheetRowCell extends StObject {
  
  var background: js.UndefOr[String] = js.undefined
  
  var bold: js.UndefOr[Boolean] = js.undefined
  
  var borderBottom: js.UndefOr[SpreadsheetSheetRowCellBorderBottom] = js.undefined
  
  var borderLeft: js.UndefOr[SpreadsheetSheetRowCellBorderLeft] = js.undefined
  
  var borderRight: js.UndefOr[SpreadsheetSheetRowCellBorderRight] = js.undefined
  
  var borderTop: js.UndefOr[SpreadsheetSheetRowCellBorderTop] = js.undefined
  
  var color: js.UndefOr[String] = js.undefined
  
  var comment: js.UndefOr[String] = js.undefined
  
  var enable: js.UndefOr[Boolean] = js.undefined
  
  var fontFamily: js.UndefOr[String] = js.undefined
  
  var fontSize: js.UndefOr[Double] = js.undefined
  
  var format: js.UndefOr[String] = js.undefined
  
  var formula: js.UndefOr[String] = js.undefined
  
  var index: js.UndefOr[Double] = js.undefined
  
  var italic: js.UndefOr[Boolean] = js.undefined
  
  var link: js.UndefOr[String] = js.undefined
  
  var textAlign: js.UndefOr[String] = js.undefined
  
  var underline: js.UndefOr[Boolean] = js.undefined
  
  var validation: js.UndefOr[SpreadsheetSheetRowCellValidation] = js.undefined
  
  var value: js.UndefOr[Double | String | Boolean | Date] = js.undefined
  
  var verticalAlign: js.UndefOr[String] = js.undefined
  
  var wrap: js.UndefOr[Boolean] = js.undefined
}
object SpreadsheetSheetRowCell {
  
  @scala.inline
  def apply(): SpreadsheetSheetRowCell = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SpreadsheetSheetRowCell]
  }
  
  @scala.inline
  implicit class SpreadsheetSheetRowCellMutableBuilder[Self <: SpreadsheetSheetRowCell] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBackground(value: String): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackgroundUndefined: Self = StObject.set(x, "background", js.undefined)
    
    @scala.inline
    def setBold(value: Boolean): Self = StObject.set(x, "bold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBoldUndefined: Self = StObject.set(x, "bold", js.undefined)
    
    @scala.inline
    def setBorderBottom(value: SpreadsheetSheetRowCellBorderBottom): Self = StObject.set(x, "borderBottom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderBottomUndefined: Self = StObject.set(x, "borderBottom", js.undefined)
    
    @scala.inline
    def setBorderLeft(value: SpreadsheetSheetRowCellBorderLeft): Self = StObject.set(x, "borderLeft", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderLeftUndefined: Self = StObject.set(x, "borderLeft", js.undefined)
    
    @scala.inline
    def setBorderRight(value: SpreadsheetSheetRowCellBorderRight): Self = StObject.set(x, "borderRight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderRightUndefined: Self = StObject.set(x, "borderRight", js.undefined)
    
    @scala.inline
    def setBorderTop(value: SpreadsheetSheetRowCellBorderTop): Self = StObject.set(x, "borderTop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderTopUndefined: Self = StObject.set(x, "borderTop", js.undefined)
    
    @scala.inline
    def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    @scala.inline
    def setComment(value: String): Self = StObject.set(x, "comment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommentUndefined: Self = StObject.set(x, "comment", js.undefined)
    
    @scala.inline
    def setEnable(value: Boolean): Self = StObject.set(x, "enable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableUndefined: Self = StObject.set(x, "enable", js.undefined)
    
    @scala.inline
    def setFontFamily(value: String): Self = StObject.set(x, "fontFamily", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontFamilyUndefined: Self = StObject.set(x, "fontFamily", js.undefined)
    
    @scala.inline
    def setFontSize(value: Double): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontSizeUndefined: Self = StObject.set(x, "fontSize", js.undefined)
    
    @scala.inline
    def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    @scala.inline
    def setFormula(value: String): Self = StObject.set(x, "formula", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormulaUndefined: Self = StObject.set(x, "formula", js.undefined)
    
    @scala.inline
    def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
    
    @scala.inline
    def setItalic(value: Boolean): Self = StObject.set(x, "italic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItalicUndefined: Self = StObject.set(x, "italic", js.undefined)
    
    @scala.inline
    def setLink(value: String): Self = StObject.set(x, "link", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLinkUndefined: Self = StObject.set(x, "link", js.undefined)
    
    @scala.inline
    def setTextAlign(value: String): Self = StObject.set(x, "textAlign", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextAlignUndefined: Self = StObject.set(x, "textAlign", js.undefined)
    
    @scala.inline
    def setUnderline(value: Boolean): Self = StObject.set(x, "underline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnderlineUndefined: Self = StObject.set(x, "underline", js.undefined)
    
    @scala.inline
    def setValidation(value: SpreadsheetSheetRowCellValidation): Self = StObject.set(x, "validation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValidationUndefined: Self = StObject.set(x, "validation", js.undefined)
    
    @scala.inline
    def setValue(value: Double | String | Boolean | Date): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    
    @scala.inline
    def setVerticalAlign(value: String): Self = StObject.set(x, "verticalAlign", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVerticalAlignUndefined: Self = StObject.set(x, "verticalAlign", js.undefined)
    
    @scala.inline
    def setWrap(value: Boolean): Self = StObject.set(x, "wrap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWrapUndefined: Self = StObject.set(x, "wrap", js.undefined)
  }
}
