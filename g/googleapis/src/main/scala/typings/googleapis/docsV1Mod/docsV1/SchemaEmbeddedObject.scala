package typings.googleapis.docsV1Mod.docsV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An embedded object in the document.
  */
@js.native
trait SchemaEmbeddedObject extends js.Object {
  
  /**
    * The description of the embedded object. The `title` and `description` are
    * both combined to display alt text.
    */
  var description: js.UndefOr[String] = js.native
  
  /**
    * The properties of an embedded drawing.
    */
  var embeddedDrawingProperties: js.UndefOr[SchemaEmbeddedDrawingProperties] = js.native
  
  /**
    * The border of the embedded object.
    */
  var embeddedObjectBorder: js.UndefOr[SchemaEmbeddedObjectBorder] = js.native
  
  /**
    * The properties of an image.
    */
  var imageProperties: js.UndefOr[SchemaImageProperties] = js.native
  
  /**
    * A reference to the external linked source content. For example, it
    * contains a reference to the source Sheets chart when the embedded object
    * is a linked chart.  If unset, then the embedded object is not linked.
    */
  var linkedContentReference: js.UndefOr[SchemaLinkedContentReference] = js.native
  
  /**
    * The bottom margin of the embedded object.
    */
  var marginBottom: js.UndefOr[SchemaDimension] = js.native
  
  /**
    * The left margin of the embedded object.
    */
  var marginLeft: js.UndefOr[SchemaDimension] = js.native
  
  /**
    * The right margin of the embedded object.
    */
  var marginRight: js.UndefOr[SchemaDimension] = js.native
  
  /**
    * The top margin of the embedded object.
    */
  var marginTop: js.UndefOr[SchemaDimension] = js.native
  
  /**
    * The size of the embedded object.
    */
  var size: js.UndefOr[SchemaSize] = js.native
  
  /**
    * The title of the embedded object. The `title` and `description` are both
    * combined to display alt text.
    */
  var title: js.UndefOr[String] = js.native
}
object SchemaEmbeddedObject {
  
  @scala.inline
  def apply(): SchemaEmbeddedObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaEmbeddedObject]
  }
  
  @scala.inline
  implicit class SchemaEmbeddedObjectOps[Self <: SchemaEmbeddedObject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setEmbeddedDrawingProperties(value: SchemaEmbeddedDrawingProperties): Self = this.set("embeddedDrawingProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEmbeddedDrawingProperties: Self = this.set("embeddedDrawingProperties", js.undefined)
    
    @scala.inline
    def setEmbeddedObjectBorder(value: SchemaEmbeddedObjectBorder): Self = this.set("embeddedObjectBorder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEmbeddedObjectBorder: Self = this.set("embeddedObjectBorder", js.undefined)
    
    @scala.inline
    def setImageProperties(value: SchemaImageProperties): Self = this.set("imageProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImageProperties: Self = this.set("imageProperties", js.undefined)
    
    @scala.inline
    def setLinkedContentReference(value: SchemaLinkedContentReference): Self = this.set("linkedContentReference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLinkedContentReference: Self = this.set("linkedContentReference", js.undefined)
    
    @scala.inline
    def setMarginBottom(value: SchemaDimension): Self = this.set("marginBottom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMarginBottom: Self = this.set("marginBottom", js.undefined)
    
    @scala.inline
    def setMarginLeft(value: SchemaDimension): Self = this.set("marginLeft", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMarginLeft: Self = this.set("marginLeft", js.undefined)
    
    @scala.inline
    def setMarginRight(value: SchemaDimension): Self = this.set("marginRight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMarginRight: Self = this.set("marginRight", js.undefined)
    
    @scala.inline
    def setMarginTop(value: SchemaDimension): Self = this.set("marginTop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMarginTop: Self = this.set("marginTop", js.undefined)
    
    @scala.inline
    def setSize(value: SchemaSize): Self = this.set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
  }
}
