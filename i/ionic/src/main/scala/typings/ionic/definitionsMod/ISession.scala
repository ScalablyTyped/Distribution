package typings.ionic.definitionsMod

import typings.ionic.Anon_IdNumber
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISession extends js.Object {
  def getUser(): Anon_IdNumber
  def getUserToken(): String
  def isLoggedIn(): Boolean
  def login(email: String, password: String): js.Promise[Unit]
  def logout(): js.Promise[Unit]
  def ssoLogin(email: String): js.Promise[Unit]
  def tokenLogin(token: String): js.Promise[Unit]
}

object ISession {
  @scala.inline
  def apply(
    getUser: () => Anon_IdNumber,
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
}

