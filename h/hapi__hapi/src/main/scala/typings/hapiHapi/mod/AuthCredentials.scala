package typings.hapiHapi.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AuthCredentials
  extends StObject
     with /* key */ StringDictionary[js.Any] {
  
  /**
    * If set, will only work with routes that set `access.entity` to `app`.
    */
  var app: js.UndefOr[AppCredentials] = js.undefined
  
  /**
    * The application scopes to be granted.
    * [See docs](https://github.com/hapijs/hapi/blob/master/API.md#-routeoptionsauthaccessscope)
    */
  var scope: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * If set, will only work with routes that set `access.entity` to `user`.
    */
  var user: js.UndefOr[UserCredentials] = js.undefined
}
object AuthCredentials {
  
  @scala.inline
  def apply(): AuthCredentials = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AuthCredentials]
  }
  
  @scala.inline
  implicit class AuthCredentialsMutableBuilder[Self <: AuthCredentials] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApp(value: AppCredentials): Self = StObject.set(x, "app", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppUndefined: Self = StObject.set(x, "app", js.undefined)
    
    @scala.inline
    def setScope(value: js.Array[String]): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
    
    @scala.inline
    def setScopeVarargs(value: String*): Self = StObject.set(x, "scope", js.Array(value :_*))
    
    @scala.inline
    def setUser(value: UserCredentials): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserUndefined: Self = StObject.set(x, "user", js.undefined)
  }
}
