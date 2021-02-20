package typings.maximMazurokGapiClientAdexchangebuyer.gapi.client.adexchangebuyer

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DealTermsNonGuaranteedAuctionTerms extends StObject {
  
  /** True if open auction buyers are allowed to compete with invited buyers in this private auction (buyer-readonly). */
  var autoOptimizePrivateAuction: js.UndefOr[Boolean] = js.native
  
  /** Reserve price for the specified buyer. */
  var reservePricePerBuyers: js.UndefOr[js.Array[PricePerBuyer]] = js.native
}
object DealTermsNonGuaranteedAuctionTerms {
  
  @scala.inline
  def apply(): DealTermsNonGuaranteedAuctionTerms = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DealTermsNonGuaranteedAuctionTerms]
  }
  
  @scala.inline
  implicit class DealTermsNonGuaranteedAuctionTermsMutableBuilder[Self <: DealTermsNonGuaranteedAuctionTerms] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutoOptimizePrivateAuction(value: Boolean): Self = StObject.set(x, "autoOptimizePrivateAuction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoOptimizePrivateAuctionUndefined: Self = StObject.set(x, "autoOptimizePrivateAuction", js.undefined)
    
    @scala.inline
    def setReservePricePerBuyers(value: js.Array[PricePerBuyer]): Self = StObject.set(x, "reservePricePerBuyers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReservePricePerBuyersUndefined: Self = StObject.set(x, "reservePricePerBuyers", js.undefined)
    
    @scala.inline
    def setReservePricePerBuyersVarargs(value: PricePerBuyer*): Self = StObject.set(x, "reservePricePerBuyers", js.Array(value :_*))
  }
}
