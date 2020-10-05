package typings.leaflet.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DivOverlayOptions extends js.Object {
  var className: js.UndefOr[String] = js.native
  var offset: js.UndefOr[PointExpression] = js.native
  var pane: js.UndefOr[String] = js.native
  var zoomAnimation: js.UndefOr[Boolean] = js.native
}

object DivOverlayOptions {
  @scala.inline
  def apply(): DivOverlayOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DivOverlayOptions]
  }
  @scala.inline
  implicit class DivOverlayOptionsOps[Self <: DivOverlayOptions] (val x: Self) extends AnyVal {
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
    def setOffset(value: PointExpression): Self = this.set("offset", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOffset: Self = this.set("offset", js.undefined)
    @scala.inline
    def setPane(value: String): Self = this.set("pane", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePane: Self = this.set("pane", js.undefined)
    @scala.inline
    def setZoomAnimation(value: Boolean): Self = this.set("zoomAnimation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteZoomAnimation: Self = this.set("zoomAnimation", js.undefined)
  }
  
}

