package typings.googleapis.v1beta1aMod.pubsubV1beta1a

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceSubscriptionsAcknowledge
  extends StObject
     with StandardParameters {
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaAcknowledgeRequest] = js.undefined
}
object ParamsResourceSubscriptionsAcknowledge {
  
  inline def apply(): ParamsResourceSubscriptionsAcknowledge = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceSubscriptionsAcknowledge]
  }
  
  extension [Self <: ParamsResourceSubscriptionsAcknowledge](x: Self) {
    
    inline def setRequestBody(value: SchemaAcknowledgeRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
