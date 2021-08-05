package typings.googleapis.identitytoolkitV3Mod.identitytoolkitV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Response of getting account information.
  */
trait SchemaGetAccountInfoResponse extends StObject {
  
  /**
    * The fixed string &quot;identitytoolkit#GetAccountInfoResponse&quot;.
    */
  var kind: js.UndefOr[String] = js.undefined
  
  /**
    * The info of the users.
    */
  var users: js.UndefOr[js.Array[SchemaUserInfo]] = js.undefined
}
object SchemaGetAccountInfoResponse {
  
  inline def apply(): SchemaGetAccountInfoResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGetAccountInfoResponse]
  }
  
  extension [Self <: SchemaGetAccountInfoResponse](x: Self) {
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setUsers(value: js.Array[SchemaUserInfo]): Self = StObject.set(x, "users", value.asInstanceOf[js.Any])
    
    inline def setUsersUndefined: Self = StObject.set(x, "users", js.undefined)
    
    inline def setUsersVarargs(value: SchemaUserInfo*): Self = StObject.set(x, "users", js.Array(value :_*))
  }
}
