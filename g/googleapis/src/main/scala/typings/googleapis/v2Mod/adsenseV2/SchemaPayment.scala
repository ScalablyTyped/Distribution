package typings.googleapis.v2Mod.adsenseV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaPayment extends StObject {
  
  /**
    * Output only. The amount of unpaid or paid earnings, as a formatted string, including the currency. E.g. "¥1,235 JPY", "$1,234.57", "£87.65".
    */
  var amount: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. For paid earnings, the date that the payment was credited. For unpaid earnings, this field is empty. Payment dates are always returned in the billing timezone (America/Los_Angeles).
    */
  var date: js.UndefOr[SchemaDate] = js.undefined
  
  /**
    * Output only. Resource name of the payment. Format: - accounts/{account\}/payments/unpaid for unpaid (current) AdSense earnings. - accounts/{account\}/payments/youtube-unpaid for unpaid (current) YouTube earnings. - accounts/{account\}/payments/yyyy-MM-dd for paid AdSense earnings. - accounts/{account\}/payments/youtube-yyyy-MM-dd for paid YouTube earnings.
    */
  var name: js.UndefOr[String | Null] = js.undefined
}
object SchemaPayment {
  
  inline def apply(): SchemaPayment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPayment]
  }
  
  extension [Self <: SchemaPayment](x: Self) {
    
    inline def setAmount(value: String): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
    
    inline def setAmountNull: Self = StObject.set(x, "amount", null)
    
    inline def setAmountUndefined: Self = StObject.set(x, "amount", js.undefined)
    
    inline def setDate(value: SchemaDate): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    inline def setDateUndefined: Self = StObject.set(x, "date", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
