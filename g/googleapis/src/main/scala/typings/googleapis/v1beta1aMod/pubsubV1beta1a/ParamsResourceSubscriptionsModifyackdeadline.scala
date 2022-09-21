package typings.googleapis.v1beta1aMod.pubsubV1beta1a

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceSubscriptionsModifyackdeadline
  extends StObject
     with StandardParameters {
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaModifyAckDeadlineRequest] = js.undefined
}
object ParamsResourceSubscriptionsModifyackdeadline {
  
  inline def apply(): ParamsResourceSubscriptionsModifyackdeadline = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceSubscriptionsModifyackdeadline]
  }
  
  extension [Self <: ParamsResourceSubscriptionsModifyackdeadline](x: Self) {
    
    inline def setRequestBody(value: SchemaModifyAckDeadlineRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
