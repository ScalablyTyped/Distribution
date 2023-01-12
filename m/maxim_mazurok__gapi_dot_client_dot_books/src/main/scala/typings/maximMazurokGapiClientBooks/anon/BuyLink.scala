package typings.maximMazurokGapiClientBooks.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BuyLink extends StObject {
  
  /** URL to purchase this volume on the Google Books site. (In LITE projection) */
  var buyLink: js.UndefOr[String] = js.undefined
  
  /** The two-letter ISO_3166-1 country code for which this sale information is valid. (In LITE projection.) */
  var country: js.UndefOr[String] = js.undefined
  
  /** Whether or not this volume is an eBook (can be added to the My eBooks shelf). */
  var isEbook: js.UndefOr[Boolean] = js.undefined
  
  /** Suggested retail price. (In LITE projection.) */
  var listPrice: js.UndefOr[Amount] = js.undefined
  
  /** Offers available for this volume (sales and rentals). */
  var offers: js.UndefOr[js.Array[FinskyOfferType]] = js.undefined
  
  /** The date on which this book is available for sale. */
  var onSaleDate: js.UndefOr[String] = js.undefined
  
  /** The actual selling price of the book. This is the same as the suggested retail or list price unless there are offers or discounts on this volume. (In LITE projection.) */
  var retailPrice: js.UndefOr[Amount] = js.undefined
  
  /**
    * Whether or not this book is available for sale or offered for free in the Google eBookstore for the country listed above. Possible values are FOR_SALE, FOR_RENTAL_ONLY,
    * FOR_SALE_AND_RENTAL, FREE, NOT_FOR_SALE, or FOR_PREORDER.
    */
  var saleability: js.UndefOr[String] = js.undefined
}
object BuyLink {
  
  inline def apply(): BuyLink = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BuyLink]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BuyLink] (val x: Self) extends AnyVal {
    
    inline def setBuyLink(value: String): Self = StObject.set(x, "buyLink", value.asInstanceOf[js.Any])
    
    inline def setBuyLinkUndefined: Self = StObject.set(x, "buyLink", js.undefined)
    
    inline def setCountry(value: String): Self = StObject.set(x, "country", value.asInstanceOf[js.Any])
    
    inline def setCountryUndefined: Self = StObject.set(x, "country", js.undefined)
    
    inline def setIsEbook(value: Boolean): Self = StObject.set(x, "isEbook", value.asInstanceOf[js.Any])
    
    inline def setIsEbookUndefined: Self = StObject.set(x, "isEbook", js.undefined)
    
    inline def setListPrice(value: Amount): Self = StObject.set(x, "listPrice", value.asInstanceOf[js.Any])
    
    inline def setListPriceUndefined: Self = StObject.set(x, "listPrice", js.undefined)
    
    inline def setOffers(value: js.Array[FinskyOfferType]): Self = StObject.set(x, "offers", value.asInstanceOf[js.Any])
    
    inline def setOffersUndefined: Self = StObject.set(x, "offers", js.undefined)
    
    inline def setOffersVarargs(value: FinskyOfferType*): Self = StObject.set(x, "offers", js.Array(value*))
    
    inline def setOnSaleDate(value: String): Self = StObject.set(x, "onSaleDate", value.asInstanceOf[js.Any])
    
    inline def setOnSaleDateUndefined: Self = StObject.set(x, "onSaleDate", js.undefined)
    
    inline def setRetailPrice(value: Amount): Self = StObject.set(x, "retailPrice", value.asInstanceOf[js.Any])
    
    inline def setRetailPriceUndefined: Self = StObject.set(x, "retailPrice", js.undefined)
    
    inline def setSaleability(value: String): Self = StObject.set(x, "saleability", value.asInstanceOf[js.Any])
    
    inline def setSaleabilityUndefined: Self = StObject.set(x, "saleability", js.undefined)
  }
}
