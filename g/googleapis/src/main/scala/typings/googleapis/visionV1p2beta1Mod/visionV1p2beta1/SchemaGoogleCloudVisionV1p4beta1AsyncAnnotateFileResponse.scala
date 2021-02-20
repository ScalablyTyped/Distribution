package typings.googleapis.visionV1p2beta1Mod.visionV1p2beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The response for a single offline file annotation request.
  */
@js.native
trait SchemaGoogleCloudVisionV1p4beta1AsyncAnnotateFileResponse extends StObject {
  
  /**
    * The output location and metadata from AsyncAnnotateFileRequest.
    */
  var outputConfig: js.UndefOr[SchemaGoogleCloudVisionV1p4beta1OutputConfig] = js.native
}
object SchemaGoogleCloudVisionV1p4beta1AsyncAnnotateFileResponse {
  
  @scala.inline
  def apply(): SchemaGoogleCloudVisionV1p4beta1AsyncAnnotateFileResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudVisionV1p4beta1AsyncAnnotateFileResponse]
  }
  
  @scala.inline
  implicit class SchemaGoogleCloudVisionV1p4beta1AsyncAnnotateFileResponseMutableBuilder[Self <: SchemaGoogleCloudVisionV1p4beta1AsyncAnnotateFileResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOutputConfig(value: SchemaGoogleCloudVisionV1p4beta1OutputConfig): Self = StObject.set(x, "outputConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutputConfigUndefined: Self = StObject.set(x, "outputConfig", js.undefined)
  }
}
