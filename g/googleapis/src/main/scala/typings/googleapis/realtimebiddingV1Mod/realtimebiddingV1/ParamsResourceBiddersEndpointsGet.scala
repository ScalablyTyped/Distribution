package typings.googleapis.realtimebiddingV1Mod.realtimebiddingV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceBiddersEndpointsGet
  extends StObject
     with StandardParameters {
  
  /**
    * Required. Name of the bidder endpoint to get. Format: `bidders/{bidderAccountId\}/endpoints/{endpointId\}`
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceBiddersEndpointsGet {
  
  inline def apply(): ParamsResourceBiddersEndpointsGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceBiddersEndpointsGet]
  }
  
  extension [Self <: ParamsResourceBiddersEndpointsGet](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
