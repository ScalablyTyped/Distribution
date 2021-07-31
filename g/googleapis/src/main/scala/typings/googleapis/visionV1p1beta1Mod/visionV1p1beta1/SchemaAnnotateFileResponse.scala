package typings.googleapis.visionV1p1beta1Mod.visionV1p1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Response to a single file annotation request. A file may contain one or
  * more images, which individually have their own responses.
  */
trait SchemaAnnotateFileResponse extends StObject {
  
  /**
    * Information about the file for which this response is generated.
    */
  var inputConfig: js.UndefOr[SchemaInputConfig] = js.undefined
  
  /**
    * Individual responses to images found within the file.
    */
  var responses: js.UndefOr[js.Array[SchemaAnnotateImageResponse]] = js.undefined
}
object SchemaAnnotateFileResponse {
  
  @scala.inline
  def apply(): SchemaAnnotateFileResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAnnotateFileResponse]
  }
  
  @scala.inline
  implicit class SchemaAnnotateFileResponseMutableBuilder[Self <: SchemaAnnotateFileResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInputConfig(value: SchemaInputConfig): Self = StObject.set(x, "inputConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputConfigUndefined: Self = StObject.set(x, "inputConfig", js.undefined)
    
    @scala.inline
    def setResponses(value: js.Array[SchemaAnnotateImageResponse]): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponsesUndefined: Self = StObject.set(x, "responses", js.undefined)
    
    @scala.inline
    def setResponsesVarargs(value: SchemaAnnotateImageResponse*): Self = StObject.set(x, "responses", js.Array(value :_*))
  }
}
