package typings
package koaDashPassportLib.koaDashPassportMod.koaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Context extends js.Object {
  var logIn: js.Function2[/* user */ js.Any, /* options */ js.UndefOr[js.Any], stdLib.Promise[scala.Unit]] = js.native
  var logOut: js.Function0[scala.Unit] = js.native
  def isAuthenticated(): scala.Boolean = js.native
  def isUnauthenticated(): scala.Boolean = js.native
  def login(user: js.Any): stdLib.Promise[scala.Unit] = js.native
  def login(user: js.Any, options: js.Any): stdLib.Promise[scala.Unit] = js.native
  def logout(): scala.Unit = js.native
}

