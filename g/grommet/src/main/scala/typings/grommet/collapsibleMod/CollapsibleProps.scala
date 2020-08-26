package typings.grommet.collapsibleMod

import typings.grommet.grommetStrings.horizontal
import typings.grommet.grommetStrings.vertical
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CollapsibleProps extends js.Object {
  var direction: js.UndefOr[horizontal | vertical] = js.native
  var open: js.UndefOr[Boolean] = js.native
}

object CollapsibleProps {
  @scala.inline
  def apply(): CollapsibleProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CollapsibleProps]
  }
  @scala.inline
  implicit class CollapsiblePropsOps[Self <: CollapsibleProps] (val x: Self) extends AnyVal {
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
    def setDirection(value: horizontal | vertical): Self = this.set("direction", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDirection: Self = this.set("direction", js.undefined)
    @scala.inline
    def setOpen(value: Boolean): Self = this.set("open", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOpen: Self = this.set("open", js.undefined)
  }
  
}

