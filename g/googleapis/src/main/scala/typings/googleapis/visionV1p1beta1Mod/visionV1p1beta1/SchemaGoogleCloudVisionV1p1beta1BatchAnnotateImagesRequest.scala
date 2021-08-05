package typings.googleapis.visionV1p1beta1Mod.visionV1p1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Multiple image annotation requests are batched into a single service call.
  */
trait SchemaGoogleCloudVisionV1p1beta1BatchAnnotateImagesRequest extends StObject {
  
  /**
    * Individual image annotation requests for this batch.
    */
  var requests: js.UndefOr[js.Array[SchemaGoogleCloudVisionV1p1beta1AnnotateImageRequest]] = js.undefined
}
object SchemaGoogleCloudVisionV1p1beta1BatchAnnotateImagesRequest {
  
  inline def apply(): SchemaGoogleCloudVisionV1p1beta1BatchAnnotateImagesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudVisionV1p1beta1BatchAnnotateImagesRequest]
  }
  
  extension [Self <: SchemaGoogleCloudVisionV1p1beta1BatchAnnotateImagesRequest](x: Self) {
    
    inline def setRequests(value: js.Array[SchemaGoogleCloudVisionV1p1beta1AnnotateImageRequest]): Self = StObject.set(x, "requests", value.asInstanceOf[js.Any])
    
    inline def setRequestsUndefined: Self = StObject.set(x, "requests", js.undefined)
    
    inline def setRequestsVarargs(value: SchemaGoogleCloudVisionV1p1beta1AnnotateImageRequest*): Self = StObject.set(x, "requests", js.Array(value :_*))
  }
}
