package typings.hapi.mod

import typings.hapi.hapiBooleans.`true`
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Auth extends StObject {
  
  val data: js.UndefOr[AuthenticationData] = js.undefined
  
  val error: js.UndefOr[Error | Null] = js.undefined
  
  val isAuth: `true`
}
object Auth {
  
  @scala.inline
  def apply(): Auth = {
    val __obj = js.Dynamic.literal(isAuth = true)
    __obj.asInstanceOf[Auth]
  }
  
  @scala.inline
  implicit class AuthMutableBuilder[Self <: Auth] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: AuthenticationData): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    @scala.inline
    def setError(value: Error): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorNull: Self = StObject.set(x, "error", null)
    
    @scala.inline
    def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    @scala.inline
    def setIsAuth(value: `true`): Self = StObject.set(x, "isAuth", value.asInstanceOf[js.Any])
  }
}
