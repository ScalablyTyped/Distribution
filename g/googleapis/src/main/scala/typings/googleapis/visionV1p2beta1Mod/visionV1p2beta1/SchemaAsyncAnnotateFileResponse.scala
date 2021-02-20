package typings.googleapis.visionV1p2beta1Mod.visionV1p2beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The response for a single offline file annotation request.
  */
@js.native
trait SchemaAsyncAnnotateFileResponse extends StObject {
  
  /**
    * The output location and metadata from AsyncAnnotateFileRequest.
    */
  var outputConfig: js.UndefOr[SchemaOutputConfig] = js.native
}
object SchemaAsyncAnnotateFileResponse {
  
  @scala.inline
  def apply(): SchemaAsyncAnnotateFileResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAsyncAnnotateFileResponse]
  }
  
  @scala.inline
  implicit class SchemaAsyncAnnotateFileResponseMutableBuilder[Self <: SchemaAsyncAnnotateFileResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOutputConfig(value: SchemaOutputConfig): Self = StObject.set(x, "outputConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutputConfigUndefined: Self = StObject.set(x, "outputConfig", js.undefined)
  }
}
