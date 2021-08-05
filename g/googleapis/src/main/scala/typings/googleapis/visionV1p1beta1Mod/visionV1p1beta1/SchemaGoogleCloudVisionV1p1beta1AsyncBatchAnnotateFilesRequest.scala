package typings.googleapis.visionV1p1beta1Mod.visionV1p1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Multiple async file annotation requests are batched into a single service
  * call.
  */
trait SchemaGoogleCloudVisionV1p1beta1AsyncBatchAnnotateFilesRequest extends StObject {
  
  /**
    * Individual async file annotation requests for this batch.
    */
  var requests: js.UndefOr[js.Array[SchemaGoogleCloudVisionV1p1beta1AsyncAnnotateFileRequest]] = js.undefined
}
object SchemaGoogleCloudVisionV1p1beta1AsyncBatchAnnotateFilesRequest {
  
  inline def apply(): SchemaGoogleCloudVisionV1p1beta1AsyncBatchAnnotateFilesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudVisionV1p1beta1AsyncBatchAnnotateFilesRequest]
  }
  
  extension [Self <: SchemaGoogleCloudVisionV1p1beta1AsyncBatchAnnotateFilesRequest](x: Self) {
    
    inline def setRequests(value: js.Array[SchemaGoogleCloudVisionV1p1beta1AsyncAnnotateFileRequest]): Self = StObject.set(x, "requests", value.asInstanceOf[js.Any])
    
    inline def setRequestsUndefined: Self = StObject.set(x, "requests", js.undefined)
    
    inline def setRequestsVarargs(value: SchemaGoogleCloudVisionV1p1beta1AsyncAnnotateFileRequest*): Self = StObject.set(x, "requests", js.Array(value :_*))
  }
}
