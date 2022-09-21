package typings.googleapis.mybusinessbusinessinformationV1Mod.mybusinessbusinessinformationV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaPhoneNumbers extends StObject {
  
  /**
    * Optional. Up to two phone numbers (mobile or landline, no fax) at which your business can be called, in addition to your primary phone number.
    */
  var additionalPhones: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * Required. A phone number that connects to your individual business location as directly as possible. Use a local phone number instead of a central, call center helpline number whenever possible.
    */
  var primaryPhone: js.UndefOr[String | Null] = js.undefined
}
object SchemaPhoneNumbers {
  
  inline def apply(): SchemaPhoneNumbers = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPhoneNumbers]
  }
  
  extension [Self <: SchemaPhoneNumbers](x: Self) {
    
    inline def setAdditionalPhones(value: js.Array[String]): Self = StObject.set(x, "additionalPhones", value.asInstanceOf[js.Any])
    
    inline def setAdditionalPhonesNull: Self = StObject.set(x, "additionalPhones", null)
    
    inline def setAdditionalPhonesUndefined: Self = StObject.set(x, "additionalPhones", js.undefined)
    
    inline def setAdditionalPhonesVarargs(value: String*): Self = StObject.set(x, "additionalPhones", js.Array(value*))
    
    inline def setPrimaryPhone(value: String): Self = StObject.set(x, "primaryPhone", value.asInstanceOf[js.Any])
    
    inline def setPrimaryPhoneNull: Self = StObject.set(x, "primaryPhone", null)
    
    inline def setPrimaryPhoneUndefined: Self = StObject.set(x, "primaryPhone", js.undefined)
  }
}
