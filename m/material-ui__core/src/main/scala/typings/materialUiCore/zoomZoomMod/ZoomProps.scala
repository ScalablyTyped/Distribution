package typings.materialUiCore.zoomZoomMod

import typings.materialUiCore.createMuiThemeMod.Theme
import typings.materialUiCore.transitionMod.TransitionProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ZoomProps extends TransitionProps {
  var theme: js.UndefOr[Theme] = js.native
}

object ZoomProps {
  @scala.inline
  def apply(): ZoomProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ZoomProps]
  }
  @scala.inline
  implicit class ZoomPropsOps[Self <: ZoomProps] (val x: Self) extends AnyVal {
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
    def setTheme(value: Theme): Self = this.set("theme", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTheme: Self = this.set("theme", js.undefined)
  }
  
}

