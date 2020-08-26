package typings.materialUiCore.portalPortalMod

import typings.react.mod.ReactElement
import typings.react.mod.ReactInstance
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PortalProps extends js.Object {
  var children: ReactElement = js.native
  var container: js.UndefOr[ReactInstance | js.Function0[ReactInstance] | Null] = js.native
  var disablePortal: js.UndefOr[Boolean] = js.native
  var onRendered: js.UndefOr[js.Function0[Unit]] = js.native
}

object PortalProps {
  @scala.inline
  def apply(children: ReactElement): PortalProps = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.asInstanceOf[PortalProps]
  }
  @scala.inline
  implicit class PortalPropsOps[Self <: PortalProps] (val x: Self) extends AnyVal {
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
    def setChildren(value: ReactElement): Self = this.set("children", value.asInstanceOf[js.Any])
    @scala.inline
    def setContainerFunction0(value: () => ReactInstance): Self = this.set("container", js.Any.fromFunction0(value))
    @scala.inline
    def setContainer(value: ReactInstance | js.Function0[ReactInstance]): Self = this.set("container", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContainer: Self = this.set("container", js.undefined)
    @scala.inline
    def setContainerNull: Self = this.set("container", null)
    @scala.inline
    def setDisablePortal(value: Boolean): Self = this.set("disablePortal", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisablePortal: Self = this.set("disablePortal", js.undefined)
    @scala.inline
    def setOnRendered(value: () => Unit): Self = this.set("onRendered", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnRendered: Self = this.set("onRendered", js.undefined)
  }
  
}

