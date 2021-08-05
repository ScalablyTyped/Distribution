package typings.googleapis.visionV1p2beta1Mod.visionV1p2beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Response to an async batch image annotation request.
  */
trait SchemaGoogleCloudVisionV1p4beta1AsyncBatchAnnotateImagesResponse extends StObject {
  
  /**
    * The output location and metadata from AsyncBatchAnnotateImagesRequest.
    */
  var outputConfig: js.UndefOr[SchemaGoogleCloudVisionV1p4beta1OutputConfig] = js.undefined
}
object SchemaGoogleCloudVisionV1p4beta1AsyncBatchAnnotateImagesResponse {
  
  inline def apply(): SchemaGoogleCloudVisionV1p4beta1AsyncBatchAnnotateImagesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudVisionV1p4beta1AsyncBatchAnnotateImagesResponse]
  }
  
  extension [Self <: SchemaGoogleCloudVisionV1p4beta1AsyncBatchAnnotateImagesResponse](x: Self) {
    
    inline def setOutputConfig(value: SchemaGoogleCloudVisionV1p4beta1OutputConfig): Self = StObject.set(x, "outputConfig", value.asInstanceOf[js.Any])
    
    inline def setOutputConfigUndefined: Self = StObject.set(x, "outputConfig", js.undefined)
  }
}
