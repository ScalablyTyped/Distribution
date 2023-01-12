package typings.ionic.definitionsMod

import typings.ionic.anon.IdNumber
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ISession extends StObject {
  
  def getUser(): IdNumber
  
  def getUserToken(): String
  
  def isLoggedIn(): Boolean
  
  def login(email: String, password: String): js.Promise[Unit]
  
  def logout(): js.Promise[Unit]
  
  def ssoLogin(email: String): js.Promise[Unit]
  
  def tokenLogin(token: String): js.Promise[Unit]
}
object ISession {
  
  inline def apply(
    getUser: () => IdNumber,
    getUserToken: () => String,
    isLoggedIn: () => Boolean,
    login: (String, String) => js.Promise[Unit],
    logout: () => js.Promise[Unit],
    ssoLogin: String => js.Promise[Unit],
    tokenLogin: String => js.Promise[Unit]
  ): ISession = {
    val __obj = js.Dynamic.literal(getUser = js.Any.fromFunction0(getUser), getUserToken = js.Any.fromFunction0(getUserToken), isLoggedIn = js.Any.fromFunction0(isLoggedIn), login = js.Any.fromFunction2(login), logout = js.Any.fromFunction0(logout), ssoLogin = js.Any.fromFunction1(ssoLogin), tokenLogin = js.Any.fromFunction1(tokenLogin))
    __obj.asInstanceOf[ISession]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ISession] (val x: Self) extends AnyVal {
    
    inline def setGetUser(value: () => IdNumber): Self = StObject.set(x, "getUser", js.Any.fromFunction0(value))
    
    inline def setGetUserToken(value: () => String): Self = StObject.set(x, "getUserToken", js.Any.fromFunction0(value))
    
    inline def setIsLoggedIn(value: () => Boolean): Self = StObject.set(x, "isLoggedIn", js.Any.fromFunction0(value))
    
    inline def setLogin(value: (String, String) => js.Promise[Unit]): Self = StObject.set(x, "login", js.Any.fromFunction2(value))
    
    inline def setLogout(value: () => js.Promise[Unit]): Self = StObject.set(x, "logout", js.Any.fromFunction0(value))
    
    inline def setSsoLogin(value: String => js.Promise[Unit]): Self = StObject.set(x, "ssoLogin", js.Any.fromFunction1(value))
    
    inline def setTokenLogin(value: String => js.Promise[Unit]): Self = StObject.set(x, "tokenLogin", js.Any.fromFunction1(value))
  }
}
