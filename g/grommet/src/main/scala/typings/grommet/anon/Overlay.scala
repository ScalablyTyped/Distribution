package typings.grommet.anon

import typings.grommet.baseMod.ExtendType
import typings.grommet.utilsMod.BackgroundType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Overlay extends js.Object {
  var background: js.UndefOr[BackgroundType] = js.native
  var border: js.UndefOr[`8`] = js.native
  var container: js.UndefOr[ZIndex] = js.native
  var extend: js.UndefOr[ExtendType] = js.native
  var overlay: js.UndefOr[`3`] = js.native
  var responsiveBreakpoint: js.UndefOr[String] = js.native
  var zIndex: js.UndefOr[String] = js.native
}

object Overlay {
  @scala.inline
  def apply(): Overlay = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Overlay]
  }
  @scala.inline
  implicit class OverlayOps[Self <: Overlay] (val x: Self) extends AnyVal {
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
    def setBackground(value: BackgroundType): Self = this.set("background", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBackground: Self = this.set("background", js.undefined)
    @scala.inline
    def setBorder(value: `8`): Self = this.set("border", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBorder: Self = this.set("border", js.undefined)
    @scala.inline
    def setContainer(value: ZIndex): Self = this.set("container", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContainer: Self = this.set("container", js.undefined)
    @scala.inline
    def setExtendFunction1(value: /* args */ js.Any => Unit): Self = this.set("extend", js.Any.fromFunction1(value))
    @scala.inline
    def setExtend(value: ExtendType): Self = this.set("extend", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExtend: Self = this.set("extend", js.undefined)
    @scala.inline
    def setOverlay(value: `3`): Self = this.set("overlay", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOverlay: Self = this.set("overlay", js.undefined)
    @scala.inline
    def setResponsiveBreakpoint(value: String): Self = this.set("responsiveBreakpoint", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResponsiveBreakpoint: Self = this.set("responsiveBreakpoint", js.undefined)
    @scala.inline
    def setZIndex(value: String): Self = this.set("zIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteZIndex: Self = this.set("zIndex", js.undefined)
  }
  
}

