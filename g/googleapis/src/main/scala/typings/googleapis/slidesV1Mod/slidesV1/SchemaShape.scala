package typings.googleapis.slidesV1Mod.slidesV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaShape extends StObject {
  
  /**
    * Placeholders are page elements that inherit from corresponding placeholders on layouts and masters. If set, the shape is a placeholder shape and any inherited properties can be resolved by looking at the parent placeholder identified by the Placeholder.parent_object_id field.
    */
  var placeholder: js.UndefOr[SchemaPlaceholder] = js.undefined
  
  /**
    * The properties of the shape.
    */
  var shapeProperties: js.UndefOr[SchemaShapeProperties] = js.undefined
  
  /**
    * The type of the shape.
    */
  var shapeType: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The text content of the shape.
    */
  var text: js.UndefOr[SchemaTextContent] = js.undefined
}
object SchemaShape {
  
  inline def apply(): SchemaShape = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaShape]
  }
  
  extension [Self <: SchemaShape](x: Self) {
    
    inline def setPlaceholder(value: SchemaPlaceholder): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
    
    inline def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
    
    inline def setShapeProperties(value: SchemaShapeProperties): Self = StObject.set(x, "shapeProperties", value.asInstanceOf[js.Any])
    
    inline def setShapePropertiesUndefined: Self = StObject.set(x, "shapeProperties", js.undefined)
    
    inline def setShapeType(value: String): Self = StObject.set(x, "shapeType", value.asInstanceOf[js.Any])
    
    inline def setShapeTypeNull: Self = StObject.set(x, "shapeType", null)
    
    inline def setShapeTypeUndefined: Self = StObject.set(x, "shapeType", js.undefined)
    
    inline def setText(value: SchemaTextContent): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
  }
}
