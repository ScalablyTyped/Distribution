package typings.googleapis.slidesV1Mod.slidesV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The properties of a Shape.  If the shape is a placeholder shape as
  * determined by the placeholder field, then these properties may be inherited
  * from a parent placeholder shape. Determining the rendered value of the
  * property depends on the corresponding property_state field value.
  */
@js.native
trait SchemaShapeProperties extends StObject {
  
  /**
    * The alignment of the content in the shape. If unspecified, the alignment
    * is inherited from a parent placeholder if it exists. If the shape has no
    * parent, the default alignment matches the alignment for new shapes
    * created in the Slides editor.
    */
  var contentAlignment: js.UndefOr[String] = js.native
  
  /**
    * The hyperlink destination of the shape. If unset, there is no link. Links
    * are not inherited from parent placeholders.
    */
  var link: js.UndefOr[SchemaLink] = js.native
  
  /**
    * The outline of the shape. If unset, the outline is inherited from a
    * parent placeholder if it exists. If the shape has no parent, then the
    * default outline depends on the shape type, matching the defaults for new
    * shapes created in the Slides editor.
    */
  var outline: js.UndefOr[SchemaOutline] = js.native
  
  /**
    * The shadow properties of the shape. If unset, the shadow is inherited
    * from a parent placeholder if it exists. If the shape has no parent, then
    * the default shadow matches the defaults for new shapes created in the
    * Slides editor. This property is read-only.
    */
  var shadow: js.UndefOr[SchemaShadow] = js.native
  
  /**
    * The background fill of the shape. If unset, the background fill is
    * inherited from a parent placeholder if it exists. If the shape has no
    * parent, then the default background fill depends on the shape type,
    * matching the defaults for new shapes created in the Slides editor.
    */
  var shapeBackgroundFill: js.UndefOr[SchemaShapeBackgroundFill] = js.native
}
object SchemaShapeProperties {
  
  @scala.inline
  def apply(): SchemaShapeProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaShapeProperties]
  }
  
  @scala.inline
  implicit class SchemaShapePropertiesMutableBuilder[Self <: SchemaShapeProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContentAlignment(value: String): Self = StObject.set(x, "contentAlignment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentAlignmentUndefined: Self = StObject.set(x, "contentAlignment", js.undefined)
    
    @scala.inline
    def setLink(value: SchemaLink): Self = StObject.set(x, "link", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLinkUndefined: Self = StObject.set(x, "link", js.undefined)
    
    @scala.inline
    def setOutline(value: SchemaOutline): Self = StObject.set(x, "outline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutlineUndefined: Self = StObject.set(x, "outline", js.undefined)
    
    @scala.inline
    def setShadow(value: SchemaShadow): Self = StObject.set(x, "shadow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShadowUndefined: Self = StObject.set(x, "shadow", js.undefined)
    
    @scala.inline
    def setShapeBackgroundFill(value: SchemaShapeBackgroundFill): Self = StObject.set(x, "shapeBackgroundFill", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShapeBackgroundFillUndefined: Self = StObject.set(x, "shapeBackgroundFill", js.undefined)
  }
}
