package typings.maximMazurokGapiClientBooks.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FinskyOfferType extends StObject {
  
  /** The finsky offer type (e.g., PURCHASE=0 RENTAL=3) */
  var finskyOfferType: js.UndefOr[Double] = js.native
  
  /** Indicates whether the offer is giftable. */
  var giftable: js.UndefOr[Boolean] = js.native
  
  /** Offer list (=undiscounted) price in Micros. */
  var listPrice: js.UndefOr[CurrencyCode] = js.native
  
  /** The rental duration (for rental offers only). */
  var rentalDuration: js.UndefOr[Count] = js.native
  
  /** Offer retail (=discounted) price in Micros */
  var retailPrice: js.UndefOr[CurrencyCode] = js.native
}
object FinskyOfferType {
  
  @scala.inline
  def apply(): FinskyOfferType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FinskyOfferType]
  }
  
  @scala.inline
  implicit class FinskyOfferTypeMutableBuilder[Self <: FinskyOfferType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFinskyOfferType(value: Double): Self = StObject.set(x, "finskyOfferType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFinskyOfferTypeUndefined: Self = StObject.set(x, "finskyOfferType", js.undefined)
    
    @scala.inline
    def setGiftable(value: Boolean): Self = StObject.set(x, "giftable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGiftableUndefined: Self = StObject.set(x, "giftable", js.undefined)
    
    @scala.inline
    def setListPrice(value: CurrencyCode): Self = StObject.set(x, "listPrice", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListPriceUndefined: Self = StObject.set(x, "listPrice", js.undefined)
    
    @scala.inline
    def setRentalDuration(value: Count): Self = StObject.set(x, "rentalDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRentalDurationUndefined: Self = StObject.set(x, "rentalDuration", js.undefined)
    
    @scala.inline
    def setRetailPrice(value: CurrencyCode): Self = StObject.set(x, "retailPrice", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRetailPriceUndefined: Self = StObject.set(x, "retailPrice", js.undefined)
  }
}
