package typings.googleapis.visionV1p2beta1Mod.visionV1p2beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Multiple async file annotation requests are batched into a single service
  * call.
  */
trait SchemaGoogleCloudVisionV1p2beta1AsyncBatchAnnotateFilesRequest extends StObject {
  
  /**
    * Individual async file annotation requests for this batch.
    */
  var requests: js.UndefOr[js.Array[SchemaGoogleCloudVisionV1p2beta1AsyncAnnotateFileRequest]] = js.undefined
}
object SchemaGoogleCloudVisionV1p2beta1AsyncBatchAnnotateFilesRequest {
  
  @scala.inline
  def apply(): SchemaGoogleCloudVisionV1p2beta1AsyncBatchAnnotateFilesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudVisionV1p2beta1AsyncBatchAnnotateFilesRequest]
  }
  
  @scala.inline
  implicit class SchemaGoogleCloudVisionV1p2beta1AsyncBatchAnnotateFilesRequestMutableBuilder[Self <: SchemaGoogleCloudVisionV1p2beta1AsyncBatchAnnotateFilesRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRequests(value: js.Array[SchemaGoogleCloudVisionV1p2beta1AsyncAnnotateFileRequest]): Self = StObject.set(x, "requests", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestsUndefined: Self = StObject.set(x, "requests", js.undefined)
    
    @scala.inline
    def setRequestsVarargs(value: SchemaGoogleCloudVisionV1p2beta1AsyncAnnotateFileRequest*): Self = StObject.set(x, "requests", js.Array(value :_*))
  }
}
