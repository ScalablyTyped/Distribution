package typings.googleapis.paymentsresellersubscriptionV1Mod.paymentsresellersubscriptionV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudPaymentsResellerSubscriptionV1Product extends StObject {
  
  /**
    * Output only. Response only. Resource name of the subscription. It will have the format of "partners/{partner_id\}/products/{product_id\}"
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. 2-letter ISO region code where the product is available in. Ex. "US" Please refers to: https://en.wikipedia.org/wiki/ISO_3166-1
    */
  var regionCodes: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * Output only. Specifies the length of the billing cycle of the subscription.
    */
  var subscriptionBillingCycleDuration: js.UndefOr[SchemaGoogleCloudPaymentsResellerSubscriptionV1Duration] = js.undefined
  
  /**
    * Output only. Localized human readable name of the product.
    */
  var titles: js.UndefOr[js.Array[SchemaGoogleTypeLocalizedText]] = js.undefined
}
object SchemaGoogleCloudPaymentsResellerSubscriptionV1Product {
  
  inline def apply(): SchemaGoogleCloudPaymentsResellerSubscriptionV1Product = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudPaymentsResellerSubscriptionV1Product]
  }
  
  extension [Self <: SchemaGoogleCloudPaymentsResellerSubscriptionV1Product](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setRegionCodes(value: js.Array[String]): Self = StObject.set(x, "regionCodes", value.asInstanceOf[js.Any])
    
    inline def setRegionCodesNull: Self = StObject.set(x, "regionCodes", null)
    
    inline def setRegionCodesUndefined: Self = StObject.set(x, "regionCodes", js.undefined)
    
    inline def setRegionCodesVarargs(value: String*): Self = StObject.set(x, "regionCodes", js.Array(value*))
    
    inline def setSubscriptionBillingCycleDuration(value: SchemaGoogleCloudPaymentsResellerSubscriptionV1Duration): Self = StObject.set(x, "subscriptionBillingCycleDuration", value.asInstanceOf[js.Any])
    
    inline def setSubscriptionBillingCycleDurationUndefined: Self = StObject.set(x, "subscriptionBillingCycleDuration", js.undefined)
    
    inline def setTitles(value: js.Array[SchemaGoogleTypeLocalizedText]): Self = StObject.set(x, "titles", value.asInstanceOf[js.Any])
    
    inline def setTitlesUndefined: Self = StObject.set(x, "titles", js.undefined)
    
    inline def setTitlesVarargs(value: SchemaGoogleTypeLocalizedText*): Self = StObject.set(x, "titles", js.Array(value*))
  }
}
