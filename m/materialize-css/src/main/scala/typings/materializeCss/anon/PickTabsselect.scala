package typings.materializeCss.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<materialize-css.M.Tabs, 'select'> */
@js.native
trait PickTabsselect extends js.Object {
  var select: js.UndefOr[js.Any] = js.native
}

object PickTabsselect {
  @scala.inline
  def apply(): PickTabsselect = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PickTabsselect]
  }
  @scala.inline
  implicit class PickTabsselectOps[Self <: PickTabsselect] (val x: Self) extends AnyVal {
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
    def setSelect(value: js.Any): Self = this.set("select", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelect: Self = this.set("select", js.undefined)
  }
  
}

