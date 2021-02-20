package typings.googleapis.docsV1Mod.docsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The properties of an image.
  */
@js.native
trait SchemaImageProperties extends StObject {
  
  /**
    * The clockwise rotation angle of the image, in radians.
    */
  var angle: js.UndefOr[Double] = js.native
  
  /**
    * The brightness effect of the image. The value should be in the interval
    * [-1.0, 1.0], where 0 means no effect.
    */
  var brightness: js.UndefOr[Double] = js.native
  
  /**
    * A URI to the image with a default lifetime of 30 minutes. This URI is
    * tagged with the account of the requester. Anyone with the URI effectively
    * accesses the image as the original requester. Access to the image may be
    * lost if the document&#39;s sharing settings change.
    */
  var contentUri: js.UndefOr[String] = js.native
  
  /**
    * The contrast effect of the image. The value should be in the interval
    * [-1.0, 1.0], where 0 means no effect.
    */
  var contrast: js.UndefOr[Double] = js.native
  
  /**
    * The crop properties of the image.  After cropping, the image will be
    * stretched to fit in its container.
    */
  var cropProperties: js.UndefOr[SchemaCropProperties] = js.native
  
  /**
    * The source URI is the URI used to insert the image. The source URI can be
    * empty.
    */
  var sourceUri: js.UndefOr[String] = js.native
  
  /**
    * The transparency effect of the image. The value should be in the interval
    * [0.0, 1.0], where 0 means no effect and 1 means completely transparent.
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
    def setAngle(value: Double): Self = StObject.set(x, "angle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAngleUndefined: Self = StObject.set(x, "angle", js.undefined)
    
    @scala.inline
    def setBrightness(value: Double): Self = StObject.set(x, "brightness", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBrightnessUndefined: Self = StObject.set(x, "brightness", js.undefined)
    
    @scala.inline
    def setContentUri(value: String): Self = StObject.set(x, "contentUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentUriUndefined: Self = StObject.set(x, "contentUri", js.undefined)
    
    @scala.inline
    def setContrast(value: Double): Self = StObject.set(x, "contrast", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContrastUndefined: Self = StObject.set(x, "contrast", js.undefined)
    
    @scala.inline
    def setCropProperties(value: SchemaCropProperties): Self = StObject.set(x, "cropProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCropPropertiesUndefined: Self = StObject.set(x, "cropProperties", js.undefined)
    
    @scala.inline
    def setSourceUri(value: String): Self = StObject.set(x, "sourceUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceUriUndefined: Self = StObject.set(x, "sourceUri", js.undefined)
    
    @scala.inline
    def setTransparency(value: Double): Self = StObject.set(x, "transparency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransparencyUndefined: Self = StObject.set(x, "transparency", js.undefined)
  }
}
