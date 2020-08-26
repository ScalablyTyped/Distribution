package typings.materializeCss.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<materialize-css.M.Collapsible, 'close'> */
@js.native
trait PickCollapsibleclose extends js.Object {
  var close: js.UndefOr[js.Any] = js.native
}

object PickCollapsibleclose {
  @scala.inline
  def apply(): PickCollapsibleclose = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PickCollapsibleclose]
  }
  @scala.inline
  implicit class PickCollapsiblecloseOps[Self <: PickCollapsibleclose] (val x: Self) extends AnyVal {
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
  }
  
}

