package typings.koaGenericSession.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SessionIdStore extends js.Object {
  def get(): js.Any
  def reset(): Unit
  def set(sid: String, session: Session): Unit
}

object SessionIdStore {
  @scala.inline
  def apply(get: () => js.Any, reset: () => Unit, set: (String, Session) => Unit): SessionIdStore = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction0(get), reset = js.Any.fromFunction0(reset), set = js.Any.fromFunction2(set))
    __obj.asInstanceOf[SessionIdStore]
  }
}

