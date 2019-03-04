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
    getUser: js.Function0[ionicLib.Anon_Id],
    getUserToken: js.Function0[java.lang.String],
    isLoggedIn: js.Function0[scala.Boolean],
    login: js.Function2[java.lang.String, java.lang.String, js.Promise[scala.Unit]],
    logout: js.Function0[js.Promise[scala.Unit]],
    ssoLogin: js.Function1[java.lang.String, js.Promise[scala.Unit]],
    tokenLogin: js.Function1[java.lang.String, js.Promise[scala.Unit]]
  ): ISession = {
    val __obj = js.Dynamic.literal(getUser = getUser, getUserToken = getUserToken, isLoggedIn = isLoggedIn, login = login, logout = logout, ssoLogin = ssoLogin, tokenLogin = tokenLogin)
  
    __obj.asInstanceOf[ISession]
  }
}

