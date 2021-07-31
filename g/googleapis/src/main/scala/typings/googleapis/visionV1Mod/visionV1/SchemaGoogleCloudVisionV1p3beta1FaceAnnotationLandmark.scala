package typings.googleapis.visionV1Mod.visionV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A face-specific landmark (for example, a face feature).
  */
trait SchemaGoogleCloudVisionV1p3beta1FaceAnnotationLandmark extends StObject {
  
  /**
    * Face landmark position.
    */
  var position: js.UndefOr[SchemaGoogleCloudVisionV1p3beta1Position] = js.undefined
  
  /**
    * Face landmark type.
    */
  var `type`: js.UndefOr[String] = js.undefined
}
object SchemaGoogleCloudVisionV1p3beta1FaceAnnotationLandmark {
  
  @scala.inline
  def apply(): SchemaGoogleCloudVisionV1p3beta1FaceAnnotationLandmark = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudVisionV1p3beta1FaceAnnotationLandmark]
  }
  
  @scala.inline
  implicit class SchemaGoogleCloudVisionV1p3beta1FaceAnnotationLandmarkMutableBuilder[Self <: SchemaGoogleCloudVisionV1p3beta1FaceAnnotationLandmark] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPosition(value: SchemaGoogleCloudVisionV1p3beta1Position): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
