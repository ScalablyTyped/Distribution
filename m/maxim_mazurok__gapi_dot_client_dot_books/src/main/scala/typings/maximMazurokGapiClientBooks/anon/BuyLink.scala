package typings.maximMazurokGapiClientBooks.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BuyLink extends StObject {
  
  /** URL to purchase this volume on the Google Books site. (In LITE projection) */
  var buyLink: js.UndefOr[String] = js.native
  
  /** The two-letter ISO_3166-1 country code for which this sale information is valid. (In LITE projection.) */
  var country: js.UndefOr[String] = js.native
  
  /** Whether or not this volume is an eBook (can be added to the My eBooks shelf). */
  var isEbook: js.UndefOr[Boolean] = js.native
  
  /** Suggested retail price. (In LITE projection.) */
  var listPrice: js.UndefOr[Amount] = js.native
  
  /** Offers available for this volume (sales and rentals). */
  var offers: js.UndefOr[js.Array[FinskyOfferType]] = js.native
  
  /** The date on which this book is available for sale. */
  var onSaleDate: js.UndefOr[String] = js.native
  
  /** The actual selling price of the book. This is the same as the suggested retail or list price unless there are offers or discounts on this volume. (In LITE projection.) */
  var retailPrice: js.UndefOr[Amount] = js.native
  
  /**
    * Whether or not this book is available for sale or offered for free in the Google eBookstore for the country listed above. Possible values are FOR_SALE, FOR_RENTAL_ONLY,
    * FOR_SALE_AND_RENTAL, FREE, NOT_FOR_SALE, or FOR_PREORDER.
    */
  var saleability: js.UndefOr[String] = js.native
}
object BuyLink {
  
  @scala.inline
  def apply(): BuyLink = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BuyLink]
  }
  
  @scala.inline
  implicit class BuyLinkMutableBuilder[Self <: BuyLink] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBuyLink(value: String): Self = StObject.set(x, "buyLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBuyLinkUndefined: Self = StObject.set(x, "buyLink", js.undefined)
    
    @scala.inline
    def setCountry(value: String): Self = StObject.set(x, "country", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCountryUndefined: Self = StObject.set(x, "country", js.undefined)
    
    @scala.inline
    def setIsEbook(value: Boolean): Self = StObject.set(x, "isEbook", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsEbookUndefined: Self = StObject.set(x, "isEbook", js.undefined)
    
    @scala.inline
    def setListPrice(value: Amount): Self = StObject.set(x, "listPrice", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListPriceUndefined: Self = StObject.set(x, "listPrice", js.undefined)
    
    @scala.inline
    def setOffers(value: js.Array[FinskyOfferType]): Self = StObject.set(x, "offers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffersUndefined: Self = StObject.set(x, "offers", js.undefined)
    
    @scala.inline
    def setOffersVarargs(value: FinskyOfferType*): Self = StObject.set(x, "offers", js.Array(value :_*))
    
    @scala.inline
    def setOnSaleDate(value: String): Self = StObject.set(x, "onSaleDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnSaleDateUndefined: Self = StObject.set(x, "onSaleDate", js.undefined)
    
    @scala.inline
    def setRetailPrice(value: Amount): Self = StObject.set(x, "retailPrice", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRetailPriceUndefined: Self = StObject.set(x, "retailPrice", js.undefined)
    
    @scala.inline
    def setSaleability(value: String): Self = StObject.set(x, "saleability", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSaleabilityUndefined: Self = StObject.set(x, "saleability", js.undefined)
  }
}
