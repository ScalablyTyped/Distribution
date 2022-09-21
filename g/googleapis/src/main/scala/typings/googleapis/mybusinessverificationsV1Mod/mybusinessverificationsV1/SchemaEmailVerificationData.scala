package typings.googleapis.mybusinessverificationsV1Mod.mybusinessverificationsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaEmailVerificationData extends StObject {
  
  /**
    * Domain name in the email address. e.g. "gmail.com" in foo@gmail.com
    */
  var domain: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Whether client is allowed to provide a different user name.
    */
  var isUserNameEditable: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * User name in the email address. e.g. "foo" in foo@gmail.com
    */
  var user: js.UndefOr[String | Null] = js.undefined
}
object SchemaEmailVerificationData {
  
  inline def apply(): SchemaEmailVerificationData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaEmailVerificationData]
  }
  
  extension [Self <: SchemaEmailVerificationData](x: Self) {
    
    inline def setDomain(value: String): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
    
    inline def setDomainNull: Self = StObject.set(x, "domain", null)
    
    inline def setDomainUndefined: Self = StObject.set(x, "domain", js.undefined)
    
    inline def setIsUserNameEditable(value: Boolean): Self = StObject.set(x, "isUserNameEditable", value.asInstanceOf[js.Any])
    
    inline def setIsUserNameEditableNull: Self = StObject.set(x, "isUserNameEditable", null)
    
    inline def setIsUserNameEditableUndefined: Self = StObject.set(x, "isUserNameEditable", js.undefined)
    
    inline def setUser(value: String): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
    
    inline def setUserNull: Self = StObject.set(x, "user", null)
    
    inline def setUserUndefined: Self = StObject.set(x, "user", js.undefined)
  }
}
