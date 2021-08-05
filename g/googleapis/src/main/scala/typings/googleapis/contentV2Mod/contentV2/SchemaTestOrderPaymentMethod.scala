package typings.googleapis.contentV2Mod.contentV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaTestOrderPaymentMethod extends StObject {
  
  /**
    * The card expiration month (January = 1, February = 2 etc.).
    */
  var expirationMonth: js.UndefOr[Double] = js.undefined
  
  /**
    * The card expiration year (4-digit, e.g. 2015).
    */
  var expirationYear: js.UndefOr[Double] = js.undefined
  
  /**
    * The last four digits of the card number.
    */
  var lastFourDigits: js.UndefOr[String] = js.undefined
  
  /**
    * The billing address.
    */
  var predefinedBillingAddress: js.UndefOr[String] = js.undefined
  
  /**
    * The type of instrument. Note that real orders might have different values
    * than the four values accepted by createTestOrder.
    */
  var `type`: js.UndefOr[String] = js.undefined
}
object SchemaTestOrderPaymentMethod {
  
  inline def apply(): SchemaTestOrderPaymentMethod = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTestOrderPaymentMethod]
  }
  
  extension [Self <: SchemaTestOrderPaymentMethod](x: Self) {
    
    inline def setExpirationMonth(value: Double): Self = StObject.set(x, "expirationMonth", value.asInstanceOf[js.Any])
    
    inline def setExpirationMonthUndefined: Self = StObject.set(x, "expirationMonth", js.undefined)
    
    inline def setExpirationYear(value: Double): Self = StObject.set(x, "expirationYear", value.asInstanceOf[js.Any])
    
    inline def setExpirationYearUndefined: Self = StObject.set(x, "expirationYear", js.undefined)
    
    inline def setLastFourDigits(value: String): Self = StObject.set(x, "lastFourDigits", value.asInstanceOf[js.Any])
    
    inline def setLastFourDigitsUndefined: Self = StObject.set(x, "lastFourDigits", js.undefined)
    
    inline def setPredefinedBillingAddress(value: String): Self = StObject.set(x, "predefinedBillingAddress", value.asInstanceOf[js.Any])
    
    inline def setPredefinedBillingAddressUndefined: Self = StObject.set(x, "predefinedBillingAddress", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
