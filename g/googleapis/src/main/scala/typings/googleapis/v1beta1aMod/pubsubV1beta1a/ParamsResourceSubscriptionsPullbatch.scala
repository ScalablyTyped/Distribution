package typings.googleapis.v1beta1aMod.pubsubV1beta1a

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceSubscriptionsPullbatch
  extends StObject
     with StandardParameters {
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaPullBatchRequest] = js.undefined
}
object ParamsResourceSubscriptionsPullbatch {
  
  inline def apply(): ParamsResourceSubscriptionsPullbatch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceSubscriptionsPullbatch]
  }
  
  extension [Self <: ParamsResourceSubscriptionsPullbatch](x: Self) {
    
    inline def setRequestBody(value: SchemaPullBatchRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
