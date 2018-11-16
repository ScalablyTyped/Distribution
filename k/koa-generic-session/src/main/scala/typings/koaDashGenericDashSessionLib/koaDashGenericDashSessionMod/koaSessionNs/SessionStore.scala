package typings
package koaDashGenericDashSessionLib.koaDashGenericDashSessionMod.koaSessionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SessionStore extends js.Object {
  def apply(): SessionStore = js.native
  def destroy(sid: java.lang.String): scala.Unit = js.native
  def get(sid: java.lang.String): js.Any = js.native
  def set(sid: java.lang.String, session: Session, ttl: scala.Double): scala.Unit = js.native
}

