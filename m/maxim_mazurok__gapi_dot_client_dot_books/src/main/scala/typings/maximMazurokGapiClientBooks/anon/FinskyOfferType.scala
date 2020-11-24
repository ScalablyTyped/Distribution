package typings.maximMazurokGapiClientBooks.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FinskyOfferType extends js.Object {
  
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
  implicit class FinskyOfferTypeOps[Self <: FinskyOfferType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setFinskyOfferType(value: Double): Self = this.set("finskyOfferType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFinskyOfferType: Self = this.set("finskyOfferType", js.undefined)
    
    @scala.inline
    def setGiftable(value: Boolean): Self = this.set("giftable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGiftable: Self = this.set("giftable", js.undefined)
    
    @scala.inline
    def setListPrice(value: CurrencyCode): Self = this.set("listPrice", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteListPrice: Self = this.set("listPrice", js.undefined)
    
    @scala.inline
    def setRentalDuration(value: Count): Self = this.set("rentalDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRentalDuration: Self = this.set("rentalDuration", js.undefined)
    
    @scala.inline
    def setRetailPrice(value: CurrencyCode): Self = this.set("retailPrice", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRetailPrice: Self = this.set("retailPrice", js.undefined)
  }
}
