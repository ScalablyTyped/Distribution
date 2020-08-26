package typings.koaGenericSession.mod.koaAugmentingMod

import typings.koaGenericSession.mod.Session
import typings.std.Generator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Context extends js.Object {
  var session: Session | Null = js.native
  var sessionSave: Boolean | Null = js.native
  def regenerateSession(): Generator[_, _, _] = js.native
}

object Context {
  @scala.inline
  def apply(regenerateSession: () => Generator[_, _, _]): Context = {
    val __obj = js.Dynamic.literal(regenerateSession = js.Any.fromFunction0(regenerateSession))
    __obj.asInstanceOf[Context]
  }
  @scala.inline
  implicit class ContextOps[Self <: Context] (val x: Self) extends AnyVal {
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
    def setRegenerateSession(value: () => Generator[_, _, _]): Self = this.set("regenerateSession", js.Any.fromFunction0(value))
    @scala.inline
    def setSession(value: Session): Self = this.set("session", value.asInstanceOf[js.Any])
    @scala.inline
    def setSessionNull: Self = this.set("session", null)
    @scala.inline
    def setSessionSave(value: Boolean): Self = this.set("sessionSave", value.asInstanceOf[js.Any])
    @scala.inline
    def setSessionSaveNull: Self = this.set("sessionSave", null)
  }
  
}

