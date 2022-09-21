package typings.googleapis.identitytoolkitV3Mod.identitytoolkitV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaIdentitytoolkitRelyingpartySignOutUserResponse extends StObject {
  
  /**
    * The local ID of the user.
    */
  var localId: js.UndefOr[String | Null] = js.undefined
}
object SchemaIdentitytoolkitRelyingpartySignOutUserResponse {
  
  inline def apply(): SchemaIdentitytoolkitRelyingpartySignOutUserResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaIdentitytoolkitRelyingpartySignOutUserResponse]
  }
  
  extension [Self <: SchemaIdentitytoolkitRelyingpartySignOutUserResponse](x: Self) {
    
    inline def setLocalId(value: String): Self = StObject.set(x, "localId", value.asInstanceOf[js.Any])
    
    inline def setLocalIdNull: Self = StObject.set(x, "localId", null)
    
    inline def setLocalIdUndefined: Self = StObject.set(x, "localId", js.undefined)
  }
}
