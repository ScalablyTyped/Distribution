package typings.googleapis.sheetsV4Mod.sheetsV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaSlicerSpec extends StObject {
  
  /**
    * True if the filter should apply to pivot tables. If not set, default to `True`.
    */
  var applyToPivotTables: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * The background color of the slicer. Deprecated: Use background_color_style.
    */
  var backgroundColor: js.UndefOr[SchemaColor] = js.undefined
  
  /**
    * The background color of the slicer. If background_color is also set, this field takes precedence.
    */
  var backgroundColorStyle: js.UndefOr[SchemaColorStyle] = js.undefined
  
  /**
    * The column index in the data table on which the filter is applied to.
    */
  var columnIndex: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * The data range of the slicer.
    */
  var dataRange: js.UndefOr[SchemaGridRange] = js.undefined
  
  /**
    * The filtering criteria of the slicer.
    */
  var filterCriteria: js.UndefOr[SchemaFilterCriteria] = js.undefined
  
  /**
    * The horizontal alignment of title in the slicer. If unspecified, defaults to `LEFT`
    */
  var horizontalAlignment: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The text format of title in the slicer. The link field is not supported.
    */
  var textFormat: js.UndefOr[SchemaTextFormat] = js.undefined
  
  /**
    * The title of the slicer.
    */
  var title: js.UndefOr[String | Null] = js.undefined
}
object SchemaSlicerSpec {
  
  inline def apply(): SchemaSlicerSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSlicerSpec]
  }
  
  extension [Self <: SchemaSlicerSpec](x: Self) {
    
    inline def setApplyToPivotTables(value: Boolean): Self = StObject.set(x, "applyToPivotTables", value.asInstanceOf[js.Any])
    
    inline def setApplyToPivotTablesNull: Self = StObject.set(x, "applyToPivotTables", null)
    
    inline def setApplyToPivotTablesUndefined: Self = StObject.set(x, "applyToPivotTables", js.undefined)
    
    inline def setBackgroundColor(value: SchemaColor): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
    
    inline def setBackgroundColorStyle(value: SchemaColorStyle): Self = StObject.set(x, "backgroundColorStyle", value.asInstanceOf[js.Any])
    
    inline def setBackgroundColorStyleUndefined: Self = StObject.set(x, "backgroundColorStyle", js.undefined)
    
    inline def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
    
    inline def setColumnIndex(value: Double): Self = StObject.set(x, "columnIndex", value.asInstanceOf[js.Any])
    
    inline def setColumnIndexNull: Self = StObject.set(x, "columnIndex", null)
    
    inline def setColumnIndexUndefined: Self = StObject.set(x, "columnIndex", js.undefined)
    
    inline def setDataRange(value: SchemaGridRange): Self = StObject.set(x, "dataRange", value.asInstanceOf[js.Any])
    
    inline def setDataRangeUndefined: Self = StObject.set(x, "dataRange", js.undefined)
    
    inline def setFilterCriteria(value: SchemaFilterCriteria): Self = StObject.set(x, "filterCriteria", value.asInstanceOf[js.Any])
    
    inline def setFilterCriteriaUndefined: Self = StObject.set(x, "filterCriteria", js.undefined)
    
    inline def setHorizontalAlignment(value: String): Self = StObject.set(x, "horizontalAlignment", value.asInstanceOf[js.Any])
    
    inline def setHorizontalAlignmentNull: Self = StObject.set(x, "horizontalAlignment", null)
    
    inline def setHorizontalAlignmentUndefined: Self = StObject.set(x, "horizontalAlignment", js.undefined)
    
    inline def setTextFormat(value: SchemaTextFormat): Self = StObject.set(x, "textFormat", value.asInstanceOf[js.Any])
    
    inline def setTextFormatUndefined: Self = StObject.set(x, "textFormat", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleNull: Self = StObject.set(x, "title", null)
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
