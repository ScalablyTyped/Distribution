package typings.googleapis.docsV1Mod.docsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The style of a TableCell.  Inherited table cell styles are represented as
  * unset fields in this message. A table cell style can inherit from the
  * table&#39;s style.
  */
trait SchemaTableCellStyle extends StObject {
  
  /**
    * The background color of the cell.
    */
  var backgroundColor: js.UndefOr[SchemaOptionalColor] = js.undefined
  
  /**
    * The bottom border of the cell.
    */
  var borderBottom: js.UndefOr[SchemaTableCellBorder] = js.undefined
  
  /**
    * The left border of the cell.
    */
  var borderLeft: js.UndefOr[SchemaTableCellBorder] = js.undefined
  
  /**
    * The right border of the cell.
    */
  var borderRight: js.UndefOr[SchemaTableCellBorder] = js.undefined
  
  /**
    * The top border of the cell.
    */
  var borderTop: js.UndefOr[SchemaTableCellBorder] = js.undefined
  
  /**
    * The column span of the cell. This property is read-only.
    */
  var columnSpan: js.UndefOr[Double] = js.undefined
  
  /**
    * The alignment of the content in the table cell. The default alignment
    * matches the alignment for newly created table cells in the Docs editor.
    */
  var contentAlignment: js.UndefOr[String] = js.undefined
  
  /**
    * The bottom padding of the cell.
    */
  var paddingBottom: js.UndefOr[SchemaDimension] = js.undefined
  
  /**
    * The left padding of the cell.
    */
  var paddingLeft: js.UndefOr[SchemaDimension] = js.undefined
  
  /**
    * The right padding of the cell.
    */
  var paddingRight: js.UndefOr[SchemaDimension] = js.undefined
  
  /**
    * The top padding of the cell.
    */
  var paddingTop: js.UndefOr[SchemaDimension] = js.undefined
  
  /**
    * The row span of the cell. This property is read-only.
    */
  var rowSpan: js.UndefOr[Double] = js.undefined
}
object SchemaTableCellStyle {
  
  inline def apply(): SchemaTableCellStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTableCellStyle]
  }
  
  extension [Self <: SchemaTableCellStyle](x: Self) {
    
    inline def setBackgroundColor(value: SchemaOptionalColor): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
    
    inline def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
    
    inline def setBorderBottom(value: SchemaTableCellBorder): Self = StObject.set(x, "borderBottom", value.asInstanceOf[js.Any])
    
    inline def setBorderBottomUndefined: Self = StObject.set(x, "borderBottom", js.undefined)
    
    inline def setBorderLeft(value: SchemaTableCellBorder): Self = StObject.set(x, "borderLeft", value.asInstanceOf[js.Any])
    
    inline def setBorderLeftUndefined: Self = StObject.set(x, "borderLeft", js.undefined)
    
    inline def setBorderRight(value: SchemaTableCellBorder): Self = StObject.set(x, "borderRight", value.asInstanceOf[js.Any])
    
    inline def setBorderRightUndefined: Self = StObject.set(x, "borderRight", js.undefined)
    
    inline def setBorderTop(value: SchemaTableCellBorder): Self = StObject.set(x, "borderTop", value.asInstanceOf[js.Any])
    
    inline def setBorderTopUndefined: Self = StObject.set(x, "borderTop", js.undefined)
    
    inline def setColumnSpan(value: Double): Self = StObject.set(x, "columnSpan", value.asInstanceOf[js.Any])
    
    inline def setColumnSpanUndefined: Self = StObject.set(x, "columnSpan", js.undefined)
    
    inline def setContentAlignment(value: String): Self = StObject.set(x, "contentAlignment", value.asInstanceOf[js.Any])
    
    inline def setContentAlignmentUndefined: Self = StObject.set(x, "contentAlignment", js.undefined)
    
    inline def setPaddingBottom(value: SchemaDimension): Self = StObject.set(x, "paddingBottom", value.asInstanceOf[js.Any])
    
    inline def setPaddingBottomUndefined: Self = StObject.set(x, "paddingBottom", js.undefined)
    
    inline def setPaddingLeft(value: SchemaDimension): Self = StObject.set(x, "paddingLeft", value.asInstanceOf[js.Any])
    
    inline def setPaddingLeftUndefined: Self = StObject.set(x, "paddingLeft", js.undefined)
    
    inline def setPaddingRight(value: SchemaDimension): Self = StObject.set(x, "paddingRight", value.asInstanceOf[js.Any])
    
    inline def setPaddingRightUndefined: Self = StObject.set(x, "paddingRight", js.undefined)
    
    inline def setPaddingTop(value: SchemaDimension): Self = StObject.set(x, "paddingTop", value.asInstanceOf[js.Any])
    
    inline def setPaddingTopUndefined: Self = StObject.set(x, "paddingTop", js.undefined)
    
    inline def setRowSpan(value: Double): Self = StObject.set(x, "rowSpan", value.asInstanceOf[js.Any])
    
    inline def setRowSpanUndefined: Self = StObject.set(x, "rowSpan", js.undefined)
  }
}
