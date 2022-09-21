package typings.googleapis.v1beta1aMod.pubsubV1beta1a

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceTopicsPublishbatch
  extends StObject
     with StandardParameters {
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaPublishBatchRequest] = js.undefined
}
object ParamsResourceTopicsPublishbatch {
  
  inline def apply(): ParamsResourceTopicsPublishbatch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceTopicsPublishbatch]
  }
  
  extension [Self <: ParamsResourceTopicsPublishbatch](x: Self) {
    
    inline def setRequestBody(value: SchemaPublishBatchRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
