package typings.googleapis.visionV1p1beta1Mod.visionV1p1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Multiple image annotation requests are batched into a single service call.
  */
@js.native
trait SchemaGoogleCloudVisionV1p1beta1BatchAnnotateImagesRequest extends StObject {
  
  /**
    * Individual image annotation requests for this batch.
    */
  var requests: js.UndefOr[js.Array[SchemaGoogleCloudVisionV1p1beta1AnnotateImageRequest]] = js.native
}
object SchemaGoogleCloudVisionV1p1beta1BatchAnnotateImagesRequest {
  
  @scala.inline
  def apply(): SchemaGoogleCloudVisionV1p1beta1BatchAnnotateImagesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudVisionV1p1beta1BatchAnnotateImagesRequest]
  }
  
  @scala.inline
  implicit class SchemaGoogleCloudVisionV1p1beta1BatchAnnotateImagesRequestMutableBuilder[Self <: SchemaGoogleCloudVisionV1p1beta1BatchAnnotateImagesRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRequests(value: js.Array[SchemaGoogleCloudVisionV1p1beta1AnnotateImageRequest]): Self = StObject.set(x, "requests", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestsUndefined: Self = StObject.set(x, "requests", js.undefined)
    
    @scala.inline
    def setRequestsVarargs(value: SchemaGoogleCloudVisionV1p1beta1AnnotateImageRequest*): Self = StObject.set(x, "requests", js.Array(value :_*))
  }
}
