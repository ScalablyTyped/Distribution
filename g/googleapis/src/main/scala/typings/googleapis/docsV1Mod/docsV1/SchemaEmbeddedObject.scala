package typings.googleapis.docsV1Mod.docsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An embedded object in the document.
  */
trait SchemaEmbeddedObject extends StObject {
  
  /**
    * The description of the embedded object. The `title` and `description` are
    * both combined to display alt text.
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * The properties of an embedded drawing.
    */
  var embeddedDrawingProperties: js.UndefOr[SchemaEmbeddedDrawingProperties] = js.undefined
  
  /**
    * The border of the embedded object.
    */
  var embeddedObjectBorder: js.UndefOr[SchemaEmbeddedObjectBorder] = js.undefined
  
  /**
    * The properties of an image.
    */
  var imageProperties: js.UndefOr[SchemaImageProperties] = js.undefined
  
  /**
    * A reference to the external linked source content. For example, it
    * contains a reference to the source Sheets chart when the embedded object
    * is a linked chart.  If unset, then the embedded object is not linked.
    */
  var linkedContentReference: js.UndefOr[SchemaLinkedContentReference] = js.undefined
  
  /**
    * The bottom margin of the embedded object.
    */
  var marginBottom: js.UndefOr[SchemaDimension] = js.undefined
  
  /**
    * The left margin of the embedded object.
    */
  var marginLeft: js.UndefOr[SchemaDimension] = js.undefined
  
  /**
    * The right margin of the embedded object.
    */
  var marginRight: js.UndefOr[SchemaDimension] = js.undefined
  
  /**
    * The top margin of the embedded object.
    */
  var marginTop: js.UndefOr[SchemaDimension] = js.undefined
  
  /**
    * The size of the embedded object.
    */
  var size: js.UndefOr[SchemaSize] = js.undefined
  
  /**
    * The title of the embedded object. The `title` and `description` are both
    * combined to display alt text.
    */
  var title: js.UndefOr[String] = js.undefined
}
object SchemaEmbeddedObject {
  
  @scala.inline
  def apply(): SchemaEmbeddedObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaEmbeddedObject]
  }
  
  @scala.inline
  implicit class SchemaEmbeddedObjectMutableBuilder[Self <: SchemaEmbeddedObject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setEmbeddedDrawingProperties(value: SchemaEmbeddedDrawingProperties): Self = StObject.set(x, "embeddedDrawingProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmbeddedDrawingPropertiesUndefined: Self = StObject.set(x, "embeddedDrawingProperties", js.undefined)
    
    @scala.inline
    def setEmbeddedObjectBorder(value: SchemaEmbeddedObjectBorder): Self = StObject.set(x, "embeddedObjectBorder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmbeddedObjectBorderUndefined: Self = StObject.set(x, "embeddedObjectBorder", js.undefined)
    
    @scala.inline
    def setImageProperties(value: SchemaImageProperties): Self = StObject.set(x, "imageProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImagePropertiesUndefined: Self = StObject.set(x, "imageProperties", js.undefined)
    
    @scala.inline
    def setLinkedContentReference(value: SchemaLinkedContentReference): Self = StObject.set(x, "linkedContentReference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLinkedContentReferenceUndefined: Self = StObject.set(x, "linkedContentReference", js.undefined)
    
    @scala.inline
    def setMarginBottom(value: SchemaDimension): Self = StObject.set(x, "marginBottom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarginBottomUndefined: Self = StObject.set(x, "marginBottom", js.undefined)
    
    @scala.inline
    def setMarginLeft(value: SchemaDimension): Self = StObject.set(x, "marginLeft", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarginLeftUndefined: Self = StObject.set(x, "marginLeft", js.undefined)
    
    @scala.inline
    def setMarginRight(value: SchemaDimension): Self = StObject.set(x, "marginRight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarginRightUndefined: Self = StObject.set(x, "marginRight", js.undefined)
    
    @scala.inline
    def setMarginTop(value: SchemaDimension): Self = StObject.set(x, "marginTop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarginTopUndefined: Self = StObject.set(x, "marginTop", js.undefined)
    
    @scala.inline
    def setSize(value: SchemaSize): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
