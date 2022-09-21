package typings.maximMazurokGapiClientAdexchangebuyer2.gapi.client.adexchangebuyer2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NonGuaranteedAuctionTerms extends StObject {
  
  /** True if open auction buyers are allowed to compete with invited buyers in this private auction. */
  var autoOptimizePrivateAuction: js.UndefOr[Boolean] = js.undefined
  
  /** Reserve price for the specified buyer. */
  var reservePricesPerBuyer: js.UndefOr[js.Array[PricePerBuyer]] = js.undefined
}
object NonGuaranteedAuctionTerms {
  
  inline def apply(): NonGuaranteedAuctionTerms = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NonGuaranteedAuctionTerms]
  }
  
  extension [Self <: NonGuaranteedAuctionTerms](x: Self) {
    
    inline def setAutoOptimizePrivateAuction(value: Boolean): Self = StObject.set(x, "autoOptimizePrivateAuction", value.asInstanceOf[js.Any])
    
    inline def setAutoOptimizePrivateAuctionUndefined: Self = StObject.set(x, "autoOptimizePrivateAuction", js.undefined)
    
    inline def setReservePricesPerBuyer(value: js.Array[PricePerBuyer]): Self = StObject.set(x, "reservePricesPerBuyer", value.asInstanceOf[js.Any])
    
    inline def setReservePricesPerBuyerUndefined: Self = StObject.set(x, "reservePricesPerBuyer", js.undefined)
    
    inline def setReservePricesPerBuyerVarargs(value: PricePerBuyer*): Self = StObject.set(x, "reservePricesPerBuyer", js.Array(value*))
  }
}
