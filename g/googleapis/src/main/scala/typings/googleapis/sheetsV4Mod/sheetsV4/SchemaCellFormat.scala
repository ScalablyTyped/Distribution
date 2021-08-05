package typings.googleapis.sheetsV4Mod.sheetsV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The format of a cell.
  */
trait SchemaCellFormat extends StObject {
  
  /**
    * The background color of the cell.
    */
  var backgroundColor: js.UndefOr[SchemaColor] = js.undefined
  
  /**
    * The borders of the cell.
    */
  var borders: js.UndefOr[SchemaBorders] = js.undefined
  
  /**
    * The horizontal alignment of the value in the cell.
    */
  var horizontalAlignment: js.UndefOr[String] = js.undefined
  
  /**
    * How a hyperlink, if it exists, should be displayed in the cell.
    */
  var hyperlinkDisplayType: js.UndefOr[String] = js.undefined
  
  /**
    * A format describing how number values should be represented to the user.
    */
  var numberFormat: js.UndefOr[SchemaNumberFormat] = js.undefined
  
  /**
    * The padding of the cell.
    */
  var padding: js.UndefOr[SchemaPadding] = js.undefined
  
  /**
    * The direction of the text in the cell.
    */
  var textDirection: js.UndefOr[String] = js.undefined
  
  /**
    * The format of the text in the cell (unless overridden by a format run).
    */
  var textFormat: js.UndefOr[SchemaTextFormat] = js.undefined
  
  /**
    * The rotation applied to text in a cell
    */
  var textRotation: js.UndefOr[SchemaTextRotation] = js.undefined
  
  /**
    * The vertical alignment of the value in the cell.
    */
  var verticalAlignment: js.UndefOr[String] = js.undefined
  
  /**
    * The wrap strategy for the value in the cell.
    */
  var wrapStrategy: js.UndefOr[String] = js.undefined
}
object SchemaCellFormat {
  
  inline def apply(): SchemaCellFormat = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCellFormat]
  }
  
  extension [Self <: SchemaCellFormat](x: Self) {
    
    inline def setBackgroundColor(value: SchemaColor): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
    
    inline def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
    
    inline def setBorders(value: SchemaBorders): Self = StObject.set(x, "borders", value.asInstanceOf[js.Any])
    
    inline def setBordersUndefined: Self = StObject.set(x, "borders", js.undefined)
    
    inline def setHorizontalAlignment(value: String): Self = StObject.set(x, "horizontalAlignment", value.asInstanceOf[js.Any])
    
    inline def setHorizontalAlignmentUndefined: Self = StObject.set(x, "horizontalAlignment", js.undefined)
    
    inline def setHyperlinkDisplayType(value: String): Self = StObject.set(x, "hyperlinkDisplayType", value.asInstanceOf[js.Any])
    
    inline def setHyperlinkDisplayTypeUndefined: Self = StObject.set(x, "hyperlinkDisplayType", js.undefined)
    
    inline def setNumberFormat(value: SchemaNumberFormat): Self = StObject.set(x, "numberFormat", value.asInstanceOf[js.Any])
    
    inline def setNumberFormatUndefined: Self = StObject.set(x, "numberFormat", js.undefined)
    
    inline def setPadding(value: SchemaPadding): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
    
    inline def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
    
    inline def setTextDirection(value: String): Self = StObject.set(x, "textDirection", value.asInstanceOf[js.Any])
    
    inline def setTextDirectionUndefined: Self = StObject.set(x, "textDirection", js.undefined)
    
    inline def setTextFormat(value: SchemaTextFormat): Self = StObject.set(x, "textFormat", value.asInstanceOf[js.Any])
    
    inline def setTextFormatUndefined: Self = StObject.set(x, "textFormat", js.undefined)
    
    inline def setTextRotation(value: SchemaTextRotation): Self = StObject.set(x, "textRotation", value.asInstanceOf[js.Any])
    
    inline def setTextRotationUndefined: Self = StObject.set(x, "textRotation", js.undefined)
    
    inline def setVerticalAlignment(value: String): Self = StObject.set(x, "verticalAlignment", value.asInstanceOf[js.Any])
    
    inline def setVerticalAlignmentUndefined: Self = StObject.set(x, "verticalAlignment", js.undefined)
    
    inline def setWrapStrategy(value: String): Self = StObject.set(x, "wrapStrategy", value.asInstanceOf[js.Any])
    
    inline def setWrapStrategyUndefined: Self = StObject.set(x, "wrapStrategy", js.undefined)
  }
}
