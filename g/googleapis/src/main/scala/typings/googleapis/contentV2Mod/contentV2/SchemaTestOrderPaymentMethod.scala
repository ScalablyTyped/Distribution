package typings.googleapis.contentV2Mod.contentV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaTestOrderPaymentMethod extends StObject {
  
  /**
    * The card expiration month (January = 1, February = 2 etc.).
    */
  var expirationMonth: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * The card expiration year (4-digit, e.g. 2015).
    */
  var expirationYear: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * The last four digits of the card number.
    */
  var lastFourDigits: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The billing address. Acceptable values are: - "`dwight`" - "`jim`" - "`pam`"
    */
  var predefinedBillingAddress: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The type of instrument. Note that real orders might have different values than the four values accepted by `createTestOrder`. Acceptable values are: - "`AMEX`" - "`DISCOVER`" - "`MASTERCARD`" - "`VISA`"
    */
  var `type`: js.UndefOr[String | Null] = js.undefined
}
object SchemaTestOrderPaymentMethod {
  
  inline def apply(): SchemaTestOrderPaymentMethod = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTestOrderPaymentMethod]
  }
  
  extension [Self <: SchemaTestOrderPaymentMethod](x: Self) {
    
    inline def setExpirationMonth(value: Double): Self = StObject.set(x, "expirationMonth", value.asInstanceOf[js.Any])
    
    inline def setExpirationMonthNull: Self = StObject.set(x, "expirationMonth", null)
    
    inline def setExpirationMonthUndefined: Self = StObject.set(x, "expirationMonth", js.undefined)
    
    inline def setExpirationYear(value: Double): Self = StObject.set(x, "expirationYear", value.asInstanceOf[js.Any])
    
    inline def setExpirationYearNull: Self = StObject.set(x, "expirationYear", null)
    
    inline def setExpirationYearUndefined: Self = StObject.set(x, "expirationYear", js.undefined)
    
    inline def setLastFourDigits(value: String): Self = StObject.set(x, "lastFourDigits", value.asInstanceOf[js.Any])
    
    inline def setLastFourDigitsNull: Self = StObject.set(x, "lastFourDigits", null)
    
    inline def setLastFourDigitsUndefined: Self = StObject.set(x, "lastFourDigits", js.undefined)
    
    inline def setPredefinedBillingAddress(value: String): Self = StObject.set(x, "predefinedBillingAddress", value.asInstanceOf[js.Any])
    
    inline def setPredefinedBillingAddressNull: Self = StObject.set(x, "predefinedBillingAddress", null)
    
    inline def setPredefinedBillingAddressUndefined: Self = StObject.set(x, "predefinedBillingAddress", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeNull: Self = StObject.set(x, "type", null)
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
