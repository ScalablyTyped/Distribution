package typings.leaflet.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PopupOptions extends DivOverlayOptions {
  var autoClose: js.UndefOr[Boolean] = js.native
  var autoPan: js.UndefOr[Boolean] = js.native
  var autoPanPadding: js.UndefOr[PointExpression] = js.native
  var autoPanPaddingBottomRight: js.UndefOr[PointExpression] = js.native
  var autoPanPaddingTopLeft: js.UndefOr[PointExpression] = js.native
  var closeButton: js.UndefOr[Boolean] = js.native
  var closeOnClick: js.UndefOr[Boolean] = js.native
  var closeOnEscapeKey: js.UndefOr[Boolean] = js.native
  var keepInView: js.UndefOr[Boolean] = js.native
  var maxHeight: js.UndefOr[Double] = js.native
  var maxWidth: js.UndefOr[Double] = js.native
  var minWidth: js.UndefOr[Double] = js.native
}

object PopupOptions {
  @scala.inline
  def apply(): PopupOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PopupOptions]
  }
  @scala.inline
  implicit class PopupOptionsOps[Self <: PopupOptions] (val x: Self) extends AnyVal {
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
    def setAutoClose(value: Boolean): Self = this.set("autoClose", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoClose: Self = this.set("autoClose", js.undefined)
    @scala.inline
    def setAutoPan(value: Boolean): Self = this.set("autoPan", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoPan: Self = this.set("autoPan", js.undefined)
    @scala.inline
    def setAutoPanPadding(value: PointExpression): Self = this.set("autoPanPadding", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoPanPadding: Self = this.set("autoPanPadding", js.undefined)
    @scala.inline
    def setAutoPanPaddingBottomRight(value: PointExpression): Self = this.set("autoPanPaddingBottomRight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoPanPaddingBottomRight: Self = this.set("autoPanPaddingBottomRight", js.undefined)
    @scala.inline
    def setAutoPanPaddingTopLeft(value: PointExpression): Self = this.set("autoPanPaddingTopLeft", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoPanPaddingTopLeft: Self = this.set("autoPanPaddingTopLeft", js.undefined)
    @scala.inline
    def setCloseButton(value: Boolean): Self = this.set("closeButton", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCloseButton: Self = this.set("closeButton", js.undefined)
    @scala.inline
    def setCloseOnClick(value: Boolean): Self = this.set("closeOnClick", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCloseOnClick: Self = this.set("closeOnClick", js.undefined)
    @scala.inline
    def setCloseOnEscapeKey(value: Boolean): Self = this.set("closeOnEscapeKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCloseOnEscapeKey: Self = this.set("closeOnEscapeKey", js.undefined)
    @scala.inline
    def setKeepInView(value: Boolean): Self = this.set("keepInView", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeepInView: Self = this.set("keepInView", js.undefined)
    @scala.inline
    def setMaxHeight(value: Double): Self = this.set("maxHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxHeight: Self = this.set("maxHeight", js.undefined)
    @scala.inline
    def setMaxWidth(value: Double): Self = this.set("maxWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxWidth: Self = this.set("maxWidth", js.undefined)
    @scala.inline
    def setMinWidth(value: Double): Self = this.set("minWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinWidth: Self = this.set("minWidth", js.undefined)
  }
  
}

