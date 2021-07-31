package typings.googleapis.contentV2Mod.contentV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaOrderPaymentMethod extends StObject {
  
  /**
    * The billing address.
    */
  var billingAddress: js.UndefOr[SchemaOrderAddress] = js.undefined
  
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
    * The billing phone number.
    */
  var phoneNumber: js.UndefOr[String] = js.undefined
  
  /**
    * The type of instrument.  Acceptable values are:   - &quot;AMEX&quot;  -
    * &quot;DISCOVER&quot;  - &quot;JCB&quot;  - &quot;MASTERCARD&quot;  -
    * &quot;UNIONPAY&quot;  - &quot;VISA&quot;  - &quot;&quot;
    */
  var `type`: js.UndefOr[String] = js.undefined
}
object SchemaOrderPaymentMethod {
  
  @scala.inline
  def apply(): SchemaOrderPaymentMethod = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOrderPaymentMethod]
  }
  
  @scala.inline
  implicit class SchemaOrderPaymentMethodMutableBuilder[Self <: SchemaOrderPaymentMethod] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBillingAddress(value: SchemaOrderAddress): Self = StObject.set(x, "billingAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBillingAddressUndefined: Self = StObject.set(x, "billingAddress", js.undefined)
    
    @scala.inline
    def setExpirationMonth(value: Double): Self = StObject.set(x, "expirationMonth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpirationMonthUndefined: Self = StObject.set(x, "expirationMonth", js.undefined)
    
    @scala.inline
    def setExpirationYear(value: Double): Self = StObject.set(x, "expirationYear", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpirationYearUndefined: Self = StObject.set(x, "expirationYear", js.undefined)
    
    @scala.inline
    def setLastFourDigits(value: String): Self = StObject.set(x, "lastFourDigits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastFourDigitsUndefined: Self = StObject.set(x, "lastFourDigits", js.undefined)
    
    @scala.inline
    def setPhoneNumber(value: String): Self = StObject.set(x, "phoneNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPhoneNumberUndefined: Self = StObject.set(x, "phoneNumber", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
