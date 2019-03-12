package typings
package koaDashGenericDashSessionLib.koaDashGenericDashSessionMod.koaSessionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SessionIdStore extends js.Object {
  def get(): js.Any
  def reset(): scala.Unit
  def set(sid: java.lang.String, session: Session): scala.Unit
}

object SessionIdStore {
  @scala.inline
  def apply(get: () => js.Any, reset: () => scala.Unit, set: (java.lang.String, Session) => scala.Unit): SessionIdStore = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction0(get), reset = js.Any.fromFunction0(reset), set = js.Any.fromFunction2(set))
  
    __obj.asInstanceOf[SessionIdStore]
  }
}

