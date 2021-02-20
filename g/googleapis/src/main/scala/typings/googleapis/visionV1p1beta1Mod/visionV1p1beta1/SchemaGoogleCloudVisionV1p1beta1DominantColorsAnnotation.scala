package typings.googleapis.visionV1p1beta1Mod.visionV1p1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Set of dominant colors and their corresponding scores.
  */
@js.native
trait SchemaGoogleCloudVisionV1p1beta1DominantColorsAnnotation extends StObject {
  
  /**
    * RGB color values with their score and pixel fraction.
    */
  var colors: js.UndefOr[js.Array[SchemaGoogleCloudVisionV1p1beta1ColorInfo]] = js.native
}
object SchemaGoogleCloudVisionV1p1beta1DominantColorsAnnotation {
  
  @scala.inline
  def apply(): SchemaGoogleCloudVisionV1p1beta1DominantColorsAnnotation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudVisionV1p1beta1DominantColorsAnnotation]
  }
  
  @scala.inline
  implicit class SchemaGoogleCloudVisionV1p1beta1DominantColorsAnnotationMutableBuilder[Self <: SchemaGoogleCloudVisionV1p1beta1DominantColorsAnnotation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColors(value: js.Array[SchemaGoogleCloudVisionV1p1beta1ColorInfo]): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorsUndefined: Self = StObject.set(x, "colors", js.undefined)
    
    @scala.inline
    def setColorsVarargs(value: SchemaGoogleCloudVisionV1p1beta1ColorInfo*): Self = StObject.set(x, "colors", js.Array(value :_*))
  }
}
