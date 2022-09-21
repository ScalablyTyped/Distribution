package typings.googleapis.v2beta1Mod.adexchangebuyer2V2beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaNonGuaranteedAuctionTerms extends StObject {
  
  /**
    * True if open auction buyers are allowed to compete with invited buyers in this private auction.
    */
  var autoOptimizePrivateAuction: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Reserve price for the specified buyer.
    */
  var reservePricesPerBuyer: js.UndefOr[js.Array[SchemaPricePerBuyer]] = js.undefined
}
object SchemaNonGuaranteedAuctionTerms {
  
  inline def apply(): SchemaNonGuaranteedAuctionTerms = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaNonGuaranteedAuctionTerms]
  }
  
  extension [Self <: SchemaNonGuaranteedAuctionTerms](x: Self) {
    
    inline def setAutoOptimizePrivateAuction(value: Boolean): Self = StObject.set(x, "autoOptimizePrivateAuction", value.asInstanceOf[js.Any])
    
    inline def setAutoOptimizePrivateAuctionNull: Self = StObject.set(x, "autoOptimizePrivateAuction", null)
    
    inline def setAutoOptimizePrivateAuctionUndefined: Self = StObject.set(x, "autoOptimizePrivateAuction", js.undefined)
    
    inline def setReservePricesPerBuyer(value: js.Array[SchemaPricePerBuyer]): Self = StObject.set(x, "reservePricesPerBuyer", value.asInstanceOf[js.Any])
    
    inline def setReservePricesPerBuyerUndefined: Self = StObject.set(x, "reservePricesPerBuyer", js.undefined)
    
    inline def setReservePricesPerBuyerVarargs(value: SchemaPricePerBuyer*): Self = StObject.set(x, "reservePricesPerBuyer", js.Array(value*))
  }
}
