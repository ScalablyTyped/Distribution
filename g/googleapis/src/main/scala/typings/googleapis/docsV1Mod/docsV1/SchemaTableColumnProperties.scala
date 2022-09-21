package typings.googleapis.docsV1Mod.docsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaTableColumnProperties extends StObject {
  
  /**
    * The width of the column. Set when the column's `width_type` is FIXED_WIDTH.
    */
  var width: js.UndefOr[SchemaDimension] = js.undefined
  
  /**
    * The width type of the column.
    */
  var widthType: js.UndefOr[String | Null] = js.undefined
}
object SchemaTableColumnProperties {
  
  inline def apply(): SchemaTableColumnProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTableColumnProperties]
  }
  
  extension [Self <: SchemaTableColumnProperties](x: Self) {
    
    inline def setWidth(value: SchemaDimension): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthType(value: String): Self = StObject.set(x, "widthType", value.asInstanceOf[js.Any])
    
    inline def setWidthTypeNull: Self = StObject.set(x, "widthType", null)
    
    inline def setWidthTypeUndefined: Self = StObject.set(x, "widthType", js.undefined)
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
