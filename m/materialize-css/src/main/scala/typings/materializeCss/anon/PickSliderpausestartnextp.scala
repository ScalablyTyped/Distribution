package typings.materializeCss.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<materialize-css.M.Slider, 'pause' | 'start' | 'next' | 'prev' | 'destroy'> */
@js.native
trait PickSliderpausestartnextp extends js.Object {
  var destroy: js.UndefOr[js.Any] = js.native
  var next: js.UndefOr[js.Any] = js.native
  var pause: js.UndefOr[js.Any] = js.native
  var prev: js.UndefOr[js.Any] = js.native
  var start: js.UndefOr[js.Any] = js.native
}

object PickSliderpausestartnextp {
  @scala.inline
  def apply(): PickSliderpausestartnextp = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PickSliderpausestartnextp]
  }
  @scala.inline
  implicit class PickSliderpausestartnextpOps[Self <: PickSliderpausestartnextp] (val x: Self) extends AnyVal {
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
    def setDestroy(value: js.Any): Self = this.set("destroy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDestroy: Self = this.set("destroy", js.undefined)
    @scala.inline
    def setNext(value: js.Any): Self = this.set("next", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNext: Self = this.set("next", js.undefined)
    @scala.inline
    def setPause(value: js.Any): Self = this.set("pause", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePause: Self = this.set("pause", js.undefined)
    @scala.inline
    def setPrev(value: js.Any): Self = this.set("prev", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrev: Self = this.set("prev", js.undefined)
    @scala.inline
    def setStart(value: js.Any): Self = this.set("start", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStart: Self = this.set("start", js.undefined)
  }
  
}

