package typings.googleapis.docsV1Mod.docsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A border around an EmbeddedObject.
  */
trait SchemaEmbeddedObjectBorder extends StObject {
  
  /**
    * The color of the border.
    */
  var color: js.UndefOr[SchemaOptionalColor] = js.undefined
  
  /**
    * The dash style of the border.
    */
  var dashStyle: js.UndefOr[String] = js.undefined
  
  /**
    * The property state of the border property.
    */
  var propertyState: js.UndefOr[String] = js.undefined
  
  /**
    * The width of the border.
    */
  var width: js.UndefOr[SchemaDimension] = js.undefined
}
object SchemaEmbeddedObjectBorder {
  
  @scala.inline
  def apply(): SchemaEmbeddedObjectBorder = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaEmbeddedObjectBorder]
  }
  
  @scala.inline
  implicit class SchemaEmbeddedObjectBorderMutableBuilder[Self <: SchemaEmbeddedObjectBorder] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColor(value: SchemaOptionalColor): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    @scala.inline
    def setDashStyle(value: String): Self = StObject.set(x, "dashStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDashStyleUndefined: Self = StObject.set(x, "dashStyle", js.undefined)
    
    @scala.inline
    def setPropertyState(value: String): Self = StObject.set(x, "propertyState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPropertyStateUndefined: Self = StObject.set(x, "propertyState", js.undefined)
    
    @scala.inline
    def setWidth(value: SchemaDimension): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
