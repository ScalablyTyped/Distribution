package typings.googleapis.identitytoolkitV3Mod.identitytoolkitV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Response of getting account information.
  */
@js.native
trait SchemaGetAccountInfoResponse extends StObject {
  
  /**
    * The fixed string &quot;identitytoolkit#GetAccountInfoResponse&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  
  /**
    * The info of the users.
    */
  var users: js.UndefOr[js.Array[SchemaUserInfo]] = js.native
}
object SchemaGetAccountInfoResponse {
  
  @scala.inline
  def apply(): SchemaGetAccountInfoResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGetAccountInfoResponse]
  }
  
  @scala.inline
  implicit class SchemaGetAccountInfoResponseMutableBuilder[Self <: SchemaGetAccountInfoResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setUsers(value: js.Array[SchemaUserInfo]): Self = StObject.set(x, "users", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsersUndefined: Self = StObject.set(x, "users", js.undefined)
    
    @scala.inline
    def setUsersVarargs(value: SchemaUserInfo*): Self = StObject.set(x, "users", js.Array(value :_*))
  }
}
