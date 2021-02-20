package typings.maximMazurokGapiClientAndroidenterprise.gapi.client.androidenterprise

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GroupLicenseUsersListResponse extends StObject {
  
  /** A user of an enterprise. */
  var user: js.UndefOr[js.Array[User]] = js.native
}
object GroupLicenseUsersListResponse {
  
  @scala.inline
  def apply(): GroupLicenseUsersListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GroupLicenseUsersListResponse]
  }
  
  @scala.inline
  implicit class GroupLicenseUsersListResponseMutableBuilder[Self <: GroupLicenseUsersListResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setUser(value: js.Array[User]): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserUndefined: Self = StObject.set(x, "user", js.undefined)
    
    @scala.inline
    def setUserVarargs(value: User*): Self = StObject.set(x, "user", js.Array(value :_*))
  }
}
