package typings.ionic.sessionMod

import typings.ionic.anon.IdNumber
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ionic/lib/session", "BaseSession")
@js.native
class BaseSession protected () extends js.Object {
  def this(e: SessionDeps) = this()
  
  val e: SessionDeps = js.native
  
  def getUser(): IdNumber = js.native
  
  def getUserToken(): String = js.native
  
  def isLoggedIn(): Boolean = js.native
  
  def logout(): js.Promise[Unit] = js.native
}
