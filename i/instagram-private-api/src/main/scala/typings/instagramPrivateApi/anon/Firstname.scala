package typings.instagramPrivateApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Firstname extends StObject {
  
  var email_addresses: js.Array[String] = js.native
  
  var first_name: js.UndefOr[String] = js.native
  
  var last_name: js.UndefOr[String] = js.native
  
  var phone_numbers: js.Array[String] = js.native
}
object Firstname {
  
  @scala.inline
  def apply(email_addresses: js.Array[String], phone_numbers: js.Array[String]): Firstname = {
    val __obj = js.Dynamic.literal(email_addresses = email_addresses.asInstanceOf[js.Any], phone_numbers = phone_numbers.asInstanceOf[js.Any])
    __obj.asInstanceOf[Firstname]
  }
  
  @scala.inline
  implicit class FirstnameMutableBuilder[Self <: Firstname] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEmail_addresses(value: js.Array[String]): Self = StObject.set(x, "email_addresses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmail_addressesVarargs(value: String*): Self = StObject.set(x, "email_addresses", js.Array(value :_*))
    
    @scala.inline
    def setFirst_name(value: String): Self = StObject.set(x, "first_name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFirst_nameUndefined: Self = StObject.set(x, "first_name", js.undefined)
    
    @scala.inline
    def setLast_name(value: String): Self = StObject.set(x, "last_name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLast_nameUndefined: Self = StObject.set(x, "last_name", js.undefined)
    
    @scala.inline
    def setPhone_numbers(value: js.Array[String]): Self = StObject.set(x, "phone_numbers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPhone_numbersVarargs(value: String*): Self = StObject.set(x, "phone_numbers", js.Array(value :_*))
  }
}
