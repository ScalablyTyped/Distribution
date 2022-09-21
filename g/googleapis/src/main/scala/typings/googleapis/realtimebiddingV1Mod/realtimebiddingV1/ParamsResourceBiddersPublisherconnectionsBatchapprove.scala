package typings.googleapis.realtimebiddingV1Mod.realtimebiddingV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceBiddersPublisherconnectionsBatchapprove
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The bidder for whom publisher connections will be approved. Format: `bidders/{bidder\}` where `{bidder\}` is the account ID of the bidder.
    */
  var parent: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaBatchApprovePublisherConnectionsRequest] = js.undefined
}
object ParamsResourceBiddersPublisherconnectionsBatchapprove {
  
  inline def apply(): ParamsResourceBiddersPublisherconnectionsBatchapprove = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceBiddersPublisherconnectionsBatchapprove]
  }
  
  extension [Self <: ParamsResourceBiddersPublisherconnectionsBatchapprove](x: Self) {
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    inline def setRequestBody(value: SchemaBatchApprovePublisherConnectionsRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
