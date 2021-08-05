package typings.googleapis.docsV1Mod.docsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A border around a table cell.
  */
trait SchemaTableCellBorder extends StObject {
  
  /**
    * The color of the border.
    */
  var color: js.UndefOr[SchemaOptionalColor] = js.undefined
  
  /**
    * The dash style of the border.
    */
  var dashStyle: js.UndefOr[String] = js.undefined
  
  /**
    * The width of the border.
    */
  var width: js.UndefOr[SchemaDimension] = js.undefined
}
object SchemaTableCellBorder {
  
  inline def apply(): SchemaTableCellBorder = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTableCellBorder]
  }
  
  extension [Self <: SchemaTableCellBorder](x: Self) {
    
    inline def setColor(value: SchemaOptionalColor): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setDashStyle(value: String): Self = StObject.set(x, "dashStyle", value.asInstanceOf[js.Any])
    
    inline def setDashStyleUndefined: Self = StObject.set(x, "dashStyle", js.undefined)
    
    inline def setWidth(value: SchemaDimension): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
