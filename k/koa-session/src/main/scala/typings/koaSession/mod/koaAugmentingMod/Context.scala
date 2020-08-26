package typings.koaSession.mod.koaAugmentingMod

import typings.koaSession.mod.Session
import typings.koaSession.mod.opts
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Context extends js.Object {
  var session: Session | Null = js.native
  val sessionOptions: js.UndefOr[opts] = js.native
}

object Context {
  @scala.inline
  def apply(): Context = {
    val __obj = js.Dynamic.literal()
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
    def setSession(value: Session): Self = this.set("session", value.asInstanceOf[js.Any])
    @scala.inline
    def setSessionNull: Self = this.set("session", null)
    @scala.inline
    def setSessionOptions(value: opts): Self = this.set("sessionOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSessionOptions: Self = this.set("sessionOptions", js.undefined)
  }
  
}

