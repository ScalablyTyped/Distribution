package typings.googleapis.visionV1Mod.visionV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Multiple image annotation requests are batched into a single service call.
  */
@js.native
trait SchemaBatchAnnotateImagesRequest extends StObject {
  
  /**
    * Individual image annotation requests for this batch.
    */
  var requests: js.UndefOr[js.Array[SchemaAnnotateImageRequest]] = js.native
}
object SchemaBatchAnnotateImagesRequest {
  
  @scala.inline
  def apply(): SchemaBatchAnnotateImagesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBatchAnnotateImagesRequest]
  }
  
  @scala.inline
  implicit class SchemaBatchAnnotateImagesRequestMutableBuilder[Self <: SchemaBatchAnnotateImagesRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRequests(value: js.Array[SchemaAnnotateImageRequest]): Self = StObject.set(x, "requests", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestsUndefined: Self = StObject.set(x, "requests", js.undefined)
    
    @scala.inline
    def setRequestsVarargs(value: SchemaAnnotateImageRequest*): Self = StObject.set(x, "requests", js.Array(value :_*))
  }
}
