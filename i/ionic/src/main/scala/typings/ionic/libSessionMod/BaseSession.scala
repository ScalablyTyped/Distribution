package typings.ionic.libSessionMod

import typings.ionic.Anon_IdNumber
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ionic/lib/session", "BaseSession")
@js.native
class BaseSession protected () extends js.Object {
  def this(e: SessionDeps) = this()
  val e: SessionDeps = js.native
  def getUser(): Anon_IdNumber = js.native
  def getUserToken(): String = js.native
  def isLoggedIn(): Boolean = js.native
  def logout(): js.Promise[Unit] = js.native
}

