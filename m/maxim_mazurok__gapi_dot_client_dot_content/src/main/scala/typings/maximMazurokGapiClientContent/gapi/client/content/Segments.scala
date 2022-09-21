package typings.maximMazurokGapiClientContent.gapi.client.content

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Segments extends StObject {
  
  /** Brand of the product. */
  var brand: js.UndefOr[String] = js.undefined
  
  /** [Product category (1st level)](https://developers.google.com/shopping-content/guides/reports/segmentation#category_and_product_type) in Google's product taxonomy. */
  var categoryL1: js.UndefOr[String] = js.undefined
  
  /** [Product category (2nd level)](https://developers.google.com/shopping-content/guides/reports/segmentation#category_and_product_type) in Google's product taxonomy. */
  var categoryL2: js.UndefOr[String] = js.undefined
  
  /** [Product category (3rd level)](https://developers.google.com/shopping-content/guides/reports/segmentation#category_and_product_type) in Google's product taxonomy. */
  var categoryL3: js.UndefOr[String] = js.undefined
  
  /** [Product category (4th level)](https://developers.google.com/shopping-content/guides/reports/segmentation#category_and_product_type) in Google's product taxonomy. */
  var categoryL4: js.UndefOr[String] = js.undefined
  
  /** [Product category (5th level)](https://developers.google.com/shopping-content/guides/reports/segmentation#category_and_product_type) in Google's product taxonomy. */
  var categoryL5: js.UndefOr[String] = js.undefined
  
  /** Currency in which price metrics are represented, for example, if you select `ordered_item_sales_micros`, the returned value will be represented by this currency. */
  var currencyCode: js.UndefOr[String] = js.undefined
  
  /** Custom label 0 for custom grouping of products. */
  var customLabel0: js.UndefOr[String] = js.undefined
  
  /** Custom label 1 for custom grouping of products. */
  var customLabel1: js.UndefOr[String] = js.undefined
  
  /** Custom label 2 for custom grouping of products. */
  var customLabel2: js.UndefOr[String] = js.undefined
  
  /** Custom label 3 for custom grouping of products. */
  var customLabel3: js.UndefOr[String] = js.undefined
  
  /** Custom label 4 for custom grouping of products. */
  var customLabel4: js.UndefOr[String] = js.undefined
  
  /**
    * Code of the country where the customer is located at the time of the event. Represented in the ISO 3166 format. If the customer country cannot be determined, a special 'ZZ' code is
    * returned.
    */
  var customerCountryCode: js.UndefOr[String] = js.undefined
  
  /** Date in the merchant timezone to which metrics apply. */
  var date: js.UndefOr[Date] = js.undefined
  
  /** Merchant-provided id of the product. */
  var offerId: js.UndefOr[String] = js.undefined
  
  /** [Product type (1st level)](https://developers.google.com/shopping-content/guides/reports/segmentation#category_and_product_type) in merchant's own product taxonomy. */
  var productTypeL1: js.UndefOr[String] = js.undefined
  
  /** [Product type (2nd level)](https://developers.google.com/shopping-content/guides/reports/segmentation#category_and_product_type) in merchant's own product taxonomy. */
  var productTypeL2: js.UndefOr[String] = js.undefined
  
  /** [Product type (3rd level)](https://developers.google.com/shopping-content/guides/reports/segmentation#category_and_product_type) in merchant's own product taxonomy. */
  var productTypeL3: js.UndefOr[String] = js.undefined
  
  /** [Product type (4th level)](https://developers.google.com/shopping-content/guides/reports/segmentation#category_and_product_type) in merchant's own product taxonomy. */
  var productTypeL4: js.UndefOr[String] = js.undefined
  
  /** [Product type (5th level)](https://developers.google.com/shopping-content/guides/reports/segmentation#category_and_product_type) in merchant's own product taxonomy. */
  var productTypeL5: js.UndefOr[String] = js.undefined
  
  /** Program to which metrics apply, for example, Free Product Listing. */
  var program: js.UndefOr[String] = js.undefined
  
  /** Title of the product. */
  var title: js.UndefOr[String] = js.undefined
  
  /** First day of the week (Monday) of the metrics date in the merchant timezone. */
  var week: js.UndefOr[Date] = js.undefined
}
object Segments {
  
