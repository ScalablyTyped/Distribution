package typings.invityApi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SavingsTradeUserRegistration extends StObject {
  
  /** Birth day in ISO format. For example: 2021-07-14T14:00:00.000Z - using date.toISOString() on client. */
  var dateOfBirth: String
  
  /** Or last name as we are used to in most of the European countries. */
  var familyName: String
  
  /** Or first name as we are used to in most of the European countries. */
  var givenName: String
  
  var phoneNumber: String
}
object SavingsTradeUserRegistration {
  
  inline def apply(dateOfBirth: String, familyName: String, givenName: String, phoneNumber: String): SavingsTradeUserRegistration = {
    val __obj = js.Dynamic.literal(dateOfBirth = dateOfBirth.asInstanceOf[js.Any], familyName = familyName.asInstanceOf[js.Any], givenName = givenName.asInstanceOf[js.Any], phoneNumber = phoneNumber.asInstanceOf[js.Any])
    __obj.asInstanceOf[SavingsTradeUserRegistration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SavingsTradeUserRegistration] (val x: Self) extends AnyVal {
    
    inline def setDateOfBirth(value: String): Self = StObject.set(x, "dateOfBirth", value.asInstanceOf[js.Any])
    
    inline def setFamilyName(value: String): Self = StObject.set(x, "familyName", value.asInstanceOf[js.Any])
    
    inline def setGivenName(value: String): Self = StObject.set(x, "givenName", value.asInstanceOf[js.Any])
    
    inline def setPhoneNumber(value: String): Self = StObject.set(x, "phoneNumber", value.asInstanceOf[js.Any])
  }
}
