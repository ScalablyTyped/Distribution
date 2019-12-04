package typings.ionic.libSessionMod

import typings.ionic.Anon_IdNumber
import typings.ionic.definitionsMod.ISession
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ionic/lib/session", "ProSession")
@js.native
class ProSession ()
  extends BaseSession
     with ISession {
  /* InferMemberOverrides */
  override def getUser(): Anon_IdNumber = js.native
  /* InferMemberOverrides */
  override def getUserToken(): String = js.native
  /* InferMemberOverrides */
  override def isLoggedIn(): Boolean = js.native
  /* CompleteClass */
  override def login(email: String, password: String): js.Promise[Unit] = js.native
  /* InferMemberOverrides */
  override def logout(): js.Promise[Unit] = js.native
  /* CompleteClass */
  override def ssoLogin(email: String): js.Promise[Unit] = js.native
  /* CompleteClass */
  override def tokenLogin(token: String): js.Promise[Unit] = js.native
}

