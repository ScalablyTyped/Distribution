package typings.materializeCss.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<materialize-css.M.Modal, 'open' | 'close' | 'destroy'> */
@js.native
trait PickModalopenclosedestroy extends js.Object {
  var close: js.UndefOr[js.Any] = js.native
  var destroy: js.UndefOr[js.Any] = js.native
  var open: js.UndefOr[js.Any] = js.native
}

object PickModalopenclosedestroy {
  @scala.inline
  def apply(): PickModalopenclosedestroy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PickModalopenclosedestroy]
  }
  @scala.inline
  implicit class PickModalopenclosedestroyOps[Self <: PickModalopenclosedestroy] (val x: Self) extends AnyVal {
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
    def setClose(value: js.Any): Self = this.set("close", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClose: Self = this.set("close", js.undefined)
    @scala.inline
    def setDestroy(value: js.Any): Self = this.set("destroy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDestroy: Self = this.set("destroy", js.undefined)
    @scala.inline
    def setOpen(value: js.Any): Self = this.set("open", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOpen: Self = this.set("open", js.undefined)
  }
  
}

