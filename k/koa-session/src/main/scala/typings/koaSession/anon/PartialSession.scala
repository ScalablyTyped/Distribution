package typings.koaSession.anon

import typings.koaSession.koaSessionStrings.session
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<koa-session.koa-session.Session> */
@js.native
trait PartialSession extends js.Object {
  var inspect: js.UndefOr[js.Function0[js.Object]] = js.native
  var length: js.UndefOr[Double] = js.native
  var maxAge: js.UndefOr[Double | session] = js.native
  var populated: js.UndefOr[Boolean] = js.native
  var save: js.UndefOr[js.Function0[Unit]] = js.native
  var toJSON: js.UndefOr[js.Function0[js.Object]] = js.native
}

object PartialSession {
  @scala.inline
  def apply(): PartialSession = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialSession]
  }
  @scala.inline
  implicit class PartialSessionOps[Self <: PartialSession] (val x: Self) extends AnyVal {
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
    def setInspect(value: () => js.Object): Self = this.set("inspect", js.Any.fromFunction0(value))
    @scala.inline
    def deleteInspect: Self = this.set("inspect", js.undefined)
    @scala.inline
    def setLength(value: Double): Self = this.set("length", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLength: Self = this.set("length", js.undefined)
    @scala.inline
    def setMaxAge(value: Double | session): Self = this.set("maxAge", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxAge: Self = this.set("maxAge", js.undefined)
    @scala.inline
    def setPopulated(value: Boolean): Self = this.set("populated", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePopulated: Self = this.set("populated", js.undefined)
    @scala.inline
    def setSave(value: () => Unit): Self = this.set("save", js.Any.fromFunction0(value))
    @scala.inline
    def deleteSave: Self = this.set("save", js.undefined)
    @scala.inline
    def setToJSON(value: () => js.Object): Self = this.set("toJSON", js.Any.fromFunction0(value))
    @scala.inline
    def deleteToJSON: Self = this.set("toJSON", js.undefined)
  }
  
}

