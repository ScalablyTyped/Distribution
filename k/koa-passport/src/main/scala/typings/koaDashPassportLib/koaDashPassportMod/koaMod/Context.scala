package typings
package koaDashPassportLib.koaDashPassportMod.koaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Context extends js.Object {
  @JSName("logIn")
  var logIn_Original: js.Function2[/* user */ js.Any, /* options */ js.UndefOr[js.Any], js.Promise[scala.Unit]] = js.native
  @JSName("logOut")
  var logOut_Original: js.Function0[scala.Unit] = js.native
  def isAuthenticated(): scala.Boolean = js.native
  def isUnauthenticated(): scala.Boolean = js.native
  def logIn(user: js.Any): js.Promise[scala.Unit] = js.native
  def logIn(user: js.Any, options: js.Any): js.Promise[scala.Unit] = js.native
  def logOut(): scala.Unit = js.native
  def login(user: js.Any): js.Promise[scala.Unit] = js.native
  def login(user: js.Any, options: js.Any): js.Promise[scala.Unit] = js.native
  def logout(): scala.Unit = js.native
}

