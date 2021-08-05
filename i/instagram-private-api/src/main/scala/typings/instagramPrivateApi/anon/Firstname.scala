package typings.instagramPrivateApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Firstname extends StObject {
  
  var email_addresses: js.Array[String]
  
  var first_name: js.UndefOr[String] = js.undefined
  
  var last_name: js.UndefOr[String] = js.undefined
  
  var phone_numbers: js.Array[String]
}
object Firstname {
  
  inline def apply(email_addresses: js.Array[String], phone_numbers: js.Array[String]): Firstname = {
    val __obj = js.Dynamic.literal(email_addresses = email_addresses.asInstanceOf[js.Any], phone_numbers = phone_numbers.asInstanceOf[js.Any])
    __obj.asInstanceOf[Firstname]
  }
  
  extension [Self <: Firstname](x: Self) {
    
    inline def setEmail_addresses(value: js.Array[String]): Self = StObject.set(x, "email_addresses", value.asInstanceOf[js.Any])
    
    inline def setEmail_addressesVarargs(value: String*): Self = StObject.set(x, "email_addresses", js.Array(value :_*))
    
    inline def setFirst_name(value: String): Self = StObject.set(x, "first_name", value.asInstanceOf[js.Any])
    
    inline def setFirst_nameUndefined: Self = StObject.set(x, "first_name", js.undefined)
    
    inline def setLast_name(value: String): Self = StObject.set(x, "last_name", value.asInstanceOf[js.Any])
    
    inline def setLast_nameUndefined: Self = StObject.set(x, "last_name", js.undefined)
    
    inline def setPhone_numbers(value: js.Array[String]): Self = StObject.set(x, "phone_numbers", value.asInstanceOf[js.Any])
    
    inline def setPhone_numbersVarargs(value: String*): Self = StObject.set(x, "phone_numbers", js.Array(value :_*))
  }
}
