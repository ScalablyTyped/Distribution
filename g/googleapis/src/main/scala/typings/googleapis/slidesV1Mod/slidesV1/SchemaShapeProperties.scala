package typings.googleapis.slidesV1Mod.slidesV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaShapeProperties extends StObject {
  
  /**
    * The autofit properties of the shape. This property is only set for shapes that allow text.
    */
  var autofit: js.UndefOr[SchemaAutofit] = js.undefined
  
  /**
    * The alignment of the content in the shape. If unspecified, the alignment is inherited from a parent placeholder if it exists. If the shape has no parent, the default alignment matches the alignment for new shapes created in the Slides editor.
    */
  var contentAlignment: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The hyperlink destination of the shape. If unset, there is no link. Links are not inherited from parent placeholders.
    */
  var link: js.UndefOr[SchemaLink] = js.undefined
  
  /**
    * The outline of the shape. If unset, the outline is inherited from a parent placeholder if it exists. If the shape has no parent, then the default outline depends on the shape type, matching the defaults for new shapes created in the Slides editor.
    */
  var outline: js.UndefOr[SchemaOutline] = js.undefined
  
  /**
    * The shadow properties of the shape. If unset, the shadow is inherited from a parent placeholder if it exists. If the shape has no parent, then the default shadow matches the defaults for new shapes created in the Slides editor. This property is read-only.
    */
  var shadow: js.UndefOr[SchemaShadow] = js.undefined
  
  /**
    * The background fill of the shape. If unset, the background fill is inherited from a parent placeholder if it exists. If the shape has no parent, then the default background fill depends on the shape type, matching the defaults for new shapes created in the Slides editor.
    */
  var shapeBackgroundFill: js.UndefOr[SchemaShapeBackgroundFill] = js.undefined
}
object SchemaShapeProperties {
  
  inline def apply(): SchemaShapeProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaShapeProperties]
  }
  
  extension [Self <: SchemaShapeProperties](x: Self) {
    
    inline def setAutofit(value: SchemaAutofit): Self = StObject.set(x, "autofit", value.asInstanceOf[js.Any])
    
    inline def setAutofitUndefined: Self = StObject.set(x, "autofit", js.undefined)
    
    inline def setContentAlignment(value: String): Self = StObject.set(x, "contentAlignment", value.asInstanceOf[js.Any])
    
    inline def setContentAlignmentNull: Self = StObject.set(x, "contentAlignment", null)
    
    inline def setContentAlignmentUndefined: Self = StObject.set(x, "contentAlignment", js.undefined)
    
    inline def setLink(value: SchemaLink): Self = StObject.set(x, "link", value.asInstanceOf[js.Any])
    
    inline def setLinkUndefined: Self = StObject.set(x, "link", js.undefined)
    
    inline def setOutline(value: SchemaOutline): Self = StObject.set(x, "outline", value.asInstanceOf[js.Any])
    
    inline def setOutlineUndefined: Self = StObject.set(x, "outline", js.undefined)
    
    inline def setShadow(value: SchemaShadow): Self = StObject.set(x, "shadow", value.asInstanceOf[js.Any])
    
    inline def setShadowUndefined: Self = StObject.set(x, "shadow", js.undefined)
    
    inline def setShapeBackgroundFill(value: SchemaShapeBackgroundFill): Self = StObject.set(x, "shapeBackgroundFill", value.asInstanceOf[js.Any])
    
    inline def setShapeBackgroundFillUndefined: Self = StObject.set(x, "shapeBackgroundFill", js.undefined)
  }
}
