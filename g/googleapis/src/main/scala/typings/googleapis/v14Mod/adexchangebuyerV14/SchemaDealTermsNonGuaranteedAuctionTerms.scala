package typings.googleapis.v14Mod.adexchangebuyerV14

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaDealTermsNonGuaranteedAuctionTerms extends StObject {
  
  /**
    * True if open auction buyers are allowed to compete with invited buyers in this private auction (buyer-readonly).
    */
  var autoOptimizePrivateAuction: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Reserve price for the specified buyer.
    */
  var reservePricePerBuyers: js.UndefOr[js.Array[SchemaPricePerBuyer]] = js.undefined
}
object SchemaDealTermsNonGuaranteedAuctionTerms {
  
  inline def apply(): SchemaDealTermsNonGuaranteedAuctionTerms = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDealTermsNonGuaranteedAuctionTerms]
  }
  
  extension [Self <: SchemaDealTermsNonGuaranteedAuctionTerms](x: Self) {
    
    inline def setAutoOptimizePrivateAuction(value: Boolean): Self = StObject.set(x, "autoOptimizePrivateAuction", value.asInstanceOf[js.Any])
    
    inline def setAutoOptimizePrivateAuctionNull: Self = StObject.set(x, "autoOptimizePrivateAuction", null)
    
    inline def setAutoOptimizePrivateAuctionUndefined: Self = StObject.set(x, "autoOptimizePrivateAuction", js.undefined)
    
    inline def setReservePricePerBuyers(value: js.Array[SchemaPricePerBuyer]): Self = StObject.set(x, "reservePricePerBuyers", value.asInstanceOf[js.Any])
    
    inline def setReservePricePerBuyersUndefined: Self = StObject.set(x, "reservePricePerBuyers", js.undefined)
    
    inline def setReservePricePerBuyersVarargs(value: SchemaPricePerBuyer*): Self = StObject.set(x, "reservePricePerBuyers", js.Array(value*))
  }
}
