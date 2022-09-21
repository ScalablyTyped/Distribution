package typings.googleapis.sheetsV4Mod.sheetsV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaSortSpec extends StObject {
  
  /**
    * The background fill color to sort by; cells with this fill color are sorted to the top. Mutually exclusive with foreground_color. Deprecated: Use background_color_style.
    */
  var backgroundColor: js.UndefOr[SchemaColor] = js.undefined
  
  /**
    * The background fill color to sort by; cells with this fill color are sorted to the top. Mutually exclusive with foreground_color, and must be an RGB-type color. If background_color is also set, this field takes precedence.
    */
  var backgroundColorStyle: js.UndefOr[SchemaColorStyle] = js.undefined
  
  /**
    * Reference to a data source column.
    */
  var dataSourceColumnReference: js.UndefOr[SchemaDataSourceColumnReference] = js.undefined
  
  /**
    * The dimension the sort should be applied to.
    */
  var dimensionIndex: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * The foreground color to sort by; cells with this foreground color are sorted to the top. Mutually exclusive with background_color. Deprecated: Use foreground_color_style.
    */
  var foregroundColor: js.UndefOr[SchemaColor] = js.undefined
  
  /**
    * The foreground color to sort by; cells with this foreground color are sorted to the top. Mutually exclusive with background_color, and must be an RGB-type color. If foreground_color is also set, this field takes precedence.
    */
  var foregroundColorStyle: js.UndefOr[SchemaColorStyle] = js.undefined
  
  /**
    * The order data should be sorted.
    */
  var sortOrder: js.UndefOr[String | Null] = js.undefined
}
object SchemaSortSpec {
  
  inline def apply(): SchemaSortSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSortSpec]
  }
  
  extension [Self <: SchemaSortSpec](x: Self) {
    
    inline def setBackgroundColor(value: SchemaColor): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
    
    inline def setBackgroundColorStyle(value: SchemaColorStyle): Self = StObject.set(x, "backgroundColorStyle", value.asInstanceOf[js.Any])
    
    inline def setBackgroundColorStyleUndefined: Self = StObject.set(x, "backgroundColorStyle", js.undefined)
    
    inline def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
    
    inline def setDataSourceColumnReference(value: SchemaDataSourceColumnReference): Self = StObject.set(x, "dataSourceColumnReference", value.asInstanceOf[js.Any])
    
    inline def setDataSourceColumnReferenceUndefined: Self = StObject.set(x, "dataSourceColumnReference", js.undefined)
    
    inline def setDimensionIndex(value: Double): Self = StObject.set(x, "dimensionIndex", value.asInstanceOf[js.Any])
    
    inline def setDimensionIndexNull: Self = StObject.set(x, "dimensionIndex", null)
    
    inline def setDimensionIndexUndefined: Self = StObject.set(x, "dimensionIndex", js.undefined)
    
    inline def setForegroundColor(value: SchemaColor): Self = StObject.set(x, "foregroundColor", value.asInstanceOf[js.Any])
    
    inline def setForegroundColorStyle(value: SchemaColorStyle): Self = StObject.set(x, "foregroundColorStyle", value.asInstanceOf[js.Any])
    
    inline def setForegroundColorStyleUndefined: Self = StObject.set(x, "foregroundColorStyle", js.undefined)
    
    inline def setForegroundColorUndefined: Self = StObject.set(x, "foregroundColor", js.undefined)
    
    inline def setSortOrder(value: String): Self = StObject.set(x, "sortOrder", value.asInstanceOf[js.Any])
    
    inline def setSortOrderNull: Self = StObject.set(x, "sortOrder", null)
    
    inline def setSortOrderUndefined: Self = StObject.set(x, "sortOrder", js.undefined)
  }
}
