package typings.googleapis.visionV1p1beta1Mod.visionV1p1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A face-specific landmark (for example, a face feature).
  */
trait SchemaGoogleCloudVisionV1p1beta1FaceAnnotationLandmark extends StObject {
  
  /**
    * Face landmark position.
    */
  var position: js.UndefOr[SchemaGoogleCloudVisionV1p1beta1Position] = js.undefined
  
  /**
    * Face landmark type.
    */
  var `type`: js.UndefOr[String] = js.undefined
}
object SchemaGoogleCloudVisionV1p1beta1FaceAnnotationLandmark {
  
  inline def apply(): SchemaGoogleCloudVisionV1p1beta1FaceAnnotationLandmark = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudVisionV1p1beta1FaceAnnotationLandmark]
  }
  
  extension [Self <: SchemaGoogleCloudVisionV1p1beta1FaceAnnotationLandmark](x: Self) {
    
    inline def setPosition(value: SchemaGoogleCloudVisionV1p1beta1Position): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
