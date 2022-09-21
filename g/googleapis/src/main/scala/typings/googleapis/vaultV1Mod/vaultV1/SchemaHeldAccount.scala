package typings.googleapis.vaultV1Mod.vaultV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaHeldAccount extends StObject {
  
  /**
    * The account ID, as provided by the [Admin SDK](https://developers.google.com/admin-sdk/).
    */
  var accountId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The primary email address of the account. If used as an input, this takes precedence over **accountId**.
    */
  var email: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The first name of the account holder.
    */
  var firstName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. When the account was put on hold.
    */
  var holdTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The last name of the account holder.
    */
  var lastName: js.UndefOr[String | Null] = js.undefined
}
object SchemaHeldAccount {
  
  inline def apply(): SchemaHeldAccount = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaHeldAccount]
  }
  
  extension [Self <: SchemaHeldAccount](x: Self) {
    
    inline def setAccountId(value: String): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
    
    inline def setAccountIdNull: Self = StObject.set(x, "accountId", null)
    
    inline def setAccountIdUndefined: Self = StObject.set(x, "accountId", js.undefined)
    
    inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    inline def setEmailNull: Self = StObject.set(x, "email", null)
    
    inline def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
    
    inline def setFirstName(value: String): Self = StObject.set(x, "firstName", value.asInstanceOf[js.Any])
    
    inline def setFirstNameNull: Self = StObject.set(x, "firstName", null)
    
    inline def setFirstNameUndefined: Self = StObject.set(x, "firstName", js.undefined)
    
    inline def setHoldTime(value: String): Self = StObject.set(x, "holdTime", value.asInstanceOf[js.Any])
    
    inline def setHoldTimeNull: Self = StObject.set(x, "holdTime", null)
    
    inline def setHoldTimeUndefined: Self = StObject.set(x, "holdTime", js.undefined)
    
    inline def setLastName(value: String): Self = StObject.set(x, "lastName", value.asInstanceOf[js.Any])
    
    inline def setLastNameNull: Self = StObject.set(x, "lastName", null)
    
    inline def setLastNameUndefined: Self = StObject.set(x, "lastName", js.undefined)
  }
}
