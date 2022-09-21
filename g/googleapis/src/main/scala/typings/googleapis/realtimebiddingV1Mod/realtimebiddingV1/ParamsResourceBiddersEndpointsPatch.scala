package typings.googleapis.realtimebiddingV1Mod.realtimebiddingV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceBiddersEndpointsPatch
  extends StObject
     with StandardParameters {
  
  /**
    * Output only. Name of the endpoint resource that must follow the pattern `bidders/{bidderAccountId\}/endpoints/{endpointId\}`, where {bidderAccountId\} is the account ID of the bidder who operates this endpoint, and {endpointId\} is a unique ID assigned by the server.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaEndpoint] = js.undefined
  
  /**
    * Field mask to use for partial in-place updates.
    */
  var updateMask: js.UndefOr[String] = js.undefined
}
object ParamsResourceBiddersEndpointsPatch {
  
  inline def apply(): ParamsResourceBiddersEndpointsPatch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceBiddersEndpointsPatch]
  }
  
  extension [Self <: ParamsResourceBiddersEndpointsPatch](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setRequestBody(value: SchemaEndpoint): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
    
    inline def setUpdateMask(value: String): Self = StObject.set(x, "updateMask", value.asInstanceOf[js.Any])
    
    inline def setUpdateMaskUndefined: Self = StObject.set(x, "updateMask", js.undefined)
  }
}
