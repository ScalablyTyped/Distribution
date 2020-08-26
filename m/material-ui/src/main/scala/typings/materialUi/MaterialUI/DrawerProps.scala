package typings.materialUi.MaterialUI

import typings.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DrawerProps extends js.Object {
  var className: js.UndefOr[String] = js.native
  var containerClassName: js.UndefOr[String] = js.native
  var containerStyle: js.UndefOr[CSSProperties] = js.native
  var disableSwipeToOpen: js.UndefOr[Boolean] = js.native
  var docked: js.UndefOr[Boolean] = js.native
  var onRequestChange: js.UndefOr[js.Function2[/* opening */ Boolean, /* reason */ String, Unit]] = js.native
  var open: js.UndefOr[Boolean] = js.native
  var openSecondary: js.UndefOr[Boolean] = js.native
  var overlayClassName: js.UndefOr[String] = js.native
  var overlayStyle: js.UndefOr[CSSProperties] = js.native
  var style: js.UndefOr[CSSProperties] = js.native
  var swipeAreaWidth: js.UndefOr[Double] = js.native
  var width: js.UndefOr[Double | String] = js.native
  var zDepth: js.UndefOr[Double] = js.native
}

object DrawerProps {
  @scala.inline
  def apply(): DrawerProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DrawerProps]
  }
  @scala.inline
  implicit class DrawerPropsOps[Self <: DrawerProps] (val x: Self) extends AnyVal {
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
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    @scala.inline
    def setContainerClassName(value: String): Self = this.set("containerClassName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContainerClassName: Self = this.set("containerClassName", js.undefined)
    @scala.inline
    def setContainerStyle(value: CSSProperties): Self = this.set("containerStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContainerStyle: Self = this.set("containerStyle", js.undefined)
    @scala.inline
    def setDisableSwipeToOpen(value: Boolean): Self = this.set("disableSwipeToOpen", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisableSwipeToOpen: Self = this.set("disableSwipeToOpen", js.undefined)
    @scala.inline
    def setDocked(value: Boolean): Self = this.set("docked", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDocked: Self = this.set("docked", js.undefined)
    @scala.inline
    def setOnRequestChange(value: (/* opening */ Boolean, /* reason */ String) => Unit): Self = this.set("onRequestChange", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnRequestChange: Self = this.set("onRequestChange", js.undefined)
    @scala.inline
    def setOpen(value: Boolean): Self = this.set("open", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOpen: Self = this.set("open", js.undefined)
    @scala.inline
    def setOpenSecondary(value: Boolean): Self = this.set("openSecondary", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOpenSecondary: Self = this.set("openSecondary", js.undefined)
    @scala.inline
    def setOverlayClassName(value: String): Self = this.set("overlayClassName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOverlayClassName: Self = this.set("overlayClassName", js.undefined)
    @scala.inline
    def setOverlayStyle(value: CSSProperties): Self = this.set("overlayStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOverlayStyle: Self = this.set("overlayStyle", js.undefined)
    @scala.inline
    def setStyle(value: CSSProperties): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    @scala.inline
    def setSwipeAreaWidth(value: Double): Self = this.set("swipeAreaWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSwipeAreaWidth: Self = this.set("swipeAreaWidth", js.undefined)
    @scala.inline
    def setWidth(value: Double | String): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
    @scala.inline
    def setZDepth(value: Double): Self = this.set("zDepth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteZDepth: Self = this.set("zDepth", js.undefined)
  }
  
}