  inline def apply(): Segments = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Segments]
  }
  
  extension [Self <: Segments](x: Self) {
    
    inline def setBrand(value: String): Self = StObject.set(x, "brand", value.asInstanceOf[js.Any])
    
    inline def setBrandUndefined: Self = StObject.set(x, "brand", js.undefined)
    
    inline def setCategoryL1(value: String): Self = StObject.set(x, "categoryL1", value.asInstanceOf[js.Any])
    
    inline def setCategoryL1Undefined: Self = StObject.set(x, "categoryL1", js.undefined)
    
    inline def setCategoryL2(value: String): Self = StObject.set(x, "categoryL2", value.asInstanceOf[js.Any])
    
    inline def setCategoryL2Undefined: Self = StObject.set(x, "categoryL2", js.undefined)
    
    inline def setCategoryL3(value: String): Self = StObject.set(x, "categoryL3", value.asInstanceOf[js.Any])
    
    inline def setCategoryL3Undefined: Self = StObject.set(x, "categoryL3", js.undefined)
    
    inline def setCategoryL4(value: String): Self = StObject.set(x, "categoryL4", value.asInstanceOf[js.Any])
    
    inline def setCategoryL4Undefined: Self = StObject.set(x, "categoryL4", js.undefined)
    
    inline def setCategoryL5(value: String): Self = StObject.set(x, "categoryL5", value.asInstanceOf[js.Any])
    
    inline def setCategoryL5Undefined: Self = StObject.set(x, "categoryL5", js.undefined)
    
    inline def setCurrencyCode(value: String): Self = StObject.set(x, "currencyCode", value.asInstanceOf[js.Any])
    
    inline def setCurrencyCodeUndefined: Self = StObject.set(x, "currencyCode", js.undefined)
    
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
    
    inline def setCustomerCountryCode(value: String): Self = StObject.set(x, "customerCountryCode", value.asInstanceOf[js.Any])
    
    inline def setCustomerCountryCodeUndefined: Self = StObject.set(x, "customerCountryCode", js.undefined)
    
    inline def setDate(value: Date): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    inline def setDateUndefined: Self = StObject.set(x, "date", js.undefined)
    
    inline def setOfferId(value: String): Self = StObject.set(x, "offerId", value.asInstanceOf[js.Any])
    
    inline def setOfferIdUndefined: Self = StObject.set(x, "offerId", js.undefined)
    
    inline def setProductTypeL1(value: String): Self = StObject.set(x, "productTypeL1", value.asInstanceOf[js.Any])
    
    inline def setProductTypeL1Undefined: Self = StObject.set(x, "productTypeL1", js.undefined)
    
    inline def setProductTypeL2(value: String): Self = StObject.set(x, "productTypeL2", value.asInstanceOf[js.Any])
    
    inline def setProductTypeL2Undefined: Self = StObject.set(x, "productTypeL2", js.undefined)
    
    inline def setProductTypeL3(value: String): Self = StObject.set(x, "productTypeL3", value.asInstanceOf[js.Any])
    
    inline def setProductTypeL3Undefined: Self = StObject.set(x, "productTypeL3", js.undefined)
    
    inline def setProductTypeL4(value: String): Self = StObject.set(x, "productTypeL4", value.asInstanceOf[js.Any])
    
    inline def setProductTypeL4Undefined: Self = StObject.set(x, "productTypeL4", js.undefined)
    
    inline def setProductTypeL5(value: String): Self = StObject.set(x, "productTypeL5", value.asInstanceOf[js.Any])
    
    inline def setProductTypeL5Undefined: Self = StObject.set(x, "productTypeL5", js.undefined)
    
    inline def setProgram(value: String): Self = StObject.set(x, "program", value.asInstanceOf[js.Any])
    
    inline def setProgramUndefined: Self = StObject.set(x, "program", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def setWeek(value: Date): Self = StObject.set(x, "week", value.asInstanceOf[js.Any])
    
    inline def setWeekUndefined: Self = StObject.set(x, "week", js.undefined)
  }
}
