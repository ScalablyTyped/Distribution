package typings.googleapis.visionV1p1beta1Mod.visionV1p1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Stores image properties, such as dominant colors.
  */
@js.native
trait SchemaGoogleCloudVisionV1p3beta1ImageProperties extends StObject {
  
  /**
    * If present, dominant colors completed successfully.
    */
  var dominantColors: js.UndefOr[SchemaGoogleCloudVisionV1p3beta1DominantColorsAnnotation] = js.native
}
object SchemaGoogleCloudVisionV1p3beta1ImageProperties {
  
  @scala.inline
  def apply(): SchemaGoogleCloudVisionV1p3beta1ImageProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudVisionV1p3beta1ImageProperties]
  }
  
  @scala.inline
  implicit class SchemaGoogleCloudVisionV1p3beta1ImagePropertiesMutableBuilder[Self <: SchemaGoogleCloudVisionV1p3beta1ImageProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDominantColors(value: SchemaGoogleCloudVisionV1p3beta1DominantColorsAnnotation): Self = StObject.set(x, "dominantColors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDominantColorsUndefined: Self = StObject.set(x, "dominantColors", js.undefined)
  }
}
