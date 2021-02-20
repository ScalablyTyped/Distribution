package typings.googleapis.visionV1Mod.visionV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An offline file annotation request.
  */
@js.native
trait SchemaAsyncAnnotateFileRequest extends StObject {
  
  /**
    * Required. Requested features.
    */
  var features: js.UndefOr[js.Array[SchemaFeature]] = js.native
  
  /**
    * Additional context that may accompany the image(s) in the file.
    */
  var imageContext: js.UndefOr[SchemaImageContext] = js.native
  
  /**
    * Required. Information about the input file.
    */
  var inputConfig: js.UndefOr[SchemaInputConfig] = js.native
  
  /**
    * Required. The desired output location and metadata (e.g. format).
    */
  var outputConfig: js.UndefOr[SchemaOutputConfig] = js.native
}
object SchemaAsyncAnnotateFileRequest {
  
  @scala.inline
  def apply(): SchemaAsyncAnnotateFileRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAsyncAnnotateFileRequest]
  }
  
  @scala.inline
  implicit class SchemaAsyncAnnotateFileRequestMutableBuilder[Self <: SchemaAsyncAnnotateFileRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFeatures(value: js.Array[SchemaFeature]): Self = StObject.set(x, "features", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFeaturesUndefined: Self = StObject.set(x, "features", js.undefined)
    
    @scala.inline
    def setFeaturesVarargs(value: SchemaFeature*): Self = StObject.set(x, "features", js.Array(value :_*))
    
    @scala.inline
    def setImageContext(value: SchemaImageContext): Self = StObject.set(x, "imageContext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageContextUndefined: Self = StObject.set(x, "imageContext", js.undefined)
    
    @scala.inline
    def setInputConfig(value: SchemaInputConfig): Self = StObject.set(x, "inputConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputConfigUndefined: Self = StObject.set(x, "inputConfig", js.undefined)
    
    @scala.inline
    def setOutputConfig(value: SchemaOutputConfig): Self = StObject.set(x, "outputConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutputConfigUndefined: Self = StObject.set(x, "outputConfig", js.undefined)
  }
}
