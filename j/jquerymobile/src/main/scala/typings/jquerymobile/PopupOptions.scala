package typings.jquerymobile

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PopupOptions extends js.Object {
  var corners: js.UndefOr[Boolean] = js.native
  var history: js.UndefOr[Boolean] = js.native
  var initSelector: js.UndefOr[String] = js.native
  var overlayTheme: js.UndefOr[String] = js.native
  var positionTo: js.UndefOr[String] = js.native
  var shadow: js.UndefOr[Boolean] = js.native
  var theme: js.UndefOr[String] = js.native
  var tolerance: js.UndefOr[String] = js.native
  var transition: js.UndefOr[String] = js.native
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
    def setCorners(value: Boolean): Self = this.set("corners", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCorners: Self = this.set("corners", js.undefined)
    @scala.inline
    def setHistory(value: Boolean): Self = this.set("history", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHistory: Self = this.set("history", js.undefined)
    @scala.inline
    def setInitSelector(value: String): Self = this.set("initSelector", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInitSelector: Self = this.set("initSelector", js.undefined)
    @scala.inline
    def setOverlayTheme(value: String): Self = this.set("overlayTheme", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOverlayTheme: Self = this.set("overlayTheme", js.undefined)
    @scala.inline
    def setPositionTo(value: String): Self = this.set("positionTo", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePositionTo: Self = this.set("positionTo", js.undefined)
    @scala.inline
    def setShadow(value: Boolean): Self = this.set("shadow", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShadow: Self = this.set("shadow", js.undefined)
    @scala.inline
    def setTheme(value: String): Self = this.set("theme", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTheme: Self = this.set("theme", js.undefined)
    @scala.inline
    def setTolerance(value: String): Self = this.set("tolerance", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTolerance: Self = this.set("tolerance", js.undefined)
    @scala.inline
    def setTransition(value: String): Self = this.set("transition", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTransition: Self = this.set("transition", js.undefined)
  }
  
}

