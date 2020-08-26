package typings.grommet.dropButtonMod

import typings.grommet.anon.Bottom
import typings.grommet.dropMod.DropProps
import typings.react.mod.global.JSX.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DropButtonProps extends js.Object {
  var dropAlign: js.UndefOr[Bottom] = js.native
  var dropContent: Element = js.native
  var dropProps: js.UndefOr[DropProps] = js.native
  var dropTarget: js.UndefOr[js.Object] = js.native
  var onClose: js.UndefOr[js.Function1[/* repeated */ js.Any, Unit]] = js.native
  var onOpen: js.UndefOr[js.Function1[/* repeated */ js.Any, Unit]] = js.native
  var open: js.UndefOr[Boolean] = js.native
}

object DropButtonProps {
  @scala.inline
  def apply(dropContent: Element): DropButtonProps = {
    val __obj = js.Dynamic.literal(dropContent = dropContent.asInstanceOf[js.Any])
    __obj.asInstanceOf[DropButtonProps]
  }
  @scala.inline
  implicit class DropButtonPropsOps[Self <: DropButtonProps] (val x: Self) extends AnyVal {
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
    def setDropContent(value: Element): Self = this.set("dropContent", value.asInstanceOf[js.Any])
    @scala.inline
    def setDropAlign(value: Bottom): Self = this.set("dropAlign", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDropAlign: Self = this.set("dropAlign", js.undefined)
    @scala.inline
    def setDropProps(value: DropProps): Self = this.set("dropProps", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDropProps: Self = this.set("dropProps", js.undefined)
    @scala.inline
    def setDropTarget(value: js.Object): Self = this.set("dropTarget", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDropTarget: Self = this.set("dropTarget", js.undefined)
    @scala.inline
    def setOnClose(value: /* repeated */ js.Any => Unit): Self = this.set("onClose", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnClose: Self = this.set("onClose", js.undefined)
    @scala.inline
    def setOnOpen(value: /* repeated */ js.Any => Unit): Self = this.set("onOpen", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnOpen: Self = this.set("onOpen", js.undefined)
    @scala.inline
    def setOpen(value: Boolean): Self = this.set("open", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOpen: Self = this.set("open", js.undefined)
  }
  
}

