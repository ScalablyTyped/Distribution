package typings.instagramPrivateApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait User extends StObject {
  
  var pk: String
  
  var user: Pk
}
object User {
  
  @scala.inline
  def apply(pk: String, user: Pk): User = {
    val __obj = js.Dynamic.literal(pk = pk.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[User]
  }
  
  @scala.inline
  implicit class UserMutableBuilder[Self <: User] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPk(value: String): Self = StObject.set(x, "pk", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUser(value: Pk): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
  }
}
