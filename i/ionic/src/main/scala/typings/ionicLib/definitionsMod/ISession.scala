package typings
package ionicLib.definitionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ISession extends js.Object {
  def getUser(): ionicLib.Anon_Id
  def getUserToken(): java.lang.String
  def isLoggedIn(): scala.Boolean
  def login(email: java.lang.String, password: java.lang.String): stdLib.Promise[scala.Unit]
  def logout(): stdLib.Promise[scala.Unit]
  def tokenLogin(token: java.lang.String): stdLib.Promise[scala.Unit]
}

