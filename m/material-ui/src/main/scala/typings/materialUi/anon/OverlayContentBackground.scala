package typings.materialUi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OverlayContentBackground extends js.Object {
  var color: js.UndefOr[String] = js.native
  var overlayContentBackground: js.UndefOr[String] = js.native
  var subtitleColor: js.UndefOr[String] = js.native
  var titleColor: js.UndefOr[String] = js.native
}

object OverlayContentBackground {
  @scala.inline
  def apply(): OverlayContentBackground = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OverlayContentBackground]
  }
  @scala.inline
  implicit class OverlayContentBackgroundOps[Self <: OverlayContentBackground] (val x: Self) extends AnyVal {
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
    def setColor(value: String): Self = this.set("color", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    @scala.inline
    def setOverlayContentBackground(value: String): Self = this.set("overlayContentBackground", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOverlayContentBackground: Self = this.set("overlayContentBackground", js.undefined)
    @scala.inline
    def setSubtitleColor(value: String): Self = this.set("subtitleColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSubtitleColor: Self = this.set("subtitleColor", js.undefined)
    @scala.inline
    def setTitleColor(value: String): Self = this.set("titleColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitleColor: Self = this.set("titleColor", js.undefined)
  }
  
}

