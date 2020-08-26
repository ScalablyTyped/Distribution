package typings.jsData.componentMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ComponentOpts extends js.Object {
  var debug: js.UndefOr[Boolean] = js.native
}

object ComponentOpts {
  @scala.inline
  def apply(): ComponentOpts = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ComponentOpts]
  }
  @scala.inline
  implicit class ComponentOptsOps[Self <: ComponentOpts] (val x: Self) extends AnyVal {
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
    def setDebug(value: Boolean): Self = this.set("debug", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDebug: Self = this.set("debug", js.undefined)
  }
  
}

