package typings.googleapis.v1beta1aMod.pubsubV1beta1a

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceSubscriptionsModifypushconfig
  extends StObject
     with StandardParameters {
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaModifyPushConfigRequest] = js.undefined
}
object ParamsResourceSubscriptionsModifypushconfig {
  
  inline def apply(): ParamsResourceSubscriptionsModifypushconfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceSubscriptionsModifypushconfig]
  }
  
  extension [Self <: ParamsResourceSubscriptionsModifypushconfig](x: Self) {
    
    inline def setRequestBody(value: SchemaModifyPushConfigRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
