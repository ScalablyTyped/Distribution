package typings.koaGenericSession.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SessionIdStore extends js.Object {
  def get(): js.Any = js.native
  def reset(): Unit = js.native
  def set(sid: String, session: Session): Unit = js.native
}

object SessionIdStore {
  @scala.inline
  def apply(get: () => js.Any, reset: () => Unit, set: (String, Session) => Unit): SessionIdStore = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction0(get), reset = js.Any.fromFunction0(reset), set = js.Any.fromFunction2(set))
    __obj.asInstanceOf[SessionIdStore]
  }
  @scala.inline
  implicit class SessionIdStoreOps[Self <: SessionIdStore] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setGet(value: () => js.Any): Self = this.set("get", js.Any.fromFunction0(value))
    @scala.inline
    def setReset(value: () => Unit): Self = this.set("reset", js.Any.fromFunction0(value))
    @scala.inline
    def setSet(value: (String, Session) => Unit): Self = this.set("set", js.Any.fromFunction2(value))
  }
  
}

