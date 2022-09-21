package typings.googleapis.displayvideoV1Mod.displayvideoV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceCustombiddingalgorithmsGet
  extends StObject
     with StandardParameters {
  
  /**
    * The ID of the DV360 partner that has access to the custom bidding algorithm.
    */
  var advertiserId: js.UndefOr[String] = js.undefined
  
  /**
    * Required. The ID of the custom bidding algorithm to fetch.
    */
  var customBiddingAlgorithmId: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of the DV360 partner that has access to the custom bidding algorithm.
    */
  var partnerId: js.UndefOr[String] = js.undefined
}
object ParamsResourceCustombiddingalgorithmsGet {
  
  inline def apply(): ParamsResourceCustombiddingalgorithmsGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceCustombiddingalgorithmsGet]
  }
  
  extension [Self <: ParamsResourceCustombiddingalgorithmsGet](x: Self) {
    
    inline def setAdvertiserId(value: String): Self = StObject.set(x, "advertiserId", value.asInstanceOf[js.Any])
    
    inline def setAdvertiserIdUndefined: Self = StObject.set(x, "advertiserId", js.undefined)
    
    inline def setCustomBiddingAlgorithmId(value: String): Self = StObject.set(x, "customBiddingAlgorithmId", value.asInstanceOf[js.Any])
    
    inline def setCustomBiddingAlgorithmIdUndefined: Self = StObject.set(x, "customBiddingAlgorithmId", js.undefined)
    
    inline def setPartnerId(value: String): Self = StObject.set(x, "partnerId", value.asInstanceOf[js.Any])
    
    inline def setPartnerIdUndefined: Self = StObject.set(x, "partnerId", js.undefined)
  }
}
