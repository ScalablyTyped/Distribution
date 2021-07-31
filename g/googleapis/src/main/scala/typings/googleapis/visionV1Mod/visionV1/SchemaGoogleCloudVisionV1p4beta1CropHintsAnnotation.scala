package typings.googleapis.visionV1Mod.visionV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Set of crop hints that are used to generate new crops when serving images.
  */
trait SchemaGoogleCloudVisionV1p4beta1CropHintsAnnotation extends StObject {
  
  /**
    * Crop hint results.
    */
  var cropHints: js.UndefOr[js.Array[SchemaGoogleCloudVisionV1p4beta1CropHint]] = js.undefined
}
object SchemaGoogleCloudVisionV1p4beta1CropHintsAnnotation {
  
  @scala.inline
  def apply(): SchemaGoogleCloudVisionV1p4beta1CropHintsAnnotation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudVisionV1p4beta1CropHintsAnnotation]
  }
  
  @scala.inline
  implicit class SchemaGoogleCloudVisionV1p4beta1CropHintsAnnotationMutableBuilder[Self <: SchemaGoogleCloudVisionV1p4beta1CropHintsAnnotation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCropHints(value: js.Array[SchemaGoogleCloudVisionV1p4beta1CropHint]): Self = StObject.set(x, "cropHints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCropHintsUndefined: Self = StObject.set(x, "cropHints", js.undefined)
    
    @scala.inline
    def setCropHintsVarargs(value: SchemaGoogleCloudVisionV1p4beta1CropHint*): Self = StObject.set(x, "cropHints", js.Array(value :_*))
  }
}
