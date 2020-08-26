package typings.materializeCss.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<materialize-css.M.Timepicker, 'showView'> */
@js.native
trait PickTimepickershowView extends js.Object {
  var showView: js.UndefOr[js.Any] = js.native
}

object PickTimepickershowView {
  @scala.inline
  def apply(): PickTimepickershowView = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PickTimepickershowView]
  }
  @scala.inline
  implicit class PickTimepickershowViewOps[Self <: PickTimepickershowView] (val x: Self) extends AnyVal {
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
    def setShowView(value: js.Any): Self = this.set("showView", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowView: Self = this.set("showView", js.undefined)
  }
  
}

