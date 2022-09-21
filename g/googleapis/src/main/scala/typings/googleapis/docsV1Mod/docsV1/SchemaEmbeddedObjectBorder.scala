package typings.googleapis.docsV1Mod.docsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaEmbeddedObjectBorder extends StObject {
  
  /**
    * The color of the border.
    */
  var color: js.UndefOr[SchemaOptionalColor] = js.undefined
  
  /**
    * The dash style of the border.
    */
  var dashStyle: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The property state of the border property.
    */
  var propertyState: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The width of the border.
    */
  var width: js.UndefOr[SchemaDimension] = js.undefined
}
object SchemaEmbeddedObjectBorder {
  
  inline def apply(): SchemaEmbeddedObjectBorder = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaEmbeddedObjectBorder]
  }
  
  extension [Self <: SchemaEmbeddedObjectBorder](x: Self) {
    
    inline def setColor(value: SchemaOptionalColor): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setDashStyle(value: String): Self = StObject.set(x, "dashStyle", value.asInstanceOf[js.Any])
    
    inline def setDashStyleNull: Self = StObject.set(x, "dashStyle", null)
    
    inline def setDashStyleUndefined: Self = StObject.set(x, "dashStyle", js.undefined)
    
    inline def setPropertyState(value: String): Self = StObject.set(x, "propertyState", value.asInstanceOf[js.Any])
    
    inline def setPropertyStateNull: Self = StObject.set(x, "propertyState", null)
    
    inline def setPropertyStateUndefined: Self = StObject.set(x, "propertyState", js.undefined)
    
    inline def setWidth(value: SchemaDimension): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
