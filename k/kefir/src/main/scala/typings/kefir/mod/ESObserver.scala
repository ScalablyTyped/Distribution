package typings.kefir.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ESObserver[T, S] extends js.Object {
  var complete: js.UndefOr[js.Function0[_]] = js.native
  var error: js.UndefOr[js.Function1[/* error */ S, _]] = js.native
  var next: js.UndefOr[js.Function1[/* value */ T, _]] = js.native
  var start: js.UndefOr[js.Function] = js.native
}

object ESObserver {
  @scala.inline
  def apply[T, S](): ESObserver[T, S] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ESObserver[T, S]]
  }
  @scala.inline
  implicit class ESObserverOps[Self <: ESObserver[_, _], T, S] (val x: Self with (ESObserver[T, S])) extends AnyVal {
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
    def setComplete(value: () => _): Self = this.set("complete", js.Any.fromFunction0(value))
    @scala.inline
    def deleteComplete: Self = this.set("complete", js.undefined)
    @scala.inline
    def setError(value: /* error */ S => _): Self = this.set("error", js.Any.fromFunction1(value))
    @scala.inline
    def deleteError: Self = this.set("error", js.undefined)
    @scala.inline
    def setNext(value: /* value */ T => _): Self = this.set("next", js.Any.fromFunction1(value))
    @scala.inline
    def deleteNext: Self = this.set("next", js.undefined)
    @scala.inline
    def setStart(value: js.Function): Self = this.set("start", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStart: Self = this.set("start", js.undefined)
  }
  
}

