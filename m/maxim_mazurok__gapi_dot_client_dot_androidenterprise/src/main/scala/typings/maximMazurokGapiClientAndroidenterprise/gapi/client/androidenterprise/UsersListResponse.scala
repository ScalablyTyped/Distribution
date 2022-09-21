package typings.maximMazurokGapiClientAndroidenterprise.gapi.client.androidenterprise

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UsersListResponse extends StObject {
  
  /** A user of an enterprise. */
  var user: js.UndefOr[js.Array[User]] = js.undefined
}
object UsersListResponse {
  
  inline def apply(): UsersListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UsersListResponse]
  }
  
  extension [Self <: UsersListResponse](x: Self) {
    
    inline def setUser(value: js.Array[User]): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
    
    inline def setUserUndefined: Self = StObject.set(x, "user", js.undefined)
    
    inline def setUserVarargs(value: User*): Self = StObject.set(x, "user", js.Array(value*))
  }
}
