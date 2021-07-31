package typings.googleapis.v14Mod.adexchangebuyerV14

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaDealTermsNonGuaranteedAuctionTerms extends StObject {
  
  /**
    * True if open auction buyers are allowed to compete with invited buyers in
    * this private auction (buyer-readonly).
    */
  var autoOptimizePrivateAuction: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Reserve price for the specified buyer.
    */
  var reservePricePerBuyers: js.UndefOr[js.Array[SchemaPricePerBuyer]] = js.undefined
}
object SchemaDealTermsNonGuaranteedAuctionTerms {
  
  @scala.inline
  def apply(): SchemaDealTermsNonGuaranteedAuctionTerms = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDealTermsNonGuaranteedAuctionTerms]
  }
  
  @scala.inline
  implicit class SchemaDealTermsNonGuaranteedAuctionTermsMutableBuilder[Self <: SchemaDealTermsNonGuaranteedAuctionTerms] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutoOptimizePrivateAuction(value: Boolean): Self = StObject.set(x, "autoOptimizePrivateAuction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoOptimizePrivateAuctionUndefined: Self = StObject.set(x, "autoOptimizePrivateAuction", js.undefined)
    
    @scala.inline
    def setReservePricePerBuyers(value: js.Array[SchemaPricePerBuyer]): Self = StObject.set(x, "reservePricePerBuyers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReservePricePerBuyersUndefined: Self = StObject.set(x, "reservePricePerBuyers", js.undefined)
    
    @scala.inline
    def setReservePricePerBuyersVarargs(value: SchemaPricePerBuyer*): Self = StObject.set(x, "reservePricePerBuyers", js.Array(value :_*))
  }
}
