package typings.materializeCss.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<materialize-css.M.Collapsible, 'destroy'> */
@js.native
trait PickCollapsibledestroy extends js.Object {
  var destroy: js.UndefOr[js.Any] = js.native
}

object PickCollapsibledestroy {
  @scala.inline
  def apply(): PickCollapsibledestroy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PickCollapsibledestroy]
  }
  @scala.inline
  implicit class PickCollapsibledestroyOps[Self <: PickCollapsibledestroy] (val x: Self) extends AnyVal {
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
  }
  
}

