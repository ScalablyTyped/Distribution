package typings.kefir.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Observer[T, S] extends js.Object {
  var end: js.UndefOr[js.Function0[Unit]] = js.native
  var error: js.UndefOr[js.Function1[/* error */ S, Unit]] = js.native
  var value: js.UndefOr[js.Function1[/* value */ T, Unit]] = js.native
}

object Observer {
  @scala.inline
  def apply[T, S](): Observer[T, S] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Observer[T, S]]
  }
  @scala.inline
  implicit class ObserverOps[Self <: Observer[_, _], T, S] (val x: Self with (Observer[T, S])) extends AnyVal {
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
    def setEnd(value: () => Unit): Self = this.set("end", js.Any.fromFunction0(value))
    @scala.inline
    def deleteEnd: Self = this.set("end", js.undefined)
    @scala.inline
    def setError(value: /* error */ S => Unit): Self = this.set("error", js.Any.fromFunction1(value))
    @scala.inline
    def deleteError: Self = this.set("error", js.undefined)
    @scala.inline
    def setValue(value: /* value */ T => Unit): Self = this.set("value", js.Any.fromFunction1(value))
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
  
}

