package typings.googleapis.slidesV1Mod.slidesV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The properties of the Image.
  */
trait SchemaImageProperties extends StObject {
  
  /**
    * The brightness effect of the image. The value should be in the interval
    * [-1.0, 1.0], where 0 means no effect. This property is read-only.
    */
  var brightness: js.UndefOr[Double] = js.undefined
  
  /**
    * The contrast effect of the image. The value should be in the interval
    * [-1.0, 1.0], where 0 means no effect. This property is read-only.
    */
  var contrast: js.UndefOr[Double] = js.undefined
  
  /**
    * The crop properties of the image. If not set, the image is not cropped.
    * This property is read-only.
    */
  var cropProperties: js.UndefOr[SchemaCropProperties] = js.undefined
  
  /**
    * The hyperlink destination of the image. If unset, there is no link.
    */
  var link: js.UndefOr[SchemaLink] = js.undefined
  
  /**
    * The outline of the image. If not set, the image has no outline.
    */
  var outline: js.UndefOr[SchemaOutline] = js.undefined
  
  /**
    * The recolor effect of the image. If not set, the image is not recolored.
    * This property is read-only.
    */
  var recolor: js.UndefOr[SchemaRecolor] = js.undefined
  
  /**
    * The shadow of the image. If not set, the image has no shadow. This
    * property is read-only.
    */
  var shadow: js.UndefOr[SchemaShadow] = js.undefined
  
  /**
    * The transparency effect of the image. The value should be in the interval
    * [0.0, 1.0], where 0 means no effect and 1 means completely transparent.
    * This property is read-only.
    */
  var transparency: js.UndefOr[Double] = js.undefined
}
object SchemaImageProperties {
  
  inline def apply(): SchemaImageProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaImageProperties]
  }
  
  extension [Self <: SchemaImageProperties](x: Self) {
    
    inline def setBrightness(value: Double): Self = StObject.set(x, "brightness", value.asInstanceOf[js.Any])
    
    inline def setBrightnessUndefined: Self = StObject.set(x, "brightness", js.undefined)
    
    inline def setContrast(value: Double): Self = StObject.set(x, "contrast", value.asInstanceOf[js.Any])
    
    inline def setContrastUndefined: Self = StObject.set(x, "contrast", js.undefined)
    
    inline def setCropProperties(value: SchemaCropProperties): Self = StObject.set(x, "cropProperties", value.asInstanceOf[js.Any])
    
    inline def setCropPropertiesUndefined: Self = StObject.set(x, "cropProperties", js.undefined)
    
    inline def setLink(value: SchemaLink): Self = StObject.set(x, "link", value.asInstanceOf[js.Any])
    
    inline def setLinkUndefined: Self = StObject.set(x, "link", js.undefined)
    
    inline def setOutline(value: SchemaOutline): Self = StObject.set(x, "outline", value.asInstanceOf[js.Any])
    
    inline def setOutlineUndefined: Self = StObject.set(x, "outline", js.undefined)
    
    inline def setRecolor(value: SchemaRecolor): Self = StObject.set(x, "recolor", value.asInstanceOf[js.Any])
    
    inline def setRecolorUndefined: Self = StObject.set(x, "recolor", js.undefined)
    
    inline def setShadow(value: SchemaShadow): Self = StObject.set(x, "shadow", value.asInstanceOf[js.Any])
    
    inline def setShadowUndefined: Self = StObject.set(x, "shadow", js.undefined)
    
    inline def setTransparency(value: Double): Self = StObject.set(x, "transparency", value.asInstanceOf[js.Any])
    
    inline def setTransparencyUndefined: Self = StObject.set(x, "transparency", js.undefined)
  }
}
