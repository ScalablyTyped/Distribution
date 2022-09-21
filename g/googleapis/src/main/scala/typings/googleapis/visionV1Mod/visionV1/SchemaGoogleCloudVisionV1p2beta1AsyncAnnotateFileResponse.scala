package typings.googleapis.visionV1Mod.visionV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudVisionV1p2beta1AsyncAnnotateFileResponse extends StObject {
  
  /**
    * The output location and metadata from AsyncAnnotateFileRequest.
    */
  var outputConfig: js.UndefOr[SchemaGoogleCloudVisionV1p2beta1OutputConfig] = js.undefined
}
object SchemaGoogleCloudVisionV1p2beta1AsyncAnnotateFileResponse {
  
  inline def apply(): SchemaGoogleCloudVisionV1p2beta1AsyncAnnotateFileResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudVisionV1p2beta1AsyncAnnotateFileResponse]
  }
  
  extension [Self <: SchemaGoogleCloudVisionV1p2beta1AsyncAnnotateFileResponse](x: Self) {
    
    inline def setOutputConfig(value: SchemaGoogleCloudVisionV1p2beta1OutputConfig): Self = StObject.set(x, "outputConfig", value.asInstanceOf[js.Any])
    
    inline def setOutputConfigUndefined: Self = StObject.set(x, "outputConfig", js.undefined)
  }
}
