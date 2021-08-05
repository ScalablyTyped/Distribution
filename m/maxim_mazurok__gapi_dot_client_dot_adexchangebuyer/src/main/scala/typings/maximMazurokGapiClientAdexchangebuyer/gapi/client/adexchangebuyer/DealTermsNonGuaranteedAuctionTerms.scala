package typings.maximMazurokGapiClientAdexchangebuyer.gapi.client.adexchangebuyer

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DealTermsNonGuaranteedAuctionTerms extends StObject {
  
  /** True if open auction buyers are allowed to compete with invited buyers in this private auction (buyer-readonly). */
  var autoOptimizePrivateAuction: js.UndefOr[Boolean] = js.undefined
  
  /** Reserve price for the specified buyer. */
  var reservePricePerBuyers: js.UndefOr[js.Array[PricePerBuyer]] = js.undefined
}
object DealTermsNonGuaranteedAuctionTerms {
  
  inline def apply(): DealTermsNonGuaranteedAuctionTerms = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DealTermsNonGuaranteedAuctionTerms]
  }
  
  extension [Self <: DealTermsNonGuaranteedAuctionTerms](x: Self) {
    
    inline def setAutoOptimizePrivateAuction(value: Boolean): Self = StObject.set(x, "autoOptimizePrivateAuction", value.asInstanceOf[js.Any])
    
    inline def setAutoOptimizePrivateAuctionUndefined: Self = StObject.set(x, "autoOptimizePrivateAuction", js.undefined)
    
    inline def setReservePricePerBuyers(value: js.Array[PricePerBuyer]): Self = StObject.set(x, "reservePricePerBuyers", value.asInstanceOf[js.Any])
    
    inline def setReservePricePerBuyersUndefined: Self = StObject.set(x, "reservePricePerBuyers", js.undefined)
    
    inline def setReservePricePerBuyersVarargs(value: PricePerBuyer*): Self = StObject.set(x, "reservePricePerBuyers", js.Array(value :_*))
  }
}
