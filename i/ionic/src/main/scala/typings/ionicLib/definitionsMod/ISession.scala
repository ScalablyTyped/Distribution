package typings
package ionicLib.definitionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISession extends js.Object {
  def getUser(): ionicLib.Anon_Id
  def getUserToken(): java.lang.String
  def isLoggedIn(): scala.Boolean
  def login(email: java.lang.String, password: java.lang.String): js.Promise[scala.Unit]
  def logout(): js.Promise[scala.Unit]
  def ssoLogin(email: java.lang.String): js.Promise[scala.Unit]
  def tokenLogin(token: java.lang.String): js.Promise[scala.Unit]
}

object ISession {
  @scala.inline
  def apply(
    getUser: () => ionicLib.Anon_Id,
    getUserToken: () => java.lang.String,
    isLoggedIn: () => scala.Boolean,
    login: (java.lang.String, java.lang.String) => js.Promise[scala.Unit],
    logout: () => js.Promise[scala.Unit],
    ssoLogin: java.lang.String => js.Promise[scala.Unit],
    tokenLogin: java.lang.String => js.Promise[scala.Unit]
  ): ISession = {
    val __obj = js.Dynamic.literal(getUser = js.Any.fromFunction0(getUser), getUserToken = js.Any.fromFunction0(getUserToken), isLoggedIn = js.Any.fromFunction0(isLoggedIn), login = js.Any.fromFunction2(login), logout = js.Any.fromFunction0(logout), ssoLogin = js.Any.fromFunction1(ssoLogin), tokenLogin = js.Any.fromFunction1(tokenLogin))
  
    __obj.asInstanceOf[ISession]
  }
}

