package typings.googleapis.displayvideoV1Mod.displayvideoV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceCustombiddingalgorithmsUploadscript
  extends StObject
     with StandardParameters {
  
  /**
    * The ID of the advertiser that owns the parent custom bidding algorithm.
    */
  var advertiserId: js.UndefOr[String] = js.undefined
  
  /**
    * Required. The ID of the custom bidding algorithm owns the script.
    */
  var customBiddingAlgorithmId: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of the partner that owns the parent custom bidding algorithm. Only this partner will have write access to this custom bidding script.
    */
  var partnerId: js.UndefOr[String] = js.undefined
}
object ParamsResourceCustombiddingalgorithmsUploadscript {
  
  inline def apply(): ParamsResourceCustombiddingalgorithmsUploadscript = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceCustombiddingalgorithmsUploadscript]
  }
  
  extension [Self <: ParamsResourceCustombiddingalgorithmsUploadscript](x: Self) {
    
    inline def setAdvertiserId(value: String): Self = StObject.set(x, "advertiserId", value.asInstanceOf[js.Any])
    
    inline def setAdvertiserIdUndefined: Self = StObject.set(x, "advertiserId", js.undefined)
    
    inline def setCustomBiddingAlgorithmId(value: String): Self = StObject.set(x, "customBiddingAlgorithmId", value.asInstanceOf[js.Any])
    
    inline def setCustomBiddingAlgorithmIdUndefined: Self = StObject.set(x, "customBiddingAlgorithmId", js.undefined)
    
    inline def setPartnerId(value: String): Self = StObject.set(x, "partnerId", value.asInstanceOf[js.Any])
    
    inline def setPartnerIdUndefined: Self = StObject.set(x, "partnerId", js.undefined)
  }
}
