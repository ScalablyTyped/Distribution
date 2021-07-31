package typings.googleapis.visionV1p1beta1Mod.visionV1p1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An offline file annotation request.
  */
trait SchemaGoogleCloudVisionV1p1beta1AsyncAnnotateFileRequest extends StObject {
  
  /**
    * Required. Requested features.
    */
  var features: js.UndefOr[js.Array[SchemaGoogleCloudVisionV1p1beta1Feature]] = js.undefined
  
  /**
    * Additional context that may accompany the image(s) in the file.
    */
  var imageContext: js.UndefOr[SchemaGoogleCloudVisionV1p1beta1ImageContext] = js.undefined
  
  /**
    * Required. Information about the input file.
    */
  var inputConfig: js.UndefOr[SchemaGoogleCloudVisionV1p1beta1InputConfig] = js.undefined
  
  /**
    * Required. The desired output location and metadata (e.g. format).
    */
  var outputConfig: js.UndefOr[SchemaGoogleCloudVisionV1p1beta1OutputConfig] = js.undefined
}
object SchemaGoogleCloudVisionV1p1beta1AsyncAnnotateFileRequest {
  
  @scala.inline
  def apply(): SchemaGoogleCloudVisionV1p1beta1AsyncAnnotateFileRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudVisionV1p1beta1AsyncAnnotateFileRequest]
  }
  
  @scala.inline
  implicit class SchemaGoogleCloudVisionV1p1beta1AsyncAnnotateFileRequestMutableBuilder[Self <: SchemaGoogleCloudVisionV1p1beta1AsyncAnnotateFileRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFeatures(value: js.Array[SchemaGoogleCloudVisionV1p1beta1Feature]): Self = StObject.set(x, "features", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFeaturesUndefined: Self = StObject.set(x, "features", js.undefined)
    
    @scala.inline
    def setFeaturesVarargs(value: SchemaGoogleCloudVisionV1p1beta1Feature*): Self = StObject.set(x, "features", js.Array(value :_*))
    
    @scala.inline
    def setImageContext(value: SchemaGoogleCloudVisionV1p1beta1ImageContext): Self = StObject.set(x, "imageContext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageContextUndefined: Self = StObject.set(x, "imageContext", js.undefined)
    
    @scala.inline
    def setInputConfig(value: SchemaGoogleCloudVisionV1p1beta1InputConfig): Self = StObject.set(x, "inputConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputConfigUndefined: Self = StObject.set(x, "inputConfig", js.undefined)
    
    @scala.inline
    def setOutputConfig(value: SchemaGoogleCloudVisionV1p1beta1OutputConfig): Self = StObject.set(x, "outputConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutputConfigUndefined: Self = StObject.set(x, "outputConfig", js.undefined)
  }
}
