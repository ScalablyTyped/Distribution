package typings.googleapis.docsV1Mod.docsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaImageProperties extends StObject {
  
  /**
    * The clockwise rotation angle of the image, in radians.
    */
  var angle: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * The brightness effect of the image. The value should be in the interval [-1.0, 1.0], where 0 means no effect.
    */
  var brightness: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * A URI to the image with a default lifetime of 30 minutes. This URI is tagged with the account of the requester. Anyone with the URI effectively accesses the image as the original requester. Access to the image may be lost if the document's sharing settings change.
    */
  var contentUri: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The contrast effect of the image. The value should be in the interval [-1.0, 1.0], where 0 means no effect.
    */
  var contrast: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * The crop properties of the image.
    */
  var cropProperties: js.UndefOr[SchemaCropProperties] = js.undefined
  
  /**
    * The source URI is the URI used to insert the image. The source URI can be empty.
    */
  var sourceUri: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The transparency effect of the image. The value should be in the interval [0.0, 1.0], where 0 means no effect and 1 means completely transparent.
    */
  var transparency: js.UndefOr[Double | Null] = js.undefined
}
object SchemaImageProperties {
  
  inline def apply(): SchemaImageProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaImageProperties]
  }
  
  extension [Self <: SchemaImageProperties](x: Self) {
    
    inline def setAngle(value: Double): Self = StObject.set(x, "angle", value.asInstanceOf[js.Any])
    
    inline def setAngleNull: Self = StObject.set(x, "angle", null)
    
    inline def setAngleUndefined: Self = StObject.set(x, "angle", js.undefined)
    
    inline def setBrightness(value: Double): Self = StObject.set(x, "brightness", value.asInstanceOf[js.Any])
    
    inline def setBrightnessNull: Self = StObject.set(x, "brightness", null)
    
    inline def setBrightnessUndefined: Self = StObject.set(x, "brightness", js.undefined)
    
    inline def setContentUri(value: String): Self = StObject.set(x, "contentUri", value.asInstanceOf[js.Any])
    
    inline def setContentUriNull: Self = StObject.set(x, "contentUri", null)
    
    inline def setContentUriUndefined: Self = StObject.set(x, "contentUri", js.undefined)
    
    inline def setContrast(value: Double): Self = StObject.set(x, "contrast", value.asInstanceOf[js.Any])
    
    inline def setContrastNull: Self = StObject.set(x, "contrast", null)
    
    inline def setContrastUndefined: Self = StObject.set(x, "contrast", js.undefined)
    
    inline def setCropProperties(value: SchemaCropProperties): Self = StObject.set(x, "cropProperties", value.asInstanceOf[js.Any])
    
    inline def setCropPropertiesUndefined: Self = StObject.set(x, "cropProperties", js.undefined)
    
    inline def setSourceUri(value: String): Self = StObject.set(x, "sourceUri", value.asInstanceOf[js.Any])
    
    inline def setSourceUriNull: Self = StObject.set(x, "sourceUri", null)
    
    inline def setSourceUriUndefined: Self = StObject.set(x, "sourceUri", js.undefined)
    
    inline def setTransparency(value: Double): Self = StObject.set(x, "transparency", value.asInstanceOf[js.Any])
    
    inline def setTransparencyNull: Self = StObject.set(x, "transparency", null)
    
    inline def setTransparencyUndefined: Self = StObject.set(x, "transparency", js.undefined)
  }
}
