package typings.maximMazurokGapiClientContent.gapi.client.content

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Collection extends StObject {
  
  /** Label that you assign to a collection to help organize bidding and reporting in Shopping campaigns. [Custom label](https://support.google.com/merchants/answer/9674217) */
  var customLabel0: js.UndefOr[String] = js.undefined
  
  /** Label that you assign to a collection to help organize bidding and reporting in Shopping campaigns. */
  var customLabel1: js.UndefOr[String] = js.undefined
  
  /** Label that you assign to a collection to help organize bidding and reporting in Shopping campaigns. */
  var customLabel2: js.UndefOr[String] = js.undefined
  
  /** Label that you assign to a collection to help organize bidding and reporting in Shopping campaigns. */
  var customLabel3: js.UndefOr[String] = js.undefined
  
  /** Label that you assign to a collection to help organize bidding and reporting in Shopping campaigns. */
  var customLabel4: js.UndefOr[String] = js.undefined
  
  /**
    * This identifies one or more products associated with the collection. Used as a lookup to the corresponding product ID in your product feeds. Provide a maximum of 100 featuredProduct
    * (for collections). Provide up to 10 featuredProduct (for Shoppable Images only) with ID and X and Y coordinates. [featured_product
    * attribute](https://support.google.com/merchants/answer/9703736)
    */
  var featuredProduct: js.UndefOr[js.Array[CollectionFeaturedProduct]] = js.undefined
  
  /** Your collection's name. [headline attribute](https://support.google.com/merchants/answer/9673580) */
  var headline: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Required. The REST ID of the collection. Content API methods that operate on collections take this as their collectionId parameter. The REST ID for a collection is of the form
    * collectionId. [id attribute](https://support.google.com/merchants/answer/9649290)
    */
  var id: js.UndefOr[String] = js.undefined
  
  /** The URL of a collection’s image. [image_link attribute](https://support.google.com/merchants/answer/9703236) */
  var imageLink: js.UndefOr[js.Array[String]] = js.undefined
  
  /** The language of a collection and the language of any featured products linked to the collection. [language attribute](https://support.google.com/merchants/answer/9673781) */
  var language: js.UndefOr[String] = js.undefined
  
  /** A collection’s landing page. URL directly linking to your collection's page on your website. [link attribute](https://support.google.com/merchants/answer/9673983) */
  var link: js.UndefOr[String] = js.undefined
  
  /**
    * A collection’s mobile-optimized landing page when you have a different URL for mobile and desktop traffic. [mobile_link
    * attribute](https://support.google.com/merchants/answer/9646123)
    */
  var mobileLink: js.UndefOr[String] = js.undefined
  
  /** [product_country attribute](https://support.google.com/merchants/answer/9674155) */
  var productCountry: js.UndefOr[String] = js.undefined
}
object Collection {
  
  inline def apply(): Collection = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Collection]
  }
  
  extension [Self <: Collection](x: Self) {
    
    inline def setCustomLabel0(value: String): Self = StObject.set(x, "customLabel0", value.asInstanceOf[js.Any])
    
    inline def setCustomLabel0Undefined: Self = StObject.set(x, "customLabel0", js.undefined)
    
    inline def setCustomLabel1(value: String): Self = StObject.set(x, "customLabel1", value.asInstanceOf[js.Any])
    
    inline def setCustomLabel1Undefined: Self = StObject.set(x, "customLabel1", js.undefined)
    
    inline def setCustomLabel2(value: String): Self = StObject.set(x, "customLabel2", value.asInstanceOf[js.Any])
    
    inline def setCustomLabel2Undefined: Self = StObject.set(x, "customLabel2", js.undefined)
    
    inline def setCustomLabel3(value: String): Self = StObject.set(x, "customLabel3", value.asInstanceOf[js.Any])
    
    inline def setCustomLabel3Undefined: Self = StObject.set(x, "customLabel3", js.undefined)
    
    inline def setCustomLabel4(value: String): Self = StObject.set(x, "customLabel4", value.asInstanceOf[js.Any])
    
    inline def setCustomLabel4Undefined: Self = StObject.set(x, "customLabel4", js.undefined)
    
    inline def setFeaturedProduct(value: js.Array[CollectionFeaturedProduct]): Self = StObject.set(x, "featuredProduct", value.asInstanceOf[js.Any])
    
    inline def setFeaturedProductUndefined: Self = StObject.set(x, "featuredProduct", js.undefined)
    
    inline def setFeaturedProductVarargs(value: CollectionFeaturedProduct*): Self = StObject.set(x, "featuredProduct", js.Array(value*))
    
    inline def setHeadline(value: js.Array[String]): Self = StObject.set(x, "headline", value.asInstanceOf[js.Any])
    
    inline def setHeadlineUndefined: Self = StObject.set(x, "headline", js.undefined)
    
    inline def setHeadlineVarargs(value: String*): Self = StObject.set(x, "headline", js.Array(value*))
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setImageLink(value: js.Array[String]): Self = StObject.set(x, "imageLink", value.asInstanceOf[js.Any])
    
    inline def setImageLinkUndefined: Self = StObject.set(x, "imageLink", js.undefined)
    
    inline def setImageLinkVarargs(value: String*): Self = StObject.set(x, "imageLink", js.Array(value*))
    
    inline def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    inline def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
    
    inline def setLink(value: String): Self = StObject.set(x, "link", value.asInstanceOf[js.Any])
    
    inline def setLinkUndefined: Self = StObject.set(x, "link", js.undefined)
    
    inline def setMobileLink(value: String): Self = StObject.set(x, "mobileLink", value.asInstanceOf[js.Any])
    
    inline def setMobileLinkUndefined: Self = StObject.set(x, "mobileLink", js.undefined)
    
    inline def setProductCountry(value: String): Self = StObject.set(x, "productCountry", value.asInstanceOf[js.Any])
    
    inline def setProductCountryUndefined: Self = StObject.set(x, "productCountry", js.undefined)
  }
}
