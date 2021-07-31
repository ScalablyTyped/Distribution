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
  
  @scala.inline
  def apply(): NonGuaranteedAuctionTerms = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NonGuaranteedAuctionTerms]
  }
  
  @scala.inline
  implicit class NonGuaranteedAuctionTermsMutableBuilder[Self <: NonGuaranteedAuctionTerms] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutoOptimizePrivateAuction(value: Boolean): Self = StObject.set(x, "autoOptimizePrivateAuction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoOptimizePrivateAuctionUndefined: Self = StObject.set(x, "autoOptimizePrivateAuction", js.undefined)
    
    @scala.inline
    def setReservePricesPerBuyer(value: js.Array[PricePerBuyer]): Self = StObject.set(x, "reservePricesPerBuyer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReservePricesPerBuyerUndefined: Self = StObject.set(x, "reservePricesPerBuyer", js.undefined)
    
    @scala.inline
    def setReservePricesPerBuyerVarargs(value: PricePerBuyer*): Self = StObject.set(x, "reservePricesPerBuyer", js.Array(value :_*))
  }
}
