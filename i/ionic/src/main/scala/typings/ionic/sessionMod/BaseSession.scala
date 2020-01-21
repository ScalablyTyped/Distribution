package typings.ionic.sessionMod

import typings.ionic.AnonIdNumber
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ionic/lib/session", "BaseSession")
@js.native
class BaseSession protected () extends js.Object {
  def this(e: SessionDeps) = this()
  val e: SessionDeps = js.native
  def getUser(): AnonIdNumber = js.native
  def getUserToken(): String = js.native
  def isLoggedIn(): Boolean = js.native
  def logout(): js.Promise[Unit] = js.native
}

