package typings.koaGenericSession.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SessionStore extends js.Object {
  
  def apply(): SessionStore = js.native
  
  def destroy(sid: String): Unit = js.native
  
  def get(sid: String): js.Any = js.native
  
  def set(sid: String, session: Session, ttl: Double): Unit = js.native
}
