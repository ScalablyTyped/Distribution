package typings.googleapis.slidesV1Mod.slidesV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The properties of the Image.
  */
@js.native
trait SchemaImageProperties extends StObject {
  
  /**
    * The brightness effect of the image. The value should be in the interval
    * [-1.0, 1.0], where 0 means no effect. This property is read-only.
    */
  var brightness: js.UndefOr[Double] = js.native
  
  /**
    * The contrast effect of the image. The value should be in the interval
    * [-1.0, 1.0], where 0 means no effect. This property is read-only.
    */
  var contrast: js.UndefOr[Double] = js.native
  
  /**
    * The crop properties of the image. If not set, the image is not cropped.
    * This property is read-only.
    */
  var cropProperties: js.UndefOr[SchemaCropProperties] = js.native
  
  /**
    * The hyperlink destination of the image. If unset, there is no link.
    */
  var link: js.UndefOr[SchemaLink] = js.native
  
  /**
    * The outline of the image. If not set, the image has no outline.
    */
  var outline: js.UndefOr[SchemaOutline] = js.native
  
  /**
    * The recolor effect of the image. If not set, the image is not recolored.
    * This property is read-only.
    */
  var recolor: js.UndefOr[SchemaRecolor] = js.native
  
  /**
    * The shadow of the image. If not set, the image has no shadow. This
    * property is read-only.
    */
  var shadow: js.UndefOr[SchemaShadow] = js.native
  
  /**
    * The transparency effect of the image. The value should be in the interval
    * [0.0, 1.0], where 0 means no effect and 1 means completely transparent.
    * This property is read-only.
    */
  var transparency: js.UndefOr[Double] = js.native
}
object SchemaImageProperties {
  
  @scala.inline
  def apply(): SchemaImageProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaImageProperties]
  }
  
  @scala.inline
  implicit class SchemaImagePropertiesMutableBuilder[Self <: SchemaImageProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBrightness(value: Double): Self = StObject.set(x, "brightness", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBrightnessUndefined: Self = StObject.set(x, "brightness", js.undefined)
    
    @scala.inline
    def setContrast(value: Double): Self = StObject.set(x, "contrast", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContrastUndefined: Self = StObject.set(x, "contrast", js.undefined)
    
    @scala.inline
    def setCropProperties(value: SchemaCropProperties): Self = StObject.set(x, "cropProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCropPropertiesUndefined: Self = StObject.set(x, "cropProperties", js.undefined)
    
    @scala.inline
    def setLink(value: SchemaLink): Self = StObject.set(x, "link", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLinkUndefined: Self = StObject.set(x, "link", js.undefined)
    
    @scala.inline
    def setOutline(value: SchemaOutline): Self = StObject.set(x, "outline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutlineUndefined: Self = StObject.set(x, "outline", js.undefined)
    
    @scala.inline
    def setRecolor(value: SchemaRecolor): Self = StObject.set(x, "recolor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecolorUndefined: Self = StObject.set(x, "recolor", js.undefined)
    
    @scala.inline
    def setShadow(value: SchemaShadow): Self = StObject.set(x, "shadow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShadowUndefined: Self = StObject.set(x, "shadow", js.undefined)
    
    @scala.inline
    def setTransparency(value: Double): Self = StObject.set(x, "transparency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransparencyUndefined: Self = StObject.set(x, "transparency", js.undefined)
  }
}
