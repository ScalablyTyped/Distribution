package typings.googleapis.slidesV1Mod.slidesV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The shadow properties of a page element.  If these fields are unset, they
  * may be inherited from a parent placeholder if it exists. If there is no
  * parent, the fields will default to the value used for new page elements
  * created in the Slides editor, which may depend on the page element kind.
  */
trait SchemaShadow extends StObject {
  
  /**
    * The alignment point of the shadow, that sets the origin for translate,
    * scale and skew of the shadow. This property is read-only.
    */
  var alignment: js.UndefOr[String] = js.undefined
  
  /**
    * The alpha of the shadow&#39;s color, from 0.0 to 1.0.
    */
  var alpha: js.UndefOr[Double] = js.undefined
  
  /**
    * The radius of the shadow blur. The larger the radius, the more diffuse
    * the shadow becomes.
    */
  var blurRadius: js.UndefOr[SchemaDimension] = js.undefined
  
  /**
    * The shadow color value.
    */
  var color: js.UndefOr[SchemaOpaqueColor] = js.undefined
  
  /**
    * The shadow property state.  Updating the shadow on a page element will
    * implicitly update this field to `RENDERED`, unless another value is
    * specified in the same request. To have no shadow on a page element, set
    * this field to `NOT_RENDERED`. In this case, any other shadow fields set
    * in the same request will be ignored.
    */
  var propertyState: js.UndefOr[String] = js.undefined
  
  /**
    * Whether the shadow should rotate with the shape. This property is
    * read-only.
    */
  var rotateWithShape: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Transform that encodes the translate, scale, and skew of the shadow,
    * relative to the alignment position.
    */
  var transform: js.UndefOr[SchemaAffineTransform] = js.undefined
  
  /**
    * The type of the shadow. This property is read-only.
    */
  var `type`: js.UndefOr[String] = js.undefined
}
object SchemaShadow {
  
  inline def apply(): SchemaShadow = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaShadow]
  }
  
  extension [Self <: SchemaShadow](x: Self) {
    
    inline def setAlignment(value: String): Self = StObject.set(x, "alignment", value.asInstanceOf[js.Any])
    
    inline def setAlignmentUndefined: Self = StObject.set(x, "alignment", js.undefined)
    
    inline def setAlpha(value: Double): Self = StObject.set(x, "alpha", value.asInstanceOf[js.Any])
    
    inline def setAlphaUndefined: Self = StObject.set(x, "alpha", js.undefined)
    
    inline def setBlurRadius(value: SchemaDimension): Self = StObject.set(x, "blurRadius", value.asInstanceOf[js.Any])
    
    inline def setBlurRadiusUndefined: Self = StObject.set(x, "blurRadius", js.undefined)
    
    inline def setColor(value: SchemaOpaqueColor): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setPropertyState(value: String): Self = StObject.set(x, "propertyState", value.asInstanceOf[js.Any])
    
    inline def setPropertyStateUndefined: Self = StObject.set(x, "propertyState", js.undefined)
    
    inline def setRotateWithShape(value: Boolean): Self = StObject.set(x, "rotateWithShape", value.asInstanceOf[js.Any])
    
    inline def setRotateWithShapeUndefined: Self = StObject.set(x, "rotateWithShape", js.undefined)
    
    inline def setTransform(value: SchemaAffineTransform): Self = StObject.set(x, "transform", value.asInstanceOf[js.Any])
    
    inline def setTransformUndefined: Self = StObject.set(x, "transform", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
