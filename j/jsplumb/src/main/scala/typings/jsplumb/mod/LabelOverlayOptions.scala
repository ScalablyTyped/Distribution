package typings.jsplumb.mod

import typings.jsplumb.anon.BorderStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LabelOverlayOptions extends OverlayOptions {
  var cssClass: js.UndefOr[String] = js.native
  var label: String = js.native
   // 0.5
  var labelStyle: js.UndefOr[BorderStyle] = js.native
  var location: js.UndefOr[Double] = js.native
}

object LabelOverlayOptions {
  @scala.inline
  def apply(label: String): LabelOverlayOptions = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[LabelOverlayOptions]
  }
  @scala.inline
  implicit class LabelOverlayOptionsOps[Self <: LabelOverlayOptions] (val x: Self) extends AnyVal {
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
    def setLabel(value: String): Self = this.set("label", value.asInstanceOf[js.Any])
    @scala.inline
    def setCssClass(value: String): Self = this.set("cssClass", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCssClass: Self = this.set("cssClass", js.undefined)
    @scala.inline
    def setLabelStyle(value: BorderStyle): Self = this.set("labelStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabelStyle: Self = this.set("labelStyle", js.undefined)
    @scala.inline
    def setLocation(value: Double): Self = this.set("location", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocation: Self = this.set("location", js.undefined)
  }
  
}

