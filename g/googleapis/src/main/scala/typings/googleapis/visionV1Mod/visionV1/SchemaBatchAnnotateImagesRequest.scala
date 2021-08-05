package typings.googleapis.visionV1Mod.visionV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Multiple image annotation requests are batched into a single service call.
  */
trait SchemaBatchAnnotateImagesRequest extends StObject {
  
  /**
    * Individual image annotation requests for this batch.
    */
  var requests: js.UndefOr[js.Array[SchemaAnnotateImageRequest]] = js.undefined
}
object SchemaBatchAnnotateImagesRequest {
  
  inline def apply(): SchemaBatchAnnotateImagesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBatchAnnotateImagesRequest]
  }
  
  extension [Self <: SchemaBatchAnnotateImagesRequest](x: Self) {
    
    inline def setRequests(value: js.Array[SchemaAnnotateImageRequest]): Self = StObject.set(x, "requests", value.asInstanceOf[js.Any])
    
    inline def setRequestsUndefined: Self = StObject.set(x, "requests", js.undefined)
    
    inline def setRequestsVarargs(value: SchemaAnnotateImageRequest*): Self = StObject.set(x, "requests", js.Array(value :_*))
  }
}
