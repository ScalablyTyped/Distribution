package typings.googleapis.realtimebiddingV1Mod.realtimebiddingV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceBiddersPublisherconnectionsBatchreject
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The bidder for whom publisher connections will be rejected. Format: `bidders/{bidder\}` where `{bidder\}` is the account ID of the bidder.
    */
  var parent: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaBatchRejectPublisherConnectionsRequest] = js.undefined
}
object ParamsResourceBiddersPublisherconnectionsBatchreject {
  
  inline def apply(): ParamsResourceBiddersPublisherconnectionsBatchreject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceBiddersPublisherconnectionsBatchreject]
  }
  
  extension [Self <: ParamsResourceBiddersPublisherconnectionsBatchreject](x: Self) {
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    inline def setRequestBody(value: SchemaBatchRejectPublisherConnectionsRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
