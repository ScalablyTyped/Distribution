package typings.googleapis.paymentsresellersubscriptionV1Mod.paymentsresellersubscriptionV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudPaymentsResellerSubscriptionV1Location extends StObject {
  
  /**
    * The postal code this location refers to. Ex. "94043"
    */
  var postalCode: js.UndefOr[String | Null] = js.undefined
  
  /**
    * 2-letter ISO region code for current content region. Ex. “US” Please refers to: https://en.wikipedia.org/wiki/ISO_3166-1
    */
  var regionCode: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudPaymentsResellerSubscriptionV1Location {
  
  inline def apply(): SchemaGoogleCloudPaymentsResellerSubscriptionV1Location = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudPaymentsResellerSubscriptionV1Location]
  }
  
  extension [Self <: SchemaGoogleCloudPaymentsResellerSubscriptionV1Location](x: Self) {
    
    inline def setPostalCode(value: String): Self = StObject.set(x, "postalCode", value.asInstanceOf[js.Any])
    
    inline def setPostalCodeNull: Self = StObject.set(x, "postalCode", null)
    
    inline def setPostalCodeUndefined: Self = StObject.set(x, "postalCode", js.undefined)
    
    inline def setRegionCode(value: String): Self = StObject.set(x, "regionCode", value.asInstanceOf[js.Any])
    
    inline def setRegionCodeNull: Self = StObject.set(x, "regionCode", null)
    
    inline def setRegionCodeUndefined: Self = StObject.set(x, "regionCode", js.undefined)
  }
}
