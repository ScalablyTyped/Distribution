package typings.googleapis.slidesV1Mod.slidesV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A PageElement kind representing a generic shape that does not have a more
  * specific classification.
  */
@js.native
trait SchemaShape extends StObject {
  
  /**
    * Placeholders are shapes that are inherit from corresponding placeholders
    * on layouts and masters.  If set, the shape is a placeholder shape and any
    * inherited properties can be resolved by looking at the parent placeholder
    * identified by the Placeholder.parent_object_id field.
    */
  var placeholder: js.UndefOr[SchemaPlaceholder] = js.native
  
  /**
    * The properties of the shape.
    */
  var shapeProperties: js.UndefOr[SchemaShapeProperties] = js.native
  
  /**
    * The type of the shape.
    */
  var shapeType: js.UndefOr[String] = js.native
  
  /**
    * The text content of the shape.
    */
  var text: js.UndefOr[SchemaTextContent] = js.native
}
object SchemaShape {
  
  @scala.inline
  def apply(): SchemaShape = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaShape]
  }
  
  @scala.inline
  implicit class SchemaShapeMutableBuilder[Self <: SchemaShape] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPlaceholder(value: SchemaPlaceholder): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
    
    @scala.inline
    def setShapeProperties(value: SchemaShapeProperties): Self = StObject.set(x, "shapeProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShapePropertiesUndefined: Self = StObject.set(x, "shapeProperties", js.undefined)
    
    @scala.inline
    def setShapeType(value: String): Self = StObject.set(x, "shapeType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShapeTypeUndefined: Self = StObject.set(x, "shapeType", js.undefined)
    
    @scala.inline
    def setText(value: SchemaTextContent): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
  }
}
