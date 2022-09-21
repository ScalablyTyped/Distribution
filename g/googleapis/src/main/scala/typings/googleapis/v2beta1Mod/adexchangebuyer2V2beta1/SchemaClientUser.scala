package typings.googleapis.v2beta1Mod.adexchangebuyer2V2beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaClientUser extends StObject {
  
  /**
    * Numerical account ID of the client buyer with which the user is associated; the buyer must be a client of the current sponsor buyer. The value of this field is ignored in an update operation.
    */
  var clientAccountId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * User's email address. The value of this field is ignored in an update operation.
    */
  var email: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The status of the client user.
    */
  var status: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The unique numerical ID of the client user that has accepted an invitation. The value of this field is ignored in an update operation.
    */
  var userId: js.UndefOr[String | Null] = js.undefined
}
object SchemaClientUser {
  
  inline def apply(): SchemaClientUser = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaClientUser]
  }
  
  extension [Self <: SchemaClientUser](x: Self) {
    
    inline def setClientAccountId(value: String): Self = StObject.set(x, "clientAccountId", value.asInstanceOf[js.Any])
    
    inline def setClientAccountIdNull: Self = StObject.set(x, "clientAccountId", null)
    
    inline def setClientAccountIdUndefined: Self = StObject.set(x, "clientAccountId", js.undefined)
    
    inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    inline def setEmailNull: Self = StObject.set(x, "email", null)
    
    inline def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
    
    inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusNull: Self = StObject.set(x, "status", null)
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setUserId(value: String): Self = StObject.set(x, "userId", value.asInstanceOf[js.Any])
    
    inline def setUserIdNull: Self = StObject.set(x, "userId", null)
    
    inline def setUserIdUndefined: Self = StObject.set(x, "userId", js.undefined)
  }
}
