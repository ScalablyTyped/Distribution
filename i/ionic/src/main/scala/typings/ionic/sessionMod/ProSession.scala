package typings.ionic.sessionMod

import typings.ionic.anon.IdNumber
import typings.ionic.definitionsMod.ISession
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ionic/lib/session", "ProSession")
@js.native
class ProSession ()
  extends BaseSession
     with ISession {
  
  /* InferMemberOverrides */
  override def getUser(): IdNumber = js.native
  
  /* InferMemberOverrides */
  override def getUserToken(): String = js.native
  
  /* InferMemberOverrides */
  override def isLoggedIn(): Boolean = js.native
  
  /* InferMemberOverrides */
  override def logout(): js.Promise[Unit] = js.native
}
